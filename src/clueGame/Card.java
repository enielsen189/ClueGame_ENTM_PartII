package clueGame;

public class Card {
	private String cardName;
	private CardType type;
	
	public boolean equals(){
		
		return false;
	}
	
	public String getName() {
		return cardName;
	}

	public Card(String cardName, CardType type) {
		super();
		this.cardName = cardName;
		this.type = type;
	}
	
	public Card() {
		super();
	}
}
