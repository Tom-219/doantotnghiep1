package com.appfood.hung.entity;

import javax.persistence.*;

@Entity
public class Product {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String name;
	private String description;
	private int price;

	@Lob
	@Column(columnDefinition = "MEDIUMBLOB")
	private String image;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}


	public Category getCategory() {
		return category;
	}
	public void setCategory(Category category) {
		this.category = category;
	}

	@ManyToOne
	@JoinColumn(name = "category_id")
	private Category category;


	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", description="
				+ description + ", price=" + price + ", image="
				+ image + "]";
	}



}
