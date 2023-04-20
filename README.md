# BankAccountDemo



import random



class ATM:

    BankName = "SKEB Bank"

    CVV = int()

    SerialNumber = int()

    ExpiryDate = "05/27"

    PIN = int()

    Type = str()



    def __init__(self, Type, Pin):

        self.Type = Type

        self.PIN = Pin

        self.SerialNumber = random.randint(1111111111111111,9999999999999999)

        self.CVV = random.randint(111,999)



    def ATMdetails(self):

        print(f"Your ATM_Details are): \n"

              f"Bank name: {self.BankName}\n"

              f"CVV: {self.CVV}\n"

              f"Serial number: {self.SerialNumber}\n"

              f"Expiry date: {self.ExpiryDate}\n"

              f"Pin: {self.PIN}\n"

              f"Type: {self.Type}")





class BankAccount(ATM):



    account_name = str()

    account_number = str()

    account_balance = float()

    date_of_opening = str()

    ATM



    def makeATM(self,type,pin):

        if self.PIN.__sizeof__() > 4:

            print("Pin should be 4 digits.")

        elif self.PIN.__sizeof__() < 4:

            print("Pin should be 4 digits.")
        

        else:
            self.PIN = pin





        self.ATM = ATM(type,pin)





    def __init__( self,acct_name, date_of_opening, acct_balance):

        self.account_name=acct_name

        self.account_number=random.randint(1111111111,9999999999)

        self.account_balance=acct_balance

        self.date_of_opening=date_of_opening





    def deposit(self, amount):

        self.account_balance += amount

        print(f"₦{amount} has been deposited in your account.")

        print(f"Your available balance is: {self.account_balance}")





    def withdraw(self, amount):

        if amount > self.account_balance:

            print("Insufficient balance.")

        elif amount < 0:

            print("You can't withdraw money less than zero")

        else:

            self.account_balance-=amount

            print(f"₦{amount} has been withdraw from your account.")

            print(f"Your available balance is: {self.account_balance}")





    def check_balance(self):

        print(f"current balance is N{self.account_balance}.")





    def print_customer_details(self):

        print("Name: ",self.account_name)

        print("Account Number:", self.account_number)

        print("Date of opening:", self.date_of_opening)

        print(f"balance:₦{self.account_balance} \n")



# Initialization

Wale = BankAccount("Wale Banks", '02/02/2020', 3500)


Wale.makeATM("Visa", 1234)


Wale.ATM.ATMdetails()
