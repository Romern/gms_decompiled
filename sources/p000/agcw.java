package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.measurement.internal.AppMetadata;
import java.util.ArrayList;

/* renamed from: agcw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class agcw implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new AppMetadata[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int b = sed.m35001b(parcel);
        long j = 0;
        long j2 = 0;
        long j3 = 0;
        long j4 = 0;
        long j5 = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        Boolean bool = null;
        ArrayList arrayList = null;
        String str8 = null;
        long j6 = -2147483648L;
        boolean z = true;
        boolean z2 = false;
        int i = 0;
        boolean z3 = true;
        boolean z4 = true;
        boolean z5 = false;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            switch (sed.m34995a(readInt)) {
                case 2:
                    str = sed.m35020q(parcel2, readInt);
                    break;
                case 3:
                    str2 = sed.m35020q(parcel2, readInt);
                    break;
                case 4:
                    str3 = sed.m35020q(parcel2, readInt);
                    break;
                case 5:
                    str4 = sed.m35020q(parcel2, readInt);
                    break;
                case 6:
                    j = sed.m35012i(parcel2, readInt);
                    break;
                case 7:
                    j2 = sed.m35012i(parcel2, readInt);
                    break;
                case 8:
                    str5 = sed.m35020q(parcel2, readInt);
                    break;
                case 9:
                    z = sed.m35006c(parcel2, readInt);
                    break;
                case 10:
                    z2 = sed.m35006c(parcel2, readInt);
                    break;
                case 11:
                    j6 = sed.m35012i(parcel2, readInt);
                    break;
                case 12:
                    str6 = sed.m35020q(parcel2, readInt);
                    break;
                case 13:
                    j3 = sed.m35012i(parcel2, readInt);
                    break;
                case 14:
                    j4 = sed.m35012i(parcel2, readInt);
                    break;
                case 15:
                    i = sed.m35010g(parcel2, readInt);
                    break;
                case 16:
                    z3 = sed.m35006c(parcel2, readInt);
                    break;
                case 17:
                    z4 = sed.m35006c(parcel2, readInt);
                    break;
                case 18:
                    z5 = sed.m35006c(parcel2, readInt);
                    break;
                case 19:
                    str7 = sed.m35020q(parcel2, readInt);
                    break;
                case 20:
                default:
                    sed.m35002b(parcel2, readInt);
                    break;
                case 21:
                    bool = sed.m35007d(parcel2, readInt);
                    break;
                case 22:
                    j5 = sed.m35012i(parcel2, readInt);
                    break;
                case 23:
                    arrayList = sed.m34992D(parcel2, readInt);
                    break;
                case 24:
                    str8 = sed.m35020q(parcel2, readInt);
                    break;
            }
        }
        sed.m34994F(parcel2, b);
        return new AppMetadata(str, str2, str3, str4, j, j2, str5, z, z2, j6, str6, j3, j4, i, z3, z4, z5, str7, bool, j5, arrayList, str8);
    }
}
