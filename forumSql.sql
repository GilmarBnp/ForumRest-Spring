CREATE TABLE `forumSpring`.`TOPICO` (
  `id` BIGINT(255) NOT NULL AUTO_INCREMENT,
  `titulo` VARCHAR(255) NOT NULL,
  `mensagem` VARCHAR(255) NULL,
  `data_criacao` date Not NULL,
  `status` VARCHAR(45) NOT NULL,
  `autor_id` VARCHAR(45) NOT NULL,
  `curso_id` VARCHAR(45) NULL,
  PRIMARY KEY (`id`));
  
  CREATE TABLE `forumSpring`.`RESPOSTA` (
  `id` BIGINT(255) NOT NULL AUTO_INCREMENT,
  `mensagem` VARCHAR(255) NULL,
  `topico` VARCHAR(255) NULL,
 `data_criacao` date NOT NULL,
  `autor` VARCHAR(45) NOT NULL,
  `curso` VARCHAR(45) NULL,
  PRIMARY KEY (`id`));

  
INSERT INTO usuario(email,nome,senha) VALUES('Aluno@gmail.com','Aluno','123456');  
  
INSERT INTO curso(categoria,nome) VALUES('Programação','Spring boot');  
INSERT INTO curso(categoria,nome) VALUES('Frontend','HTML 5');  


INSERT INTO topico(data_Criacao,mensagem,status,titulo,autor_id,curso_id) 
VALUES('2022/08/29','Erro ao criar projeto','NAO_RESPONDIDO','Dúvida',1,1);  

INSERT INTO topico(data_Criacao,mensagem,status,titulo,autor_id,curso_id) 
VALUES('2022/08/29','Projeto não compila','NAO_RESPONDIDO','Dúvida',1,2); 

INSERT INTO topico(data_Criacao,mensagem,status,titulo) 
VALUES('2022/08/29','Tag HTML','NAO_RESPONDIDO','Dúvida'); 



 




