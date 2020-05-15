package p000;

import android.os.Parcel;
import android.os.ParcelUuid;
import android.os.Parcelable;
import com.google.android.gms.nearby.connection.DiscoveryOptions;
import com.google.android.gms.nearby.connection.Strategy;

/* renamed from: ahil */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ahil implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new DiscoveryOptions[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = sed.m35001b(parcel);
        Strategy strategy = null;
        ParcelUuid parcelUuid = null;
        boolean z = false;
        boolean z2 = true;
        boolean z3 = true;
        boolean z4 = false;
        boolean z5 = true;
        boolean z6 = true;
        boolean z7 = true;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            switch (sed.m34995a(readInt)) {
                case 1:
                    strategy = (Strategy) sed.m34998a(parcel, readInt, Strategy.CREATOR);
                    break;
                case 2:
                    z = sed.m35006c(parcel, readInt);
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
                    parcelUuid = (ParcelUuid) sed.m34998a(parcel, readInt, ParcelUuid.CREATOR);
                    break;
                case 7:
                default:
                    sed.m35002b(parcel, readInt);
                    break;
                case 8:
                    z5 = sed.m35006c(parcel, readInt);
                    break;
                case 9:
                    z6 = sed.m35006c(parcel, readInt);
                    break;
                case 10:
                    z7 = sed.m35006c(parcel, readInt);
                    break;
            }
        }
        sed.m34994F(parcel, b);
        return new DiscoveryOptions(strategy, z, z2, z3, z4, parcelUuid, z5, z6, z7);
    }
}
