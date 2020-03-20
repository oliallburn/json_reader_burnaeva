import java.io.Serializable

import sparkss.SparkSessionWrapper
import service.{WineObjmodel}

object JsonReader extends App {

  final val advice = "Set the arg as path to winemag.json"

  override def main(args: Array[String]): Unit = {
    if (args.length != 1) println(advice)
    else new WineObjmodel(SparkSessionWrapper.spark)
      .mapper(args.toList.head)
  }
}
