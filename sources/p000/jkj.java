package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.proximity.ConnectionInfo;
import com.google.android.gms.auth.proximity.RemoteDevice;
import com.google.android.gms.auth.proximity.Role;

/* renamed from: jkj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class jkj implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new ConnectionInfo[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = sed.m35001b(parcel);
        RemoteDevice remoteDevice = null;
        Role[] roleArr = null;
        byte[] bArr = null;
        int i = 0;
        int i2 = 0;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = sed.m34995a(readInt);
            if (a == 1) {
                remoteDevice = (RemoteDevice) sed.m34998a(parcel, readInt, RemoteDevice.CREATOR);
            } else if (a == 2) {
                roleArr = (Role[]) sed.m35004b(parcel, readInt, Role.CREATOR);
            } else if (a == 3) {
                i2 = sed.m35010g(parcel, readInt);
            } else if (a == 4) {
                bArr = sed.m35023t(parcel, readInt);
            } else if (a != 1000) {
                sed.m35002b(parcel, readInt);
            } else {
                i = sed.m35010g(parcel, readInt);
            }
        }
        sed.m34994F(parcel, b);
        return new ConnectionInfo(i, remoteDevice, roleArr, i2, bArr);
    }
}
