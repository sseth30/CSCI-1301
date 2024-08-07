# `Adventure.java` Example Prompts

> [!IMPORTANT]
This document outlines several interactions with `Adventure.java`, a text-based adventure game program.
> This program details specific scenarios and user commands that guide the player through the game, including navigating rooms, collecting items, and interacting with the environment. The player will traverse across many different terrains in hopes of opening the `chest`, all while avoiding being eaten by the evil `Grue`. Make sure to set `simpleMap = false` for the full game, enjoy!
> 

## Example 1: Simple Map `(simpleMap = true)`

- **Welcome to UGA Adventures: Episode 1**
- **The Adventure of the Cave of Redundancy Adventure**
- **By: Satchit Seth**
- **This is the one room map. Everything you need is here!!**
- `get key`
  >- _**OK**_
- `open chest`
  >- _**The chest is locked**_
- `unlock chest`
  >- _**OK**_
- `open chest`
  >- _**all the gold**_

## Example 2: Full Map `(simpleMap = false)`

- **Welcome to UGA Adventures: Episode 1**
- **The Adventure of the Cave of Redundancy Adventure**
- **By: Satchit Seth**
- **FOREST TRAIL:**
  - You are standing on a dirt trail that leads to the east. Surrounding you is the famously thick underbrush of Oconee Forest Park, the fall leaves falling off the trees have just started to poke holes in the canopy. Off in the distance you hear the cool sounds of Lake Herrick drifting through the trees.
- `look`
  >- _**FOREST TRAIL: You are standing on a dirt trail that leads to the east. Surrounding you is the famously thick underbrush of Oconee Forest Park, the fall leaves falling off the trees have just started to poke holes in the canopy. Off in the distance you hear the cool sounds of Lake Herrick drifting through the trees. Exits are: east**_
- `east`
  >- _**WOODEN WALKWAY: The wooden walkway makes a :clump: as you stride along it. Frogs give a terrified SKRIP! and jump to safety as your adventurous frame comes into view. A mountain biker, ignoring the many "Fragile Habitat" signs, speeds along a narrow dirt path to your right. As you reach the end of the walkway, you notice a hole in the ground in a newly fallen tree's footprint, just large enough for you to fit through.**_
- `look`
  >- _**WOODEN WALKWAY: The wooden walkway makes a :clump: as you stride along it. Frogs give a terrified SKRIP! and jump to safety as your adventurous frame comes into view. A mountain biker, ignoring the many "Fragile Habitat" signs, speeds along a narrow dirt path to your right. As you reach the end of the walkway, you notice a hole in the ground in a newly fallen tree's footprint, just large enough for you to fit through. There is an old oil lamp that was made long ago here. Exits are: east, west**_
- `get lamp`
  >- _**OK**_
- `east`
  >- _**It is pitch black, you can't see anything. You may be eaten by a grue!**_
- `light lamp`
  >- _**OK**_
- `look`
  >- _**CAVE ENTRANCE: The damp earthen crawlspace gives you claustrophobic thoughts as you crawl through its damp earth. Fortunately, the passageway soon grows large enough for you to stand, though slightly bent over. The air smells of rotting wood, and a rotting wood smell hangs thick in the air. Exits are: east, west**_

(_The rest of the example have been omitted for the sake of space and clarity._)

## Example 3: Player is Eaten by a Grue

- **Welcome to UGA Adventures: Episode 1**
- **The Adventure of the Cave of Redundancy Adventure**
- **By: Satchit Seth**
- **FOREST TRAIL:**
  - You are standing on a dirt trail that leads to the east. Surrounding you is the famously thick underbrush of Oconee Forest Park, the fall leaves falling off the trees have just started to poke holes in the canopy. Off in the distance you hear the cool sounds of Lake Herrick drifting through the trees.
- `east`
  >- _**WOODEN WALKWAY: The wooden walkway makes a :clump: as you stride along it. Frogs give a terrified SKRIP! and jump to safety as your adventurous frame comes into view. A mountain biker, ignoring the many "Fragile Habitat" signs, speeds along a narrow dirt path to your right. As you reach the end of the walkway, you notice a hole in the ground in a newly fallen tree's footprint, just large enough for you to fit through.**_
- `east`
  >- _**It is pitch black, you can't see anything. You may be eaten by a grue!**_
- `west`
  >- _**You have stumbled into a passing grue, and have been eaten**_

> [!TIP]
> Try completing the game all by yourself! Do not look at the end of `Map.java` or else the surprise will be spoilt!
