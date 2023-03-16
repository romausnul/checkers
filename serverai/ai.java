@WebServlet(urlPatterns = "/server/api/ai")
public class RedirectServlet extends HttpServlet {

  @Override
  protected void doGet(HttpServletRequest req, HttpServletResponse resp) 
  throws ServletException, IOException {

      System.out.println("----- ТУТ ДОЛЖЕН БЫТЬ СЛАВА НО ЕГО ТУТ НЕТ ---------");
      resp.setStatus(HttpServletResponse.SC_FOUND);//302
      resp.setHeader("Location", "http://rmclouddata:1986/server/api/ai");
  }
    // Я УЖЕ НЕ ЧЕЛОВЕК Я ЗВЕРЬ  Я ЗЕЛЕНЫЙ СЛОНИК 
    // ЧЕМ Я ХУЖЕ ВАС Я ВАМ ЧЕ ЧАЙ ИЛИ ГЕНА 
    // Я САМ СЕБЕ  ГЕНА   Я ДАУН 
    // Я ИЗЫМАЮ  У ВАС ЧАЙ  Я ГЕНЧИК 
    // МАМА Я ДОТЕР МАМ Я ДОТЕР 
    // ПА ПА ПА Я ГЕНЧИК ГЕНА 229 НОВАЯ СТАТЬЯ 
    // ТУТ БЕЗ СЕРТИФЕКАТА НЕ ОБОЙТИСИ ТАК КАК Я ДАУН
}
