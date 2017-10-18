# Reflection by Dillon Thoma

This lab required me to write a file called `ManipulateDNA`. The program
involved taking a string of dna with the letters A, C, G, and T and
manipulating it by outputting its complement, randomly inserting a letter,
deleting a random letter, and changing a random position in the string. The
most challenging part of the assignment was figuring out how to use the random
class to take advantage of the random method in our program. For example, we
had to insert a random insertion index and a random removal index in the
program, in order to insert and change the position of a random letter from the
program. This also required for me to mutate the string by using the random
insertion and removal indeces so that the output would display properly.

Also, in order to delete a random letter from the string, we needed to use
another integer called random removal index. This allowed us to remove a random
letter from the string. The problem I faced with this step was that you were
not able to just use the minus symbol, as I initially had tried. Rather, I had
to use the random removal index plus 1 and the dna string length as parameters
for a mutation. What this did was told the program where I wanted to
manipulate, and what action to perform.

Conclusively, this laboratory assignment was much more challenging yet again.
It required us to you different integer variables such as randomInsertionIndex
and randomRemovalIndex, as well as multiple different mutations of a string of
DNA. I also have learned how to use the random class in java thanks to this
lab. At the conclusion of my lab, the output correctly displayed a DNA string
that was going to be manipulated, the complement of that string, the insertion
of a random letter, the deletion of a random letter, and the change of a random
position in the string. I made sure to run the program multiple times to be
sure that these mutations were truly random, which they were.
