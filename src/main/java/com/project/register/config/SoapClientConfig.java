package com.project.register.config;

import com.project.register.service.InnServiceClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;

import java.io.UnsupportedEncodingException;
import java.net.URI;
import java.net.URL;
import java.net.URLEncoder;

@Configuration
public class SoapClientConfig {

    private final String uri;

    @Autowired
    public SoapClientConfig(@Value("${innService.uri}") String   uri) {
        this.uri=uri;
    }

    @Bean
    public Jaxb2Marshaller marshaller() {
        Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
        marshaller.setPackagesToScan("/target/generate-sources/xjs");
        return marshaller;
    }

    @Bean
    public InnServiceClient innClient(Jaxb2Marshaller marshaller) {
        InnServiceClient client = new InnServiceClient();
        try {
            client.setDefaultUri(URLEncoder.encode(uri, "UTF-8"));
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        System.out.println(client.getDefaultUri());
        client.setMarshaller(marshaller);
        client.setUnmarshaller(marshaller);
        return client;
    }
}
