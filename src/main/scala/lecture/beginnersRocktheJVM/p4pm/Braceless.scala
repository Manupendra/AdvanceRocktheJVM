package lecture.beginnersRocktheJVM.p4pm

object Braceless extends App {

  // if - expression
  val anIfExpression = if (2 > 3) "bigger" else "smaller"

  // java - style
  val anIfExpression_v2 =
    if (2 > 3){
      "bigger"
    } else {
      "smaller"
    }

  // compact
  val anIfExpression_v3 =
    if (2 > 3) "bigger"
    else "smaller"



}
