package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.instantapps.internal.RoutingOptions;

/* renamed from: adgv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class adgv implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new RoutingOptions[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = sed.m35001b(parcel);
        String str = null;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        boolean z5 = false;
        boolean z6 = false;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            switch (sed.m34995a(readInt)) {
                case 1:
                    z = sed.m35006c(parcel, readInt);
                    break;
                case 2:
                    str = sed.m35020q(parcel, readInt);
                    break;
                case 3:
                    z2 = sed.m35006c(parcel, readInt);
                    break;
                case 4:
                    z3 = sed.m35006c(parcel, readInt);
                    break;
                case 5:
                    z4 = sed.m35006c(parcel, readInt);
                    break;
                case 6:
                    z5 = sed.m35006c(parcel, readInt);
                    break;
                case 7:
                    z6 = sed.m35006c(parcel, readInt);
                    break;
                default:
                    sed.m35002b(parcel, readInt);
                    break;
            }
        }
        sed.m34994F(parcel, b);
        return new RoutingOptions(z, str, z2, z3, z4, z5, z6);
    }
}
