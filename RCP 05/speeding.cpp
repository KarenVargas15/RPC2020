#include <bits/stdc++.h>
using namespace std;
int main(){
    int n, ta,da, tb, db;
    int x = 0;
    cin>>n;
    n=n-1;
    cin>>ta>>da;
    while(n--){
        cin>>tb>>db;
        x = max((db-da)/(tb-ta), x);
        ta = tb;
        da = db;
    }
    cout<<x <<endl;
}