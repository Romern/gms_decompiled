package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.contextmanager.internal.ContextManagerClientInfo;

/* renamed from: tme */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class tme implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new ContextManagerClientInfo[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = sed.m35001b(parcel);
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
                case 2:
                    str = sed.m35020q(parcel, readInt);
                    break;
                case 3:
                    str2 = sed.m35020q(parcel, readInt);
                    break;
                case 4:
                    i = sed.m35010g(parcel, readInt);
                    break;
                case 5:
                    str3 = sed.m35020q(parcel, readInt);
                    break;
                case 6:
                    i2 = sed.m35010g(parcel, readInt);
                    break;
                case 7:
                    i3 = sed.m35010g(parcel, readInt);
                    break;
                case 8:
                    str4 = sed.m35020q(parcel, readInt);
                    break;
                case 9:
                    str5 = sed.m35020q(parcel, readInt);
                    break;
                case 10:
                    i4 = sed.m35010g(parcel, readInt);
                    break;
                case 11:
                    i5 = sed.m35010g(parcel, readInt);
                    break;
                default:
                    sed.m35002b(parcel, readInt);
                    break;
            }
        }
        sed.m34994F(parcel, b);
        return new ContextManagerClientInfo(str, str2, i, str3, i2, i3, str4, str5, i4, i5);
    }
}
