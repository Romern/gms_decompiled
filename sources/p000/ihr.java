package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.authzen.gencode.server.api.DeviceClassifierEntity;
import com.google.android.gms.auth.authzen.gencode.server.api.GetMyDevicesRequestEntity;
import java.util.HashSet;

/* renamed from: ihr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ihr implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new GetMyDevicesRequestEntity[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = sed.m35001b(parcel);
        HashSet hashSet = new HashSet();
        DeviceClassifierEntity deviceClassifierEntity = null;
        boolean z = false;
        boolean z2 = false;
        int i = 0;
        int i2 = 0;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = sed.m34995a(readInt);
            if (a == 2) {
                z = sed.m35006c(parcel, readInt);
                hashSet.add(2);
            } else if (a == 3) {
                z2 = sed.m35006c(parcel, readInt);
                hashSet.add(3);
            } else if (a == 4) {
                deviceClassifierEntity = (DeviceClassifierEntity) sed.m34998a(parcel, readInt, DeviceClassifierEntity.CREATOR);
                hashSet.add(4);
            } else if (a == 5) {
                i = sed.m35010g(parcel, readInt);
                hashSet.add(5);
            } else if (a != 6) {
                sed.m35002b(parcel, readInt);
            } else {
                i2 = sed.m35010g(parcel, readInt);
                hashSet.add(6);
            }
        }
        if (parcel.dataPosition() == b) {
            return new GetMyDevicesRequestEntity(hashSet, z, z2, deviceClassifierEntity, i, i2);
        }
        StringBuilder sb = new StringBuilder(37);
        sb.append("Overread allowed size end=");
        sb.append(b);
        throw new sec(sb.toString(), parcel);
    }
}
