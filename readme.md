# Algorithms and Data Structure exercises
Data structures:

    - Graphs
    - Edges

Algorithms:

    - DFS (iterative and recursive)
    - BFS (iterative and recursive)

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

## Edges

### Undirected Edge Path
    [
        [i, j],
        [k, i],
        [m, k],
        [k, l],
        [o, n]
    ]
