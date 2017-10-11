package member.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

import dandb.MemberVO;

public class MemberDAOImpl implements MemberDAO {

	private static MemberDAOImpl memberDAO = null;

	private String driver = null;
	private String url = null;
	private String username = null;
	private String password = null;

	private DataSource ds = null;

	private MemberDAOImpl() {

		try {
			Context context = new InitialContext();
			ds = (DataSource) context.lookup("java:/comp/env/jdbc/mydbcp");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private Connection getConnection() throws SQLException {
		return ds.getConnection();

	}

	public static MemberDAOImpl getInstance() {
		if (memberDAO == null) {
			memberDAO = new MemberDAOImpl();
		}
		return memberDAO;
	}

	private void dbClose(PreparedStatement ps, Connection cn) {
		if (ps != null)
			try {
				ps.close();
			} catch (Exception e) {
			}
		if (cn != null)
			try {
				cn.close();
			} catch (Exception e) {
			}
	}

	private void dbClose(ResultSet rs, PreparedStatement ps, Connection cn) {
		if (rs != null)
			try {
				rs.close();
			} catch (Exception e) {
			}
		if (ps != null)
			try {
				ps.close();
			} catch (Exception e) {
			}
		if (cn != null)
			try {
				cn.close();
			} catch (Exception e) {
			}
	}

	@Override
	public void insertMember(MemberVO memberVO) throws Exception {
		Connection cn = null;
		PreparedStatement ps = null;

		StringBuffer sql = new StringBuffer();
		sql.append("INSERT INTO tb_member(tb_memberid, tb_memberpwd, name, birthday, gender, email, phone, gradeid)");
		sql.append("VALUES(? , ? , ? , ? , ? , ? , ?, '1')");

		try {
			cn = getConnection();
			ps = cn.prepareStatement(sql.toString());

			ps.setString(1, memberVO.getMemberId());
			ps.setString(2, memberVO.getMemberPwd());
			ps.setString(3, memberVO.getMemberName());
			ps.setString(4, memberVO.getBirthday());
			ps.setString(5, memberVO.getGender());
			ps.setString(6, memberVO.getEmail());
			ps.setString(7, memberVO.getPhone());

			ps.executeUpdate();
		} finally {
			dbClose(ps, cn);
		}

	}

}