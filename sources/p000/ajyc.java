package p000;

import android.accounts.Account;
import android.os.Parcel;

/* renamed from: ajyc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ajyc extends dck implements ajyd {

    /* renamed from: a */
    final /* synthetic */ aucf f71518a;

    public ajyc() {
        super("com.google.android.gms.nearby.sharing.internal.IAccountResultListener");
    }

    /* renamed from: a */
    public final void mo39083a(Account account) {
        this.f71518a.mo50391a(account);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ajyc(aucf aucf) {
        super("com.google.android.gms.nearby.sharing.internal.IAccountResultListener");
        this.f71518a = aucf;
    }

    /* renamed from: a */
    public final boolean mo3209a(int i, Parcel parcel, Parcel parcel2) {
        if (i != 1) {
            return false;
        }
        mo39083a((Account) dcl.m8163a(parcel, Account.CREATOR));
        return true;
    }
}
