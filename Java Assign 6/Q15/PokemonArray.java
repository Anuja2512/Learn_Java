import java.util.*;

public class PokemonArray {

    public static void main(String[] args) {
        
        Pokemon[] pokemons = new Pokemon[6];

        //add
        String[] names = {"Bulbasaur", "Charmander", "Squirtle", "Pikachu", "Pigeotto", "Rattata"};
        String[] types = {"Grass", "Fire", "Water", "Electric", "Flying", "Poison"};
        int[] levels = {3, 4, 3, 5, 7, 2};
        for(int i=0; i<6; i++)
        {
            pokemons[i] = new Pokemon(names[i], types[i], levels[i]);
        }

        //delete
        //lets delete 5th element
        pokemons[4] = null;

        //modify
        //lets update 5th element
        Pokemon p2 = new Pokemon("Spearow", "Flying", 6);
        pokemons[4] = p2;

        //display
        System.out.println("All Elements:");
        for(Pokemon p: pokemons)
        {
            System.out.println(p.name + " " + p.type + " " + String.valueOf(p.level));
        }
        System.out.println();

        //sort
        //we have used the comparable interface to compare levels
        Arrays.sort(pokemons);

        //Iterator
        System.out.println("Sorted Elements:");
        for(int i=0; i<pokemons.length; i++)
        {
            System.out.println(pokemons[i].name + " " + pokemons[i].type + " " + String.valueOf(pokemons[i].level));
        }
        System.out.println();

        //search
        //let's search for a pokemon
        Pokemon p3 = new Pokemon("Spearow", "Flying", 6);
        int loc = Arrays.binarySearch(pokemons, p3);
        System.out.println("Flying Spearow of level 6 located at index "+String.valueOf(loc));

        //lets create another array same as 1st array
        Pokemon[] pokemons2 = new Pokemon[6];
        String[] names2 = {"Bulbasaur", "Charmander", "Squirtle", "Pikachu", "Pigeotto", "Rattata"};
        String[] types2 = {"Grass", "Fire", "Water", "Electric", "Flying", "Poison"};
        int[] levels2 = {3, 4, 3, 5, 7, 2};
        for(int i=0; i<6; i++)
        {
            pokemons2[i] = new Pokemon(names2[i], types2[i], levels2[i]);
        }

        if(pokemons.equals(pokemons2))
        {
            System.out.println("\nBoth Arrays are Equal\n");
        }
        else
        {
            System.out.println("\nArrays are not Equal\n");
        }

        //create subarray of elements index divisible by 2 or 7
        ArrayList<Pokemon> subPokemons = new ArrayList<Pokemon>();
        for(int i=0; i<6; i++)
        {
            if(i%2==0 || i%7==0)
            {
                subPokemons.add(pokemons[i]);
            }
        }

        Pokemon[] subPokemonsArray = new Pokemon[subPokemons.size()];
        int c=0;
        for(Pokemon p: subPokemons)
        {
            subPokemonsArray[c] = p;
            c++;
        }

        //display subarray
        System.out.println("Subarray Elements:");
        for(Pokemon p: subPokemonsArray)
        {
            System.out.println(p.name + " " + p.type + " " + String.valueOf(p.level));
        }
        System.out.println();
    }
}
