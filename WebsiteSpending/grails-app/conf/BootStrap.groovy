import org.timothyyip.spend.*

class BootStrap {

    
    def init = { servletContext ->

        new File("websites-central-government-2009-10-v1-0.csv").eachCsvLine { tokens ->
            def counter = 0
            new Details(
                website : tokens[counter++],        //website name
                department : tokens[counter++],
                gotEveryThingIWanted: tokens[counter++],
                gotMostOfWhatIWanted: tokens[counter++],
                gotSomeOfWhatIWanted: tokens[counter++],
                gotNoneOfWhatIWanted: tokens[counter++],

                verySatisfied: tokens[counter++],
                satisfied: tokens[counter++],
                neitherSatisfiedNorDissatisfied: tokens[counter++],
                dissatisfied: tokens[counter++],
                veryDissatisfied: tokens[counter++],
                dontKnowSatisfied: tokens[counter++],

                veryGoodEaseOfUse: tokens[counter++],
                goodEaseOfUse: tokens[counter++],
                neitherGoodNorPoorEaseOfUse: tokens[counter++],
                poorEaseOfUse: tokens[counter++],
                veryPoorEaseOfUse: tokens[counter++],
                dontKnowEaseOfUse: tokens[counter++],
                notUsedEaseOfUse: tokens[counter++],

                veryGoodDesign: tokens[counter++],
                goodDesign: tokens[counter++],
                neitherGoodNorPoorDesign: tokens[counter++],
                poorDesign: tokens[counter++],
                veryPoorDesign: tokens[counter++],
                dontKnowDesign: tokens[counter++],
                notUsedDesign: tokens[counter++],

                veryGoodEaseOfFinding: tokens[counter++],
                goodEaseOfFinding: tokens[counter++],
                neitherGoodNorPoorEaseOfFinding: tokens[counter++],
                poorEaseOfFinding: tokens[counter++],
                veryPoorEaseOfFinding: tokens[counter++],
                dontKnowEaseOfFinding: tokens[counter++],
                notUsedEaseOfFinding: tokens[counter++],

                veryGoodEditorial: tokens[counter++],
                goodEditorial: tokens[counter++],
                neitherGoodNorPoorEditorial: tokens[counter++],
                poorEditorial: tokens[counter++],
                veryPoorEditorial: tokens[counter++],
                dontKnowEditorial: tokens[counter++],
                notUsedEditorial: tokens[counter++],

                veryGoodAccuracy: tokens[counter++],
                goodAccuracy: tokens[counter++],
                neitherGoodNorPoorAccuracy: tokens[counter++],
                poorAccuracy: tokens[counter++],
                veryPoorAccuracy: tokens[counter++],
                dontKnowAccuracy: tokens[counter++],
                notUsedAccuracy: tokens[counter++],

                veryGoodSearch: tokens[counter++],
                goodSearch: tokens[counter++],
                neitherGoodNorPoorSearch: tokens[counter++],
                poorSearch: tokens[counter++],
                veryPoorSearch: tokens[counter++],
                dontKnowSearch: tokens[counter++],
                notUsedSearch: tokens[counter++],

                definitelyRecommend: tokens[counter++],
                probablyRecommend: tokens[counter++],
                notSureRecommend: tokens[counter++],
                probablyNotRecommend: tokens[counter++],
                definitelyNotRecommend: tokens[counter++],

                age_16_19: tokens[counter++],
                age_20_24: tokens[counter++],
                age_25_34: tokens[counter++],
                age_35_44: tokens[counter++],
                age_45_54: tokens[counter++],
                age_55_64: tokens[counter++],
                age_65_74: tokens[counter++],
                age_74Plus: tokens[counter++],
                notToSayAge: tokens[counter++],

                sexMale: tokens[counter++],
                sexFemale: tokens[counter++],
                notToSaySex: tokens[counter++],

                disabilityYes: tokens[counter++],
                disabilityNo: tokens[counter++],

                useInternetEveryDay: tokens[counter++],
                useInternetEveryTwoOrThreeDays: tokens[counter++],
                useInternetOnceAWeek: tokens[counter++],
                useInternetOnceAFortnight: tokens[counter++],
                useInternetOnceAMonth: tokens[counter++],
                useInternetLessOften: tokens[counter++],
                useInternetDontKnow: tokens[counter++],

                user_Apr_09: tokens[counter++].replace(",",""),
                user_May_09: tokens[counter++].replace(",",""),
                user_Jun_09: tokens[counter++].replace(",",""),
                user_Jul_09: tokens[counter++].replace(",",""),
                user_Aug_09: tokens[counter++].replace(",",""),
                user_Sep_09: tokens[counter++].replace(",",""),
                user_Oct_09: tokens[counter++].replace(",",""),
                user_Nov_09: tokens[counter++].replace(",",""),
                user_Dec_09: tokens[counter++].replace(",",""),
                user_Jan_10: tokens[counter++].replace(",",""),
                user_Feb_10: tokens[counter++].replace(",",""),
                user_Mar_10: tokens[counter++].replace(",",""),
                user_yearly: tokens[counter++].replace(",",""),

                visit_Apr_09: tokens[counter++].replace(",",""),
                visit_May_09: tokens[counter++].replace(",",""),
                visit_Jun_09: tokens[counter++].replace(",",""),
                visit_Jul_09: tokens[counter++].replace(",",""),
                visit_Aug_09: tokens[counter++].replace(",",""),
                visit_Sep_09: tokens[counter++].replace(",",""),
                visit_Oct_09: tokens[counter++].replace(",",""),
                visit_Nov_09: tokens[counter++].replace(",",""),
                visit_Dec_09: tokens[counter++].replace(",",""),
                visit_Jan_10: tokens[counter++].replace(",",""),
                visit_Feb_10: tokens[counter++].replace(",",""),
                visit_Mar_10: tokens[counter++].replace(",",""),

                twoPageVisit_Apr_09: tokens[counter++].replace(",",""),
                twoPageVisit_May_09: tokens[counter++].replace(",",""),
                twoPageVisit_Jun_09: tokens[counter++].replace(",",""),
                twoPageVisit_Jul_09: tokens[counter++].replace(",",""),
                twoPageVisit_Aug_09: tokens[counter++].replace(",",""),
                twoPageVisit_Sep_09: tokens[counter++].replace(",",""),
                twoPageVisit_Oct_09: tokens[counter++].replace(",",""),
                twoPageVisit_Nov_09: tokens[counter++].replace(",",""),
                twoPageVisit_Dec_09: tokens[counter++].replace(",",""),
                twoPageVisit_Jan_10: tokens[counter++].replace(",",""),
                twoPageVisit_Feb_10: tokens[counter++].replace(",",""),
                twoPageVisit_Mar_10: tokens[counter++].replace(",",""),

                visitDuration_Apr_09: tokens[counter++].replace(",",""),
                visitDuration_May_09: tokens[counter++].replace(",",""),
                visitDuration_Jun_09: tokens[counter++].replace(",",""),
                visitDuration_Jul_09: tokens[counter++].replace(",",""),
                visitDuration_Aug_09: tokens[counter++].replace(",",""),
                visitDuration_Sep_09: tokens[counter++].replace(",",""),
                visitDuration_Oct_09: tokens[counter++].replace(",",""),
                visitDuration_Nov_09: tokens[counter++].replace(",",""),
                visitDuration_Dec_09: tokens[counter++].replace(",",""),
                visitDuration_Jan_10: tokens[counter++].replace(",",""),
                visitDuration_Feb_10: tokens[counter++].replace(",",""),
                visitDuration_Mar_10: tokens[counter++].replace(",",""),

                pageRequest_Apr_09: tokens[counter++].replace(",",""),
                pageRequest_May_09: tokens[counter++].replace(",",""),
                pageRequest_Jun_09: tokens[counter++].replace(",",""),
                pageRequest_Jul_09: tokens[counter++].replace(",",""),
                pageRequest_Aug_09: tokens[counter++].replace(",",""),
                pageRequest_Sep_09: tokens[counter++].replace(",",""),
                pageRequest_Oct_09: tokens[counter++].replace(",",""),
                pageRequest_Nov_09: tokens[counter++].replace(",",""),
                pageRequest_Dec_09: tokens[counter++].replace(",",""),
                pageRequest_Jan_10: tokens[counter++].replace(",",""),
                pageRequest_Feb_10: tokens[counter++].replace(",",""),
                pageRequest_Mar_10: tokens[counter++].replace(",",""),

                strategyPlanningCosts: tokens[counter++].replace(",",""),
                strategyPlanningComment: tokens[counter++],

                designBuildCosts: tokens[counter++].replace(",","") ?: 0,
                designBuildComment: tokens[counter++],

                housingInfrastructureCosts: tokens[counter++].replace(",",""),
                housingInfrastructureComment: tokens[counter++],

                contentProvisionCosts: tokens[counter++].replace(",",""),
                contentProvisionComment: tokens[counter++],

                testingEvaluationCosts: tokens[counter++].replace(",",""),
                testingEvaluationComment: tokens[counter++],

                scs: tokens[counter++],
                scsComment: tokens[counter++],
                gradesix: tokens[counter++],
                gradesixComment: tokens[counter++],
                gradeseven: tokens[counter++],
                gradesevenComment: tokens[counter++],
                seoSio: tokens[counter++],
                seoSioComment: tokens[counter++],
                heo: tokens[counter++],
                heoComment: tokens[counter++],
                eo: tokens[counter++],
                eoComment: tokens[counter++],
                ao: tokens[counter++],
                aoComment: tokens[counter++],
                aa: tokens[counter++],
                aaComment: tokens[counter++],
                otherStaff: tokens[counter++],
                otherStaffComment: tokens[counter++],

                upliftEmployment: tokens[counter++],
                upliftAddition: tokens[counter++],
                staffCost: tokens[counter++].replace("&pound;","").replace(",",""),
                staffCostComment: tokens[counter++]
            ).save()
            //println Details.staffCost
            println Details.count();
        }
    }
    
    def destroy = {
    }

  
}
