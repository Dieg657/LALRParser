# LALR Parser
Gramática:

S' -> S
S -> E ; A
S -> A
A -> I
A -> E
I -> if E then S else S
E -> E + T
E -> F
E -> ( E )
T -> T * F
T -> F
F -> 0
F -> 1


