### a. How to perform and raise a request for code reviews:

1. **Create a Feature Branch:**
   - Before starting any new development, create a new branch from the main branch. Use a clear and descriptive name for the branch.

2. **Write Code:**
   - Write your code changes on this feature branch. Follow coding standards, and make sure the code is well-documented.

3. **Commit Changes:**
   - Commit your changes locally with meaningful commit messages. Divide your work into logical and cohesive commits.

4. **Push to Remote:**
   - Push your feature branch to the remote repository.

5. **Create Pull Request (PR):**
   - On the repository platform (like GitHub, GitLab, Bitbucket), create a Pull Request from your feature branch to the main branch.

6. **Provide Details:**
   - Add a clear title and description to the Pull Request, summarizing the changes and highlighting any areas that need attention.

7. **Request Code Review:**
   - Assign reviewers to your PR, seeking feedback on your code changes.

### b. Merging in git:

1. **Review PR:**
   - Wait for code reviews and address any comments or concerns raised by the reviewers.

2. **Resolve Discussions:**
   - Resolve any discussions or comments on the PR.

3. **Approval:**
   - Once the PR is approved, and all checks (like tests and automated processes) pass, you are ready to merge.

4. **Merge Button:**
   - Use the merge button on the repository platform to merge your changes into the main branch.

### c. Multiple commits (Squash commits) in Git:

1. **Locally Rebase:**
   - Before pushing your changes, use `git rebase -i HEAD~n` (replace 'n' with the number of commits you want to squash).

2. **Squash Commits:**
   - In the interactive rebase window, change 'pick' to 'squash' for the commits you want to combine.

3. **Edit Commit Messages:**
   - Edit the commit messages as needed and save the changes.

4. **Push Changes:**
   - Push the changes with `git push -f` to update the remote branch.

### d. How merge conflicts can occur:

1. **Parallel Development:**
   - When multiple developers work on the same file or lines in parallel without merging in between.

2. **Branch Merges:**
   - Merging branches with conflicting changes to the same lines of code.

3. **File Renames or Deletions:**
   - Conflicts can arise when a file is renamed or deleted in one branch while being modified in another.

### e. How to handle merge conflicts:

1. **Identify Conflicts:**
   - Git will notify you of conflicts during a merge. Use `git status` to see which files have conflicts.

2. **Open Conflicted Files:**
   - Open the conflicted files in your code editor. Git will mark the conflicting sections.

3. **Resolve Conflicts:**
   - Manually edit the files to resolve conflicts. Remove conflict markers (`<<<<<<<`, `=======`, `>>>>>>>`).

4. **Add Changes:**
   - After resolving conflicts, use `git add` to mark the files as resolved.

5. **Complete Merge:**
   - Continue with the merge using `git merge --continue` or `git commit`.

6. **Push Changes:**
   - Once conflicts are resolved, push the changes to the remote repository.

