import org.junit.Assert.*
import org.junit.Test

class WallServiceTest {

    @Test
    fun addTest() {
        val actual =
            Post(
                id = 6,
                ownerId = 1,
                fromId = 0,
                createBy = 0,
                date = "",
                text = "",
                replyOwnerId = 2123,
                replyPostId = 14112,
                friendsOnly = true,
                comments = null,
                copyright = null,
                likes = null,
                reposts = null,
                views = null,
                postType = "",
                canPin = true,
                canDelete = false,
                canEdit = false,
                isPinned = 0,
                markedAsAds = true,
                isFavorite = false,
                donut = null,
                postponedId = 12314
            )


        val result = WallService.add(Post(
            id = 5,
            ownerId = 1,
            fromId = 0,
            createBy = 0,
            date = "",
            text = "",
            replyOwnerId = 2123,
            replyPostId = 14112,
            friendsOnly = true,
            comments = null,
            copyright = null,
            likes = null,
            reposts = null,
            views = null,
            postType = "",
            canPin = true,
            canDelete = false,
            canEdit = false,
            isPinned = 0,
            markedAsAds = true,
            isFavorite = false,
            donut = null,
            postponedId = 12314
        )
        )
        assertEquals(actual, result)
    }

   @Test
   fun updateTest() {
       val service =
           Post(
               id = 0,
               ownerId = 1,
               fromId = 0,
               createBy = 0,
               date = "",
               text = "",
               replyOwnerId = 2123,
               replyPostId = 14112,
               friendsOnly = true,
               comments = null,
               copyright = null,
               likes = null,
               reposts = null,
               views = null,
               postType = "",
               canPin = true,
               canDelete = false,
               canEdit = false,
               isPinned = 0,
               markedAsAds = true,
               isFavorite = false,
               donut = null,
               postponedId = 12314
           )

       val result = WallService.update(
           Post(
               id = 0,
               ownerId = 1,
               fromId = 0,
               createBy = 0,
               date = "",
               text = "retry",
               replyOwnerId = 2123,
               replyPostId = 14112,
               friendsOnly = true,
               comments = null,
               copyright = null,
               likes = null,
               reposts = null,
               views = null,
               postType = "",
               canPin = true,
               canDelete = false,
               canEdit = false,
               isPinned = 0,
               markedAsAds = true,
               isFavorite = false,
               donut = null,
               postponedId = 12314
           )
       )

       assertEquals(service, result)
   }
}
