package com.example.finalproject;

public class Letter {
    String Value1 ="";
    String Value2 ="";
    Word[] Verb = new Word[4];
    Word[] Noun = new Word[4];
    Word[] Adjective = new Word[4];


Letter Intialize(String a, String b){
    this.Value1 = a;
    this.Value2 = b;
    return this;
}
Letter Fill_adj(String a,String b,String c,String d){
    this.Adjective[0].Name = a;
    this.Adjective[1].Name = b;
    this.Adjective[2].Name = c;
    this.Adjective[3].Name = d;
    return this;
}
    Letter Fill_v(String a,String b,String c,String d){
        this.Verb[0].Name = a;
        this.Verb[1].Name = b;
        this.Verb[2].Name = c;
        this.Verb[3].Name = d;
        return this;
    }
    Letter Fill_n(String a,String b,String c,String d){
        this.Noun[0].Name = a;
        this.Noun[1].Name = b;
        this.Noun[2].Name = c;
        this.Noun[3].Name = d;
        return this;
    }
}
