package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.phone.internal.SmsRetrieverEvent;

/* renamed from: hzy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class hzy implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new SmsRetrieverEvent[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int b = sed.m35001b(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        boolean z = false;
        int i8 = 0;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = sed.m34995a(readInt);
            if (a != 65535) {
                switch (a) {
                    case 1:
                        i = sed.m35010g(parcel2, readInt);
                        continue;
                    case 2:
                        str = sed.m35020q(parcel2, readInt);
                        continue;
                    case 3:
                        i2 = sed.m35010g(parcel2, readInt);
                        continue;
                    case 4:
                        i3 = sed.m35010g(parcel2, readInt);
                        continue;
                    case 5:
                        str2 = sed.m35020q(parcel2, readInt);
                        continue;
                    case 6:
                        str3 = sed.m35020q(parcel2, readInt);
                        continue;
                    case 7:
                        i4 = sed.m35010g(parcel2, readInt);
                        continue;
                    case 8:
                        i5 = sed.m35010g(parcel2, readInt);
                        continue;
                    case 9:
                        i6 = sed.m35010g(parcel2, readInt);
                        continue;
                    case 10:
                        i7 = sed.m35010g(parcel2, readInt);
                        continue;
                    case 11:
                        z = sed.m35006c(parcel2, readInt);
                        continue;
                    default:
                        sed.m35002b(parcel2, readInt);
                        continue;
                }
            } else {
                i8 = sed.m35010g(parcel2, readInt);
            }
        }
        sed.m34994F(parcel2, b);
        return new SmsRetrieverEvent(i, str, i2, i3, str2, str3, i4, i5, i6, i7, z, i8);
    }
}
