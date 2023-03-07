package calculatorsederhana;

import java.util.Scanner;

public class CalculatorSederhana {
    public double input_1;
    public double input_2;
    public String operasi;
    
    public CalculatorSederhana (double input_1, double input_2, String operasi){
        this.input_1=input_1;
        this.input_2=input_2;
        this.operasi=operasi;
    }
    
    public double hasil(){
    double hasil = 0;
    switch(operasi){
            case "x":
                hasil=input_1*input_2;
                break;
            case ":" :
                hasil=input_1/input_2;
                break;
            case "+" :
                hasil=input_1+input_2;
                break;
            case "-":
                hasil=input_1-input_2;
                break;
            case "mod":
                hasil=input_1%input_2;
                break;
            default:
                System.out.println("------------------------------");
                System.out.println("Inputan TIDAK VALID");
            }
    return hasil;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("[PUTRI DWI AGNESYA]");
        System.out.println("[21081010142]");
        System.out.println("------------------------------");
        
        System.out.print("inputkan data 1 = ");
        double input_1 = input.nextDouble();
        System.out.print("pilih operasi matematika (x/:/+/-/mod) = ");
        String operasi = input.next();
        System.out.print("inputkan data 2 = ");
        double input_2 = input.nextDouble();
        
        CalculatorSederhana calculate = new CalculatorSederhana (input_1, input_2, operasi);
        System.out.println("------------------------------");
        System.out.println("Hasil perhitungan");
        System.out.println(input_1+" "+ operasi+" "+ input_2+" = "+ calculate.hasil());
    }
}
    
    

