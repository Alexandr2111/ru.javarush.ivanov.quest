package ru.javarush.ivanov.quest.controller;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import ru.javarush.ivanov.quest.entity.Page;
import ru.javarush.ivanov.quest.service.PageService;

import java.io.IOException;

@WebServlet(name = "page3Servlet", value = "/page3-servlet")
public class Page3Servlet extends HttpServlet {

    PageService pageService = new PageService();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        PageService.badEndings++;

        HttpSession session = request.getSession(true);

        Page page3 = pageService.getPageById(3);
        String location3Title = page3.getTitle();
        session.setAttribute("3title", location3Title);
        session.setAttribute("badEndings", PageService.badEndings);

        request.setAttribute("page3", page3);

        Page page4 = pageService.getPageById(4);
        request.setAttribute("page4", page4);

        Page page5 = pageService.getPageById(5);
        request.setAttribute("page5", page5);

        RequestDispatcher requestDispatcher = request.getRequestDispatcher("WEB-INF/page3.jsp");
        requestDispatcher.forward(request, response);

    }
}
