package p000;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.tapandpay.firstparty.ValuableInfo;

/* renamed from: aspi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aspi implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new ValuableInfo[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int b = sed.m35001b(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        Uri uri = null;
        Uri uri2 = null;
        Uri uri3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        Bitmap bitmap = null;
        Bitmap bitmap2 = null;
        Bitmap bitmap3 = null;
        String str7 = null;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
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
                    uri = (Uri) sed.m34998a(parcel2, readInt, Uri.CREATOR);
                    break;
                case 6:
                    i = sed.m35010g(parcel2, readInt);
                    break;
                case 7:
                    i2 = sed.m35010g(parcel2, readInt);
                    break;
                case 8:
                    i3 = sed.m35010g(parcel2, readInt);
                    break;
                case 9:
                    uri2 = (Uri) sed.m34998a(parcel2, readInt, Uri.CREATOR);
                    break;
                case 10:
                    uri3 = (Uri) sed.m34998a(parcel2, readInt, Uri.CREATOR);
                    break;
                case 11:
                    str4 = sed.m35020q(parcel2, readInt);
                    break;
                case 12:
                    str5 = sed.m35020q(parcel2, readInt);
                    break;
                case 13:
                    str6 = sed.m35020q(parcel2, readInt);
                    break;
                case 14:
                    bitmap = (Bitmap) sed.m34998a(parcel2, readInt, Bitmap.CREATOR);
                    break;
                case 15:
                    bitmap2 = (Bitmap) sed.m34998a(parcel2, readInt, Bitmap.CREATOR);
                    break;
                case 16:
                    bitmap3 = (Bitmap) sed.m34998a(parcel2, readInt, Bitmap.CREATOR);
                    break;
                case 17:
                    i4 = sed.m35010g(parcel2, readInt);
                    break;
                case 18:
                    str7 = sed.m35020q(parcel2, readInt);
                    break;
                default:
                    sed.m35002b(parcel2, readInt);
                    break;
            }
        }
        sed.m34994F(parcel2, b);
        return new ValuableInfo(str, str2, str3, uri, i, i2, i3, uri2, uri3, str4, str5, str6, bitmap, bitmap2, bitmap3, i4, str7);
    }
}
