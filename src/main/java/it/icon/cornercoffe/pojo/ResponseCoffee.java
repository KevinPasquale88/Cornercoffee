package it.icon.cornercoffe.pojo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Builder
@AllArgsConstructor
public class ResponseCoffee {

	String coffeeChoose;
	
	QuestionPOJO nextQuestion;
}
