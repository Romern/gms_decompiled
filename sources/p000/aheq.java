package p000;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.nearby.bootstrap.Device;
import com.google.android.gms.nearby.bootstrap.request.SendDataRequest;

/* renamed from: aheq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aheq implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new SendDataRequest[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = sed.m35001b(parcel);
        Device device = null;
        byte[] bArr = null;
        IBinder iBinder = null;
        int i = 0;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = sed.m34995a(readInt);
            if (a == 1) {
                device = (Device) sed.m34998a(parcel, readInt, Device.CREATOR);
            } else if (a == 2) {
                bArr = sed.m35023t(parcel, readInt);
            } else if (a == 3) {
                iBinder = sed.m35021r(parcel, readInt);
            } else if (a != 1000) {
                sed.m35002b(parcel, readInt);
            } else {
                i = sed.m35010g(parcel, readInt);
            }
        }
        sed.m34994F(parcel, b);
        return new SendDataRequest(i, device, bArr, iBinder);
    }
}
