package intro.Task01_6;

public class NotePad {
    Note[] noteArray;

    NotePad() {
        this.noteArray = new Note[10];
    }

    NotePad(int initCapacity) {
        this.noteArray = new Note[initCapacity];
    }

    void addNote(int index, String text) {
        checkCapacity(index);
        Note note = new Note(index, text);
        noteArray[index] = note;
    }

    void removeNote(int index) {
        noteArray[index] = null;
    }

    void editNote(int index, String text) {
        if (index > noteArray.length - 1 || noteArray[index] == null) {
            throw new IndexOutOfBoundsException();
        }
        noteArray[index].setText(text);
    }

    void showAllNotes() {
        for (int i = 0; i < noteArray.length; i++) {
            if (noteArray[i] != null) {
                System.out.println(noteArray[i].getIndex() + " " + noteArray[i].getText());
            }
        }
    }

    void checkCapacity(int index) {
        if (index > noteArray.length - 1) {
            while (index > noteArray.length - 1) {
                Note[] copyArray = noteArray;
                noteArray = new Note[(int) (copyArray.length * 1.5)];
                for (int i = 0; i < copyArray.length; i++) {
                    noteArray[i] = copyArray[i];
                }
            }
        }
    }
}
