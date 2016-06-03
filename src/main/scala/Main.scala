package proplogic

import scalajs.js.JSApp


object ProposionalLogic {

    implicit class BooleanRich(a:Boolean) {
        def :=>(b:Boolean):Boolean = !a && b
    }

}

object MyApp extends JSApp {

    import ProposionalLogic._

    def main() = {

      val res = (true :=> false) :=> true
      println(res)
      println(res.getClass) // --> boolean

    }
}
