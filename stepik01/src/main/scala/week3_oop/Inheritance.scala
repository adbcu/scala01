package stepik01.week3_oop

import java.util.concurrent.Flow.Subscriber

object Inheritance {

    class Button(label: String) {
      def this() = this("test")
      def click(): String = s"button -${label}- has been clicked"
    }
  //
  //
  //  class RoundedButton(label: String) extends Button(label) {
  //    override def click(): String = s"rounded ${super.click()}"
  //  }
  //
  //  class TestButton extends Button {
  //    override def click(): String = s"test ${super.click()}"
  //  }
  //
  //
  //  val button = new Button("label")
  //  println(button.click())
  //  val button2 = new RoundedButton("label2")
  //  println(button2.click())
  //--------------------------------------------------------------------------------------------------------------------------------
  //
  //  abstract class Event {
  //    def trigger(eventName: String): Unit
  //  }
  //
  //  class Listener(val eventName: String, var event: Event) {
  //    def register(evt: Event) { event = evt }
  //    def sendNotification() { event.trigger(eventName) }
  //  }
  //
  //  val notification: Listener = new Listener("mousedown", null)
  //  notification.register( evt = new Event {
  //    override def trigger(eventName: String): Unit = println(s"trigger ${eventName} event")
  //  })
  //  notification.sendNotification
  // --------------------------------------------------------------------------------------------------------------------------------

//  trait Configs {
//    val ACCOUNT_TYPE_DEFAULT = "free"
//    val ACCOUNT_TYPE_PAID = "paid"
//    val SUBSCRIPTION_STATUS = "active"
//  }
//
//  object Settings {
//    case class AccountSettings(
//                                email: String,
//                                password: String,
//                                picture: String)
//
//    case class SubscriptionSettings(
//                                     payment: String,
//                                     notifications: String,
//                                     expiration: String)
//  }
//
//  class Subscriber {
//    def subscribe(settings: Settings.SubscriptionSettings): Unit = println("subscribed")
//  }
//
//  class Unsubscriber {
//    def unsubscribe(): Unit = println("unsubscribed")
//  }
//
//  abstract class Account(accountID: String, settings: Settings.AccountSettings) {
//    def info(): Unit
//  }
//
//  class FreeAccount(accountID: String, settings: Settings.AccountSettings) extends Account(accountID, settings)with Configs {
//    override def info(): Unit = println(s"Account Type: $ACCOUNT_TYPE_DEFAULT")
//  }
//
//  class PaidAccount(accountID: String, settings: Settings.AccountSettings) extends Account(accountID, settings) with Configs {
//    override def info(): Unit = {
//      println(s"Account Type: $ACCOUNT_TYPE_PAID")
//      println(s"Subscription Status: $SUBSCRIPTION_STATUS")
//    }
//  }
//
//
//  val paidAccount = new PaidAccount(
//    accountID = "1",
//    settings = Settings.AccountSettings(
//      email = "test@mail.com",
//      password = "abr#45&",
//      picture = "link/to/some/pic"))
//
//  paidAccount.info()
//  paidAccount.unsubscribe()

}
