package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.BrowserResolutionCookie;

/* renamed from: ghw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ghw implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new BrowserResolutionCookie[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int b = sed.m35001b(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = "/";
        long j = -1;
        boolean z = false;
        boolean z2 = false;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            switch (sed.m34995a(readInt)) {
                case 1:
                    str = sed.m35020q(parcel2, readInt);
                    break;
                case 2:
                    str2 = sed.m35020q(parcel2, readInt);
                    break;
                case 3:
                    str3 = sed.m35020q(parcel2, readInt);
                    break;
                case 4:
                    str4 = sed.m35020q(parcel2, readInt);
                    break;
                case 5:
                    j = sed.m35012i(parcel2, readInt);
                    break;
                case 6:
                    z = sed.m35006c(parcel2, readInt);
                    break;
                case 7:
                    z2 = sed.m35006c(parcel2, readInt);
                    break;
                default:
                    sed.m35002b(parcel2, readInt);
                    break;
            }
        }
        sed.m34994F(parcel2, b);
        return new BrowserResolutionCookie(str, str2, str3, str4, j, z, z2);
    }
}
