package p000;

import android.content.Context;

/* renamed from: ngy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class ngy {

    /* renamed from: a */
    private final qws f35556a;

    public ngy(Context context) {
        this.f35556a = new qws(context, "BEACON_GCORE", null);
    }

    /* renamed from: a */
    public final synchronized void mo20635a(int i) {
        qwo a = this.f35556a.mo24335a((byte[]) null);
        a.mo24328b(i - 1);
        a.mo24327b();
    }
}
