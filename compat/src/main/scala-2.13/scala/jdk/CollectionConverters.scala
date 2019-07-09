package scala.jdk

@if(!scala213)
import scala.collection.convert.{DecorateAsJava, DecorateAsScala}

@if(!scala213)
object CollectionConverters extends DecorateAsJava with DecorateAsScala
