package p000;

import android.accounts.Account;

/* renamed from: lgu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class lgu {

    /* renamed from: a */
    private final Account f26060a;

    /* renamed from: b */
    private final lij f26061b;

    public lgu(lij lij, Account account) {
        this.f26061b = lij;
        this.f26060a = account;
    }

    /* renamed from: a */
    public final bqgg mo15066a(String str, kcv kcv) {
        return bqdx.m112674a(this.f26061b.mo15162a(str, this.f26060a), new lgt(kcv), bqfb.INSTANCE);
    }

    /* renamed from: a */
    public final void mo15067a(String str, kcv kcv, String str2) {
        bxyk a = bxzt.m124580a(System.currentTimeMillis() + 300000);
        bxvd da = lgs.f26054d.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        lgs lgs = (lgs) da.f164949b;
        str2.getClass();
        lgs.f26056a = str2;
        String str3 = kcv.f23841b;
        str3.getClass();
        lgs.f26057b = str3;
        a.getClass();
        lgs.f26058c = a;
        this.f26061b.mo15163a(str, this.f26060a, (lgs) da.mo74062i());
    }
}
