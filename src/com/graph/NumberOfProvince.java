package com.graph;

public class NumberOfProvince {

	    public static void dfs(int [][]adj, int[] visit, int v){
	        for(int j=0; j<adj.length; j++){
	            if(adj[v][j]==1 && visit[j]==0){
	                visit[j]=1;
	                dfs(adj,visit,j);
	            }
	        }
	    }
	    public int findCircleNum(int[][] adj) {
	        int []visit=new int[adj.length];
	        int pro=0;
	        for(int i=0; i<adj.length; i++){
	            if(visit[i]==0){
	                visit[i]=1;
	                dfs(adj,visit,i);
	                pro++;
	            }
	        }
	        return pro;
	    }
	}

