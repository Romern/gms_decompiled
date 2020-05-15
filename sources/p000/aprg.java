package p000;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: aprg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class aprg extends dck implements aprh {
    public aprg() {
        super("com.google.android.gms.search.internal.ISearchAuthService");
    }

    /* renamed from: a */
    public final boolean mo3209a(int i, Parcel parcel, Parcel parcel2) {
        aprf aprf = null;
        if (i == 1) {
            IBinder readStrongBinder = parcel.readStrongBinder();
            if (readStrongBinder != null) {
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.search.internal.ISearchAuthCallbacks");
                if (queryLocalInterface instanceof aprf) {
                    aprf = (aprf) queryLocalInterface;
                } else {
                    aprf = new aprf(readStrongBinder);
                }
            }
            parcel.readString();
            parcel.readString();
            mo47546b(aprf);
        } else if (i != 2) {
            return false;
        } else {
            IBinder readStrongBinder2 = parcel.readStrongBinder();
            if (readStrongBinder2 != null) {
                IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.search.internal.ISearchAuthCallbacks");
                if (queryLocalInterface2 instanceof aprf) {
                    aprf = (aprf) queryLocalInterface2;
                } else {
                    aprf = new aprf(readStrongBinder2);
                }
            }
            parcel.readString();
            parcel.readString();
            mo47545a(aprf);
        }
        parcel2.writeNoException();
        return true;
    }
}
