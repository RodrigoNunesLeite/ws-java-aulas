package entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import entities.enums.OrderStatus;

public class Order {
	private Date moment;
	private OrderStatus status;
	
	private List<OrderItem> listOrder = new ArrayList<>();
	
	public Order() {
		
	}
	
	public Order(Date moment, OrderStatus status) {
		this.moment = moment;
		this.status = status;
	}
	
	
	
	public Date getMoment() {
		return moment;
	}

	public void setMoment(Date moment) {
		this.moment = moment;
	}

	public OrderStatus getStatus() {
		return status;
	}

	public void setStatus(OrderStatus status) {
		this.status = status;
	}

	public void addItem(OrderItem item) {
		listOrder.add(item);
	}
	
	public void removeItem(OrderItem item) {
		listOrder.remove(item);
	}
	
	public Double total() {
		Double sumTotal = 0.0;
		
		for(OrderItem items: listOrder) {
			sumTotal += items.subTotal();
		}
		
		return sumTotal;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		
		for(OrderItem items: listOrder) {
			sb.append(items.getProduct().getName());
			sb.append(", $ " + String.format("%.2f",items.getProduct().getPrice()));
			sb.append(", Quantity: " + items.getQuantity());
			sb.append(", Subtotal: $" + String.format("%.2f",items.subTotal()));
			sb.append("\n");
		}
		sb.append("Total price: $ " + String.format("%.2f",total()));
		
		return sb.toString();
	}
	
}
