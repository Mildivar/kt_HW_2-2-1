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


//    @Test
//    fun addTest() {
//        val actual =
//            Post(
//                id = 6,
//                ownerId = 1,
//                fromId = 0,
//                createBy = 0,
//                date = "",
//                text = "",
//                replyOwnerId = 2123,
//                replyPostId = 14112,
//                friendsOnly = true,
//                comments = null,
//                copyright = null,
//                likes = null,
//                reposts = null,
//                views = null,
//                postType = "",
//                canPin = true,
//                canDelete = false,
//                canEdit = false,
//                isPinned = 0,
//                markedAsAds = true,
//                isFavorite = false,
//                donut = null,
//                postponedId = 12314
//            )
//
//
//        val result = WallService.add(Post(
//            id = 5,
//            ownerId = 1,
//            fromId = 0,
//            createBy = 0,
//            date = "",
//            text = "",
//            replyOwnerId = 2123,
//            replyPostId = 14112,
//            friendsOnly = true,
//            comments = null,
//            copyright = null,
//            likes = null,
//            reposts = null,
//            views = null,
//            postType = "",
//            canPin = true,
//            canDelete = false,
//            canEdit = false,
//            isPinned = 0,
//            markedAsAds = true,
//            isFavorite = false,
//            donut = null,
//            postponedId = 12314
//        )
//        )
//        assertEquals(actual, result)
//    }
//
//    @Test
//    fun updateTest() {
//        val service =
//            Post(
//                id = 0,
//                ownerId = 1,
//                fromId = 0,
//                createBy = 0,
//                date = "",
//                text = "",
//                replyOwnerId = 2123,
//                replyPostId = 14112,
//                friendsOnly = true,
//                comments = null,
//                copyright = null,
//                likes = null,
//                reposts = null,
//                views = null,
//                postType = "",
//                canPin = true,
//                canDelete = false,
//                canEdit = false,
//                isPinned = 0,
//                markedAsAds = true,
//                isFavorite = false,
//                donut = null,
//                postponedId = 12314
//            )
//
//        val result = WallService.update(
//            Post(
//                id = 0,
//                ownerId = 1,
//                fromId = 0,
//                createBy = 0,
//                date = "",
//                text = "retry",
//                replyOwnerId = 2123,
//                replyPostId = 14112,
//                friendsOnly = true,
//                comments = null,
//                copyright = null,
//                likes = null,
//                reposts = null,
//                views = null,
//                postType = "",
//                canPin = true,
//                canDelete = false,
//                canEdit = false,
//                isPinned = 0,
//                markedAsAds = true,
//                isFavorite = false,
//                donut = null,
//                postponedId = 12314
//            )
//        )
//
//        assertEquals(service, result)
//    }
//}