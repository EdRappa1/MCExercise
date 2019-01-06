# MCExercise

To run test, please use a command line:
  mvn test
  
Assumptions:
1. All words are divided by only one space character.
2. Sentence doesn't have any punctuation marks (comma, semicolon, etc) inside.

There are 2 versions of the class - SimpleSplitter and StreamSplitter. SimpleSplitter contains additional code to remove last character 
of the sentence if it'a punctuation mark (period, question mark or exclamatiomn mark).

Another way to do the task is to create a map <integer, List<String>> and populate it for all words, where key is a length of the word
and List contains all the words which have the same length.

In this case we can get all longest words in a sentence if it has more than one.
