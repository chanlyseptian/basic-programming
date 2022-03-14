package com.company;

public class NestedLoopBintang {
    public static void main(String[] args) {
        int i;
        int j;
        int n = 5;

        /* No.1 Rectangle Pattern
         * * * * *
         * * * * *
         * * * * *
         * * * * *
         * * * * *

         */
        System.out.println("Rectangle Pattern");
        for (i=1; i<=n; i++) {
            for (j=1; j<=n; j++) {
                System.out.print(" *");
            }
            System.out.println();
        }



        /* No.2 Increasing Triangle Pattern
        *
        * *
        * * *
        * * * *
        * * * * *

         */
        System.out.println("\nIncreasing Triangle Pattern");

        for (i=1; i<=n; i++) {
            for (j=1; j<=i; j++) {
                System.out.print(" *");
            }
            System.out.println();
        }



        /* No.3 Decreasing Triangle Pattern
         * * * * *
         * * * *
         * * *
         * *
         *

         */
        System.out.println("\nDecreasing Triangle Pattern");
        for (i=1; i<=n; i++) {
            for (j=i; j<=n; j++) {
                System.out.print(" *");
            }
            System.out.println();
        }



        /* No.4 Right Sided Triangle
                 *
               * *
             * * *
           * * * *
         * * * * *

         */
        System.out.println("\nRight Sided Triangle");

        for (i=1; i<=n; i++) {
            for (j=i; j<=n; j++) {
                System.out.print("  ");
            }
            for (j=1; j<=i; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }



        /* No.5 Left Sided Triangle
         * * * * *
           * * * *
             * * *
               * *
                 *

         */
        System.out.println("\nLeft Sided Triangle");

        for (i=1; i<=n; i++) {
            for (j=1; j<=i; j++) {
                System.out.print("  ");
            }
            for (j=i; j<=n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        /* No.6 Hill Pattern
                 *
               * * *
             * * * * *
           * * * * * * *
         * * * * * * * * *

         */
        System.out.println("\nHill Pattern");

        for (i=1; i<=n; i++) {
            for (j=i; j<=n; j++) {
                System.out.print("  ");
            }
            for (j=1; j<=i; j++) {
                System.out.print("* ");
            }
            for (j=1; j<i; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }

        /* No.7 Reverse Hill Patern
         * * * * * * * * *
           * * * * * * *
             * * * * *
               * * *
            `    *

         */
        System.out.println("\nReverse Hill Pattern");

        for (i=1; i<=n; i++) {
            for (j=1; j<=i; j++) {
                System.out.print("  ");
            }
            for (j=i; j<=n; j++) {
                System.out.print("* ");
            }
            for (j=i; j<n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        /* No.8 Diamond Pattern
                 *
               * * *
             * * * * *
           * * * * * * *
         * * * * * * * * *
           * * * * * * *
             * * * * *
               * * *
                 *

         */
        System.out.println("\nDiamond Pattern");

        for (i=1; i<=n; i++) {
            for (j=i; j<=n; j++) {
                System.out.print("  ");
            }
            for (j=1; j<=i; j++) {
                System.out.print("* ");
            }
            for (j=1; j<i; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }
        for (i=1; i<=n; i++) {
            for (j=1; j<=i; j++) {
                System.out.print("  ");
            }
            for (j=i; j<n; j++) {
                System.out.print("* ");
            }
            for (j=i; j<=n; j++) {
                System.out.print("* ");
            }
            System.out.println();

        }

        /* No.9 Reverse Pyramid
            * * * * *
             * * * *
              * * *
               * *
                *

         */
        System.out.println("\nReverse Pyramid");

        for (i=1; i<=n; i++) {
            for (j=1; j<=i; j++) {
                System.out.print(" ");
            }
            for (j=i; j<=n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        /* No.10 Butterfly
         *           *
         * *       * *
         * * *   * * *
         * * * * * * *
         * * *   * * *
         * *       * *
         *           *

         */
        System.out.println("\nButterfly");

        for (i=1; i<=n; i++) {
            for (j=1; j<i; j++) {
                System.out.print("* ");
            }
            for (j=i; j<n; j++) {
                System.out.print("    ");
            }
            for (j=1; j<i; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }
        for (i=1; i<=n; i++) {
            for (j=i; j<n; j++) {
                System.out.print("* ");
            }
            for (j=1; j<i; j++) {
                System.out.print("    ");
            }
            for (j=i; j<n; j++) {
                System.out.print("* ");
            }
            System.out.println();

        }


        /* No.11 Diamond 2
            *
           * *
          * * *
        * * * * *
          * * *
           * *
            *


         */
        System.out.println("\nDiamond 2");

        for (i=1; i<n-1; i++) {
            for (j=i; j<=n; j++) {
                System.out.print(" ");
            }
            for (j=1; j<=i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (i=1; i<=n; i++) {
            for (j=1; j<=i; j++) {
                System.out.print(" ");
            }
            for (j=i; j<=n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }


        /* No.12 Sandglass
            * * * *
             * * *
              * *
               *
              * *
             * * *
            * * * *

         */
        System.out.println("\nSandglass");


        for (i=1; i<=n; i++) {
            for (j=1; j<=i; j++) {
                System.out.print(" ");
            }
            for (j=i; j<n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (i=1; i<=n; i++) {
            for (j=i; j<=n; j++) {
                System.out.print(" ");
            }
            for (j=1; j<=i-1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
//
//        /* No.13 Left Pascal's Triangle
//         *
//         * *
//         * * *
//         * * * *
//         * * *
//         * *
//         *
//
//         */
//        System.out.println("\nLeft Pascal's Triangle");
//
//        for (i=1; i<=n; i++) {
//            for (j=i; j<=n; j++) {
//                System.out.print("  ");
//            }
//            System.out.println();
//        }
//
//
//        /* No.14 Right Pascal's Triangle
//                *
//              * *
//            * * *
//          * * * *
//            * * *
//              * *
//                *
//
//         */
//        System.out.println("\nRight Pascal's Triangle");
//
//        for (i=1; i<=n; i++) {
//            for (j=i; j<=n; j++) {
//                System.out.print("  ");
//            }
//            System.out.println();
//        }


         /* No.15
         *****Algoritma
          ****Algoritma
           ***Algoritma
            **Algoritma
             *Algoritma

         */
        System.out.println("\nBintang & Algoritma");

        for (i = 1; i<=n; i++) {
            for (j = 1; j<= i; j++){
                System.out.print("  ");
            }
            for (j = i; j<= n; j++){
                System.out.print("* ");
            }
            System.out.print("Algoritma");
            System.out.println();

        }



    }
}
