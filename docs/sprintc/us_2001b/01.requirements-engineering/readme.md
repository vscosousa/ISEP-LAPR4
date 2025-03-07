<img width=100% src="https://capsule-render.vercel.app/api?type=waving&height=120&color=4E1764"/>

# US 2001b - Continuously process files produced by the Applications Email Bot

## 1. Requirements Engineering

### 1.1. User Story Description

* As Product Owner, I want the system to, continuously, process the files produced by the Applications Email Bot, so that they can be imported into the system by initiative of the Operator.

### 1.2. Customer Specifications and Clarifications

**From the specifications document:**

- The applications Email Bot processes the emails and produces files adapted for integration in the system, that will be automatically processed by the Applications File Bot.

- The files produced by the Applications File Bot are used to integrate candidates and applications into the system.

- There is an Applications Email Bot (outside of scope for this project) that is continuously processing these emails. The Bot processes the emails and produces (in a predefined folder) the following content/files (using the same file prefix for files of the same application):

	- A text file with the contents of the email
	- A file for each file attached to the email (usually PDF files)
	- A text file with the contents of each file attached to the email (processed by an OCR tool)
	- A text file with the data of the application and candidate

- There is a second bot application, named Applications File Bot, that processes these files for integration in the system. The Applications File Bot is continuously monitoring the previous referred folder for new applications to be processed. The Bot should copy the files for a shared folder. This shared folder should be organized by job reference (top folders) and then by application (sub folder inside the job reference folder). The Bot should produce a text report of all the processed applications (including applications for job references and files available). The Operator of the Backoffice will import the files produced by the Applications File Bot and register the applications, creating candidates that dot not exist in the system.

- The base solution for the upload of files must be implemented following specific technical requirements such as the use of the C programming language with processes, signals and pipes. Specific requirements will be provided in SCOMP.

**From the client clarifications:**

> **Date:** 2024-04-11
>
> **Question 50:** Relativamente aos ficheiros gerados pelo email file bot o que é que identifica o que cada ficheiro contém?
>
> **Answer:** De acordo com o que está no exemplo enviado, devem considerar que cada ficheiro tem sempre um prefixo único que identifica uma candidatura (um número inteiro antes do primeiro “-“). Todos os ficheiros com o mesmo prefixo pertencem à mesma candidatura. A seguir ao prefixo, se tiver “cv” é um curriculum, se tive “email” é o email enviado pelo candidato, se tiver “candidate-data” são os 4 dados de identificação da candidatura, tal como descritos em 2.2.3. Todos ao outros ficheiros com o mesmo prefixo devem ser considerados anexos.

> **Date:** 2024-04-15
>
> **Question 64:** Bot restarts, duplicate files and final report. I would like to know what is the expected behaviour when the Application File Bot is restarted. Since the requirements state that files should be copied and not moved, the bot must know which files may have been already copied during previous runs of the program. Should the bot, on startup, check if the existing files were already copied to the shared folder, should the files be moved instead of copied or any other solution? If you have no specific requirements for this case, only that the system is kept in a consistent state, I'd like to know what is the expected behaviour when the bot finds duplicate files. I'd also like to know if the file prefix generated by the Application Email Bot is guaranteed to be numeric and unique throughout the whole software solution lifecycle. One more question, regarding how the report system works. Should the bot create a report each time new files are found and moved to the shared folder, meaning that there are multiple reports simultaneously (for instance, identified via date and time in the file name), or should it be a single file to which new data is appended?
>
> **Answer:** A lot of questions for “a single question”. As stated in your question, the system should be kept in a consistent state. Regarding duplicate files, there should not be any duplicate files (why would duplicate files exist?). Regarding the report, there can be multiple report files, each one uniquely identified by some sort of timestamp.
>
> **Question 67:** Número de Ficheiros. Em relação ao EmailFileBot, previamente respondeu que "Todos ao outros ficheiros com o mesmo prefixo devem ser considerados anexos", existe um número máximo/válido de ficheiros permitidos como anexos? Ou não controlamos o número de ficheiros submetidos por candidatura? Exemplo: CV, Email, Candidate-data e x opcionais?
>
> **Answer:** Não está definido um número máximo, mas podem estabelecer um limite a configurar, por exemplo, num ficheiro de configuração contendo um limite em tamanho (Mb) ou em número de anexos.

> **Date:** 2024-04-18
>
> **Question 82:** Que tipo de informação irá conter o report feito pelo Application File Bot? Sendo que este report vai ser acerca de múltiplas candidaturas, com que periodicidade deverá este ser criado?
>
> **Answer:** See Q64. I am not a technical person, but I should say that the report should include information that is enough for diagnosing problems in the import. I think some form of configuration of detail to be reported should be interesting, like what is usually available for log files, with a default rule for maximum detail.

> **Date:** 2024-04-19
>
> **Question 93:** Gostaríamos de esclarecimentos relativamente ao método de seleção de parâmetros para a execução da aplicação. No documento de auxílio desta funcionalidade, é-nos informado que esta configuração pode ser feita através de um ficheiro de configuração ou através de input direto aquando a execução da aplicação através da linha de comandos. A nossa questão é: dá-se a escolher à priori a maneira como a configuração é feita (configuration file ou input), ou o grupo decide que método irá ser utilizado para a aplicação em desenvolvimento?
>
> **Answer:** Penso que o documento que refere não é do documento principal de especificação do sistema, será um documento complementar com especificação especifica de uma unidade curricular. Sendo assim, penso que devem esclarecer a questão noutra fonte. Mas, sem querer condicionar a reposta “oficial” (que não é esta), penso que seja uma opção, e que cada solução pode considerar qual a que segue.
>
> **Question 94:** Relativamente à funcionalidade de us2001, os ficheiros gerados pelo Application Email Bot, são colocados num diretório, sendo depois processados pelo File Bot. Após um ficheiro ser processado pelo File Bot, este pode ser eliminado do diretório utilizado pelo Email Bot para guardar os ficheiros, uma vez que estes já se encontram organizados num shared folder?
>
> **Answer:** Como product owner não tenho requisitos especificos sobre esse aspeto. Espero apenas que o Sistema mantenha sempre a integridade dos dados estes não sejam “perdidos”.

### 1.3. Acceptance Criteria

* **AC1:** The Applications File Bot must be able to continuously process the files produced by the Applications Email Bot.

* **AC2:** The Applications File Bot must copy the files produced by the Applications Email Bot to a shared folder.

* **AC3:** The shared folder must be organized by job reference (top folders) and then by application (sub folder inside the job reference folder).

* **AC4:** The Applications File Bot must produce a text report of all the processed applications (including applications for job references and files available).

### 1.4. Found out Dependencies

_N/A_

### 1.5 Input and Output Data

**Input Data:**

* Typed data:
	* input path
	* output path
	* number of children
	* update frequency

**Output Data:**

* (In)Success of the operation
* Respective files

### 1.6. System Sequence Diagram (SSD)

_N/A_

<img width=100% src="https://capsule-render.vercel.app/api?type=waving&height=120&color=4E1764&section=footer"/>