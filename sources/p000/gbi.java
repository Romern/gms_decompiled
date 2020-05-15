package p000;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.asterism.SetAsterismConsentRequest;

/* renamed from: gbi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class gbi implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new SetAsterismConsentRequest[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int b = sed.m35001b(parcel);
        int[] iArr = null;
        Long l = null;
        Bundle bundle = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            switch (sed.m34995a(readInt)) {
                case 1:
                    i = sed.m35010g(parcel2, readInt);
                    break;
                case 2:
                    i2 = sed.m35010g(parcel2, readInt);
                    break;
                case 3:
                    i3 = sed.m35010g(parcel2, readInt);
                    break;
                case 4:
                    iArr = sed.m35026w(parcel2, readInt);
                    break;
                case 5:
                    l = sed.m35013j(parcel2, readInt);
                    break;
                case 6:
                    i4 = sed.m35010g(parcel2, readInt);
                    break;
                case 7:
                    bundle = sed.m35022s(parcel2, readInt);
                    break;
                case 8:
                    i5 = sed.m35010g(parcel2, readInt);
                    break;
                case 9:
                    str = sed.m35020q(parcel2, readInt);
                    break;
                case 10:
                    str2 = sed.m35020q(parcel2, readInt);
                    break;
                case 11:
                    str3 = sed.m35020q(parcel2, readInt);
                    break;
                case 12:
                    str4 = sed.m35020q(parcel2, readInt);
                    break;
                case 13:
                    str5 = sed.m35020q(parcel2, readInt);
                    break;
                default:
                    sed.m35002b(parcel2, readInt);
                    break;
            }
        }
        sed.m34994F(parcel2, b);
        return new SetAsterismConsentRequest(i, i2, i3, iArr, l, i4, bundle, i5, str, str2, str3, str4, str5);
    }
}
