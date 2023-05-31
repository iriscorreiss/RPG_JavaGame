# RPG_JavaGame
Programação Orientada a Objetos: Projeto Prático do desenvolvimento de um RPG (Role-Playing Game) onde uma personagem (Herói) deve percorrer um caminho e fazer escolhas de modo a concluir um labirinto cheio de obstáculos e inimigos.

1.Crie uma classe abstrata “Entidade” com os atributos: nome (String), vidaou  hp(int) e  força  (int)e o  método abstrato mostrarDetalhes que deve ter uma implementação que permita escrever na consola todos os detalhes da entidade.

2.Seguidamente, crie as suas subclasses Heroi(Por sua vez será abstrata) e NPC(Non-playable character).A classe Hero deverá ter atributo de nível (int), ouro (int), uma arma(Arma)e um array de poções,e o método abstrato atacar que recebe um NPC como argumento, esta classe deverá ter uma implementação diferente em cada uma das suas subclasses, no entanto, a finalidade é a mesma, confrontar o herói com um NPC numa luta até que um fique sem vida.

3.Posteriormente,  deverá  existir  uma  classe  abstrata ItemHeroique  tem  atributo  de  nome  (String),  o  preço  em moedas de ouro (int) e o arraytipoHeroi que irá guardar o tipo de heróis que podem/sabem usar o dito item.Deve conter o método abstrato mostrarDetalhes

4.Com  isto,  desenvolva  duas  subclasses  de ItemHeroi, Armae PoçãoHP.  A  classe  Arma  deve  ter  o  atributo  de ataque  (int)  e  a  classe  PoçãoHP  deve  ter  o  atributo  de  vida  a  curar  (int).Deve  implementar  o  método mostrarDetalhes que imprime na consola as especificações de cada item.

5.Seguidamente instancie a classe Vendedorque terá um array de Itens como atributo, que o Herói poderá comprar durante o seu jogo.Deve ter o método imprimir inventário.Deve ter o método vender que recebe o Herói como parâmetroe verifica se a compra pode ser efetuada, caso tal compra seja possível, deveacrescentar ao inventário do herói o item(se for arma será uma substituição)e decrementar o seu ouro.

6.A  classe Heroideverá  ter  três  subclasses  indicando  o  tipo  de  herói  com  que  o  utilizador  poderá  jogar, nomeadamente, Cavaleiro, Feiticeiroe Arqueiro. Deve ter o método usarPocao, imprime o inventário do Herói e pergunta qual quer usar, seguidamente incrementa na vida do Herói a vida da poção.Cada uma destas deve implementar o método atacar de acordo com as seguintes regras:
  a.Cavaleiro: Recebe o NPC como argumento. Esta é a única classe onde o inimigo ataca primeiro. O inimigo ataca (é subtraído à vida do herói a força do inimigo, mas neste herói, devido à   sua armadura, o inimigo só tem 80% da força inicial), seguidamente ataca o herói (é subtraído à vida do inimigo a força do herói somado como ataque da sua arma).
  b.Feiticeiro: Recebe o NPC como argumento. O Herói ataca primeiro (é subtraído à vida do inimigo a força do herói somado com o ataque da sua arma).Seguidamente o inimigo ataca (é       subtraído à vida do herói a força do inimigo).
   c.Arqueiro:Recebe o NPC como argumento. O Herói ataca primeiro (é subtraído à vida do inimigo a força do herói somado com o ataque da sua   arma). Seguidamente o inimigo ataca (é subtraído à vida do herói a força do inimigo, devido à falta de proteção, este herói recebe 10% mais dano).
  d.O método atacar termina quando um dos envolventes na luta morrer, ou seja, a sua vida seja igual ou menos que 0. A partir daí deve devolver a entidade vencedora.e.Se o vencedor for o Herói, este sobe de nível e ganha 10 pontos de vida, 1 ponto de força e 10 moedas de ouro.

7.Elabore uma Classe Jogocom um método labirinto. Este método deve ser invocado no main desta mesma classe.Inicialmente  deve  perguntar  qual  o  tipo  de  herói  com  que  o  utilizador  deseja  jogar  (Cavaleiro,  Feiticeiro ouArqueiro). Seguidamente é perguntada a dificuldade, podendo ser Fácil ou Difícil. Seguidamente o utilizador pode distribuir pontos de criação de personagem entre vida e força da sua personagem, sabendo que cada ponto de vida vale um ponto de criação de personagem e cada ponto de força vale 5 pontos de criação de personagem, assim o utilizador deve distribuir corretamente de modo a ficar com 0 pontosde criação da personagem. Se a dificuldade for fácil tem direito a 300 pontos, se for difícil só tem direito a 220 pontos.A seguir é também atribuído ouro à personagem, se a dificuldade for fácil tem direito a 20 moedas de ouro, se for difícil apenas a 15 moedas de ouro.

8.Quando distribuir corretamente os pontos, deve ser instanciado o Herói.

9.Devem ser instanciados sem conhecimento do utilizador os seus inimigos que vão estar escondido no labirinto.

10.Instancie, no mínimo,  13itens,  os  quais  serão  adicionados  a uma instânciade Vendedor.(Note que cada  item pode  ser  usado  por  uma  ou  mais  categorias  de  Heróis,  deve  ter,  no  mínimo,  uma  poção  de  vida  que  cura  25 pontos de vida que seja possível usar por todas as categorias).

11.A aventura começa com uma explicação do porque do herói ter de enfrentar o Labirinto dos Perigos, a seguir no vendedor que se encontra à porta do labirinto, este terá itens à venda, a primeira ação é imprimir todos os itens na consola. Seguidamente o utilizador pode escolher qual quer comprar. Deve ser da classe de Herói certa e ter o ouro suficiente para fazer.Pode comprar os que quiser, ou simplesmente avançar sem itens para poupar ouro.

O labirinto podeter o seguinte aspeto, ficando à sua escolha a organização do mesmo:

![image](https://github.com/iriscorreiss/RPG_JavaGame/assets/24630339/5ac9c790-82e5-42eb-97c8-26db51894d8b)

13.Deve ter, pelo menos 12salas e, no mínimo, 3 situações de escolhas diferentes. Pode ser criativo uma vez que está a criar uma narrativa.

14.Ao fim de cada sala, o Herói pode usar uma das poções ou avançar. Se a sala for de tesouro, pode ter uma poção de vidaou uma arma (o utilizador apenas pode apanhar se souber usar, ou seja, se for da classe certa para tal).

15.Pode  ter a  sala  de  vendedor  onde  o  vendedor  é  o  mesmo  do  início  e  o  utilizador pode  comprar  itens,  para  os quais não tinha ouro inicialmente.

16.Cada sala que tenha um inimigo deve invocar o método atacar, seguidamente verificar qual o vencedor. Se for o utilizador  pode  continuar  a  jogar,  caso  seja  o  inimigo  o  jogo  deve  terminar.Quando  o  utilizador  perde,  este método labirinto deve retornar false. No maindeve apresentar a mensagem de derrota e perguntar de deseja jogar novamente.

17.Todas as classes devem estar organizadas em devidos packages:
  a.Pacote Entidades: Entidade, Hero, NPC, Cavaleiro, Feiticeiro, Arqueiro, Vendedor.
  b.Pacote Itens: ItemHeroi, Arma, PocaoHP
  c.Pacote Jogo: Jogo

18.Pode implementarmétodo ao seu critério, para além dos acima mencionados.

19.O jogo deve ter, pelo menos, uma maneira possível de ganhar.
