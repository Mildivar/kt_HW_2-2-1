class Attachment() : Attachments(type = String()){
    private val attachments = mutableListOf<Attachments>()
     fun addNewAttach(type:String):Attachments
    {
        when (type) {
            "video" ->{

                attachments += VideoAttachment(Video())
                println(type.last())
//                return attachments.last()
            }
            "photo" ->{
                attachments += PhotoAttachmentt(Photo())
                println(type.last())
//                return attachments.last()
            }
            }
        return attachments.last()
        }
}
