package p000;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.tapandpay.firstparty.OnlineAccountCardLinkInfo;
import com.google.android.gms.tapandpay.firstparty.TokenInfo;
import com.google.android.gms.tapandpay.firstparty.TokenStatus;

/* renamed from: asow */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class asow implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new TokenInfo[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = sed.m35001b(parcel);
        String str = null;
        String str2 = null;
        TokenStatus tokenStatus = null;
        String str3 = null;
        Uri uri = null;
        byte[] bArr = null;
        OnlineAccountCardLinkInfo[] onlineAccountCardLinkInfoArr = null;
        int i = 0;
        int i2 = 0;
        boolean z = false;
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
                    i = sed.m35010g(parcel, readInt);
                    break;
                case 4:
                    tokenStatus = (TokenStatus) sed.m34998a(parcel, readInt, TokenStatus.CREATOR);
                    break;
                case 5:
                    str3 = sed.m35020q(parcel, readInt);
                    break;
                case 6:
                    uri = (Uri) sed.m34998a(parcel, readInt, Uri.CREATOR);
                    break;
                case 7:
                    bArr = sed.m35023t(parcel, readInt);
                    break;
                case 8:
                    onlineAccountCardLinkInfoArr = (OnlineAccountCardLinkInfo[]) sed.m35004b(parcel, readInt, OnlineAccountCardLinkInfo.CREATOR);
                    break;
                case 9:
                    i2 = sed.m35010g(parcel, readInt);
                    break;
                case 10:
                    z = sed.m35006c(parcel, readInt);
                    break;
                default:
                    sed.m35002b(parcel, readInt);
                    break;
            }
        }
        sed.m34994F(parcel, b);
        return new TokenInfo(str, str2, i, tokenStatus, str3, uri, bArr, onlineAccountCardLinkInfoArr, i2, z);
    }
}
