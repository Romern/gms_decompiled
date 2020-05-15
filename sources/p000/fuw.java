package p000;

import com.google.android.gms.common.internal.ClientContext;
import java.util.ArrayList;
import java.util.List;

/* renamed from: fuw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class fuw {

    /* renamed from: a */
    public final fux f17313a;

    /* renamed from: b */
    public final ClientContext f17314b;

    /* renamed from: c */
    public final List f17315c = new ArrayList();

    /* renamed from: d */
    public List f17316d;

    public fuw(fux fux, ClientContext clientContext) {
        this.f17313a = fux;
        this.f17314b = clientContext;
    }

    /* renamed from: a */
    public final boolean mo11374a() {
        int b = mo11375b();
        return b >= 0 && (((blcb) this.f17316d.get(b)).f125900a & 2) != 0;
    }

    /* renamed from: b */
    public final int mo11375b() {
        if (this.f17316d != null) {
            for (int i = 0; i < this.f17316d.size(); i++) {
                blca blca = ((blcb) this.f17316d.get(i)).f125901b;
                if (blca == null) {
                    blca = blca.f125893b;
                }
                if (blca.f125895a == 0) {
                    return i;
                }
            }
        }
        return -1;
    }
}
