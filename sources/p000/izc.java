package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.firstparty.shared.FACLConfig;

/* renamed from: izc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class izc implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new FACLConfig[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = sed.m35001b(parcel);
        String str = null;
        int i = 0;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        boolean z5 = false;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            switch (sed.m34995a(readInt)) {
                case 1:
                    i = sed.m35010g(parcel, readInt);
                    break;
                case 2:
                    z = sed.m35006c(parcel, readInt);
                    break;
                case 3:
                    str = sed.m35020q(parcel, readInt);
                    break;
                case 4:
                    z2 = sed.m35006c(parcel, readInt);
                    break;
                case 5:
                    z3 = sed.m35006c(parcel, readInt);
                    break;
                case 6:
                    z4 = sed.m35006c(parcel, readInt);
                    break;
                case 7:
                    z5 = sed.m35006c(parcel, readInt);
                    break;
                default:
                    sed.m35002b(parcel, readInt);
                    break;
            }
        }
        sed.m34994F(parcel, b);
        return new FACLConfig(i, z, str, z2, z3, z4, z5);
    }
}
