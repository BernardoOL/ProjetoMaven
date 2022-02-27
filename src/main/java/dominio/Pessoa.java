package dominio;

import java.io.Serializable;

public class Pessoa implements Serializable	{
	private static final long serialVersionUID = 1L;
	
	private Integer id;
	private String name;
	private String email;
	
	public Pessoa() {
	}

	public Pessoa(Integer id, String name, String email) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
	}

	public Integer getIdInteger() {
		return id;
	}

	public void setIdInteger(Integer idInteger) {
		this.id = idInteger;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "Pessoa [idInteger=" + id + ", name=" + name + ", email=" + email + "]";
	}
	
}
