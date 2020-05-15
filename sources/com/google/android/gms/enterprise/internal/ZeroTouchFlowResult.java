package com.google.android.gms.enterprise.internal;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class ZeroTouchFlowResult extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new wdy();

    /* renamed from: a */
    public final int f31263a;

    /* renamed from: b */
    public final Intent f31264b;

    public ZeroTouchFlowResult(int i, Intent intent) {
        this.f31263a = i;
        this.f31264b = intent;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35063b(parcel, 1, this.f31263a);
        see.m35040a(parcel, 2, this.f31264b, i, false);
        see.m35062b(parcel, a);
    }
}
