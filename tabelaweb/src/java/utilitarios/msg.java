/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package utilitarios;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;

/**
 *
 * @author Jorliano
 */
public class msg {
    FacesContext context = FacesContext.getCurrentInstance(); 
    
    public void comfirmar(String msg) {  
        context.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO,"Confirmado", msg));  
    }  
  
    public void errograve( String msg) {  
       context.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_WARN,"Erro Grave ", msg));  
    }  
  
    public void erro(String msg) {  
       context.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR,"Erro", msg));  
    }  
  
    public void errofatal(String msg) {  
       context.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_FATAL,"Erro fatal", msg));  
    }  
     
}
