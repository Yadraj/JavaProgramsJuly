import org.apache.commons.lang3.RandomStringUtils;

import java.util.Random;


public class RandomNumbersAndStrings {

    public  static void main (String args[]){

        System.out.println(RandomStringUtils.randomNumeric(10));
        System.out.println(RandomStringUtils.randomAlphabetic(10));


        Random random = new Random();
        System.out.println(random.nextInt(100));
        System.out.println(random.nextDouble());

        System.out.println(Math.random());
    }
}
