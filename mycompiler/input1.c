int main()
{
    int x=6;
    int y=x;
    int z;


    x=y+=z-=y*=x;

    x=y?x:z;

    x=y||0;

    x=y&&1;

    x=y|0;

    x=x==y;
    
    x=x<y;

    x=x<<2;

    x=x+1;

    x=x*c;

    ++x;

    x=*x;

    x=-5;

    x=!x;

    x();

    y=x[5];

    y=x.x;
    
    y=x->x;


}