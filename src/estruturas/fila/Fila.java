package estruturas.fila;

class Fila {

    int item[];
    int first;
    int end;

    public Fila(int MaxSize){
        item = new int[MaxSize];
        first = 0;
    }
}