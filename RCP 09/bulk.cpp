#include <bits/stdc++.h>
using namespace std;
int main(){
    int c, p;
    int resul=0;
    scanf("%d %d", &c,&p);
    if(c==1){
        printf("%d\n", p);
    }
    if (c>1){
        resul=p;
        for(int i=1; i<c; i++){
            resul+=(p-2);
        }
        printf("%d\n", resul);
    }
    return 0;
}