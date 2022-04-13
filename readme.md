# Algorithms and Data Structure exercises
Data structures:

    - Graphs
    - Edges

Algorithms:

    - DFS (iterative and recursive)
    - BFS (iterative and recursive)

## Binary Trees

### Simple binary tree:
            a
          /   \
         b     c
       /   \    \
      d     e    f

## Graphs

### Char Graph:
    a: ['b', 'c']
    b: ['d']
    c: ['e']
    d: ['f']
    e: []
    f: []

### Has Path Graph:
    f: ['g', 'i']
    g: ['h']
    h: []
    i: ['g', 'k']
    j: ['i']
    k: []

### Undirected Edge transformed into a graph:
    i: [j, k],
    j: [i],
    k: [i, m, l],
    l: [k],
    m: [k],
    n: [o],
    o: [n]

### Connected Components Count graph:
    3: [],
    4: [6],
    6: [4, 5, 7, 8]
    8: [6],
    7: [6],
    5: [6],
    1: [2],
    2: [1]

### Largest Components graph:
    0: [8, 1, 5],
    1: [0],
    5: [0, 8],
    8: [0, 5],
    2: [3, 4],
    3: [2, 4],
    4: [3, 2]

### Shortest Path Edge transformed into a graph:
    w: [x, v],
    x: [w, y],
    y: [x, z],
    v: [w, z],
    z: [v, y],

## Edges

### Undirected Edge Path
    [
        [i, j],
        [k, i],
        [m, k],
        [k, l],
        [o, n]
    ]

### Shortest Path
    [
        [w, x],
        [x, y],
        [z, y],
        [z, v],
        [w, v],
    ]

## Matrix

### Island count & Minimum Island
    | w | l | w | w | l | w |
    | l | l | w | w | l | w |
    | w | l | w | w | w | w |
    | w | w | w | l | l | w |
    | w | l | w | l | l | w |
    | w | w | w | w | w | w |
    