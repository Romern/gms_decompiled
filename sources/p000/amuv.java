package p000;

import com.android.volley.VolleyError;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/* renamed from: amuv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class amuv extends amux {

    /* renamed from: d */
    private Future f75977d;

    public amuv(amuw amuw, String str) {
        super(amuw, str);
        m63329c();
    }

    /* renamed from: c */
    private final void m63329c() {
        this.f75977d = ancy.f76648a.submit(new amuu(this, this.f75979b));
    }

    /* renamed from: a */
    public final Object mo41360a() {
        mo41362b();
        try {
            Object obj = this.f75977d.get();
            mo41361a(this.f75978a.mo41127a(obj));
            if (!this.f75980c) {
                m63329c();
            }
            return obj;
        } catch (ExecutionException e) {
            Throwable cause = e.getCause();
            if (cause instanceof VolleyError) {
                throw ((VolleyError) cause);
            } else if (cause instanceof gid) {
                throw ((gid) cause);
            } else {
                throw new RuntimeException("Execution failed.", e);
            }
        }
    }
}
