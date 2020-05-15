package p000;

import android.accounts.Account;
import android.content.Context;

/* renamed from: axie */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class axie extends axlx {

    /* renamed from: a */
    private static final Object f95980a = new Object();

    /* renamed from: g */
    private final String f95981g;

    public axie(Context context, int i, Account account, String str, axls axls, axls axls2) {
        super(context, i, account, axls, axls2);
        this.f95981g = str;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo53158a() {
        bxvd da = bzwf.f171613c.mo74144da();
        String str = this.f95981g;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bzwf bzwf = (bzwf) da.f164949b;
        str.getClass();
        bzwf.f171615a |= 1;
        bzwf.f171616b = str;
        bzwg bzwg = (bzwg) axmo.m82727a("b/cloudpin/verify", this.f96167c, (bzwf) da.mo74062i(), bzwg.f171617c, this.f96170f).get();
        if ((bzwg.f171619a & 1) != 0) {
            bzvu bzvu = bzwg.f171620b;
            if (bzvu == null) {
                bzvu = bzvu.f171552g;
            }
            mo53235a(bzvu);
            return;
        }
        mo53236a(f95980a);
    }
}
