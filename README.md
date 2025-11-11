Questão 1 (Strategy):

Foi escolhido o método Strategy para a primeira questão, pelo fato da necessidade de alteração dos algoritimos de risco em tempo de execução do código.
De forma que, pode-se iniciar com um algoritimo de risco, e logo em seguida, o substituir por outro.
No caso do código, os algoritimos de risco são tratados como calculadoras: RiskCalculator, StressTestingCalculator e ValueAtRiskCalculator. Cada uma, com sua lógica de cálculo específica.
O usuário pode apenas mudar a calculadora que deseja utilizar na main.

Questão 2 (Adapter):

Foi o escolhido o método Adapter por conta do fato da necessidade de mudança entre sistemas diferentes, um legado, e outro atualizado. 
Onde ambas as interfaces possuem regras diferentes, de forma que o código, pode converter as requisições do novo sistema para o legado.   
