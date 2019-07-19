//developer
/*class [c-Name]<T>
{

}*/
/*class GenericClass<T>
{

}*/
 class GenericClass<T>
{
private T t;
public void setValue(T t)
{
this.t=t;
}
public T getValue()
{
return t;
}
public static void main(String[] arg)
{
GenericClass<Integer>obj=new GenericClass<Integer>();
obj.setValue(10);
System.out.println(obj.getValue());
}
}