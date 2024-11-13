package Bichinho;

import java.util.Scanner;

public class bichinhoVirtual {
    private String nome;
    private String classe;
    private String familia;
    private int idade;
    private boolean vivo;
    private int caloria;
    private int forca;
    
    private void animaComer() {
    	System.out.println("\n*Hmmm... delicioso!*");
        System.out.println("\n (◕ 0 ◕)");
        System.out.println("_____🍝_🥛___");
        esperar(500);
        System.out.println("\n*Mmm... mais um pouquinho!*");
        System.out.println("\n (◕ -,◕)");
        System.out.println("___🥣_🍝_🥛___");
        esperar(500);
        System.out.println("\n*Já estou satisfeito...*");
        System.out.println("\n (・ω・)-👍✨");
        System.out.println("___🥣🥣🥛_____");
        esperar(500);
    }
    
    private void animaCorrer() {    
        System.out.println("\n*Run, run, run*");
        System.out.println("\n '-(＾▽＾ )-,");
        System.out.println("____'-/_💨💨💨____");
        System.out.println("*****************");
        esperar(500);
        System.out.println("\n ,-(＾▽＾')-'");
        System.out.println("____/ '-_💨💨💨___");
        System.out.println("*****************");
        esperar(500);
        System.out.println("\n (ง •̀▽•́)ง");
        System.out.println("___🦵🦵___🏆🏟️____");
        System.out.println("*****************");
        esperar(500);
    }
    
    private void animaDormir() {
    	System.out.println("\n" + nome + " está indo dormir...");
        System.out.println("\n 🌙 (◕︵◕) ");
        System.out.println("_____-'|___🛏__");
        esperar(500);
        System.out.println("\n__[(-_-)]__Zzz...");
        esperar(500);
        System.out.println("\n__[(-_- )]__Zzzz...");
        esperar(500);
        System.out.println("\n*sonhando*");
        System.out.println("\n__[( -‿-)]__💤Zzzz...");
        esperar(500);
        System.out.println("\n__[(-_-)]__ Zzz... 🌙");
        esperar(500);
        System.out.println("\n*despertador tocando... *");
        System.out.println("\n⏰🎶__[(◕_◕)]__... 🌞");
        esperar(500);
        System.out.println("\n" + nome + " acordou...");
        System.out.println("\n (＾▽＾)-👍✨");
        System.out.println("__/ |_______");
        esperar(500);
    }
    
    private void animaMorrer() {
    	System.out.println("\n" + nome + " sente sua energia se esvaindo...");
        System.out.println("\n 🍂(T⌓T)🍂 ");
        esperar(500);
    	System.out.println("\nA vida está indo embora...");
        System.out.println("\n ✝️(×_×)✝️ ");
        esperar(500);
        System.out.println("\n"+ nome + " está dando o seu último suspiro...");
        System.out.println("\n  ✨(╥﹏╥)✨ ");
        esperar(500);
        System.out.println("\n"+ nome + " desapareceu na luz...");
        System.out.println("\n  ✨💀✨ ");
        esperar(500);
        System.out.println("\n\033[31m"); 
        System.out.println("-----------");
        System.out.println(" 🪦RIP🪦  "); 
        System.out.println("-----------");
        System.out.println("\n*Em memória de " + nome + "*");
        esperar(500);
    }
    
    private void esperar(int ms) {
        try {
            Thread.sleep(ms);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
    
    public bichinhoVirtual(String nome, String classe, String familia) {
        this.nome = nome;
        this.classe = classe;
        this.familia = familia;
        this.idade = 0;
        this.vivo = true;
        this.caloria = 10;
        this.forca = 10;
    }
    
    public void comer() {
        if (vivo && caloria < 100) {
            animaComer();
            caloria = Math.min(caloria + 10, 100);
            forca = Math.max(forca - 2, 0);
            System.out.println(nome + " comeu! Calorias: " + caloria + ", Força: " + forca);
        } else if (!vivo) {
            System.out.println(nome + " está morto e não pode comer.");
        } else {
            System.out.println(nome + " já está de barriguinha cheia!");
        }
    }
    
    public void correr() {
        if (vivo && caloria > 0) {
            animaCorrer();
            caloria = Math.max(caloria - 5, 0);
            forca = Math.max(forca - 5, 0);
            System.out.println(nome + " correu! Calorias: " + caloria + " Força: " + forca);
        } else if (!vivo) {
            System.out.println(nome + " está morto e não pode correr.");
        } else {
            System.out.println(nome + " está exausto e não pode correr.");
        }
    }
    
    public void dormir() {
        if (vivo) {
            animaDormir();
            forca = Math.min(forca + 10, 100);
            caloria = Math.max(caloria - 2, 0);
            System.out.println(nome + " dormiu. Força: " + forca + ", Calorias: " + caloria);
        } else {
            System.out.println(nome + " está morto e não pode dormir.");
        }
    }
        
    public void morrer() {
        vivo = false;
        forca = 0;
        animaMorrer();
        System.out.println("\n\n\033[31m GAME OVER.");
    }
    
    public boolean isVivo() {
        return vivo;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Crie seu novo animal");
        System.out.print("Insira o nome: ");
        String nome = scanner.nextLine();
        System.out.print("Insira a classe: ");
        String classe = scanner.nextLine();
        System.out.print("Insira a família: ");
        String familia = scanner.nextLine();
        
        bichinhoVirtual Bichinho = new bichinhoVirtual(nome, classe, familia);
        System.out.println("O animal se chama " + Bichinho.nome + " é da classe " + Bichinho.classe + " da família " + Bichinho.familia + ". O animal possui força " + Bichinho.forca + ", caloria de " + Bichinho.caloria + " e idade " + Bichinho.idade + ".");
    
        while (Bichinho.isVivo()) {
            System.out.println("\nO que o " + Bichinho.nome + " vai fazer agora?");
            System.out.println("1- Comer\n2- Correr\n3- Dormir\n4- Morrer");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();
            
            switch (opcao) {
            case 1:
                Bichinho.comer();
                break;
            case 2:
                Bichinho.correr();
                break;
            case 3:
                Bichinho.dormir();
                break;
            case 4:
                Bichinho.morrer();
                break;
            default:
                System.out.println("Opção inválida.");
        }
    
    }
    
        scanner.close();
    
    }

}