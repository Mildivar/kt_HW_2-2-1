//class VideoAttachment: Attachments<Video> ()

data class VideoAttachment(var video: Video) : Attachments("video") {
//    fun addNNN() {
//        video = listOf(Video())
//    }
}