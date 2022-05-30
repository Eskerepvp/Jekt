package com.pepperoni.jekt;

import de.inetsoftware.jwebassembly.web.dom.HTMLElement;
import de.inetsoftware.jwebassembly.web.dom.Text;

import static com.pepperoni.jekt.Jekt.document;

public class EmbeddedJavaScript {



    public static void script(String text) { // you HAVE to use '' instead of ""
        HTMLElement element = document.createElement("script");
        Text innerText = document.createTextNode(text);
        element.appendChild(innerText);
        document.body().appendChild(element);
    }


    public static String alert(String string_text) {
        return "alert(" + "'" + string_text + "')" + ";";
    }

    public static String console_log(String string_text) {
        return "console.log(" + "'" + string_text + "')" + ";";
    }

    public static String jsConst(String name, String equals) {
        return "const" + " "  + name + " " + "=" + " " + equals + ";";
    }

    public static String jsVar(String name, String equals) {
        return "var" + " "  + name + " " + "=" + " " + equals + ";";
    }

    public static String var(String name, String equals) {
        return "var" + " "  + name + " " + "=" + " " + equals + ";";
    }

    public static String jsClass(String name, String params, String constructorCode, String code) {
        return "class " + name + " " + "{" + "\n" + "constructor(" + params + ") " + "{"
                + constructorCode
                + " " + "}"
                + " " + code + "}";
    }

}
