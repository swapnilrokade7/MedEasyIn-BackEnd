package com.app.entities;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "carts")

public class Carts extends BaseEntity{
	@Column(name="created")
	private LocalDate created;
	@Column(name="updated")
	private LocalDate updated;
	@Column(name="totalItems")
	private int totalItems;
	@Column(name="totalPrice")
	private double totalPrice;
	@ElementCollection
	@OneToMany(mappedBy ="cartId")
	private Set<CartItems> cartItems=new HashSet<>();
	
	@OneToOne
	@JoinColumn(name="userId")
	private Users user;
	
	

	public Carts() {
		super();
	}
	
	

	public Carts(LocalDate created, LocalDate updated, int totalItems, double totalPrice, Set<CartItems> cart_items,
			Users user) {
		super();
		this.created = created;
		this.updated = updated;
		this.totalItems = totalItems;
		this.totalPrice = totalPrice;
		this.cartItems = cart_items;
		this.user = user;
	}



	public LocalDate getCreated() {
		return created;
	}

	public void setCreated(LocalDate created) {
		this.created = created;
	}

	public LocalDate getUpdated() {
		return updated;
	}

	public void setUpdated(LocalDate updated) {
		this.updated = updated;
	}

	public int getTotalItems() {
		return totalItems;
	}

	public void setTotalItems(int totalItems) {
		this.totalItems = totalItems;
	}

	public double getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}

	public Users getUser() {
		return user;
	}

	public void setUser(Users user) {
		this.user = user;
	}
	
	public void setCartItems(CartItems cartItem) {
		cartItems.add(cartItem);
	}
	
	public Set<CartItems> getCartItems(){
		return cartItems;
	}
	
	
}