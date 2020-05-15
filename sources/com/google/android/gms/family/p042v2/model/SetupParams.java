package com.google.android.gms.family.p042v2.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;

/* renamed from: com.google.android.gms.family.v2.model.SetupParams */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class SetupParams implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new wqv();

    /* renamed from: a */
    public BillingSignupData f31464a;

    /* renamed from: b */
    public String f31465b;

    public SetupParams(Parcel parcel) {
        this.f31464a = (BillingSignupData) parcel.readParcelable(BillingSignupData.class.getClassLoader());
        this.f31465b = parcel.readString();
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f31464a, i);
        parcel.writeString(this.f31465b);
    }

    public SetupParams(brde brde) {
        this.f31464a = new BillingSignupData(brde.f142496b, brde.f142497c);
        this.f31465b = brde.f142498d;
    }
}
