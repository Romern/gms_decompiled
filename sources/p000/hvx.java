package p000;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.auth.api.identity.SaveAccountLinkingTokenRequest;
import com.google.android.gms.auth.api.identity.SavePasswordRequest;

/* renamed from: hvx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class hvx extends dck implements hvy {
    public hvx() {
        super("com.google.android.gms.auth.api.identity.internal.ICredentialSavingService");
    }

    /* renamed from: a */
    public final boolean mo3209a(int i, Parcel parcel, Parcel parcel2) {
        hwp hwp = null;
        hwq hwq = null;
        if (i == 1) {
            IBinder readStrongBinder = parcel.readStrongBinder();
            if (readStrongBinder != null) {
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.auth.api.identity.internal.ISaveAccountLinkingTokenCallback");
                if (queryLocalInterface instanceof hwp) {
                    hwp = (hwp) queryLocalInterface;
                } else {
                    hwp = new hwp(readStrongBinder);
                }
            }
            mo12450a(hwp, (SaveAccountLinkingTokenRequest) dcl.m8163a(parcel, SaveAccountLinkingTokenRequest.CREATOR));
        } else if (i != 2) {
            return false;
        } else {
            IBinder readStrongBinder2 = parcel.readStrongBinder();
            if (readStrongBinder2 != null) {
                IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.auth.api.identity.internal.ISavePasswordCallback");
                if (queryLocalInterface2 instanceof hwq) {
                    hwq = (hwq) queryLocalInterface2;
                } else {
                    hwq = new hwq(readStrongBinder2);
                }
            }
            mo12451a(hwq, (SavePasswordRequest) dcl.m8163a(parcel, SavePasswordRequest.CREATOR));
        }
        parcel2.writeNoException();
        return true;
    }
}
