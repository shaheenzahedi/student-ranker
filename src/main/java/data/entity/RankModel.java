/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author Shaheen-Laptop
 */
@Entity
@Table(name = "rank_tbl")
public class RankModel implements Serializable {

    @Column(name = "StudentId")
    private Long studentId;

    @Column(name = "CurrentPoint")
    private int currentPoint;

    @Column(name = "CurrentRank")
    private int currentRank;
}
