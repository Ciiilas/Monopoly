import org.scalatest.wordspec.AnyWordSpec
import org.scalatest.matchers.should.Matchers._
import de.htwg.se.monopoly._
class MonopolySpec extends AnyWordSpec {
  "Monopoly" should {
    "have a bar as String of form '┌──────────┬──────────┬──────────┬──────────┬──────────┬──────────┬──────────┬──────────┐'" in {
      barTop() should be("┌──────────┬──────────┬──────────┬──────────┬──────────┬──────────┬──────────┬──────────┐" + eol)
    }
    "have a scalable bar" in {}
  }
}
