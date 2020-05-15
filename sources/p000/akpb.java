package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.ocr.CreditCardOcrResult;

/* renamed from: akpb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class akpb implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new CreditCardOcrResult[i];
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
        int[] iArr = null;
        int[] iArr2 = null;
        String[] strArr = null;
        String[] strArr2 = null;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        boolean z = false;
        int i4 = 0;
        int i5 = 0;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            switch (sed.m34995a(readInt)) {
                case 2:
                    str = sed.m35020q(parcel2, readInt);
                    break;
                case 3:
                    i = sed.m35010g(parcel2, readInt);
                    break;
                case 4:
                    i2 = sed.m35010g(parcel2, readInt);
                    break;
                case 5:
                    i3 = sed.m35010g(parcel2, readInt);
                    break;
                case 6:
                    str2 = sed.m35020q(parcel2, readInt);
                    break;
                case 7:
                    str3 = sed.m35020q(parcel2, readInt);
                    break;
                case 8:
                    z = sed.m35006c(parcel2, readInt);
                    break;
                case 9:
                    str4 = sed.m35020q(parcel2, readInt);
                    break;
                case 10:
                    str5 = sed.m35020q(parcel2, readInt);
                    break;
                case 11:
                    str6 = sed.m35020q(parcel2, readInt);
                    break;
                case 12:
                    str7 = sed.m35020q(parcel2, readInt);
                    break;
                case 13:
                    iArr = sed.m35026w(parcel2, readInt);
                    break;
                case 14:
                    iArr2 = sed.m35026w(parcel2, readInt);
                    break;
                case 15:
                    strArr = sed.m34989A(parcel2, readInt);
                    break;
                case 16:
                    strArr2 = sed.m34989A(parcel2, readInt);
                    break;
                case 17:
                    i4 = sed.m35010g(parcel2, readInt);
                    break;
                case 18:
                    i5 = sed.m35010g(parcel2, readInt);
                    break;
                default:
                    sed.m35002b(parcel2, readInt);
                    break;
            }
        }
        sed.m34994F(parcel2, b);
        return new CreditCardOcrResult(str, i, i2, i3, str2, str3, z, str4, str5, str6, str7, iArr, iArr2, strArr, strArr2, i4, i5);
    }
}
