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

/**
 *
 * @author Shaheen-Laptop
 */
@Entity
@Table(name = "payment_tbl")
public class PaymentModel implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id")
    private Long id;

    @Column(name = "StudentId")
    private Long studentId;

    @Column(name = "PaymentDate")
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date paymentDate;

    @Column(name = "TotalParticipiation")
    private int totalParticipiation;
    
    @Column(name = "TotalPayment")
    private int totalPayment;
    
    @Column(name = "NumberOfPays")
    private int numberOfDays;
}
