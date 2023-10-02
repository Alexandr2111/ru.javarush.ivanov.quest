package ru.javarush.ivanov.quest.service;

import ru.javarush.ivanov.quest.entity.Page;
import ru.javarush.ivanov.quest.repository.PageRepository;


public class PageService {

     public static Integer badEndings = 0;

    PageRepository pageRepository = new PageRepository();

    public Page getPageById(Integer id) {
        return pageRepository.getPageById(id);
    }



}
