package sp.arc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Writer {
@Autowired
    private  Pen pen;
@Autowired
    private Pencil pencil;

    public Pen getPen() {
        return pen;
    }

    public void setPen(Pen pen) {
        this.pen = pen;
    }

    public Pencil getPencil() {
        return pencil;
    }

    public void setPencil(Pencil pencil) {
        this.pencil = pencil;
    }
    public void create() {
        pen.write();
        pencil.sketch();
    }
}
