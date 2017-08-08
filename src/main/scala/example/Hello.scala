package example

import nu.hegge.CurrentStatusProtos._


object Hello extends Greeting with App {
  println(greeting)
  println("test of protobuf in Scala with Java classes")
  val cs:currentstatus.Builder = currentstatus.newBuilder()

  val sData:String="0884DDA9CA0512034D61781DCDCCCC3D20012801"
  val x=hexStringToByteArray(sData)

  val data=Array[Byte](1.toByte,2.toByte)
  cs.mergeFrom(x)

  println(cs.toString())

  def hexStringToByteArray(s : String) = {
    val len = s.length();
    var data = new Array[Byte](len / 2)
    var i = 0

    while (i < len) {
      val b = (Character.digit(s.charAt(i), 16) << 4) +
        (Character.digit(s.charAt(i+1), 16))

      data(i / 2) = b.asInstanceOf[Byte]

      i+=2
    }

    data
  }

}

trait Greeting {
  lazy val greeting: String = "hello"
}

