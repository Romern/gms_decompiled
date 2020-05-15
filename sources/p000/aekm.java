package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ClientIdentity;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.internal.LocationRequestInternal;
import java.util.ArrayList;

/* renamed from: aekm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aekm implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new LocationRequestInternal[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int b = sed.m35001b(parcel);
        ArrayList arrayList = LocationRequestInternal.f79419a;
        LocationRequest locationRequest = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        long j = Long.MAX_VALUE;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        boolean z5 = false;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = sed.m34995a(readInt);
            if (a != 1) {
                switch (a) {
                    case 5:
                        arrayList = sed.m35005c(parcel2, readInt, ClientIdentity.CREATOR);
                        continue;
                    case 6:
                        str = sed.m35020q(parcel2, readInt);
                        continue;
                    case 7:
                        z = sed.m35006c(parcel2, readInt);
                        continue;
                    case 8:
                        z2 = sed.m35006c(parcel2, readInt);
                        continue;
                    case 9:
                        z3 = sed.m35006c(parcel2, readInt);
                        continue;
                    case 10:
                        str2 = sed.m35020q(parcel2, readInt);
                        continue;
                    case 11:
                        z4 = sed.m35006c(parcel2, readInt);
                        continue;
                    case 12:
                        z5 = sed.m35006c(parcel2, readInt);
                        continue;
                    case 13:
                        str3 = sed.m35020q(parcel2, readInt);
                        continue;
                    case 14:
                        j = sed.m35012i(parcel2, readInt);
                        continue;
                    default:
                        sed.m35002b(parcel2, readInt);
                        continue;
                }
            } else {
                locationRequest = (LocationRequest) sed.m34998a(parcel2, readInt, LocationRequest.CREATOR);
            }
        }
        sed.m34994F(parcel2, b);
        return new LocationRequestInternal(locationRequest, arrayList, str, z, z2, z3, str2, z4, z5, str3, j);
    }
}
