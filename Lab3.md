# Lab Report 3

In this lab report, I will explore four options of using command `find`

`-name`: You can use patterns or exact matches to search for files or directories based on their names using this option.

## example 1
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

I used the command `find./technical -name "*chapter*.txt"`  to searche the./technical directory and its subdirectories for files with the word "chapter" in their names and ending in the.txt extension.
