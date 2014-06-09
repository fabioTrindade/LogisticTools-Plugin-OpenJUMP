package br.puc.rio.zona;

import br.puc.rio.telas.TelaZonaAreaAdmissivel;

import com.vividsolutions.jump.workbench.WorkbenchContext;
import com.vividsolutions.jump.workbench.plugin.AbstractPlugIn;
import com.vividsolutions.jump.workbench.plugin.EnableCheckFactory;
import com.vividsolutions.jump.workbench.plugin.MultiEnableCheck;
import com.vividsolutions.jump.workbench.plugin.PlugInContext;

public class PlugInAreaAdmissivelZona extends AbstractPlugIn {

	private PlugInContext context;
	private TelaZonaAreaAdmissivel telaZonaAreaAdmissivel;
	

	/*
	Esse m�todo � nativo da classe AbstractPlugin e define que para carregar esse plugin � necess�rio ter ao menos um camada (Layer) carregada no OpenJUMP.
*/		
	public static MultiEnableCheck createEnableCheck(
			WorkbenchContext workbenchContext) {
		EnableCheckFactory checkFactory = new EnableCheckFactory(
				workbenchContext);

		return new MultiEnableCheck().add(
				checkFactory.createAtLeastNLayersMustExistCheck(0)).add(
				checkFactory.createTaskWindowMustBeActiveCheck());
	}

	/*
	Esse m�todo � nativo da classe AbstractPlugin. 
	Ele � acionado automaticamente toda vez que o PlugIn � instanciado.
	 Nesse caso o m�todo cria a Tela para entrada de dados do procedimento de forma��o de subzonas.
*/	
public boolean execute(PlugInContext context) throws Exception {
		this.context = context;

		this.telaZonaAreaAdmissivel = new TelaZonaAreaAdmissivel(this);
		telaZonaAreaAdmissivel.setVisible(true);

		return true;
	}

	public PlugInContext getPlugInContext() {
		return this.context;
	}

}
