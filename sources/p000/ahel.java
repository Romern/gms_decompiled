package p000;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.nearby.bootstrap.Device;
import com.google.android.gms.nearby.bootstrap.request.ConnectRequest;

/* renamed from: ahel */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ahel implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new ConnectRequest[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int b = sed.m35001b(parcel);
        Device device = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        IBinder iBinder = null;
        IBinder iBinder2 = null;
        IBinder iBinder3 = null;
        long j = 0;
        int i = 0;
        byte b2 = 0;
        byte b3 = 0;
        byte b4 = 0;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = sed.m34995a(readInt);
            if (a != 1000) {
                switch (a) {
                    case 1:
                        device = (Device) sed.m34998a(parcel2, readInt, Device.CREATOR);
                        continue;
                    case 2:
                        str = sed.m35020q(parcel2, readInt);
                        continue;
                    case 3:
                        str2 = sed.m35020q(parcel2, readInt);
                        continue;
                    case 4:
                        iBinder = sed.m35021r(parcel2, readInt);
                        continue;
                    case 5:
                        iBinder2 = sed.m35021r(parcel2, readInt);
                        continue;
                    case 6:
                        iBinder3 = sed.m35021r(parcel2, readInt);
                        continue;
                    case 7:
                        b2 = sed.m35008e(parcel2, readInt);
                        continue;
                    case 8:
                        j = sed.m35012i(parcel2, readInt);
                        continue;
                    case 9:
                        str3 = sed.m35020q(parcel2, readInt);
                        continue;
                    case 10:
                        b3 = sed.m35008e(parcel2, readInt);
                        continue;
                    case 11:
                        b4 = sed.m35008e(parcel2, readInt);
                        continue;
                    default:
                        sed.m35002b(parcel2, readInt);
                        continue;
                }
            } else {
                i = sed.m35010g(parcel2, readInt);
            }
        }
        sed.m34994F(parcel2, b);
        return new ConnectRequest(i, device, str, str2, b2, j, str3, b3, b4, iBinder, iBinder2, iBinder3);
    }
}
