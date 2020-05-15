package com.google.android.gms.people.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class AccountMetadata extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new amet();

    /* renamed from: a */
    public boolean f81935a;

    /* renamed from: b */
    public boolean f81936b;

    /* renamed from: c */
    public boolean f81937c;

    /* renamed from: d */
    public boolean f81938d;

    public AccountMetadata() {
    }

    public AccountMetadata(boolean z, boolean z2, boolean z3, boolean z4) {
        this.f81935a = z;
        this.f81936b = z2;
        this.f81937c = z3;
        this.f81938d = z4;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35051a(parcel, 2, this.f81935a);
        see.m35051a(parcel, 3, this.f81936b);
        see.m35051a(parcel, 4, this.f81937c);
        see.m35051a(parcel, 5, this.f81938d);
        see.m35062b(parcel, a);
    }
}
