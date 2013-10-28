Projet-MailBoxMananger
======================

This is a micro projet of the formation "Middleware in the distributed internet applications". This projet is based 
on J2EE and WebService. We designed and implemented a mail box manager.

There are two modules of the program, they are
  MailBoxManager: which manager the mail boxs by using a MySQL data base;
  DirectoryManager: which manager the user informations, for example, the name, the news group right.
These two modules communicate by WebService.

And client of tests is included in this projet, the test scenario is:
  1. Add 4 users
  2. Remove 1 user
  3. list all of the users
  4. send two mails
  5. send a news
  6. An user read a mail
  7. Remove all of the mails which are not read by the user
