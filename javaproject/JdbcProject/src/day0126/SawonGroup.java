package day0126;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import oracleDb.DbConnect;

public class SawonGroup {

	
	DbConnect db=new DbConnect(); //다른페이지에 있어서 import된다
	
	public void connectSawonGroup()
	{
		Connection conn=null;
		Statement stmt=null;
		ResultSet rs=null;
		
		String sql="select gender, count(buseo) count, to_char(round(avg(pay),0),'L999,999,999') avgpay,"
				+ "to_char(max(pay),'L999,999,999') maxpay,to_char(min(pay),'L999,999,999') minpay "
				+ "from sawon group by gender";
		
		conn=db.getOracle();
		System.out.println("오라클 계정연결성공!!!");
		
		try {
			stmt=conn.createStatement();
			rs=stmt.executeQuery(sql);
			System.out.println("\t***회사 남녀별 급여통계***");
			System.out.println();
			System.out.println("성별\t인원수\t평균급여\t최고급여\t최저급여");
			System.out.println("--------------------------------------------------");
			
			while(rs.next())
			{
				String gender=rs.getString("gender");
				int count=rs.getInt("count");
				String avgpay=rs.getString("avgpay");
				String maxpay=rs.getString("maxpay");
				String minpay=rs.getString("minpay");
				
				System.out.println(gender+"\t"+count+"\t"+avgpay+"\t"+maxpay+"\t"+minpay);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			db.dbClose(rs, stmt, conn);
		}
		
	}
	
	
	public void personGroup()
	{
		//job별 인원수와 평균나이 구해주세요
		Connection conn=null;
		Statement stmt=null;
		ResultSet rs=null;
		
		String sql = "select job, count(*) count, round(avg(age), 2) avgage "
                + "from person group by job";
		
		conn=db.getOracle();
		System.out.println("오라클 계정연결성공!!!");
		
		try {
			stmt=conn.createStatement();
			rs=stmt.executeQuery(sql);
			System.out.println("\t***회사 직급별 인원 및 평균 나이***");
			System.out.println();
			System.out.println("직급\t인원수\t평균나이");
			System.out.println("-----------------------------------------------------------");
			
			while(rs.next())
			{
				String job=rs.getString("job");
				int count=rs.getInt("sount");
				double avgAge=rs.getDouble("avgage");
				
				System.out.println(job+"\t"+count+"\t"+avgAge);
				
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			db.dbClose(rs, stmt, conn);
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SawonGroup sawonGroup = new SawonGroup(); // 객체 생성이 누락되어 있었습니다.
        sawonGroup.connectSawonGroup(); // connectSawonGroup 메서드 호출
		
	}

}
