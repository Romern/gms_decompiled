package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.wallet.CreateWalletObjectsRequest;
import com.google.android.gms.wallet.GiftCardWalletObject;
import com.google.android.gms.wallet.LoyaltyWalletObject;
import com.google.android.gms.wallet.OfferWalletObject;

/* renamed from: awan */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class awan implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new CreateWalletObjectsRequest[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = sed.m35001b(parcel);
        LoyaltyWalletObject loyaltyWalletObject = null;
        OfferWalletObject offerWalletObject = null;
        GiftCardWalletObject giftCardWalletObject = null;
        int i = 0;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = sed.m34995a(readInt);
            if (a == 2) {
                loyaltyWalletObject = (LoyaltyWalletObject) sed.m34998a(parcel, readInt, LoyaltyWalletObject.CREATOR);
            } else if (a == 3) {
                offerWalletObject = (OfferWalletObject) sed.m34998a(parcel, readInt, OfferWalletObject.CREATOR);
            } else if (a == 4) {
                giftCardWalletObject = (GiftCardWalletObject) sed.m34998a(parcel, readInt, GiftCardWalletObject.CREATOR);
            } else if (a != 5) {
                sed.m35002b(parcel, readInt);
            } else {
                i = sed.m35010g(parcel, readInt);
            }
        }
        sed.m34994F(parcel, b);
        return new CreateWalletObjectsRequest(loyaltyWalletObject, offerWalletObject, giftCardWalletObject, i);
    }
}
