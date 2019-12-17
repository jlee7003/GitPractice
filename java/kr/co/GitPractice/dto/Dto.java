package kr.co.GitPractice.dto;

public class Dto 
{
    private String id;
    private String name;
    private String age;
    private String phone;
    private String writeday;
    
    // 생성자(한꺼번에)
    public Dto() {} // 비어있는 생성자

	public Dto(String id, String name, String age, String phone, String writeday) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.phone = phone;
		this.writeday = writeday;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getWriteday() {
		return writeday;
	}

	public void setWriteday(String writeday) {
		this.writeday = writeday;
	}
    
    // 필드단위의 입출력 => getter, setter
	
}
