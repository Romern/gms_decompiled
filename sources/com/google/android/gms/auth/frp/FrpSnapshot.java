package com.google.android.gms.auth.frp;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class FrpSnapshot extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new jdu();

    /* renamed from: a */
    final int f10947a;

    /* renamed from: b */
    public final boolean f10948b;

    /* renamed from: c */
    public final boolean f10949c;

    /* renamed from: d */
    public final boolean f10950d;

    /* renamed from: e */
    public final PersistentDeviceOwnerState f10951e;

    /* renamed from: f */
    public final boolean f10952f;

    public FrpSnapshot(int i, boolean z, boolean z2, boolean z3, PersistentDeviceOwnerState persistentDeviceOwnerState, boolean z4) {
        this.f10947a = i;
        this.f10948b = z;
        this.f10949c = z2;
        this.f10950d = z3;
        this.f10951e = persistentDeviceOwnerState;
        this.f10952f = z4;
    }

    /* renamed from: a */
    public static FrpSnapshot m6645a() {
        return new FrpSnapshot(false, false, false);
    }

    /* renamed from: b */
    public static FrpSnapshot m6646b() {
        return new FrpSnapshot(true, false, false);
    }

    public FrpSnapshot(boolean z, boolean z2, boolean z3) {
        this(1, z, z2, z3, null, false);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35063b(parcel, 1, this.f10947a);
        see.m35051a(parcel, 2, this.f10948b);
        see.m35051a(parcel, 3, this.f10949c);
        see.m35051a(parcel, 4, this.f10950d);
        see.m35040a(parcel, 5, this.f10951e, i, false);
        see.m35051a(parcel, 6, this.f10952f);
        see.m35062b(parcel, a);
    }
}
