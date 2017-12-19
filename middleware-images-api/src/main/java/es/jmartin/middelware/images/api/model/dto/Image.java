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
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;


@Entity
@Table(name="images", schema = "cursoangular")
// Define named queries here
@NamedQueries ( {
  @NamedQuery ( name="Image.countAll", query="SELECT COUNT(x) FROM Image x" )
} )
public class Image implements Serializable {

	
    /**
	 * 
	 */
	private static final long serialVersionUID = 6606473847732478544L;

	//----------------------------------------------------------------------
    // ENTITY PRIMARY KEY ( BASED ON A SINGLE FIELD )
    //----------------------------------------------------------------------
    @Id
    //Con identity hibernate es capaz de crear un sequence para generar los id´s
    //necesita spring.jpa.hibernate.ddl-auto=update
    //en el aplication properties
    //lo normal sería auto
//    @GeneratedValue(strategy=GenerationType.SEQUENCE)
    @SequenceGenerator(name = "my_entity_gen", sequenceName = "cursoangular.seq_images", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "my_entity_gen")
    @Column(name="id")
    private Integer id;
    
    //----------------------------------------------------------------------
    // ENTITY DATA FIELDS 
    //----------------------------------------------------------------------    
    @Column(name="title", nullable=false, length=250)
    private String title;
    
	@Column(name="description", nullable=false, length=1250)
    private String description;

	@Column(name="thumbnail", nullable=false, length=250)
    private String thumbnail;
	
	@Column(name="imagelink", nullable=false, length=250)
    private String imageLink;
	
	@Column(name="user_id")
    private Integer userId;
	
	@Column(name="created_at")
    private Date createdTime;
	
	@Column(name="updated_at")
    private Date updatedTime;

	
    //----------------------------------------------------------------------
    // CONSTRUCTOR(S)
    //----------------------------------------------------------------------
	public Image() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Image(Integer id, String title, String description, String thumbnail, String imageLink, Integer userId,
			Date createdTime, Date updatedTime) {
		super();
		this.id = id;
		this.title = title;
		this.description = description;
		this.thumbnail = thumbnail;
		this.imageLink = imageLink;
		this.userId = userId;
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
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getThumbnail() {
		return thumbnail;
	}

	public void setThumbnail(String thumbnail) {
		this.thumbnail = thumbnail;
	}

	public String getImageLink() {
		return imageLink;
	}

	public void setImageLink(String imageLink) {
		this.imageLink = imageLink;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
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