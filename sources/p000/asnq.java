package p000;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;
import com.google.android.gms.tapandpay.firstparty.AccountInfo;
import com.google.android.gms.tapandpay.firstparty.CardInfo;
import com.google.android.gms.tapandpay.firstparty.GetAllCardsResponse;

/* renamed from: asnq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class asnq implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new GetAllCardsResponse[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = sed.m35001b(parcel);
        CardInfo[] cardInfoArr = null;
        AccountInfo accountInfo = null;
        String str = null;
        String str2 = null;
        SparseArray sparseArray = null;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = sed.m34995a(readInt);
            if (a == 2) {
                cardInfoArr = (CardInfo[]) sed.m35004b(parcel, readInt, CardInfo.CREATOR);
            } else if (a == 3) {
                accountInfo = (AccountInfo) sed.m34998a(parcel, readInt, AccountInfo.CREATOR);
            } else if (a == 4) {
                str = sed.m35020q(parcel, readInt);
            } else if (a == 5) {
                str2 = sed.m35020q(parcel, readInt);
            } else if (a != 6) {
                sed.m35002b(parcel, readInt);
            } else {
                int a2 = sed.m34997a(parcel, readInt);
                int dataPosition = parcel.dataPosition();
                if (a2 != 0) {
                    SparseArray sparseArray2 = new SparseArray();
                    int readInt2 = parcel.readInt();
                    for (int i = 0; i < readInt2; i++) {
                        sparseArray2.append(parcel.readInt(), parcel.readString());
                    }
                    parcel.setDataPosition(dataPosition + a2);
                    sparseArray = sparseArray2;
                } else {
                    sparseArray = null;
                }
            }
        }
        sed.m34994F(parcel, b);
        return new GetAllCardsResponse(cardInfoArr, accountInfo, str, str2, sparseArray);
    }
}
