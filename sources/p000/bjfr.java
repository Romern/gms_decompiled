package p000;

import android.content.Intent;
import android.os.Parcel;

/* renamed from: bjfr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class bjfr extends dck implements bjfs {
    public bjfr() {
        super("com.google.android.wallet.bender3.framework.actions.IActionExecutorService");
    }

    /* renamed from: a */
    public final boolean mo3209a(int i, Parcel parcel, Parcel parcel2) {
        if (i != 1) {
            return false;
        }
        Intent a = mo52452a((Intent) dcl.m8163a(parcel, Intent.CREATOR));
        parcel2.writeNoException();
        dcl.m8169b(parcel2, a);
        return true;
    }
}
