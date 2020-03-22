package it.polito.tdp.alien;

import java.util.LinkedList;
import java.util.List;

public class AlienDictionary {
	
	List<Word> listaParole;
	
	
	
	public AlienDictionary() {
		listaParole=new LinkedList<Word>();
	}



	public void addWord(String alienWord, String translation) {
		Word temp=new Word(alienWord,translation);
		for(Word w:listaParole) {
			if(w.equals(temp)) {
				w.setTranslation(translation);
				return;
			}		
		}
		listaParole.add(temp);
		return;
	}
	/**
	 * Il metodo viene chiamato dal Controller per la traduzione della parola alienWord passata come parametro.
	 *  @param alienWord 
	 *  @return la parola tradotta, altrimenti {@code null} se alienWord non è presente nel dizionario.
	 */
	public String translateWord(String alienWord) {
		Word temp=new Word(alienWord,null);
		for(Word w:listaParole) {
			if(w.equals(temp)) {
				return w.getTranslation();
			}		
		}
		return null;
	}

}
