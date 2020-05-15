package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.appdatasearch.RegisterCorpusIMEInfo;

/* renamed from: frx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class C0999frx implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new RegisterCorpusIMEInfo[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = sed.m35001b(parcel);
        String[] strArr = null;
        String str = null;
        String str2 = null;
        String[] strArr2 = null;
        String str3 = null;
        int i = 0;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = sed.m34995a(readInt);
            if (a == 1) {
                i = sed.m35010g(parcel, readInt);
            } else if (a == 2) {
                strArr = sed.m34989A(parcel, readInt);
            } else if (a == 3) {
                str = sed.m35020q(parcel, readInt);
            } else if (a == 4) {
                str2 = sed.m35020q(parcel, readInt);
            } else if (a == 6) {
                str3 = sed.m35020q(parcel, readInt);
            } else if (a != 7) {
                sed.m35002b(parcel, readInt);
            } else {
                strArr2 = sed.m34989A(parcel, readInt);
            }
        }
        sed.m34994F(parcel, b);
        return new RegisterCorpusIMEInfo(i, strArr, str, str2, strArr2, str3);
    }
}
