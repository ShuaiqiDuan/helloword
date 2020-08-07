import java.util.HashMap;

public class huawei{
	public static void main(String[] args) {
		String s1 ="a:3,b:5,c:2@a:3,b:1";
		huawei user =new huawei();
		String useStr =user.UserString(s1);
		System.out.println(useStr);		
	}
	public String UserString(String s) {
		String[] str =s.split("@");
		HashMap<String,Integer> UserMap=new HashMap<>();
		for(int i=0;i<str.length;i++) {
			UserMap=putmap(UserMap,str[i],i);
		}
		StringBuffer str10=new StringBuffer();
		for(String key:UserMap.keySet()) {
			str10.append(key+":"+UserMap.get(key)+",");
		}
		String str11=str10.toString();
		return str11.substring(0,str11.length()-1);		
	}
	
	public HashMap<String,Integer> putmap(HashMap<String,Integer> map,String str,int i) {
		String[] str1 =str.split(",");
		for(int j=0;j<str1.length;j++) {
			String[] str2 =str1[j].split(":");
			if(i==0) {
				String mapString =str2[0];				
				int mapInteger =Integer.parseInt(str2[1]);
				map.put(mapString,mapInteger);
			}else {
				String mapString =str2[0];				
				int mapInteger =(int)map.get(mapString)-(int)Integer.parseInt(str2[1]);
				map.put(mapString,mapInteger);
			}
		}
		return map;
	}
	
}