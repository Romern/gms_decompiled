package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.authzen.gencode.server.api.DeviceClassifierEntity;
import com.google.android.gms.auth.authzen.gencode.server.api.ToggleEasyUnlockRequestEntity;
import java.util.HashSet;

/* renamed from: iia */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class iia implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new ToggleEasyUnlockRequestEntity[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = sed.m35001b(parcel);
        HashSet hashSet = new HashSet();
        boolean z = false;
        DeviceClassifierEntity deviceClassifierEntity = null;
        String str = null;
        String str2 = null;
        boolean z2 = false;
        boolean z3 = false;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            switch (sed.m34995a(readInt)) {
                case 2:
                    z = sed.m35006c(parcel, readInt);
                    hashSet.add(2);
                    break;
                case 3:
                    deviceClassifierEntity = (DeviceClassifierEntity) sed.m34998a(parcel, readInt, DeviceClassifierEntity.CREATOR);
                    hashSet.add(3);
                    break;
                case 4:
                    z2 = sed.m35006c(parcel, readInt);
                    hashSet.add(4);
                    break;
                case 5:
                    str = sed.m35020q(parcel, readInt);
                    hashSet.add(5);
                    break;
                case 6:
                    z3 = sed.m35006c(parcel, readInt);
                    hashSet.add(6);
                    break;
                case 7:
                    str2 = sed.m35020q(parcel, readInt);
                    hashSet.add(7);
                    break;
                default:
                    sed.m35002b(parcel, readInt);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new ToggleEasyUnlockRequestEntity(hashSet, z, deviceClassifierEntity, z2, str, z3, str2);
        }
        StringBuilder sb = new StringBuilder(37);
        sb.append("Overread allowed size end=");
        sb.append(b);
        throw new sec(sb.toString(), parcel);
    }
}
