package br.com.uniteste.msvteste1.mvs;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import br.com.uniteste.msvteste1.mvs.failbacks.MsvTeste2Failback;

@FeignClient(value = "msv-teste2", fallback = MsvTeste2Failback.class)
public interface MsvTeste2FeignConfig {

	@GetMapping("/api")
	String dizOlla();
}
