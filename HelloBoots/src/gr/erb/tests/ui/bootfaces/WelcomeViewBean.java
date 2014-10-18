package gr.erb.tests.ui.bootfaces;

import gr.erb.ejb.tests.IMyEntryPoint;

import javax.annotation.Resource;
import javax.faces.bean.ManagedBean;

@ManagedBean(name="welcomeView")
public class WelcomeViewBean {

	@Resource(lookup="java:global/MyEAR/HelloEJB3/MyEntryPoint!gr.erb.ejb.tests.MyEntryPoint")
	private IMyEntryPoint myEntryPoint;
	
	private String firstName;
	
	
	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public void execAjax() {
		this.firstName = myEntryPoint.echo(firstName);
	}
}
