# `Adventure.java` Example Prompts

> [!IMPORTANT]
This document outlines several interactions with `Adventure.java`, a text-based adventure game program.
> This program details specific scenarios and user commands that guide the player through the game, including navigating rooms, collecting items, and interacting with the environment.

## Example 1: Simple Map (simpleMap = true)

- **Welcome to UGA Adventures: Episode I**
- **The Adventure of the Cave of Redundancy Adventure**
- **By: Brad and Karen**
- **This is the one room map. Everything you need is here!!**
- Command: `get key`
  >- Response: _**OK**_
- Command: `open chest`
  >- Response: _**The chest is locked**_
- Command: `unlock chest`
  >- Response: _**OK**_
- Command: `open chest`
  >- Response: _**all the gold**_

## Example 2: Full Map (simpleMap = false)

- **Welcome to UGA Adventures: Episode I**
- **The Adventure of the Cave of Redundancy Adventure**
- **By: Brad and Karen**
- **FOREST TRAIL:**
  - You are standing on a dirt trail that leads to the east. Surrounding you is the famously thick underbrush of Oconee Forest Park, the fall leaves falling off the trees have just started to poke holes in the canopy. Off in the distance you hear the cool sounds of Lake Herrick drifting through the trees.
- Command: `look`
  >- Response: _**FOREST TRAIL: You are standing on a dirt trail that leads to the east. Surrounding you is the famously thick underbrush of Oconee Forest Park, the fall leaves falling off the trees have just started to poke holes in the canopy. Off in the distance you hear the cool sounds of Lake Herrick drifting through the trees. Exits are: east**_
- Command: `east`
  >- Response: _**WOODEN WALKWAY: The wooden walkway makes a :clump: as you stride along it. Frogs give a terrified SKRIP! and jump to safety as your adventurous frame comes into view. A mountain biker, ignoring the many "Fragile Habitat" signs, speeds along a narrow dirt path to your right. As you reach the end of the walkway, you notice a hole in the ground in a newly fallen tree's footprint, just large enough for you to fit through.**_
- Command: `look`
  >- Response: _**WOODEN WALKWAY: The wooden walkway makes a :clump: as you stride along it. Frogs give a terrified SKRIP! and jump to safety as your adventurous frame comes into view. A mountain biker, ignoring the many "Fragile Habitat" signs, speeds along a narrow dirt path to your right. As you reach the end of the walkway, you notice a hole in the ground in a newly fallen tree's footprint, just large enough for you to fit through. There is an old oil lamp that was made long ago here. Exits are: east, west**_
- Command: `get lamp`
  >- Response: _**OK**_
- Command: `east`
  >- Response: _**It is pitch black, you can't see anything. You may be eaten by a grue!**_
- Command: `light lamp`
  >- Response: _**OK**_
- Command: `look`
  >- Response: _**CAVE ENTRANCE: The damp earthen crawlspace gives you claustrophobic thoughts as you crawl through its damp earth. Fortunately, the passageway soon grows large enough for you to stand, though slightly bent over. The air smells of rotting wood, and a rotting wood smell hangs thick in the air. Exits are: east, west**_

## Example 3: Player is Eaten by a Grue

- **Welcome to UGA Adventures: Episode I**
- **The Adventure of the Cave of Redundancy Adventure**
- **By: Brad and Karen**
- **FOREST TRAIL:**
  - You are standing on a dirt trail that leads to the east. Surrounding you is the famously thick underbrush of Oconee Forest Park, the fall leaves falling off the trees have just started to poke holes in the canopy. Off in the distance you hear the cool sounds of Lake Herrick drifting through the trees.
- Command: `east`
  >- Response: _**WOODEN WALKWAY: The wooden walkway makes a :clump: as you stride along it. Frogs give a terrified SKRIP! and jump to safety as your adventurous frame comes into view. A mountain biker, ignoring the many "Fragile Habitat" signs, speeds along a narrow dirt path to your right. As you reach the end of the walkway, you notice a hole in the ground in a newly fallen tree's footprint, just large enough for you to fit through.**_
- Command: `east`
  >- Response: _**It is pitch black, you can't see anything. You may be eaten by a grue!**_
- Command: `west`
  >- Response: _**You have stumbled into a passing grue, and have been eaten**_

## Example 4: Collecting Items and Unlocking the Chest

- **Welcome to UGA Adventures: Episode I**
- **The Adventure of the Cave of Redundancy Adventure**
- **By: Brad and Karen**
- **CAVE ENTRANCE:**
  - The damp earthen crawlspace gives you claustrophobic thoughts as you crawl through its damp earth. Fortunately, the passageway soon grows large enough for you to stand, though slightly bent over. The air smells of rotting wood, and a rotting wood smell hangs thick in the air. Exits are: east, west
- Command: `look`
  >- Response: _**CAVE ENTRANCE: The damp earthen crawlspace gives you claustrophobic thoughts as you crawl through its damp earth. Fortunately, the passageway soon grows large enough for you to stand, though slightly bent over. The air smells of rotting wood, and a rotting wood smell hangs thick in the air. Exits are: east, west**_
- Command: `get lamp`
  >- Response: _**OK**_
- Command: `east`
  >- Response: _**It is pitch black, you can't see anything. You may be eaten by a grue!**_
- Command: `light lamp`
  >- Response: _**OK**_
- Command: `look`
  >- Response: _**CAVE INTERIOR: The cave walls are covered in ancient moss, giving off a faint glow. Exits are: north, south, west. There is a large, wooden, massive, oaken chest here with the word “CHEST” carved into it.**_
- Command: `open chest`
  >- Response: _**The chest is locked**_
- Command: `unlock chest`
  >- Response: _**OK**_
- Command: `open chest`
  >- Response: _**all the gold**_

Ensure to test your methods thoroughly and verify that your program adheres to the provided guidelines.

