package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.location.UserPreferredSleepWindow;

/* renamed from: aeiv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aeiv implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new UserPreferredSleepWindow[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = sed.m35001b(parcel);
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = sed.m34995a(readInt);
            if (a == 1) {
                i = sed.m35010g(parcel, readInt);
            } else if (a == 2) {
                i2 = sed.m35010g(parcel, readInt);
            } else if (a == 3) {
                i3 = sed.m35010g(parcel, readInt);
            } else if (a != 4) {
                sed.m35002b(parcel, readInt);
            } else {
                i4 = sed.m35010g(parcel, readInt);
            }
        }
        sed.m34994F(parcel, b);
        return new UserPreferredSleepWindow(i, i2, i3, i4);
    }
}
