package p000;

import android.location.Location;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.thunderbird.state.ActivationInfo;

/* renamed from: auhj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class auhj implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new ActivationInfo[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = sed.m35001b(parcel);
        long j = 0;
        long j2 = 0;
        String str = null;
        String str2 = null;
        Location location = null;
        boolean z = false;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            switch (sed.m34995a(readInt)) {
                case 1:
                    str = sed.m35020q(parcel, readInt);
                    break;
                case 2:
                    str2 = sed.m35020q(parcel, readInt);
                    break;
                case 3:
                    z = sed.m35006c(parcel, readInt);
                    break;
                case 4:
                    j = sed.m35012i(parcel, readInt);
                    break;
                case 5:
                    j2 = sed.m35012i(parcel, readInt);
                    break;
                case 6:
                    location = (Location) sed.m34998a(parcel, readInt, Location.CREATOR);
                    break;
                default:
                    sed.m35002b(parcel, readInt);
                    break;
            }
        }
        sed.m34994F(parcel, b);
        return new ActivationInfo(str, str2, z, j, j2, location);
    }
}
