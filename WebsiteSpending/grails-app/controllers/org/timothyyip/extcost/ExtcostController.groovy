package org.timothyyip.extcost
import org.timothyyip.spend.*


class ExtcostController {

     def detailsList = Details.listOrderById()

    def index = { redirect(action:planning) }

    def planning = {
        [detailsList:detailsList]
    }
    def design = {
        [detailsList:detailsList]
    }
    def hosting = {
        [detailsList:detailsList]
    }
    def content = {
        [detailsList:detailsList]
    }
    def testing = {
        [detailsList:detailsList]
    }
    def total = {
        [detailsList:detailsList]
    }
}
