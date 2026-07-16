// Source code is decompiled from a .class file using FernFlower decompiler (from Intellij IDEA).
package strings;
import java.util.*;

public class strings {
        public static void main(String[] args) {
            // String str="Hello World";
            // System.out.println(str);
            // String str2=new String("Hello JAVAJAFGGGJAjfgyJAjyfJA");
            // System.out.println(str2);
            // //String inbuilt methods;
            // System.out.println(str2.length());
            // System.out.println(str2.charAt(4));
            // System.out.println(str2.substring(4));
            // System.out.println(str2.substring(4,8));
            // System.out.println(str2.substring(4,str2.length()));
            // System.out.println(str2.concat(" Programming"));
            // System.out.println(str2.concat(str));
            // System.out.println(str2.indexOf("JA",11));
            // System.out.println(str2.lastIndexOf("JA"));

            String s1="Hello I am Aditya";
            String s2="Hello I am Aditya";
            String s3=new String("Hello I am Aditya");
            String s4=new String("Hello I am Aditya");

            System.out.println(s1.equals(s2));
            System.out.println(s1.equals(s3));
            System.out.println(s3.equals(s4));
            System.out.println(s1==s2);
            System.out.println(s1==s3);
            System.out.println(s3==s4);


            String str2=new String("Hello JAVA");
            // str2=str2.toLowerCase();
            // System.out.println(str2);
            // str2=str2.toUpperCase();
            // System.out.println(str2);

            // for(int i=0;i<str2.length();i++){
            //   if(str2.charAt(i)>='A' && str2.chatAt(i)<'Z'){
            //     str2.chatAt(i)=(char)(str2.charAt(i)-'A'+'a');
            //   }
            // }

            char[] arr=str2.toCharArray();
            for(int i=0;i<arr.length;i++){
                System.out.print(arr[i]+" ");
            }

            for(int i=0;i<arr.length;i++){
                if(arr[i]>='A' && arr[i]<='Z'){
                    arr[i]= (char)(arr[i]-'A'+'a');
                }
            }
            System.out.println();
            for(int i=0;i<arr.length;i++){
                System.out.print(arr[i]+" ");
            }

            char[] arr2=str2.toCharArray();
            for(int i=0;i<arr.length;i++){
                if(arr2[i]>='a' && arr2[i]<='z'){
                    arr2[i]= (char)(arr2[i]-'a'+'A');
                }
            }
            System.out.println();
            for(int i=0;i<arr2.length;i++){
                System.out.print(arr2[i]+" ");
            }
            System.out.println();
            String Lowstr=String.valueOf(arr);
            String Upstr=String.valueOf(arr2);
            System.out.println(Lowstr);
            System.out.println(Upstr);






        }

}
