# Test Read The docs
## About 
This project is to test read the docs capabilities of a stub repo.
## Installing
The project relies on Sphinx and the documentations are available in the /docs
subdirectory.
The project is also connected to readthedocs, for a direct connection between the documentation and a web page update.
To fix issues with the installation of modules this [guide](https://docs.readthedocs.io/en/latest/config-file/v2.html) was used 
###Java domain 
*Objective* The objective is to automatically deploy documentatio for source present in 
./src/java directory.

command to update the rst files (from project root):
javasphinx-apidoc ./src/ ./docs/source/

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

 


