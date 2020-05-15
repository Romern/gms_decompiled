package p000;

import android.accounts.Account;

/* renamed from: baqm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class baqm implements cayy {

    /* renamed from: a */
    private final baql f101561a;

    public baqm(baql baql) {
        this.f101561a = baql;
    }

    /* renamed from: a */
    public static baqm m87401a(baql baql) {
        return new baqm(baql);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo6445a() {
        Account account = this.f101561a.f101559a;
        cazf.m127593a(account, "Cannot return null from a non-@Nullable @Provides method");
        return account;
    }
}
