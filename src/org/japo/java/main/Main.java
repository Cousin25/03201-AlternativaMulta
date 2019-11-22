/* 
 * Copyright 2019 Andrés Cosín Zamareño - Cousin183@gmail.com ..
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.japo.java.main;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Andrés Cosín Zamareño - Cousin183@gmail.com .
 */
public class Main {

    public static final Scanner SCN
            = new Scanner(System.in, "Windows-1252")
                    .useLocale(Locale.ENGLISH).useDelimiter("\\s+");

    public static void main(String[] args) {
        System.out.println("Alternativa de Multa");
        System.out.print("====================\n");

        final double IMPORT_INI = 60.00;
        final int TANTO_DESC = 20/*%*/;
        final int PLAZO_DESC = 30 /*dias*/;
        double importeDescuento;
        double importeFinal;
        int diasDemora;
        double importeDescontado;

        try {
            System.out.print("Días de demora ..............: ");
            diasDemora = SCN.nextInt();
            System.out.println("---");
            System.out.printf("Importe inicial multa .......: %.2f €%n", IMPORT_INI);
            System.out.println("---");
            System.out.printf("Plazo con descuento .........: %d días%n", PLAZO_DESC);
            System.out.printf("Tanto descuento .............: %d %%%n", TANTO_DESC);
            

            if (diasDemora > PLAZO_DESC) {
                importeDescuento = 0;
            } else {
                importeDescuento = 20;
            }
            
            importeDescontado = IMPORT_INI /100 * importeDescuento;
            
            System.out.printf("Importe descuento ...........: %.2f €%n", importeDescontado);
            System.out.println("---");
            
            importeFinal = IMPORT_INI - importeDescontado;
            System.out.printf("Importe final multa .........: %.2f €%n", importeFinal);
            
        }catch (Exception e) {
            System.out.print("ERROR: Entrada Incorrecta");
        } finally {

        }

    }

}
