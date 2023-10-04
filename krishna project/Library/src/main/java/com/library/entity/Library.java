package com.library.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Library {
	@Id
	@SequenceGenerator(
			name="libId_seq",
			initialValue = 00001,
			allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private long bookId ;
	private String bookName;
	private String bookAuthor;
	private String bookCategory;
    private String bookAvailability;
}
