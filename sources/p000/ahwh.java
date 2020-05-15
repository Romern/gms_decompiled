package p000;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.nearby.discovery.fastpair.battery.BatteryAdvertisement;

/* renamed from: ahwh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ahwh implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new BatteryAdvertisement[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int b = sed.m35001b(parcel);
        long j = 0;
        long j2 = 0;
        String str = null;
        byte[] bArr = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        Uri uri = null;
        Uri uri2 = null;
        Uri uri3 = null;
        Uri uri4 = null;
        String str6 = null;
        double d = 0.0d;
        boolean z = false;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            switch (sed.m34995a(readInt)) {
                case 1:
                    str = sed.m35020q(parcel2, readInt);
                    break;
                case 2:
                    bArr = sed.m35023t(parcel2, readInt);
                    break;
                case 3:
                    z = sed.m35006c(parcel2, readInt);
                    break;
                case 4:
                    d = sed.m35017n(parcel2, readInt);
                    break;
                case 5:
                    j = sed.m35012i(parcel2, readInt);
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
                    uri = (Uri) sed.m34998a(parcel2, readInt, Uri.CREATOR);
                    break;
                case 11:
                    uri2 = (Uri) sed.m34998a(parcel2, readInt, Uri.CREATOR);
                    break;
                case 12:
                    uri3 = (Uri) sed.m34998a(parcel2, readInt, Uri.CREATOR);
                    break;
                case 13:
                    uri4 = (Uri) sed.m34998a(parcel2, readInt, Uri.CREATOR);
                    break;
                case 14:
                    j2 = sed.m35012i(parcel2, readInt);
                    break;
                case 15:
                    str6 = sed.m35020q(parcel2, readInt);
                    break;
                default:
                    sed.m35002b(parcel2, readInt);
                    break;
            }
        }
        sed.m34994F(parcel2, b);
        return new BatteryAdvertisement(str, bArr, z, d, j, str2, str3, str4, str5, uri, uri2, uri3, uri4, j2, str6);
    }
}
