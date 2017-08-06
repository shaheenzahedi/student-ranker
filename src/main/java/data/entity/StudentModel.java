package data.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;

@Entity
@Table(name = "student_tbl")
public class StudentModel implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id")
    private Long id;

    @Column(name = "BirthDate")
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date birthDate;

    @Column(name = "CreatedDate")
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date createdDate;

    @Column(name = "UpdateDate")
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date updatedDate;

    @Column(name = "NumberOfWinnings")
    private int numberOfWinnings;

    @Column(name = "UniqueId")
    private String uniqueId;

    @Column(name = "FirstName")
    private String firstName;

    @Column(name = "LastName")
    private String lastName;

    @Column(name = "TelegramId")
    private String telegramId;

    @Column(name = "MobilePhone")
    private String mobilePhone;

    
    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public Date getUpdatedDate() {
        return updatedDate;
    }

    public void setUpdatedDate(Date updatedDate) {
        this.updatedDate = updatedDate;
    }

    public int getNumberOfWinnings() {
        return numberOfWinnings;
    }

    public void setNumberOfWinnings(int numberOfWinnings) {
        this.numberOfWinnings = numberOfWinnings;
    }

    public String getUniqueId() {
        return uniqueId;
    }

    public void setUniqueId(String uniqueId) {
        this.uniqueId = uniqueId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getTelegramId() {
        return telegramId;
    }

    public void setTelegramId(String telegramId) {
        this.telegramId = telegramId;
    }

    public String getMobilePhone() {
        return mobilePhone;
    }

    public void setMobilePhone(String mobilePhone) {
        this.mobilePhone = mobilePhone;
    }
}
