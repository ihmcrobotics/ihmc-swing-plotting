plugins {
   id("us.ihmc.ihmc-build")
   id("us.ihmc.ihmc-ci") version "7.4"
   id("us.ihmc.ihmc-cd") version "1.17"
}

ihmc {
   group = "us.ihmc"
   version = "0.19.1"
   vcsUrl = "https://github.com/ihmcrobotics/ihmc-swing-plotting"
   openSource = true
   
   configureDependencyResolution()
   configurePublications()
}

mainDependencies {
   api("org.apache.commons:commons-lang3:3.11")
   api("net.sf.trove4j:trove4j:3.0.3")
   api("org.jfree:jfreechart:1.0.17")
   api("org.jfree:jcommon:1.0.21")

   api("us.ihmc:euclid:0.15.1")
   api("us.ihmc:ihmc-commons:0.30.4")
   api("us.ihmc:ihmc-graphics-description:0.19.1")
}

testDependencies {
   api("us.ihmc:ihmc-commons-testing:0.30.4")
   api("us.ihmc:ihmc-graphics-description-test:0.19.0")
}
