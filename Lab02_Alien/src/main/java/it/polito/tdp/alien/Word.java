package it.polito.tdp.alien;

public class Word {
	private String alienWord;
	private String translation;
	
	/**
	 * Costruttore di Word con alienWord e translation
	 * @param alienWord
	 * @param translation
	 */
	public Word(String alienWord, String translation) {
		this.alienWord = alienWord;
		this.translation = translation;
	}


	public String getAlienWord() {
		return alienWord;
	}

	public void setAlienWord(String alienWord) {
		this.alienWord = alienWord;
	}


	public String getTranslation() {
		return translation;
	}


	public void setTranslation(String translation) {
		this.translation = translation;
	}


	/**
	 * Controlla se parola è già presente nel dizionario
	 * @param obj è la parola che deve essere controllata
	 * @return true se parola uguale e false se diversa
	 * 
	 */
	
	public boolean equals(Object obj) {
		String parola=(String) obj;
		if(parola.compareTo(alienWord)==0)
			return true;
		return false;
	}
	
	public boolean controllo(Word w) {
		
		return false;
	}

}
