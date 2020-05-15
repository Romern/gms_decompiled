package p000;

/* renamed from: vau */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class vau {

    /* renamed from: a */
    final /* synthetic */ String f48879a;

    /* renamed from: b */
    final /* synthetic */ vav f48880b;

    public vau(vav vav, String str) {
        this.f48880b = vav;
        this.f48879a = str;
    }

    /* renamed from: a */
    public final void mo28180a(boolean z) {
        boolean z2 = false;
        if (!z) {
            var a = this.f48880b.mo28181a(this.f48879a);
            synchronized (a) {
                if (a.f48861a.remove(this)) {
                    z2 = a.mo28178d();
                }
            }
            if (z2) {
                a.mo28176b();
                return;
            }
            return;
        }
        var a2 = this.f48880b.mo28181a(this.f48879a);
        synchronized (a2) {
            if (a2.f48861a.add(this)) {
                z2 = a2.mo28178d();
            }
        }
        if (z2) {
            a2.mo28176b();
        }
    }
}
