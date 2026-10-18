package Trie;

public class Main{
	public static void main(String args[])
	{
		Trie t=new Trie();
		t.insert("API");
		t.insert("APIS");
		t.insert("APISE");
		t.insert("APIRT");
		t.insert("APIUI");
		t.search("APIU");
		t.delete("APISE");
		t.search("APISE");
		
	}
}