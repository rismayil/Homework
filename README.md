# Homework Assignment

This is Maven based TestNG Homework Assignement project based on Page Object model.

## Overview

This project does some filters while doing car search and verifies all filters.
It additionally does some actions such as select radio buttons, select options, taking screenshot etc.

## Features

Here are the packages that I created in this project

-base

-pages

-tests

-utils

In the base package I created BasePage and BaseTest classes to add some common functions that will be used by other classes such as invokeBrowser,waitForPageLoad,OpenApplication,getTitle,takeScreenShotOnFailure etc.

In the pages package I created object classes to represent pages that I used. You can find objects as well as the methods to do some actions which is specific for that particular page.

In the test package I created a single test class to run all tests

In the utils package I created some useful methods that will be used in other classes in order to avoid code duplications such as selectDropdown,waitForVisibility,scrollDownToElement,takeAScreenshot etc.

## Running Test

1. In order to run my project you need to install TestNG plugin in Eclipse via Help/Install New Software.Please follow instructions below to install TestNG plugin
   
    1. Select Help / Install New Software...
    2. Enter the update site URL in "Work with:" field:
    3. Update site for release: https://dl.bintray.com/testng-team/testng-eclipse-release/
    4. Make sure the check box next to URL is checked and click Next.
    5. Eclipse will then guide you through the process.

2. Clone my project or download and import the project into your IDE

3. Go to src\main\java\tests package,right click on VerifySearchResultsTest.java class,select Run as from menu , and then choose TestNG Test.

[For more information about TestNG please click here](https://howtodoinjava.com/testng/testng-tutorial-with-eclipse/)

## Contact

Rashad Ismayilov - ismayilov.rashad013@gmail.com

Project Link:https://github.com/rismayil/Homework
 