* First, set up the account by changing your 15L password at [Link](https://sdacs.ucsd.edu/~icc/index.php)
# Installing VScode
* Down load VScode from the websit at [Link](https://sdacs.ucsd.edu/~icc/index.php). (I already have VScode on my computer)
![Image](download.png)
* Follow the instructions
* Open VSCode
![Image](open.png)
# Remotely Connecting
* In the terminal of VSCode, type `$ ssh cs15lsp23zz@ieng6.ucsd.edu` where zz should be replaced by your own account ID.
* Type `yes` when it's asking: `Are you sure you want to continue connecting (yes/no/[fingerprint])? Password:` 
* And enter your `password`.
* You will see the logged in information like:
![Image](loggedin.png)
# Trying Some Commands
* Now you can run some command lines in the terminal
![Image](command.png)
The command `ls -lat` will print out all the files in current directory will detialed information, sorted by the modification time.
* Here are some commands to try: cd, ls, pwd, mkdir, and cp
* ![Image](6836C0CB-2770-4A67-857D-94E5A6FA12B2.png)
* For example, `cd` will move to the next directory . `ls -a` which list all the files including hidden files . `cp /home/linux/ieng6/cs15lsp23/public/hello.txt /` will make a copy of file hello.txt in the given directory.
