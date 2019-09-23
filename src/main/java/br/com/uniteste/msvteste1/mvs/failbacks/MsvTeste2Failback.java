package br.com.uniteste.msvteste1.mvs.failbacks;

import br.com.uniteste.msvteste1.mvs.MsvTeste2FeignConfig;

public class MsvTeste2Failback implements MsvTeste2FeignConfig {

	@Override
	public String dizOlla() {
		return "Serviço fora do ar, ou qualquer outra coisa";
	}

}
