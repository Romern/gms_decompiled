package com.google.android.gms.family.p042v2.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;

/* renamed from: com.google.android.gms.family.v2.model.UpgradeParams */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class UpgradeParams implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new wqw();

    /* renamed from: a */
    public BillingSignupData f31466a;

    public UpgradeParams(Parcel parcel) {
        this.f31466a = (BillingSignupData) parcel.readParcelable(BillingSignupData.class.getClassLoader());
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f31466a, i);
    }

    public UpgradeParams(brdg brdg) {
        this.f31466a = new BillingSignupData(brdg.f142510b, brdg.f142511c);
    }
}
