package jp.mkt.akka.actors

import akka.actor.{ Actor, Props }

class MyActor extends Actor {
  override def receive: Receive = {
    case "printit" => {
      val secondRef = context.actorOf(Props.empty, "second-actor")
      println(s"Second Actor: $secondRef")
    }
  }
}

