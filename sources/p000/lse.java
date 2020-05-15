package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.awareness.snapshot.internal.WeatherImpl;

/* renamed from: lse */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class lse implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new WeatherImpl[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = sed.m35001b(parcel);
        int[] iArr = null;
        float f = 0.0f;
        float f2 = 0.0f;
        float f3 = 0.0f;
        int i = 0;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = sed.m34995a(readInt);
            if (a == 2) {
                f = sed.m35015l(parcel, readInt);
            } else if (a == 3) {
                f2 = sed.m35015l(parcel, readInt);
            } else if (a == 4) {
                f3 = sed.m35015l(parcel, readInt);
            } else if (a == 5) {
                i = sed.m35010g(parcel, readInt);
            } else if (a != 6) {
                sed.m35002b(parcel, readInt);
            } else {
                iArr = sed.m35026w(parcel, readInt);
            }
        }
        sed.m34994F(parcel, b);
        return new WeatherImpl(f, f2, f3, i, iArr);
    }
}
