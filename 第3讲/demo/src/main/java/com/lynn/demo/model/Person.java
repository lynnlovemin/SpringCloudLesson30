package com.lynn.demo.model;

import lombok.Builder;
import lombok.Data;
import lombok.ToString;

@Data
@Builder
@ToString
public class Person {

    private Long id;

    private String name;
}
