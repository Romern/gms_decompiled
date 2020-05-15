package p000;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Scope;
import java.util.ArrayList;

/* renamed from: ice */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ice implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new GoogleSignInAccount[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int b = sed.m35001b(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        Uri uri = null;
        String str5 = null;
        String str6 = null;
        ArrayList arrayList = null;
        String str7 = null;
        String str8 = null;
        long j = 0;
        int i = 0;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            switch (sed.m34995a(readInt)) {
                case 1:
                    i = sed.m35010g(parcel2, readInt);
                    break;
                case 2:
                    str = sed.m35020q(parcel2, readInt);
                    break;
                case 3:
                    str2 = sed.m35020q(parcel2, readInt);
                    break;
                case 4:
                    str3 = sed.m35020q(parcel2, readInt);
                    break;
                case 5:
                    str4 = sed.m35020q(parcel2, readInt);
                    break;
                case 6:
                    uri = (Uri) sed.m34998a(parcel2, readInt, Uri.CREATOR);
                    break;
                case 7:
                    str5 = sed.m35020q(parcel2, readInt);
                    break;
                case 8:
                    j = sed.m35012i(parcel2, readInt);
                    break;
                case 9:
                    str6 = sed.m35020q(parcel2, readInt);
                    break;
                case 10:
                    arrayList = sed.m35005c(parcel2, readInt, Scope.CREATOR);
                    break;
                case 11:
                    str7 = sed.m35020q(parcel2, readInt);
                    break;
                case 12:
                    str8 = sed.m35020q(parcel2, readInt);
                    break;
                default:
                    sed.m35002b(parcel2, readInt);
                    break;
            }
        }
        sed.m34994F(parcel2, b);
        return new GoogleSignInAccount(i, str, str2, str3, str4, uri, str5, j, str6, arrayList, str7, str8);
    }
}
