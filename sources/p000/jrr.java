package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.proximity.gencode.server.api.ExternalDeviceInfoEntity;
import com.google.android.gms.auth.proximity.gencode.server.api.GetMyDevicesResponseEntity;
import java.util.ArrayList;
import java.util.HashSet;

/* renamed from: jrr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class jrr implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new GetMyDevicesResponseEntity[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = sed.m35001b(parcel);
        HashSet hashSet = new HashSet();
        ArrayList arrayList = null;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            if (sed.m34995a(readInt) != 2) {
                sed.m35002b(parcel, readInt);
            } else {
                arrayList = sed.m35005c(parcel, readInt, ExternalDeviceInfoEntity.CREATOR);
                hashSet.add(2);
            }
        }
        if (parcel.dataPosition() == b) {
            return new GetMyDevicesResponseEntity(hashSet, arrayList);
        }
        StringBuilder sb = new StringBuilder(37);
        sb.append("Overread allowed size end=");
        sb.append(b);
        throw new sec(sb.toString(), parcel);
    }
}
