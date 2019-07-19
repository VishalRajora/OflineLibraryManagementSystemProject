//date
import java.util.*;//date
import java.text.*;//dateformate
class aa
{
public static void main(String[] args)
{
Date d=new Date();
//String s=DateFormat.getDateInstance().format(d);
//String s=DateFormat.getTimeInstance().format(d);
String s=DateFormat.getTimeInstance(DateFormat.SHORT).format(d);
{
System.out.println(s);
}
}
}