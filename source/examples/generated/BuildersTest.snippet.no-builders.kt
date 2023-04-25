val filter = Document().append("gender", "female").append("age", Document().append("\$gt", 29))
val projection = Document().append("_id", 0).append("email", 1)
val results = collection.find<Document>(filter).projection(projection)
