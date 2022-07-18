package ex.bridgelabzs;

public class MyLinkedHashMapTest {
	public void ParanoidFrequency() {
		String sentence="Paranoids are not paranoid because they are paranoid but"+
				 		"because they keep putting themselves deliberately into paranoid avoidable situations";
			MyLinkedHashMap <String,Integer> myLinkedHashMap=new MyLinkedHashMap<>();
			String[] words=sentence.toLowerCase().split(sentence);
			for(String word:words) {
				Integer value=myLinkedHashMap.get(word);
				if(value==null) {
					value=1;
				}else
					value=value+1;
				myLinkedHashMap.add(word,value);
				@SuppressWarnings("unused")
				int frequency=myLinkedHashMap.get("Paranoids");
				System.out.println(myLinkedHashMap);
			}
	}
}
