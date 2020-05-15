package p000;

import android.accounts.Account;

/* renamed from: bdwn */
public final /* synthetic */ class bdwn implements bmzi {

    /* renamed from: a */
    private final bdwt f106539a;

    /* renamed from: b */
    private final bdqu f106540b;

    /* renamed from: c */
    private final Account f106541c;

    public bdwn(bdwt bdwt, bdqu bdqu, Account account) {
        this.f106539a = bdwt;
        this.f106540b = bdqu;
        this.f106541c = account;
    }

    /* renamed from: a */
    public final Object mo6606a() {
        bdwt bdwt = this.f106539a;
        bdqu bdqu = this.f106540b;
        Account account = this.f106541c;
        if (cfgv.m139557b()) {
            return bdwt.f106552d.mo58399a(bdqu, account, cfgv.m139558c());
        }
        return bdwt.f106552d.mo58398a(bdqu, account);
    }
}
