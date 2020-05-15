package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.mdh.TimeSeriesFootprintsReadFilter;

/* renamed from: aflf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aflf implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new TimeSeriesFootprintsReadFilter[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = sed.m35001b(parcel);
        Long l = null;
        Long l2 = null;
        int i = 0;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = sed.m34995a(readInt);
            if (a == 1) {
                i = sed.m35010g(parcel, readInt);
            } else if (a == 2) {
                l = sed.m35013j(parcel, readInt);
            } else if (a != 3) {
                sed.m35002b(parcel, readInt);
            } else {
                l2 = sed.m35013j(parcel, readInt);
            }
        }
        sed.m34994F(parcel, b);
        return new TimeSeriesFootprintsReadFilter(i, l, l2);
    }
}
