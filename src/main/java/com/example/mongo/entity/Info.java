package com.example.mongo.entity;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Info {
    public String name;
    public String image;
}
