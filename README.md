# Eficiência Energética Industrial

Projeto grupo 5

## Introdução
...



## Objetivo Geral

   Esse projeto tem como objetivo principal propor soluções a clientes que buscam alternativas para tornar seus maquinários industriais mais 
eficientes do ponto de vista energético. Por meio de uma interface que permitirá ao cliente colocar as informações necessárias para a análise,
será criado um programa para calcular a eficiência atual, gerar orçamentos personalizados e recomendar ações de melhorias, visando reduzir os
custos operacionais do sistema e aumentar a produtividade.


## Objetivos Específicos


* **Verificação do Fator de Potência**

  O cálculo para encontrar o valor é feito pela seguinte equação:

$$ FP = \frac{KW}{KVA} $$


Onde:
  * KW - potência ativa (potência real ou potência útil);
  * KVA - potência aparente (soma da potência ativa e reativa, onde potência reativa é a potência que serve para magnetizar as bobinas dos equipamentos elétricos e não realiza trabalho útil).
 
  De maneira que poderemos verificar se o fator de potência analisado está dentro da conformidade, mínimo 0,92, para  a unidade 
consumidora do Grupo A (indústria e comércio).




* **Cálculo Eficiência Atual - Desempenho Energético**

  Isso será realizado através de uma comparação entre o consumo que o equipamento cadastrado pelo cliente e o consumo do novo 
equipamento sugerido e então será analisado a economia gerada. Essa comparação será feita pelo seguinte cálculo para cada um dos equipamentos:

$$ \text{Consumo (kWh/ano)} = \frac{\text{Potência (kW)} \times \text{Horas de uso por dia} \times \text{Dias de uso por ano}}{\text{Eficiência}} $$


Onde: 
* 1HP = 0,7457 kW

* A eficiência deve ser dada em um número decimal. 

  É necessário dividir pela eficiência do motor, uma vez que nem toda a energia elétrica consumida pelo motor é convertida em trabalho útil.

$$ \text{Economia} = (C_{\text{antigo}} - C_{\text{novo}}) \times \text{Tarifa(kWh)} $$

* Tarifa média da região fornecido pela ANEEL.

* **Montagem do orçamento**


  Iremos calcular e informar os custos de novos equipamentos recomendados de acordo com a necessidade do cliente. O objetivo é fornecer
ao cliente um orçamento claro e viável para a substituição.


* **Cálculo de payback**

  Payback é o cálculo que determina em quanto tempo o dinheiro investido em um novo equipamento será recuperado. Iremos calcular esse período 
de retorno com base na economia gerada pela maior eficiência energética do novo maquinário.


  Esse período de retorno, ou seja, o tempo necessário para que o valor economizado com a eficiência energética cubra totalmente o investimento
inicial será calculado por meio da seguinte equação:

$$ \text{Payback} = \frac{\text{Capital inicial investido}}{\text{Economia anual}} $$

##...

#Referências 


https://www.produttivo.com.br/blog/eficiencia-energetica/#como-melhorar-a-eficincia-energtica-na-empresa
https://cs8gestao.com.br/blog/descubra-a-importancia-do-payback-para-decisoes-estrategicas/
https://www.luterled.com.br/fator-de-potencia
https://ashki23.github.io/markdown-latex.html
https://www2.aneel.gov.br/cedoc/ren20211000.html?
https://convertlive.com/pt/u/converter/cavalos-for%C3%A7a/em/quilowatts#1
https://alugagera.com.br/noticias/potencia-ativa-reativa-aparente
https://pt.linkedin.com/pulse/energia-reativa-o-que-%C3%A9-e-como-cobrada-na-sua-fatura-cristiano-i70mf
https://portalrelatorios.aneel.gov.br/luznatarifa/rankingtarifas
https://www.saladaeletrica.com.br/como-calcular-o-consumo-e-custo-de-energia-de-um-motor-trifasico-passo-a-passo-completo/ 
