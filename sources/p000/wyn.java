package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.feedback.ThemeSettings;

/* renamed from: wyn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class wyn implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new ThemeSettings[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = sed.m35001b(parcel);
        int i = 0;
        int i2 = 0;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = sed.m34995a(readInt);
            if (a == 2) {
                i = sed.m35010g(parcel, readInt);
            } else if (a != 3) {
                sed.m35002b(parcel, readInt);
            } else {
                i2 = sed.m35010g(parcel, readInt);
            }
        }
        sed.m34994F(parcel, b);
        return new ThemeSettings(i, i2);
    }
}
