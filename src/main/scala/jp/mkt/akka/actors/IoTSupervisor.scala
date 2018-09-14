package jp.mkt.akka.actors

import akka.actor.{ Actor, ActorLogging, Props }

object IoTSupervisor {
  def props(): Props = Props(new IoTSupervisor)
}

class IoTSupervisor extends Actor with ActorLogging {
  override def preStart(): Unit = println("IoT Application Started")
  override def postStop(): Unit = println("IoT Application Stopped")
  override def receive = Actor.emptyBehavior
}

