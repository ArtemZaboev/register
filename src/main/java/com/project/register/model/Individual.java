package com.project.register.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Objects;

@Entity
@Data
@NoArgsConstructor
public class Individual implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    private String surname;
    private String patronymic;
    private String dateOfBirth;
    private String inn;

    public Individual(String name,String surname,String patronymic,String dateOfBirth) {
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
