package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.userlocation.CheckInResponse;

/* renamed from: avvx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class avvx implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new CheckInResponse[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = sed.m35001b(parcel);
        byte[][] bArr = null;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            if (sed.m34995a(readInt) != 1) {
                sed.m35002b(parcel, readInt);
            } else {
                bArr = sed.m35024u(parcel, readInt);
            }
        }
        sed.m34994F(parcel, b);
        return new CheckInResponse(bArr);
    }
}
