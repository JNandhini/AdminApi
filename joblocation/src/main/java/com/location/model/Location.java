package com.location.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "job_location")
public class Location {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
@Column(name = "jobloca_id")
public int ID;
@Column(name = "jobloca_name")
public String Location;
@Column(name="is_active")
public String Active;
@Column(name="street")
public String street;
@Column(name="city")
public String city;
@Column(name="state")
public String state;
@Column(name="country")
public String country;
@Column(name="zip")
public int zip;

}