package home.junseok.question;

public class Cipher {

    public String solution(int len, String cipherText) {

        String answer = "";
        int cipherLength = cipherText.length();
        String binaryNumber = "";

        String[] arr = new String[len];

        for (int i = 0; i < len; i++) {
            arr[i] = cipherText.substring(i * cipherLength/len, i * cipherLength/len + cipherLength/len);
        }

        for (int i = 0; i < len; i ++) {
            for (int j = 0; j < arr[i].length(); j++) {
                if (arr[i].charAt(j) == "#".charAt(0)) {
                    binaryNumber += "1";
                } else {
                    binaryNumber += "0";
                }
            }
            answer += Character.toString(Integer.parseInt(binaryNumber, 2));
            binaryNumber = "";
        }

        return answer;
    }

    public String solution2(int len, String cipherText) {

        String answer = "";
        for (int i = 0; i < len; i++) {
            answer += (char) Integer.parseInt(cipherText.substring(0, 7).replace('#', '1').replace('*', '0'), 2);
            cipherText = cipherText.substring(7);
        }
        return answer;
    }

}
