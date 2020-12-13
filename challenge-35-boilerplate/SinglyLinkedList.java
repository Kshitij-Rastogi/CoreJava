public class SinglyLinkedList {
    Node head;

    public SinglyLinkedList insert(SinglyLinkedList list, String data){
        //create a new node with given data
        Node newNode = new Node(data);
        newNode.next = null;

        //if the LinkedList is empty
        //then I will make a new Node as head
        if(list.head == null){
            list.head = newNode;
        }

        else{
            //else traverse the list until last element arrives
            Node last = list.head;
            while(last.next != null){
                last = last.next;
            }

            //Now insert the value
            last.next = newNode;
        }
        return list;
    }


    public int printList(SinglyLinkedList list){
        Node currNode = list.head;
        System.out.println("The List Of Words Are: ");
        int count=0;
        //Traverse Though the LinkedList
        while(currNode != null){
            //print the data of current Node
            System.out.println(currNode.data);
            count++;
            currNode = currNode.next;
        }
        return count;
    }


    public void sortWord(SinglyLinkedList list){
        Node current = list.head;
        Node index = null;

        String temp;
        if(list.head == null){
            return;
        }
        else{
            while(current != null){
                index = current.next;

                while(index != null){
                    if(current.data.compareTo(index.data) > 0){
                        temp = current.data;
                        current.data = index.data;
                        index.data = temp;
                    }
                    index = index.next;
                }
                current = current.next;
            }
        }
    }


    public Word[] Occurance(SinglyLinkedList list, int countRows){
        Word wordList[] = new Word[countRows];
        Node current = list.head;
        int pointer=0;

        //Traverse though the Linked List
        while(current != null){
            Word w = new Word();

            //pushing words and occurance in a Word Object
            w.setWord(current.data);
            w.setNumberOfOccurance(getOccurnce(list, current.data)); 

            wordList[pointer] = w;
            pointer++;

            current = current.next;
        }
        return wordList;
    }

    public int getOccurnce(SinglyLinkedList list, String searchFor){
        Node curr = list.head;
        int count=0;
        while(curr != null){
            if(curr.data.equals(searchFor)){
                count++;
            }
            curr = curr.next;
        }
        return count;
    }


    public void showWordList(Word[] wordList){
        System.out.println();
        System.out.println("The Words and Occurance are shown below");
        for(int i=0; i<wordList.length-1; i++){
            if(wordList[i].getWord().equals(wordList[i+1].getWord())){
                continue;
            }
            else{
                System.out.println(wordList[i].getWord() + ":  " + wordList[i].getNumberOfOccurance());
            }
        }
        System.out.println(wordList[wordList.length-1].getWord() + ":  " + wordList[wordList.length-1].getNumberOfOccurance());
        System.out.println(System.currentTimeMillis());
    }


    public void reverseWordList(Word[] wordList){
        System.out.println();
        System.out.println("The Reverse Order of Words and Occurance are shown below");
        for(int i=wordList.length-1; i>0; i--){
            if(wordList[i].getWord().equals(wordList[i-1].getWord())){
                continue;
            }
            else{
                System.out.println(wordList[i].getWord() + ":  " + wordList[i].getNumberOfOccurance());
            }
        }
        System.out.println(wordList[0].getWord() + ":  " + wordList[0].getNumberOfOccurance());
    }


    public void showFrequentWords(Word[] wordList){
        System.out.println();
        System.out.println("The Frequency wise Words and Occurance are shown below");
        int highestFrequency = 0;
        for(int i=0; i<wordList.length; i++){
            if(wordList[i].getNumberOfOccurance() > highestFrequency){
                highestFrequency = wordList[i].getNumberOfOccurance();
            }
        }

        while(highestFrequency>0){
            int i=0;
            while(i<wordList.length){
                if(wordList[i].getNumberOfOccurance() == highestFrequency){
                    System.out.println(wordList[i].getWord() + ":  " + wordList[i].getNumberOfOccurance());
                }
                i++;
            }
            highestFrequency--;
        }
    }

}