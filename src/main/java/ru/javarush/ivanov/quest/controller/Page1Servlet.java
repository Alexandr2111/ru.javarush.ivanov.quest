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

@WebServlet(name = "Page1Servlet", value = "/page1-servlet")
public class Page1Servlet extends HttpServlet {

    PageService pageService = new PageService();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        HttpSession session = request.getSession(true);

        Page page1 = pageService.getPageById(1);
        String location1Title = page1.getTitle();
        session.setAttribute("1title", location1Title);
        session.setAttribute("badEndings", PageService.badEndings);
        if (session.getAttribute("name") == null) {
            session.setAttribute("name", "Не указано");
        }

        request.setAttribute("page1", page1);

        Page page2 = pageService.getPageById(2);
        request.setAttribute("page2", page2);

        Page page3 = pageService.getPageById(3);
        request.setAttribute("page3", page3);

        RequestDispatcher requestDispatcher = request.getRequestDispatcher("WEB-INF/page1.jsp");
        requestDispatcher.forward(request, response);

    }
}