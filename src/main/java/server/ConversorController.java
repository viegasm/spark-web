package server;

import dominio.Conversor;
import spark.Request;
import spark.Response;

public class ConversorController {

    public String convertirAMillas(Request request, Response response) {
        String km = request.queryParams("km");
        if(km == null) {
            return "<!DOCTYPE html>\n" +
                    "<link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css\" integrity=\"sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T\" crossorigin=\"anonymous\">\n" +
                    "<html lang=\"en\">\n" +
                    "<head>\n" +
                    "    <meta charset=\"UTF-8\">\n" +
                    "    <title>Conversor</title>\n" +
                    "</head>\n" +
                    "<body>\n" +
                    "<form method=\"get\" action=\"/conversor/millas\">\n" +
                    "    <!-- marquee>Convertime</marquee -->\n" +
                    "    <div>\n" +
                    "        <h1>Conversor KM a Millas</h1>\n" +
                    "                    KM<input name=\"km\" type=\"number\" style=\"align-content: center\"/>\n" +
                    "    </div>\n" +
                    "    <div style=\"padding: 20px 0px\">\n" +
                    "        <button type=\"submit\">Convertir</button>\n" +
                    "    </div>\n" +
                    "</form>\n" +
                    "</body>\n" +
                    "</html>";
        }

        Double kmNumber = Double.parseDouble(km);
        Double miles = new Conversor().convertirAMillas(kmNumber);

        return "<!DOCTYPE html>\n" +
                "<link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css\" integrity=\"sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T\" crossorigin=\"anonymous\">\n" +
                "<html lang=\"en\">\n" +
                "<head>\n" +
                "    <meta charset=\"UTF-8\">\n" +
                "    <title>Conversor</title>\n" +
                "</head>\n" +
                "<body>\n" +
                "<form method=\"get\" action=\"/conversor/millas\">\n" +
                "    <!-- marquee>Convertime</marquee -->\n" +
                "    <div>\n" +
                "        <h1>Conversor KM a Millas</h1>\n" +
                "                    KM<input name=\"km\" type=\"number\" style=\"align-content: center\"/>\n" +
                "    </div>\n" +
                "    <div style=\"padding: 20px 0px\">\n" +
                "        <button type=\"submit\">Convertir</button>\n" +
                "    </div>\n" +
                "    <div>Millas: "+ miles.toString() + "</div>\n" +
                "    <img src=\"../jebus2.gif\">\n" +
                "</form>\n" +
                "</body>\n" +
                "</html>";
    }
}
