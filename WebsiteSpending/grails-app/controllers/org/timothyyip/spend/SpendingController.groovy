package org.timothyyip.spend

class SpendingController {
    def index = { redirect(action:home) }
    def home = {
        def detailsList = Details.list()
        def word = Details.count();
        [word:word,detailsList:detailsList]
    }

def scaffold = Details
}
