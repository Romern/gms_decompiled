package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.fitness.data.Goal;

/* renamed from: yxj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class yxj implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new Goal.MetricObjective[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = sed.m35001b(parcel);
        double d = 0.0d;
        double d2 = 0.0d;
        String str = null;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = sed.m34995a(readInt);
            if (a == 1) {
                str = sed.m35020q(parcel, readInt);
            } else if (a == 2) {
                d = sed.m35017n(parcel, readInt);
            } else if (a != 3) {
                sed.m35002b(parcel, readInt);
            } else {
                d2 = sed.m35017n(parcel, readInt);
            }
        }
        sed.m34994F(parcel, b);
        return new Goal.MetricObjective(str, d, d2);
    }
}
