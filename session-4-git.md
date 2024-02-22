**Version Control Systems (VCS):**

**Introduction and Usage of Version Control:**
Version Control Systems are tools that manage changes to source code, documents, or any set of files over time. They enable collaboration among multiple contributors by keeping track of modifications, allowing users to revert to previous versions, and merging changes made by different individuals. VCS is crucial in software development to maintain code integrity, track changes, and facilitate teamwork.

**Examples of Version Control Systems:**
1. **Git:** Distributed VCS, widely used for its speed and flexibility.
2. **Subversion (SVN):** Centralized VCS, tracks changes with a central repository.
3. **Mercurial:** Another distributed VCS, known for its simplicity and ease of use.

**Types of Version Control Systems:**
1. **Centralized Version Control System (CVCS):** Uses a central server to store all versions of a file.
   - *Example:* SVN (Subversion)

2. **Distributed Version Control System (DVCS):** Each user has a complete copy of the repository, promoting flexibility and offline work.
   - *Example:* Git, Mercurial

**Setting Up Git:**
1. **Installation:**
   - Download and install Git from the official website: [Git Downloads](https://git-scm.com/downloads)

2. **Configuration:**
   - Set up user details: `git config --global user.name "Your Name"`
   - Set up email: `git config --global user.email "you@example.com"`

3. **Initialization:**
   - Create a new repository: `git init` in the desired directory.

**Different Files and Folders and Terminologies in Git:**
1. **Working Directory:**
   - The directory on your local machine where you manipulate files.

2. **Staging Area (Index):**
   - An intermediate area where changes are prepared before committing using `git add`.

3. **Repository:**
   - The .git folder containing all the version history.

4. **Commit:**
   - A snapshot of changes made to the repository.

5. **Branch:**
   - A parallel version of the code that can be developed independently.

6. **Merge:**
   - Integrating changes from one branch into another.

7. **Pull Request (PR):**
   - A proposed change to a repository submitted by a user.

8. **Clone:**
   - Copying a repository from a remote source to your local machine.

9. **Push:**
   - Uploading local repository changes to a remote repository.

10. **Pull:**
    - Downloading changes from a remote repository to a local machine.
