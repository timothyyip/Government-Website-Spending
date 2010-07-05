package org.timothyyip.staffcost
import org.timothyyip.spend.*

class StaffcostController {
    def detailsList = Details.listOrderById()

    def index = { redirect(action:user) }

    def scs = {
        [detailsList:detailsList]
    }
    def six = {
        [detailsList:detailsList]
    }
    def seven = {
        [detailsList:detailsList]
    }
    def seo = {
        [detailsList:detailsList]
    }
    def eo = {
        [detailsList:detailsList]
    }
    def ao = {
        [detailsList:detailsList]
    }
    def aa = {
        [detailsList:detailsList]
    }
    def other = {
        [detailsList:detailsList]
    }
    def total = {
        [detailsList:detailsList]
    }


}
