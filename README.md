# shared-jenkins-lib




The src directory should look like standard Java source directory structure. This directory is added to the classpath when executing Pipelines.

The vars directory hosts scripts that define global variables accessible from Pipeline. The basename of each .groovy file should be a Groovy (~ Java) identifier, conventionally camelCased. The matching .txt, if present, can contain documentation, processed through the system’s configured markup formatter (so may really be HTML, Markdown, etc., though the txt extension is required).

The Groovy source files in these directories get the same “CPS transformation” as in Scripted Pipeline.

A resources directory allows the libraryResource step to be used from an external library to load associated non-Groovy files. Currently this feature is not supported for internal libraries.

Other directories under the root are reserved for future enhancements.


| Syntax | Description |
| ----------- | ----------- |
| Header | Title |
| Paragraph | Text |

## Directory structure
The directory structure of a Shared Library repository is as follows:

|(root)| |
| ----------- | ----------- |
| src # Groovy source files |
|       |    +- org <br> |


|          +- foo <br>
|              +- Bar.groovy  # for org.foo.Bar class <br>
+- vars <br>
|   +- foo.groovy          # for global 'foo' variable <br>
|   +- foo.txt             # help for 'foo' variable <br>
+- resources               # resource files (external libraries only) <br>
|   +- org <br>
|       +- foo <br>
|           +- bar.json    # static helper data for org.foo.Bar <br>
