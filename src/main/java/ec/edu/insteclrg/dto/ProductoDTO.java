package ec.edu.insteclrg.dto;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import ec.edu.insteclrg.domain.Category;
import lombok.Data;

@Data
public class ProductoDTO implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private Long id;

	private String name;

	private CategoriaDTO category;
}
