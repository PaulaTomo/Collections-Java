package advanced;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class NodeTest {
    private Node <Integer>nodeTwo;
    private Node <Integer> nodeOne;
    private Node <Integer> nodeThree;

    private Node <String> nodeFour;

    @BeforeEach
    void setUp() {
        this.nodeOne = new Node<>(1);
        this.nodeTwo = new Node<>(2);
        this.nodeThree = new Node<>(3);

        nodeOne.setNextNode(nodeTwo)
                .setNextNode(nodeThree);

    }

    @AfterEach
    void tearDown() {
        Node.resetSequence();
    }

    @Test
    void testSequence() {
        assertEquals(1, this.nodeOne.getId());
        assertEquals(2, this.nodeTwo.getId());
        assertEquals(3, this.nodeThree.getId());

    }

    @Test
    void testData(){
        assertNotEquals(nodeOne.getData(), nodeTwo.getData());
    }
    @Test
    void nodeChain() {
assertEquals(nodeTwo,nodeOne.getNextNode());
assertEquals(nodeThree,nodeOne.getNextNode().getNextNode());
    }
}
