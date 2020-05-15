package p000;

import android.accounts.Account;
import android.os.Parcel;

/* renamed from: luf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class luf extends dck implements lug {
    public luf() {
        super("com.google.android.gms.backup.IBackupAccountManagerService");
    }

    /* renamed from: a */
    public final boolean mo3209a(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            Account a = mo19604a();
            parcel2.writeNoException();
            dcl.m8169b(parcel2, a);
        } else if (i == 2) {
            mo19605a((Account) dcl.m8163a(parcel, Account.CREATOR));
            parcel2.writeNoException();
        } else if (i != 3) {
            return false;
        } else {
            boolean c = mo19606c();
            parcel2.writeNoException();
            dcl.m8166a(parcel2, c);
        }
        return true;
    }
}
