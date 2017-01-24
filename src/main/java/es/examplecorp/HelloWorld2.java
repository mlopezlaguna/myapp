package es.examplecorp;

/**
 * Created with IntelliJ IDEA.
 * User: jorge
 * Date: 1/17/17
 * Time: 4:37 PM
 * To change this template use File | Settings | File Templates.
 */

import java.util.HashMap;
import java.util.Map;

import static spark.Spark.get;
import java.util.HashMap;
import java.util.Map;

import spark.ModelAndView;
import spark.template.handlebars.HandlebarsTemplateEngine;

public class HelloWorld2 {
    public static void main(String[] args) {

        Map map = new HashMap();
        map.put("Name", "jorge");

        get("/hello",(req,res) -> new ModelAndView(map,"hello.hbs"),new HandlebarsTemplateEngine());
    }

}
