package org.timothyyip.stat
import org.timothyyip.spend.*

class StatController {

    def detailsList = Details.listOrderById()

    def index = { redirect(action:user) }
 
    def user = {
        [detailsList:detailsList]
    }
    def visit = {
        [detailsList:detailsList]
    }
    def twovisit = {
        [detailsList:detailsList]
    }
    def page = {
        [detailsList:detailsList]
    }
    def duration = {
        [detailsList:detailsList]
    }
  
}
