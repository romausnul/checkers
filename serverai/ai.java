@WebServlet(urlPatterns = "/server/api/ai")
public class RedirectServlet extends HttpServlet {

  @Override
  protected void doGet(HttpServletRequest req, HttpServletResponse resp) 
  throws ServletException, IOException {

      System.out.println("----- ТУТ ДОЛЖЕН БЫТЬ СЛАВА НО ЕГО ТУТ НЕТ ---------"); // это вообще что такое я не знаю но знаю 
      resp.setStatus(HttpServletResponse.SC_FOUND); // тип подключения 
      resp.setHeader("Location", "http://rmclouddata:101/server/api/ai"); // расположение нейронки 
      RedirectServlet("rmclouddata:1986/"); // основной сервер 
      resp.server("server.mamon.host"); // сайт сервера кста рабоатет вроде или нет 
  }
}
