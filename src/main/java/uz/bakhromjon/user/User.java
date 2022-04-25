package uz.bakhromjon.user;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@XmlRootElement
public class User {
    private Long id;
    private String password;
    private String surnameEngl;
    private String middleName;
    private String birthDate;
    private String passportSerialNumber;
    private String birthPlace;
    private String birthCountry;
    private String livestatus;
    private String nationality;
    private String personality;
    private String citizenship;
    private String sex;
    private String docGivePlace;
    private String pport_issue_date;
    private String firstName;
    private String lastName;
    private Boolean isActive = true;
    private Boolean isAttached = false;
    private String pport_expire_date;
    private Long citizenshipId;
    private Long nationalityId;
    private String nameLatin;
    private String surnameLatin;
    private String document;
    private String patronymLatin;
    private Long birthCountryId;
    private String dateBeginDocument;
    private String docGivePlaceId;
    private String dateEndDocument;
    private String mobileNumber;
    private String email;
    private String exat;
}
