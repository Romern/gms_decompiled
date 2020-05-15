package p000;

import android.accounts.AccountManager;

/* renamed from: bbdq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bbdq implements cayy {

    /* renamed from: a */
    private final cijl f102424a;

    public bbdq(cijl cijl) {
        this.f102424a = cijl;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo6445a() {
        bmxv b = bmxv.m108566b(AccountManager.get(((bbdg) this.f102424a).mo6445a()));
        cazf.m127593a(b, "Cannot return null from a non-@Nullable @Provides method");
        return b;
    }
}
