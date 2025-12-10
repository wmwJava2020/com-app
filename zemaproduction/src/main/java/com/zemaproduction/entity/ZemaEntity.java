/**
 * Created by:AIDA
 * Date : 12/10/2025
 * Time : 2:35 PM
 */
package com.zemaproduction.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class ZemaEntity {

    @Id
    String itemId;
    String itemName;
}
