package p000;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.carrierauth.EAPAKARequest;

/* renamed from: oqq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class oqq extends dck implements oqr {
    public oqq() {
        super("com.google.android.gms.carrierauth.internal.ICarrierAuthService");
    }

    /* renamed from: a */
    public final boolean mo3209a(int i, Parcel parcel, Parcel parcel2) {
        oqo oqo;
        if (i != 1) {
            return false;
        }
        IBinder readStrongBinder = parcel.readStrongBinder();
        if (readStrongBinder != null) {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.carrierauth.internal.ICarrierAuthCallbacks");
            oqo = queryLocalInterface instanceof oqo ? (oqo) queryLocalInterface : new oqm(readStrongBinder);
        } else {
            oqo = null;
        }
        mo22518a(oqo, (EAPAKARequest) dcl.m8163a(parcel, EAPAKARequest.CREATOR));
        parcel2.writeNoException();
        return true;
    }
}
