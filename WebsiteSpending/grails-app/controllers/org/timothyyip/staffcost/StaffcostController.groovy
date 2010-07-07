package org.timothyyip.staffcost
import org.timothyyip.spend.*

class StaffcostController {
    def detailsList = Details.listOrderById()

    def index = { redirect(action:user) }

    def scs = {
        def planningCostList = Details.findAllByScsGreaterThan(0,[sort:'scs'])
        def planningCostListComments = Details.findAllByScsCommentIsNotNull([sort:'scs'])
        [detailsList:planningCostList,comments:planningCostListComments]
    }
    def six = {
        def planningCostList = Details.findAllByGradesixGreaterThan(0,[sort:'gradesix'])
        def planningCostListComments = Details.findAllByGradesixCommentIsNotNull([sort:'gradesix'])
        [detailsList:planningCostList,comments:planningCostListComments]
    }
    def seven = {
        def planningCostList = Details.findAllByGradesevenGreaterThan(0,[sort:'gradeseven'])
        def planningCostListComments = Details.findAllByGradesevenCommentIsNotNull([sort:'gradeseven'])
        [detailsList:planningCostList,comments:planningCostListComments] 
    }
    def seo = {
        def planningCostList = Details.findAllBySeoSioGreaterThan(0,[sort:'seoSio'])
        def planningCostListComments = Details.findAllBySeoSioCommentIsNotNull([sort:'seoSio'])
        [detailsList:planningCostList,comments:planningCostListComments]
    }
    def eo = {
        def planningCostList = Details.findAllByEoGreaterThan(0,[sort:'eo'])
        def planningCostListComments = Details.findAllByEoCommentIsNotNull([sort:'eo'])
        [detailsList:planningCostList,comments:planningCostListComments]
    }
    def ao = {
        def planningCostList = Details.findAllByAoGreaterThan(0,[sort:'ao'])
        def planningCostListComments = Details.findAllByAoCommentIsNotNull([sort:'ao'])
        [detailsList:planningCostList,comments:planningCostListComments]
    }
    def aa = {
        def planningCostList = Details.findAllByAaGreaterThan(0,[sort:'aa'])
        def planningCostListComments = Details.findAllByAaCommentIsNotNull([sort:'aa'])
        [detailsList:planningCostList,comments:planningCostListComments]
    }
    def other = {
        def planningCostList = Details.findAllByOtherStaffGreaterThan(0,[sort:'otherStaff'])
        def planningCostListComments = Details.findAllByOtherStaffCommentIsNotNull([sort:'otherStaff'])
        [detailsList:planningCostList,comments:planningCostListComments]
    }
    def total = {
        [detailsList:detailsList]
    }
    def stotal = {
         def costList = Details.findAllByStaffCostGreaterThan(0,[sort:'staffCost'])
        def costListComments = Details.findAllByStaffCostCommentIsNotNull([sort:'staffCost'])
        [detailsList:costList,comments:costListComments]
    }


}
