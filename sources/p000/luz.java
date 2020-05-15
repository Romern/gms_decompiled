package p000;

import android.accounts.Account;
import android.content.Context;

/* renamed from: luz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class luz extends mor implements aaai {

    /* renamed from: a */
    private final aaag f33017a;

    /* renamed from: b */
    private final Context f33018b;

    public luz(Context context, aaag aaag) {
        bmxy.m108581a(aaag);
        this.f33017a = aaag;
        bmxy.m108581a(context);
        this.f33018b = context;
    }

    /* renamed from: a */
    public final void mo19621a(mop mop) {
        this.f33017a.mo16658a(new luy(new lsp(this.f33018b), lzu.m24733a(this.f33018b), mop, null));
    }

    /* renamed from: a */
    public final void mo19622a(mop mop, Account account) {
        this.f33017a.mo16658a(new luy(new lsp(this.f33018b), lzu.m24733a(this.f33018b), mop, account));
    }

    /* renamed from: a */
    public final void mo19623a(rnt rnt, long j, String str) {
        this.f33017a.mo16658a(new lve(new lvp(this.f33018b), rnt, j, str));
    }
}
