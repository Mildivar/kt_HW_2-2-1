import java.lang.NullPointerException

class WallService {
    private var posts = emptyArray<Post>()
    private var comments = emptyArray<Comment>()

    fun add(post: Post): Post {
        val newPost = post.copy()
        posts += newPost
        newPost.id = if (posts.isNotEmpty()) posts.last().id + 1 else 0
        return newPost
    }

    fun update(post: Post): Boolean {
        for ((index, oldPost) in posts.withIndex())
            if (post.id < 0) return false
            else if (oldPost.id == post.id) {
                val updatedPost = post.copy(ownerId = oldPost.ownerId, date = oldPost.date)
                posts[index] = updatedPost
                return true
            }
        return false
    }

    fun createComment(comment: Comment):Comment{
        val newComment = comment
        for (posted in posts){

                if (posted.id == newComment.post_id) {
                    comments += newComment
                    return newComment
                }
                 throw PostNotFoundException("PostNotFoundException")
    }
        return newComment
}
}