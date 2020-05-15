package p000;

import android.os.Build;

/* renamed from: qa */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class C1289qa {

    /* renamed from: a */
    public final C1290qb f26848a;

    public C1289qa() {
        int i = Build.VERSION.SDK_INT;
        this.f26848a = new C1290qb((byte[]) null);
    }

    /* renamed from: a */
    public final C1296qh mo15717a() {
        return C1296qh.m19996a(this.f26848a.f26849a.build());
    }

    /* renamed from: a */
    public final void mo15718a(C1166ln lnVar) {
        this.f26848a.f26849a.setSystemWindowInsets(lnVar.mo15280a());
    }

    public C1289qa(C1296qh qhVar) {
        int i = Build.VERSION.SDK_INT;
        this.f26848a = new C1290qb(qhVar);
    }
}
