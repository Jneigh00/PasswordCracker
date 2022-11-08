import java.io.*;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.*;

public class PasswordCracker {

    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException, NoSuchAlgorithmException {
        File needToCrack = new File("src/passwordsToCrack"); //reads in password file
        Scanner scan = new Scanner(needToCrack); //creates scanner for password

        ArrayList<String> passwords = new ArrayList<>();
        while(scan.hasNextLine()){
            passwords.add(scan.nextLine());
        }
        scan.close();

        int found = 0;

        File potential = new File("src/potentialPasswords3"); //reads in file for potential passwords
        Scanner pass = new Scanner(potential);
        ArrayList<String> potentialPasswords = new ArrayList<>();
        while(pass.hasNextLine()){
            potentialPasswords.add(pass.nextLine());
        }
        pass.close();
        String current = "";
        for(int i =0;i< potentialPasswords.size();i++){

            current = potentialPasswords.get(i);
            String sub = current;
            String sub2 = current;
            String sub3 = current;

            if(sub2.contains("t")){
                String changedIto1 = sub.replace('t', '7');
                String changedItoEx = sub.replace('e', '3');

                String Ito1Zero = "0" + changedIto1;
                String Ito1One = "1" + changedIto1;

                String ItoExZero = "0" + changedItoEx;
                String ItoExOne = "1" + changedItoEx;

                String Ito1ZeroEn = "0:" + encryptPassword(Ito1Zero);
                String Ito1OneEn = "1:" + encryptPassword(Ito1One);

                String ItoExZeroEn = "0:" + encryptPassword(ItoExZero);
                String ItoExOneEn = "0:" + encryptPassword(ItoExOne);

                String numberEndZeroS = Ito1Zero + "0.";
                String numberEndOneS = Ito1One + "1.";
                String numEndZero = "0:" +encryptPassword(numberEndZeroS);
                String numEndOne = "1:" + encryptPassword(numberEndOneS);


                for(int j = 0; j<passwords.size();j++){
                    if(Ito1ZeroEn.equals(passwords.get(j))){
                        System.out.println( "This is:" + passwords.get(j));
                        System.out.println(Ito1Zero);
                        found++;
                    }
                    else if(numEndOne.equals(passwords.get(j))){
                        System.out.println("This is: " + passwords.get(j));
                        System.out.println(numberEndOneS);
                        found++;
                    }
                    else if(numEndZero.equals(passwords.get(j))){
                        System.out.println("This is: " + passwords.get(j));
                        System.out.println(numberEndZeroS);
                        found++;
                    }
                    if(Ito1OneEn.equals(passwords.get(j))){
                        System.out.println( "This is:" + passwords.get(j));
                        System.out.println(Ito1One);
                        found++;
                    }
                    if(ItoExZeroEn.equals(passwords.get(j))){
                        System.out.println( "This is:" + passwords.get(j));
                        System.out.println(ItoExZero);
                        found++;
                    }
                    if(ItoExOneEn.equals(passwords.get(j))){
                        System.out.println( "This is:" + passwords.get(j));
                        System.out.println(ItoExOne);
                        found++;
                    }
                }
            }



            if(sub2.contains("a")){
                String changedIto1 = sub.replace('a', '4');
                String changedItoEx = sub.replace('i', '1');

                String Ito1Zero = "0" + changedIto1;
                String Ito1One = "1" + changedIto1;

                String ItoExZero = "0" + changedItoEx;
                String ItoExOne = "1" + changedItoEx;

                String Ito1ZeroEn = "0:" + encryptPassword(Ito1Zero);
                String Ito1OneEn = "1:" + encryptPassword(Ito1One);

                String ItoExZeroEn = "0:" + encryptPassword(ItoExZero);
                String ItoExOneEn = "0:" + encryptPassword(ItoExOne);

                String numberEndZeroS = Ito1Zero + "0!";
                String numberEndOneS = Ito1One + "0!";
                String numEndZero = "0:" +encryptPassword(numberEndZeroS);
                String numEndOne = "1:" + encryptPassword(numberEndOneS);


                for(int j = 0; j<passwords.size();j++){
                    if(Ito1ZeroEn.equals(passwords.get(j))){
                        System.out.println( "This is:" + passwords.get(j));
                        System.out.println(Ito1Zero);
                        found++;
                    }
                    else if(numEndOne.equals(passwords.get(j))){
                        System.out.println("This is: " + passwords.get(j));
                        System.out.println(numberEndOneS);
                        found++;
                    }
                    else if(numEndZero.equals(passwords.get(j))){
                        System.out.println("This is: " + passwords.get(j));
                        System.out.println(numberEndZeroS);
                        found++;
                    }
                    if(Ito1OneEn.equals(passwords.get(j))){
                        System.out.println( "This is:" + passwords.get(j));
                        System.out.println(Ito1One);
                        found++;
                    }
                    if(ItoExZeroEn.equals(passwords.get(j))){
                        System.out.println( "This is:" + passwords.get(j));
                        System.out.println(ItoExZero);
                        found++;
                    }
                    if(ItoExOneEn.equals(passwords.get(j))){
                        System.out.println( "This is:" + passwords.get(j));
                        System.out.println(ItoExOne);
                        found++;
                    }
                }
            }

            if(sub.contains("i")){
                String changedIto1 = sub.replace('i', '1');
                String changedItoEx = sub.replace('i', '!');

                String Ito1Zero = "0" + changedIto1;
                String Ito1One = "1" + changedIto1;

                String ItoExZero = "0" + changedItoEx;
                String ItoExOne = "1" + changedItoEx;

                String Ito1ZeroEn = "0:" + encryptPassword(Ito1Zero);
                String Ito1OneEn = "1:" + encryptPassword(Ito1One);

                String ItoExZeroEn = "0:" + encryptPassword(ItoExZero);
                String ItoExOneEn = "0:" + encryptPassword(ItoExOne);

                String numberEndZeroS = Ito1Zero + "0!";
                String numberEndOneS = Ito1One + "0!";
                String numEndZero = "0:" +encryptPassword(numberEndZeroS);
                String numEndOne = "1:" + encryptPassword(numberEndOneS);


                for(int j = 0; j<passwords.size();j++){
                    if(Ito1ZeroEn.equals(passwords.get(j))){
                        System.out.println( "This is:" + passwords.get(j));
                        System.out.println(Ito1Zero);
                        found++;
                    }
                    else if(numEndOne.equals(passwords.get(j))){
                        System.out.println("This is: " + passwords.get(j));
                        System.out.println(numberEndOneS);
                        found++;
                    }
                    else if(numEndZero.equals(passwords.get(j))){
                        System.out.println("This is: " + passwords.get(j));
                        System.out.println(numberEndZeroS);
                        found++;
                    }
                    else if(Ito1OneEn.equals(passwords.get(j))){
                        System.out.println( "This is:" + passwords.get(j));
                        System.out.println(Ito1One);
                        found++;
                    }
                    else if(ItoExZeroEn.equals(passwords.get(j))){
                        System.out.println( "This is:" + passwords.get(j));
                        System.out.println(ItoExZero);
                        found++;
                    }
                    else if(ItoExOneEn.equals(passwords.get(j))){
                        System.out.println( "This is:" + passwords.get(j));
                        System.out.println(ItoExOne);
                        found++;
                    }
                }
            }



            String zeroSalt = "0" + current;
            String oneSalt = "1" +current;

            String numberEndZeroS = zeroSalt + "1";
            String numberEndOneS = oneSalt + "1";

            String num0ex = zeroSalt + "1000!";
            String num1ex = oneSalt + "1000!";

            String numBef0 = "0!" + current;
            String numBef1 = "1!" + current;

            String numBef0En = "0:" + encryptPassword(numBef0);
            String numBef1En = "1:" + encryptPassword(numBef1);

            String num0exEn = "0:"+encryptPassword(num0ex);
            String num1exEn = "1:" + encryptPassword(num1ex);

            String numEndZero = encryptPassword(numberEndZeroS);
            String numEndOne = encryptPassword(numberEndOneS);

            String exclimationAtEnd = zeroSalt + ".!";
            String exclimationAtEnd1 = oneSalt + ".!";

            String exAtEnd0 = encryptPassword(exclimationAtEnd);
            String exAtEnd1 = encryptPassword(exclimationAtEnd1);

            String zeroSaltPass= encryptPassword(zeroSalt);
            String oneSaltPass= encryptPassword(oneSalt);

            String periodBegin0 = "0." + current;
            String periodBegin1 = "1." + current;

            String perBegEn0 = encryptPassword(periodBegin0);
            String perBegEn1 = encryptPassword(periodBegin1);

            zeroSaltPass = "0:" + zeroSaltPass;
            oneSaltPass = "1:" + oneSaltPass;
            exAtEnd0 = "0:" + exAtEnd0;
            exAtEnd1 = "1:" + exAtEnd1;
            perBegEn0 = "0:" + perBegEn0;
            perBegEn1 = "1:" + perBegEn1;
            numEndOne = "1:" + numEndOne;
            numEndZero = "0:" + numEndOne;

            for(int j = 0; j<passwords.size();j++){
                if(zeroSaltPass.equals(passwords.get(j))){
                    System.out.println( "This is:" + passwords.get(j));
                    System.out.println(zeroSalt);
                    found++;
                }
                else if(perBegEn0.equals(passwords.get(j))){
                    System.out.println( "This is:" + passwords.get(j));
                    System.out.println(periodBegin0);
                    found++;
                }
                else if(num0exEn.equals(passwords.get(j))){
                    System.out.println( "This is:" + passwords.get(j));
                    System.out.println(num0ex);
                    found++;
                }
                else if(numBef0En.equals(passwords.get(j))){
                    System.out.println( "This is:" + passwords.get(j));
                    System.out.println(numBef0);
                    found++;
                }
                else if(numBef1En.equals(passwords.get(j))){
                    System.out.println( "This is:" + passwords.get(j));
                    System.out.println(numBef1);
                    found++;
                }
                else if(num1exEn.equals(passwords.get(j))){
                    System.out.println( "This is:" + passwords.get(j));
                    System.out.println(num1ex);
                    found++;
                }
                else if(perBegEn1.equals(passwords.get(j))){
                    System.out.println( "This is:" + passwords.get(j));
                    System.out.println(periodBegin1);
                    found++;
                }
                else if(oneSaltPass.equals(passwords.get(j))){
                    System.out.println("This is: " + passwords.get(j));
                    System.out.println(oneSalt);
                    found++;
                }
                else if(exAtEnd0.equals(passwords.get(j))){
                    System.out.println("This is: " + passwords.get(j));
                    System.out.println(exclimationAtEnd);
                    found++;
                }
                else if(exAtEnd1.equals(passwords.get(j))){
                    System.out.println("This is: " + passwords.get(j));
                    System.out.println(exclimationAtEnd1);
                    found++;
                }
                else if(numEndOne.equals(passwords.get(j))){
                    System.out.println("This is: " + passwords.get(j));
                    System.out.println(numberEndOneS);
                    found++;
                }
                else if(numEndZero.equals(passwords.get(j))){
                    System.out.println("This is: " + passwords.get(j));
                    System.out.println(numberEndZeroS);
                    found++;
                }
            }

        }
        //for(int i = 0; i<potentialPasswords.size();i++){
            found += concatWords(passwords,potentialPasswords, "pass");
       //}
        System.out.println("You found " + found + " passwords");
        System.out.println("BREAK");

    }

    public static void checkPassword(Scanner scan, String saltedPotentialPassword, String originalword){
        System.out.println("IN FUNCTION");
        while(scan.hasNextLine()) {
            String currentPassword = scan.nextLine();
            currentPassword = currentPassword.substring(2);

            byte[] currentPassBytes = currentPassword.getBytes(StandardCharsets.UTF_8);
            byte[] saltedPassBytes = saltedPotentialPassword.getBytes(StandardCharsets.UTF_8);

            if(Arrays.equals(currentPassBytes, saltedPassBytes)){
                System.out.println(originalword);
            }
        }
    }

    public static String encryptPassword(String toEncrypt) throws NoSuchAlgorithmException {
        MessageDigest md = MessageDigest.getInstance("SHA-256");
        md.update(toEncrypt.getBytes(StandardCharsets.UTF_8));
        byte[] toEncryptBytes = md.digest();
        return Base64.getEncoder().encodeToString(toEncryptBytes);
    }

    public static void checkNumbersBefore(ArrayList<String> passwords, ArrayList<String> check, String potential) throws NoSuchAlgorithmException {
        for(int i = 0; i<check.size();i++){
            for(int j = 0;j<10;j++){
                String testing = potential + j;

                String testingZeroSalt = encryptPassword("0" + testing);
                String testingOneSalt = encryptPassword("1"+testing);

                for(int x = 0; x<passwords.size(); x++){
                    if(testingOneSalt.equals(passwords.get(x))){
                        System.out.println("This is: " + passwords.get(x));
                        System.out.println(testing);
                        //counter++;
                    }
                    else if(testingZeroSalt.equals(passwords.get(x))){
                        System.out.println("This is: " + passwords.get(x));
                        System.out.println(testing);
                        //counter++;
                    }


                }

            }
        }
    }


    public static int concatWords(ArrayList<String> passwords, ArrayList<String> potentialPasswords, String current) throws NoSuchAlgorithmException {
        int counter = 0;
        for(int i = 0; i < potentialPasswords.size(); i++){
            String concatted = current + potentialPasswords.get(i);

            String zeroConcat = "0:" + concatted;
            String oneConcat = "1" + concatted;

            String oneCatEn = "1:"+encryptPassword(oneConcat);
            String zeroCatEn = "0:"+encryptPassword(zeroConcat);

            for(int x = 0; x<passwords.size(); x++){
                if(oneCatEn.equals(passwords.get(x))){
                    System.out.println("This is: " + passwords.get(x));
                    System.out.println(oneConcat);
                    counter++;
                }
                else if(zeroCatEn.equals(passwords.get(x))){
                    System.out.println("This is: " + passwords.get(x));
                    System.out.println(zeroConcat);
                    counter++;
                }
            }

        }
        return counter;
    }




}
