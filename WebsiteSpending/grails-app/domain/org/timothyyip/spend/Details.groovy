package org.timothyyip.spend

class Details {

    static constraints = {
        gotEveryThingIWanted(nullable:true)
        gotMostOfWhatIWanted(nullable:true)
        gotSomeOfWhatIWanted(nullable:true)
        gotNoneOfWhatIWanted(nullable:true)
    }


        String website
        String department

        Float gotEveryThingIWanted
        Float gotMostOfWhatIWanted
        Float gotSomeOfWhatIWanted
        Float gotNoneOfWhatIWanted
        //
        //    Float verySatisfied
        //    Float satisfied
        //    Float neitherSatisfiedNorDissatisfied
        //    Float dissatisfied
        //    Float veryDissatisfied
        //    Float dontKnowSatisfied
        //
        //    Float veryGoodEaseOfUse
        //    Float goodEaseOfUse
        //    Float neitherGoodNorPoorEaseOfUse
        //    Float poorEaseOfUse
        //    Float veryPoorEaseOfUse
        //    Float dontKnowEaseOfUse
        //    Float notUsedEaseOfUse
        //
        //    Float veryGoodDesign
        //    Float goodDesign
        //    Float neitherGoodNorPoorDesign
        //    Float poorDesign
        //    Float veryPoorDesign
        //    Float dontKnowDesign
        //    Float notUsedDesign
        //
        //    Float veryGoodEaseOfFinding
        //    Float goodEaseOfFinding
        //    Float neitherGoodNorPoorEaseOfFinding
        //    Float poorEaseOfFinding
        //    Float veryPoorEaseOfFinding
        //    Float dontKnowEaseOfFinding
        //    Float notUsedEaseOfFinding
        //
        //    Float veryGoodEditorial
        //    Float goodEditorial
        //    Float neitherGoodNorPoorEditorial
        //    Float poorEditorial
        //    Float veryPoorEditorial
        //    Float dontKnowEditorial
        //    Float notUsedEditorial
        //
        //    Float veryGoodAccuracy
        //    Float goodAccuracy
        //    Float neitherGoodNorPoorAccuracy
        //    Float poorAccuracy
        //    Float veryPoorAccuracy
        //    Float dontKnowAccuracy
        //    Float notUsedAccuracy
        //
        //    Float veryGoodSearch
        //    Float goodSearch
        //    Float neitherGoodNorPoorSearch
        //    Float poorSearch
        //    Float veryPoorSearch
        //    Float dontKnowSearch
        //    Float notUsedSearch
        //
        //    Float definitelyRecommend
        //    Float probablyRecommend
        //    Float notSureRecommend
        //    Float probablyNotRecommend
        //    Float definitelyNotRecommend
        //
        //    Float age_16_19
        //    Float age_20_24
        //    Float age_25_34
        //    Float age_35_44
        //    Float age_45_54
        //    Float age_55_64
        //    Float age_65_74
        //    Float age_74Plus
        //    Float notToSayAge
        //
        //    Float sexMale
        //    Float sexFemale
        //    Float notToSaySex
        //
        //    Float disabilityYes
        //    Float disabilityNo
        //
        //    Float useInternetEveryDay
        //    Float useInternetEveryTwoOrThreeDays
        //    Float useInternetOnceAWeek
        //    Float useInternetOnceAFortnight
        //    Float useInternetOnceAMonth
        //    Float useInternetLessOften
        //    Float useInternetDontKnow
        //
        //    Integer user_Apr_09
        //    Integer user_May_09
        //    Integer user_Jun_09
        //    Integer user_Jul_09
        //    Integer user_Aug_09
        //    Integer user_Sep_09
        //    Integer user_Oct_09
        //    Integer user_Nov_09
        //    Integer user_Dec_09
        //    Integer user_Jan_10
        //    Integer user_Feb_10
        //    Integer user_Mar_10
        //    Integer user_yearly
        //
        //    Integer visit_Apr_09
        //    Integer visit_May_09
        //    Integer visit_Jun_09
        //    Integer visit_Jul_09
        //    Integer visit_Aug_09
        //    Integer visit_Sep_09
        //    Integer visit_Oct_09
        //    Integer visit_Nov_09
        //    Integer visit_Dec_09
        //    Integer visit_Jan_10
        //    Integer visit_Feb_10
        //    Integer visit_Mar_10
        //
        //    Integer twoPageVisit_Apr_09
        //    Integer twoPageVisit_May_09
        //    Integer twoPageVisit_Jun_09
        //    Integer twoPageVisit_Jul_09
        //    Integer twoPageVisit_Aug_09
        //    Integer twoPageVisit_Sep_09
        //    Integer twoPageVisit_Oct_09
        //    Integer twoPageVisit_Nov_09
        //    Integer twoPageVisit_Dec_09
        //    Integer twoPageVisit_Jan_10
        //    Integer twoPageVisit_Feb_10
        //    Integer twoPageVisit_Mar_10
        //
        //    Integer visitDuration_Apr_09
        //    Integer visitDuration_May_09
        //    Integer visitDuration_Jun_09
        //    Integer visitDuration_Jul_09
        //    Integer visitDuration_Aug_09
        //    Integer visitDuration_Sep_09
        //    Integer visitDuration_Oct_09
        //    Integer visitDuration_Nov_09
        //    Integer visitDuration_Dec_09
        //    Integer visitDuration_Jan_10
        //    Integer visitDuration_Feb_10
        //    Integer visitDuration_Mar_10
        //
        //    Integer pageRequest_Apr_09
        //    Integer pageRequest_May_09
        //    Integer pageRequest_Jun_09
        //    Integer pageRequest_Jul_09
        //    Integer pageRequest_Aug_09
        //    Integer pageRequest_Sep_09
        //    Integer pageRequest_Oct_09
        //    Integer pageRequest_Nov_09
        //    Integer pageRequest_Dec_09
        //    Integer pageRequest_Jan_10
        //    Integer pageRequest_Feb_10
        //    Integer pageRequest_Mar_10
        //
        //    Integer strategyAndPlanningCosts
        //    String strategyAndPlanningComment
        //
        //    Integer designAndBuildCosts
        //    String designAndBuildComment
        //
        //    Integer housingAndInfrastructureCosts
        //    String housingAndInfrastructureComment
        //
        //    Integer contentProvisionCosts
        //    String contentProvisionComment
        //
        //    Integer testingAndEvaluationCosts
        //    String testingAndEvaluationComment
        //
        //    Float scs
        //    String scsComment
        //
        //    Float grade6
        //    String grade6Comment
        //    Float grade7
        //    String grade7Comment
        //    Float seoSio
        //    String seoSioComment
        //    Float heo
        //    String heoComment
        //     Float eo
        //    String eoComment
        //     Float ao
        //    String aoComment
        //    Float aa
        //    String aaComment
        //    Float otherStaff
        //    String otherStaffComment
        //
        //    Float upliftEmployment
        //    Float upliftAddition
        //    Float staffCost
        //    String staffCostComment
        //
        //    Boolean a_accessibility
        //    Boolean aa_accessibility
        //    Boolean manualTesting_accessibility
        //    Boolean userTesting_accessibility
        //
        //    Float serviceAccessability
        //
        //    Boolean urlRedirection
        //    Boolean xmlSitemap
        //    Boolean informationReuse
        //
        //    String addtionalComment
  

}
