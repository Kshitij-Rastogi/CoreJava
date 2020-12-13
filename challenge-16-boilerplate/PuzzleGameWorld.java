import java.util.*;
public class PuzzleGameWorld {
    public static void main(String agrs[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of words:");
        int numberOfWords = sc.nextInt();
        System.out.println();
        System.out.println("Enter the words");
        String[] words = new String[numberOfWords];
        for(int i=0;i<numberOfWords; i++){
            words[i] = sc.next();
        }
        String indexOfShortestWord = shortestWord(words);
        System.out.println();
        System.out.println("Enter a word to search:");
        String wordToSearch = sc.next();
        boolean findWord = findWord(wordToSearch, words);

        String[] sortedWords = sortWords(words);
        String[] palindrome = checkPallindrome(words);
        printOutput(words, indexOfShortestWord, findWord, sortedWords, palindrome);
    }

    public static String shortestWord(String[] words){
        int shortest = 100;
        int index = 0;
        for(int i=0; i<words.length; i++){
            if(words[i].length() < shortest){
                shortest = words[i].length();
                index = i;
            }
        }
        return words[index];
    }

    public static boolean findWord(String wordToSearch, String[] words){
        for(String word: words){
            if(wordToSearch.equals(word)){
                return true;
            }
        }
        return false;
    }

    public static String[] sortWords(String[] words){
        String[] sortedWords = words;
        String temp;
        for(int i=0; i<sortedWords.length; i++){
            for(int j=0; j<sortedWords.length; j++){
                if(sortedWords[i].compareTo(sortedWords[j]) < 0 ){
                    temp = words[i];
                    sortedWords[i] = sortedWords[j];
                    sortedWords[j] = temp;
                }
            }
        }
        return sortedWords;
    }

    public static String[] checkPallindrome(String[] words){
        int point = 0;
        String[] pallindrome = new String[words.length];
        for(String word: words){
            int i=0, j=word.length()-1, count=0;
            while(i<j){
                if(word.charAt(i) != word.charAt(j)){
                    break;
                }
                count++;
                i++;
                j--;
            }

            if(count == word.length()/2){
                point++;
                pallindrome[point] = word;
            }
        }
        return pallindrome;

    }

    public static void printOutput(String[] words, String indexOfShortestWord, boolean findWord, String[] sortedWords, String[] palindrome){
        System.out.println();
        System.out.println("The shortest word is : " + indexOfShortestWord);
        System.out.println();
        if(findWord){
            System.out.println("The word is present in the list");
        }
        else{
            System.out.println("The word is not present in the list");
        }
        System.out.println();
        System.out.println("The sorted array is:");
        for(String word: sortedWords){
            System.out.println(word);
        }
        System.out.println();
        int countPalindrome = 0;
        for(int i=0;i<palindrome.length;i++){
            if(palindrome[i] != null){
                countPalindrome++;
            }
        }
        System.out.println("The number of palindromes in the list : " + countPalindrome);
        for(int i=0;i<palindrome.length;i++){
            if(palindrome[i] != null){
                System.out.println(palindrome[i]);;
            }
        }
    }
}
