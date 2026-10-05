import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class ShoppingCartTest {
    @Test
    void testAddItem() {
        ShoppingCart cart = new ShoppingCart();

        cart.addItem(100);

        assertEquals(1, cart.getItemCount());
    }
    @Test
    void testCalculateTotal() {
        ShoppingCart cart = new ShoppingCart();

        cart.addItem(100);
        cart.addItem(200);
        cart.addItem(50);

        assertEquals(350, cart.calculateTotal());
    }
    @Test
    void testRemoveItem() {
        ShoppingCart cart = new ShoppingCart();

        cart.addItem(100);
        cart.addItem(200);

        cart.removeItem(100);

        assertEquals(1, cart.getItemCount());
        assertEquals(200, cart.calculateTotal());
    }
    @Test
    void testCartIsEmpty() {
        ShoppingCart cart = new ShoppingCart();

        assertTrue(cart.isEmpty());
    }
}