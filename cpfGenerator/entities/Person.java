package entities;

import java.util.Scanner;

public class Person {
    public String name;
    public String cpfP;
    public int state;


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

    public void choiceState(){

        System.out.println("""
                           De acordo com esta lista, digite a numeração do seu estado.
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
