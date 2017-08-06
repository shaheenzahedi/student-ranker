/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
import javax.persistence.TemporalType;

/**
 *
 * @author Shaheen-Laptop
 */
@Entity
@Table(name = "log_tbl")
public class LogModel implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id")
    private Long id;

    @Column(name = "IsUpdate")
    private boolean isUpdate;

    @Column(name = "IsInsert")
    private boolean isInsert;

    @Column(name = "IsDelete")
    private boolean isDelete;

    @Column(name = "Description")
    private String description;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "TimeStamp", columnDefinition = "DATE")
    private Date timeStamp;

    public boolean isIsUpdate() {
        return isUpdate;
    }

    public void setIsUpdate(boolean isUpdate) {
        this.isUpdate = isUpdate;
    }

    public boolean isIsInsert() {
        return isInsert;
    }

    public void setIsInsert(boolean isInsert) {
        this.isInsert = isInsert;
    }

    public boolean isIsDelete() {
        return isDelete;
    }

    public void setIsDelete(boolean isDelete) {
        this.isDelete = isDelete;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(Date timeStamp) {
        this.timeStamp = timeStamp;
    }

}
