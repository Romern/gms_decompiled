package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.cast.CastDevice;
import com.google.android.gms.common.images.WebImage;
import java.util.ArrayList;

/* renamed from: peu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class peu implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new CastDevice[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int b = sed.m35001b(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        ArrayList arrayList = null;
        String str6 = null;
        String str7 = null;
        String str8 = null;
        byte[] bArr = null;
        String str9 = null;
        int i = 0;
        int i2 = 0;
        int i3 = -1;
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
                    str4 = sed.m35020q(parcel2, readInt);
                    break;
                case 6:
                    str5 = sed.m35020q(parcel2, readInt);
                    break;
                case 7:
                    i = sed.m35010g(parcel2, readInt);
                    break;
                case 8:
                    arrayList = sed.m35005c(parcel2, readInt, WebImage.CREATOR);
                    break;
                case 9:
                    i2 = sed.m35010g(parcel2, readInt);
                    break;
                case 10:
                    i3 = sed.m35010g(parcel2, readInt);
                    break;
                case 11:
                    str6 = sed.m35020q(parcel2, readInt);
                    break;
                case 12:
                    str7 = sed.m35020q(parcel2, readInt);
                    break;
                case 13:
                    i4 = sed.m35010g(parcel2, readInt);
                    break;
                case 14:
                    str8 = sed.m35020q(parcel2, readInt);
                    break;
                case 15:
                    bArr = sed.m35023t(parcel2, readInt);
                    break;
                case 16:
                    str9 = sed.m35020q(parcel2, readInt);
                    break;
                default:
                    sed.m35002b(parcel2, readInt);
                    break;
            }
        }
        sed.m34994F(parcel2, b);
        return new CastDevice(str, str2, str3, str4, str5, i, arrayList, i2, i3, str6, str7, i4, str8, bArr, str9);
    }
}
