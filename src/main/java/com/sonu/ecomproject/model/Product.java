package com.sonu.ecomproject.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String description;
    private String brand;
    private int price;
    private String category;
    @Column(name = "release_date")
    private Date releaseDate;
    @Column(name = "available")
    private Boolean productAvailable;
    @Column(name = "quantity")
    private int stockQuantity;

    private String imageName;
    private String imageType;
    @Lob
    @Column(name = "image_data", columnDefinition="LONGBLOB")
    private byte[] imageData;

}
