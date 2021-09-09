package Print;

import java.awt.*;
import java.awt.print.*;

public class ObjetoDeImpresion implements Printable {
    public int print(Graphics g, PageFormat f, int pageIndex){
        Font ft = new Font ("Monospaced",Font.PLAIN, 9);  
        String msg="Mesi paske ou itilize pwodwi sa, SOFTMATECH ap kontinye travay pou nou.";
        g.setFont(ft);
                if(pageIndex == 0){
                    g.setFont(ft);
                    g.drawString(msg, 15, 15);
                    return PAGE_EXISTS;
                }else{
                    return NO_SUCH_PAGE;
                }
	}   
}