import scala.collection.mutable.ListBuffer

object MyWorkBench {


  def main(args: Array[String]): Unit ={


    def f(num:Int) : ListBuffer[Int] = {
      val list = scala.collection.mutable.ListBuffer.empty[Int]
      (0 to num).foreach(i=>{list+=i})
      list.toList

      print(list + "\n")
      return list
    }





  }
}
