package entities;

import java.util.List;
import java.util.Scanner;

public class Person {
    private String name;
    private  int state;
    private int[] cpf = new int [11];
    private String cpfString;

    
    public String getCpfString() {
        return cpfString;
    }
    public void setCpfString(String cpfString) {
        this.cpfString = cpfString;
    }
    public int[] getCpf() {
        return cpf;
    }
    public void setCpf(int[] cpf) {
        this.cpf = cpf;
    }

    Scanner sc = new Scanner(System.in);

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getState() {
        return state;
    }
    public void setState(int state) {
        this.state = state;
    }

    public void setPerson(List <Person> list){
        for(Person objList : list){
            System.out.println("Name : " + objList.getName() + "\nCpf : " + objList.getCpfString());
        }
    }
    public void choiceState(){

        System.out.println("""
                           According to this list, enter the number of your state.
                           0 - Rio Grande do Sul
                           1 - DF, GO, MT, MS, TO/n2 - AM, PA, RR, AP, AC, RO
                           3 - CE, MA, PI
                           4 - PB, PE, AL, RN
                           5 - BA, SE
                           6 - MG
                           7 - RJ, ES
                           8 - SP
                           9 - PR, SC""");

        int state = sc.nextInt();                           
        setState(state);
    }

}
