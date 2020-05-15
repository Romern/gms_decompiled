package com.google.android.gms.family.p042v2.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;

/* renamed from: com.google.android.gms.family.v2.model.BillingSignupData */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class BillingSignupData implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new wqk();

    /* renamed from: a */
    public String f31425a;

    /* renamed from: b */
    public String f31426b;

    public BillingSignupData(Parcel parcel) {
        this.f31425a = parcel.readString();
        this.f31426b = parcel.readString();
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f31425a);
        parcel.writeString(this.f31426b);
    }

    public BillingSignupData(String str, String str2) {
        this.f31425a = str;
        this.f31426b = str2;
    }
}
