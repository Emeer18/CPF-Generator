package processes;

public class Operations {

    public int dv1;
    public int dv2;
    private int result;

    public int calcDv1(int[] firstNineNumbers){

        for(int i = 10; i >= 2; i--){
            for(int j = 0; j < firstNineNumbers.length; j++ ){
                result += firstNineNumbers[j] * i;
                i--;
            }
            if(result % 11 < 2){
                dv1 = 0;
            }
            else {
                result = result % 11;
                dv1 = 11 - result;
            }
        }
        return dv1 ;
    }

    public int calcDv2(int[] firstTeenNumbers){

        for(int i = 11; i >= 2; i--){
            for(int j = 0; j < firstTeenNumbers.length; j++ ){
                result += firstTeenNumbers[j] * i;
                i--;
            }
            if(result % 11 < 2){
                dv2 = 0;
            }
            else {
                dv2 = dv2 % 11;
                dv2 = 11 - dv2;
            }
        }
        return dv2 ;
    }

    public int [] allocationDv1(int [] firstNineNumbers, int [] firstTeenNumbers){

        for(int i = 0;  i < firstTeenNumbers.length; i++){             
            for(int j = 0; j < firstNineNumbers.length; j++){          
                firstTeenNumbers[i] = firstNineNumbers [j];
                i++;
            }
            firstTeenNumbers[i] = dv1;
        }
        return firstTeenNumbers;
    }
    public int [] allocationDv2(int [] firstTeenNumbers, int [] cpf){

        for(int i = 0;  i < cpf.length; i++){             
            for(int j = 0; j < firstTeenNumbers.length; j++){          
                cpf[i] = firstTeenNumbers [j];
                i++;
            }
            cpf[i] = dv2;
        }
        return cpf;
    }
}
