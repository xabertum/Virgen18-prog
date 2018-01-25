package tema5_objetos.Ejercicio2_fraccion;

//
//Clase para la definición de números racionales.
//PROGRAMACION, 2002
//

class racional {

// ******************* atributos ***********************
private int num;  // numerador
private int den;  // denominador

// ********** Métodos privados de la clase *************

// método para calcular el máximo común divisor de dos
// números enteros positivos. Algoritmo de Euclides
private int mcd(int a, int b) {
  int r;
  while (a % b != 0) {
    r = a % b;
    a = b;
    b = r;
  }
  return b;
}

// método privado para simplificar una fracción que
// represente un racional. 

// Por ejemplo: 60/-18  --simplifica--> -10/3

// num != 0 && den != 0
private void simplifica() {

  // es inf?
  if (den==0 && num !=0) num=1;
  // es 0?
  else if (den!=0 && num==0) den=1;
  // es una fracción? -> normalizarla
  else if (num!=0 && den!=0) {

         // valores absolutos:
         int absNum = Math.abs(num);
         int absDen = Math.abs(den);

         // signo del denominador:
         int signo = den/absDen;
         int s = mcd(absNum,absDen);

         num = signo*(num/s);
         den = signo*(den/s);
       }
 }
// 


// ***********  Constructores de la clase  *************

public racional (int num, int den) {
 this.num = num;
 this.den = den;
 // simplificación de la fracción 
 simplifica();
}

public racional (int num) {
  this.num = num;
  this.den = 1;
}

// ***********   Operaciones aritméticas   *************
//
// Para mantener las convenciones aritméticas habituales
// se han definido como operaciones "static"
//

public static racional suma (racional r1, racional r2) {
  racional sum = new racional(r1.num*r2.den+r1.den*r2.num,
                                             r1.den*r2.den);
  sum.simplifica();
  return sum;
} 

public static racional resta (racional r1, racional r2) {
  racional dif = new racional(r1.num*r2.den-r1.den*r2.num,
                                             r1.den*r2.den);
  dif.simplifica();
  return dif;
} 

public static racional multiplica (racional a, racional b) {
  racional mult = new racional(a.num*b.num, a.den*b.den);
  mult.simplifica();
  return mult;
}

public static racional inverso (racional a) {
  return new racional(a.den,a.num);
}

public static racional dividir (racional dn, racional dd) {
  return multiplica(dn, inverso(dd));
}


// ***************   Otras operaciones   *****************
                
// conversión a double:
// this.den != 0
public double todouble () {
  return num/den;
}

public String toString() {
  return this.num+"/"+this.den;
}

public boolean equals (racional r) {
  return (num==r.num && den==r.den);
}

public int compareTo (racional r) {
  if (this.equals(r)) return 0;
  else
  // supongamos que no es una indeterminación,
  // esto es num y den no son simultáneamente 0
  if (den == 0) return 1;
  else if (r.den==0) return -1;
  else // comparar números double
     if (this.todouble() > r.todouble()) return 1;
     else return -1;
}

} // Fin de la clase racional