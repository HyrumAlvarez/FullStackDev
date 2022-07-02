# Definiciones y Conceptos

Todos los programos tienen funciones, y hay que saber cuando crear o usar una función, para esto se tiene que saber para que vale.

Una función evita tener que repetir código y dentro de ella puede ir cualquier sintaxis del lenguaje, si existe un erorr en la función solo con editarlo se edita en general.

Las funciones poseen algo llamado firma, o prototipo o signature, y consiste en: como se llama la función, que valores tendra la función y que tipo de dato va a retornar la función.

    puclic static int suma(int a, int b){ //pide los parametros int
        return a + b; //devuelve el valor int
    }
    
Básicamente se devuelve el mismo tipo de dato que los parametros piden, pero es posible pedir un tipo y devolver a otro.

    int resultado;
    resultado = suma(a: 10, b:30); //llamando a la funcion
    System.out.println(resultado);
    
No es necesario que una funcion tenga que devolver algo, mediante la palabra *void*, pero al no devolver nigun valor, tampcoo se podra asignar valor alguno.

    public stati void suma(int a, int b){
        int resultado;
        resultado a + b;
        
        System.out.println(resultado);
    }
    
Una función que si devuelva un valor es usada cuando se requiere que el resultado devuelto se use posteiormente y poder manipularlo, cuando se usa un void es una función que solo se desea que haga algo y no devuelva valor alguno.

*La funcion main es la primera que se invoca dentro del codigo y contiene todo el codigo, el void se usa para señalar que termina el main.*
