bool isPowerOfTwo(int n) {
    /*int f=0;
    int x=n;
    while(x>2)
    {
        int d=x/2;
        if(d%2==0)
        {
            x=d;
        }
        else
        {
            f=1;
            break;
        }
    }
    if(n==1){
        return true;
    }
    else if(f==1 || n==0 || n<0 || n%2!=0)
    {
        return false;
    }
    else{
        return true;
    }*/


    if(n<=0){
        return false;
    }
    return ((n&(n-1))==0);
}