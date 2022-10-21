In this private repository i have implemented these design patterns and relevant methods :

1- Facade
2-Bridge
3-Factory

Prerequisites:
The program needs relevant text data files needs to be added which includes sample credentials, menu options and user choices.

Step l: Login or authorizaton
-> Ask whether user is Buyer or Seller
     User Input Option: int(datatype)
     1 for Buyer
     2 for Seller
-> Then, based on the credentials included in the text file, checks the credentials in either the seller list or the buyer list, depending on the input that has already been provided.
-> If the credentials are correct, authentication will be successful and move on to step 2; otherwise, the appropriate result, such as Invalid data type or Invalid credentials, will be printed.
-> Used facade design pattern to implement step 1.

Step 2: Printing the  Menu
-> Ask the user to pick meat menu or produce monu
    1 for Meat
    2 for Produce
-> Based on the input, call the relevant function. Implemented factory design pattern here
-> On successful call to relevant function, display the menu. Implemented bridge design pattern.

Step 3: Print user choices
-> This stage involves calling the appropriate functions to display the person's product details, along with the buyers' and sellers' menus.
This factory design pattern is put into practice.