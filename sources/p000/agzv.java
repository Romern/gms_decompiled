package p000;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.mobilesubscription.serviceconfig.CheckAuthStatusRequest;
import com.google.android.gms.mobilesubscription.serviceconfig.GetEsimConfigRequest;
import com.google.android.gms.mobilesubscription.serviceconfig.GetPhoneNumbersRequest;

/* renamed from: agzv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class agzv extends dck implements agzw {
    public agzv() {
        super("com.google.android.gms.mobilesubscription.internal.IMobileSubscriptionService");
    }

    /* renamed from: a */
    public final boolean mo3209a(int i, Parcel parcel, Parcel parcel2) {
        agzt agzt = null;
        if (i == 2) {
            IBinder readStrongBinder = parcel.readStrongBinder();
            if (readStrongBinder != null) {
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.mobilesubscription.internal.IMobileSubscriptionCallbacks");
                if (queryLocalInterface instanceof agzt) {
                    agzt = (agzt) queryLocalInterface;
                } else {
                    agzt = new agzr(readStrongBinder);
                }
            }
            mo36220a(agzt, (CheckAuthStatusRequest) dcl.m8163a(parcel, CheckAuthStatusRequest.CREATOR));
        } else if (i == 3) {
            IBinder readStrongBinder2 = parcel.readStrongBinder();
            if (readStrongBinder2 != null) {
                IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.mobilesubscription.internal.IMobileSubscriptionCallbacks");
                if (queryLocalInterface2 instanceof agzt) {
                    agzt = (agzt) queryLocalInterface2;
                } else {
                    agzt = new agzr(readStrongBinder2);
                }
            }
            mo36222a(agzt, (GetPhoneNumbersRequest) dcl.m8163a(parcel, GetPhoneNumbersRequest.CREATOR));
        } else if (i != 4) {
            return false;
        } else {
            IBinder readStrongBinder3 = parcel.readStrongBinder();
            if (readStrongBinder3 != null) {
                IInterface queryLocalInterface3 = readStrongBinder3.queryLocalInterface("com.google.android.gms.mobilesubscription.internal.IMobileSubscriptionCallbacks");
                if (queryLocalInterface3 instanceof agzt) {
                    agzt = (agzt) queryLocalInterface3;
                } else {
                    agzt = new agzr(readStrongBinder3);
                }
            }
            mo36221a(agzt, (GetEsimConfigRequest) dcl.m8163a(parcel, GetEsimConfigRequest.CREATOR));
        }
        parcel2.writeNoException();
        return true;
    }
}
