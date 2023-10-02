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

@WebServlet(name = "page2Servlet", value = "/page2-servlet")
public class Page2Servlet extends HttpServlet {

    PageService pageService = new PageService();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        HttpSession session = request.getSession(true);

        Page page2 = pageService.getPageById(2);
        String location2Title = page2.getTitle();
        session.setAttribute("2title", location2Title);


        request.setAttribute("page2", page2);
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("WEB-INF/page2.jsp");
        requestDispatcher.forward(request, response);

    }
}
