package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.authzen.gencode.server.api.DeviceClassifierEntity;
import com.google.android.gms.auth.authzen.gencode.server.api.UpdateDeviceInfoRequestEntity;
import java.util.HashSet;

/* renamed from: iic */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class iic implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new UpdateDeviceInfoRequestEntity[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = sed.m35001b(parcel);
        HashSet hashSet = new HashSet();
        DeviceClassifierEntity deviceClassifierEntity = null;
        String str = null;
        String str2 = null;
        int i = 0;
        int i2 = 0;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = sed.m34995a(readInt);
            if (a == 2) {
                deviceClassifierEntity = (DeviceClassifierEntity) sed.m34998a(parcel, readInt, DeviceClassifierEntity.CREATOR);
                hashSet.add(2);
            } else if (a == 3) {
                str = sed.m35020q(parcel, readInt);
                hashSet.add(3);
            } else if (a == 4) {
                i = sed.m35010g(parcel, readInt);
                hashSet.add(4);
            } else if (a == 5) {
                str2 = sed.m35020q(parcel, readInt);
                hashSet.add(5);
            } else if (a != 6) {
                sed.m35002b(parcel, readInt);
            } else {
                i2 = sed.m35010g(parcel, readInt);
                hashSet.add(6);
            }
        }
        if (parcel.dataPosition() == b) {
            return new UpdateDeviceInfoRequestEntity(hashSet, deviceClassifierEntity, str, i, str2, i2);
        }
        StringBuilder sb = new StringBuilder(37);
        sb.append("Overread allowed size end=");
        sb.append(b);
        throw new sec(sb.toString(), parcel);
    }
}
