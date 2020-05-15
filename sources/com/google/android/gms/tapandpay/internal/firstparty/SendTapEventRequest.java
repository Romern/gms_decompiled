package com.google.android.gms.tapandpay.internal.firstparty;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.tapandpay.firstparty.TapEvent;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class SendTapEventRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new asyp();

    /* renamed from: a */
    public final TapEvent f108551a;

    public SendTapEventRequest(TapEvent tapEvent) {
        this.f108551a = tapEvent;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35040a(parcel, 2, this.f108551a, i, false);
        see.m35062b(parcel, a);
    }
}
