package fr.btsciel;

import clavier.*;

public class Ihm {
    public static void main(String[] args) {
        String numeroraw = new String(), numero = new String(), region = new String(), operateur = new String(), type = new String(), provenance = new String(), regionprecise = new String();

        System.out.println("Saisir un numéro de téléphone:");
        numeroraw = In.readString();
        numero = numeroraw.replace(" ", "");

        if (numero.substring(0,3).equals("+33")) {
            numero = numero.replace("+33", "0");
        }

        System.out.println(numero);

        if (numero.startsWith("+")) {
            switch (numero.substring(1,2)){
                case "1":
                    provenance = new String("Ce numéro provient sois du Canada sois des Etats-Unies");
                    break;
                case "7":
                    provenance = new String("Ce numéro provient sois du Kazakhstan sois de la Russie");
                    break;
                case "2":
                    if (numero.substring(2,3).equals("0")){
                        provenance = new String("Ce numéro provient de l'Egypte");
                    } else {
                        provenance = new String("Ce numéro provient de l'Afrique du Sud");
                    }
                    break;
                case "3":
                    switch (numero.substring(2,3)){
                        case "0":
                            provenance = new String("Ce numéro provient de la Grèce");
                            break;
                        case "1":
                            provenance = new String("Ce numéro provient des pays-Bas");
                            break;
                        case "2":
                            provenance = new String("Ce numéro provient de la Belgique");
                            break;
                        case "4":
                            provenance = new String("Ce numéro provient de l'Espagne");
                            break;
                        case "6":
                            provenance = new String("Ce numéro provient de la Hongrie");
                            break;
                        case "9":
                            provenance = new String("Ce numéro provient de l'Italie");
                            break;
                        default:
                            provenance = new String("Inconnu");
                            break;
                    }
                    break;
                case "4":
                    switch (numero.substring(2,3)){
                        case "0":
                            provenance = new String("Ce numéro provient de la Roumanie");
                            break;
                        case "1":
                            provenance = new String("Ce numéro provient de la Suisse");
                            break;
                        case "4":
                            provenance = new String("Ce numéro provient du Royaume-uni");
                            break;
                        default:
                            provenance = new String("Inconnu");
                            break;
                    }
                    break;
                case "9":
                    provenance = new String("Ce numéro provient du Népal");
                    break;
                default:
                    provenance = new String("Inconnu");
                    break;
            }
            System.out.println("Provenance: " + provenance);
        }else {
            if (numeroraw.substring(0, 1).equals("0")) {
                provenance = new String("Ce numéro provient de la France");
                region = new String("Inconnu");
                regionprecise = new String("Inconnu");
                operateur = new String("Le numéro n'est pas un 06 ou un 07, il n'a donc pas d'opérateur.");
                type = new String("Le numéro est un numéro quelconque.");
            }else {
                provenance = new String("Inconnu");
                region = new String("Inconnu");
                regionprecise = new String("Inconnu");
                operateur = new String("Inconnu");
                type = new String("Inconnu");
            }
            switch (numero.substring(0,2)) {
                case "01":
                    region = new String("Région parisienne");
                    switch (numero.substring(2,4)) {
                        case "34":
                            regionprecise = new String("Yvelines ou Val-d'Oise");
                            break;
                        case "39":
                            regionprecise = new String("Yvelines");
                            break;
                        case "40", "44", "53", "70", "72", "73", "74", "75", "77", "79", "80", "81":
                            regionprecise = new String("Paris");
                            break;
                        case "41":
                            regionprecise = new String("Hauts-de-Seine ou Val-d'Oise");
                            break;
                        case "42":
                            regionprecise = new String("Paris ou Hauts-de-Seine ou Seine-Saint-Denis");
                            break;
                        case "43", "45", "56":
                            regionprecise = new String("Paris ou Val-de-Marne");
                            break;
                        case "46":
                            regionprecise = new String("Paris ou Essonne ou Hauts-de-Seine");
                            break;
                        case "47":
                            regionprecise = new String("Hauts-de-Seine");
                            break;
                        case "48":
                            regionprecise = new String("Seine-Saint-Denis ou Val-de-Marne ou Val-d'Oise");
                            break;
                        case "49":
                            regionprecise = new String("Paris ou Hauts-de-Seine ou Val-de-Marne");
                            break;
                        case "55", "76", "78":
                            regionprecise = new String("Paris ou Hauts-de-Seine");
                            break;
                        case "60", "64":
                            regionprecise = new String("Seine-et-Marne");
                            break;
                        case "69":
                            regionprecise = new String("Essonne");
                            break;
                        default:
                            regionprecise = new String("Inconnu");
                            break;
                    }
                    break;
                case "02":
                    region = new String("Région Nord-Ouest");
                    switch (numero.substring(2, 4)) {
                        case "14", "50", "61":
                            regionprecise = new String("Calvados ou Manche ou Orne");
                            break;
                        case "18", "34", "36", "45":
                            regionprecise = new String("Cher ou Eure-et-Loir ou Indre ou Indre-et-Loire ou Loir-et-Cher ou Loiret");
                            break;
                        case "22", "30", "56", "90":
                            regionprecise = new String("Côtes-d'Armor ou Finistère ou Ille-et-Vilaine ou Morbihan");
                            break;
                        case "28", "40":
                            regionprecise = new String("Loire-Atlantique");
                            break;
                        case "31":
                            regionprecise = new String("Calvados");
                            break;
                        case "32", "76", "77", "78":
                            regionprecise = new String("Eure ou Seine-Maritime");
                            break;
                        case "33":
                            regionprecise = new String("Manche ou Orne");
                            break;
                        case "35":
                            regionprecise = new String("Seine-Maritime");
                            break;
                        case "37":
                            regionprecise = new String("Eure-et-Loir");
                            break;
                        case "38":
                            regionprecise = new String("Loiret");
                            break;
                        case "41":
                            regionprecise = new String("Maine-et-Loire");
                            break;
                        case "43":
                            regionprecise = new String("Mayenne ou Sarthe");
                            break;
                        case "44", "53", "72":
                            regionprecise = new String("Loire-Atlantique ou Maine-et-Loire ou Mayenne ou Sarthe ou Vendée");
                            break;
                        case "47":
                            regionprecise = new String("Indre-et-Loire");
                            break;
                        case "48":
                            regionprecise = new String("Cher");
                            break;
                        case "49":
                            regionprecise = new String("Loire-Atlantique ou Maine-et-Loire ou Mayenne ou Sarthe ou Vendée");
                            break;
                        case "51":
                            regionprecise = new String("Loire-Atlantique ou Vendée");
                            break;
                        case "54":
                            regionprecise = new String("Indre ou Loir-et-Cher");
                            break;
                        case "62":
                            regionprecise = new String("La Réunion");
                            break;
                        case "96":
                            regionprecise = new String("Côtes-D'Armor");
                            break;
                        case "97":
                            regionprecise = new String("Morbihan");
                            break;
                        case "98":
                            regionprecise = new String("Finistère");
                            break;
                        case "99":
                            regionprecise = new String("Ille-et-Vaine");
                            break;
                        default:
                            regionprecise = new String("Inconnu");
                            break;
                    }
                    break;
                case "03":
                    region = new String("Région Nord-Est");
                    switch (numero.substring(2,4)) {
                        case "10", "51", "52":
                            regionprecise = new String("Ardennes ou Aube ou Marne ou Haute-Marne");
                            break;
                        case "20", "27", "28":
                            regionprecise = new String("Nord");
                            break;
                        case "21":
                            regionprecise = new String("Pas-de-Calais");
                            break;
                        case "22":
                            regionprecise = new String("Somme");
                            break;
                        case "23":
                            regionprecise = new String("Aisne");
                            break;
                        case "24":
                            regionprecise = new String("Ardennes");
                            break;
                        case "25":
                            regionprecise = new String("Aube ou Hautes-Marne");
                            break;
                        case "26":
                            regionprecise = new String("Marne");
                            break;
                        case "29":
                            regionprecise = new String("Meurthe-et-Moselle ou Vosges");
                            break;
                        case "44":
                            regionprecise = new String("Oise");
                            break;
                        case "45":
                            regionprecise = new String("Côte-d'Or ou Nièvre ou Saône-et-Loire ou Yonne");
                            break;
                        case "54", "55", "57":
                            regionprecise = new String("Meurthe-et-Moselle ou Meuse ou Moselle ou Vosges");
                            break;
                        case "58":
                            regionprecise = new String("Côte-d'Or ou Nièvre ou Saône-et-Loire");
                            break;
                        case "59":
                            regionprecise = new String("Nord ou Pas-de-Calais");
                            break;
                        default:
                            regionprecise = new String("Inconnu");
                            break;
                    }
                    break;
                case "04":
                    region = new String("Région Sud-Est");

                    switch (numero.substring(2,4)) {
                        case "11", "30", "34":
                            regionprecise = new String("Aude ou Gard ou Hérault ou Lozère ou Pyrénées-Orientales");
                            break;
                        case "13", "86", "88":
                            regionprecise = new String("Alpes-de-Haute-Provence ou Hautes-Alpes ou Bouches-du-Rhône ou Vaucluse");
                            break;
                        case "15", "43", "63":
                            regionprecise = new String("Allier ou Cantal ou Haute-Loire ou Puy-de-Dôme");
                            break;
                        case "20":
                            regionprecise = new String("Corse-du-Sud");
                            break;
                        case "26", "27", "69", "81":
                            regionprecise = new String("Ain ou Ardèche ou Drôme ou Loire ou Rhône");
                            break;
                        case "42", "91":
                            regionprecise = new String("Bouches-du-Rhône");
                            break;
                        case "50":
                            regionprecise = new String("Ain ou Haute-Savoie");
                            break;
                        case "56", "57", "80":
                            regionprecise = new String("Isère ou Savoie ou Haute-Savoie");
                            break;
                        case "66":
                            regionprecise = new String("Gard ou Lozère");
                            break;
                        case "67":
                            regionprecise = new String("Hérault");
                            break;
                        case "68":
                            regionprecise = new String("Aude ou Pyrénées-Orientales");
                            break;
                        case "70":
                            regionprecise = new String("Allier");
                            break;
                        case "71":
                            regionprecise = new String("Cantal ou Haute-Loire");
                            break;
                        case "72", "78":
                            regionprecise = new String("Rhône");
                            break;
                        case "73":
                            regionprecise = new String("Puy-de-Dôme");
                            break;
                        case "74":
                            regionprecise = new String("Ain");
                            break;
                        case "75":
                            regionprecise = new String("Ardèche ou Drôme");
                            break;
                        case "76":
                            regionprecise = new String("Isère");
                            break;
                        case "77":
                            regionprecise = new String("Loire");
                            break;
                        case "79":
                            regionprecise = new String("Savoie");
                            break;
                        case "83", "89":
                            regionprecise = new String("Alpes-Maritimes ou Var");
                            break;
                        case "90":
                            regionprecise = new String("Bouche-du-Rhône ou Vaucluse");
                            break;
                        case "92":
                            regionprecise = new String("Alpes-de-Haute-Provence ou Hautes-Alpes ou Var");
                            break;
                        case "93", "97":
                            regionprecise = new String("Alpes-Maritimes");
                            break;
                        case "94":
                            regionprecise = new String("Var");
                            break;
                        case "95":
                            regionprecise = new String("Haute-Corse");
                            break;
                        default:
                            regionprecise = new String("Inconnu");
                            break;
                    }
                    break;
                case "05":
                    region = new String("Région Sud-Ouest");
                    switch (numero.substring(2,4)) {
                        case "16", "17", "79":
                            regionprecise = new String("Charente ou Charente-Maritime ou Deux-Sèvres ou Vienne");
                            break;
                        case "19", "55", "87":
                            regionprecise = new String("Corrèze ou Creuse ou Haute-Vienne");
                            break;
                        case "24", "33", "40", "47":
                            regionprecise = new String("Dordogne ou Gironde ou Landes ou Lot-et-Garonne ou Pyrénées-Atlantiques");
                            break;
                        case "31", "67", "81":
                            regionprecise = new String("Ariège ou Aveyron ou Haute-Garonne ou Gers ou Lot ou Hautes-Pyrénées ou Tarn ou Tarn-et-Garonne");
                            break;
                        case "34":
                            regionprecise = new String("Haute-Garonne");
                            break;
                        case "45":
                            regionprecise = new String("Charente");
                            break;
                        case "46":
                            regionprecise = new String("Charente-Maritime");
                            break;
                        case "49":
                            regionprecise = new String("Deux-Sèvres ou Vienne");
                            break;
                        case "53":
                            regionprecise = new String("Dordogne et Lot-et-Garonne");
                            break;
                        case "56", "57":
                            regionprecise = new String("Gironde");
                            break;
                        case "58":
                            regionprecise = new String("Landes");
                            break;
                        case "59":
                            regionprecise = new String("Pyrénées-Atlantiques");
                            break;
                        case "61":
                            regionprecise = new String("Ariège ou Haute-Garonne ou GErs ou Hautes-Pyrénées");
                            break;
                        case "62":
                            regionprecise = new String("Haute-Garonne ou GErs ou Hautes-Pyrénées");
                            break;
                        case "63":
                            regionprecise = new String("Tarn ou Tarn-et-Garonne");
                            break;
                        case "65":
                            regionprecise = new String("Aveyron ou Lot");
                            break;
                        case "90":
                            regionprecise = new String("Guadeloupe");
                            break;
                        case "94":
                            regionprecise = new String("Guyanne");
                            break;
                        case "96":
                            regionprecise = new String("Martinique");
                            break;
                        default:
                            regionprecise = new String("Inconnu");
                            break;
                    }

                    break;
                case "06":
                    switch (numero.substring(2,4)) {
                        case "01":
                            operateur = new String("Neuf Cegetel");
                            break;
                        case "03", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23",
                             "24", "25", "26", "27", "28", "29", "35", "46", "55":
                            operateur = new String("SFR");
                            break;
                        case "05":
                            operateur = new String("Auchan Télécom");
                            break;
                        case "07", "08", "30", "31", "32", "33", "34", "37", "42", "43", "45", "54", "70", "71", "72", "73",
                             "74", "75", "76", "77", "78", "79", "80", "81", "82", "83", "84", "85", "86", "87", "88", "89":
                            operateur = new String("Orange");
                            break;
                        case "50", "53", "58", "59", "60", "61", "62", "63", "64", "65", "67", "68", "69", "98", "99":
                            operateur = new String("Bouygues Telecom");
                            break;
                        default:
                            operateur = new String("Inconnu");
                            break;
                    }

                    break;
                case "07":
                    type = new String("Il s'agit d'un numéro de portable.");
                    break;
                case "09":
                    type = new String("Il s'agit de la voix sur IP");
                    break;
                case "08":
                    switch (numero.substring(2,4)) {
                        case "00", "01", "02", "03", "04", "05":
                            type = new String("Il s'agit d'un numéro vert (gratuit).");
                            break;
                        case "06", "07", "08", "09":
                            type = new String("Il s'agit d'un numéro gratuit");
                            break;
                        case "10", "11", "12", "13", "14", "15", "16", "17", "18", "19":
                            type = new String("Il s'agit d'un numéro payant,vous paierez au maximum 6 centimes d’euros la minute, ou 15 centimes d’euros l’appel.");
                            break;
                        case "20", "21", "22", "23", "24", "25", "26", "27", "28", "29":
                            type = new String("Il s'agit d'un numéro payant, vous paierez au maximum 20 centimes d’euro par minute, ou 50 centimes d’euros par appel.");
                            break;
                        case "90", "91", "92", "93", "94", "95", "96", "97", "98", "99":
                            type = new String("Il s'agit d'un numéro payant, vous paierez au maximum 80 centimes d’euros par minute ou 3 euros par appel.");
                            break;
                    }
                    break;
                case "30","31":
                    type = new String("Il s'agit d'un numéros courts à tarification gratuite");
                    break;
                case "32","33","34","35","36","37","38","39":
                    type = new String("Il s'agit d'un numéros courts à tarification banalisée ou majorée (inférieur à 0.8 € la minute ou 3 € l'appel)");
                    break;
                case "10":
                    type = new String("Il s'agit d'un numéros courts d'assistance opérateur (inférieur à 0.8 € la minute ou 3 € l'appel)");
                    break;
                default:
                    if (numero.substring(0,3).equals("118")) {
                        type = new String("Il s'agit d'un numéros courts de renseignements téléphoniques prix libre");
                    }
                    break;
            }
            System.out.println("Provenance: " + provenance);
            System.out.println("Région: " + region);
            System.out.println("Région précise: " + regionprecise);
            System.out.println("Opérateur: " + operateur);
            System.out.println("Type de numéro: " + type);
        }
    }
}
