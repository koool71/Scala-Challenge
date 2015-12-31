import scala.util.control._

object hello{
  def main(args: Array[String]){
    
    val x = "A"
    val y = "Z"
    val officalTest = List(Map("startLocation" -> "Kruthika's abode", "endLocation" -> "Mark's crib", "distance" -> 9),
                 Map("startLocation" -> "Kruthika's abode", "endLocation" -> "Greg's casa", "distance" -> 4),
                 Map("startLocation" -> "Kruthika's abode", "endLocation" -> "Matt's pad", "distance" -> 18),
                 Map("startLocation" -> "Kruthika's abode", "endLocation" -> "Brian's apartment", "distance" -> 8),
                 Map("startLocation" -> "Brian's apartment", "endLocation" -> "Wesley's condo", "distance" -> 7),
                 Map("startLocation" -> "Brian's apartment", "endLocation" -> "Cam's dwelling", "distance" -> 17),
                 Map("startLocation" -> "Greg's casa", "endLocation" -> "Cam's dwelling", "distance" -> 13),
                 Map("startLocation" -> "Greg's casa", "endLocation" -> "Mike's digs", "distance" -> 19),
                 Map("startLocation" -> "Greg's casa", "endLocation" -> "Matt's pad", "distance" -> 14),
                 Map("startLocation" -> "Wesley's condo", "endLocation" -> "Kirk's farm", "distance" -> 10),
                 Map("startLocation" -> "Wesley's condo", "endLocation" -> "Nathan's flat", "distance" -> 11),
                 Map("startLocation" -> "Wesley's condo", "endLocation" -> "Bryce's den", "distance" -> 6),
                 Map("startLocation" -> "Matt's pad", "endLocation" -> "Mark's crib", "distance" -> 19),
                 Map("startLocation" -> "Matt's pad", "endLocation" -> "Nathan's flat", "distance" -> 15),
                 Map("startLocation" -> "Matt's pad", "endLocation" -> "Craig's haunt", "distance" -> 14),
                 Map("startLocation" -> "Mark's crib", "endLocation" -> "Kirk's farm", "distance" -> 9),
                 Map("startLocation" -> "Mark's crib", "endLocation" -> "Nathan's flat", "distance" -> 12),
                 Map("startLocation" -> "Bryce's den", "endLocation" -> "Craig's haunt", "distance" -> 10),
                 Map("startLocation" -> "Bryce's den", "endLocation" -> "Mike's digs", "distance" -> 9),
                 Map("startLocation" -> "Mike's digs", "endLocation" -> "Cam's dwelling", "distance" -> 20),
                 Map("startLocation" -> "Mike's digs", "endLocation" -> "Nathan's flat", "distance" -> 12),
                 Map("startLocation" -> "Cam's dwelling", "endLocation" -> "Craig's haunt", "distance" -> 18),
                 Map("startLocation" -> "Nathan's flat", "endLocation" -> "Kirk's farm", "distance" -> 3))
                 
      val test0 = List(
  	     Map("startLocation" -> "A", "endLocation" -> "F", "distance" -> 4),
  	     Map("startLocation" -> "A", "endLocation" -> "B", "distance" -> 4),
 	       Map("startLocation" -> "A", "endLocation" -> "G", "distance" -> 4),
  	     Map("startLocation" -> "B", "endLocation" -> "C", "distance" -> 5),
  	     Map("startLocation" -> "C", "endLocation" -> "D", "distance" -> 5),
  	     Map("startLocation" -> "F", "endLocation" -> "E", "distance" -> 5),
  	     Map("startLocation" -> "F", "endLocation" -> "G", "distance" -> 4),
  	     Map("startLocation" -> "E", "endLocation" -> "D", "distance" -> 3),
  	     Map("startLocation" -> "G", "endLocation" -> "C", "distance" -> 4),
  	     Map("startLocation" -> "G", "endLocation" -> "E", "distance" -> 6),
  	     Map("startLocation" -> "G", "endLocation" -> "B", "distance" -> 4))
  	     
  	   val test1 = List(
  	     Map("startLocation" -> "A", "endLocation" -> "B", "distance" -> 3),
  	     Map("startLocation" -> "A", "endLocation" -> "F", "distance" -> 2),
 	       Map("startLocation" -> "F", "endLocation" -> "E", "distance" -> 3),
  	     Map("startLocation" -> "B", "endLocation" -> "C", "distance" -> 1),
  	     Map("startLocation" -> "C", "endLocation" -> "E", "distance" -> 3),
  	     Map("startLocation" -> "B", "endLocation" -> "D", "distance" -> 3),
  	     Map("startLocation" -> "D", "endLocation" -> "I", "distance" -> 5),
  	     Map("startLocation" -> "C", "endLocation" -> "I", "distance" -> 2),
  	     Map("startLocation" -> "E", "endLocation" -> "H", "distance" -> 6),
  	     Map("startLocation" -> "F", "endLocation" -> "G", "distance" -> 2),
  	     Map("startLocation" -> "G", "endLocation" -> "M", "distance" -> 5),
	       Map("startLocation" -> "H", "endLocation" -> "M", "distance" -> 4),
  	     Map("startLocation" -> "I", "endLocation" -> "J", "distance" -> 3),
 	       Map("startLocation" -> "I", "endLocation" -> "K", "distance" -> 5),
  	     Map("startLocation" -> "I", "endLocation" -> "L", "distance" -> 4),
  	     Map("startLocation" -> "L", "endLocation" -> "O", "distance" -> 3),
  	     Map("startLocation" -> "L", "endLocation" -> "N", "distance" -> 4),
  	     Map("startLocation" -> "N", "endLocation" -> "T", "distance" -> 5),
  	     Map("startLocation" -> "K", "endLocation" -> "P", "distance" -> 5),
  	     Map("startLocation" -> "P", "endLocation" -> "Q", "distance" -> 4),
  	     Map("startLocation" -> "Q", "endLocation" -> "Y", "distance" -> 8),
  	     Map("startLocation" -> "Q", "endLocation" -> "W", "distance" -> 4),
  	     Map("startLocation" -> "W", "endLocation" -> "Y", "distance" -> 7),
  	     Map("startLocation" -> "W", "endLocation" -> "X", "distance" -> 5),
         Map("startLocation" -> "K", "endLocation" -> "O", "distance" -> 3),
  	     Map("startLocation" -> "O", "endLocation" -> "R", "distance" -> 4),
 	       Map("startLocation" -> "O", "endLocation" -> "S", "distance" -> 5),
  	     Map("startLocation" -> "O", "endLocation" -> "V", "distance" -> 7),
  	     Map("startLocation" -> "S", "endLocation" -> "V", "distance" -> 2),
  	     Map("startLocation" -> "V", "endLocation" -> "Z", "distance" -> 9),
  	     Map("startLocation" -> "M", "endLocation" -> "T", "distance" -> 4),
  	     Map("startLocation" -> "T", "endLocation" -> "U", "distance" -> 3),
  	     Map("startLocation" -> "U", "endLocation" -> "Z", "distance" -> 6),
  	     Map("startLocation" -> "M", "endLocation" -> "N", "distance" -> 4),
  	     Map("startLocation" -> "N", "endLocation" -> "S", "distance" -> 3),
         Map("startLocation" -> "H", "endLocation" -> "N", "distance" -> 3),
         Map("startLocation" -> "H", "endLocation" -> "L", "distance" -> 2),
         Map("startLocation" -> "R", "endLocation" -> "W", "distance" -> 5),
         Map("startLocation" -> "N", "endLocation" -> "Z", "distance" -> 8))
         
       val errorTest = List(Map("startLocation" -> "A", "endLocation" -> "F", "distance" -> 4))
                 
    bestPath(x, y, test1)
 }
  
  def bestPath(start:String, end:String, maps:List[Map[String, Any]]) : Map[String, Any] =
  { 
     val size = maps.length
     val edges = Array.fill[Map[String, Any]](size)(Map("startLocation" -> " ", "endLocation" -> " ", "distance" -> 0))
     val used = Array.fill[String](size)("")
     
     var eIndex = 0
     var min = 1000000
     var bestMove = maps(0)
     var current = start
     var finished = false
     var total = 0
     var potDistance = 0
     var visitIndex = 0
     var endLocation = ""
     var startLocation = ""
     var count = 0
     var usedIndex = 0
     
     if(start.length < 1)
     {
       println("Error: Start location needs to be a string with a length of at least 1. Try again.")
       return null
     }
     else if(end.length < 1)
     {
       println("Error: End location needs to be a string with a length of at least 1. Try again.")
       return null
     }
     else if(maps.length < 2)
     {
       println("Error: The given map needs at least 2 edges in order for this program to be needed.") 
       return null
     }
     
     // Start of algorithm 
     
     while(current != end && !finished)
     {
         min = 99999999
         for(i <- maps)
          {
              // Look for edges coming from current Node and find the best match replacing each distance with the potential distance from the current node
              if(i("startLocation").asInstanceOf[String] == current && i("distance").asInstanceOf[Int] != -1 && i("distance").asInstanceOf[Int] != -2)
              {
                if(eIndex < size)
                {
                  potDistance = i("distance").asInstanceOf[Int] + total
                  endLocation = i("endLocation").asInstanceOf[String]
                  
                  // Check to see if node visited or not
                  for(i <- used)
                  {
                    if(i == endLocation)
                    {
                      potDistance = -1
                    }
                  }
                  val replace = Map("startLocation" -> current, "endLocation" -> endLocation, "distance" -> potDistance)
                  edges(eIndex) = replace  
                  eIndex = eIndex + 1
                }
              }
          }
         
         // Check all my possible edges I can take at this point and choose the one with the lowest potential distance value
         for(i <- 0 until eIndex)
         {
             if(edges(i)("distance").asInstanceOf[Int] < min && edges(i)("distance").asInstanceOf[Int] != -1 && edges(i)("distance").asInstanceOf[Int] != -2)
             {
                 min = edges(i)("distance").asInstanceOf[Int]
                 visitIndex = i
                 bestMove = edges(i)
             }
         }
         
         // Mark all edge's distances leading to visited nodes as -1 to avoid checking them again in further iterations
         endLocation = bestMove("endLocation").asInstanceOf[String]
         used(usedIndex) = endLocation
         usedIndex = usedIndex + 1
         var j = 0
        
         for(k <- edges)
         {
           if(edges(j)("endLocation").asInstanceOf[String] == endLocation)
           {
              startLocation = edges(j)("startLocation").asInstanceOf[String]
              val replace = Map("startLocation" -> startLocation, "endLocation" -> endLocation, "distance" -> -1)
              edges(j) = replace
              count = count + 1
           }
          j = j + 1
         } 
         startLocation = bestMove("startLocation").asInstanceOf[String]
         
         // Place a negative two for used edge to allow me to back track later and find each previous location of each node
         val replace = Map("startLocation" -> startLocation, "endLocation" -> endLocation, "distance" -> -2) 
         edges(visitIndex) = replace
         
         current = bestMove("endLocation").asInstanceOf[String]
         total = min
         
         // If all edges have been considered without a solution we're finished 
         if(count >= size)
         {
           finished = true
         }
         
         println(edges.mkString(""))
         println(count)
     }
     
     
     // If loop existed after considering all edges without hitting the final destination, then there isn't a possible path
     if(finished == true)
     {
       println("No possible path found between " + start + " and " + end + ".")
       return null 
     }
     
     // At this point I have my total distance length for the path, now I figure out the nodes in my path
     val nodes = Array.fill(size)("")
     val loop = new Breaks
     var lIndex = 1
     
     // Back track from the end to the beginning to find out what nodes I visited in my path
     while(current != start)
     {
       loop.breakable{
         for(i <- edges)
         {
             if(i("endLocation").asInstanceOf[String] == current && i("distance") == -2)
             {
                 current = i("startLocation").asInstanceOf[String]
                 nodes(lIndex) = current
                 loop.break
             }
         }
       }
       lIndex = lIndex + 1
     }
     
     // Ensure my output puts the nodes in the correct order for the path
     var path = ""
     for(i <- size - 1 to 0 by -1)
     {
       if(nodes(i).length > 0)
       {
         path = (path + nodes(i) + " => ")
       }
     }
     path = (path + end)
     val result = Map("distance" -> total, "path" -> path)
     
     
     
     println(result)
     return result
     
     
  }
  
 }