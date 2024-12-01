public class MyString {
    public static void main(String[] args) {
        System.out.println("Testing lowercase:");
        System.out.println("UnHappy : " + lowerCase("UnHappy"));
        System.out.println("This costs 15 Sheksls : " + lowerCase("This costs 15 Sheksls"));
        System.out.println("TLV : " + lowerCase("TLV"));
        System.out.println("lowercase : " + lowerCase("lowercase"));

        System.out.println("Testing contains:");
        System.out.println(contains("unhappy", "happy")); // true
        System.out.println(contains("happy", "unhappy")); // false
        System.out.println(contains("historical", "story")); // false
        System.out.println(contains("psychology", "psycho")); // true
        System.out.println(contains("personality", "son")); // true
        System.out.println(contains("personality", "dad")); // false
        System.out.println(contains("resignation", "sign")); // true
    }

    /** Returns the lowercase version of the given string. */
    public static String lowerCase(String str) {
        // Replace the following statement with your code
        if (str.length()==0) return "";
        String temp = "";
        for(int i=0;i<str.length();i++) {
            if (str.charAt(i) >=65 && str.charAt(i)<=90) {
                int newChar = (int) str.charAt(i) + 32;
                temp+= (char) newChar;
            } else {
                temp += str.charAt(i);
            }
        }
        return temp;
    }

    /** If str1 contains str2, returns true; otherwise returns false. */
    public static boolean contains(String str1, String str2) {
        // Replace the following statement with your code
        int length1= str1.length();
        int length2=str2.length();
        int counter = 0;
        if((length1!=0 && length2==0)) return true;
        if((length1==0 && length2!=0)) return false;
        for(int i=0;i<length1;i++) {
            if (counter == length2) break;
            if (str1.charAt(i)==str2.charAt(0)) {
                for(int j=0;j<length2;j++) {
                    if (j+i>length1) {
                        counter =0;
                        break;
                    } else {
                        if (str1.charAt(i+j) == str2.charAt(j)) {
                        counter ++;    
                        } else {
                            counter =0;
                            break;
                        }
                    }
                }
            }
        }
        if (counter == length2) {
            return true;
        } else {
            return false;
        }
    }
}
