package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.wearable.internal.AmsEntityUpdateParcelable;

/* renamed from: axps */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class axps implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new AmsEntityUpdateParcelable[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = sed.m35001b(parcel);
        byte b2 = 0;
        String str = null;
        byte b3 = 0;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = sed.m34995a(readInt);
            if (a == 2) {
                b2 = sed.m35008e(parcel, readInt);
            } else if (a == 3) {
                b3 = sed.m35008e(parcel, readInt);
            } else if (a != 4) {
                sed.m35002b(parcel, readInt);
            } else {
                str = sed.m35020q(parcel, readInt);
            }
        }
        sed.m34994F(parcel, b);
        return new AmsEntityUpdateParcelable(b2, b3, str);
    }
}
