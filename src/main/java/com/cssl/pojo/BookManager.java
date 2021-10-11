package com.cssl.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BookManager {
private Integer id;
private String name;
private String author;
private Date time;
private Integer type;
}
