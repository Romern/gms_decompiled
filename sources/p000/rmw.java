package p000;

import java.lang.ref.WeakReference;

/* renamed from: rmw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class rmw extends rno {

    /* renamed from: a */
    private final WeakReference f43320a;

    public rmw(rmx rmx) {
        this.f43320a = new WeakReference(rmx);
    }

    /* renamed from: a */
    public final void mo24857a() {
        rmx rmx = (rmx) this.f43320a.get();
        if (rmx != null) {
            rmx.mo24915l();
        }
    }
}
