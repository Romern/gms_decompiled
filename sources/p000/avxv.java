package p000;

import android.util.SparseArray;

/* renamed from: avxv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class avxv {

    /* renamed from: a */
    public final Object f94086a = new Object();

    /* renamed from: b */
    public avyc f94087b;

    /* renamed from: a */
    public abstract SparseArray mo51710a(avxy avxy);

    /* renamed from: a */
    public void mo51711a() {
        synchronized (this.f94086a) {
            avyc avyc = this.f94087b;
            if (avyc != null) {
                avyc.mo51716a();
                this.f94087b = null;
            }
        }
    }

    /* renamed from: b */
    public boolean mo51712b() {
        throw null;
    }
}
