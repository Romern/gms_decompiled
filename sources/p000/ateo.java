package p000;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.tapandpay.quickaccesswallet.QuickAccessWalletCard;
import com.google.android.gms.tapandpay.quickaccesswallet.SetQuickAccessWalletCardsRequest;

/* renamed from: ateo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ateo implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new SetQuickAccessWalletCardsRequest[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = sed.m35001b(parcel);
        Account account = null;
        QuickAccessWalletCard[] quickAccessWalletCardArr = null;
        int i = 0;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = sed.m34995a(readInt);
            if (a == 1) {
                i = sed.m35010g(parcel, readInt);
            } else if (a == 2) {
                account = (Account) sed.m34998a(parcel, readInt, Account.CREATOR);
            } else if (a != 3) {
                sed.m35002b(parcel, readInt);
            } else {
                quickAccessWalletCardArr = (QuickAccessWalletCard[]) sed.m35004b(parcel, readInt, QuickAccessWalletCard.CREATOR);
            }
        }
        sed.m34994F(parcel, b);
        return new SetQuickAccessWalletCardsRequest(i, account, quickAccessWalletCardArr);
    }
}
