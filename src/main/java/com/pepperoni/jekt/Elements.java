package com.pepperoni.jekt;

import de.inetsoftware.jwebassembly.web.dom.HTMLElement;
import de.inetsoftware.jwebassembly.web.dom.Text;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import static com.pepperoni.jekt.EmbeddedJavaScript.script;
import static com.pepperoni.jekt.JavaEmbeddedHTML.jeh;
import static com.pepperoni.jekt.Jekt.document;

/**
 * @author Pepperoni
 */

// I hate string
// If I keep on coding string literal stuff im going to kms

public class Elements {




    public static void head(String varName, String javaEmbeddedHtml) { // java embedded html
        HTMLElement jeh = Jekt.document.createElement("script");
        Text innerText = Jekt.document.createTextNode("var" + " " + varName + " " + "=" + javaEmbeddedHtml);
        jeh.appendChild(innerText);
        Jekt.document.body().appendChild(jeh);
        script("document.head.innerHTML +=" + " " + varName);
    }

    public static void body(String varName, String javaEmbeddedHtml) { // java embedded html
        HTMLElement jeh = Jekt.document.createElement("script");
        Text innerText = Jekt.document.createTextNode("var" + " " + varName + " " + "=" + javaEmbeddedHtml);
        jeh.appendChild(innerText);
        Jekt.document.body().appendChild(jeh);
        script("document.body.innerHTML +=" + " " + varName);
    }


    public static void h1(String text) {
        HTMLElement element = Jekt.document.createElement("h1");
        Text innerText = Jekt.document.createTextNode(text);
        element.appendChild(innerText);
        Jekt.document.body().appendChild(element);
    }

    public static void h1(String text, String id) {
        jeh(id, "'<h1 id = \"" + id + "\"" + ">" + text +"</h1>'");
    }

    public static void h2(String text) {
        HTMLElement element = Jekt.document.createElement("h2");
        Text innerText = Jekt.document.createTextNode(text);
        element.appendChild(innerText);
        Jekt.document.body().appendChild(element);
    }

    public static void h2(String text, String id) {
        jeh(id, "'<h2 id = \"" + id + "\"" + ">" + text +"</h2>'");
    }

    public static void h3(String text) {
        HTMLElement element = Jekt.document.createElement("h3");
        Text innerText = Jekt.document.createTextNode(text);
        element.appendChild(innerText);
        Jekt.document.body().appendChild(element);
    }

    public static void h3(String text, String id) {
        jeh(id, "'<h3 id = \"" + id + "\"" + ">" + text +"</h3>'");
    }

    public static void h4(String text) {
        HTMLElement element = Jekt.document.createElement("h4");
        Text innerText = Jekt.document.createTextNode(text);
        element.appendChild(innerText);
        Jekt.document.body().appendChild(element);
    }

    public static void h4(String text, String id) {
        jeh(id, "'<h4 id = \"" + id + "\"" + ">" + text +"</h4>'");
    }

    public static void h5(String text) {
        HTMLElement element = Jekt.document.createElement("h5");
        Text innerText = Jekt.document.createTextNode(text);
        element.appendChild(innerText);
        Jekt.document.body().appendChild(element);
    }

    public static void h5(String text, String id) {
        jeh(id, "'<h5 id = \"" + id + "\"" + ">" + text +"</h5>'");
    }

    public static void h6(String text) {
        HTMLElement element = Jekt.document.createElement("h6");
        Text innerText = Jekt.document.createTextNode(text);
        element.appendChild(innerText);
        Jekt.document.body().appendChild(element);
    }

    public static void h6(String text, String id) {
        jeh(id, "'<h6 id = \"" + id + "\"" + ">" + text +"</h6>'");
    }

    public static void p(String text) {
        HTMLElement element = Jekt.document.createElement("p");
        Text innerText = Jekt.document.createTextNode(text);
        element.appendChild(innerText);
        Jekt.document.body().appendChild(element);
    }

    public static void p(String text, String id) {
        jeh(id, "'<p id = \"" + id + "\"" + ">" + text +"</p>'");
    }

    public static void div(String text) {
        HTMLElement element = Jekt.document.createElement("div");
        Text innerText = Jekt.document.createTextNode(text);
        element.appendChild(innerText);
        Jekt.document.body().appendChild(element);
    }

    public static void div(String text, String id) {
        jeh(id, "'<div id = \"" + id + "\"" + ">" + text +"</div>'");
    }

    public static void button(String text) {
        HTMLElement element = Jekt.document.createElement("button");
        Text innerText = Jekt.document.createTextNode(text);
        element.appendChild(innerText);
        Jekt.document.body().appendChild(element);
    }

    public static void button(String text, String id) {
       jeh(id, "'<button id = \"" + id + "\"" + ">" + text +"</button>'");
    }

   /* TODO public static void button(String text, String onClick) {
        HTMLElement element = document.createElement("button");
        Text innerText = document.createTextNode(text);
        element.appendChild( innerText );
        document.body().appendChild(element);
        element.onclick(evt -> script(onClick));
    } */ // i can do this with jeh

    public static void canvas(String text) {
        HTMLElement element = Jekt.document.createElement("canvas");
        Text innerText = Jekt.document.createTextNode(text);
        element.appendChild(innerText);
        Jekt.document.body().appendChild(element);
    }

    public static void canvas(String text, String id) {
        jeh(id, "'<canvas id = \"" + id + "\"" + ">" + text +"</canvas>'");
    }

    public static void style(String text) {
        HTMLElement element = Jekt.document.createElement("style");
        Text innerText = Jekt.document.createTextNode(text);
        element.appendChild(innerText);
        Jekt.document.body().appendChild(element);
    }

    public static String jVoid(WrapMode wrapMode, String wasmFileName, String method) {

        String text = null;

         if(wrapMode.equals(WrapMode.BackTick)) {
             text = "`WebAssembly.instantiateStreaming(fetch('"+wasmFileName+"'), wasmImports).then(obj => obj.instance.exports."+method+"());`";
         }

        else if(wrapMode.equals(WrapMode.Apostrophe)) {
            text = "'WebAssembly.instantiateStreaming(fetch(\""+wasmFileName+"\"), wasmImports).then(obj => obj.instance.exports."+method+"());'";
        }

        else if(wrapMode.equals(WrapMode.Quotes)) {
            text = "\"WebAssembly.instantiateStreaming(fetch(`"+wasmFileName+"`), wasmImports).then(obj => obj.instance.exports."+method+"());\"";
        }



        else if(wrapMode.equals(WrapMode.None)) {
             text = "WebAssembly.instantiateStreaming(fetch(`"+wasmFileName+"`), wasmImports).then(obj => obj.instance.exports."+method+"());";
        }

        return text;
    }

    public static void function(String name, String code) {
        HTMLElement element = document.createElement("script");
        Text innerText = document.createTextNode("function" + " " + name + "()" + " " + "{" + "" +
                " " + code + "" +
                "" + " " + "}");
        element.appendChild(innerText);
        document.body().appendChild(element);
    }

    public enum WrapMode {
        BackTick, Apostrophe, Quotes, None
    }


}
