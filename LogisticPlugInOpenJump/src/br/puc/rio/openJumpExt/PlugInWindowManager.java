package br.puc.rio.openJumpExt;

import br.puc.rio.clarkWright.ClarkWrightPlugIn;
import br.puc.rio.kruskal.ClusterPlugIn;
import br.puc.rio.opt2.Opt2PlugIn;
import br.puc.rio.pontoCentral.PontoCentralPlugIn;
import br.puc.rio.utilities.PlugInUploadFile;
import br.puc.rio.zona.PlugInAreaAdmissivelZona;
import br.puc.rio.zona.PlugInNivelServicoZona;
import br.puc.rio.zona.PlugInZona;

import com.vividsolutions.jump.workbench.plugin.AbstractPlugIn;
import com.vividsolutions.jump.workbench.plugin.PlugInContext;
import com.vividsolutions.jump.workbench.ui.plugin.FeatureInstaller;


/**
 * @author Developer
 * F�bio Trindade Duque Estrada Regis / duqueregis@gmail.com / PUC-RIO
 *
 */
public class PlugInWindowManager extends AbstractPlugIn {

	private PlugInContext context;
	private PlugInZona plugInZona = new PlugInZona();
	private PontoCentralPlugIn pontoCentralPlugIn = new PontoCentralPlugIn();
	private ClarkWrightPlugIn clarkWrightPlugIn = new ClarkWrightPlugIn();
	private ClusterPlugIn clusterPlugIn = new ClusterPlugIn();
	private PlugInUploadFile plugInUploadFile = new PlugInUploadFile();
	private PlugInNivelServicoZona plugInNivelServicoZona = new PlugInNivelServicoZona();
	private PlugInAreaAdmissivelZona plugInAreaAdmissivelZona = new PlugInAreaAdmissivelZona();
	private Opt2PlugIn opt2PlugIn = new Opt2PlugIn();
	/*
	Essa classe cont�m os itens de menu (cada item � uma funcionalidade) que ser�o carregados quando o OpenJump iniciar e ir� acionar a execu��o da funcionalidade que o usu�rio escolher.
		*/	
	@SuppressWarnings("deprecation")
	public void initialize(PlugInContext context) throws Exception {
		
		
		FeatureInstaller featureInstaller = new FeatureInstaller(
				context.getWorkbenchContext());

		featureInstaller.addMainMenuItem(plugInUploadFile, // exe
				new String[] { "LogPlugIn","Criar Layer" }, // menu path
				"Layer de Pontos", // aqui vai o titulo do subitem do menu
				false, // checkbox
				null, // icon
				null); 

		featureInstaller.addMainMenuItem(clusterPlugIn, // exe
				new String[] { "LogPlugIn" }, // menu path
				"Forma��o de Clusters", // aqui vai o titulo do subitem do menu
				false, // checkbox
				null, // icon
				clusterPlugIn.getEnableCheck()); // enable
																	// check

		featureInstaller.addMainMenuItem(clarkWrightPlugIn, // exe
				new String[] { "LogPlugIn","Roteiriza��o" }, // menu path
				"Clark and Wright", // aqui vai o titulo do subitem do menu
				false, // checkbox
				null, // icon
				clarkWrightPlugIn.getEnableCheck()); // enable
																	// check
		featureInstaller.addMainMenuItem(opt2PlugIn, // exe
				new String[] { "LogPlugIn","Roteiriza��o" }, // menu path
				"2-opt", // aqui vai o titulo do subitem do menu
				false, // checkbox
				null, // icon
				opt2PlugIn.getEnableCheck()); // enable
																	// check

		featureInstaller.addMainMenuItem(pontoCentralPlugIn, // exe
				new String[] { "LogPlugIn" }, // menu path
				"Ponto Central", // aqui vai o titulo do subitem do menu
				false, // checkbox
				null, // icon
				pontoCentralPlugIn.getEnableCheck()); // enable
																	// check

		featureInstaller.addMainMenuItem(plugInNivelServicoZona, // exe
				new String[] { "LogPlugIn","Zonas" }, // menu path
				"C�lculo de N�vel de Servi�o", // aqui vai o titulo do subitem do menu
				false, // checkbox
				null, // icon
				plugInNivelServicoZona.getEnableCheck()); // enable
																	// check
		featureInstaller.addMainMenuItem(plugInAreaAdmissivelZona, // exe
				new String[] { "LogPlugIn","Zonas" }, // menu path
				"C�lculo de �rea Admiss�vel", // aqui vai o titulo do subitem do menu
				false, // checkbox
				null, // icon
				plugInAreaAdmissivelZona.getEnableCheck()); // enable
																	// check
		featureInstaller.addMainMenuItem(plugInZona, // exe
				new String[] { "LogPlugIn","Zonas" }, // menu path
				"Forma��o de Zonas", // aqui vai o titulo do subitem do menu
				false, // checkbox
				null, // icon
				plugInZona.getEnableCheck()); // enable
																// check
		
		
																// check
	}
	public PlugInContext getPlugInContext() {
		return this.context;
	}
}
