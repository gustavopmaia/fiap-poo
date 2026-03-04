# FiapRide

## Descrição

Este projeto tem duas classes Java:

* `Mouse`: representa um mouse de computador.
* `Passageiro`: representa um usuário de transporte público com saldo para pagamento de viagens.

---

## Classe `Mouse`

### O que representa

Um mouse físico de computador, com informações sobre:

* DPI (sensibilidade)
* Tamanho
* Se é com fio
* Se está conectado

### Atributos

* `private int dpi` → Sensibilidade do mouse.
* `public double size` → Tamanho físico do mouse.
* `public boolean isWired` → Indica se o mouse é com fio.
* `public boolean isConnected` → Indica se o mouse está conectado.

---

### Métodos

#### `click()`

Simula um clique do mouse.

Se o mouse **não estiver conectado**, exibe:

```
Erro: Mouse não está conectado
```

Caso contrário, exibe:

```
Clicou!
```

---

#### `scroll(boolean isUp)`

Simula o uso do scroll do mouse.

Se o mouse **não estiver conectado**, exibe:

```
Erro: Mouse não está conectado
```

Se estiver conectado:

* `true` → exibe:

```
Mouse scrollou para Cima
```

* `false` → exibe:

```
Mouse scrollou para Baixo
```

---

#### `connect()`

Conecta o mouse.

Se o mouse **já estiver conectado**, exibe:

```
Erro: Mouse já está conectado
```

Caso contrário:

```
Mouse conectado!
```

---

#### `changeDpi(int newDpi)`

Altera o DPI do mouse.

Se o valor informado for **menor ou igual a zero**, exibe:

```
Erro: DPI tem que ser maior que zero.
```

Caso contrário, atualiza o DPI e exibe:

```
Nova DPI do mouse: <valor>
```

---

## Classe `Passageiro`

### O que representa

Um passageiro com nome, CPF e saldo para pagar viagens.

### Construtor

```java
public Passageiro(String nome, String cpf)
```

Cria um passageiro com saldo inicial igual a 0.0.

### Métodos

* `adicionarSaldo(double valor)`

Adiciona crédito ao saldo.
O valor deve ser maior que zero.

* `pagarViagem(double custo)`

Desconta o valor da viagem do saldo.
O custo deve ser maior que zero e o passageiro deve ter saldo suficiente.