package Task01_6;

public class Notebook {
    Note[] noteArray;
    Notebook(){
        this.noteArray = new Note[0];
    }

    void addNote(Note newNote) {
        Note[] newArray = new Note[noteArray.length + 1];
        for (int i = 0; i < noteArray.length; i++) {
            newArray[i] = noteArray[i];
        }
        newArray[newArray.length - 1] = newNote;
        this.noteArray = newArray;
    }

    void deleteNote(int index){
        Note[] newArray = new Note[noteArray.length];
        for(int i = 0; i < noteArray.length; i++){
            if(i != index)
                newArray[i] = noteArray[i];
        }
        this.noteArray = new Note[0];
        for(Note note: newArray){
            if(note != null){
                addNote(note);
            }
        }
    }

    public static void main(String[] args) {
        Notebook notebook = new Notebook();

        Note note1 = new Note("Some text");
        Note note2 = new Note("New text");

        notebook.addNote(note1);
        notebook.addNote(note1);
        notebook.addNote(note2);

        notebook.deleteNote(1);
        System.out.println(notebook.noteArray.length);

        for(Note note: notebook.noteArray){
            System.out.println(note.getText());
        }
    }
}
