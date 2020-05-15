package p000;

import android.accounts.Account;

/* renamed from: bapb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bapb implements babp {

    /* renamed from: a */
    private final cayo f101461a;

    /* renamed from: b */
    private final baqf f101462b;

    /* renamed from: c */
    private final cayo f101463c;

    public bapb(cayo cayo, baqf baqf, cayo cayo2) {
        this.f101461a = cayo;
        this.f101462b = baqf;
        this.f101463c = cayo2;
    }

    /* renamed from: a */
    public final void mo32732a(String str, bygz bygz, Account account) {
        try {
            this.f101462b.mo55874a(str, bygz, account);
        } catch (banv e) {
            ((achw) this.f101461a.mo16713a()).mo25418e("Read notify failed", new Object[0]);
            ((acdc) this.f101463c.mo16713a()).mo32707a("MDH sync post local read failure", e);
        }
    }

    /* renamed from: b */
    public final void mo32733b(bygz bygz, Account account) {
    }

    /* renamed from: b */
    public final void mo32734b(String str, bygz bygz, Account account) {
        try {
            this.f101462b.mo55877b(str, bygz, account);
        } catch (banv e) {
            ((achw) this.f101461a.mo16713a()).mo25418e("Write notify failed", new Object[0]);
            ((acdc) this.f101463c.mo16713a()).mo32707a("MDH sync post local write failure", e);
        }
    }
}
