package dlist;

/**
 * Lista de objetos de tipo String 
 * @author isegura
 *
 */
public interface IList {

	public void addFirst(int v, float f);

	public void addLast(int v, float f);

	public void removeFirst();

	public void removeLast();
	
	
	public void insertAt(int index, int v, float f);
	
	public boolean isEmpty();

	public boolean contains(int v);

	public int getSize();

	public int getIndexOf(int v);

	public Integer getFirst();

	public Integer getLast();

	public Integer getVertexAt(int index);
	public Float getWeightAt(int index);

	public String toString();

	public void removeAll(int vertex);

	public void removeAt(int index);

}


