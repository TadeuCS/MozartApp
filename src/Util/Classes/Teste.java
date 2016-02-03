/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Util.Classes;


public class Teste {
    public static String trataTelefone(String telefone){
        if(telefone.length()==8){
            return "(34) "+telefone.substring(0,4)+"-"+telefone.substring(4,8);
        }else{
            if(telefone.length()==9){
                return "(34) "+telefone.substring(0,5)+"-"+telefone.substring(5,9);
            }else{
                if(telefone.length()==10){
                    return "("+telefone.substring(0,2)+") "+telefone.substring(2,6)+"-"+telefone.substring(6,10);
                }else{
                    if(telefone.length()==11){
                        return "("+telefone.substring(0,2)+") "+telefone.substring(2,7)+"-"+telefone.substring(7,11);
                    }else{
                        return null;
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        String telefone="35992898572";
        System.out.println(trataTelefone(telefone));
    }

}
