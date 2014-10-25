package gr.erb.tests.ui.bootfaces;

import java.io.Serializable;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.component.UIComponent;

@ManagedBean(name="customerMainView")
@SessionScoped
public class CustomerMainView implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String mainPage;
	private String newClass;
	
	@PostConstruct
	private void init() {
		mainPage = "customersMain.xhtml";
		newClass = "";
	}
	public String getMainPage() {
		return mainPage;
	}
	public void setMainPage(String mainPage) {
		this.mainPage = mainPage;
	}

	public String getNewClass() {
		return newClass;
	}
	public void setNewClass(String newClass) {
		this.newClass = newClass;
	}
	public void menuAction(String action) {
		if ( action.equals("search")) 
			this.mainPage = "searchCustomers.xhtml";
		if ( action.equals("home")) 
			this.mainPage = "customersMain.xhtml";
		
		if ( action.equals("new")) {
			UIComponent comp = UIHelper.findUIComponent("liNew");
			if ( comp != null ) 
				System.out.println(comp);
		}
	}	
	
	
}
