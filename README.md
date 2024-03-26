# Missile Runner Game
Missile Runner is a simple console-based game implemented in Java. The game is played on a 10x10 grid representing an island. The game involves two players and one enemy.

This game is a simple implementation and does not include any advanced features such as graphics or AI for the enemy. It is intended as a basic example of a game implemented in Java.

</br>

## 🕹 Game Setup
When the game starts, each player is asked for their game name. The first player is positioned in the bottommost left-hand corner of the island, and the second player is positioned at the topmost right-hand corner of the island. Each player’s health level is set to 5 and their energy is set to 3.

</br>

## 🎮 Gameplay
A player can move a number of units on the island, in the direction North, South, East, or West. For example, if player 1 specifies N7, they move North by 7 units. If player 2 specifies W6, they move West by 6 units.

If a player moves off the island, they fall into the water. In this case, they swim back the shortest route to the island, and they lose a unit of energy.

After each move, the player's details are shown. When a valid move has been made, the program outputs `<Name> is running <num hops> units <direction>`.

</br>

## 💣 The Enemy
The enemy can throw missiles at the player and begins with 10 missiles. The misisle's location are random.

- If the aim is directly at a player, the player loses 1 health point and the text `Player name + “You got hit!”` is output.
- If the aim is directly above, below, or beside the player, the player loses 0.5 health points and the text `Player Name, “You got grazed!”` is output.

## 👾 Game End
The game continues until the enemy runs out of missiles or until one players have 0 energy units or 0 health units. The program outputs a message indicating that the enemy has been defeated or that the player(s) survived.

</br>

## 💻 Requirements

The following requirements must be met:

* Install `java 17`.

</br>

## 🖱 How to run the game

To run the game, compile and run the `Main.java` file. Follow the prompts in the console to play the game.

</br>

## 📛 Developer

<table>
  <tr>
    <td align="center">
      <a href="#">
        <img src="https://avatars.githubusercontent.com/u/52295230?v=4" width="100px;" alt="Matheus Tecchio"/><br>
        <sub>
          <b>Matheus Tecchio</b>
        </sub>
      </a>
    </td>
  </tr>
</table>

  
## 📝 License

Licensed under the [MIT License](./LICENSE).

Copyright © 2024 [Matheus Tecchio](https://github.com/matheustecchio).

</br>
