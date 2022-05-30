package com.pepperoni.jekt.router;

import static com.pepperoni.jekt.JavaEmbeddedHTML.jeh;

public class Links {

    public static void Link(Class route, String text, boolean method, String name) {
        String wholeName = route.getName();
        int dotPos = wholeName.lastIndexOf('.');
        String partName = wholeName.substring(dotPos == -1 ? 0 : (dotPos + 1), wholeName.length());
        if(method) {
            jeh(name, "'<a href=\""+ partName + ".html" + "\">" + text + "</a>" + "'");

        }
    }

    public static String Link(Class route, String text) {
        String wholeName = route.getName();
        int dotPos = wholeName.lastIndexOf('.');
        String partName = wholeName.substring(dotPos == -1 ? 0 : (dotPos + 1), wholeName.length());
        return "'<a href=\""+ partName + ".html" + "\">" + text + "</a>" + "'";
    }

}
