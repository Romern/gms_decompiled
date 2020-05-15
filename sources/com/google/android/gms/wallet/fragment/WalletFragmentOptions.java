package com.google.android.gms.wallet.fragment;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class WalletFragmentOptions extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new awmb();

    /* renamed from: a */
    public int f110195a;

    /* renamed from: b */
    public int f110196b;

    /* renamed from: c */
    public WalletFragmentStyle f110197c;

    /* renamed from: d */
    public int f110198d;

    private WalletFragmentOptions() {
        this.f110195a = 3;
        this.f110197c = new WalletFragmentStyle();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35063b(parcel, 2, this.f110195a);
        see.m35063b(parcel, 3, this.f110196b);
        see.m35040a(parcel, 4, this.f110197c, i, false);
        see.m35063b(parcel, 5, this.f110198d);
        see.m35062b(parcel, a);
    }

    public WalletFragmentOptions(int i, int i2, WalletFragmentStyle walletFragmentStyle, int i3) {
        this.f110195a = i;
        this.f110196b = i2;
        this.f110197c = walletFragmentStyle;
        this.f110198d = i3;
    }
}
