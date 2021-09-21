object WallService {
    var posts = emptyArray<Post>()

    fun add(post: Post): Post {
        val newPost = post.copy(id = if (posts.isNotEmpty()) posts.last().newId + 1 else 0)
        return newPost
    }

    fun update(post: Post): Boolean {
        TODO()
    }
}