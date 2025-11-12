Questão 1 (Strategy):

Foi escolhido o método Strategy para a primeira questão, pelo fato da necessidade de alteração dos algoritimos de risco em tempo de execução do código.
De forma que, pode-se iniciar com um algoritimo de risco, e logo em seguida, o substituir por outro.
No caso do código, os algoritimos de risco são tratados como calculadoras: RiskCalculator, StressTestingCalculator e ValueAtRiskCalculator. Cada uma, com sua lógica de cálculo específica.
O usuário pode apenas mudar a calculadora que deseja utilizar na main.

Questão 2 (Adapter):

Foi escolhido o método Adapter por conta do fato da necessidade de mudança entre sistemas diferentes, um legado, e outro atualizado. 
Onde ambas as interfaces possuem regras diferentes, de forma que o código, pode converter as requisições do novo sistema para o legado.  

Questão 3 (State):

Foi escolhido o método State, por conta da necessidade de uma mudança dinâmica de estado da usina, de acordo com as condições atuais.
Por exemplo, caso a temperatura aumente para mais de 300 graus, o estado deve ser alterado de uma operação normal, para alerta amarelo. Tudo isso ocorrendo em tempo de execução do código.
Cada estado possui suas regras especificas, e caso não sejam satisfeitas, o estado irá ser alterado.

Qyestão 4 (Chain of Responsability):

Foi escolhido o método Chain of Responsability, por conta da necessidade de validações subsequentes do documento fiscal.
Onde, foram dividas em 5 etapas, a verificação do documento, de forma que, após cada validação, ela passasse para a seguinte, e em dois casos, apenas seguindo caso a validação anterior tenha sido satisfeita.
