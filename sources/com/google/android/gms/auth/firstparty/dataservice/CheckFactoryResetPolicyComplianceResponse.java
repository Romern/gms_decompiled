package com.google.android.gms.auth.firstparty.dataservice;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class CheckFactoryResetPolicyComplianceResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new iwj();

    /* renamed from: a */
    final int f10599a;
    @Deprecated

    /* renamed from: b */
    public final boolean f10600b;

    /* renamed from: c */
    public final int f10601c;

    public CheckFactoryResetPolicyComplianceResponse(int i, int i2) {
        this.f10599a = i;
        this.f10600b = i2 != 1 ? false : true;
        this.f10601c = i2;
    }

    /* renamed from: a */
    public static CheckFactoryResetPolicyComplianceResponse m6564a(int i) {
        return new CheckFactoryResetPolicyComplianceResponse(2, i);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35063b(parcel, 1, this.f10599a);
        see.m35063b(parcel, 3, this.f10601c);
        see.m35062b(parcel, a);
    }
}
