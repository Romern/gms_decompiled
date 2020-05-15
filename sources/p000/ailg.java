package p000;

import java.util.Set;

/* renamed from: ailg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ailg {

    /* renamed from: a */
    private final Set f69112a = new C1225nr();

    /* renamed from: b */
    private final Set f69113b = new C1225nr();

    /* renamed from: a */
    public final synchronized Set mo37633a() {
        C1225nr nrVar;
        this.f69113b.removeAll(this.f69112a);
        nrVar = new C1225nr();
        nrVar.addAll(this.f69113b);
        this.f69113b.clear();
        this.f69113b.addAll(this.f69112a);
        this.f69112a.clear();
        return nrVar;
    }

    /* renamed from: a */
    public final synchronized void mo37634a(Object obj) {
        this.f69112a.add(obj);
    }
}
