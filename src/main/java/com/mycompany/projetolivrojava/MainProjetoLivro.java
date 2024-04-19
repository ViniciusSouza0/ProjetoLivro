package com.mycompany.projetolivrojava;

public class MainProjetoLivro {
public static void main(String[] args) {
        
        Pessoa[] p = new Pessoa[3];
        Livro [] l = new Livro [3];
        
        p[0] = new Pessoa ("Luis\n", 30, "M");
        p[1] = new Pessoa ("Vinicius\n", 22, "M");
        p[2] = new Pessoa ("Leo\n",21, "M");
        
        
        l[0] = new Livro ("Java 00", "Nerd", 200, p[0]);
        l[1] = new Livro ("One piece", "Eichiro oda", 200, p[1]);
        l[2] = new Livro ("Vagabond", "Takhiko Inoue", 200, p[2]);
       
        
        l[0].abrir();
        System.out.println(l[0].detalhes());
        
        
        l[1].abrir();
        System.out.println(l[1].detalhes());
        
        
        l[2].abrir();
        System.out.println(l[2].detalhes());
        
        
       
}    
}
