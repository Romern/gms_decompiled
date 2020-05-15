package p000;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.constellation.PhoneNumberVerification;

/* renamed from: sya */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class sya implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new PhoneNumberVerification[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = sed.m35001b(parcel);
        String str = null;
        String str2 = null;
        Bundle bundle = null;
        long j = 0;
        int i = 0;
        int i2 = 0;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            switch (sed.m34995a(readInt)) {
                case 1:
                    str = sed.m35020q(parcel, readInt);
                    break;
                case 2:
                    j = sed.m35012i(parcel, readInt);
                    break;
                case 3:
                    i = sed.m35010g(parcel, readInt);
                    break;
                case 4:
                    i2 = sed.m35010g(parcel, readInt);
                    break;
                case 5:
                    str2 = sed.m35020q(parcel, readInt);
                    break;
                case 6:
                    bundle = sed.m35022s(parcel, readInt);
                    break;
                default:
                    sed.m35002b(parcel, readInt);
                    break;
            }
        }
        sed.m34994F(parcel, b);
        return new PhoneNumberVerification(str, j, i, i2, str2, bundle);
    }
}
