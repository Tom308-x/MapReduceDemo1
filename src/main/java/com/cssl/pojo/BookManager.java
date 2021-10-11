package com.cssl.pojo;

import lombok.Data;

import java.util.Date;

@Data
public class BookManager {
private Integer id;
private String name;
private String author;
private Date time;
private Integer type;
}
