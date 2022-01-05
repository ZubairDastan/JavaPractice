package C3;

import java.util.Scanner;

// A program to find the number of notes from input amount in given array
public class NoteFinder {
    public static void main(String[] args) {
        int totalAmount, totalNotes = 0;
        int[] notes = {1000, 500, 100, 50, 20, 10, 5, 2};
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the a amount:");
        totalAmount = scanner.nextInt();

        NoteCounter noteCounter = new NoteCounter();
        noteCounter.countNote(totalAmount, notes);
    }
}

class NoteCounter {
    public void countNote(int totalAmount, int[] notes) {
        for (int i = 0; i < notes.length; i++) {
            int count = totalAmount / notes[i];
            totalAmount = totalAmount % notes[i];
            if (count != 0) {
                System.out.println(notes[i] + " taka note " + count + " piece");
            }
        }
    }
}
