package ex.bridgelabzs;

public class MyHashMapTest {
	public void givenasentencewordatAddedtolist_Shouldreturnwordfrequency() {
		String sentence="To be or not to be";
		MyHashMap<String,Integer> myHashMap=new MyHashMap<>();
		String[] words=sentence.toLowerCase().split(sentence);
		for(String word: words) {
			Integer value=myHashMap.get(word);
			if(value==null) {
				value=1;
			}else
				value=value+1;
			(myHashMap).add(word,value);
			@SuppressWarnings("unused")
			int frequency=myHashMap.get("to");
			System.out.println(myHashMap);
		}
	}
}
