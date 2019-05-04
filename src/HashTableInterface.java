
/**
 * Generic interface for HashTable
 * 
 * @author Brady Siegel (bmsiegel@vt.edu)
 * @version 2019-05-04
 * @param <K>
 *            HashTable hashing generic
 * @param <V>
 *            HashTable data entry type
 */
public interface HashTableInterface<K, V> {

    /**
     * @param s
     *            hashing query
     * @param m
     *            length of hashtable
     * @return index of home position
     */
    public long sfold(K s, int m);


    /**
     * @return length of hashtable
     */
    public int getLength();


    /**
     * @param remove
     *            object to be removed
     */
    public void remove(V remove);


    /**
     * @param insert
     *            object to be inserted
     * @param index
     *            index to insert object
     */
    public void insert(V insert, int index);


    /**
     * @param hashIndex
     *            index to check occupation
     * @return true if occupied, false if not
     */
    public boolean isOccupied(long hashIndex);


    /**
     * @param index
     *            index to get data from
     * @return data at given index
     */
    public V get(int index);


    /**
     * @return string representation of hashtable
     */
    public String toString();

}
