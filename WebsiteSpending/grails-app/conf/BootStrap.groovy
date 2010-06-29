class BootStrap {

    
    def init = { servletContext ->

       new File("websites-central-government-2009-10-v1-0.csv").eachCsvLine { tokens ->

            new org.timothyyip.spend.Details(
                website : tokens[0],        //website name
                department : tokens[1],
                gotEveryThingIWanted: tokens[2],
                gotMostOfWhatIWanted: tokens[3],
                gotSomeOfWhatIWanted: tokens[4],
                gotNoneOfWhatIWanted: tokens[5]
            ).save() 
        }
    }
    
    def destroy = {
    }
}
