package p000;

import android.accounts.Account;
import android.os.IBinder;
import android.os.Parcel;

/* renamed from: ajyb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ajyb extends dcj implements ajyd {
    public ajyb(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.nearby.sharing.internal.IAccountResultListener");
    }

    /* renamed from: a */
    public final void mo39083a(Account account) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, account);
        mo8530c(1, bj);
    }
}
