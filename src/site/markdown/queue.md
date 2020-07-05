#Was ist eine Queue?
Eine Queue gehört zu den Collections. Es bedeutet auf Deutsch Warteschlange und es wird das fifo Prinzip angewendet. (First in first out). Das Erste Objekt was zur Queue hinzugefügt wird, ist auch das erste was ausgegeben wird.

#Wie kann man es Testen?

Ein kleiner Test Case zusammen geschrieben.
```java 
@Test
public void test() {
    //Given
    String animals[] = {"cat","dog","pony","horse","cheetah"};
    Queue<String> queue = new LinkedList<String>();
    Collections.addAll(queue, animals);

    //When
    queue.add("tiger");

    //Then
    assertThat(queue, hasSize(6));
    assertEquals("tiger",((LinkedList<String>) queue).getLast());
}
```