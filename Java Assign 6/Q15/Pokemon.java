public class Pokemon implements Comparable<Pokemon> {

    String name, type;
    int level;

    Pokemon(String name, String type, int level)
    {
        this.name = name;
        this.type = type;
        this.level = level;
    }

    public int compareTo(Pokemon p)
    {
        if(p.level>this.level)
        {
            return -1;
        }
        else if(p.level<this.level)
        {
            return 1;
        }
        else
        {
            return 0;
        }
    }
}
