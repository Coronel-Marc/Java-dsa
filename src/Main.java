import java.util.Arrays;

public class Main {
    public static void main (String[] arg){
        System.out.println("Hello, World!");
        int[] lista = {1,2,3,4};
        int alvo = 7;
        int [] resultado = twoSum(lista,alvo);
        System.out.println(Arrays.toString(resultado));
    }

    public static int[] twoSum(int[] arr, int target){
        int left = 0;
        int right = arr.length -1;
        int[] resultado = {};

        while (left < right){
            int soma = arr[left]+arr[right];

            if (soma == target){
                resultado = new int[]{arr[left], arr[right]};
                return resultado;
            } else if (soma < target) {
                left += 1;
            }else{
                right -= 1;
            }
        }
        return resultado;
    }
}