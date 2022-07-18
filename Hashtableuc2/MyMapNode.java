package ex.bridgelabzs;

public class MyMapNode<K,V> {
	K key;
	V value;
	MyMapNode<K,V> next;
	
	public MyMapNode(K key,V value) {
		this.key=key;
		this.value=value;
		next=null;
	}
	public K getKey() {
		return key;
	}
	public void setKey(K key) {
		this.key=key;
	}
	public MyMapNode<K, V> getNext(){
		return next;
	}
	public void setNext(MyMapNode<K, V> next) {
		this.next=next;
	}
	public V getValue() {
		return this.value;
	}
	public void setValue(V value) {
		this.value=value;
	}
}
