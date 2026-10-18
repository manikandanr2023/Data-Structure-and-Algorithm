package Trie;
import java.util.*;
public class TrieNode{
	boolean endOfTrie;
	Map<Character,TrieNode> children;
	public TrieNode() {
		endOfTrie=false;
		children=new HashMap<>();
	}
}