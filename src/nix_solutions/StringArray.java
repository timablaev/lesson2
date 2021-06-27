package nix_solutions;

import java.util.Arrays;

class StringArray {
//    int x, y, z;
//
//     StringArray(int x, int y, int z){
//       this.x = x;
//       this.y = y;
//       this.z = z;
//    }
//     void printCoordinates(){
//       System.out.println("x=" + x + "; y=" + y + "; z=" + z + ";");
//    }
//     void moveRight(int step){
//        this.x += step;
//        System.out.println(x);
//    }
//
//     int getX() {
//        return x;
//    }

          void myArray(int... art) {
             System.out.println("Количество аргументов: " + art.length);
             for (int i : art) {
               System.out.print(i + " ");
             }
             System.out.println();
          }

          void myArrayNumber(int... arg) {

               for (int j = 1; j<=arg.length; j++) {
         System.out.print(j + "й элемент" + ": " + "" + arg[j-1] + "; " );
               }

              System.out.println();
          }

          void sortVstavk(int... ending) {
              System.out.println(Arrays.toString(ending));
              for (int left = 0; left < ending.length; left++) {
                  // Вытаскиваем значение элемента
                  int value = ending[left];
                  // Перемещаемся по элементам, которые перед вытащенным элементом
                  int k = left - 1;
                  for (; k >= 0; k--) {
                      // Если вытащили значение меньшее — передвигаем больший элемент дальше
                      if (value < ending[k]) {
                          ending[k + 1] = ending[k];
                      } else {
                          // Если вытащенный элемент больше — останавливаемся
                          break;
                      }
                  }
                  // В освободившееся место вставляем вытащенное значение
                  ending[k + 1] = value;
              }
              System.out.println(Arrays.toString(ending));
              int n = ending.length;
              //Переменная, которая будет использоваться при обмене элементов
              int temp;

              for (int i = 0; i < n / 2; i++) {
                  temp = ending[n - i - 1];
                  ending[n - i - 1] = ending[i];
                  ending[i] = temp;
              }
              //Выводим конечный массив в консоль
              for (int i = 0; i < ending.length; i++) {
                  System.out.print("[" + ending[i] + "]" + " ");
              }

          }
}