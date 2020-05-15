package p000;

import android.graphics.Bitmap;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.tapandpay.quickaccesswallet.CardIconMessage;
import com.google.android.gms.tapandpay.quickaccesswallet.QuickAccessWalletCard;
import com.google.android.gms.tapandpay.quickaccesswallet.WalletCardIntent;

/* renamed from: ateh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ateh implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new QuickAccessWalletCard[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = sed.m35001b(parcel);
        long j = 0;
        long j2 = 0;
        String str = null;
        Bitmap bitmap = null;
        String str2 = null;
        WalletCardIntent[] walletCardIntentArr = null;
        CardIconMessage[] cardIconMessageArr = null;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            switch (sed.m34995a(readInt)) {
                case 1:
                    str = sed.m35020q(parcel, readInt);
                    break;
                case 2:
                    bitmap = (Bitmap) sed.m34998a(parcel, readInt, Bitmap.CREATOR);
                    break;
                case 3:
                    str2 = sed.m35020q(parcel, readInt);
                    break;
                case 4:
                    walletCardIntentArr = (WalletCardIntent[]) sed.m35004b(parcel, readInt, WalletCardIntent.CREATOR);
                    break;
                case 5:
                    cardIconMessageArr = (CardIconMessage[]) sed.m35004b(parcel, readInt, CardIconMessage.CREATOR);
                    break;
                case 6:
                    j = sed.m35012i(parcel, readInt);
                    break;
                case 7:
                    j2 = sed.m35012i(parcel, readInt);
                    break;
                default:
                    sed.m35002b(parcel, readInt);
                    break;
            }
        }
        sed.m34994F(parcel, b);
        return new QuickAccessWalletCard(str, bitmap, str2, walletCardIntentArr, cardIconMessageArr, j, j2);
    }
}
