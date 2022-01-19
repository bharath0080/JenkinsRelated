* `GIT_COMMANDS`

  1. To checkout a remote branch:

        `git checkout —track origin/<branchName>`
	
  2. Revert to  previous commit and push:
	
	`git reset --hard <COMMIT_ID>.   And git push -f`
	
  3. Merge the remote changes

	`git merge origin/master`
	
   4.	Delete local branch:
  	 
	 `git branch -d <branchName>`
	 
   5. Delete remote branch
	  
	 `git  push origin --delete test`

   6. Delete remote branch with username and password
	  
	 `git push   "https://<username>:<password>@<url>"   --delete Test_1`
	  
   7. Git push from one branch to another remote branch
	
	`git push origin <from_branch>:<to_branch>`
	
   8. Checkout the tag
  	
	`git checkout 2.3.1 -b <Branch_Name>`
	
   9. Check the commits of a single file
   
   	`git log --follow -- filename`
	
   10. To kickstart with inclusive naming for repositories which has master as default branch.  
    ```
        git checkout master
        git branch -m master main
        git fetch
        git branch --unset-upstream
        git branch -u origin/main
        git symbolic-ref refs/remotes/origin/HEAD refs/remotes/origin/main
  
    ```
