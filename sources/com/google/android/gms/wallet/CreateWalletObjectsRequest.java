package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class CreateWalletObjectsRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new awan();

    /* renamed from: a */
    public LoyaltyWalletObject f109780a;

    /* renamed from: b */
    public OfferWalletObject f109781b;

    /* renamed from: c */
    public GiftCardWalletObject f109782c;

    /* renamed from: d */
    public int f109783d;

    CreateWalletObjectsRequest() {
    }

    public CreateWalletObjectsRequest(LoyaltyWalletObject loyaltyWalletObject, OfferWalletObject offerWalletObject, GiftCardWalletObject giftCardWalletObject, int i) {
        this.f109780a = loyaltyWalletObject;
        this.f109781b = offerWalletObject;
        this.f109782c = giftCardWalletObject;
        this.f109783d = i;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35040a(parcel, 2, this.f109780a, i, false);
        see.m35040a(parcel, 3, this.f109781b, i, false);
        see.m35040a(parcel, 4, this.f109782c, i, false);
        see.m35063b(parcel, 5, this.f109783d);
        see.m35062b(parcel, a);
    }
}
