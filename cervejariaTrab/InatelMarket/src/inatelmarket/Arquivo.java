/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inatelmarket;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.Writer;
import static java.lang.System.out;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author  */
public class Arquivo {

    FileOutputStream a;

    public Arquivo() {
        try {
            /*  
            if (b != null) {
                System.out.println("ARQUIVO ABERTO!");
            } else {*/
            a = new FileOutputStream("Nota.txt", true);

            System.out.println("ARQUIVO CRIADO");
            //}

        } catch (Exception ex) {

        }
    }

    public void salvar(ArrayList<Produto> array) {

        try {

            Writer w = new BufferedWriter(new OutputStreamWriter(a));

            for (Produto prod : array) {

                System.out.println(prod.cupomProduto);
                w.write(prod.cupomProduto);
            }
            w.close();
            System.out.println("deu certo");
        } catch (Exception ex) {
            ex.printStackTrace();
            System.out.println(ex);
        }
    }

    public String ler() {
        String texto = "";
        Scanner b;
        String line;
        try {
            b = new Scanner(new FileReader("Nota.txt"));
            while (b.hasNext()) {
                texto += b.next() + "\n";
            }

            b.close();
        } catch (IOException ex) {
            System.out.println("IOEXCEPTION");

        }
        System.out.println(texto);
        return texto;
    }
    public void clearTheFile() throws IOException {
        FileWriter fwOb = new FileWriter("Nota.txt", false); 
        PrintWriter pwOb = new PrintWriter(fwOb, false);
        pwOb.flush();
        pwOb.close();
        fwOb.close();
                
        
    }

}
