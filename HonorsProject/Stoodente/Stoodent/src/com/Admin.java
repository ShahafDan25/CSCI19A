package com;

import java.io.FileNotFoundException;
import java.io.FileReader;

import javax.script.Invocable;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
// import swing, sql, awt
public class Admin
{
    //way to throw multiple exceptions! amazing 
    public static void main(String[] args) //throws ScriptException, FileNotFoundException, NoSuchMethodException
    {
        System.out.println("Hello World");

        // try{
        //     System.out.println("Project has started");
        //     ScriptEngine engine = new ScriptEngineManager().getEngineByName("nashorn");
        //     engine.eval("print('welcome to javascript executiong using java')");
        //     engine.eval(new FileReader("welcome.js"));
    
        //     // now if we want to call functions from a JS file:
        //     Invocable invo = (Invocable)engine;
        //     invo.invokeFunction("welcome", "Java Script");
        // }
        // catch(ScriptException | FileNotFoundException | NoSuchMethodException e)
        // {
        //     e.printStackTrace();
        // }
        
    }
    public String getString()
    {
        String word = "hello";
        return word;
    }
}