# Manual de Funcionamento

## Instalação
O projeto deve ter o AIMA-core importado;

## Utilização

A classe Main.java tem no começo do seu método main a instância de um dos três casos. Para que o código funcione, é preciso escolher apenas um destes.

```java
CSP<Variable, String> csp = new Case1();
CSP<Variable, String> csp = new Case2();
CSP<Variable, String> csp = new Case3();
```

Após isso a CSP é resolvida, encontrando uma solução ou não. Caso não encontre uma solução, o main vai ser chamado de maneira recursiva até encontrá-la. Assim que ela é encontrada, ela é impressa na tela.
