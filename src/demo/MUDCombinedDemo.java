class MUDCombinedDemo {
    public static void main(String[] args) {
        Room room1 = new Room("Treasure Room", "Filled with gold");
        NPC boss = new NPC("Dragon", "Final Boss");
        
        Dungeon dungeon = new SimpleDungeonBuilder()
                .setDungeonName("Dark Cave")
                .addRoom(room1)
                .addNPC(boss)
                .build();
        
        System.out.println(dungeon);
        
        // Клонирование комнаты
        Room clonedRoom = room1.cloneEntity();
        System.out.println("Cloned Room: " + clonedRoom);
    }
}
