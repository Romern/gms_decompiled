package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.userlocation.TransitEstimate;

/* renamed from: avwz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class avwz implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new TransitEstimate[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = sed.m35001b(parcel);
        int i = 0;
        float f = 0.0f;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = sed.m34995a(readInt);
            if (a == 1) {
                i = sed.m35010g(parcel, readInt);
            } else if (a != 2) {
                sed.m35002b(parcel, readInt);
            } else {
                f = sed.m35015l(parcel, readInt);
            }
        }
        sed.m34994F(parcel, b);
        return new TransitEstimate(i, f);
    }
}
