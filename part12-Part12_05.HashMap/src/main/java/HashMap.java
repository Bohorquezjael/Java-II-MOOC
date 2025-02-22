
public class HashMap<K, V> {

    private List<Pair<K, V>>[] pairs;
    private int freePosition;

    public HashMap() {
        this.pairs = new List[32];
        this.freePosition = 0;
    }

    public V get(K key) {
        int hash = Math.abs(key.hashCode() % this.pairs.length);
        if (this.pairs[hash] == null) {
            return null;
        }
        List<Pair<K, V>> pairsAtIndex = this.pairs[hash];
        for (int i = 0; i < pairsAtIndex.size(); i++) {
            Pair<K, V> get = pairsAtIndex.value(i);
            if (pairsAtIndex.value(i).getKey().equals(key)) {
                return pairsAtIndex.value(i).getValue();
            }
        }
        return null;
    }

    private List<Pair<K, V>> getListBasedOnKey(K key) {
        int hashValue = Math.abs(key.hashCode() % this.pairs.length);
        if (this.pairs[hashValue] == null) {
            this.pairs[hashValue] = new List<>();
        }

        return this.pairs[hashValue];
    }

    private int getIndexOfKey(List<Pair<K, V>> myList, K key) {
        for (int i = 0; i < myList.size(); i++) {
            if (myList.value(i).getKey().equals(key)) {
                return i;
            }
        }

        return -1;
    }

    public void add(K key, V value) {
        List<Pair<K, V>> valuesAtIndex = getListBasedOnKey(key);
        int index = getIndexOfKey(valuesAtIndex, key);

        if (index < 0) {
            valuesAtIndex.add(new Pair<>(key, value));
            this.freePosition++;
        } else {
            valuesAtIndex.value(index).setValue(value);
        }

        if (1.0 * this.freePosition / this.pairs.length > 0.75) {
            grow();
        }
    }

    private void grow() {
        List<Pair<K, V>>[] newArray = new List[this.pairs.length * 2];
        for (int i = 0; i < this.pairs.length; i++) {
            copy(newArray, i);
        }
        this.pairs = newArray;
    }

    private void copy(List<Pair<K, V>>[] newArray, int fromIdx) {
        for (int i = 0; i < this.pairs[fromIdx].size(); i++) {
            Pair<K, V> value = this.pairs[fromIdx].value(i);
            int hashValue = Math.abs(value.getKey().hashCode() % newArray.length);
            if (newArray[hashValue] == null) {
                newArray[hashValue] = new List<>();
            }
            newArray[hashValue].add(value);
        }
    }

    public V remove(K key) {
        List<Pair<K, V>> valuesAtIndex = getListBasedOnKey(key);
        if (valuesAtIndex.size() == 0) {
            return null;
        }

        int index = getIndexOfKey(valuesAtIndex, key);
        if (index < 0) {
            return null;
        }

        Pair<K, V> pair = valuesAtIndex.value(index);
        valuesAtIndex.remove(pair);
        return pair.getValue();
    }
}
