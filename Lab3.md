# Lab Report 3

In this lab report, I will explore four options of using command `find`

## `-name`: You can use patterns or exact matches to search for files or directories based on their names using this option.
 
* example 1

```
(base) Solomons-Macbook:docsearch solomonhuang$ find ./technical -name "*chapter*.txt"
./technical/911report/chapter-13.4.txt
./technical/911report/chapter-13.5.txt
./technical/911report/chapter-13.1.txt
./technical/911report/chapter-13.2.txt
./technical/911report/chapter-13.3.txt
./technical/911report/chapter-3.txt
./technical/911report/chapter-2.txt
./technical/911report/chapter-1.txt
./technical/911report/chapter-5.txt
./technical/911report/chapter-6.txt
./technical/911report/chapter-7.txt
./technical/911report/chapter-9.txt
./technical/911report/chapter-8.txt
./technical/911report/chapter-12.txt
./technical/911report/chapter-10.txt
./technical/911report/chapter-11.txt
```

I used the command `find./technical -name "*chapter*.txt"`  to searche the./technical directory and its subdirectories for files with the word "chapter" in their names and ending in the.txt extension.

* example 2

```
(base) Solomons-Macbook:docsearch solomonhuang$ find ./technical -name "*911*"
./technical/911report
```
I used the command `find ./technical -name "*911*"` to find the directory which contians 911 in techincal 

## `-type`: You can use this option to define the type of file you wish to look for. It can be used to locate files of a given type, such as directories (d), regular files (f), symbolic links (l), and others.

* example 1

```
(base) Solomons-Macbook:docsearch solomonhuang$  find ./technical -type d
./technical
./technical/government
./technical/government/About_LSC
./technical/government/Env_Prot_Agen
./technical/government/Alcohol_Problems
./technical/government/Gen_Account_Office
./technical/government/Post_Rate_Comm
./technical/government/Media
./technical/plos
./technical/biomed
./technical/911report
```
`-type d` will give me all directories in the ./technical directory.
