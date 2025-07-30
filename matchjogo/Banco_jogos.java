package matchjogo;

public class Banco_jogos {
    private String[] jgsalvos;
    private double[] medias;
    
    public void set_jogos(){
        this.jgsalvos = new String[]{
            "The Witcher 3", "Baldur's Gate 3", "Cyberpunk 2077", "Elden Ring", "Dark Souls 3",
            "Red Dead Redemption 2", "Grand Theft Auto V", "Skyrim", "Fallout 4", "Mass Effect Legendary Edition",
            "Call of Duty Modern Warfare", "Counter Strike Global Offensive", "Valorant", "Rainbow Six Siege", "Apex Legends",
            "Battlefield 1", "Overwatch", "Halo Infinite", "Destiny 2", "Escape From Tarkov",
            "StarCraft II", "Age of Empires IV", "Civilization VI", "Total War Warhammer III", "Company of Heroes 3",
            "League of Legends", "Dota 2", "Heroes of the Storm", "Warcraft III Reforged", "Crusader Kings III",
            "Devil May Cry 5", "Bayonetta 3", "God of War Ragnarok", "Sekiro Shadows Die Twice", "Nier Automata",
            "Metal Gear Rising Revengeance", "Monster Hunter World", "Assassin's Creed Valhalla", "Ghost of Tsushima", "Horizon Forbidden West",
            "Microsoft Flight Simulator", "The Sims 4", "Euro Truck Simulator 2", "Farming Simulator 22", "Gran Turismo 7",
            "Forza Horizon 5", "F1 24", "Train Sim World 4", "Football Manager 2024", "Animal Crossing New Horizons",
            "Hollow Knight", "Hades", "Celeste", "Stardew Valley", "Dead Cells",
            "Slay the Spire", "Cuphead", "Valheim", "Terraria", "RimWorld",
            "Clash Royale", "Clash of Clans", "PUBG Mobile", "Mobile Legends", "Call of Duty Mobile",
            "Free Fire", "Genshin Impact", "Among Us", "Roblox", "Candy Crush Saga",
            "Hogwarts Legacy", "Alan Wake 2", "Resident Evil 4 Remake", "Resident Evil Village", "Silent Hill 2 Remake",
            "Dead Space Remake", "The Last of Us Part I", "The Last of Us Part II", "Uncharted 4", "A Plague Tale Requiem",
            "FIFA 24", "eFootball 2024", "NBA 2K24", "Madden NFL 24", "Rocket League",
            "Skate 4", "Riders Republic", "Tony Hawk's Pro Skater 1+2", "Wii Sports",
            "Gran Turismo Sport", "Forza Motorsport 8", "F1 Manager 2024", "The Crew Motorfest",
            "Starfield", "No Man's Sky", "Outer Wilds", "Kerbal Space Program 2", "Destiny 2 The Final Shape"
        };
        this.medias = new double[]{
            21.57, 21.57, 31.57, 21.57, 21.57,
            31.57, 31.57, 21.57, 31.57, 21.57,
            48.57, 48.57, 48.57, 48.57, 48.57,
            48.57, 48.57, 48.57, 48.57, 48.57,
            78.57, 78.57, 78.57, 78.57, 78.57,
            78.57, 78.57, 78.57, 78.57, 78.57,  //30
            108.57, 108.57, 108.57, 108.57, 108.57,
            108.57, 108.57, 108.57, 108.57, 108.57,
            138.57, 138.57, 138.57, 138.57, 138.57,
            138.57, 138.57, 138.57, 138.57, 138.57,
            108.57, 108.57, 108.57, 108.57, 108.57,
            108.57, 108.57, 108.57, 108.57, 108.57,
            168.57, 168.57, 168.57, 168.57, 168.57,
            168.57, 168.57, 168.57, 168.57, 168.57, //70
            31.57, 31.57, 31.57, 31.57, 31.57,
            31.57, 31.57, 31.57, 31.57, 31.57,
            48.57, 48.57, 48.57, 48.57, 48.57, //85
            48.57, 48.57, 48.57, 48.57, //89
            138.57, 138.57, 138.57, 138.57,
            31.57, 31.57, 31.57, 31.57, 48.57 //98
        };
    }

    public void compara(double media){
        boolean encontrou = false;
        System.out.println("Jogos com média semelhante a " + media + ":");

        for(int i = 0; i < jgsalvos.length; i++){
            if (Math.abs(media - this.medias[i]) <= 6){
                System.out.println("- " + this.jgsalvos[i] + " (Média: " + this.medias[i] + ")");
                encontrou = true;
            }
        }

        if (!encontrou){
            System.out.println("Nenhum jogo encontrado com média semelhante.");
        }
    }

    public String busca(double media){
        StringBuilder resultado = new StringBuilder();
        boolean encontrou = false;

        resultado.append("Jogos com média semelhante a ").append(media).append(":\n");

        for(int i = 0; i < jgsalvos.length; i++){
            if (Math.abs(media - this.medias[i]) <= 3){
                resultado.append("- ").append(jgsalvos[i])
                        .append(" (Média: ").append(medias[i]).append(")\n");
                encontrou = true;
            }
        }

        if (!encontrou){
            resultado.append("Nenhum jogo encontrado com média semelhante.");
        }

        return resultado.toString();
    }
}
