package p000;

import android.accounts.Account;
import android.os.IBinder;
import android.os.Parcel;

/* renamed from: gja */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class gja extends dcj implements gjc {
    public gja(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.auth.account.IWorkAccountService");
    }

    /* renamed from: a */
    public final void mo11928a(giz giz, Account account) {
        throw null;
    }

    /* renamed from: a */
    public final void mo11929a(giz giz, String str) {
        throw null;
    }

    /* renamed from: a */
    public final void mo11931a(boolean z) {
        throw null;
    }

    /* renamed from: a */
    public final boolean mo11932a() {
        throw null;
    }

    /* renamed from: a */
    public final boolean mo11933a(String str, String str2) {
        throw null;
    }

    /* renamed from: c */
    public final void mo11934c() {
        mo8528b(6, mo8529bj());
    }

    /* renamed from: a */
    public final void mo11930a(String str, grh grh) {
        Parcel bj = mo8529bj();
        bj.writeString(str);
        dcl.m8164a(bj, grh);
        mo8530c(7, bj);
    }
}
