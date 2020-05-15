package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.wearable.ConnectionConfiguration;

/* renamed from: axon */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class axon implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new ConnectionConfiguration[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = sed.m35001b(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        int i = 0;
        int i2 = 0;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            switch (sed.m34995a(readInt)) {
                case 2:
                    str = sed.m35020q(parcel, readInt);
                    break;
                case 3:
                    str2 = sed.m35020q(parcel, readInt);
                    break;
                case 4:
                    i = sed.m35010g(parcel, readInt);
                    break;
                case 5:
                    i2 = sed.m35010g(parcel, readInt);
                    break;
                case 6:
                    z = sed.m35006c(parcel, readInt);
                    break;
                case 7:
                    z2 = sed.m35006c(parcel, readInt);
                    break;
                case 8:
                    str3 = sed.m35020q(parcel, readInt);
                    break;
                case 9:
                    z3 = sed.m35006c(parcel, readInt);
                    break;
                case 10:
                    str4 = sed.m35020q(parcel, readInt);
                    break;
                default:
                    sed.m35002b(parcel, readInt);
                    break;
            }
        }
        sed.m34994F(parcel, b);
        return new ConnectionConfiguration(str, str2, i, i2, z, z2, str3, z3, str4);
    }
}
