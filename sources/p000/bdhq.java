package p000;

import java.util.concurrent.Executors;

/* renamed from: bdhq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bdhq implements cayy {

    /* renamed from: a */
    private final cijl f105669a;

    public bdhq(cijl cijl) {
        this.f105669a = cijl;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo6445a() {
        bdic bdic = (bdic) this.f105669a.mo6445a();
        Object b = bdic.mo57983b() != null ? bdic.mo57983b() : bdic.mo57982a() != null ? bdic.mo57982a() : Executors.newSingleThreadExecutor(new bdho("Primes-init", bdic.mo57984c()));
        cazf.m127593a(b, "Cannot return null from a non-@Nullable @Provides method");
        return b;
    }
}
