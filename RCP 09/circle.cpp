#include <bits/stdc++.h>
using namespace std;
int main(){
    double ans = 2 + sqrt(2) + sqrt(6);
    double a;
    scanf("%lf", &a);
    double c = a*ans;
    double r = c*c;
    printf("%.5lf\n", r);
    return 0;
}
