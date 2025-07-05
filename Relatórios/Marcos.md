# Relatório de Produção Individual 
### Marcos Vinicius Alves de Sousa
**Cargo:** Pesquisador Técnico e Apoio ao Desenvolvimento

##

##  1. Atribuição de cargo e tarefas

No projeto, fiquei responsável por pesquisar e organizar a **base teórica** que serviu para orientar o desenvolvimento do sistema de simulação de eficiência energética.

Minhas principais tarefas foram:
- Levantar e analisar normas técnicas importantes (como a *IEC 60034-30-1*) e dados oficiais (Atlas de Eficiência Energética da EPE, ANEEL, INMETRO).
- Pesquisar dados sobre a **percentual de economia** que pode ser obtida com a troca de equipamentos ineficientes por mais eficientes, como motores IE1 para IE3.
- Montar tabelas comparando equipamentos antigos e novos, com informações como potência, classe de eficiência e tempo de uso.
- Apoiar o engenheiro na escolha dos parâmetros usados na simulação.
- Colaborei para ajustar as classes `PropostaServico` e `SimulacaoEnergetica`, que calculam a economia mensal e o payback.
- Organizei as tabelas de entrada que serviram de base para os testes.

Essa contribuição ajudou a deixar o sistema mais próximo da realidade do parque industrial brasileiro.

##

## 2. Contribuição de acordo com a atribuição

Cumpri tudo que foi planejado dentro da minha função, especialmente:
- Levantar dados sobre o percentual médio de economia que pode ser alcançado ao substituir equipamentos ineficientes por mais eficientes.
- Organizar essas informações em tabelas, considerando classe de eficiência, potência, tempo de operação e consumo.
- Sugerir cenários e hipóteses para simular diferentes níveis de economia no sistema.

**Commits mais importantes que fiz:**
1. Tabelas com dados comparativos de equipamentos originais e propostos - [Tabelas](https://github.com/poo-ee-2025-1/g5/commit/87cd430f82062a72d8724092dccc1838d2203782).
2. Documento reunindo os percentuais de economia, referências e fontes - [Percentuais de economia](https://github.com/poo-ee-2025-1/g5/commit/df5f75803d33046eebb4adf1b2624f4f14d18110).
3. Participação na estruturação das classes `PropostaServico` e `SimulacaoEnergetica`, ajudando a definir os parâmetros e regras que calculam a economia mensal e o payback financeiro.[Diagrama das classes](https://github.com/poo-ee-2025-1/g5/commit/4c06bd71617c80ee9a8e4585ffa6ba568f2bd48e).

 
**Dificuldades encontradas:**
- Encontrar dados recentes e padronizados para alguns tipos de equipamentos e setores.
- Ajustar os dados pesquisados para que pudessem ser aplicados no sistema.

##

##  3. Contribuição além do atribuído

- Além das tarefas previstas, pesquisei sobre a situação atual do setor industrial em relação ao consumo energético e à eficiência, trazendo um panorama atualizado.

- Trabalhei para aprofundar o entendimento dos fatores econômicos envolvidos na implementação de medidas de eficiência energética, assim como dos benefícios financeiros e ambientais que essas medidas podem gerar.

- Organizei essas informações de forma clara para facilitar o uso por quem for desenvolver, testar ou analisar o sistema.

##

##  4. Considerações gerais

Este projeto mostrou, na prática, como **dados reais e referências técnicas** são importantes para criar um sistema útil.

**O que aprendi:**  
- A importância de trabalhar com dados reais e confiáveis para criar simulações precisas e úteis.  
- Como interpretar percentuais de economia para construir cenários que reflitam diferentes possibilidades práticas.  
- Como o trabalho em equipe melhora a qualidade do sistema. 

**Melhorias que podem ser feitas no futuro:**  
- Ampliar o banco de dados para incluir uma maior variedade de equipamentos, bem como mais atributos técnicos detalhados para cada equipamento.  
- Integrar o sistema com dados reais de consumo, como medições por sensores ou planilhas, para aumentar a precisão das simulações.  
- Automatizar a geração de relatórios técnicos que facilitem a análise e a tomada de decisão por parte dos usuários.
 
**Conclusão:**  
Este projeto mostrou, na prática, como pesquisar dados reais e confiáveis é essencial para criar uma ferramenta útil e segura na área de eficiência energética. O sistema de simulação que desenvolvemos pode ajudar a indústria a tomar melhores decisões, encontrando onde é possível economizar energia e reduzir custos. Com futuras melhorias e atualizações, ele pode se tornar uma referência para empresas e profissionais que buscam soluções mais eficientes e sustentáveis.
##
