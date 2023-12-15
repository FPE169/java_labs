package Lab_29;

import java.io.PrintWriter;
import java.util.Scanner;

public class Solution {
    public static void main(String main[]){
        String[] vertex={"V1","V2","V3","V4","V5","V6"};
        int[][] matrix=new int[vertex.length][vertex.length];
        final int inf=Short.MAX_VALUE;
        matrix[0]=new int[]{0,	16,	22,	30,	41,	59};
        matrix[1]=new int[]{inf,0,	16,	22,	30,	41};
        matrix[2]=new int[]{inf	,inf,0, 17, 23,31};
        matrix[3]=new int[]{inf	,inf,inf,0,17,23};
        matrix[4]=new int[]{inf	,inf,inf,inf,0,18};
        matrix[5]=new int[]{inf,inf,inf,inf,inf,0};
        Graph graph=new Graph(vertex,matrix);
        VisitedVertex a = graph.dsj(3);
        a.show();
        System.out.println(a.dis[5]);
    }
}