# Cálculos para Utilização de Inversores de Frequência

Inversores de frequência ajustam a velocidade dos motores elétricos conforme a demanda do processo, o que permite reduzir significativamente o consumo de energia, principalmente em cargas com torque variável, como bombas e ventiladores centrífugos (DOE, 2012).

## 1.1. Potência Real Consumida

**Fórmula:**

$$
P_{\text{real}} = P_{\text{nominal}} \times \left( \frac{V_{\text{operacional}}}{V_{\text{nominal}}} \right)^3
$$

**Descrição dos termos:**

- $P_{\text{real}}$: Potência consumida na condição ajustada (kW).
- $P_{\text{nominal}}$: Potência nominal do motor (kW).
- $V_{\text{operacional}}$: Velocidade ajustada pelo inversor (% ou RPM).
- $V_{\text{nominal}}$: Velocidade nominal do motor (% ou RPM).

(Fonte: WEG, 2021; DOE, 2012)

---

## 1.2. Consumo de Energia

**Fórmula:**

$$
E = P_{\text{real}} \times T
$$

**Descrição dos termos:**

- $E$: Energia consumida (kWh).
- $P_{\text{real}}$: Potência efetiva consumida (kW).
- $T$: Tempo de operação (horas).

(Fonte: IEA, 2023)

---

## 1.3. Economia de Energia

**Fórmula:**

$$
EE = E_{\text{sem inversor}} - E_{\text{com inversor}}
$$

**Descrição dos termos:**

- $EE$: Economia de energia (kWh).
- $E_{\text{sem inversor}}$: Consumo de energia sem o uso do inversor (kWh).
- $E_{\text{com inversor}}$: Consumo com inversor (kWh).

(Fonte: ABNT NBR ISO 50001)

---

## 1.4. Retorno sobre o Investimento (ROI)

**Fórmulas:**

$$
ROI = \frac{\text{Custo do Inversor}}{\text{Economia Anual}}
$$

$$
\text{Payback} = \frac{\text{Investimento Inicial}}{\text{Economia Mensal} \times 12}
$$

**Descrição dos termos:**

- **Custo do Inversor**: Valor total investido no equipamento (R$).
- **Economia Anual**: Redução de custos com energia em 1 ano (R$).
- **Payback**: Tempo estimado para retorno do investimento (anos ou meses).

(Fonte: PROCEL, 2015)

---

## Exemplo Prático

- **Motor:** 10 kW  
- **Velocidade ajustada:** 50%  
- **Tempo de operação:** $8\, \text{h/dia} \times 22\, \text{dias/mês} = 176\, \text{h/mês}$  

**Sem inversor:**

$$
E_{\text{sem}} = 10 \times 176 = 1760 \, \text{kWh/mês}
$$

**Com inversor:**

$$
P_{\text{real}} = 10 \times (0.5)^3 = 1.25 \, \text{kW}
$$

$$
E_{\text{com}} = 1.25 \times 176 = 220 \, \text{kWh/mês}
$$

**Economia:**

$$
EE = 1760 - 220 = 1540 \, \text{kWh/mês}
$$

---

# Cálculos para os Selos de Eficiência Energética

Selos como Procel, INMETRO, IE2/IE3/IE4 (conforme normas ABNT e IEC) indicam a eficiência energética de motores, compressores, lâmpadas e demais equipamentos industriais, com base em ensaios padronizados (ABNT NBR 17094-1 e IEC 60034-30-1).

---

## 2.1. Eficiência Energética

**Fórmula:**

$$
\eta = \frac{\text{Energia Útil}}{\text{Energia Total Consumida}} \times 100
$$

**Descrição dos termos:**

- $\eta$: Eficiência energética (%).
- **Energia Útil**: Energia convertida em trabalho útil (mecânico, térmico).
- **Energia Total Consumida**: Energia elétrica fornecida ao equipamento.

(Fonte: INMETRO, Portaria 488/2010)

---

## 2.2. Fator de Carga (FC)

**Fórmula:**

$$
FC = \frac{P_{\text{operacional}}}{P_{\text{nominal}}}
$$

**Descrição dos termos:**

- $FC$: Fator de carga (adimensional).
- $P_{\text{operacional}}$: Potência média usada.
- $P_{\text{nominal}}$: Potência nominal do equipamento.

(Fonte: SEBRAE, 2018)

---

## 2.3. Consumo Específico (CE)

**Fórmula:**

$$
CE = \frac{E}{\text{Volume Bombeado ou Trabalho Realizado}}
$$

**Descrição dos termos:**

- $CE$: Consumo específico (kWh/unidade de produção).
- $E$: Energia consumida (kWh).

(Fonte: WEG, 2021)

---

## 2.4. Classificação por Selo de Eficiência

**Exemplo de faixas hipotéticas de eficiência para motores:**

- Classe A: $\eta > 95\%$
- Classe B: $90\% \leq \eta \leq 95\%$
- Classe C: $85\% \leq \eta < 90\%$

(Fonte: INMETRO e PROCEL, 2022)

---

## 2.5. Comparação com Equipamento de Referência

**Fórmula:**

$$
\Delta \eta = \frac{\eta_{\text{equipamento}}}{\eta_{\text{referência}}} \times 100
$$

**Descrição dos termos:**

- $\Delta \eta$: Eficiência relativa comparada ao melhor do mercado.
- $\eta_{\text{equipamento}}$: Eficiência do equipamento avaliado.
- $\eta_{\text{referência}}$: Eficiência do melhor equipamento disponível.

(Fonte: IEA, 2023)

---

# Referências

- INMETRO – Portaria nº 488/2010 – Regulamento técnico de eficiência energética para motores elétricos.
- PROCEL (2015) – Manual de Eficiência Energética em Sistemas Motrizes.
- DOE (2012) – Adjustable Speed Drive Applications.
- WEG (2021) – Manual Técnico de Motores Elétricos.
- IEA (2023) – Energy Efficiency Indicators.
- SEBRAE (2018) – Eficiência Energética na Indústria.
