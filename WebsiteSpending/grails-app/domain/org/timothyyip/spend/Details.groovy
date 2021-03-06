package org.timothyyip.spend

class Details {

    static constraints = {
        gotEveryThingIWanted(nullable:true)
        gotMostOfWhatIWanted(nullable:true)
        gotSomeOfWhatIWanted(nullable:true)
        gotNoneOfWhatIWanted(nullable:true)

        verySatisfied(nullable:true)
        satisfied(nullable:true)
        neitherSatisfiedNorDissatisfied(nullable:true)
        dissatisfied(nullable:true)
        veryDissatisfied(nullable:true)
        dontKnowSatisfied(nullable:true)

        veryGoodEaseOfUse(nullable:true)
        goodEaseOfUse(nullable:true)
        neitherGoodNorPoorEaseOfUse(nullable:true)
        poorEaseOfUse(nullable:true)
        veryPoorEaseOfUse(nullable:true)
        dontKnowEaseOfUse(nullable:true)
        notUsedEaseOfUse(nullable:true)

        veryGoodDesign(nullable:true)
        goodDesign(nullable:true)
        neitherGoodNorPoorDesign(nullable:true)
        poorDesign(nullable:true)
        veryPoorDesign(nullable:true)
        dontKnowDesign(nullable:true)
        notUsedDesign(nullable:true)

        veryGoodEaseOfFinding(nullable:true)
        goodEaseOfFinding(nullable:true)
        neitherGoodNorPoorEaseOfFinding(nullable:true)
        poorEaseOfFinding(nullable:true)
        veryPoorEaseOfFinding(nullable:true)
        dontKnowEaseOfFinding(nullable:true)
        notUsedEaseOfFinding(nullable:true)

        veryGoodEditorial(nullable:true)
        goodEditorial(nullable:true)
        neitherGoodNorPoorEditorial(nullable:true)
        poorEditorial(nullable:true)
        veryPoorEditorial(nullable:true)
        dontKnowEditorial(nullable:true)
        notUsedEditorial(nullable:true)

        veryGoodAccuracy(nullable:true)
        goodAccuracy(nullable:true)
        neitherGoodNorPoorAccuracy(nullable:true)
        poorAccuracy(nullable:true)
        veryPoorAccuracy(nullable:true)
        dontKnowAccuracy(nullable:true)
        notUsedAccuracy(nullable:true)

        veryGoodSearch(nullable:true)
        goodSearch(nullable:true)
        neitherGoodNorPoorSearch(nullable:true)
        poorSearch(nullable:true)
        veryPoorSearch(nullable:true)
        dontKnowSearch(nullable:true)
        notUsedSearch(nullable:true)

        definitelyRecommend(nullable:true)
        probablyRecommend(nullable:true)
        notSureRecommend(nullable:true)
        probablyNotRecommend(nullable:true)
        definitelyNotRecommend(nullable:true)

        age_16_19(nullable:true)
        age_20_24(nullable:true)
        age_25_34(nullable:true)
        age_35_44(nullable:true)
        age_45_54(nullable:true)
        age_55_64(nullable:true)
        age_65_74(nullable:true)
        age_74Plus(nullable:true)
        notToSayAge(nullable:true)

        sexMale(nullable:true)
        sexFemale(nullable:true)
        notToSaySex(nullable:true)

        disabilityYes(nullable:true)
        disabilityNo(nullable:true)

        useInternetEveryDay(nullable:true)
        useInternetEveryTwoOrThreeDays(nullable:true)
        useInternetOnceAWeek(nullable:true)
        useInternetOnceAFortnight(nullable:true)
        useInternetOnceAMonth(nullable:true)
        useInternetLessOften(nullable:true)
        useInternetDontKnow(nullable:true)

        user_Apr_09(nullable:true)
        user_May_09(nullable:true)
        user_Jun_09(nullable:true)
        user_Jul_09(nullable:true)
        user_Aug_09(nullable:true)
        user_Sep_09(nullable:true)
        user_Oct_09(nullable:true)
        user_Nov_09(nullable:true)
        user_Dec_09(nullable:true)
        user_Jan_10(nullable:true)
        user_Feb_10(nullable:true)
        user_Mar_10(nullable:true)
        user_yearly(nullable:true)

        visit_Apr_09(nullable:true)
        visit_May_09(nullable:true)
        visit_Jun_09(nullable:true)
        visit_Jul_09(nullable:true)
        visit_Aug_09(nullable:true)
        visit_Sep_09(nullable:true)
        visit_Oct_09(nullable:true)
        visit_Nov_09(nullable:true)
        visit_Dec_09(nullable:true)
        visit_Jan_10(nullable:true)
        visit_Feb_10(nullable:true)
        visit_Mar_10(nullable:true)

        twoPageVisit_Apr_09(nullable:true)
        twoPageVisit_May_09(nullable:true)
        twoPageVisit_Jun_09(nullable:true)
        twoPageVisit_Jul_09(nullable:true)
        twoPageVisit_Aug_09(nullable:true)
        twoPageVisit_Sep_09(nullable:true)
        twoPageVisit_Oct_09(nullable:true)
        twoPageVisit_Nov_09(nullable:true)
        twoPageVisit_Dec_09(nullable:true)
        twoPageVisit_Jan_10(nullable:true)
        twoPageVisit_Feb_10(nullable:true)
        twoPageVisit_Mar_10(nullable:true)

        visitDuration_Apr_09(nullable:true)
        visitDuration_May_09(nullable:true)
        visitDuration_Jun_09(nullable:true)
        visitDuration_Jul_09(nullable:true)
        visitDuration_Aug_09(nullable:true)
        visitDuration_Sep_09(nullable:true)
        visitDuration_Oct_09(nullable:true)
        visitDuration_Nov_09(nullable:true)
        visitDuration_Dec_09(nullable:true)
        visitDuration_Jan_10(nullable:true)
        visitDuration_Feb_10(nullable:true)
        visitDuration_Mar_10(nullable:true)

        pageRequest_Apr_09(nullable:true)
        pageRequest_May_09(nullable:true)
        pageRequest_Jun_09(nullable:true)
        pageRequest_Jul_09(nullable:true)
        pageRequest_Aug_09(nullable:true)
        pageRequest_Sep_09(nullable:true)
        pageRequest_Oct_09(nullable:true)
        pageRequest_Nov_09(nullable:true)
        pageRequest_Dec_09(nullable:true)
        pageRequest_Jan_10(nullable:true)
        pageRequest_Feb_10(nullable:true)
        pageRequest_Mar_10(nullable:true)

        strategyPlanningCosts(nullable:true)
        strategyPlanningComment(nullable:true)

        designBuildCosts(nullable:true)
        designBuildComment(nullable:true)

        housingInfrastructureCosts(nullable:true)
        housingInfrastructureComment(nullable:true)

        contentProvisionCosts(nullable:true)
        contentProvisionComment(nullable:true)

        testingEvaluationCosts(nullable:true)
        testingEvaluationComment(nullable:true)

        scs(nullable:true)
        scsComment(nullable:true)
        gradesix(nullable:true)
        gradesixComment(nullable:true)
        gradeseven(nullable:true)
        gradesevenComment(nullable:true)
        seoSio(nullable:true)
        seoSioComment(nullable:true)
        heo(nullable:true)
        heoComment(nullable:true)
        eo(nullable:true)
        eoComment(nullable:true)
        ao(nullable:true)
        aoComment(nullable:true)
        aa(nullable:true)
        aaComment(nullable:true)
        otherStaff(nullable:true)
        otherStaffComment(nullable:true)

        upliftEmployment(nullable:true)
        upliftAddition(nullable:true)
        staffCost(nullable:true)
        staffCostComment(nullable:true)
    }


    String website
    String department

    Float gotEveryThingIWanted
    Float gotMostOfWhatIWanted
    Float gotSomeOfWhatIWanted
    Float gotNoneOfWhatIWanted
        
    Float verySatisfied
    Float satisfied
    Float neitherSatisfiedNorDissatisfied
    Float dissatisfied
    Float veryDissatisfied
    Float dontKnowSatisfied

    Float veryGoodEaseOfUse
    Float goodEaseOfUse
    Float neitherGoodNorPoorEaseOfUse
    Float poorEaseOfUse
    Float veryPoorEaseOfUse
    Float dontKnowEaseOfUse
    Float notUsedEaseOfUse

    Float veryGoodDesign
    Float goodDesign
    Float neitherGoodNorPoorDesign
    Float poorDesign
    Float veryPoorDesign
    Float dontKnowDesign
    Float notUsedDesign

    Float veryGoodEaseOfFinding
    Float goodEaseOfFinding
    Float neitherGoodNorPoorEaseOfFinding
    Float poorEaseOfFinding
    Float veryPoorEaseOfFinding
    Float dontKnowEaseOfFinding
    Float notUsedEaseOfFinding

    Float veryGoodEditorial
    Float goodEditorial
    Float neitherGoodNorPoorEditorial
    Float poorEditorial
    Float veryPoorEditorial
    Float dontKnowEditorial
    Float notUsedEditorial

    Float veryGoodAccuracy
    Float goodAccuracy
    Float neitherGoodNorPoorAccuracy
    Float poorAccuracy
    Float veryPoorAccuracy
    Float dontKnowAccuracy
    Float notUsedAccuracy

    Float veryGoodSearch
    Float goodSearch
    Float neitherGoodNorPoorSearch
    Float poorSearch
    Float veryPoorSearch
    Float dontKnowSearch
    Float notUsedSearch

    Float definitelyRecommend
    Float probablyRecommend
    Float notSureRecommend
    Float probablyNotRecommend
    Float definitelyNotRecommend

    Float age_16_19
    Float age_20_24
    Float age_25_34
    Float age_35_44
    Float age_45_54
    Float age_55_64
    Float age_65_74
    Float age_74Plus
    Float notToSayAge

    Float sexMale
    Float sexFemale
    Float notToSaySex

    Float disabilityYes
    Float disabilityNo

    Float useInternetEveryDay
    Float useInternetEveryTwoOrThreeDays
    Float useInternetOnceAWeek
    Float useInternetOnceAFortnight
    Float useInternetOnceAMonth
    Float useInternetLessOften
    Float useInternetDontKnow

    Integer user_Apr_09
    Integer user_May_09
    Integer user_Jun_09
    Integer user_Jul_09
    Integer user_Aug_09
    Integer user_Sep_09
    Integer user_Oct_09
    Integer user_Nov_09
    Integer user_Dec_09
    Integer user_Jan_10
    Integer user_Feb_10
    Integer user_Mar_10
    Integer user_yearly

    Integer visit_Apr_09
    Integer visit_May_09
    Integer visit_Jun_09
    Integer visit_Jul_09
    Integer visit_Aug_09
    Integer visit_Sep_09
    Integer visit_Oct_09
    Integer visit_Nov_09
    Integer visit_Dec_09
    Integer visit_Jan_10
    Integer visit_Feb_10
    Integer visit_Mar_10

    Integer twoPageVisit_Apr_09
    Integer twoPageVisit_May_09
    Integer twoPageVisit_Jun_09
    Integer twoPageVisit_Jul_09
    Integer twoPageVisit_Aug_09
    Integer twoPageVisit_Sep_09
    Integer twoPageVisit_Oct_09
    Integer twoPageVisit_Nov_09
    Integer twoPageVisit_Dec_09
    Integer twoPageVisit_Jan_10
    Integer twoPageVisit_Feb_10
    Integer twoPageVisit_Mar_10

    Integer visitDuration_Apr_09
    Integer visitDuration_May_09
    Integer visitDuration_Jun_09
    Integer visitDuration_Jul_09
    Integer visitDuration_Aug_09
    Integer visitDuration_Sep_09
    Integer visitDuration_Oct_09
    Integer visitDuration_Nov_09
    Integer visitDuration_Dec_09
    Integer visitDuration_Jan_10
    Integer visitDuration_Feb_10
    Integer visitDuration_Mar_10

    Integer pageRequest_Apr_09
    Integer pageRequest_May_09
    Integer pageRequest_Jun_09
    Integer pageRequest_Jul_09
    Integer pageRequest_Aug_09
    Integer pageRequest_Sep_09
    Integer pageRequest_Oct_09
    Integer pageRequest_Nov_09
    Integer pageRequest_Dec_09
    Integer pageRequest_Jan_10
    Integer pageRequest_Feb_10
    Integer pageRequest_Mar_10

    Integer strategyPlanningCosts
    String strategyPlanningComment

    Integer designBuildCosts
    String designBuildComment

    Integer housingInfrastructureCosts
    String housingInfrastructureComment

    Integer contentProvisionCosts
    String contentProvisionComment

    Integer testingEvaluationCosts
    String testingEvaluationComment

    Float scs
    String scsComment
    Float gradesix
    String gradesixComment
    Float gradeseven
    String gradesevenComment
    Float seoSio
    String seoSioComment
    Float heo
    String heoComment
    Float eo
    String eoComment
    Float ao
    String aoComment
    Float aa
    String aaComment
    Float otherStaff
    String otherStaffComment

    Float upliftEmployment
    Float upliftAddition
    BigDecimal staffCost
    String staffCostComment

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
