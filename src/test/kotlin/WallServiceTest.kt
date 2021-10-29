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

//    @Test
//    fun createComment_CommentIsExists(){
//        val service = WallService()
//        val actual = Comment(post_id = 9,text = "try")
//        val result = service.createComment(Comment(post_id = 32, text = "ttttry"))
//        assertEquals(result, actual)
//    }

    @Test(expected = PostNotFoundException::class)
    fun shouldThrow() {
        val service = WallService()
        service.add(Post(12))
        val expected = PostNotFoundException("PostNotFoundException") //Comment(post_id = 12)
        val actual = service.createComment(Comment(post_id = 14))
        assertEquals(expected, actual)
    }
}
