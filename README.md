Prerequisites.

You will need maven to compile the project and post man to run the test case

1. clone this project on the command line as follows

git clone git@github.com:jvaidyaa/vivekjsonpost.git

2. cd to the project directory

cd vivekjsonpost

3. compile the project

mvn clean install

4. run the command line jar
java -jar ./target/jsonpost-1.jar

5. Post this message from postman to this endpoint http://localhost:8080/api/event 

{
  "eventType": "applicationEvent",
  "eventId": "3e2a90aa-9f7d-4078-98aa-2a4e2463cfc3",
  "message": {
    "entityAction": "SUBMITTED",
    "entityType": "loan",
    "entityId": "f6e10b3b-abc6-4d2e-952c-f26410f86850"
  },
  "status": "EMITTED",
  "originallyEmittedAt": 1522110211245
}

6. You will see the following response being printed on the server log

Basically echoing whatever was posted, change some of the values and post it again and you will see the values that have changed

Bhaktha's first program 
----------------------------------------------------------------
DTOEvent [eventType=applicationEvent, eventId=3e2a90aa-9f7d-4078-98aa-2a4e2463cfc3, message=com.vaidy.jsonpost.entity.Message@618d4a2f, status=EMITTED, originallyEmittedAt=java.util.GregorianCalendar[time=1522110211245,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id="UTC",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2018,MONTH=2,WEEK_OF_YEAR=13,WEEK_OF_MONTH=5,DAY_OF_MONTH=27,DAY_OF_YEAR=86,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=23,SECOND=31,MILLISECOND=245,ZONE_OFFSET=0,DST_OFFSET=0]]
----------------------------------------------------------------





