package scala_for_impatient.chapter05_classes

object excercise_02 extends App {
  class BankAccount() {
    private var _balance: Double = 0

    def deposit(amount: Int): Unit = {
      _balance += amount
    }

    def withdraw(amount: Int): Unit = {
      _balance -= amount
    }

    def balance: Double = _balance

  }

  //1
  val bankAccount = new BankAccount()
  println(s"bankAccount.balance = ${bankAccount.balance}")
  //2
  bankAccount.deposit(100)
  println(s"bankAccount.balance = ${bankAccount.balance}")
  //3
  bankAccount.withdraw(40)
  println(s"bankAccount.balance = ${bankAccount.balance}")

//  bankAccount.balance = 10

}
