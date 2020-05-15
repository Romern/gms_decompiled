package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.wearable.internal.AncsNotificationParcelable;

/* renamed from: axpt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class axpt implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new AncsNotificationParcelable[i];
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
        int i = 0;
        byte b2 = 0;
        byte b3 = 0;
        byte b4 = 0;
        byte b5 = 0;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            switch (sed.m34995a(readInt)) {
                case 2:
                    i = sed.m35010g(parcel2, readInt);
                    break;
                case 3:
                    str = sed.m35020q(parcel2, readInt);
                    break;
                case 4:
                    str2 = sed.m35020q(parcel2, readInt);
                    break;
                case 5:
                    str3 = sed.m35020q(parcel2, readInt);
                    break;
                case 6:
                    str4 = sed.m35020q(parcel2, readInt);
                    break;
                case 7:
                    str5 = sed.m35020q(parcel2, readInt);
                    break;
                case 8:
                    str6 = sed.m35020q(parcel2, readInt);
                    break;
                case 9:
                    b2 = sed.m35008e(parcel2, readInt);
                    break;
                case 10:
                    b3 = sed.m35008e(parcel2, readInt);
                    break;
                case 11:
                    b4 = sed.m35008e(parcel2, readInt);
                    break;
                case 12:
                    b5 = sed.m35008e(parcel2, readInt);
                    break;
                case 13:
                    str7 = sed.m35020q(parcel2, readInt);
                    break;
                default:
                    sed.m35002b(parcel2, readInt);
                    break;
            }
        }
        sed.m34994F(parcel2, b);
        return new AncsNotificationParcelable(i, str, str2, str3, str4, str5, str6, b2, b3, b4, b5, str7);
    }
}
