package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.tapandpay.issuer.UserAddress;

/* renamed from: aszp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aszp implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new UserAddress[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int b = sed.m35001b(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        String str8 = null;
        String str9 = null;
        String str10 = null;
        String str11 = null;
        String str12 = null;
        String str13 = null;
        String str14 = null;
        boolean z = false;
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
                    str5 = sed.m35020q(parcel2, readInt);
                    break;
                case 7:
                    str6 = sed.m35020q(parcel2, readInt);
                    break;
                case 8:
                    str7 = sed.m35020q(parcel2, readInt);
                    break;
                case 9:
                    str8 = sed.m35020q(parcel2, readInt);
                    break;
                case 10:
                    str9 = sed.m35020q(parcel2, readInt);
                    break;
                case 11:
                    str10 = sed.m35020q(parcel2, readInt);
                    break;
                case 12:
                    str11 = sed.m35020q(parcel2, readInt);
                    break;
                case 13:
                    str12 = sed.m35020q(parcel2, readInt);
                    break;
                case 14:
                    z = sed.m35006c(parcel2, readInt);
                    break;
                case 15:
                    str13 = sed.m35020q(parcel2, readInt);
                    break;
                case 16:
                    str14 = sed.m35020q(parcel2, readInt);
                    break;
                default:
                    sed.m35002b(parcel2, readInt);
                    break;
            }
        }
        sed.m34994F(parcel2, b);
        return new UserAddress(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, z, str13, str14);
    }
}
