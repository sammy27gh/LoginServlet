import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class LoginServlet extends HttpServlet{

    private final static String userLogin = "user";
    private final static String userPassword = "user";

   public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html; charset=utf-8");

        PrintWriter pw = resp.getWriter();
        pw.println("<html>\n" +
                "<head>\n" +
                "    <title>Login</title>\n" +
                "    <style type=\"text/css\">"+
                        " .loginbutton {\n" +
                        "  font-weight: 700;\n" +
                        "  width: 50%;\n" +
                        "  margin: 5% 25%;\n" +
                        "  color: white;\n" +
                        "  text-decoration: none;\n" +
                        "  padding: .8em 1em calc(.8em + 3px);\n" +
                        "  border-radius: 3px;\n" +
                        "  background: teal;\n" +
                        "  box-shadow: 0 -3px darkslategray inset;\n" +
                        "  transition: 0.2s;\n" +
                        "} \n" +
                        " .loginbutton:hover { background: darkturquoise; }\n" +
                        " .loginbutton:active {\n" +
                        "  background: darkslategray;\n" +
                        "  box-shadow: 0 3px rgb(33,147,90) inset;\n" +
                        "}\n"+
                "</style>\n" +
                "</head>\n" +
                "<body style='background-color: darkcyan;'>\n" +
                "<div style='width: 400px;\n" +
                "     padding: 50px;\n" +
                "     margin: auto;'>\n" +
                "<form method=\"POST\" style='color: aquamarine; text-align: center;'>\n" +
                "    <div class=\"form-group\" style=\"width: 50%;  margin: 5% 25%;\">\n" +
                "        <label for=\"login\"><h2>LOGIN:</h2></label>\n" +
                "        <input required=\"required\" type=\"text\" name=\"login\" id=\"login\">\n" +
                "    </div>\n" +
                "    <div class=\"form-group\" style=\"width: 50%;  margin: 5% 25%;\">\n" +
                "        <label for=\"password\"><h2>PASSWORD:<h2></label>\n" +
                "        <input required=\"required\" type=\"password\" name=\"password\" id=\"password\">\n" +
                "    </div>\n" +
                "    <button type=\"submit\" class=\"loginbutton\">LOGIN</button>\n" +
                "</form>\n" +
                "</div>\n" +
                "</body>\n" +
                "</html>");

    }

    public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html; charset=utf-8");
        PrintWriter pw = resp.getWriter();

        String login = req.getParameter("login");
        String pass = req.getParameter("password");
        
        pw.println("<html>\n" +
                "<head>\n" +
                "    <title>Login</title>\n" +
                "</head>\n" +
                "<body style='background-color: darkcyan;'>\n"+
                       "<div style='width: 400px;\n" +
                "            padding: 50px;\n" +
                "            margin: auto;'>\n");
        if(userLogin.equals(login)&&userPassword.equals(pass)){
            pw.println("<h1 style='color: aquamarine; text-align: center;'>Welcome!</h1>");
        }
        else
        {
            pw.println("<h1 style='color: aquamarine; text-align: center;'>Incorrect username or password</h1>");
        }
        pw.println("</div>\n " +
                   "</body>\n " +
                   "</html>");

    }


}
