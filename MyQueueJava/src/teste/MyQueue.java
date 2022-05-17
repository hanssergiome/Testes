package teste;

import java.util.PriorityQueue;

public class MyQueue {
	
	public class Main {
		public static void main(String[] args)
		{
			PriorityQueue<Integer> queue = new PriorityQueue<>();
			queue.add(4);
			queue.add(3);
			queue.add(2);
			queue.add(1);

			while (queue.isEmpty() == false) {
				System.out.printf("%d", queue.remove());
			}
		}
	}
	
}
