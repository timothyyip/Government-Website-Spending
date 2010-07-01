class UrlMappings {

    static mappings = {
		"/$controller/$action?/$id?"{
            constraints {
                // apply constraints here
            }
        }
                "/"(controller: "survey", action: "gotcontent")
		
        //"500"(view:'/error')
    }
}
