package graphs;


import queue.SQueue;
import dlist.DListVertex;

public class GraphLA implements IGraph {
	
	int numVertices;
	int maxVertices;
	
	DListVertex[] vertices;
	boolean directed;
	
	
	
	public GraphLA(int n, int max, boolean d) {
		if (max<=0) 
			throw new IllegalArgumentException("Negative maximum number of vertices!!!");
		if (n<=0) 
			throw new IllegalArgumentException("Negative number of vertices!!!.");
		if (n>max) 
			throw new IllegalArgumentException("number of vertices can never "
					+ "be greater than the maximum.");
		
		maxVertices=max;
		vertices=new DListVertex[maxVertices];
		numVertices=n;
		//creates each list
		for (int i=0; i<numVertices;i++) {
			vertices[i]=new DListVertex(); 
		}
		directed=d;
	}
	
	public void addVertex() {
		if (numVertices==maxVertices) {
			System.out.println("Cannot add new vertices!!!");
			return;
		}
		numVertices++;
		vertices[numVertices-1]=new DListVertex(); 
	}
		
	@Override
	public int sizeVertices() {
		return numVertices;
	}

	@Override
	public int sizeEdges() {
		int numEdges=0;
		//complete your code
		return numEdges;
	}

	
	public int getOutDegree(int i) {
		if (!checkVertex(i)) 
			throw new IllegalArgumentException("Nonexistent vertex  " + i);
		
		int outdegree=0;

		//complete your code
		return outdegree;
	}
	
	public int getInDegree(int i) {
		if (!checkVertex(i)) 
			throw new IllegalArgumentException("Nonexistent vertex  " + i);
		int indegree=0;
		//complete your code
		return indegree;
	}

	
	
	
	
	@Override
	public int getDegree(int i) {
		int degree=0;
		//complete your code

		return degree;
	}
	
	@Override
	public void addEdge(int i, int j) {
		//by default, we add an edge with value 0;
		addEdge(i,j,0);
	}
	//check if i is a right vertex
	private boolean checkVertex(int i) {
		if (i>=0 && i<numVertices) return true;
		else return false;
	}
		
	public void addEdge(int i, int j, float w) {
		if (!checkVertex(i)) 
			throw new IllegalArgumentException("Nonexistent vertex  " + i);
		if (!checkVertex(j)) 
			throw new IllegalArgumentException("Nonexistent vertex  " + j);
		
		//complete your code

	}

	
	
	public void removeEdge(int i, int j) {
		if (!checkVertex(i)) 
			throw new IllegalArgumentException("Nonexistent vertex  " + i);
		if (!checkVertex(j)) 
			throw new IllegalArgumentException("Nonexistent vertex  " + j);
		
		//complete your code

	}

	@Override
	public boolean isEdge(int i, int j) {
		if (!checkVertex(i)) 
			throw new IllegalArgumentException("Nonexistent vertex  " + i);
		if (!checkVertex(j)) 
			throw new IllegalArgumentException("Nonexistent vertex  " + j);
		
		//complete your code
		return false;
	}

	@Override
	public Float getWeightEdge(int i, int j) {
		if (!checkVertex(i)) throw new IllegalArgumentException("Nonexistent vertex  " + i);
		if (!checkVertex(j)) throw new IllegalArgumentException("Nonexistent vertex  " + j);
		Float result=null;
		//complete your code

		return result;
	}

	@Override
	public void show() {

		for (int i=0; i<numVertices; i++) {
			if (vertices[i]!=null) {
				System.out.println("adjacentes vertices for vertex  " + i + ": " + vertices[i].toString() );
			}
		}
		
	}

	public int[] getAdjacents(int i) {
		if (!checkVertex(i)) 
			throw new IllegalArgumentException("Nonexistent vertex  " + i);
		int[] adjVertices=null;
		//complete your code

		return adjVertices;
	}
	
	public void breadth() {
		System.out.println("breadth traverse of the graph:");
		
		//to mark when a vertex has already been shown
		boolean visited[]=new boolean[numVertices];

		//we have to traverse all vertices
		for (int i=0;i<numVertices;i++) {
			if (!visited[i]) { //we only process the non-visited vertex
				breadth(i,visited);
			}
		}
		System.out.println();

	}
	
	

	//breadth order for the vertex i 
	protected void breadth(int i, boolean[] visited) {
		//complete your code
	}
	
	public void depth() {
		System.out.println("depth traverse of the graph:");
		//to mark when a vertex has already been shown
		boolean visited[]=new boolean[numVertices];
		//we have to traverse all vertices
		for (int i=0;i<numVertices;i++) {
			if (!visited[i]) depth(i,visited);
		}
		System.out.println();

	}

	protected void depth(int i,boolean[] visited) {
		//complete your code
	}
	

}
