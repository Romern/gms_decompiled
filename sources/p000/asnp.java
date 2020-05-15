package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.tapandpay.firstparty.GetActiveTokensForAccountResponse;
import com.google.android.gms.tapandpay.firstparty.TokenInfo;

/* renamed from: asnp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class asnp implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new GetActiveTokensForAccountResponse[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = sed.m35001b(parcel);
        TokenInfo[] tokenInfoArr = null;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            if (sed.m34995a(readInt) != 1) {
                sed.m35002b(parcel, readInt);
            } else {
                tokenInfoArr = (TokenInfo[]) sed.m35004b(parcel, readInt, TokenInfo.CREATOR);
            }
        }
        sed.m34994F(parcel, b);
        return new GetActiveTokensForAccountResponse(tokenInfoArr);
    }
}
