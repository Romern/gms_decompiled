package com.google.android.gms.tapandpay.internal.firstparty;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class GetReceivesTransactionNotificationsRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new asyg();

    /* renamed from: a */
    public final boolean f108543a;

    public GetReceivesTransactionNotificationsRequest() {
        this(false);
    }

    public GetReceivesTransactionNotificationsRequest(boolean z) {
        this.f108543a = z;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35051a(parcel, 2, this.f108543a);
        see.m35062b(parcel, a);
    }
}
