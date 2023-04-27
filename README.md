# Minimax by Patricia von Oiste

## Background and Motivation
Nim is a game in which two players take turns removing objects from a certain number of piles. Each player removes at least one object, but they must come from the same pile. The objective of the game is to avoid taking the last object. The player who takes the last object looses the game and the other player wins. 

## Minimax algorithm
The minimax algorithm is a decision based strategy used to minimize the possible loss or worst case scenario and to maximize the chances of winning. The minmimax algorithm can be applied to zero-sum game theory, which covers cases where players alternate moves. Minimax is used to optimize your chances of winning given your opponents choices based on your move. The recursive element of minimax occurs when you continously call the minimax algorithm until you reach a base case of 0 pieces. Nim is a good test case for this algorithm because it is a two player, zero sum, alternating moves game and you remove a certain amount of pieces each game, so you will eventually reach 0 pieces.

## Usage
Someone should run my program by first hard coding the number of pieces that they are playing with in simple nim. For example, in my game I decide to use six pieces in only one pile. Next, they should call runGame in a file that is in the same directory as the NimRunner.java file. Upon calling runGame with the set number of hardcoded pieces, this will call all of the other helper methods and important methods like minimax and bestmove. The return value will be a boolean, either true or fale, of whether or not the player "player X" won the game of simple nim. The return value will be false if the bot, or the machine, wone the game.

## Future Directions and Improvements
An improvement that can be made to the code is to adapt simple num to work for different piles, and using multiple different pieces in each pile. While simple nim only has a set number of pieces in one pile, we can add another level of complexity by creating multiple piles with different number of pieces. We can do so by adapating the data structures that encapsulate the number of pieces that we are playing with. 

Another adaptation is to add user input functionality to my code, so that the user or the player will be able to put in the number of pieces that they want to remove from the pile. This will add a more human element to the game and simulate a real life scenario because upon playing in real life, each player can decide how many pieces to take from a pile. This will move the AI bot along the game tree based on the decision of the other player, and the other player will have to think about ways in which they can beat the bot.
 