package com.cssl.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BookManager {
private Integer id;
private String name;
private String author;
@DateTimeFormat(pattern = "yyyy-MM-dd")
private Date time;
private Integer type;
}
