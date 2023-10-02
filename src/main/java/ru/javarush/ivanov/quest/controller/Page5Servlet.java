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

@WebServlet(name = "page5Servlet", value = "/page5-servlet")
public class Page5Servlet extends HttpServlet {

    PageService pageService = new PageService();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        HttpSession session = request.getSession(true);

        Page page5 = pageService.getPageById(5);
        String location5Title = page5.getTitle();
        session.setAttribute("5title", location5Title);

        request.setAttribute("page5", page5);
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("WEB-INF/page5.jsp");
        requestDispatcher.forward(request, response);

    }
}
