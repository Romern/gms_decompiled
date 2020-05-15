package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.location.reporting.state.update.Conditions;

/* renamed from: bgyq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bgyq implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new Conditions[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = sed.m35001b(parcel);
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        boolean z5 = false;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = sed.m34995a(readInt);
            if (a == 2) {
                z = sed.m35006c(parcel, readInt);
            } else if (a == 3) {
                z2 = sed.m35006c(parcel, readInt);
            } else if (a == 4) {
                z3 = sed.m35006c(parcel, readInt);
            } else if (a == 5) {
                z4 = sed.m35006c(parcel, readInt);
            } else if (a != 6) {
                sed.m35002b(parcel, readInt);
            } else {
                z5 = sed.m35006c(parcel, readInt);
            }
        }
        sed.m34994F(parcel, b);
        return new Conditions(z, z2, z3, z4, z5);
    }
}
