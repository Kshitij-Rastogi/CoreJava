import java.util.Scanner;

public class DoublyLinkedList {
    Node head;
    public void insert(MusicImage data){
        Node newNode = new Node(data);
        // newNode.next = null;
        if(head == null){
            head = newNode;
            head.prev = null;
        }
        else{
            Node last = head;
            while(last.next != null){
                last = last.next;
            }
            last.next = newNode;
            newNode.prev = last;
            newNode.next = null;
        }
    }

    public void forwardTraverse(){
        Node currNode = head;
        System.out.println("Forward List : ");
        while(currNode!=null){
            String format = "|%1$-6s|%2$-40s|%3$-40s|%4$-10s|%5$-5s|%6$-4s|\n";
            System.out.format(format, currNode.data.getReleasedAs(), currNode.data.getArtist(), currNode.data.getSongName(), currNode.data.getGenre(), currNode.data.getYearOfRelease(), currNode.data.getNumberOfSongs(), currNode.data.getDuration());
            currNode = currNode.next;
        }
    }

    public void backwardTraverse(){
        Node currNode = head;
        while(currNode.next!=null){
            currNode = currNode.next;
        }
        Node last = currNode;
        System.out.println("\n");
        System.out.println("Reverse List : ");
        while(last!=null){
            String format = "|%1$-6s|%2$-40s|%3$-40s|%4$-10s|%5$-5s|%6$-4s|\n";
            System.out.format(format, last.data.getReleasedAs(), last.data.getArtist(), last.data.getSongName(), last.data.getGenre(), last.data.getYearOfRelease(), last.data.getNumberOfSongs(), last.data.getDuration());
            last = last.prev;
        }
    }

    public void displayPreferred(Scanner sc){
        System.out.println();
        System.out.println("Enter Artist/Gener/AlbumName/SongName of your choice: ");
        String input = sc.next();
        System.out.println(input);
        Node currNode = head;
        while(currNode != null){
            String format = "|%1$-6s|%2$-40s|%3$-40s|%4$-10s|%5$-5s|%6$-4s|\n";
            if(currNode.data.getArtist().equals(input) || currNode.data.getGenre().equals(input) || currNode.data.getSongName().equals(input)){
                System.out.format(format, currNode.data.getReleasedAs(), currNode.data.getArtist(), currNode.data.getSongName(), currNode.data.getGenre(), currNode.data.getYearOfRelease(), currNode.data.getNumberOfSongs(), currNode.data.getDuration());
            }
            currNode = currNode.next;
        }
    }

}
