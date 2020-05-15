package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.udc.UdcCacheRequest;

/* renamed from: avad */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class avad implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new UdcCacheRequest[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = sed.m35001b(parcel);
        int[] iArr = null;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            if (sed.m34995a(readInt) != 2) {
                sed.m35002b(parcel, readInt);
            } else {
                iArr = sed.m35026w(parcel, readInt);
            }
        }
        sed.m34994F(parcel, b);
        return new UdcCacheRequest(iArr);
    }
}
