package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.nearby.sharing.ContactFilter;

/* renamed from: ajil */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ajil implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new ContactFilter[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = sed.m35001b(parcel);
        Boolean bool = null;
        Boolean bool2 = null;
        Boolean bool3 = null;
        String str = null;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = sed.m34995a(readInt);
            if (a == 1) {
                bool = sed.m35007d(parcel, readInt);
            } else if (a == 2) {
                bool2 = sed.m35007d(parcel, readInt);
            } else if (a == 3) {
                bool3 = sed.m35007d(parcel, readInt);
            } else if (a != 4) {
                sed.m35002b(parcel, readInt);
            } else {
                str = sed.m35020q(parcel, readInt);
            }
        }
        sed.m34994F(parcel, b);
        return new ContactFilter(bool, bool2, bool3, str);
    }
}
