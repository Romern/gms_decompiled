package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.googlehelp.GoogleHelp;
import com.google.android.gms.googlehelp.InProductHelp;

/* renamed from: aark */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aark implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new InProductHelp[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = sed.m35001b(parcel);
        GoogleHelp googleHelp = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        int i = 0;
        int i2 = 0;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            switch (sed.m34995a(readInt)) {
                case 1:
                    googleHelp = (GoogleHelp) sed.m34998a(parcel, readInt, GoogleHelp.CREATOR);
                    break;
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
                default:
                    sed.m35002b(parcel, readInt);
                    break;
            }
        }
        sed.m34994F(parcel, b);
        return new InProductHelp(googleHelp, str, str2, i, str3, i2);
    }
}
