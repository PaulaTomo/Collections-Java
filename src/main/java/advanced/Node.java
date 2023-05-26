package advanced;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

import java.util.concurrent.atomic.AtomicInteger;


@ToString
@Getter
@EqualsAndHashCode
public class Node <T> {
private final static AtomicInteger nodeSequence = new AtomicInteger(0);
    private final int id;
    private final T data;

    private  Node<T> nextNode;

    public Node(T data){
        this.id = nodeSequence.incrementAndGet();
        this.data = data;

    }
    public static void resetSequence(){
        nodeSequence.set(0);
    }
    public Node setNextNode(Node nextNode){
        this.nextNode = nextNode;
        return this.nextNode;
    }
}

