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

        

        int[] firstNineNumbers = new int [9];
        int[] firstTeenNumbers = new int [10];
        
        int choice = 1;
        String name;

        do {

            Person person = new Person();
            StringBuilder strBuilder = new StringBuilder();
            System.out.println("Press 1 to generate a CPF, 2 to print the already validated CPFs, or 3 to exit.");
            choice = sc.nextInt();
            System.out.println();

            if(choice == 1){

                
                System.out.println("Enter your name :");
                sc.nextLine();
                
                name = sc.nextLine();
                person.setName(name);
                person.choiceState();

                for(int i = 0; i < firstNineNumbers.length ; i++){
                    
                    firstNineNumbers[i] = random.nextInt(10);

                    if (i == 9) {
                        firstNineNumbers[i] = person.getState();
                    } 
                }

                operations.calcDv1(firstNineNumbers);
                firstTeenNumbers = operations.allocationDv1(firstNineNumbers, firstTeenNumbers);

                operations.calcDv2(firstTeenNumbers);
                person.setCpf(operations.allocationDv2(firstTeenNumbers, person.getCpf()));

                for(int top : person.getCpf()){
                    System.out.print(top);
                }

                System.out.println();

                System.out.print(person.getName() + "\nYour valid CPF is:");
                for(int i = 0;  i < person.getCpf().length; i++){
                    System.out.print(person.getCpf()[i]);
                    strBuilder.append(person.getCpf()[i]);
                }

                String str = strBuilder.toString();
                person.setCpfString(str);

                list.add(person);

                System.out.println();
                System.out.println();
            }
            
            if(choice == 2){
                person.setPerson(list);
            }

            if(choice == 3){
                break;
            }

            
        } while(choice != 3);
        

        System.out.println("Você saiu.");
        sc.close();
    }
}    
