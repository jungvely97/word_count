import java.util.Scanner;

public class Word {

    public static void main(String [] args){
        String story = new String("hello java hello java world hello string hello hi");
        String word = new String();
        int count = 0;

        System.out.println(story);
        System.out.println("What do you want?");
        Scanner scan = new Scanner(System.in);
        word = scan.next();

        String[] array = story.split(" ");

        for(int i = 0; i < array.length; i++){
            if(word.equals(array[i])) count++;
        }

        if(count != 0)System.out.println(word + " : " + count);
        else System.out.println("No word");

    }

}

