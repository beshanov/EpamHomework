package Task01_6;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        NotePad notePad = new NotePad();

        System.out.println("Select the action:" +
                "\nwr - to write Note;" +
                "\nrm - to remove Note;" +
                "\ned - to edit Note;" +
                "\nsh - to show all Notes;");

        for(;;) {
            String s = (new Scanner(System.in)).nextLine();
            switch (s){

                case "wr":
                    System.out.println("Please, enter index and text to create new Note:");
                    try {
                        notePad.addNote(new Scanner(System.in).nextInt(), new Scanner(System.in).nextLine());
                    } catch(InputMismatchException e){
                        System.out.println("Unacceptable index value.");
                    }
                    break;

                case "rm":
                    System.out.println("Please, enter index to remove Note:");
                    try {
                        notePad.removeNote(new Scanner(System.in).nextInt());
                    } catch (InputMismatchException e){
                        System.out.println("Unacceptable index value.");
                    }
                    break;

                case "ed":
                    System.out.println("Please, enter index and text to edit Note:");
                    try {
                        notePad.editNote(new Scanner(System.in).nextInt(), new Scanner(System.in).nextLine());
                    } catch (InputMismatchException e){
                        System.out.println("Unacceptable index value.");
                    } catch (IndexOutOfBoundsException e){
                        System.out.println("There is no Note with this index");
                    }
                    break;

                case "sh":
                    notePad.showAllNotes();
                    break;

                default:
                    System.out.println("command not found");
            }
        }








        /*NotePad notePad = new NotePad(3);
        System.out.println(notePad.noteArray.length);
        notePad.addNote(0, "aaa");
        notePad.addNote(1, "bbb");
        notePad.addNote(2, "ccc");
        notePad.addNote(6, "ddd");

        notePad.removeNote(2);
        //notebook.deleteNote(3);


        for (int i = 0; i < notePad.noteArray.length; i++) {
            if (notePad.noteArray[i] != null) {
                System.out.println(notePad.noteArray[i].getText() + " " + notePad.noteArray[i].getIndex());
            }
        }

        System.out.println(notePad.noteArray.length);*/
    }
}

