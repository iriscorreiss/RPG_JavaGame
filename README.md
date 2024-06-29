# RPG Java Game

## Description
This project is a practical implementation of an RPG (Role-Playing Game) using Object-Oriented Programming in Java. 
The player controls a Hero who navigates through a maze filled with obstacles and enemies, making choices to successfully complete the game.

## Table of Contents
1. [Description](#description)
2. [Installation](#installation)
3. [Usage](#usage)
4. [Game Mechanics](#game-mechanics)
5. [Classes and Structure](#classes-and-structure)
6. [Contributing](#contributing)
7. [License](#license)
8. [Authors and Acknowledgments](#authors-and-acknowledgments)
9. [Contact Information](#contact-information)

## Installation
To install and run this project, follow these steps:

1. **Clone the repository:**
    ```bash
    git clone https://github.com/iriscorreiss/RPG_JavaGame.git
    cd RPG_JavaGame
    ```
2. **Compile the project:**
    ```bash
    javac -d out/ src/**/*.java
    ```
3. **Run the game:**
    ```bash
    java -cp out/ Jogo
    ```

## Usage
To play the game, run the `Jogo` class. You will be prompted to select a Hero type, set difficulty, and allocate creation points. Navigate through the maze, battle enemies, collect items, and make strategic decisions to complete the game.

## Game Mechanics
- **Hero Types:** Choose from Knight, Sorcerer, or Archer, each with unique abilities and combat rules.
- **Difficulty Levels:** Easy or Hard, influencing initial creation points and starting gold.
- **Combat:** Turn-based system where Hero and NPCs attack based on specific rules.
- **Items:** Purchase and use items from the Vendedor to boost Hero abilities and health.
- **Maze Navigation:** Progress through rooms, facing enemies and collecting treasures.

## Classes and Structure
### Entities Package
- `Entidade`: Abstract class for all game entities.
- `Heroi`: Abstract class for hero characters.
- `NPC`: Class for non-playable characters.
- Subclasses: `Cavaleiro`, `Feiticeiro`, `Arqueiro`, `Vendedor`.

### Items Package
- `ItemHeroi`: Abstract class for items usable by heroes.
- Subclasses: `Arma`, `PocaoHP`.

### Game Package
- `Jogo`: Main class containing the game logic and labyrinth navigation.

## Contributing
Contributions are welcome! Please fork the repository and submit pull requests with your improvements. Ensure your code follows the project's coding standards and includes appropriate documentation.

## License
This project is licensed under the MIT License. See the [LICENSE](LICENSE) file for details.

## Authors and Acknowledgments
- **Iris Correia** - Initial work - [GitHub Profile](https://github.com/iriscorreiss)
- Acknowledgments to any libraries or third-party tools used.

## Contact Information
For questions or suggestions, please contact Iris Correia at [email@example.com].

