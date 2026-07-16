package strings;

public class toLowerCase {
    public static void main(String[] args){
        String str = new String("HELLO JAVA");

        char[] arr = str.toCharArray();
        for(int i=0;i<arr.length;i++){
            if(arr[i] >='A' && arr[i]<='Z'){
                arr[i]= (char) (arr[i] -'A'+ 'a');
            }
        }
        String lowerstr = arr.toString();
        System.out.println(lowerstr);

    }

}
