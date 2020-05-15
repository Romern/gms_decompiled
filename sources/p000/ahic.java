package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.nearby.connection.ConnectionOptions;

/* renamed from: ahic */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ahic implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new ConnectionOptions[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int b = sed.m35001b(parcel);
        byte[] bArr = null;
        boolean z = false;
        boolean z2 = true;
        boolean z3 = true;
        boolean z4 = true;
        boolean z5 = true;
        boolean z6 = true;
        boolean z7 = true;
        boolean z8 = true;
        boolean z9 = false;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            switch (sed.m34995a(readInt)) {
                case 1:
                    z = sed.m35006c(parcel2, readInt);
                    break;
                case 2:
                    z2 = sed.m35006c(parcel2, readInt);
                    break;
                case 3:
                    z3 = sed.m35006c(parcel2, readInt);
                    break;
                case 4:
                    z4 = sed.m35006c(parcel2, readInt);
                    break;
                case 5:
                    z5 = sed.m35006c(parcel2, readInt);
                    break;
                case 6:
                    z6 = sed.m35006c(parcel2, readInt);
                    break;
                case 7:
                    z7 = sed.m35006c(parcel2, readInt);
                    break;
                case 8:
                    z8 = sed.m35006c(parcel2, readInt);
                    break;
                case 9:
                    bArr = sed.m35023t(parcel2, readInt);
                    break;
                case 10:
                    z9 = sed.m35006c(parcel2, readInt);
                    break;
                default:
                    sed.m35002b(parcel2, readInt);
                    break;
            }
        }
        sed.m34994F(parcel2, b);
        return new ConnectionOptions(z, z2, z3, z4, z5, z6, z7, z8, bArr, z9);
    }
}
