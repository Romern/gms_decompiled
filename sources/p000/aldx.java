package p000;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.pay.GetPayCardArtRequest;
import com.google.android.gms.pay.PayCardArtInfo;

/* renamed from: aldx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aldx implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new GetPayCardArtRequest[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = sed.m35001b(parcel);
        Account account = null;
        PayCardArtInfo[] payCardArtInfoArr = null;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = sed.m34995a(readInt);
            if (a == 1) {
                account = (Account) sed.m34998a(parcel, readInt, Account.CREATOR);
            } else if (a != 2) {
                sed.m35002b(parcel, readInt);
            } else {
                payCardArtInfoArr = (PayCardArtInfo[]) sed.m35004b(parcel, readInt, PayCardArtInfo.CREATOR);
            }
        }
        sed.m34994F(parcel, b);
        return new GetPayCardArtRequest(account, payCardArtInfoArr);
    }
}
