  object MyWorkBench {


  def main(args: Array[String]): Unit ={
    
    def randomPassword(len: Int): String = {
      val rand = new scala.util.Random(System.nanoTime)
      val sb = new StringBuilder(len)
      val ab = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz"
      for (i <- 0 until len) {
        sb.append(ab(rand.nextInt(ab.length)))
      }
      sb.toString
    }
    
    }
  }
