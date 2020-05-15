package p000;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.pseudonymous.PseudonymousIdToken;

/* renamed from: aooj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class aooj extends dck implements aook {
    public aooj() {
        super("com.google.android.gms.pseudonymous.internal.IPseudonymousIdService");
    }

    /* renamed from: a */
    public final boolean mo3209a(int i, Parcel parcel, Parcel parcel2) {
        aooh aooh = null;
        if (i == 1) {
            IBinder readStrongBinder = parcel.readStrongBinder();
            if (readStrongBinder != null) {
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.pseudonymous.internal.IPseudonymousIdCallbacks");
                if (queryLocalInterface instanceof aooh) {
                    aooh = (aooh) queryLocalInterface;
                } else {
                    aooh = new aoof(readStrongBinder);
                }
            }
            mo43125a(aooh);
        } else if (i == 2) {
            IBinder readStrongBinder2 = parcel.readStrongBinder();
            if (readStrongBinder2 != null) {
                IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.pseudonymous.internal.IPseudonymousIdCallbacks");
                if (queryLocalInterface2 instanceof aooh) {
                    aooh = (aooh) queryLocalInterface2;
                } else {
                    aooh = new aoof(readStrongBinder2);
                }
            }
            mo43126a(aooh, (PseudonymousIdToken) dcl.m8163a(parcel, PseudonymousIdToken.CREATOR));
        } else if (i != 3) {
            return false;
        } else {
            IBinder readStrongBinder3 = parcel.readStrongBinder();
            if (readStrongBinder3 != null) {
                IInterface queryLocalInterface3 = readStrongBinder3.queryLocalInterface("com.google.android.gms.pseudonymous.internal.IPseudonymousIdCallbacks");
                if (queryLocalInterface3 instanceof aooh) {
                    aooh = (aooh) queryLocalInterface3;
                } else {
                    aooh = new aoof(readStrongBinder3);
                }
            }
            mo43127b(aooh);
        }
        return true;
    }
}
