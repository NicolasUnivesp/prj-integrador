# prj-integrador
Problema a ser solucionado:

1- Disponibilizar catálogo do acervo na pagina a 
ser criada.

2- Permitir reservas, empréstimos, devoluções, 
cadastros e exclusões dos livros.

3- Após devolução livro fica com status 
(quarentena) por 72 horas

4- Permitir cadastro de usuários (bibliotecário,
alunos, professores)

5- Gerar relatórios das movimentações e 
permitir visualização do status dos livros de 
forma rápida

Proposta de solução (descrição breve 
da proposta):

Desenvolver página utilizando as ferramentas e 
conhecimentos em (Java, React, MySql, Spring, 
Git, Intellij).

Por que esta proposta pode ser a mais 
adequada?

O desenvolvimento se iniciou e continuará 
seguindo as etapas do modelo de criação 
conhecido como Design Thinking, buscando 
estreitar relacionamentos entre criadores e 
usuários finais, entre outras formas de tornar o 
produto final mais adequado com a necessidade 
identificada.

Como o contexto reagiria a esta 
solução?

Ao que a coleta do questionário aponta, existe 
uma real e contundente possibilidade de que o 
espaço de leitura da escola se torne mais atrativo 
para os alunos, isso representaria um ganho
inestimável no sentido sociocultural para a
comunidade local.

Qual é a viabilidade da sua 
implementação? (pontos fortes)

Existe um computador na sala de leitura que 
pode ser acessado pelos alunos que não tem 
condições materiais de faze-lo através de um
dispositivo próprio. Ademais o site ficará 
disponível na internet para consulta do publico 
em geral, para reservas é necessário login (aluno, 
professor), para movimentações é necessário
login (operador ou bibliotecario)

Detalhes:
1- Tabela de cadastro de livros precisa (pelo menos) ter os campos
número para o exemplar, 

1- título, 

2- nome do autor,

3- quantidade,

4- gênero literário,

5- livro do professor(bool),( alguns exemplares que não podem ser emprestados 
porque são usados para pesquisa na sala de aula e/ou na sala de leitura)(
Temos um acervo específico para a formação dos professores, cadastrados e 
colocados em prateleiras identificadas para facilitar o acesso)

6- emprestado(bool),

7- reservado(bool),

2- Na tabela de cadastro de usuários(alunos/professores/bibliotecários o uoperadores)
Bibliotecário, aluno ou professor?
Caso bibliotecário:

-Terá privilégios de cadastro exclusão e movimentação do acervo e dos usuários.
Caso aluno:
• série, 
• nome do aluno, 
• título do livro, 
• data de retirada, 
• data renovação (se necessário)
• data devolução. 

Caso professores e funcionários:
• nome,
• título do livro, 
• data de retirada, 
• data renovação (se necessário)
• data devolução

3- Renovação 1 semana +1 semana no máximo, caso queira renovar novamente precisa 
autorização

4- É possível hoje consultar o histórico de empréstimos e devolução dos livros, e essas 
informações ficam disponíveis durante o ano letivo, prorrogando apenas para o ano 
seguinte os livros que não foram devolvidos no prazo!

5- Pode ser pensado em futuramente implantar na pagina uma sessão onde possam ser 
registrados (fotos, áudios, videos) da Oficina de Leitura, por exemplo com os alunos 
dos sextos anos, nas leitura compartilhadas quando estas ocorrerem.

6- Pode ser pensado em futuramente implantar na pagina uma sessão onde constem os 
nomes e fotos dos 3 leitores mais assíduos do bimestre
