package fr.btsciel;

import clavier.In;

public class Ihm {
    public static void main(String[] args) {
        String numeroraw = new String(), numero = new String(), region = new String();

        System.out.println("Saisir un numéro de téléphone à 10 chiffres:");
        numeroraw = In.readString();
        numero = numeroraw.replace(" ","");

        switch(numeroraw.substring(0,2)) {
            case "01":
                System.out.println("Région parisienne");
                switch(numeroraw.substring(2,4)) {
                    case "34":
                        region = new String("Yvelines ou Val-d'Oise");
                        break;
                    case "39":
                        region = new String("Yvelines");
                        break;
                    case "40","44","53","70","72","73","74","75","77","79","80","81":
                        region = new String("Paris");
                        break;
                    case "41":
                        region = new String("Hauts-de-Seine ou Val-d'Oise");
                        break;
                    case "42":
                        region = new String("Paris ou Hauts-de-Seine ou Seine-Saint-Denis");
                        break;
                    case "43","45","56":
                        region = new String("Paris ou Val-de-Marne");
                        break;
                    case "46":
                        region = new String("Paris ou Essonne ou Hauts-de-Seine");
                        break;
                    case "47":
                        region = new String("Hauts-de-Seine");
                        break;
                    case "48":
                        region = new String("Seine-Saint-Denis ou Val-de-Marne ou Val-d'Oise");
                        break;
                    case "49":
                        region = new String("Paris ou Hauts-de-Seine ou Val-de-Marne");
                        break;
                    case "55","76","78":
                        region = new String("Paris ou Hauts-de-Seine");
                        break;
                    case "60","64":
                        region = new String("Seine-et-Marne");
                        break;
                    case "69":
                         region = new String("Essonne");
                         break;
                }
                System.out.println("Région : " + region);
                break;
            case "02":
                System.out.println("Région Nord-Ouest");
                switch(numeroraw.substring(2,4)) {
                    case "14","50","61":
                        region = new String("Calvados ou Manche ou Orne");
                        break;
                    case "18","34","36","45":
                        region = new String("Cher ou Eure-et-Loir ou Indre ou Indre-et-Loire ou Loir-et-Cher ou Loiret");
                        break;
                    case "22","30","56","90":
                        region = new String("Côtes-d'Armor ou Finistère ou Ille-et-Vilaine ou Morbihan");
                        break;
                    case "28","40":
                        region = new String("Loire-Atlantique");
                        break;
                    case "31":
                        region = new String("Calvados");
                        break;
                    case "32","76","77","78":
                        region = new String("Eure ou Seine-Maritime");
                        break;
                    case "33":
                        region = new String("Manche ou Orne");
                        break;
                    case "35":
                        region = new String("Seine-Maritime");
                        break;
                    case "37":
                        region = new String("Eure-et-Loir");
                        break;
                    case "38":
                        region = new String("Loiret");
                        break;
                    case "41":
                        region = new String("Maine-et-Loire");
                        break;
                    case "43":
                        region = new String("Mayenne ou Sarthe");
                        break;
                    case  "44","53","72":
                        region = new String("Loire-Atlantique ou Maine-et-Loire ou Mayenne ou Sarthe ou Vendée");
                        break;
                    case "47":
                        region = new String("Indre-et-Loire");
                        break;
                    case "48":
                        region = new String("Cher");
                        break;
                    case "49":
                        region = new String("Loire-Atlantique ou Maine-et-Loire ou Mayenne ou Sarthe ou Vendée");
                        break;
                    case "51":
                        region = new String("Loire-Atlantique ou Vendée");
                        break;
                    case  "54":
                        region = new String("Indre ou Loir-et-Cher");
                        break;
                    case "62":
                        region = new String("La Réunion");
                        break;
                    case "96":
                        region = new String("Côtes-D'Armor");
                        break;
                    case "97":
                        region = new String("Morbihan");
                        break;
                    case "98":
                        region = new String("Finistère");
                        break;
                    case "99":
                        region = new String("Ille-et-Vaine");
                        break;
                }
                System.out.println("Région : " + region);
                break;
            case "03":
                System.out.println("Région Nord-Est");
                switch(numeroraw.substring(2,4)) {
                    case "10","51","52":
                        region = new String("Ardennes ou Aube ou Marne ou Haute-Marne");
                        break;
                    case "20","27","28":
                        region = new String("Nord");
                    case "21":
                        region = new String("Pas-de-Calais");
                    case "22":
                        region = new String("Somme");
                    case "23":
                        region = new String("Aisne");
                    case  "24":
                        region = new String("Ardennes");
                    case "25":
                        region = new String("Aube ou Hautes-Marne");
                    case "26":
                        region = new String("Marne");
                    case "29":
                        region = new String("Meurthe-et-Moselle ou Vosges");
                    case "44":
                        region = new String("Oise");
                    case "45":
                        region = new String("Côte-d'Or ou Nièvre ou Saône-et-Loire ou Yonne");
                    case "54","55","57":
                        region = new String("Meurthe-et-Moselle ou Meuse ou Moselle ou Vosges");
                    case "58":
                        region = new String("Côte-d'Or ou Nièvre ou Saône-et-Loire");
                    case "59":
                        region = new String("Nord ou Pas-de-Calais");
                }
                System.out.println("Région : " + region);
                break;
            case "04":
                System.out.println("Région Sud-Est");
                System.out.println("Région : " + region);
                break;
            case "05":
                System.out.println("Région Sud-Ouest");
                System.out.println("Région : " + region);
                break;
        }
    }
}
