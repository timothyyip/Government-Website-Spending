package org.timothyyip.extcost
import org.timothyyip.spend.*


class ExtcostController {

    def detailsList = Details.listOrderById()

    def index = { redirect(action:planning) }

    def planning = {
        def planningCostList = Details.findAllByStrategyPlanningCostsGreaterThan(0,[sort:'strategyPlanningCosts'])
        def planningCostListComments = Details.findAllByStrategyPlanningCommentIsNotNull([sort:'strategyPlanningCosts'])
        [detailsList:planningCostList,comments:planningCostListComments]
    }
    def design = {
        def costList = Details.findAllByDesignBuildCostsGreaterThan(0,[sort:'designBuildCosts'])
        def costListComments = Details.findAllByDesignBuildCommentIsNotNull([sort:'designBuildCosts'])
        [detailsList:costList,comments:costListComments]
    }
    def hosting = {
        def costList = Details.findAllByHousingInfrastructureCostsGreaterThan(0,[sort:'housingInfrastructureCosts'])
        def costListComments = Details.findAllByHousingInfrastructureCommentIsNotNull([sort:'housingInfrastructureCosts'])
        [detailsList:costList,comments:costListComments]
    }
    def content = {
         def costList = Details.findAllByContentProvisionCostsGreaterThan(0,[sort:'contentProvisionCosts'])
        def costListComments = Details.findAllByContentProvisionCommentIsNotNull([sort:'contentProvisionCosts'])
        [detailsList:costList,comments:costListComments]
    }
    def testing = {
        def costList = Details.findAllByTestingEvaluationCostsGreaterThan(0,[sort:'testingEvaluationCosts'])
        def costListComments = Details.findAllByTestingEvaluationCommentIsNotNull([sort:'testingEvaluationCosts'])
        [detailsList:costList,comments:costListComments]
    }
    def total = {
        def costList = Details.findAll("FROM Details AS d ORDER BY d.testingEvaluationCosts + d.housingInfrastructureCosts + d.strategyPlanningCosts + d.designBuildCosts + d.contentProvisionCosts asc")
        [detailsList:costList]
    }
}
