# Take it out String Game
 
User Manual
The user have the option to select who make the first move in the game, the computer or the player.
The game starts with a random numerical string each time a game is started. At the start of the game both the computer and player will have their score as 100. Each make move in sequential manner entering one number from the string and that number will be subtracted from the score. The game ends when the numerical string becomes empty. The one with the higher score wins the game.
The user will have option to play a new game after a game has ended or in the mid of the game by clicking on the button saying computer and player. Clicking computer button will start the game with the first move made by the computer. Clicking player button will start the game and the user needs to make the first move in the game.

There is a slit delay when starting the new game because of creation of the large game tree in the backend on the terminal.

The computer plays its move instantly the player clicks the enter button with his input choice so there is no delay in making moves by the computer.

Entering wrong input such as a random numerical value that is not present in the game string or any character or word that is not meant for the game won’t be consider as a valid input and hence no changes will occur only entering the correct number which is present in the string will make allow the game to proceed.

For Example:
Computer makes the first move in this.
Game String: [1,1,2,2,3]
Computer score = 100
Player score = 100

Step 1:
Computer choice - 1
Game String: [1,1,2,2,3]
Computer score = 99
Player score = 100

Step 2:
From the second turn the player needs to make the choice of string from the “Left Choice” Section
Player choice - 1
Game String: [1,1,2,2,3]
Left Choice: [2,2,3]
Computer score = 99
Player score = 99

Step 3:
Computer choice - 2
Game String: [1,1,2,2,3]
Left Choice: [2,3]
Computer score = 97
Player score = 99

Step 4:
Player choice - 2
Game String: [1,1,2,2,3]
Left Choice: [3]
Computer score = 97
Player score = 97

Step 5:
Computer choice - 3
Game String: [1,1,2,2,3]
Left Choice: [](empty)
Computer score = 94
Player score = 97

Player wins the game wins the game with higher score of 97.

GUI of the game:
![Screenshot 2022-04-06 at 12 22 40 PM](https://user-images.githubusercontent.com/61689173/161949315-84de7742-0e43-4aeb-8986-65bca7d5379a.png)
![Screenshot 2022-04-06 at 12 23 16 PM](https://user-images.githubusercontent.com/61689173/161949338-a39f6b5a-ffaf-4fa2-aa05-a0ae020d52f7.png)
![Screenshot 2022-04-06 at 12 23 52 PM](https://user-images.githubusercontent.com/61689173/161949351-e76839e2-5c7b-42be-95fc-8a8230af02dd.png)
![Screenshot 2022-04-06 at 12 24 16 PM](https://user-images.githubusercontent.com/61689173/161949361-5175d7e9-7ac3-4a96-a925-c1b6722951c6.png)
