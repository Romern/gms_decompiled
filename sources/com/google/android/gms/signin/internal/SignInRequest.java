package com.google.android.gms.signin.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ResolveAccountRequest;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class SignInRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new aqok();

    /* renamed from: a */
    final int f107708a;

    /* renamed from: b */
    public final ResolveAccountRequest f107709b;

    public SignInRequest(int i, ResolveAccountRequest resolveAccountRequest) {
        this.f107708a = i;
        this.f107709b = resolveAccountRequest;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35063b(parcel, 1, this.f107708a);
        see.m35040a(parcel, 2, this.f107709b, i, false);
        see.m35062b(parcel, a);
    }
}
