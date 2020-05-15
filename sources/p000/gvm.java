package p000;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.credentials.Credential;
import com.google.android.gms.auth.api.credentials.IdToken;
import java.util.ArrayList;

/* renamed from: gvm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class gvm implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new Credential[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = sed.m35001b(parcel);
        String str = null;
        String str2 = null;
        Uri uri = null;
        ArrayList arrayList = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            switch (sed.m34995a(readInt)) {
                case 1:
                    str = sed.m35020q(parcel, readInt);
                    break;
                case 2:
                    str2 = sed.m35020q(parcel, readInt);
                    break;
                case 3:
                    uri = (Uri) sed.m34998a(parcel, readInt, Uri.CREATOR);
                    break;
                case 4:
                    arrayList = sed.m35005c(parcel, readInt, IdToken.CREATOR);
                    break;
                case 5:
                    str3 = sed.m35020q(parcel, readInt);
                    break;
                case 6:
                    str4 = sed.m35020q(parcel, readInt);
                    break;
                case 7:
                case 8:
                default:
                    sed.m35002b(parcel, readInt);
                    break;
                case 9:
                    str5 = sed.m35020q(parcel, readInt);
                    break;
                case 10:
                    str6 = sed.m35020q(parcel, readInt);
                    break;
            }
        }
        sed.m34994F(parcel, b);
        return new Credential(str, str2, uri, arrayList, str3, str4, str5, str6);
    }
}
