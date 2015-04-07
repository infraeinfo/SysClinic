# SysClinic
Curso Superior em Análise e Desenvolvimento de Sistemas 2014 - 3º Semestre
Disciplina: Laboratório de Programação III – 1º Bimestre
Professor: Esp. Rafael R. Garcia

Prototipação em JAVA
Essa prototipação utilizará como base de dados a modelagem entidade relacionamento
(MER) feito na disciplina Banco de dados I.
Uma clínica de médio porte precisa de um sistema para gerenciar consultas de pacientes
com a equipe médica. O sistema demanda uma série requisitos levantando durante
entrevistas e consultas com funcionários e diretores:
a)>>> O sistema precisa de um controle de login para registrar um operador
(funcionário) que fica encarregado de operar o sistema. Cada operador deve
informar seu login (apelido) e senha previamente criado pelo ADBD
(administrador de banco de dados). Toda vez que o operador logar ou deslogar no
sistema, deverá criar no banco o id desse operador juntamente com a data e hora
feito da ação e o tipo de ação tomada (login, logoff, cadastro de consulta,
alteração na consulta) para criar um relatório mensal sobre o acesso ao sistema
(data com hora que entrou e data com hora que saiu).
b)>>> Cada paciente precisa informar alguns dados pessoais importantes para o cadastro
na clínica como nome completo, data de nascimento, RG, CPF, estado civil, tipo
sanguíneo, altura, peso, telefone para contato (celular, fixo ou comercial).
c)>>> Todo paciente mora em um logradouro específico contendo nome da
rua/avenida/travessa, número da residência, bairro, cidade, estado e CEP.
d)>>> É opcional o paciente informar um contato de telefone ou celular de um parente
ou conhecido para eventual aviso de emergência no estado clínico desse paciente.
e)>>> O sistema irá armazenar poucos dados dos médicos como nome completo, registro
no Conselho Regional de Medicina (CRM), sendo esse como um código único,
especialidade do médico, horário de atendimento (matutino, vespertino e
noturno), telefone para contato (podendo ser celular ou telefone fixo) e e-mail
válido.
f)>>> A consulta médica deverá buscar o cadastro prévio do paciente e do médico no
sistema. Faça telas para tal ação que consiga de modo prático buscar o paciente e
o médico no sistema. Armazenar a data e hora e o id do operador responsável pelo
registro da consulta.
g)>>> Outro ponto importante é o cadastro da triagem na consulta, armazenando os tipos
de sintomas prévios juntamente com o tipo de consulta exemplo:
idconsulta Tipo consulta Sintoma
4 Grave Constantes vômitos, dores no corpo, manchas
vermelhas na parte inferior do braço e febre alta.
5 Padrão Dores na garganta, febre alta, fraqueza quando
caminha.
6 Urgente Dores no coração, manchas avermelhadas no
braço direito, falta de ar e aparenta pressão alta.
INSTITUTO FEDERAL DE EDUCAÇÃO, CIÊNCIA E TECNOLOGIA DE MATO GROSSO
CAMPUS RONDONÓPOLIS
Curso Superior em Análise e Desenvolvimento de Sistemas 2014 - 3º Semestre
Disciplina: Laboratório de Programação III – 1º Bimestre
Professor: Esp. Rafael R. Garcia
h)>>> Toda consulta médica ao cadastrar ficará com o status “Aguardando atendimento”
para que o médico possa consultar em uma tela quais pacientes estão aguardando
na sala de espera por atendimento. Após a consulta e medicação, o médico deverá
registrar qual ação foi realizada na consulta, descrevendo quais ações foram
tomadas:
Alta – Paciente foi liberado da clínica após a consulta, não havendo necessidade
de retornar na clínica.
Tratamento médico – Paciente foi liberado da clínica após a consulta havendo a
necessidade de retornar na clínica.
Internado – Paciente não pode sair da clínica pois demanda um tratamento grave.
i)>>> O sistema precisa conter telas para cadastrar o médico, paciente e a consulta
médica. Tente elaborar uma tela prática e ágil para a consulta, prevendo o cadastro
rápido para paciente.
j)>>> Faça também uma tela para busque pelo nome do médico, quais pacientes estão
aguardando atendimento e quais sofreram alta.
k)>>> Faça uma tela de consulta para mostrar todos os log registrados pelos operadores
(login, cadastro de consulta, logoff e etc).
Faça uma prototipação em JAVA apenas com funcionalidades nas janelas sem conexão
com o Banco de Dados. Para o Sistema não ficar grande, tente focar nesse momento
apenas nas funcionalidades relacionadas acima.


