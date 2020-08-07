import java.util.HashMap;
import java.util.Map;

public class HuaWei_08_07 {
 
    public static void main(String[] args){
      String s="a:3,b:5,c:2@a:3,b:1";
      HuaWei_08_07 hua=new HuaWei_08_07();
      String useStr=hua.UserStrings(s);
      System.out.print(useStr);
    }
 
    public String UserStrings(String s){
          String[] str=s.split("@");
          if(str.length==1){
              return str[0];
          }
 
         Map<String,Integer> map=new HashMap<>();
          for(int i=0;i<str.length;i++){
              map=putmap( map,str[i].split(","),i);
          }
          
        StringBuffer buf=new StringBuffer();
        for(String key:map.keySet()){
            if(map.get(key)!=0) {
               buf.append(key+":"+map.get(key)+",");
            }
        }
        String s1=buf.toString();
        return s1.substring(0,s1.length()-1);
 
    }
 
 
    public Map<String,Integer> putmap(Map<String,Integer> map,String[] str,int flag){
        for(int i=0;i<str.length;i++){
            String s2=str[i].split(":")[0];
            int a=Integer.parseInt(str[i].split(":")[1]);
            if(flag==1&&map.containsKey(s2)){
                int b=map.get(s2)-a;
                map.put(s2,b);
            }else{
                map.put(s2,a);
            }
        }
        System.out.println(map);
        return map;
    }
}