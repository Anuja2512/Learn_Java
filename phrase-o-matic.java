class phrase {
    public static void main(String[] args) {
        String[] listOne = {"Potato" , "Supercalifragilisticexpialidocious", "Bagel", "Unicorn", "Doppelganger","Beanbogs", "Widdershins"};
        String[] listTwo = {"working", "eating", "laughing", "sliping", "hiting"};
        String[] listThree = {"on a rock", "near a beach", "in a city", "near a school", "in a church"};

        int oneLen = listOne.length;
        int twoLen = listTwo.length;
        int threeLen = listThree.length;

        int oneRand = (int) Math.random() * oneLen;
        int twoRand = (int) Math.random() * twoLen;
        int threeRand = (int) Math.random() * threeLen;
        String phrase = listOne[oneRand] + " " + listTwo[twoRand] + " " + listThree[threeRand];
        System.out.println("What we need is a " + phrase);

    }    
}
