package bean;

public class Userinfo {

	private	String userid;			//ユーザーID
	private	String email;			//メールアドレス
	private	String password;		//パスワード
	private String nickname;		//ニックネーム
	private String address;			//住所
	private String name;			//本名
	private String hasExhibit;		//出品フラグ（1：出品あり、0：出品なし）
	private	String authority;		//権限フラグ（1：一般ユーザー、0：管理者）

	public Userinfo() {
		this.userid = null;
		this.email = null;
		this.password = null;
		this.nickname = null;
		this.address = null;
		this.name = null;
		this.hasExhibit = "0";
		this.authority = "1";
	}

	public String getUserid() {
		return userid;
	}

	public String getEmail() {
		return email;
	}

	public String getPassword() {
		return password;
	}

	public String getNickname() {
		return nickname;
	}

	public String getAddress() {
		return address;
	}

	public String getName() {
		return name;
	}

	public String getExhibit() {
		return hasExhibit;
	}

	public String getAuthority() {
		return authority;
	}


	public void setUserid(String userid) {
		this.userid = userid;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setExhibit(String hasExhibit) {
		this.hasExhibit = hasExhibit;
	}

	public void setAuthority(String authority) {
		this.authority = authority;
	}
}
