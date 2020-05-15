package p000;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.herrevad.NetworkQualityReport;

/* renamed from: abmd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class abmd implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new NetworkQualityReport[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int b = sed.m35001b(parcel);
        long j = 0;
        long j2 = 0;
        long j3 = 0;
        Bundle bundle = null;
        int i = 0;
        int i2 = 0;
        boolean z = false;
        int i3 = 0;
        boolean z2 = false;
        boolean z3 = false;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            switch (sed.m34995a(readInt)) {
                case 2:
                    i = sed.m35010g(parcel2, readInt);
                    break;
                case 3:
                    j = sed.m35012i(parcel2, readInt);
                    break;
                case 4:
                    j2 = sed.m35012i(parcel2, readInt);
                    break;
                case 5:
                    j3 = sed.m35012i(parcel2, readInt);
                    break;
                case 6:
                    i2 = sed.m35010g(parcel2, readInt);
                    break;
                case 7:
                    bundle = sed.m35022s(parcel2, readInt);
                    break;
                case 8:
                    z = sed.m35006c(parcel2, readInt);
                    break;
                case 9:
                    i3 = sed.m35010g(parcel2, readInt);
                    break;
                case 10:
                    z2 = sed.m35006c(parcel2, readInt);
                    break;
                case 11:
                    z3 = sed.m35006c(parcel2, readInt);
                    break;
                default:
                    sed.m35002b(parcel2, readInt);
                    break;
            }
        }
        sed.m34994F(parcel2, b);
        return new NetworkQualityReport(i, j, j2, j3, i2, bundle, z, i3, z2, z3);
    }
}
