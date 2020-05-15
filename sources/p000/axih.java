package p000;

import android.accounts.Account;
import android.content.Context;

/* renamed from: axih */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class axih extends axlx {
    public axih(Context context, int i, Account account, axls axls, axls axls2) {
        super(context, i, account, axls, axls2);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo53158a() {
        bxvd da = bzwh.f171621c.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bzwh bzwh = (bzwh) da.f164949b;
        bzwh.f171623a |= 2;
        bzwh.f171624b = true;
        bzwi bzwi = (bzwi) axmo.m82727a("b/preferences/fetchSettings", this.f96167c, (bzwh) da.mo74062i(), bzwi.f171625d, this.f96170f).get();
        if ((bzwi.f171627a & 2) != 0) {
            bzvu bzvu = bzwi.f171629c;
            if (bzvu == null) {
                bzvu = bzvu.f171552g;
            }
            mo53235a(bzvu);
        }
        bzwl bzwl = bzwi.f171628b;
        if (bzwl == null) {
            bzwl = bzwl.f171643c;
        }
        mo53236a(bzwl);
    }
}
