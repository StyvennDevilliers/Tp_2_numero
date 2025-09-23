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
                        break;
                    case "21":
                        region = new String("Pas-de-Calais");
                        break;
                    case "22":
                        region = new String("Somme");
                        break;
                    case "23":
                        region = new String("Aisne");
                        break;
                    case  "24":
                        region = new String("Ardennes");
                        break;
                    case "25":
                        region = new String("Aube ou Hautes-Marne");
                        break;
                    case "26":
                        region = new String("Marne");
                        break;
                    case "29":
                        region = new String("Meurthe-et-Moselle ou Vosges");
                        break;
                    case "44":
                        region = new String("Oise");
                            break;
                    case "45":
                        region = new String("Côte-d'Or ou Nièvre ou Saône-et-Loire ou Yonne");
                        break;
                    case "54","55","57":
                        region = new String("Meurthe-et-Moselle ou Meuse ou Moselle ou Vosges");
                        break;
                    case "58":
                        region = new String("Côte-d'Or ou Nièvre ou Saône-et-Loire");
                        break;
                    case "59":
                        region = new String("Nord ou Pas-de-Calais");
                        break;
                }
                System.out.println("Région : " + region);
                break;
            case "04":
                System.out.println("Région Sud-Est");
                switch (numeroraw.substring(2,4)) {
                    case "11","30","34":
                        region = new String("Aude ou Gard ou Hérault ou Lozère ou Pyrénées-Orientales");
                        break;
                    case "13","86","88":
                        region = new String("Alpes-de-Haute-Provence ou Hautes-Alpes ou Bouches-du-Rhône ou Vaucluse");
                        break;
                    case "15","43","63":
                        region = new String("Allier ou Cantal ou Haute-Loire ou Puy-de-Dôme");
                        break;
                    case "20":
                        region = new String("Corse-du-Sud");
                        break;
                    case "26","27","69","81":
                        region = new String("Ain ou Ardèche ou Drôme ou Loire ou Rhône");
                        break;
                    case "42","91":
                        region = new String("Bouches-du-Rhône");
                        break;
                    case "50":
                        region = new String("Ain ou Haute-Savoie");
                        break;
                    case "56","57","80":
                        region = new String("Isère ou Savoie ou Haute-Savoie");
                        break;
                    case "66":
                        region = new String("Gard ou Lozère");
                        break;
                    case "67":
                        region = new String("Hérault");
                        break;
                    case "68":
                        region = new String("Aude ou Pyrénées-Orientales");
                        break;
                    case "70":
                        region = new String("Allier");
                        break;
                    case "71":
                        region = new String("Cantal ou Haute-Loire");
                        break;
                    case "72","78":
                        region = new String("Rhône");
                        break;
                    case "73":
                        region = new String("Puy-de-Dôme");
                        break;
                    case "74":
                        region = new String("Ain");
                        break;
                    case "75":
                        region = new String("Ardèche ou Drôme");
                        break;
                    case "76":
                        region = new String("Isère");
                        break;
                    case "77":
                        region = new String("Loire");
                        break;
                    case "79":
                        region = new String("Savoie");
                        break;
                    case "83","89":
                        region = new String("Alpes-Maritimes ou Var");
                        break;
                    case "90":
                        region = new String("Bouche-du-Rhône ou Vaucluse");
                        break;
                    case "92":
                        region = new String("Alpes-de-Haute-Provence ou Hautes-Alpes ou Var");
                        break;
                    case "93","97":
                        region = new String("Alpes-Maritimes");
                        break;
                    case "94":
                        region = new String("Var");
                        break;
                    case "95":
                        region = new String("Haute-Corse");
                        break;

                }
                System.out.println("Région : " + region);
                break;
            case "05":
                System.out.println("Région Sud-Ouest");
                switch (numeroraw.substring(2,4)) {
                    case "16","17","79":
                        region = new String("Charente ou Charente-Maritime ou Deux-Sèvres ou Vienne");
                        break;
                    case "19","55","87":
                        region = new String("Corrèze ou Creuse ou Haute-Vienne");
                        break;
                    case "24","33","40","47":
                        region = new String("Dordogne ou Gironde ou Landes ou Lot-et-Garonne ou Pyrénées-Atlantiques");
                        break;
                    case "31","67","81":
                        region = new String("Ariège ou Aveyron ou Haute-Garonne ou Gers ou Lot ou Hautes-Pyrénées ou Tarn ou Tarn-et-Garonne");
                        break;
                    case "34":
                        region = new String("Haute-Garonne");
                        break;
                    case "45":
                        region = new String("Charente");
                        break;
                    case "46":
                        region = new String("Charente-Maritime");
                        break;
                    case "49":
                        region = new String("Deux-Sèvres ou Vienne");
                        break;
                    case "53":
                        region = new String("Dordogne et Lot-et-Garonne");
                        break;
                    case "56","57":
                        region = new String("Gironde");
                        break;
                    case "58":
                        region = new String("Landes");
                        break;
                    case "59":
                        region = new String("Pyrénées-Atlantiques");
                        break;
                    case "61":
                        region = new String("Ariège ou Haute-Garonne ou GErs ou Hautes-Pyrénées");
                        break;
                    case "62":
                        region = new String("Haute-Garonne ou GErs ou Hautes-Pyrénées");
                        break;
                    case "63":
                        region = new String("Tarn ou Tarn-et-Garonne");
                        break;
                    case "65":
                        region = new String("Aveyron ou Lot");
                        break;
                    case "90":
                        region = new String("Guadeloupe");
                        break;
                    case "94":
                        region = new String("Guyanne");
                        break;
                    case "96":
                        region = new String("Martinique");
                        break;
                }
                System.out.println("Région : " + region);
                break;
        }
    }
}
