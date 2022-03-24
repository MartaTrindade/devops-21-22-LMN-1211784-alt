#CA1: First Week


##CA1: Goals/Requirements (2/3) - First Week, no branches


**In this first part of the exercise we will use only the master branch.**


**1. Copy the code of the Tutorial React.js and Spring Data REST Application into a new folder named CA1.**
>* Change current working directory to folder
>  - cd D:/SWitCH/devops-21-22-lmn-1211784/
> 
>* Create CA1 folder
>  - mkdir CA1
> 
>* Copy contents from last class to folder
>  - cp -R /d/SWitCH/devops-21-22-lmn-1211784/tut-react-and-spring-data-rest/ /d/SWitCH /devops-21-22-lmn-1211784/CA1
> 
>* Change current directory to the new folder and create readme.md 
>  - cd D:/SWitCH/devops-21-22-lmn-1211784/CA1 
>  - echo “CA1: First Week” >> README.md 
> 
>* git add readme.md 
>* cd ..


**2. Commit the changes (and push them).**
>* git add CA1
>* git commit -m "copy contents from tut-react-and-spring-data-rest into a new folder CA1"	
>* git push


**3. We should use tags to mark the versions of the application. You should use a pattern like: major.minor.revision (e.g., 1.1.0).**
>* Tag the initial version as v1.1.0. Push it to the server.
>  - git tag v1.1.0
>  - git push origin v1.1.0


**4. Lets develop a new feature to add a new field to the application. In this case, lets add a new field to record the years of the employee in the company (e.g., jobYears).**
>* Classes to edit:
>  - basic/src/main/js/…/app.js
>  - basic/src/main/java/…/Employee.java
>  - basic/src/main/java/…/DatabaseLoader.java


* 4.1. You should add support for the new field.
>  * Attribute int jobYears
>  * method getJobYears()
>  * method setJobYears(int jobYears)
>  * method validJobYears(int jobYears)
>  * git add /d/SWitCH/devops-21-22-lmn-1211784/CA1/tut-react-and-spring-data-rest/basic/src/main
>  * git commit -m "added column jobYears (close #3)"
>  * git push
>  * git tag v1.1.2
>  * git push origin v1.1.2


* 4.2. You should also add unit tests for testing the creation of Employees and the validation of their attributes (for instance, no null/empty values). For the new field, only integer values should be allowed.
>  * Since there was a problem creating the test file, first it was necessary to make some changes to “pom.xml” file and add maven to the project.
>    - Right click “pom.xml” file -> “+ Add to Maven”
>  * Other option is to add a test dependency on the “pom.xml” file on basic directory.
>  * Create test file under basic/test/…
>  * To run test on git use the command:
>    - ./mvnw spring-boot:test
> 
>  * git add /d/SWitCH/devops-21-22-lmn-1211784/CA1/tut-react-and-spring-data-rest/basic/src/test
>  * git commit -m "added unit tests (close #4)"
>  * git push
>  * git tag v1.1.3
>  * git push origin v1.1.3


* 4.3. You should debug the server and client parts of the solution.
>  * cd D:/SWitCH/devops-21-22-lmn-1211784/CA1/tut-react-and-spring-data-rest/basic
>  * ./mvnw spring-boot:run
>  * http://localhost:8080/
>  * Press F12 (to open console for the browser, in this case Google Chrome)
>  * Click “Sources” and select the file to debug.
>  * Create a breakpoint and check the method behaviour.
>  * When the new feature is completed (and tested) the code should be committed and pushed and a new tag should be created (e.g, v1.2.0).
>  * On the directory: D:/SWitCH/devops-21-22-lmn-1211784
>    - git add CA1
>    - git commit -m "added column jobYears"
>    - git push
>    - git tag v1.2.0
>    - git push origin v1.2.0

**5.	At the end of the assignment mark your repository with the tag ca1-part1.**
>* git tag
>* ca1-part1
>* git push origin ca1-part1


##Extra infos needed to complete the assignment


>**To tag a older commit do:**
> 
>* git tag -a v1.1.0 d0c0d9f -m "Message here"
>
>**To change tags use the command:**
> 
>* git tag -a -f v1.1.1 -m “changed tag”
>
>**To delete a tag use the command:**
> 
>* git tag -d v1.1.0
>* git push origin --delet v1.1.0
> 


<div style="page-break-after: always;"></div>


----


#CA2: Second Week


##CA1: Goals/Requirements (3/3) - Second Week, using branches


**1. You should use the master branch to “publish” the “stable” versions of the Tutorial React.js and Spring Data REST Application.**
> Make sure main branch is up to date (make any necessary commits/pulls).
>

**2. You should develop new features in branches named after the feature. Create a branch named “email-field” to add a new email field to the application.**

* 2.1. You should create a branch called email-field.
>- cd D:/SWitCH/devops-21-22-lmn-1211784/CA1 >
>- git branch email-field
>

* 2.2. You should add support for the email field.
>- git checkout email-field
>* Classes to edit:
>  - basic/src/main/js/…/app.js
>  - basic/src/main/java/…/Employee.java
>  - basic/src/main/java/…/DatabaseLoader.java
>
>
>  - Attribute String email
>  - method getEmail()
>  - method setEmail(String email)
>  - method validEmail(String email)
>
> Commit changes to bitbucket
>* git add /d/SWitCH/devops-21-22-lmn-1211784/CA1/tut-react-and-spring-data-rest/basic/src/main
>* git commit -m "added column email (addresses #5)"
>* git push -u origin email-field
>
> Alternative command to push:
>* git push origin email-field
>


* 2.3. You should also add unit tests for testing the creation of Employees and the validation of their attributes (for instance, no null/empty values).
>  * Create test file under basic/test/…
>  * To run test on git use the command:
>    - cd D:/SWitCH/devops-21-22-lmn-1211784/CA1/tut-react-and-spring-data-rest/basic
>    - ./mvnw spring-boot:test
>
>  * git add /d/SWitCH/devops-21-22-lmn-1211784/CA1/tut-react-and-spring-data-rest/basic/src/test
>  * git commit -m "added unit tests (close #5)"
>  * git push -u origin email-field

* 2.4. You should debug the server and client parts of the solution.
>  * cd D:/SWitCH/devops-21-22-lmn-1211784/CA1/tut-react-and-spring-data-rest/basic
>  * ./mvnw spring-boot:run
>  * http://localhost:8080/
>  * Press F12 (to open console for the browser, in this case Google Chrome)
>  * Click “Sources” and select the file to debug.
>  * Create a breakpoint and check the method behaviour.
>

* 2.5. When the new feature is completed (and tested) the code should be merged with the master and a new tag should be created (e.g, v1.3.0).
>* git checkout main
>* git merge email-field
>* git push
>* git tag v1.3.0
>* git push origin v1.3.0
>* To delete the branch use the command:
>    -  git branch -d email-field
>


**3. You should also create branches for fixing bugs (e.g., “fix-invalid-email”).**

* 3.1. Create a branch called fix-invalid-email. The server should only accept Employees with a valid email (e.g., an email must have the “@” sign).
>* git branch fix-email-field
>* git checkout email-field
>
>* Classes to edit:
>  - basic/src/main/java/…/Employee.java
>
>  - method validEmail(String email) -> email.contains("@")
>
>* git add /d/SWitCH/devops-21-22-lmn-1211784/CA1/tut-react-and-spring-data-rest/basic/src/main
>* git commit -m "added column email (fix bug #5)"
>* git push -u origin fix-email-field
>


* 3.2. You should debug the server and client parts of the solution.
> Same steps as exercise 2.4.
>


* 3.3. When the fix is completed (and tested) the code should be merged into master and a new tag should be created (with a change in the minor number, e.g., v1.3.0 -> v1.3.1)
>* git checkout main
>* git merge fix-email-field
>* git push
>* git tag v1.3.1
>* git push origin v1.3.1
>* To delete the branch use the command:
>    -  git branch -d fix-email-field
>

**4. At the end of the assignment mark your repository with the tag ca1-part2.**
>* git add /d/SWitCH/devops-21-22-lmn-1211784/CA1/
>* git commit -m "updated readme file for CA1 second class (addresses #1)"
>* git push
>* git tag ca1-part2
>* git push origin ca1-part2
>


##Extra infos needed to complete the assignment

>* git branch --list
>* git branch -d <branch-name>
>* git branch -D <branch-name>
>       - force delete
>* git push --delete <remote name> <branch name>
>

> If there are changes on the same files of branches we want to merge, git will  stop the merge and request the user to choose the changes to apply.
> In this case a conflict was created in the CA1 readme.md file on main branch and fix-email-field branch.
>
>* git add /d/SWitCH/devops-21-22-lmn-1211784/CA1/
>* git commit -m "conflict file”
>* git push -u origin fix-email-field
>* git checkout main
>* git merge fix-email-field
> 
> Merge will abort because there are conflicted files!
> 
> Use git status to see the conflict then use nano command to edit the file.
> 
>* git status
>* cd D:/SWitCH/devops-21-22-lmn-1211784/CA1
>* nano readme.md
>* git add /d/SWitCH/devops-21-22-lmn-1211784/CA1/
>* git commit -m "conflict file”
>* git push
> 


<div style="page-break-after: always;"></div>


----


##CA1: Alternative Solution


**For this assignment you should present an alternative technological solution for version control (i.e., not based on Git).**

You should Analyze how the alternative solution compares to your base solution. You should:

> Git is a version control system that has some alternatives in the market. Some of them are:
>* Mercurial;
>* Apache Subversion (SVN) (open-source);
>* CVS (Concurrent Versions System) (open-source);
>* Azure DevOps Server;
>* Helix Core;
>* AWS CodeCommit;
>* Trac (open-source)
>* Fossil (open-source);
>
> On bitbucket website there are a few examples of version control software (https://bitbucket.org/product/version-control-software).
>
> Currently, Bitbucket only supports Git, although it used to support Mercurial as well.
>
> Mercurial repositories and features were officially deprecated/removed from Bitbucket and the API on 1st July 2020
> (More infos on the link: https://bitbucket.org/blog/sunsetting-mercurial-support-in-bitbucket).
>
> There are more options, but on this project we will compare git tools to Apache subversion (https://subversion.apache.org/quick-start).
>

**1. Present how the alternative tool compares to Git regarding version control features;**
> Git is a **distributed version control system**, and SVN is a **centralized version control system**.
> - This means when we do a **git clone** we get a copy of the entire project and their commits.
> - On svn the data is stored on a central server, and we are getting a single version of the repository. All the history
    > is stored on the local repository, so it's not connected to the internet, but that does not mean we cannot do commits, diffs, logs, branches, merges, file annotations, etc
>
> Git uses multiple repositories, including a centralized repository and server, as well as some local repositories, while SVN does not have a centralized repository or server.
>
> While SVN has a .svn in each folder, Git only has one .git at the top level parent directory.
> This means SVN allows the user to check only sub-trees (or branches) while Git requires the user to check the entire repository as a unit.
>
> With SVN, to make any change to the repository’s history, the user needs access to the central server.
> Changes are tracked at the file level.
>
> With Git distributed nature it allows anyone to change any part of their local repository’s history.
> Changes are tracked at a repository level.
>
> **Advantages of Git:**
> - With Git it's possible to change several files and only commit the ones we want with a specific comment, as well as use patch staging to only commit a particular method you worked on a file a co-worker is also working on.
>
> **Advantages of SVN:**
> - SVN is easier to use.
> - Having only a central repository it's easier to manage the permissions, security, mirrors and dumps.
>

**2. Describe how the alternative tool could be used (i.e., only the design of the solution) to solve the same goals as presented for this assignment;**
>
> | Task                         | Git                         | SVN |
> |------------------------------|-----------------------------|----------------------------------|
> | Help                         | git help                    | svn help                         |
> | Create repository            | git init                    | svnadmin create                  |
> | Import                       | git clone                   | svn import <_URL_> -m "Initial import" |
> | Copy files                   | git fetch                   | svn checkout <_URL_> <target_name> |
> | Add new file                 | git add                     | svn add                          |
> | Commit                       | git commit -m "message"     | svn commit -m "message"          |
> | Push                         | git push                    |                                  |
> | Compare differences in files | git diff                    | svn diff                         |
> | Status                       | git status                  | svn status                       |
> | Remove file                  | git rm <file_name>          | svn delete <file_name>           |
> | Merge                        | git merge                   | svn merge                        |
> | Pull                         | git pull <_URL_>            | svn update                       |
> | Tag                          | git tag <tag_name>          | svn copy url/user/repo/trunk \ url/user/repo/tags/v.1.0 \ -m "Tagging v.1.0" |
> | List all branches            | git branch                  |                                  |
> | Create branch                | git branch <branch_name>    | svn copy <originalURL/trunk> <new_loc/branches/MyNewBranch> -m "Creating a new branch"  |
> | Delete branch                | git branch -d <branch_name> |                                 |
> | Force delete branch          | git branch -D <branch_name> |                                 |
> | Merge branch                 | git merge <branch_name>     | svn merge --reintegrate branchURL; svn commit |
> | Revert changes               |                             | svn revert <file_name>          |
>


**To potentially achieve a complete solution of the assignment you should also implement the alternative design presented in the previous item 2.**
> Since it's not compatible with Bitbucket, but it's compatible with GitHub the implementation will be done there!
> 
>More infos on compatibility betwen SVN and GitHub on:
> https://docs.github.com/en/get-started/importing-your-projects-to-github/working-with-subversion-on-github/support-for-subversion-clients.
>
> CA1 GitHub repository:
> https://github.com/MartaTrindade/devops-21-22-LMN-1211784

>Setup the program:
>* Download the SVN (https://subversion.apache.org/download.cgi)
>* Extract the .zip and change the folder name to "apache-svn"
>* Put the folder on your disk, for example: C:\Program SWitCH\apache-svn\bin
>* Go to Windows System Environment Variables -> System Variable -> Path -> Edit -> New -> C:\Program SWitCH\apache-svn\bin

>Create a local repository:
>- mkdir D:\SWitCH\SVN
>- svnadmin create D:\SWitCH\SVN\
>
>Create a recommended project layout in the new repository:
>-  svn mkdir -m "Create directory structure." ^
    file:///D:/SWitCH/SVN/trunk ^
    file:///D:/SWitCH/SVN/branches ^
    file:///D:/SWitCH/SVN/tags
>
>
>**Setting up a local repository on Windows:**
>* Open the Command prompt
>* d:
>* cd D:\SWitCH\
>* svn co --depth empty https://github.com/MartaTrindade/devops-21-22-LMN-1211784-alt.git
>* Insert desktop password
>* Insert GitHub username
>* Insert GitHub password
>* cd D:\SWitCH\devops-21-22-LMN-1211784-alt.git
> 
> Create the trunk branch (aka git Head)
>* svn up trunk
> 
> Get an empty checkout of the branches directory where all the non-HEAD branches live, and where you'll be making feature branches.
>* svn up --depth empty branches
>
> ----
> _**CA1: First class**_
>
> Add tut-react folder from ca1-part1
>* svn co D:\Desktop\tut-react-and-spring-data-rest D:\SWitCH\devops-21-22-LMN-1211784-alt.git\trunk
>* svn commit -m "added tut folder"
>* svn update
> 
> Create a tag
>* svn copy https://github.com/MartaTrindade/devops-21-22-LMN-1211784-alt.git/trunk \
   https://github.com/MartaTrindade/devops-21-22-LMN-1211784-alt.git/tags/v.1.0 \
   -m "Tagging v.1.0 release."
> 
> ----
> _**CA1: Second class**_
> 
> Create new branch (first update the main branch!)
>* svn up trunk
>* svn copy trunk branches/email-field
>* svn commit -m 'Added email-field branch'
>* svn update
>
> Convert the current directory into a working copy of the trunk in the repository: 
>* svn co --depth empty https://github.com/MartaTrindade/devops-21-22-LMN-1211784-alt.git/trunk
> 
> Then, switch to another branch:
>* svn switch https://github.com/MartaTrindade/devops-21-22-LMN-1211784-alt.git/branches/email-field
>
> add, commit, update/push, merge
>
> Delete a branch
>* svn delete https://github.com/MartaTrindade/devops-21-22-LMN-1211784-alt.git/branches/email-field \
-m "Removing email-field branch."
> 
> 


----



> Link to GitHub
> 

----