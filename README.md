# Test-Technical-Online-Bootcamp-DumbWays.id-Batch-22
  The answer of The Test Technical Online Bootcamp Batch 22 DumbWays.id
  
 # Software yang dibutuhkan
   • Netbeans
	 • VSCode
	 • Xampp
	 • Google Chrome
 
 # Jawaban Soal 1
   Jawaban ini menggunakan Java dengan tools
	 
	 1. Netbeans
	 		Create Project and Run File
	 
	 2. VSCode
	 		Install Java jdk-8u281-windows-x64
			
			• Open VScode
				- Open File
				- Go to Terminal
				- Configure Default Build Task
				- Others - Example to run an arbitary external command
				- Edit task.json:
						
					"version": "2.0.0",
    "tasks": [
        {
            "label": "JC",
            "command": "echo Hello",
            "windows": {
                "command": "C:\\Program Files\\Java\\jdk1.8.0_281\\bin\\javac.exe"
            },
            "args": [
                "${file}"
            ]
        },
        {
        "label": "JR",
            "command": "echo Hello",
            "windows": {
                "command": "C:\\Program Files\\Java\\jdk1.8.0_281\\bin\\javac.exe"
            },
            "args": [
                "${fileBasenameNoExtension}"
            ]
        }
					- Now, Run Build task [ JC -> Compile (ALT + C), JR -> RUN (ALT+R) ]
					- Continue without scanning the task output
  
	# Jawaban Soal 2
		Menggunakan Javascript with VSCode
			• Open VSCode
			• Install extension Javascript and Typescript
			• Open File and Runing
			
	# Jawaban Soal 3
	  Menggunakan PHP with VSCode
		  • Open VSCode dan Drop File From Xampp -> htdocs
			• Open Xampp
			• Apache Start
			• Run File From localhost/file/.php
			• Edit var input = n;
