class Main {
  public static int suma(int a, int b, int c){
    int resultado;
    resultado = a + b + c; //Operacion
    return resultado; //Conserva el valor
  }
  public static void main(String[] args) {
    int resultado; //Ambito diferente
    resultado = suma(4,6,9); //Otorga parametros
    System.out.println(resultado); //Imprime el retorno guardado
  }
}
