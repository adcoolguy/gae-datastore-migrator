This project is a "fork" of the original great project at https://github.com/bpossolo/gae-datastore-migrator.

Changes:

1. Compiled in Eclipse :)
2. Worked with Google Plugin for Eclipse

Setup:

For DatastoreExporter -

No setup needed, just run the class as a normal Java application.

For DatastoreImporter -

Before running the class as a normal Java application, do the following:

1. Replace the sample persistence.xml yours
2. "Link" your GAEJ with the current Eclipse project (so that the utility can find your classes/jar files)

If the utility can not find the persistence.xml for whatever reason, you will see the exception -

Exception in thread "main" java.lang.RuntimeException: java.lang.IllegalArgumentException: InputStream cannot be null

If it can not find any dependant class(es), it will throw "Exception in thread "main" java.lang.RuntimeException: java.lang.ClassNotFoundException:"

Sample output:

Enter your GAE credentials for administering gaej app >>>
Email: 
xxx@gmail.com
Password: 
yyyyyy
Enter host and port for the remote datastore
Host (ex. APPNAME.appspot.com): 
zzz.appspot.com
Port (on GAE 443, on localhost 8888): 
443
Exporting Entity1
Wrote /var/folders/00/q3hx8cs15bs4t5h_hw3gcyg40000gp/T/gae-data-dump7440154122228127767/Entity1-471926324439627579.csv
Exporting Entity2
Wrote /var/folders/00/q3hx8cs15bs4t5h_hw3gcyg40000gp/T/gae-data-dump7440154122228127767/Entity2-714928265299319335.csv
Exporting Entity3
Wrote /var/folders/00/q3hx8cs15bs4t5h_hw3gcyg40000gp/T/gae-data-dump7440154122228127767/Entity3-4971406510011134553.csv
Exporting SR
Wrote /var/folders/00/q3hx8cs15bs4t5h_hw3gcyg40000gp/T/gae-data-dump7440154122228127767/SR-5388693724041890278.csv
Exporting Entity4
Wrote /var/folders/00/q3hx8cs15bs4t5h_hw3gcyg40000gp/T/gae-data-dump7440154122228127767/Entity4-6673071313264082064.csv
Finished

Checking the local dev_server data:

Visit http://localhost:8888/_ah/admin in your browser.

Dependency:

It depends on appengine-remote-api.jar of GAEJ (e.g. add it from appengine-java-sdk-1.8.8\lib).

Have fun! 