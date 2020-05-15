package p000;

import android.accounts.Account;
import android.content.Context;

/* renamed from: axid */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class axid extends axlx {
    public axid(Context context, int i, Account account, axls axls, axls axls2) {
        super(context, i, account, axls, axls2);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo53158a() {
        bzwe bzwe = ((bzwd) axmo.m82727a("b/cloudpin/getPinSettings", this.f96167c, bzwc.f171602a, bzwd.f171604b, this.f96170f).get()).f171606a;
        if (bzwe == null) {
            bzwe = bzwe.f171608c;
        }
        mo53236a(bzwe);
    }
}
