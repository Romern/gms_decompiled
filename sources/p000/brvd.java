package p000;

import android.content.Context;

/* renamed from: brvd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class brvd implements cayy {

    /* renamed from: a */
    private final cijl f143440a;

    public brvd(cijl cijl) {
        this.f143440a = cijl;
    }

    /* renamed from: a */
    public static brvd m114740a(cijl cijl) {
        return new brvd(cijl);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo6445a() {
        aytf.m84780b();
        brvj brvj = new brvj(((Context) this.f143440a.mo6445a()).getApplicationContext());
        cazf.m127593a(brvj, "Cannot return null from a non-@Nullable @Provides method");
        return brvj;
    }
}
