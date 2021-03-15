package com.shop.api.domain.example.entiry;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Example Entity
 * @author
 */
@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
public class Example {
    @Id @GeneratedValue
    private Long id;
    private String name;
    private String tel;

    @Builder
    public Example(String name, String tel) {
        this.name = name;
        this.tel = tel;
    }
}
