package jp.mkt.akka

import akka.actor.{ Actor, ActorSystem, Props }
import scala.io.StdIn

import jp.mkt.akka.actors.MyActor

object Main extends App {
  val system = ActorSystem("mySystem")

  val firstRef = system.actorOf(Props[MyActor], "first-actor")
  println(s"First Actor: $firstRef")
  firstRef ! "printit"
  println(">>> Press ENTER to exit <<<")
  try StdIn.readLine()
  finally system.terminate()
}

