package site.metacoding.demo.yellow.domain;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Entity
public class Product {
	@Id
	private Integer id;
	private String name;
	private Integer price;
	private Integer qty;
}
