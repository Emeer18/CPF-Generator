package processes;

import entities.Person;

public class Operations {

    public int dv1;
    public int dv2;
    private int result;
    private int result2;
    Person person = new Person();

    public int calcDv1(int[] firstNineNumbers){

        for (int i = 0; i < firstNineNumbers.length; i++) {
                result += firstNineNumbers[i] * (10 - i);
            }

            if(result % 11 < 2){
                dv1 = 0;
            }

            else {
                int resto = result % 11;
                dv1 = (resto < 2) ? 0 : (11 - resto);
            }
        return dv1 ;
    }

    public int calcDv2(int[] firstTeenNumbers){

        for (int i = 0; i < firstTeenNumbers.length; i++) {
                result2 += firstTeenNumbers[i] * (11 - i);
            }

            if(result2 % 11 < 2){
                dv2 = 0;
            }

            else {
                int resto = result2 % 11;
                dv2 = (resto < 2) ? 0 : (11 - resto);
            }
        return dv2 ;
    }

        public int[] allocationDv1(int[] firstNineNumbers, int[] firstTeenNumbers) {
            for (int i = 0; i < 9; i++) { 
                firstTeenNumbers[i] = firstNineNumbers[i]; 
            }
            firstTeenNumbers[9] = dv1; 
            return firstTeenNumbers;

    }
    public int [] allocationDv2(int [] firstTeenNumbers, int [] cpf){


        for(int i = 0;  i < 10; i++){             
            cpf[i] = firstTeenNumbers[i];

        }
        cpf[10] = dv2;
        
        return cpf;
    }
}
