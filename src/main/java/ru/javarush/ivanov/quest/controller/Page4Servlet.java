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

@WebServlet(name = "page4Servlet", value = "/page4-servlet")
public class Page4Servlet extends HttpServlet {

    PageService pageService = new PageService();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        PageService.badEndings++;

        HttpSession session = request.getSession(true);

        Page page4 = pageService.getPageById(4);
        String location4Title = page4.getTitle();
        session.setAttribute("4title", location4Title);
        session.setAttribute("badEndings", PageService.badEndings);

        request.setAttribute("page4", page4);
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("WEB-INF/page4.jsp");
        requestDispatcher.forward(request, response);

    }
}
