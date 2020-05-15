package p000;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: ouq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ouq extends dck implements our {
    public ouq() {
        super("com.google.android.gms.carsetup.IServiceHandshake");
    }

    /* renamed from: a */
    public final void mo22657a(ouu ouu) {
        ouu.mo22658a();
    }

    /* renamed from: a */
    public final boolean mo3209a(int i, Parcel parcel, Parcel parcel2) {
        ouu ouu;
        if (i != 1) {
            return false;
        }
        IBinder readStrongBinder = parcel.readStrongBinder();
        if (readStrongBinder != null) {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.carsetup.IServiceHandshakeCallback");
            ouu = queryLocalInterface instanceof ouu ? (ouu) queryLocalInterface : new ous(readStrongBinder);
        } else {
            ouu = null;
        }
        mo22657a(ouu);
        parcel2.writeNoException();
        return true;
    }
}
