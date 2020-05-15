package p000;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.constellation.VerifyPhoneNumberRequest;

/* renamed from: syu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class syu extends dck implements syv {
    public syu() {
        super("com.google.android.gms.constellation.internal.IConstellationApiService");
    }

    /* renamed from: a */
    public final boolean mo3209a(int i, Parcel parcel, Parcel parcel2) {
        syy syy = null;
        if (i == 1) {
            IBinder readStrongBinder = parcel.readStrongBinder();
            if (readStrongBinder != null) {
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.constellation.internal.IConstellationCallbacks");
                if (queryLocalInterface instanceof syy) {
                    syy = (syy) queryLocalInterface;
                } else {
                    syy = new syw(readStrongBinder);
                }
            }
            mo26244a(syy, (Bundle) dcl.m8163a(parcel, Bundle.CREATOR));
        } else if (i == 2) {
            IBinder readStrongBinder2 = parcel.readStrongBinder();
            if (readStrongBinder2 != null) {
                IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.constellation.internal.IConstellationCallbacks");
                if (queryLocalInterface2 instanceof syy) {
                    syy = (syy) queryLocalInterface2;
                } else {
                    syy = new syw(readStrongBinder2);
                }
            }
            mo26246b(syy, (Bundle) dcl.m8163a(parcel, Bundle.CREATOR));
        } else if (i != 3) {
            return false;
        } else {
            IBinder readStrongBinder3 = parcel.readStrongBinder();
            if (readStrongBinder3 != null) {
                IInterface queryLocalInterface3 = readStrongBinder3.queryLocalInterface("com.google.android.gms.constellation.internal.IConstellationCallbacks");
                if (queryLocalInterface3 instanceof syy) {
                    syy = (syy) queryLocalInterface3;
                } else {
                    syy = new syw(readStrongBinder3);
                }
            }
            mo26245a(syy, (VerifyPhoneNumberRequest) dcl.m8163a(parcel, VerifyPhoneNumberRequest.CREATOR));
        }
        parcel2.writeNoException();
        return true;
    }
}
