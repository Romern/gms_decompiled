package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.car.CarInfo;
import com.google.android.gms.carsetup.CarInfoInternal;

/* renamed from: orh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class orh implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new CarInfoInternal[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int b = sed.m35001b(parcel);
        long j = 0;
        long j2 = 0;
        CarInfo carInfo = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        boolean z = false;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        boolean z2 = false;
        boolean z3 = false;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            switch (sed.m34995a(readInt)) {
                case 1:
                    carInfo = (CarInfo) sed.m34998a(parcel2, readInt, CarInfo.CREATOR);
                    break;
                case 2:
                    str = sed.m35020q(parcel2, readInt);
                    break;
                case 3:
                    z = sed.m35006c(parcel2, readInt);
                    break;
                case 4:
                    j = sed.m35012i(parcel2, readInt);
                    break;
                case 5:
                    j2 = sed.m35012i(parcel2, readInt);
                    break;
                case 6:
                    str2 = sed.m35020q(parcel2, readInt);
                    break;
                case 7:
                    str3 = sed.m35020q(parcel2, readInt);
                    break;
                case 8:
                    str4 = sed.m35020q(parcel2, readInt);
                    break;
                case 9:
                    str5 = sed.m35020q(parcel2, readInt);
                    break;
                case 10:
                    i = sed.m35010g(parcel2, readInt);
                    break;
                case 11:
                    str6 = sed.m35020q(parcel2, readInt);
                    break;
                case 12:
                    i2 = sed.m35010g(parcel2, readInt);
                    break;
                case 13:
                    i3 = sed.m35010g(parcel2, readInt);
                    break;
                case 14:
                    i4 = sed.m35010g(parcel2, readInt);
                    break;
                case 15:
                    z2 = sed.m35006c(parcel2, readInt);
                    break;
                case 16:
                    z3 = sed.m35006c(parcel2, readInt);
                    break;
                default:
                    sed.m35002b(parcel2, readInt);
                    break;
            }
        }
        sed.m34994F(parcel2, b);
        return new CarInfoInternal(carInfo, str, z, j, j2, str2, str3, str4, str5, i, str6, i2, i3, i4, z2, z3);
    }
}
