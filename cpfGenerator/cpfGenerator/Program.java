package cpfGenerator;
import entities.Person;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import processes.Operations;



public class Program {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        Operations operations = new Operations();
        List<Person> list = new ArrayList<>();
        StringBuilder strBuilder = new StringBuilder();
        

        int[] firstNineNumbers = new int [9];
        int[] firstTeenNumbers = new int [10];
        int[] cpf = new int [11];
        int choice = 1;

        do {

            System.out.println("Tecle 1 para gerar o cpf, 2 para imprimir os cpf's já validados ou 2 para sair.");
            choice = sc.nextInt();
            System.out.println();

            if(choice == 1){

                Person person = new Person();
                System.out.println("Digite seu nome : ");
                sc.nextLine();
                person.name = sc.nextLine();
                person.choiceState();

                for(int i = 0; i < firstNineNumbers.length ; i++){
                    
                    firstNineNumbers[i] = random.nextInt(10);

                    if (i == 2) {
                        firstNineNumbers[i] = person.getState();
                    } 
                }
            
                operations.dv1 = operations.calcDv1(firstNineNumbers);
                firstTeenNumbers = operations.allocationDv1(firstNineNumbers, firstTeenNumbers);
                operations.dv2 = operations.calcDv2(firstTeenNumbers);
                cpf = operations.allocationDv2(firstTeenNumbers, cpf);

                System.out.println();

                System.out.print(person.name + "\nSeu cpf válido é : ");
                for(int i = 0;  i < cpf.length; i++){
                    System.out.print(cpf[i]);
                    strBuilder.append(cpf[i]);
                }

                String str = strBuilder.toString();
                person.cpfP = str;

                list.add(person);

                System.out.println();
                System.out.println();
            }
            if(choice == 2){
                break;
            }

            if(choice == 3){
                for(Person objList : list){
                    System.out.println("Name : " + objList.name + "\nCpf : " + objList.cpfP);
                }
            }
            
        } while(choice == 1);
        

        System.out.println("Você saiu.");
    }
}    
