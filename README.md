# Card Game Project

## Project Overview
This project is a simple Java-based card game that simulates typical card game mechanics, including drawing, discarding, shuffling cards, and calculating scores. Players have hands containing regular and special cards, with each card contributing points based on its number, color, and potential bonus points. The game determines the winner by comparing the total score of each player's hand.

## Features
- Representation of standard playing cards with color and number.
- Special cards that provide bonus points.
- Player hands with a maximum limit of 10 cards.
- Hand operations including adding, removing, shuffling, sorting, and scoring cards.
- Automatic calculation of the total score for each player.
- Identification of special cards in a hand.
- Game outcome determination (win, loss, or draw).

## Classes and Descriptions

### `Card.java`
Represents a standard playing card.
- **Fields**: `number`, `colour`.
- **Methods**:
  - `getNumber()`, `getColour()` – Accessors for card properties.
  - `toString()` – Returns a string representation of the card.
  - `equals(Object obj)` – Compares cards for equality.
  - `compareTo(Card other)` – Allows cards to be sorted based on their number.

### `SpecialCard.java`
Extends the `Card` class to include bonus points.
- **Fields**: `bonusPoints`.
- **Methods**:
  - `getBonusPoints()` – Returns the bonus points.
  - `toString()` – Displays card information along with bonus points.

### `Hand.java`
Represents a player's hand of cards and provides hand operations.
- **Fields**: `cards` (list of cards), `max_cards`.
- **Methods**:
  - `addCard(Card card)` – Adds a card if hand is not full.
  - `removeCard(int pos)` – Removes a card at a specified position.
  - `shuffleHand()` – Shuffles the cards in the hand.
  - `sortHand()` – Sorts cards in ascending order based on number.
  - `countSpecialCards()` – Returns the count of special cards.
  - `calculateValue()` – Computes the total score of the hand.
  - `toString()` – Returns string representation of all cards in the hand.

### `Project1Tester.java`
Main program that demonstrates the functionality of the card game.
- Creates regular and special cards.
- Assigns cards to two player hands.
- Performs operations such as shuffling, adding, and removing cards.
- Counts special cards and calculates scores.
- Prints each player's hand and score.
- Determines and prints the winner.

## Installation
1. Ensure Java Development Kit (JDK) is installed on your system.
2. Clone or download the project files.
3. Compile the Java files using:
   ```bash
   javac Card.java SpecialCard.java Hand.java Project1Tester.java
   ```
4. Run the program using:
  ```bash
  java Project1Tester
  ```
## Usage
The program automatically executes a sample game with two players.
The console output displays:
- Shuffled hands
- Card additions/removal
- Special card count
- Scores for each player
- Winner or draw result

## Example Output
```Plaintext
Hand has been shuffled.
Hand has been shuffled.
Player 1 has removed a card!
Player 1 has drawn a new card!
Player 2 had 1 special cards.
Player 1's hand: [blue 4, red 2, yellow 2, red 4, red 3]
Player 2's hand: [red 2, yellow 3, yellow 2, blue 8 (Bonus Points: 30), red 1, red 4]
Player 1's score: 66
Player 2's score: 86
Player 2 wins!
```
