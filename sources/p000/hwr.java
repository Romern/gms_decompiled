package p000;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.auth.api.identity.BeginSignInRequest;
import com.google.android.gms.auth.api.identity.GetSignInIntentRequest;

/* renamed from: hwr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class hwr extends dck implements hws {
    public hwr() {
        super("com.google.android.gms.auth.api.identity.internal.ISignInService");
    }

    /* renamed from: a */
    public final boolean mo3209a(int i, Parcel parcel, Parcel parcel2) {
        hvt hvt = null;
        hwf hwf = null;
        rnt rnt = null;
        if (i == 1) {
            IBinder readStrongBinder = parcel.readStrongBinder();
            if (readStrongBinder != null) {
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.auth.api.identity.internal.IBeginSignInCallback");
                if (queryLocalInterface instanceof hvt) {
                    hvt = (hvt) queryLocalInterface;
                } else {
                    hvt = new hvt(readStrongBinder);
                }
            }
            mo12287a(hvt, (BeginSignInRequest) dcl.m8163a(parcel, BeginSignInRequest.CREATOR));
        } else if (i == 2) {
            IBinder readStrongBinder2 = parcel.readStrongBinder();
            if (readStrongBinder2 != null) {
                IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.common.api.internal.IStatusCallback");
                if (queryLocalInterface2 instanceof rnt) {
                    rnt = (rnt) queryLocalInterface2;
                } else {
                    rnt = new rnr(readStrongBinder2);
                }
            }
            mo12289a(rnt, parcel.readString());
        } else if (i != 3) {
            return false;
        } else {
            IBinder readStrongBinder3 = parcel.readStrongBinder();
            if (readStrongBinder3 != null) {
                IInterface queryLocalInterface3 = readStrongBinder3.queryLocalInterface("com.google.android.gms.auth.api.identity.internal.IGetSignInIntentCallback");
                if (queryLocalInterface3 instanceof hwf) {
                    hwf = (hwf) queryLocalInterface3;
                } else {
                    hwf = new hwf(readStrongBinder3);
                }
            }
            mo12288a(hwf, (GetSignInIntentRequest) dcl.m8163a(parcel, GetSignInIntentRequest.CREATOR));
        }
        parcel2.writeNoException();
        return true;
    }
}
