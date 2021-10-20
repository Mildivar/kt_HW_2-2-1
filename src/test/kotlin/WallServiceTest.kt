import org.junit.Assert.*
import org.junit.Test

class WallServiceTest {
    @Test
    fun add() {
        val service = WallService()
        val actual = service.add(Post(id = 1))
        val result = Post(id = 2)
        assertEquals(actual, result)
    }

    @Test
    fun update_Existing() {
        val service = WallService()
        service.add(Post(id = 0))
        service.add(Post(id = 2))
        val update = Post(id = 3)
        val result = service.update(update)
        assertTrue(result)
    }

    @Test
    fun update_NotExisting() {
        val service = WallService()
        service.add(Post(id = 0))
        service.add(Post(id = 2))
        val update = Post(id = -2)
        val result = service.update(update)
        assertFalse(result)
    }

}
