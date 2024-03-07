Problem Statement: The Currency Converter Challenge

Create a Java program that acts as a currency converter. The program should allow users to convert an amount from one currency to another, with support for multiple currencies. Implement a loop to allow users to make multiple conversions until they decide to exit the program.

Here are the specifications for the program:

1. Display a welcome message and provide a list of supported currencies along with their conversion rates to a base currency (e.g., USD).

2. Inside a loop, prompt the user to enter the amount they want to convert and the source currency.

3. Ask the user to select the target currency for the conversion.

4. Convert the amount from the source currency to the target currency using the provided conversion rates.

5. Display the converted amount along with a message, such as "Converted [source amount] [source currency] to [converted amount] [target currency]."

6. Ask the user if they want to make another conversion or exit the program.

7. Implement error handling to ensure that the user enters valid numeric input for the amount and selects valid currencies.

8. If the user decides to exit, display a farewell message and terminate the program.

Example Output:
```
Welcome to the Currency Converter!
Supported currencies:
1. USD (US Dollar)
2. EUR (Euro)
3. GBP (British Pound)
4. JPY (Japanese Yen)

Enter the amount you want to convert: 100
Enter the source currency (e.g., USD): USD
Select the target currency:
1. EUR
2. GBP
3. JPY
Enter the number corresponding to the target currency: 2

Converted 100 USD to 73.14 GBP.

Do you want to make another conversion? (yes/no): yes

Enter the amount you want to convert: 50
Enter the source currency (e.g., USD): EUR
Select the target currency:
1. USD
2. GBP
3. JPY
Enter the number corresponding to the target currency: 3

Converted 50 EUR to 6434.50 JPY.

Do you want to make another conversion? (yes/no): no

Thank you for using the Currency Converter! Goodbye!
```
