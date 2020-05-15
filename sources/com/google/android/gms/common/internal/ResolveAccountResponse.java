package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class ResolveAccountResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new sdr();

    /* renamed from: a */
    final int f30243a;

    /* renamed from: b */
    public IBinder f30244b;

    /* renamed from: c */
    public ConnectionResult f30245c;

    /* renamed from: d */
    public boolean f30246d;

    /* renamed from: e */
    public boolean f30247e;

    public ResolveAccountResponse(int i) {
        this(new ConnectionResult(i, null));
    }

    /* renamed from: a */
    public final scb mo17826a() {
        IBinder iBinder = this.f30244b;
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
        if (queryLocalInterface instanceof scb) {
            return (scb) queryLocalInterface;
        }
        return new sbz(iBinder);
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof ResolveAccountResponse) {
            ResolveAccountResponse resolveAccountResponse = (ResolveAccountResponse) obj;
            return this.f30245c.equals(resolveAccountResponse.f30245c) && sdg.m34949a(mo17826a(), resolveAccountResponse.mo17826a());
        }
    }

    public ResolveAccountResponse(int i, IBinder iBinder, ConnectionResult connectionResult, boolean z, boolean z2) {
        this.f30243a = i;
        this.f30244b = iBinder;
        this.f30245c = connectionResult;
        this.f30246d = z;
        this.f30247e = z2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35063b(parcel, 1, this.f30243a);
        see.m35038a(parcel, 2, this.f30244b);
        see.m35040a(parcel, 3, this.f30245c, i, false);
        see.m35051a(parcel, 4, this.f30246d);
        see.m35051a(parcel, 5, this.f30247e);
        see.m35062b(parcel, a);
    }

    public ResolveAccountResponse(ConnectionResult connectionResult) {
        this(1, null, connectionResult, false, false);
    }
}
