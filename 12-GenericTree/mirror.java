public static boolean mirror(Node n1, Node n2){
    // write your code here
    if(n1.children.size() != n2.children.size()) return false;
    int n = n1.children.size();
    for(int i = 0, j = n -1; i < n; i++, j--) {
        Node c1 = n1.children.get(i);
        Node c2 = n2.children.get(j);
        if(!mirror(c1,c2)) return false;
    }
    return true;
  }