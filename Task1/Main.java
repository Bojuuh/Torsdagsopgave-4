class Main{

	public static void main(String[] args){
			Team teamOne = new Team("Team A");
			teamOne.setRank(1);
			teamOne.addPlayer("Bob");
			teamOne.addPlayer("Steve");
			Team teamTwo = new Team("Team B");
			teamTwo.setRank(3);
			teamTwo.addPlayer("Knud");
			teamTwo.addPlayer("John");
			Team teamThree = new Team("Team C");
			teamThree.setRank(4);
			teamThree.addPlayer("Svend");
			teamThree.addPlayer("Jørgen");
			Team teamFour = new Team("Team D");
			teamFour.setRank(2);
			teamFour.addPlayer("Kim");
			teamFour.addPlayer("Harald");
			Team teamFive = new Team("Team E");
			teamFive.setRank(5);
			teamFive.addPlayer("Thomas");
			teamFive.addPlayer("Simon");
			Team teamSix = new Team("Team F");
			teamSix.setRank(6);
			teamSix.addPlayer("Kenneth");
			teamSix.addPlayer("Flemming");

			System.out.println(teamOne.toString());
			System.out.println(teamTwo.toString());
        	System.out.println(teamThree.toString());
        	System.out.println(teamFour.toString());
        	System.out.println(teamFive.toString());
        	System.out.println(teamSix.toString());
	}
}