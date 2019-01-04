import me.artiveloper.learning.HashTable;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class HashTableTest {

    @Test
    public void name() {
        HashTable hashtable = new HashTable(3);
        hashtable.put("sung", "she is beautiful");
        hashtable.put("jin", "she is a model");
        hashtable.put("hee", "she is an angel");
        hashtable.put("min", "she is cute");

        assertThat(hashtable.get("sung")).isEqualTo("she is beautiful");
        assertThat(hashtable.get("jin")).isEqualTo("she is a model");
        assertThat(hashtable.get("hee")).isEqualTo("she is an angel");
        assertThat(hashtable.get("min")).isEqualTo("she is cute");
        assertThat(hashtable.get("jae")).isEqualTo("Not Found");
    }

}