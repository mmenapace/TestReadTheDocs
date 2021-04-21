# Test Read The docs
## About 
This project is to test read the docs capabilities of a stub repo.
## Installing
The project relies on Sphinx and the documentations are available in the /docs
subdirectory.
###Java domain 
*Objective* The objective is to automatically deploy documentatio for source present in 
./src/java directory.

**Installation**

Javasphinx can be installed by using pip command :

`pip install javasphinx`

There is a known issue related to Sphinx 3.0 and JavaSphinx library which can be fixed by swapping some 
methods in the domain.py JavaSphinx file.
The file imports both "_l" and "_" at line 25.
The new version of Sphinx is not compatible with such declarations "l_" but it can be just replaced along the file to fix the issue.
("_" brings the same compatibility over several locales).

*JavaDoc* for comparision a in the folder ./javadoc the standard javadoc is generated.

**Documentation generation** run the command: `javasphinx-api [input dir] [output dir]` TO BE TESTED. 

 


