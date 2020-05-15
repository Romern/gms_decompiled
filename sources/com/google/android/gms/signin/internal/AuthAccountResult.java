package com.google.android.gms.signin.internal;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class AuthAccountResult extends AbstractSafeParcelable implements rkk {
    public static final Parcelable.Creator CREATOR = new aqny();

    /* renamed from: a */
    final int f107695a;

    /* renamed from: b */
    public int f107696b;

    /* renamed from: c */
    public Intent f107697c;

    public AuthAccountResult() {
        this(0, null);
    }

    /* renamed from: bo */
    public final Status mo7183bo() {
        if (this.f107696b == 0) {
            return Status.f30107a;
        }
        return Status.f30111e;
    }

    public AuthAccountResult(int i, int i2, Intent intent) {
        this.f107695a = i;
        this.f107696b = i2;
        this.f107697c = intent;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35063b(parcel, 1, this.f107695a);
        see.m35063b(parcel, 2, this.f107696b);
        see.m35040a(parcel, 3, this.f107697c, i, false);
        see.m35062b(parcel, a);
    }

    public AuthAccountResult(int i, Intent intent) {
        this(2, i, intent);
    }
}
