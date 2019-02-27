# BankingAccountApp
Application to handle customer banking account. Reading .csv file of names, social security numbers, account type, and initial deposit. Useing a proper data structure to hold all these accounts. SavingAccount and PersonalAccount share the following properties:  deposit(), withdraw(), transfer(), showInfo(). 11-Digit Account Number ( generated with the following process: 1 or 2 depending on SavingAccount or PersonalAccount, last two digits of SecurityNr, unique 5-digit number and random 3-digit number). SavingAccount holders are assigned a debit card with a 12-digit number and 4-digit PIN. Both accounts use an interface that determines the base interest rate. SavingAccount use 25 points less than the base rate PersonalAccount use 15% of the base rate. The ShowInfo method show account information and specific information for the PersonalAccount and SavingAccount

 * Reading .csv file of names, social security numbers, account type, and initial deposit
 * Useing a proper data structure to hold all these accounts
 * SavingAccount and PersonalAccount share the following properties:
 - deposit()
 - withdraw()
 - transfer()
 - showInfo()
* 11-Digit Account Number ( generated with the following process: 1 or 2 depending on SavingAccount or PersonalAccount, last two
  digits of SecurityNr, unique 5-digit number and random 3-digit number)
* SavingAccount holders give a safety Box, identified by 3-digit number and accessed with 4-digit code
* PersonalAccount holders are assigned a debit card with a 12-digit number and 4-digit PIN
* Both accounts use an interface that determines the base interest rate.
- SavingAccount use 25 points less than the base rate
- PersonalAccount use 15% of the base rate
* The ShowInfo method show account information and specific information for the PersonalAccount and SavingAccount
