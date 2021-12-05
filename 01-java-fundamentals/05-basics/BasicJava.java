import java.util.ArrayList;
public class BasicJava {
    public Integer[] arrayOfAll(int number) {
        ArrayList<Integer> all = new ArrayList<>();
            
            for(int i=1; i<256; i++ ) {
                all.add(i);
            }
            Integer[] res = new Integer[all.size()];
            res = all.toArray(res);
            return res;
    }
    public Integer[] arrayOfOdd(int number) {
        ArrayList<Integer> odds = new ArrayList<>();

            for(int i=1; i<256; i++) {
                if(i%2!=0) {
                    odds.add(i);
                }            
            }
            Integer[] res = new Integer[odds.size()];
            res = odds.toArray(res);
            return res;
    }
    public String sumFinder(int number) {
        int num = 255, sum = 0;
        for(int a = 1; a <= num; ++a) {
            sum += a;
        }
        return "the sum is "+ sum;
    }
    public String iteratingThrough(int[] myArray) {
        String output=" ";
        for(int i=0; i<myArray.length; i++){
            output += " ";
            output += myArray[i];
        }
        return output;
    }
    public void theMax() {
        int[] Array = {-2, 5, 7, 9};
        int max = Array[0];
        for (int i=1; i < Array.length; i++) {
            if (Array[i] > max) {
                max = Array[i];
            }
        System.out.println(max);
        }
    }
    public void arraySix(){
        ArrayList<Object> y = new ArrayList<Object>();
        for (int i=1; i<=255; i+=2){
            y.add(i);
        }
        System.out.println(y);
        }
}




