object MyTestBenchMain{


  def main(args: Array[String]): Unit ={


    def f(num:Int) : List[Int] = {
      val list = scala.collection.mutable.ListBuffer.empty[Int].toList
      var i = 0
      while (i < num){ {list:++ i; i=i+1}}

      print(list + "\n")
      return list
    }


f(10)

  }


}