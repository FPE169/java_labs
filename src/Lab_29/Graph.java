package Lab_29;

class Graph{
    private String [] vertex; // массив вершин
    private int [] [] matrix; // Матрица смежности
    private VisitedVertex vv; // Класс для хранения данных при реализации алгоритма Дейкстры.
    public Graph(String[] vertex,int[][] matrix){
        this.vertex=vertex;
        this.matrix=matrix;
    }

    public VisitedVertex dsj(int index){
        vv=  new VisitedVertex(vertex.length,index);
        update (index); // Обновляем расстояние от вершины индекса до окружающих вершин
        for (int j=1;j<vertex.length;j++){
            index = vv.updateArr (); // Возвращаемся к новой вершине доступа
            update(index);
        }
        return vv;
    }
    // Обновляем расстояние от вершины индекса индекса до окружающих вершин и предшествующего узла окружающих вершин
    public void update(int index){
        int len=0;
        for(int j=0;j<matrix[index].length;j++){
            // len - это сумма расстояния от начальной вершины до вершины индекса + расстояние от вершины индекса до вершины j
            len=vv.getDis(index)+matrix[index][j];
            // Если вершина j не была посещена, а длина len меньше, чем расстояние от начальной вершины до вершины j, ее необходимо обновить
            if(!vv.in(j)&&len<vv.getDis(j)){
                vv.updatePre(j,index);
                vv.updateDis(j,len);
            }
        }
    }

}