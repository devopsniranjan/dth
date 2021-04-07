package hdfc;

import org.zkoss.zk.ui.WebApp;
import org.zkoss.zk.ui.util.WebAppInit;
import org.zkoss.zul.theme.Themes;

public class abcThemeWebAppInit implements WebAppInit {

	private final static String DEF_NAME = "def";
	private final static String DEF_DISPLAY = "Def";
	private final static int DEF_PRIORITY = 1000;

	public void init(WebApp wapp) throws Exception {
		Themes.register(DEF_NAME, DEF_DISPLAY, DEF_PRIORITY);
	}

}
