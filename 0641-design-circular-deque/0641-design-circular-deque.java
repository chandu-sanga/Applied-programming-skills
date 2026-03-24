class MyCircularDeque{
int[]arr;
int front,rear,size,cap;
public MyCircularDeque(int k){
cap=k;
arr=new int[k];
front=0;
rear=-1;
size=0;
}
public boolean insertFront(int value){
if(isFull())return false;
front=(front-1+cap)%cap;
arr[front]=value;
if(size==0)rear=front;
size++;
return true;
}
public boolean insertLast(int value){
if(isFull())return false;
rear=(rear+1)%cap;
arr[rear]=value;
if(size==0)front=rear;
size++;
return true;
}
public boolean deleteFront(){
if(isEmpty())return false;
front=(front+1)%cap;
size--;
return true;
}
public boolean deleteLast(){
if(isEmpty())return false;
rear=(rear-1+cap)%cap;
size--;
return true;
}
public int getFront(){
if(isEmpty())return -1;
return arr[front];
}
public int getRear(){
if(isEmpty())return -1;
return arr[rear];
}
public boolean isEmpty(){
return size==0;
}
public boolean isFull(){
return size==cap;
}
}