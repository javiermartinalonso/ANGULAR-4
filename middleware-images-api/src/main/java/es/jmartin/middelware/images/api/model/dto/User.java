package es.jmartin.middelware.images.api.model.dto;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;


@Entity
@Table(name="users", schema = "cursoangular")
// Define named queries here
@NamedQueries ( {
  @NamedQuery ( name="User.countAll", query="SELECT COUNT(x) FROM User x" )
} )
public class User implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -9070391088942930489L;

	//----------------------------------------------------------------------
    // ENTITY PRIMARY KEY ( BASED ON A SINGLE FIELD )
    //----------------------------------------------------------------------
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name="id", nullable=false)
    private Integer id;
    
    //----------------------------------------------------------------------
    // ENTITY DATA FIELDS 
    //----------------------------------------------------------------------    
    @Column(name="name", nullable=false, length=250)
    private String name;
    
	@Column(name="email", nullable=false, length=250)
    private String email;

	@Column(name="password", nullable=false, length=250)
    private String password;
	
	@Column(name="remember_token", nullable=false, length=250)
    private String remember_token;
		
	@Column(name="created_at")
    private Date createdTime;
	
	@Column(name="updated_at")
    private Date updatedTime;

	
    //----------------------------------------------------------------------
    // CONSTRUCTOR(S)
    //----------------------------------------------------------------------
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public User(Integer id, String name, String email, String password, String remember_token, Date createdTime,
			Date updatedTime) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.password = password;
		this.remember_token = remember_token;
		this.createdTime = createdTime;
		this.updatedTime = updatedTime;
	}


	//----------------------------------------------------------------------
    // GETTER & SETTER FOR THE KEY FIELD
    //----------------------------------------------------------------------
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

    //----------------------------------------------------------------------
    // GETTERS & SETTERS FOR FIELDS
    //----------------------------------------------------------------------
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

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getRemember_token() {
		return remember_token;
	}

	public void setRemember_token(String remember_token) {
		this.remember_token = remember_token;
	}

	public Date getCreatedTime() {
		return createdTime;
	}

	public void setCreatedTime(Date createdTime) {
		this.createdTime = createdTime;
	}

	public Date getUpdatedTime() {
		return updatedTime;
	}

	public void setUpdatedTime(Date updatedTime) {
		this.updatedTime = updatedTime;
	}

}