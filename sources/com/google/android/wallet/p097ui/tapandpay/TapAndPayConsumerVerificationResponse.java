package com.google.android.wallet.p097ui.tapandpay;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.wallet.common.moduleapicalltasks.ModuleApiCallTaskLoaderResponse;

/* renamed from: com.google.android.wallet.ui.tapandpay.TapAndPayConsumerVerificationResponse */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class TapAndPayConsumerVerificationResponse extends ModuleApiCallTaskLoaderResponse {
    public static final Parcelable.Creator CREATOR = new bkjn();

    /* renamed from: a */
    public final bwey f152323a;

    /* renamed from: b */
    public final int f152324b;

    public TapAndPayConsumerVerificationResponse(bwey bwey, int i) {
        this.f152323a = bwey;
        this.f152324b = i;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        bjvp.m104738a(this.f152323a, parcel);
        parcel.writeInt(this.f152324b);
    }
}
