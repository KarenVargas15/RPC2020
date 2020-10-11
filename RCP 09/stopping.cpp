#include <bits/stdc++.h>
using namespace std;
int main(){
    int t, g, c;
    set<int>p;
    scanf("%d %d %d", &t, &g, &c);
    for(int i=g; i<t; i+=g){
        p.insert(i);
    }
    for(int i=c; i<t; i+=c){
        p.insert(i);
    }
    int cont = p.size();
    printf("%d\n", cont);
    return 0;
}