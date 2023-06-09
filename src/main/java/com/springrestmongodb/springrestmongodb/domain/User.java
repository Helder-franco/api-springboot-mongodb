package com.springrestmongodb.springrestmongodb.domain;

import lombok.*;

import java.io.Serializable;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
public class User implements Serializable {

    private String id;
    private String name;
    private String email;
}
