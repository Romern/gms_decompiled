package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.tapandpay.firstparty.CardInfo;
import com.google.android.gms.tapandpay.firstparty.GetActiveCardsForAccountResponse;

/* renamed from: asno */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class asno implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new GetActiveCardsForAccountResponse[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = sed.m35001b(parcel);
        CardInfo[] cardInfoArr = null;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            if (sed.m34995a(readInt) != 2) {
                sed.m35002b(parcel, readInt);
            } else {
                cardInfoArr = (CardInfo[]) sed.m35004b(parcel, readInt, CardInfo.CREATOR);
            }
        }
        sed.m34994F(parcel, b);
        return new GetActiveCardsForAccountResponse(cardInfoArr);
    }
}
