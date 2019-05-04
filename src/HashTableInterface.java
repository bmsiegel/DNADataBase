
public interface HashTableInterface<K, V> {

    public long sfold(K s, int M);


    public int getLength();


    public void remove(V remove);


    public void insert(V insert, int index);


    public boolean isOccupied(long hashIndex);


    public DNAEntry get(int index);


    public String toString();

}
