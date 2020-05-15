package p000;

import java.util.ArrayList;
import java.util.List;

/* renamed from: cpt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cpt {

    /* renamed from: a */
    private final List f11787a = new ArrayList();

    /* renamed from: a */
    public final synchronized cdn mo8093a(Class cls) {
        cdn cdn;
        int size = this.f11787a.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                cdn = null;
                break;
            }
            cps cps = (cps) this.f11787a.get(i);
            if (cps.f11785a.isAssignableFrom(cls)) {
                cdn = cps.f11786b;
                break;
            }
            i++;
        }
        return cdn;
    }

    /* renamed from: a */
    public final synchronized void mo8094a(Class cls, cdn cdn) {
        this.f11787a.add(new cps(cls, cdn));
    }
}
