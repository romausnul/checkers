@WebServlet(urlPatterns = "/server/api/ai")
public class RedirectServlet extends HttpServlet {

  @Override
  protected void doGet(HttpServletRequest req, HttpServletResponse resp) 
  throws ServletException, IOException {

      System.out.println("----- ТУТ ДОЛЖЕН БЫТЬ СЛАВА НО ЕГО ТУТ НЕТ ---------");
      resp.setStatus(HttpServletResponse.SC_FOUND);//302
      resp.setHeader("Location", "http://rmclouddata:101/server/api/ai");
  }
}
