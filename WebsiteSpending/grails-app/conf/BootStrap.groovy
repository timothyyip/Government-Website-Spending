<<<<<<< HEAD
import org.timothyyip.spend.*

=======
>>>>>>> da42659bd8b94a2adf548f9b9a16488e9c36ac9e
class BootStrap {

    
    def init = { servletContext ->

<<<<<<< HEAD
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
                definitelyNotRecommend: tokens[counter++]
            ).save()
            println Details.count();
=======
       new File("websites-central-government-2009-10-v1-0.csv").eachCsvLine { tokens ->

            new org.timothyyip.spend.Details(
                website : tokens[0],        //website name
                department : tokens[1],
                gotEveryThingIWanted: tokens[2],
                gotMostOfWhatIWanted: tokens[3],
                gotSomeOfWhatIWanted: tokens[4],
                gotNoneOfWhatIWanted: tokens[5]
            ).save() 
>>>>>>> da42659bd8b94a2adf548f9b9a16488e9c36ac9e
        }
    }
    
    def destroy = {
    }
}
