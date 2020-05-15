package p000;

import android.os.Parcel;
import com.google.android.gms.contextmanager.ContextData;

/* renamed from: tmk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class tmk extends dck implements tml {
    public tmk() {
        super("com.google.android.gms.contextmanager.internal.IContextListener");
    }

    /* renamed from: a */
    public final boolean mo3209a(int i, Parcel parcel, Parcel parcel2) {
        if (i != 1) {
            return false;
        }
        mo26651a((ContextData) dcl.m8163a(parcel, ContextData.CREATOR));
        parcel2.writeNoException();
        return true;
    }
}
