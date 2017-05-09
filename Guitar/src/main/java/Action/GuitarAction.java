package Action;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;
import org.apache.struts2.interceptor.ApplicationAware;
import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.ServletResponseAware;
import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

import Guitar.Dao.GuitarImpl;


public class GuitarAction extends ActionSupport  implements SessionAware, ApplicationAware ,ServletRequestAware,ServletResponseAware {
	
private int id;
private int price;
private String Model;
private String type;
private String builder;

public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public int getPrice() {
	return price;
}
public void setPrice(int price) {
	this.price = price;
}
public String getModel() {
	return Model;
}
public void setModel(String model) {
	Model = model;
}
public String getType() {
	return type;
}
public void setType(String type) {
	this.type = type;
}
public String getBuilder() {
	return builder;
}
public void setBuilder(String builder) {
	this.builder = builder;
}

public String search(){
	 GuitarImpl gi=new GuitarImpl();
	 String sql="select * from guitar where 1=1";
		if(id!=0)
			sql=sql+" and id="+id+"";
		if(!type.isEmpty())
			sql=sql+" and type="+"'"+type+ "'";
		if(!Model.isEmpty())
			sql=sql+" and model="+"'" +Model+"'";
		if(!builder.isEmpty())
			sql=sql+" and builder="+"'"+builder+"'";
		if(price!=0)
			sql=sql+" and price="+price+"";
	 List<GuitarAction> glist=gi.search(sql);
	 if(!glist.isEmpty()){
		 HttpServletRequest request=ServletActionContext.getRequest();
			request.setAttribute("list", glist);
			return SUCCESS;
	 }
	
	return ERROR;
	
}
@Override
public void setServletResponse(HttpServletResponse response) {
	// TODO Auto-generated method stub
	
}
@Override
public void setServletRequest(HttpServletRequest request) {
	// TODO Auto-generated method stub
	
}
@Override
public void setApplication(Map<String, Object> application) {
	// TODO Auto-generated method stub
	
}
@Override
public void setSession(Map<String, Object> session) {
	// TODO Auto-generated method stub
	
}

}
