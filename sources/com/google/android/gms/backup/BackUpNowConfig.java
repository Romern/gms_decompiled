package com.google.android.gms.backup;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class BackUpNowConfig extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new lsk();

    /* renamed from: a */
    public final boolean f28978a;

    /* renamed from: b */
    public final boolean f28979b;

    /* renamed from: c */
    public final boolean f28980c;

    /* renamed from: d */
    public final boolean f28981d;

    /* renamed from: e */
    public final boolean f28982e;

    /* renamed from: f */
    public final boolean f28983f;

    public BackUpNowConfig(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        this.f28978a = z;
        this.f28979b = z2;
        this.f28980c = z3;
        this.f28981d = z4;
        this.f28982e = z5;
        this.f28983f = z6;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35051a(parcel, 1, this.f28978a);
        see.m35051a(parcel, 2, this.f28979b);
        see.m35051a(parcel, 3, this.f28980c);
        see.m35051a(parcel, 4, this.f28981d);
        see.m35051a(parcel, 5, this.f28982e);
        see.m35051a(parcel, 6, this.f28983f);
        see.m35062b(parcel, a);
    }
}
