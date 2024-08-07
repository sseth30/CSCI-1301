// For an overview of the program and sample inputs, be sure to check out `InteractiveFiction.md`

import java.util.Scanner;

public class Adventure {

    // Starting message
    public static void main(String[] args) {
        System.out.println("Welcome to UGA Adventures: Episode 1");
        System.out.println("The adventure of the Cave of Redundancy Adventure");
        System.out.println("By: Satchit Seth\n");

        // Instantiating objects
        Player player = new Player(0, 0);
        Map map = new Map();
        Lamp adventureLamp = new Lamp();

        Room currentRoom = map.getRoom(player.getX(), player.getY());
        printRoomDescription(currentRoom, player, map);
        Scanner scanner = new Scanner(System.in);
        boolean continueLoop = true;
        while (continueLoop) {

            currentRoom = map.getRoom(player.getX(), player.getY());
            adventureLamp = currentRoom.getLamp();


            // Commands are translated to lowercase and trimmed for extra spaces
            String command = scanner.nextLine().trim().toLowerCase();

            switch (command) {
                case "north":
                case "south":
                case "east":
                case "west":
                    move(command, player, currentRoom, map, adventureLamp);
                    break;
                case "look":
                    printRoomDescription(currentRoom, player, map);
                    printObjectsInRoom(currentRoom);
                    printExits(currentRoom, player);
                    break;
                case "get lamp":
                    getLamp(player, currentRoom);
                    break;
                case "light lamp":
                    lightLamp(player);
                    break;
                case "get key":
                    getKey(player, currentRoom);
                    break;
                case "unlock chest":
                    unlockChest(player, currentRoom);
                    break;
                case "open chest":
                    openChest(player, currentRoom);
                    break;
                default:
                    System.out.println("I'm sorry I don't know how to do that.");
                    break;
            }

        }

        scanner.close();

    }

    // Shorthand conditionals to move the character in the intended directions
    private static void move(String direction, Player player, Room currentRoom, Map map, Lamp lamp) {
        int x = player.getX();
        int y = player.getY();
        boolean canMove = false;

        switch (direction) {
            case "north":
                canMove = currentRoom.canGoNorth();
                x -= canMove ? 1 : 0;
                break;
            case "south":
                canMove = currentRoom.canGoSouth();
                x += canMove ? 1 : 0;
                break;
            case "east":
                canMove = currentRoom.canGoEast();
                y += canMove ? 1 : 0;
                break;
            case "west":
                canMove = currentRoom.canGoWest();
                y -= canMove ? 1 : 0;
                break;
        }
        Lamp playerLamp = player.getLamp();

        if (canMove) {
            if (currentRoom.isDark() && (playerLamp == null || !playerLamp.isLit())) {
                System.out.println("You have stumbled into a passing grue, and have been eaten");
                System.exit(0);
            }
            player.setX(x);
            player.setY(y);
            Room newRoom = map.getRoom(x, y);
            printRoomDescription(newRoom, player, map);
        } else {
            System.out.println("Can't go that way");
        }
    }


    private static void getLamp(Player player, Room room) {
        if (room.getLamp() != null) {
            player.setLamp(room.getLamp());
            room.clearLamp();
            System.out.println("OK");
        } else {
            System.out.println("No lamp present");
        }
    }

    private static void lightLamp(Player player) {
        Lamp lamp = player.getLamp();
        if (lamp != null) {
            lamp.turnOn();
            System.out.println("OK");
        } else {
            System.out.println("You don't have the lamp to light");
        }
    }

    // Grue warning
    private static void printRoomDescription(Room room, Player player, Map map) {
        String description = (!room.isDark() || (player.getLamp() != null && player.getLamp().isLit())) ? room.getDescription() :
            "It is pitch black, you can't see anything. You may be eaten by a grue!";
        System.out.println(description);
    }


    private static void printObjectsInRoom(Room room) {
        String message = "";
        if (room.getLamp() != null) {
            message += "There is an old oil lamp that was made long ago here.\n";
        }
        if (room.getKey() != null) {
            message += "You see the outline of a key on a dusty shelf that's covered in dust.\n";
        }
        if (room.getChest() != null) {
            message += "There is a large, wooden, massive, oaken chest here with the word \"CHEST\" carved into it.\n";
        }
        System.out.print(message);
    }


    // Prints the exits depending on the position/inventory of the player
    private static void printExits(Room room, Player player) {
        if (!room.isDark() || (player.getLamp() != null && player.getLamp().isLit())) {
            System.out.print("Exits are: " +
                (room.canGoNorth() ? "north " : "") +
                (room.canGoSouth() ? "south " : "") +
                (room.canGoEast() ? "east " : "") +
                (room.canGoWest() ? "west " : "") + "\n");
        }
    }


    private static void openChest(Player player, Room room) {
        Chest chest = room.getChest();
        if (chest != null) {
            if (chest.isLocked()) {
                System.out.println("The chest is locked");
            } else {
                System.out.println(chest.getContents());
                System.exit(0);
            }
        } else {
            System.out.println("No chest present");
        }
    }

    private static void unlockChest(Player player, Room room) {
        Chest chest = room.getChest();
        Key key = player.getKey();
        if (chest != null) {
            if (key != null) {
                chest.unLock(key);
                System.out.println("OK");
            } else {
                System.out.println("Need a key to do any unlocking!");
            }
        } else {
            System.out.println("No chest to unlock");
        }
    }

    private static void getKey(Player player, Room room) {
        if (room.getKey() != null) {
            player.setKey(room.getKey());
            room.clearKey();
            System.out.println("OK");
        } else {
            System.out.println("No key present");
        }
    }
}
