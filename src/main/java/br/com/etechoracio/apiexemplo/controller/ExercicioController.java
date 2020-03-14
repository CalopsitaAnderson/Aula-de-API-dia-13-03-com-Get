package br.com.etechoracio.apiexemplo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;



@RequestMapping("/exercicicio")
@RestController
public class ExercicioController {
	
	@GetMapping("/dobro")
	
	public double dobros (@RequestParam("num1") int num1  ) {
		return num1 * num1;
		
	}
	
	@GetMapping("potencia")
	public double potenciacao(@RequestParam("num1") int num1, @RequestParam("num2")int num2) {
		return Math.pow( num1 , num2);
	}
	
	@GetMapping("quadrado")
	public double raizQuadrada(@RequestParam("num") int num) {
		return Math.sqrt(num)  ;
		
	}
	
	

}
