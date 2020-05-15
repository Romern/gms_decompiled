package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.BrowserResolutionCookie;
import com.google.android.gms.auth.ResolutionData;

/* renamed from: gio */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class gio implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new ResolutionData[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = sed.m35001b(parcel);
        String str = null;
        String str2 = null;
        BrowserResolutionCookie[] browserResolutionCookieArr = null;
        int i = 0;
        int i2 = 0;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = sed.m34995a(readInt);
            if (a == 1) {
                i = sed.m35010g(parcel, readInt);
            } else if (a == 2) {
                str = sed.m35020q(parcel, readInt);
            } else if (a == 3) {
                i2 = sed.m35010g(parcel, readInt);
            } else if (a == 4) {
                str2 = sed.m35020q(parcel, readInt);
            } else if (a != 5) {
                sed.m35002b(parcel, readInt);
            } else {
                browserResolutionCookieArr = (BrowserResolutionCookie[]) sed.m35004b(parcel, readInt, BrowserResolutionCookie.CREATOR);
            }
        }
        sed.m34994F(parcel, b);
        return new ResolutionData(i, str, i2, str2, browserResolutionCookieArr);
    }
}
