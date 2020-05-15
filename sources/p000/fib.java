package p000;

import android.content.Context;
import com.google.android.gms.ads.internal.social.C0592a;
import com.google.android.gms.ads.social.GmsDoritosProvider;

/* renamed from: fib */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class fib implements cayy {

    /* renamed from: a */
    private final cijl f16634a;

    public fib(cijl cijl) {
        this.f16634a = cijl;
    }

    /* renamed from: b */
    public final C0592a mo6445a() {
        return m11735a(((fia) this.f16634a).mo6445a());
    }

    /* renamed from: a */
    public static C0592a m11735a(Context context) {
        GmsDoritosProvider a = GmsDoritosProvider.m6089a(context);
        cazf.m127593a(a, "Cannot return null from a non-@Nullable @Provides method");
        return a;
    }
}
