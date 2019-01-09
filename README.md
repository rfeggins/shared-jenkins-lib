# shared-jenkins-lib

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
