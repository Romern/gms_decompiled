package com.google.android.gms.wallet.service.orchestration;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.payse.SecureElementStoredValue;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class FetchPaySeCardsResponse implements Parcelable, awyg {
    public static final Parcelable.Creator CREATOR = new awtr();

    /* renamed from: a */
    public final SecureElementStoredValue[] f110385a;

    public FetchPaySeCardsResponse(SecureElementStoredValue[] secureElementStoredValueArr) {
        this.f110385a = secureElementStoredValueArr;
    }

    /* renamed from: a */
    public final boolean mo52756a() {
        return false;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int length = this.f110385a.length;
        parcel.writeInt(length);
        for (int i2 = 0; i2 < length; i2++) {
            alkd.m61182a(this.f110385a[i2], parcel);
        }
    }
}
