
public class SquareCalculator{
    public static void main(String[] args){
        int upper = Integer.parseInt(args[0]);
        int num = 1;
        int square = 1;
        int difference = 1;
        
        while (num <= upper){
            System.out.println("Integer:" + num + "  Square:" + square + "  Difference:" + difference);
            
            //increment for next number and square
            num++;
            difference = difference + 2;
            square = square + difference;
        }
    } 
}
