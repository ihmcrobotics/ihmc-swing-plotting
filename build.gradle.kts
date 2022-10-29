plugins {
   id("us.ihmc.ihmc-build")
   id("us.ihmc.ihmc-ci") version "7.6"
   id("us.ihmc.ihmc-cd") version "1.23"
}

ihmc {
   group = "us.ihmc"
   version = "0.19.7"
   vcsUrl = "https://github.com/ihmcrobotics/ihmc-swing-plotting"
   openSource = true
   
   configureDependencyResolution()
   configurePublications()
}

mainDependencies {
   api("net.sf.trove4j:trove4j:3.0.3")
   api("org.jfree:jfreechart:1.0.19")
   api("org.jfree:jcommon:1.0.24")

   api("us.ihmc:euclid:0.19.0")
   api("us.ihmc:ihmc-commons:0.32.0")
   api("us.ihmc:ihmc-graphics-description:0.19.8")
}

testDependencies {
   api("us.ihmc:ihmc-commons-testing:0.32.0")
   api("us.ihmc:ihmc-graphics-description-test:0.19.8")
}
