package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.authzen.gencode.server.api.DeviceClassifierEntity;
import java.util.HashSet;

/* renamed from: ihl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ihl implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new DeviceClassifierEntity[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = sed.m35001b(parcel);
        HashSet hashSet = new HashSet();
        long j = 0;
        String str = null;
        String str2 = null;
        long j2 = 0;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = sed.m34995a(readInt);
            if (a == 2) {
                j = sed.m35012i(parcel, readInt);
                hashSet.add(2);
            } else if (a == 3) {
                str = sed.m35020q(parcel, readInt);
                hashSet.add(3);
            } else if (a == 4) {
                j2 = sed.m35012i(parcel, readInt);
                hashSet.add(4);
            } else if (a != 5) {
                sed.m35002b(parcel, readInt);
            } else {
                str2 = sed.m35020q(parcel, readInt);
                hashSet.add(5);
            }
        }
        if (parcel.dataPosition() == b) {
            return new DeviceClassifierEntity(hashSet, j, str, j2, str2);
        }
        StringBuilder sb = new StringBuilder(37);
        sb.append("Overread allowed size end=");
        sb.append(b);
        throw new sec(sb.toString(), parcel);
    }
}
