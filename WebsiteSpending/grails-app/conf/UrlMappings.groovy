class UrlMappings {

    static mappings = {
		"/$controller/$action?/$id?"{
            constraints {
                // apply constraints here
            }
        }
<<<<<<< HEAD
                "/"(controller: "survey", action: "gotcontent")
		
        //"500"(view:'/error')
=======
                "/"(view: "index")
		
		"500"(view:'/error')
>>>>>>> da42659bd8b94a2adf548f9b9a16488e9c36ac9e
    }
}
