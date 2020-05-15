package p000;

import android.accounts.Account;
import android.os.Parcel;

/* renamed from: sca */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class sca extends dck implements scb {
    public sca() {
        super("com.google.android.gms.common.internal.IAccountAccessor");
    }

    /* renamed from: a */
    public final boolean mo3209a(int i, Parcel parcel, Parcel parcel2) {
        if (i != 2) {
            return false;
        }
        Account a = mo25275a();
        parcel2.writeNoException();
        dcl.m8169b(parcel2, a);
        return true;
    }
}
