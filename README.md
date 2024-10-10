**EXERCÍCIO 01**

**Exercício: Implementação de Interface de Funcionários e Benefícios**

Você deve implementar um sistema para uma empresa que possui diversos tipos de funcionários. Cada funcionário pode receber diferentes tipos de benefícios, dependendo de sua função. O objetivo é usar interfaces para definir as funcionalidades comuns entre os tipos de funcionários, assim como para os benefícios.

### Requisitos:

1. **Interface `Funcionario`:**
    - Defina uma interface `Funcionario` que tenha os seguintes métodos:
        - `double calcularSalario();`
        - `String getNome();`
        - `String getFuncao();`
2. **Interface `Beneficio`:**
    - Crie outra interface `Beneficio` com os métodos:
        - `double calcularBeneficio();`
        - `String descricaoBeneficio();`
3. **Classes Implementadoras:**
    - Crie as classes `Gerente`, `Engenheiro` e `Estagiario` que implementam a interface `Funcionario`. Cada uma dessas classes deve calcular o salário de maneira diferente.
    - Crie classes específicas de benefícios, como `PlanoDeSaude`, `ValeRefeicao`, e `ValeTransporte`, que implementam a interface `Beneficio`.
4. **Classe de Funcionário com Benefícios:**
    - Crie uma classe `FuncionarioComBeneficio` que associa um funcionário a uma lista de benefícios (um funcionário pode ter mais de um benefício).
    - Essa classe deve ter um método para calcular o total de benefícios recebidos por um funcionário e também exibir todas as descrições dos benefícios.
5. **Main:**
    - No método principal (`public static void main(String[] args)`), crie uma lista de diferentes funcionários, adicione benefícios a eles e exiba o salário final (salário base + benefícios) e a descrição dos benefícios de cada um.

**Objetivo:**
O objetivo é praticar o uso de interfaces para abstrair funcionalidades comuns e permitir que diferentes tipos de objetos as implementem de maneira específica, seguindo o princípio de polimorfismo.
