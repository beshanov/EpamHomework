package Task01_6;

public class Notebook {
    Note[] notes = new Note[0];

    void addNote(Note newNote){
        Note[] newNoteArray = new Note[notes.length+1];
        for(int i = 0; i < notes.length; i++){
            newNoteArray[i] = notes[i];
        }
        newNoteArray[newNoteArray.length-1] = newNote;
        this.notes = newNoteArray;

        for(Note note : notes){
            System.out.println(note.text);
        }
    }

}
