This is the repository that we will use for the fifth assignment of the course 2015-2016. This repository has a [master](/UNIZAR-30246-WebEngineering/Laboratory-4-SOA/tree/master) and a [control](/UNIZAR-30246-WebEngineering/Laboratory-4-SOA/tree/control) branch. The master branch contains the code of the laboratory and the control branch only the list where you must register your results. 

The code implements a MVC client that allows to query for Tweets using the Twitter API. The logic for querying Twitter is implemented using [Apache Camel](http://camel.apache.org/), a rule-based routing and mediation engine that provides a Java object-based implementation of common SOA patterns such as [Enterprise Integration Patterns](http://www.enterpriseintegrationpatterns.com/) using an API to configure routing and mediation rules. If you query for "cool" tweets, the client will show you all the tweets that contain the keyword "cool".

This is a *NOT* a speed competition. The objective is to extends the query interface to support the command "max:n", where _n_ is a number. "max" sets a limit in the number of retrieved tweets. That is "cool max:10" must return at most 10 tweets. There are several ways to do it. You can use the parameter `q` or create additional parameters. There is only one restriction. You must tell the API Twitter that you want such limit. Read the documentation of the [Twitter component](http://camel.apache.org/twitter.html) of Apache Camel to discover how.

This Lab will not use Travis for checks. 

In order to pass this lab you should:
- Fork this repository, and configure in a similar way as you did for lab 1
- Go to [Twitter Apps](https://apps.twitter.com/) and create and app.
- Create the keys for your app (consumer key, consumer key secret, access token, access token secret)
- _Master branch_: Extend the query interface.
- _Master branch_: Commit your code. 
- _Control branch_: Update your corresponding row in [README.md](/UNIZAR-30246-WebEngineering/Laboratory-5-SOA/tree/control/README.md) with the link to your repo
- _Control branch_: Request a pull request only of your control branch

Ok, the above is easy to medium. Now, how to get the cumulative bonus of 5% in your personal score? It is obvious, improve the existing application by using Apache Camel. Explore and propose ideas. 
- First, make a proposal by adding a proposal in your corresponding row in [README.md](/UNIZAR-30246-WebEngineering/Laboratory-5-SOA/tree/control/README.md). 
- Second, if nobody has requested previously the same improvement and I believe that it is worthwhile, I reserve the topic for you by accepting your pull request. Otherwise, I will reject it and will provide feedback.
- Third, start to work on it; remember that I will check if there are tests that test your improvement and your code pass Travis checks.
- Fourth, when you think it is ready add a :gift: to your corresponding row in [README.md](/UNIZAR-30246-WebEngineering/Laboratory-5-SOA/tree/control/README.md). Then do a pull request of your _Control branch_.
- Fifth, I will review your contribution. If it deserves the :gift: I will accept your pull request. Otherwise, I will reject it and will provide feedback.

 