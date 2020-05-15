package p000;

import java.util.ArrayList;
import java.util.List;

/* renamed from: ala */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ala {

    /* renamed from: a */
    public List f812a;

    /* renamed from: b */
    private boolean f813b = false;

    public ala() {
    }

    /* renamed from: a */
    public final alb mo953a() {
        return new alb(this.f812a, this.f813b);
    }

    public ala(alb alb) {
        this.f812a = alb.f815b;
        this.f813b = alb.f816c;
    }

    /* renamed from: a */
    public final void mo954a(ako ako) {
        if (ako != null) {
            List list = this.f812a;
            if (list == null) {
                this.f812a = new ArrayList();
            } else if (list.contains(ako)) {
                throw new IllegalArgumentException("route descriptor already added");
            }
            this.f812a.add(ako);
            return;
        }
        throw new IllegalArgumentException("route must not be null");
    }
}
