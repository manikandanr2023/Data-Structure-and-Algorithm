package Trie;
public class Trie{
	TrieNode root;
	public Trie() {
		root=new TrieNode();
		System.out.println("Trie Node has been created");
	}
	public void insert(String value)
	{
		TrieNode current=root;
		for(int i=0;i<value.length();i++)
		{
			char ch=value.charAt(i);
			TrieNode temp=current.children.get(ch);
			if(temp==null)
			{
				temp=new TrieNode();
				current.children.put(ch,temp);
			}
			current=temp;
		}
		current.endOfTrie=true;
		System.out.println("Value "+value+" succussfully Inserted");
		
	}
	public boolean search(String value)
	{
		TrieNode current=root;
		for(int i=0;i<value.length();i++)
		{
			char ch=value.charAt(i);
			TrieNode temp=current.children.get(ch);
			if(temp==null)
			{
				System.out.println(value+" value does not exist");
				return false;
			}
			current=temp;
		}
			if(current.endOfTrie==true)
			{
				System.out.println("Value you have entered exist "+ value);
				return true;
			}
			else {
				System.out.println("Value you have entered is a prefix "+value);
			}

			return current.endOfTrie;
	}
	public void delete(String value)
	{
		if(search(value)==true)
		{
			delete(root,value,0);
		}
	}
	
	public boolean delete(TrieNode parent,String value,int index)
	{
		char ch=value.charAt(index);
		TrieNode current=parent.children.get(ch);
		boolean canDelete;
		if(current.children.size()>1)
		{
			delete(current,value,index+1);
			return false;
		}
		if(index==value.length()-1)
		{
			if(current.children.size()>=1)
			{
				current.endOfTrie=false;
				return false;
			}
			else {
				parent.children.remove(ch);
				return true;
				
			}
		}
		if(current.endOfTrie==true)
		{
			delete(current,value,index+1);
			return false;
		}
		canDelete=delete(current,value,index+1);
		if(canDelete==true)
		{
			parent.children.remove(ch);
			return true;
		}
		else {
			
			return false;
		}
		
	}
}



