#include<iostream>
using namespace std;
int main(){
    int n, a, d;
    char c;
    while(cin >> n){
        a = 0, d = 0;
        for(int i = 1; i <= n; i++){
            cin >> c;
            if(c == 'A'){
                a++;
            }else{
                d++;
            }
        }
        if(a > d){
            cout<<"Anton"<<endl;
        }else if(d > a){
            cout<<"Danik"<<endl;
        }else{
            cout<<"Friendship"<<endl;
        }
    }
    return 0;
}
