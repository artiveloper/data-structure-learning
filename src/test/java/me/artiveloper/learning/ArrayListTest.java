package me.artiveloper.learning;

import org.junit.Test;

import static org.assertj.core.api.Java6Assertions.assertThat;

public class ArrayListTest {

    @Test
    public void test() throws Exception {
        ArrayList arrayList = new ArrayList();
        arrayList.add("0");
        arrayList.add("1");
        arrayList.add("2");
        arrayList.add("3");
        arrayList.add("4");
        arrayList.add("5");
        arrayList.add("6");
        arrayList.add("7");
        arrayList.add("8");
        arrayList.add("9");

        assertThat(arrayList.get(5)).isEqualTo("5");
        arrayList.remove(5);
        assertThat(arrayList.get(5)).isEqualTo("6");
    }

}