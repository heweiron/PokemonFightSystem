# InteractivePokemonGame

 
 
 ## Instructions
 * Build a two player PokemonBattle game/main method using your Pokemon object classes.
   * Two players will alternate turns on the same computer.
   
### Game Phase 1 - Game Setup
  * In the first phase of the game, each player will choose one Pokemon to battle with. There should be a menu offered to each player to choose one Pokemon to battle with.
    * The program should ask Player 1 to choose their Pokemon, then save it, and give an acknowledgement message.
    * Then it should ask Player 2 to choose their Pokemon, save it, and give an acknowledgement message.
  * After both Pokemon are chosen, the game should randomly choose which Player goes first.
### Game Phase 2 - Battling
 * In the second (main game play) phase of the game, the two players should alternate entering commands to attack until one Pokemon "faints" (reaches 0 HP).
 * The program should say something like: "It is Player 1's turn, what do you want to do?"
 * The options each player has during their turn should be:
   1. perform fastAttack
   2. perform specialAttack
   3. pass 
   
 * fastAttack and pass are always allowed. 
 * A player must "pass" at least three times in order to build up energy for a specialAttack.
   * You will have to develop a way to keep track of how many passes a player has made and when to allow the specialAttack as this is not part of the Pokemon objects.
   * After specialAttack is performed, the amount of accumulated passes should be reduced by 3.
 * The attacking functionality should use the Pokemon's performFastAttack and performSpecialAttack methods. The attacking player's Pokemon will call the method, with the other player's Pokemon as the "victim" parameter Pokemon.
  * The String returned by these methods should print to the screen.
 
 * You'll have to build a way to check the victim Pokemon's HP (hitPnts) after being attacked. This will be the sentinel value for the battle loop.
   * Once a Pokemon has its hitPnts reduced to 0, that signals the end of the game, with the other player as the winner.
   * Make sure to stop the game immediately when a Pokemon faints. There should not be another turn allowed!
 
### Game Phase 3 - Game Over
 * Once a player's Pokemon has fainted, the game should end and print out a congratulatory message to the winner.


# PokemonFight
