package entities;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Builder

public class Insurance {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(nullable = false, updatable = false, unique = true)
	private long id;

	@Column(name = "type", nullable = false)
	private String type;
	
	@Column(name = "risk", nullable = false)
	private int risk;
	
	@Column(name = "analysis", nullable = false)
	private String analysis;
	
	@Column(name = "observation", nullable = true)
	private String observation;
	
	@Column(name = "created_at", nullable = false)
	private Data criatedAt;
	
	@Column(name = "validated_at", nullable = false)
	private Data validatedAt;
	
	@ManyToOne
	@JoinColumn (name="client_id", nullable = false)
	@JsonBackReference
	private Client client;

}
