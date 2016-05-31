package BaseServlet;



import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.fileupload.servlet.ServletFileUpload;

public class BaseServlet extends HttpServlet {
	public final static String redirPath = "redirect:";
	

	/**
	 * 
	 */
	private static final long serialVersionUID = -1301171098203450232L;
	

	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		try {
			
			
			String method = req.getParameter("method");
			Method m = this.getClass().getMethod(method, HttpServletRequest.class,HttpServletResponse.class);
		
			String path = (String)m.invoke(this, req,resp);
			if(path.startsWith(redirPath)) {
				String rp = path.substring(redirPath.length());
				resp.sendRedirect(rp);
			} else {
				req.getRequestDispatcher("/WEB-INF/"+path).forward(req, resp);
			}
		} catch (SecurityException e) {
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		}
	}

	

}
