package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class SignInButtonConfig extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new sdw();

    /* renamed from: a */
    final int f30249a;

    /* renamed from: b */
    public final int f30250b;

    /* renamed from: c */
    public final int f30251c;
    @Deprecated

    /* renamed from: d */
    public final Scope[] f30252d;

    public SignInButtonConfig(int i, int i2, int i3, Scope[] scopeArr) {
        this.f30249a = i;
        this.f30250b = i2;
        this.f30251c = i3;
        this.f30252d = scopeArr;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35063b(parcel, 1, this.f30249a);
        see.m35063b(parcel, 2, this.f30250b);
        see.m35063b(parcel, 3, this.f30251c);
        see.m35057a(parcel, 4, this.f30252d, i);
        see.m35062b(parcel, a);
    }
}
