package p000;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.nearby.bootstrap.request.ConnectRequest;
import com.google.android.gms.nearby.bootstrap.request.ContinueConnectRequest;
import com.google.android.gms.nearby.bootstrap.request.DisableTargetRequest;
import com.google.android.gms.nearby.bootstrap.request.DisconnectRequest;
import com.google.android.gms.nearby.bootstrap.request.EnableTargetRequest;
import com.google.android.gms.nearby.bootstrap.request.SendDataRequest;
import com.google.android.gms.nearby.bootstrap.request.StartScanRequest;
import com.google.android.gms.nearby.bootstrap.request.StopScanRequest;

/* renamed from: ahdr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class ahdr extends dck implements ahds {
    public ahdr() {
        super("com.google.android.gms.nearby.bootstrap.internal.INearbyBootstrapService");
    }

    /* renamed from: a */
    public final boolean mo3209a(int i, Parcel parcel, Parcel parcel2) {
        ahdp ahdp;
        switch (i) {
            case 1:
                mo36359a((StartScanRequest) dcl.m8163a(parcel, StartScanRequest.CREATOR));
                parcel2.writeNoException();
                return true;
            case 2:
                mo36360a((StopScanRequest) dcl.m8163a(parcel, StopScanRequest.CREATOR));
                parcel2.writeNoException();
                return true;
            case 3:
                mo36357a((EnableTargetRequest) dcl.m8163a(parcel, EnableTargetRequest.CREATOR));
                parcel2.writeNoException();
                return true;
            case 4:
                mo36355a((DisableTargetRequest) dcl.m8163a(parcel, DisableTargetRequest.CREATOR));
                parcel2.writeNoException();
                return true;
            case 5:
                mo36353a((ConnectRequest) dcl.m8163a(parcel, ConnectRequest.CREATOR));
                parcel2.writeNoException();
                return true;
            case 6:
                mo36356a((DisconnectRequest) dcl.m8163a(parcel, DisconnectRequest.CREATOR));
                parcel2.writeNoException();
                return true;
            case 7:
                mo36358a((SendDataRequest) dcl.m8163a(parcel, SendDataRequest.CREATOR));
                parcel2.writeNoException();
                return true;
            case 8:
                mo36354a((ContinueConnectRequest) dcl.m8163a(parcel, ContinueConnectRequest.CREATOR));
                parcel2.writeNoException();
                return true;
            case 9:
                String a = mo36351a();
                parcel2.writeNoException();
                parcel2.writeString(a);
                return true;
            case 10:
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.nearby.bootstrap.internal.INearbyBootstrapCallback");
                    ahdp = queryLocalInterface instanceof ahdp ? (ahdp) queryLocalInterface : new ahdn(readStrongBinder);
                } else {
                    ahdp = null;
                }
                mo36352a(ahdp);
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
