**RELATÓRIO DE PRODUÇÃO INDIVIDUAL**

**Atribuição de tarefas**: responsável pela criação do banco de dados.
Pesquisa e cálculo da média do valor do kWh correspondente a cada estado
para os horários Hora Ponta (18:00-21:00) e Fora Ponta. E integração dos
valores da tarifa dos estados no código, conforme o estado a que o
cliente pertence e o horário de funcionamento do equipamento.

**Contribuição:** foi criado uma classe denominada DataBase que tem como
função gerenciar a conexão com o banco de dados e as informações
presentes no arquivo "tarifas.db". Esse arquivo foi criado através do
programa DB Browser que me permitiu exportar a tabela para lá e os dados
presentes nela serem utilizados no código sem a necessidade de
transcrever todas as informações sobre as tarifas para dentro do código.
É uma ferramenta importante, uma vez que, caso haja alguma mudança do
valor da tarifa do kWh de algum estado, não seja necessário modificar o
código, apenas os dados no arquivo "tarifas.db". Por meio das
informações desse arquivo foi cumprido o objetivo de retornar o consumo
daquele equipamento, além do valor gasto por ele por dia de acordo com
seu horário de funcionamento, isso tendo sido realizado na classe
CalcularGasto.

**Dificuldades:** Na criação dessa classe, tive como principal
dificuldade abordar todos os possíveis horários de funcionamento aquele
equipamento e considerar também por quantos minutos ele ficou em
operação e não apenas as horas. De início, havia colocado a exceção de
funcionamento apenas no horário Fora Ponta no método horasPonta(), e
mantido o método Fora Ponta sem abrangir nenhuma exceção de
funcionamento, entretanto, dessa maneira, quando o equipamento
funcionava, por exemplo, entre 12:30-23:00, os minutos de funcionamento
no período Fora Ponta, não estavam sendo incluídos no calculo do gasto,
assim como as duas horas após o período Ponta (21:00-23:00) não entraram
para o cálculo, Segue imagem de como o código estava antes da correção:

![Código método horasPonta()](./image1.png)

![Código método horasForaPonta()](./image2.png)


Após a alteração, que é a que está no código oficial, o método
horasForaPonta() passou a abrangir todas os possíveis horários de
funcionamento daquele equipamento.

**Commits mais importantes:**

\- classe Tarifas;

**-** classe TarifasRepository;

**-** classe CalcularGasto.

**Considerações Gerais:** Durante o desenvolvimento deste projeto, foi
adquirido conhecimentos em diversas áreas. Aprendi a utilizar o ORMLite,
criando um banco de dados SQLite eficiente e de fácil manutenção, onde
as informações podem ser atualizadas sem a necessidade de alterar o
código. A manipulação de tempo com as classes LocalTime e Duration foi
essencial para garantir cálculos precisos dos períodos de ponta e fora
de ponta, resolvendo desafios como a sobreposição de horários e a
contabilização correta de minutos. No entanto, há ainda oportunidades
para melhorias e expansões, como expandir o banco de dados para incluir
mais estados ou critérios, como tarifas diferenciadas por tipo de
consumo, tornaria o sistema mais abrangente. Assim como, implementar
validação de dados, como, se o valor inserido da potência é positivo,
através de um método chamado validarPotenca(double potencia) ou se o
horário de funcionamento inserido o período de início não é posterior ao
término e se o estado pertencente foi digitado em letras maiúsculas, por
meio do método validarEstado( String estado). Ambos os métodos usando if
e throw new llegalArgumentException, para retornar que a potência ou o
estado não estão escritos da maneira correta para o melhor funcionamento
do código.

**Conclusão:** aprendi como alguns programas funcionam e como eles
facilitam na codificação. Assim como aprendi como montar um banco de
dados para facilitar as contas utilizando os valores referentes a cada
circunstancia. Também foi muito interessante o aprendizado que obtive
sobre o tratamento de dados referentes a horários, para se trabalhar com
eles em todas as possíveis circunstancias de funcionamento. Pretendo
continuar pesquisando sobre esse assunto para poder melhorar e
simplificar esse e futuros projetos.

