package p000;

import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.Set;

/* renamed from: bamz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
abstract class bamz implements bana {

    /* renamed from: a */
    protected volatile boolean f101328a;

    /* renamed from: b */
    final Set f101329b = Collections.newSetFromMap(new IdentityHashMap());

    /* renamed from: c */
    final Set f101330c = Collections.newSetFromMap(new IdentityHashMap());

    /* renamed from: d */
    final Set f101331d = Collections.newSetFromMap(new IdentityHashMap());

    /* renamed from: e */
    final Set f101332e = Collections.newSetFromMap(new IdentityHashMap());

    /* renamed from: f */
    final /* synthetic */ bane f101333f;

    public bamz(bane bane) {
        this.f101333f = bane;
    }

    /* renamed from: a */
    public final bane mo55791a() {
        return this.f101333f;
    }

    /* renamed from: a */
    public final void mo55792a(bamf bamf) {
        bmxy.m108601b(!this.f101328a, "Transaction is closed");
        synchronized (this.f101330c) {
            this.f101330c.add(bamf);
        }
    }

    /* renamed from: a */
    public final void mo55793a(banw banw) {
        bmxy.m108601b(!this.f101328a, "Transaction is closed");
        synchronized (this.f101331d) {
            this.f101331d.add(banw);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo55794a(Set set) {
        synchronized (set) {
            Iterator it = set.iterator();
            while (it.hasNext()) {
                try {
                    ((banw) it.next()).mo55679a();
                } catch (RuntimeException e) {
                    ((achw) this.f101333f.f101342b.mo16713a()).mo25418e("Close listeners failed", new Object[0]);
                    ((acdc) this.f101333f.f101345e.mo16713a()).mo32707a("MDH LevelDb close listeners failed", e);
                }
            }
        }
    }
}
