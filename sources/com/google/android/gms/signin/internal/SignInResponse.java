package com.google.android.gms.signin.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.ResolveAccountResponse;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class SignInResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new aqol();

    /* renamed from: a */
    final int f107710a;

    /* renamed from: b */
    public final ConnectionResult f107711b;

    /* renamed from: c */
    public final ResolveAccountResponse f107712c;

    public SignInResponse() {
        this(new ConnectionResult(8, null), null);
    }

    public SignInResponse(int i, ConnectionResult connectionResult, ResolveAccountResponse resolveAccountResponse) {
        this.f107710a = i;
        this.f107711b = connectionResult;
        this.f107712c = resolveAccountResponse;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35063b(parcel, 1, this.f107710a);
        see.m35040a(parcel, 2, this.f107711b, i, false);
        see.m35040a(parcel, 3, this.f107712c, i, false);
        see.m35062b(parcel, a);
    }

    public SignInResponse(ConnectionResult connectionResult, ResolveAccountResponse resolveAccountResponse) {
        this(1, connectionResult, resolveAccountResponse);
    }
}
