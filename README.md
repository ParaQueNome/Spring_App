# Controle de Notebooks

Neste projeto iremos criar uma aplicação Web e uma API para o controle de uso dos notebooks da Sala Maker.

```mermaid
    erDiagram
        notebook ||--|{ registro : contains        
        aluno ||--|{ registro : contains
        professor ||--|{ registro : contains 
        disciplina ||--|{ registro : contains  
        curso ||--|{ curso_disciplinas : contains 
        disciplina ||--|{ curso_disciplinas : contains 


        aluno {
            int rm            
            varchar nome

        }
        professor {
            int id
            varchar nome
        }
        curso {
            int id
            varchar nome
            varchar descricao
        }
        disciplina {
            int id
            int id_curso
            varchar descricao
            int id_professor
            enum dia_semana
        }
        curso_disciplinas {
            int id
            int id_curso
            int id_professor
        }

        notebook {
            int id
            enum marca
            enum modelo
        }
        registro {
            int id
            int id_professor
            int id_notebook
            int id_aluno
            int id_disciplina
            timestamp datahorainicio
            timestamp datahoratermino
        }

```

## Grupo

Num | Integrantes                        | Tema |
-- |------------------------------------| -- |
1 | Guilerme, Chiara, Thiago Barros    | Locação |


## Entidade Informação

1. Incluir dados institucionais [endereco];
2. Incluir dados de midias sociai;
3. Incluir links de sites associados;

## Entidade de avisos [Mural Digital];
* descrição;
* data inicio;
* data término;
* imagem [];
