package p000;

import android.accounts.Account;
import android.content.Context;

/* renamed from: axii */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class axii extends axlx {

    /* renamed from: a */
    private final bzwm f95990a;

    public axii(Context context, int i, Account account, boolean z, axls axls, axls axls2) {
        super(context, i, account, axls, axls2);
        bxvd da = bzwm.f171648d.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bzwm bzwm = (bzwm) da.f164949b;
        int i2 = bzwm.f171650a | 1;
        bzwm.f171650a = i2;
        bzwm.f171651b = 101;
        bzwm.f171650a = i2 | 2;
        bzwm.f171652c = z;
        this.f95990a = (bzwm) da.mo74062i();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo53158a() {
        bzwn bzwn = (bzwn) axmo.m82727a("b/preferences/updateSetting", this.f96167c, this.f95990a, bzwn.f171653d, this.f96170f).get();
        if ((bzwn.f171655a & 2) != 0) {
            bzvu bzvu = bzwn.f171657c;
            if (bzvu == null) {
                bzvu = bzvu.f171552g;
            }
            mo53235a(bzvu);
        }
        bzwl bzwl = bzwn.f171656b;
        if (bzwl == null) {
            bzwl = bzwl.f171643c;
        }
        mo53236a(bzwl);
    }
}
