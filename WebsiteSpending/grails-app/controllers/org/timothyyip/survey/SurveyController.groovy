package org.timothyyip.survey
import org.timothyyip.spend.*
class SurveyController {

    def detailsList = Details.listOrderById()

    def index = { redirect(action:gotcontent) }
    def scaffold = Details

    def home = {
        [detailsList:detailsList]
    }

    def gotcontent = {
        [detailsList:detailsList]
    }

    def issatisfied= {
        [detailsList:detailsList]
    }

    def easeuse= {
        [detailsList:detailsList]
    }

    def attractive= {
        [detailsList:detailsList]
    }

    def finding= {
        [detailsList:detailsList]
    }

    def editorial= {
        [detailsList:detailsList]
    }

    def accuracy= {
        [detailsList:detailsList]
    }

    def search= {
        [detailsList:detailsList]
    }

    def recommend= {
        [detailsList:detailsList]
    }
    def age= {
        [detailsList:detailsList]
    }
    def gender= {
        [detailsList:detailsList]
    }
    def disability= {
        [detailsList:detailsList]
    }

    def internetusage= {
        [detailsList:detailsList]
    }
}
