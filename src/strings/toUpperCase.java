package strings;

public class toUpperCase {
    public static void main(String[] args){
        String str = new String("hello java");

        char[] arr = str.toCharArray();
        for(int i=0;i<arr.length;i++){
            if(arr[i] >='A' && arr[i]<='Z'){
                arr[i]= (char) (arr[i] -'A'+ 'a');
            }
        }
        String upperstr =String.valueOf(arr);
        System.out.println(upperstr);

    }
}
