public class App {
    public static void main(String[] args) throws Exception {

        Carro basico = new Carro("Basico", TipoCombustivel.GASOLINA, 10, 55);
        Carro esportivo = new Carro("Esportivo", TipoCombustivel.GASOLINA, 6, 45);
        Carro utilitario = new Carro("Utilitario", TipoCombustivel.GASOLINA, 5, 70);
        Carro suv = new Carro("SUV", TipoCombustivel.FLEX, 8, 55);
        Carro suvFlex = new Carro("SUVFlex", TipoCombustivel.FLEX, 8, 65);

        Carro econo = new Carro("Econo", TipoCombustivel.GASOLINA, 10, 55);
        // O consumo deste quando novo é de 20 Km/litro, 
        //porém este consumo reduz 1 Km/litro a cada 5000 Km até que se estabiliza em 10 Km/litro.
        //Basico
        System.out.println("Tipos de veiculos:");
        System.out.println(basico);

        System.out.println("\n\n----------------");
        System.out.println("\nAbastencendo carro basico com gasolina");
        basico.abastece(TipoCombustivel.GASOLINA, 55);
        System.out.println(basico);
        System.out.println("\nViajando com o carro basico");
        basico.viaja(250);
        basico.viaja(150);
        System.out.println(basico);

        //Esportivo
        System.out.println("Tipos de veiculos:");
        System.out.println(esportivo);

        System.out.println("\n\n----------------");
        System.out.println("\nAbastencendo carro esportivo com gasolina");
        esportivo.abastece(TipoCombustivel.GASOLINA, 45);
        System.out.println(esportivo);
        System.out.println("\nViajando com o carro esportivo");
        esportivo.viaja(250);
        esportivo.viaja(150);
        System.out.println(esportivo);

        //Utilitario
        System.out.println("Tipos de veiculos:");
        System.out.println(utilitario);

        System.out.println("\n\n----------------");
        System.out.println("\nAbastencendo carro utilitario com gasolina");
        utilitario.abastece(TipoCombustivel.GASOLINA, 70);
        System.out.println(utilitario);
        System.out.println("\nViajando com o carro utilitario");
        utilitario.viaja(250);
        utilitario.viaja(150);
        System.out.println(utilitario);

        //SUV
        System.out.println("Tipos de veiculos:");
        System.out.println(suv);

        System.out.println("\n\n----------------");
        System.out.println("\nAbastencendo carro SUV com gasolina");
        suv.abastece(TipoCombustivel.GASOLINA, 70);
        System.out.println(suv);
        System.out.println("\nViajando com o carro SUV");
        suv.viaja(250);
        suv.viaja(150);
        System.out.println(suv);

        
    }
    
}
