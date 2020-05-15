package p000;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.smartdevice.wifi.ConnectToWifiNetworkRequest;
import com.google.android.gms.smartdevice.wifi.GetWifiCredentialsRequest;

/* renamed from: asds */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class asds extends dck implements asdt {
    public asds() {
        super("com.google.android.gms.smartdevice.wifi.internal.IWifiHelperService");
    }

    /* renamed from: a */
    public final boolean mo3209a(int i, Parcel parcel, Parcel parcel2) {
        asdq asdq = null;
        if (i == 1) {
            IBinder readStrongBinder = parcel.readStrongBinder();
            if (readStrongBinder != null) {
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.smartdevice.wifi.internal.IWifiHelperCallbacks");
                if (queryLocalInterface instanceof asdq) {
                    asdq = (asdq) queryLocalInterface;
                } else {
                    asdq = new asdo(readStrongBinder);
                }
            }
            mo49071a(asdq, (GetWifiCredentialsRequest) dcl.m8163a(parcel, GetWifiCredentialsRequest.CREATOR));
        } else if (i != 2) {
            return false;
        } else {
            IBinder readStrongBinder2 = parcel.readStrongBinder();
            if (readStrongBinder2 != null) {
                IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.smartdevice.wifi.internal.IWifiHelperCallbacks");
                if (queryLocalInterface2 instanceof asdq) {
                    asdq = (asdq) queryLocalInterface2;
                } else {
                    asdq = new asdo(readStrongBinder2);
                }
            }
            mo49070a(asdq, (ConnectToWifiNetworkRequest) dcl.m8163a(parcel, ConnectToWifiNetworkRequest.CREATOR));
        }
        parcel2.writeNoException();
        return true;
    }
}
