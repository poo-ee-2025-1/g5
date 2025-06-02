# Eficiência Energética Industrial

Projeto grupo 5

## Introdução
A busca por soluções que promovam o uso inteligente da energia elétrica tornou-se um dos principais focos da engenharia moderna. Com a demanda por eletricidade crescendo de forma contínua, torna-se essencial desenvolver tecnologias que assegurem maior eficiência no consumo energético, sem comprometer o desempenho de sistemas e equipamentos. Nesse contexto, a eficiência elétrica desponta como uma estratégia indispensável para enfrentar dos desafios existentes: equilibrando economia, desempenho técnico e compromisso com a sustentabilidade.
Este projeto surge da necessidade de integrar conhecimentos da engenharia elétrica com o desenvolvimento de software, utilizando recursos da programação orientada a objetos para criar ferramentas que aperfeiçoem o uso da energia em ambientes industriais e acadêmicos. A proposta é desenvolver uma solução tecnológica que, além de atender às exigências do setor produtivo por meio do controle eficaz, também possa servir como instrumento de apoio técnico da área.
Ao unir teoria e prática, tecnologia e sustentabilidade, este trabalho busca contribuir para a formação de soluções que respondam aos desafios energéticos contemporâneos, promovendo um uso mais consciente e eficaz da eletricidade em diferentes contextos de aplicação.

## Justificativa
A escolha do tema "eficiência elétrica" se fundamenta na sua relevância crescente diante dos desafios energéticos, econômicos e ambientais enfrentados atualmente. Em um cenário onde o consumo de energia elétrica aumenta continuamente e os custos operacionais impactam diretamente a competitividade de empresas e a sustentabilidade dos sistemas, torna-se urgente buscar soluções que promovam o uso racional e inteligente da eletricidade.
A eficiência elétrica, nesse contexto, representa uma estratégia fundamental para aperfeiçoar recursos, reduzir desperdícios e melhorar o desempenho de sistemas e equipamentos. Seu estudo é essencial tanto no meio acadêmico quanto no setor produtivo, pois envolve não apenas o domínio de conceitos da engenharia elétrica, mas também a aplicação de tecnologias modernas e soluções inovadoras.
Assim, o uso deste tema no projeto é plenamente justificado por sua importância técnica, social e ambiental, além de seu potencial para gerar impactos positivos em múltiplas áreas, incluindo a formação de profissionais mais preparados e o desenvolvimento de ferramentas que contribuam para um futuro mais eficiente e sustentável.

## Problema na Atualidade
Atualmente, o consumo de eletricidade nas residências e, sobretudo, nas indústrias enfrenta sérios desafios. O alto custo da energia elétrica no Brasil é apontado como um dos principais entraves ao desenvolvimento industrial. Equipamentos obsoletos, falta de manutenção e ausências de controle sobre o consumo levam a perdas significativas, tanto financeiras quanto produtivas. Além disso, o aumento da demanda elétrica, impulsionado pela digitalização e pela chamada Indústria 4.0, torna o sistema ainda mais suscetível a sobrecargas e falhas. Essa realidade exige soluções urgentes e viáveis para aperfeiçoar o uso da eletricidade em todos os setores da economia.

## Motivação para Abordar o Tema
Falar sobre eficiência elétrica é fundamental para promover mudanças concretas no modo como usamos energia. A motivação para tratar desse tema está na possibilidade real de aliar economia, inovação tecnológica e responsabilidade socioambiental. Através da adoção de práticas simples, como o uso de lâmpadas LED, sistemas de automação, controle de demanda e equipamentos com selo Procel, é possível obter ganhos significativos em desempenho e sustentabilidade. Além disso, discutir eficiência elétrica é uma forma de contribuir para a formação de uma consciência coletiva em favor do uso inteligente dos recursos naturais, algo indispensável para garantir qualidade de vida às futuras gerações.
Portanto, discutir a eficiência elétrica é essencial para promover uma cultura de inovação, responsabilidade e uso consciente da energia — pilares indispensáveis para a evolução de qualquer sociedade que busca prosperar sem comprometer o equilíbrio ambiental e o bem-estar das próximas gerações.

## 






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

## ...

## Referências 

https://123ecos.com.br/docs/eficiencia-energetica/
https://greenyellow.com.br/eficiencia-energetica-na-industria/
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
