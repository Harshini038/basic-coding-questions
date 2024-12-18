
Arrays.sort(a);
int low=0;
int high= a.length-1; int mid = (low+high)/2; boolean found= false;
while(low<=high){
if(a[mid] == search){
}
System.out.println("Element found");
found = true;
break;
else if(search<a[mid]){
high = mid-1;
}
}
else{
low= mid+1;
}
mid=(high+low)/2;
if(found==false){
System.out.println("Element not found");
}
