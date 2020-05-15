package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.location.LocationSettingsConfiguration;

/* renamed from: aeif */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aeif implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new LocationSettingsConfiguration[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = sed.m35001b(parcel);
        String str = "";
        String str2 = str;
        String str3 = str2;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = sed.m34995a(readInt);
            if (a == 1) {
                str2 = sed.m35020q(parcel, readInt);
            } else if (a == 2) {
                str3 = sed.m35020q(parcel, readInt);
            } else if (a != 5) {
                sed.m35002b(parcel, readInt);
            } else {
                str = sed.m35020q(parcel, readInt);
            }
        }
        sed.m34994F(parcel, b);
        return new LocationSettingsConfiguration(str, str2, str3);
    }
}
