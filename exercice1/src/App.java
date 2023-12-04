import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner lecture = new Scanner(System.in);
        System.out.println("----------------------------------------------------------------------------");
        System.out.println("------------------------------TABLEAU DES EMPLOYES--------------------------");
        System.out.println("----------------------------------------------------------------------------");

        //Saisie du nombre des employes
        System.out.print("Entrez le nombre des emloyes : ");
        int nbre_employes = lecture.nextInt();

        String tab_employes[] = new String [nbre_employes];
        int tab_salaires[] = new int[nbre_employes];
        System.out.println("SAISIR LES NOMS DES VOS " + nbre_employes + " EMPLOYES");
        //Boucle pour entrer les employes
        for (int j = 0; j < nbre_employes; j++) {
            System.out.print("Employe numero " + (j+1) + " : "); 
            tab_employes[j] = lecture.next();
        }
        System.out.println("-------------------------------------------------------------------------------");
        System.out.println("SAISIR LES SALAIRES DES VOS " + nbre_employes + " EMPLOYES");
        //Boucle pour entrer les salaires des employes
        for (int j = 0; j < nbre_employes; j++) {
            System.out.print("Salaire de l'employe " + tab_employes[j] + " : ");
            tab_salaires[j] = lecture.nextInt();
        }
        //variables pour stocker le plus grand salaire et l'employe le mieux paye
        int salaire_grand = tab_salaires[0];
        String employeCher = tab_employes[0];
        //Boucle pour comparer les salaires des nos employes
        for(int i = 1; i < nbre_employes; i++){
            if (tab_salaires[i] > salaire_grand) {
                salaire_grand = tab_salaires[i];
                employeCher = tab_employes[i];
            }
        }
        //variables pour stocker le plus grand salaire et l'employe le moins paye
        int salaire_petit = tab_salaires[0];
        String employemoinsCher = tab_employes[0];
        //Boucle pour comparer les salaires des nos employes
        for(int i = 1; i < nbre_employes;i++){
            if (tab_salaires[i] < salaire_petit) {
                salaire_petit = tab_salaires[i];
                employemoinsCher = tab_employes[i];
            }
        }
        System.out.println("-------------------------------------------------------------------------------");

        int etat = 0;
        do {
            System.out.println("Ecrire 1 si vous voulez voir les stats");
            etat = lecture.nextInt();
        } while (etat != 1);
        System.out.println("-------------------------------------------------------------------------------");
        System.out.println("STATISTICS");
        if (etat == 1) {
            System.out.println("le plus grand salaire est : " + salaire_grand + " $" + " et est de " + employeCher);
            System.out.println("Le plus petit salaire est : " + salaire_petit + " $" + " et est de " + employemoinsCher);
        }

        System.out.println("------------------------------------------------------------------------------");

        lecture.close();
    }
}