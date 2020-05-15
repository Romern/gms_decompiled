package p000;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.auth.api.identity.AuthorizationRequest;

/* renamed from: hvr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class hvr extends dck implements hvs {
    public hvr() {
        super("com.google.android.gms.auth.api.identity.internal.IAuthorizationService");
    }

    /* renamed from: a */
    public final boolean mo3209a(int i, Parcel parcel, Parcel parcel2) {
        hvq hvq;
        if (i != 1) {
            return false;
        }
        IBinder readStrongBinder = parcel.readStrongBinder();
        if (readStrongBinder != null) {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.auth.api.identity.internal.IAuthorizationCallback");
            hvq = queryLocalInterface instanceof hvq ? (hvq) queryLocalInterface : new hvq(readStrongBinder);
        } else {
            hvq = null;
        }
        mo12374a(hvq, (AuthorizationRequest) dcl.m8163a(parcel, AuthorizationRequest.CREATOR));
        parcel2.writeNoException();
        return true;
    }
}
