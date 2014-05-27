package jp.co.jjs.java_seminar.bookshelf.servlet;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import jp.co.jjs.java_seminar.bookshelf.beans.Book;
import jp.co.jjs.java_seminar.bookshelf.dao.BookShelfDAO;

/**
 * Servlet implementation class BookSearchServlet
 */
@WebServlet("/BookSearchServlet")
public class BookSearchServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

//    @Resource(name="jdbc/crud")
//    private DataSource ds;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public BookSearchServlet() {
        super();
    }

    /**
     * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
     *      response)
     */
    protected void doGet(HttpServletRequest request,
            HttpServletResponse response) throws ServletException, IOException {
        process(request, response);
    }

    /**
     * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
     *      response)
     */
    protected void doPost(HttpServletRequest request,
            HttpServletResponse response) throws ServletException, IOException {
        process(request, response);
    }


    private void process(HttpServletRequest request,
            HttpServletResponse response) throws ServletException, IOException {

        String title = request.getParameter("title");
        ArrayList<Book> books = new ArrayList<>();
        String message = "";

        BookShelfDAO dao = new BookShelfDAO();
        books = dao.getBooks(title);
        if (books.size() == 0) {
            message = "データがありません。";
        }

        request.setAttribute("books", books);
        request.setAttribute("message", message);

        RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/jsp/result.jsp");
        dispatcher.forward(request, response);
    }

}
