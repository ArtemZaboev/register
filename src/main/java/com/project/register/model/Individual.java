package com.project.register.model;

import com.sun.xml.internal.ws.developer.UsesJAXBContext;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.xml.bind.annotation.XmlElement;
import java.io.Serializable;
import java.util.Objects;

@Entity
@Data
@NoArgsConstructor
public class Individual implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    private String surname;
    private String patronymic;
    private String dateOfBirth;
    private String inn;
    @XmlElement
    public long getId() {
        return id;
    }
    @XmlElement
    public void setId(long id) {
        this.id = id;
    }
    @XmlElement
    public String getName() {
        return name;
    }
    @XmlElement
    public void setName(String name) {
        this.name = name;
    }
    @XmlElement
    public String getSurname() {
        return surname;
    }
    @XmlElement
    public void setSurname(String surname) {
        this.surname = surname;
    }
    @XmlElement
    public String getPatronymic() {
        return patronymic;
    }
    @XmlElement
    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }
    @XmlElement
    public String getDateOfBirth() {
        return dateOfBirth;
    }
    @XmlElement
    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
    @XmlElement
    public String getInn() {
        return inn;
    }
    @XmlElement
    public void setInn(String inn) {
        this.inn = inn;
    }

    public Individual(String name, String surname, String patronymic, String dateOfBirth) {
        this.name=name;
        this.surname=surname;
        this.patronymic=patronymic;
        this.dateOfBirth=dateOfBirth;
    }
    public Individual(String name,String surname,String dataOfBirth) {
        this.name=name;
        this.surname=surname;
        this.dateOfBirth=dataOfBirth;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Individual)) return false;
        Individual that = (Individual) o;
        return id == that.id &&
                Objects.equals(name, that.name) &&
                Objects.equals(surname, that.surname) &&
                Objects.equals(patronymic, that.patronymic) &&
                Objects.equals(dateOfBirth, that.dateOfBirth) &&
                Objects.equals(inn, that.inn);
    }

    @Override
    public int hashCode() {
        final int prime=31;
        int res=1;
        res=prime*res+((id==0)?0:Long.hashCode(id));
        res=prime*res+((name==null)?0:name.hashCode());
        res=prime*res+((surname==null)?0:surname.hashCode());
        res=prime*res+((patronymic==null)?0:patronymic.hashCode());
        res=prime*res+((dateOfBirth==null)?0:dateOfBirth.hashCode());
        res=prime*res+((inn==null)?0:inn.hashCode());
        return res;
    }

    @Override
    public String toString() {
        return "Individual{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", patronymic='" + patronymic + '\'' +
                ", dataOfBirth='" + dateOfBirth + '\'' +
                ", inn='" + inn + '\'' +
                '}';
    }
}
