package ch.qual.base.app.realm;

import java.beans.PropertyChangeListener;
import java.io.IOException;
import java.security.Principal;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;

import javax.enterprise.inject.Default;

import org.apache.catalina.Container;
import org.apache.catalina.Context;
import org.apache.catalina.Realm;
import org.apache.catalina.Wrapper;
import org.apache.catalina.connector.Request;
import org.apache.catalina.connector.Response;
import org.apache.catalina.deploy.SecurityConstraint;
import org.apache.catalina.realm.GenericPrincipal;
import org.ietf.jgss.GSSContext;

@Default
public class MySimpleCDIRealm implements Realm{
	private static final String REALM_INFO = MySimpleCDIRealm.class.getName() + "/1.0";

	@Override
	public Container getContainer() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setContainer(Container container) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getInfo() {
		return REALM_INFO;
	}

	@Override
	public void addPropertyChangeListener(PropertyChangeListener listener) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Principal authenticate(String username, String credentials) {
		if ("admin".equalsIgnoreCase(username)) {
			List<String> roles = new ArrayList<String>();
			roles.add("Administrator");
			return (new GenericPrincipal(username, credentials,roles));
		}
		return null;
	}

	@Override
	public Principal authenticate(String username, String digest, String nonce,
			String nc, String cnonce, String qop, String realm, String md5a2) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Principal authenticate(GSSContext gssContext, boolean storeCreds) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Principal authenticate(X509Certificate[] certs) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void backgroundProcess() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public SecurityConstraint[] findSecurityConstraints(Request request,
			Context context) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean hasResourcePermission(Request request, Response response,
			SecurityConstraint[] constraint, Context context)
			throws IOException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean hasRole(Wrapper wrapper, Principal principal, String role) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean hasUserDataPermission(Request request, Response response,
			SecurityConstraint[] constraint) throws IOException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void removePropertyChangeListener(PropertyChangeListener listener) {
		// TODO Auto-generated method stub
		
	}

}
