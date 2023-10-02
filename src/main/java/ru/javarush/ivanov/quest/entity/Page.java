package ru.javarush.ivanov.quest.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Page {

    private Integer id;

    private String title;

    private String text;

}
