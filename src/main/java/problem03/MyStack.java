package problem03;

import java.nio.Buffer;

public class MyStack {
	private String[] buffer;
	private int index=-1;
	private String temp="";
	private int size;
	
	public MyStack( int size ) {
		this.buffer = new String[size];
		this.size=size;
	}
	
	public void push(String item) {
		index++;
		if(index==this.size) {
			size();
		}
		this.buffer[index]=item;
	}

	public String pop() {
		if(index==-1)
			return null;
		else {
			temp = this.buffer[index];
			index--;
			return temp;
		}
	}

	public boolean isEmpty() {
		if(index==-1)
			return true;
		else
			return false;
	}
	
	public int size() {
		size++;
		String temparray[] = new String[size];
		for(int i=0; i<size-1; i++) {
			temparray[i] = this.buffer[i];
		}
		this.buffer = temparray;
		return 0;
	}
}