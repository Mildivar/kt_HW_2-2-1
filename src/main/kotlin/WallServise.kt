object WallService {
    private var posts = emptyArray<Post>()

    fun add(post: Post): Post {
        println(posts.size)
        posts += post
        println(posts.last())
        return post.copy(id = if (posts.isNotEmpty()) posts.last().id + 1 else 0)
    }

    fun update(post: Post): Boolean {
        for ((index, oldPost) in posts.withIndex())
            if (oldPost.id == post.id) {
                val updatedPost = post.copy(ownerId = post.ownerId, date = post.date)
                posts[index] = updatedPost
                return true
            }
        return false
    }
}