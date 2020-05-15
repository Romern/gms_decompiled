package p000;

import android.os.Parcel;
import android.os.ParcelUuid;
import android.os.Parcelable;
import com.google.android.gms.nearby.connection.AdvertisingOptions;
import com.google.android.gms.nearby.connection.Strategy;

/* renamed from: ahhu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ahhu implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new AdvertisingOptions[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int b = sed.m35001b(parcel);
        Strategy strategy = null;
        byte[] bArr = null;
        ParcelUuid parcelUuid = null;
        boolean z = true;
        boolean z2 = true;
        boolean z3 = true;
        boolean z4 = true;
        boolean z5 = false;
        boolean z6 = true;
        boolean z7 = true;
        boolean z8 = true;
        boolean z9 = false;
        boolean z10 = false;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            switch (sed.m34995a(readInt)) {
                case 1:
                    strategy = (Strategy) sed.m34998a(parcel2, readInt, Strategy.CREATOR);
                    break;
                case 2:
                    z = sed.m35006c(parcel2, readInt);
                    break;
                case 3:
                    z2 = sed.m35006c(parcel2, readInt);
                    break;
                case 4:
                    z3 = sed.m35006c(parcel2, readInt);
                    break;
                case 5:
                    z4 = sed.m35006c(parcel2, readInt);
                    break;
                case 6:
                    bArr = sed.m35023t(parcel2, readInt);
                    break;
                case 7:
                    z5 = sed.m35006c(parcel2, readInt);
                    break;
                case 8:
                    parcelUuid = (ParcelUuid) sed.m34998a(parcel2, readInt, ParcelUuid.CREATOR);
                    break;
                case 9:
                    z6 = sed.m35006c(parcel2, readInt);
                    break;
                case 10:
                    z7 = sed.m35006c(parcel2, readInt);
                    break;
                case 11:
                    z8 = sed.m35006c(parcel2, readInt);
                    break;
                case 12:
                    z9 = sed.m35006c(parcel2, readInt);
                    break;
                case 13:
                    z10 = sed.m35006c(parcel2, readInt);
                    break;
                default:
                    sed.m35002b(parcel2, readInt);
                    break;
            }
        }
        sed.m34994F(parcel2, b);
        return new AdvertisingOptions(strategy, z, z2, z3, z4, bArr, z5, parcelUuid, z6, z7, z8, z9, z10);
    }
}
