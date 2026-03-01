# 🔰 Lista de Exercícios de Listas em Java — Estruturas de Dados

Esta maratona tem como objetivo ensinar progressivamente a implementação manual de listas em Java, desde listas estáticas até listas circulares.

---

## 📘 Nível 1 — Lista Estática (Array Fixo)

🔹 *Objetivo: entender como implementar uma lista usando array fixo e controle manual do tamanho.*

### 📘 Exercícios (01–10)

1. Criar a classe Lista com um array de tamanho 10 e atributo tamanho.

2. Criar método inserirFim(int valor).

3. Inserir 5 valores e imprimir manualmente o array.

4. Criar método imprimir() para mostrar todos os elementos da lista.

5. Criar método inserirInicio(int valor).

6. Criar método inserirPosicao(int valor, int pos).

7. Criar método removerFim().

8. Criar método removerInicio().

9. Criar método removerPosicao(int pos).

10. Criar método buscar(int valor) que retorna a posição do elemento.

---

## 📗 Nível 2 — Lista Estática Dinâmica (Resize)

🔹 *Objetivo: implementar crescimento automático da lista.*

### 📗 Exercícios (11–20)

11. Criar construtor que define capacidade inicial.

12. Criar método redimensionar() que dobra a capacidade do array.

13. Modificar inserirFim para redimensionar automaticamente quando necessário.

14. Inserir 20 elementos e verificar o crescimento.

15. Criar método capacidade() que retorna o tamanho do array.

16. Criar método estaCheia().

17. Criar método estaVazia().

18. Criar método limpar() que remove todos os elementos.

19. Criar método toString() para retornar os elementos como String.

20. Criar método buscarOrdenado(int valor).

---

## 📙 Nível 3 — Lista Encadeada Simples

🔹 *Objetivo: entender estrutura baseada em nós e ponteiros.*

### 📙 Exercícios (21–30)

21. Criar classe No com valor e referência prox.

22. Criar classe Lista com atributo inicio.

23. Criar método inserirInicio(int valor).

24. Criar método inserirFim(int valor).

25. Criar método imprimir().

26. Criar método buscar(int valor).

27. Criar método removerInicio().

28. Criar método removerFim().

29. Criar método removerValor(int valor).

30. Criar método tamanho().

---

## 📕 Nível 4 — Lista Encadeada com Cabeça

🔹 *Objetivo: eliminar casos especiais usando nó cabeça.*

### 📕 Exercícios (31–40)

31. Criar lista com nó cabeça.

32. Criar método inserirInicio(int valor).

33. Criar método inserirFim(int valor).

34. Criar método inserirPosicao(int valor, int pos).

35. Criar método removerInicio().

36. Criar método removerFim().

37. Criar método removerValor(int valor).

38. Criar método buscar(int valor).

39. Criar método estaVazia().

40. Criar método imprimir().

---

## 📓 Nível 5 — Lista Duplamente Encadeada

🔹 *Objetivo: permitir navegação para frente e para trás.*

### 📓 Exercícios (41–50)

41. Criar classe No com valor, prox e ant.

42. Criar classe Lista com inicio e fim.

43. Criar método inserirInicio(int valor).

44. Criar método inserirFim(int valor).

45. Criar método removerInicio().

46. Criar método removerFim().

47. Criar método imprimirInicioFim().

48. Criar método imprimirFimInicio().

49. Criar método inserirPosicao(int valor, int pos).

50. Criar método removerPosicao(int pos).

---

## 📔 Nível 6 — Lista Circular

🔹 *Objetivo: implementar estrutura onde o último aponta para o primeiro.*

### 📔 Exercícios (51–60)

51. Criar lista circular.

52. Criar método inserirPrimeiro(int valor).

53. Criar método inserirInicio(int valor).

54. Criar método inserirFim(int valor).

55. Criar método removerInicio().

56. Criar método removerFim().

57. Criar método imprimir().

58. Criar método buscar(int valor).

59. Criar método tamanho().

60. Implementar uma fila usando lista circular.

---

# 🧭 Índice de Exercícios

---

## Nível 1 - Lista Estática (01 a 10)

1. [Exercicio01](./Maratona/Lista/src/Nivel_1/Exercicio01.java)
2. [Exercicio02](./Maratona/Lista/src/Nivel_1/Exercicio02.java)
3. [Exercicio03](./Maratona/Lista/src/Nivel_1/Exercicio03.java)
4. [Exercicio04](./Maratona/Lista/src/Nivel_1/Exercicio04.java)
5. [Exercicio05](./Maratona/Lista/src/Nivel_1/Exercicio05.java)
6. [Exercicio06](./Maratona/Lista/src/Nivel_1/Exercicio06.java)
7. [Exercicio07](./Maratona/Lista/src/Nivel_1/Exercicio07.java)
8. [Exercicio08](./Maratona/Lista/src/Nivel_1/Exercicio08.java)
9. [Exercicio09](./Maratona/Lista/src/Nivel_1/Exercicio09.java)
10. [Exercicio10](./Maratona/Lista/src/Nivel_1/Exercicio10.java)

---

## Nível 2 - Lista Estática Dinâmica (11 a 20)

11. [Exercicio11](./Maratona/Lista/src/Nivel_2/Exercicio11.java)
12. [Exercicio12](./Maratona/Lista/src/Nivel_2/Exercicio12.java)
13. [Exercicio13](./Maratona/Lista/src/Nivel_2/Exercicio13.java)
14. [Exercicio14](./Maratona/Lista/src/Nivel_2/Exercicio14.java)
15. [Exercicio15](./Maratona/Lista/src/Nivel_2/Exercicio15.java)
16. [Exercicio16](./Maratona/Lista/src/Nivel_2/Exercicio16.java)
17. [Exercicio17](./Maratona/Lista/src/Nivel_2/Exercicio17.java)
18. [Exercicio18](./Maratona/Lista/src/Nivel_2/Exercicio18.java)
19. [Exercicio19](./Maratona/Lista/src/Nivel_2/Exercicio19.java)
20. [Exercicio20](./Maratona/Lista/src/Nivel_2/Exercicio20.java)

---

## Nível 3 - Lista Encadeada Simples (21 a 30)

21. [Exercicio21](./Maratona/Lista/src/Nivel_3/Exercicio21.java)
22. [Exercicio22](./Maratona/Lista/src/Nivel_3/Exercicio22.java)
23. [Exercicio23](./Maratona/Lista/src/Nivel_3/Exercicio23.java)
24. [Exercicio24](./Maratona/Lista/src/Nivel_3/Exercicio24.java)
25. [Exercicio25](./Maratona/Lista/src/Nivel_3/Exercicio25.java)
26. [Exercicio26](./Maratona/Lista/src/Nivel_3/Exercicio26.java)
27. [Exercicio27](./Maratona/Lista/src/Nivel_3/Exercicio27.java)
28. [Exercicio28](./Maratona/Lista/src/Nivel_3/Exercicio28.java)
29. [Exercicio29](./Maratona/Lista/src/Nivel_3/Exercicio29.java)
30. [Exercicio30](./Maratona/Lista/src/Nivel_3/Exercicio30.java)

---

## Nível 4 - Lista com Cabeça (31 a 40)

31. [Exercicio31](./Maratona/Lista/src/Nivel_4/Exercicio31.java)
32. [Exercicio32](./Maratona/Lista/src/Nivel_4/Exercicio32.java)
33. [Exercicio33](./Maratona/Lista/src/Nivel_4/Exercicio33.java)
34. [Exercicio34](./Maratona/Lista/src/Nivel_4/Exercicio34.java)
35. [Exercicio35](./Maratona/Lista/src/Nivel_4/Exercicio35.java)
36. [Exercicio36](./Maratona/Lista/src/Nivel_4/Exercicio36.java)
37. [Exercicio37](./Maratona/Lista/src/Nivel_4/Exercicio37.java)
38. [Exercicio38](./Maratona/Lista/src/Nivel_4/Exercicio38.java)
39. [Exercicio39](./Maratona/Lista/src/Nivel_4/Exercicio39.java)
40. [Exercicio40](./Maratona/Lista/src/Nivel_4/Exercicio40.java)

---

## Nível 5 - Lista Duplamente Encadeada (41 a 50)

41. [Exercicio41](./Maratona/Lista/src/Nivel_5/Exercicio41.java)
42. [Exercicio42](./Maratona/Lista/src/Nivel_5/Exercicio42.java)
43. [Exercicio43](./Maratona/Lista/src/Nivel_5/Exercicio43.java)
44. [Exercicio44](./Maratona/Lista/src/Nivel_5/Exercicio44.java)
45. [Exercicio45](./Maratona/Lista/src/Nivel_5/Exercicio45.java)
46. [Exercicio46](./Maratona/Lista/src/Nivel_5/Exercicio46.java)
47. [Exercicio47](./Maratona/Lista/src/Nivel_5/Exercicio47.java)
48. [Exercicio48](./Maratona/Lista/src/Nivel_5/Exercicio48.java)
49. [Exercicio49](./Maratona/Lista/src/Nivel_5/Exercicio49.java)
50. [Exercicio50](./Maratona/Lista/src/Nivel_5/Exercicio50.java)

---

## Nível 6 - Lista Circular (51 a 60)

51. [Exercicio51](./Maratona/Lista/src/Nivel_6/Exercicio51.java)
52. [Exercicio52](./Maratona/Lista/src/Nivel_6/Exercicio52.java)
53. [Exercicio53](./Maratona/Lista/src/Nivel_6/Exercicio53.java)
54. [Exercicio54](./Maratona/Lista/src/Nivel_6/Exercicio54.java)
55. [Exercicio55](./Maratona/Lista/src/Nivel_6/Exercicio55.java)
56. [Exercicio56](./Maratona/Lista/src/Nivel_6/Exercicio56.java)
57. [Exercicio57](./Maratona/Lista/src/Nivel_6/Exercicio57.java)
58. [Exercicio58](./Maratona/Lista/src/Nivel_6/Exercicio58.java)
59. [Exercicio59](./Maratona/Lista/src/Nivel_6/Exercicio59.java)
60. [Exercicio60](./Maratona/Lista/src/Nivel_6/Exercicio60.java)

---