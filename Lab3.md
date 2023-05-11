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

* example 3

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

* example 4

```(base) Solomons-Macbook:docsearch solomonhuang$ find ./technical/911report/ -type f
./technical/911report//chapter-13.4.txt
./technical/911report//chapter-13.5.txt
./technical/911report//chapter-13.1.txt
./technical/911report//chapter-13.2.txt
./technical/911report//chapter-13.3.txt
./technical/911report//chapter-3.txt
./technical/911report//chapter-2.txt
./technical/911report//chapter-1.txt
./technical/911report//chapter-5.txt
./technical/911report//chapter-6.txt
./technical/911report//chapter-7.txt
./technical/911report//chapter-9.txt
./technical/911report//chapter-8.txt
./technical/911report//preface.txt
./technical/911report//chapter-12.txt
./technical/911report//chapter-10.txt
./technical/911report//chapter-11.txt
````
`type -f` will give me all files in given directory.

## `-size`: You can search for files based on their size, either in blocks or bytes, with this option.

* example 5

```
(base) Solomons-Macbook:docsearch solomonhuang$ find ./technical/ -size -1k
./technical/
./technical//government
./technical//government/About_LSC
./technical//government/Env_Prot_Agen
./technical//government/Alcohol_Problems
./technical//government/Post_Rate_Comm
./technical//plos/pmed.0020191.txt
./technical//plos/pmed.0020226.txt
./technical//911report
```

`-size -1k` gives me all the files within the ./technical directory which smaller than 1 kilobyte (KB)

* example 6

```
(base) Solomons-Macbook:docsearch solomonhuang$ find ./technical/ -size +100k
./technical//government/About_LSC/commission_report.txt
./technical//government/About_LSC/State_Planning_Report.txt
./technical//government/Env_Prot_Agen/multi102902.txt
./technical//government/Env_Prot_Agen/ctm4-10.txt
./technical//government/Env_Prot_Agen/bill.txt
./technical//government/Env_Prot_Agen/tech_adden.txt
./technical//government/Gen_Account_Office/d0269g.txt
./technical//government/Gen_Account_Office/GovernmentAuditingStandards_yb2002ed.txt
./technical//government/Gen_Account_Office/Sept27-2002_d02966.txt
./technical//government/Gen_Account_Office/d01376g.txt
./technical//government/Gen_Account_Office/Statements_Feb28-1997_volume.txt
./technical//government/Gen_Account_Office/pe1019.txt
./technical//government/Gen_Account_Office/gg96118.txt
./technical//government/Gen_Account_Office/d01591sp.txt
./technical//government/Gen_Account_Office/im814.txt
./technical//government/Gen_Account_Office/ai9868.txt
./technical//government/Gen_Account_Office/May1998_ai98068.txt
./technical//government/Gen_Account_Office/d02701.txt
./technical//biomed/1471-2105-3-2.txt
./technical//911report/chapter-13.4.txt
./technical//911report/chapter-13.5.txt
./technical//911report/chapter-13.2.txt
./technical//911report/chapter-13.3.txt
./technical//911report/chapter-3.txt
./technical//911report/chapter-1.txt
./technical//911report/chapter-6.txt
./technical//911report/chapter-7.txt
./technical//911report/chapter-9.txt
./technical//911report/chapter-12.txt
```

`-size +100k` gives me all the files within the ./technical directory which bigger than 100 kilobyte.

## `-iname`: find command allows you to search for files and directories based on their names in a case-insensitive manner.

* example 7

```
(base) Solomons-Macbook:docsearch solomonhuang$ find ./technical -type f -iname "*group*.txt"
./technical/government/Media/5_Legal_Groups.txt
```

`-iname` will ignore case and return then file that matched. I can also use with `-type`

* example 8

```
(base) Solomons-Macbook:docsearch solomonhuang$  find ./technical -type d -iname "PLOS"
./technical/plos
```

`-iname` will ignore case and return then file that matched. I can also use with `-type -d`

The ideas are came from ChatGPT and [35 Practical Examples of Linux Find Command](https://www.tecmint.com/35-practical-examples-of-linux-find-command/)

