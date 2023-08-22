#include<bits/stdc++.h>
using namespace std;
int main(){
    int n, count = 0, i;
    cin >> n;
    int arr[100000];
    i = 0;
    for(i = 0; i < n; i++){
        cin >> arr[i];
    }
    for(i = 0; i < n; i++){
        if(arr[i] != arr[i + 1]){
            count++;
        }
    }
    cout << count << endl;
    return 0;
}
