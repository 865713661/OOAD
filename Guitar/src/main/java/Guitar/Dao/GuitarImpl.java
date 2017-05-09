package Guitar.Dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import Action.GuitarAction;
import Guitar.Dbuitl.DbUtil;

public class GuitarImpl {
	
	private GuitarAction guitarAction;
	
	public List<GuitarAction> search(String sql){
		List<GuitarAction> glist=new ArrayList<GuitarAction>();	
		ResultSet rs=DbUtil.executeQuery(sql,new Object[]{});
		try {
			while(rs.next()){
				GuitarAction guitarAction=new GuitarAction();
				guitarAction.setId(rs.getInt(1));
				guitarAction.setType(rs.getString(2));
				guitarAction.setModel(rs.getString(3));	
				guitarAction.setPrice(rs.getInt(4));
				guitarAction.setBuilder(rs.getString(5));
				glist.add(guitarAction);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return glist;
		
	}

}
