package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.smartdevice.d2d.AdvertisingInfo;

/* renamed from: aqxs */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aqxs implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new AdvertisingInfo[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = sed.m35001b(parcel);
        String str = null;
        String str2 = null;
        String str3 = "";
        String str4 = null;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = sed.m34995a(readInt);
            if (a == 2) {
                str = sed.m35020q(parcel, readInt);
            } else if (a == 3) {
                str3 = sed.m35020q(parcel, readInt);
            } else if (a == 4) {
                str4 = sed.m35020q(parcel, readInt);
            } else if (a != 5) {
                sed.m35002b(parcel, readInt);
            } else {
                str2 = sed.m35020q(parcel, readInt);
            }
        }
        sed.m34994F(parcel, b);
        return new AdvertisingInfo(str, str3, str4, str2);
    }
}
