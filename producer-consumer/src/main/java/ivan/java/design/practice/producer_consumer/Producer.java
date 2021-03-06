package ivan.java.design.practice.producer_consumer;

public class Producer {

	private final ItemQueue queue;

	private final String name;

	private int itemId;

	public Producer(String name, ItemQueue queue) {
		this.name = name;
		this.queue = queue;
	}

	public void produce() throws InterruptedException {

		Item item = new Item(name, itemId++);
		queue.put(item);

		// Random random = new Random();
		// Thread.sleep(random.nextInt(2000));
		Thread.sleep(5);
	}
}
