package p000;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.smartdevice.d2d.ConnectionRequest;
import com.google.android.gms.smartdevice.d2d.internal.ConnectParams;

/* renamed from: aria */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aria implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new ConnectParams[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        arit arit;
        int b = sed.m35001b(parcel);
        ariq ariq = null;
        IBinder iBinder = null;
        ConnectionRequest connectionRequest = null;
        IBinder iBinder2 = null;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = sed.m34995a(readInt);
            if (a == 1) {
                iBinder = sed.m35021r(parcel, readInt);
            } else if (a == 2) {
                connectionRequest = (ConnectionRequest) sed.m34998a(parcel, readInt, ConnectionRequest.CREATOR);
            } else if (a != 3) {
                sed.m35002b(parcel, readInt);
            } else {
                iBinder2 = sed.m35021r(parcel, readInt);
            }
        }
        sed.m34994F(parcel, b);
        if (iBinder != null) {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.smartdevice.d2d.internal.ISourceDeviceCallbacks");
            arit = queryLocalInterface instanceof arit ? (arit) queryLocalInterface : new arir(iBinder);
        } else {
            arit = null;
        }
        if (iBinder2 != null) {
            IInterface queryLocalInterface2 = iBinder2.queryLocalInterface("com.google.android.gms.smartdevice.d2d.internal.ISourceConnectionListener");
            if (queryLocalInterface2 instanceof ariq) {
                ariq = (ariq) queryLocalInterface2;
            } else {
                ariq = new ario(iBinder2);
            }
        }
        return new ConnectParams(arit, connectionRequest, ariq);
    }
}
