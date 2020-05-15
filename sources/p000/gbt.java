package p000;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.asterism.GetAsterismConsentRequest;
import com.google.android.gms.asterism.SetAsterismConsentRequest;

/* renamed from: gbt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class gbt extends dck implements gbu {
    public gbt() {
        super("com.google.android.gms.asterism.internal.IAsterismApiService");
    }

    /* renamed from: a */
    public final boolean mo3209a(int i, Parcel parcel, Parcel parcel2) {
        gbx gbx = null;
        if (i == 1) {
            IBinder readStrongBinder = parcel.readStrongBinder();
            if (readStrongBinder != null) {
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.asterism.internal.IAsterismCallbacks");
                if (queryLocalInterface instanceof gbx) {
                    gbx = (gbx) queryLocalInterface;
                } else {
                    gbx = new gbv(readStrongBinder);
                }
            }
            mo11621a(gbx, (GetAsterismConsentRequest) dcl.m8163a(parcel, GetAsterismConsentRequest.CREATOR));
        } else if (i != 2) {
            return false;
        } else {
            IBinder readStrongBinder2 = parcel.readStrongBinder();
            if (readStrongBinder2 != null) {
                IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.asterism.internal.IAsterismCallbacks");
                if (queryLocalInterface2 instanceof gbx) {
                    gbx = (gbx) queryLocalInterface2;
                } else {
                    gbx = new gbv(readStrongBinder2);
                }
            }
            mo11622a(gbx, (SetAsterismConsentRequest) dcl.m8163a(parcel, SetAsterismConsentRequest.CREATOR));
        }
        parcel2.writeNoException();
        return true;
    }
}
