package gr.erb.tests.ui.bootfaces;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;

public class UIHelper {
	public static UIComponent findUIComponent(String id) {
		UIComponent foundComponent = findUIComponent(FacesContext.getCurrentInstance().getViewRoot(), id);
		return foundComponent;
	}
	private static UIComponent findUIComponent(UIComponent parent, String id) {
		UIComponent foundComponent = null;

		for(UIComponent component: parent.getChildren()) {
		    if(component.getId().equals(id)){
		        return component;
		    }
		    	foundComponent = findUIComponent  ( component, id );
		    	if ( foundComponent != null ) return foundComponent;
		}
		return foundComponent;
	}
	
	public static void putSessionData(String key, Object value) {
		FacesContext.getCurrentInstance().getExternalContext().getSessionMap().put(key, value);
	}
	public static void removeSessionData(String key) {
		FacesContext.getCurrentInstance().getExternalContext().getSessionMap().remove(key);
	}

	public static Object getSessionData(String key) {
    	return FacesContext.getCurrentInstance().getExternalContext().getSessionMap().get(key);
	}
}
