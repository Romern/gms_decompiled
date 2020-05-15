package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.userlocation.EstimationOptions;

/* renamed from: avvy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class avvy implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new EstimationOptions[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = sed.m35001b(parcel);
        boolean z = false;
        boolean z2 = false;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = sed.m34995a(readInt);
            if (a == 1) {
                z = sed.m35006c(parcel, readInt);
            } else if (a != 2) {
                sed.m35002b(parcel, readInt);
            } else {
                z2 = sed.m35006c(parcel, readInt);
            }
        }
        sed.m34994F(parcel, b);
        return new EstimationOptions(z, z2);
    }
}
