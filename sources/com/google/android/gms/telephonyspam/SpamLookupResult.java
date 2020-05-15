package com.google.android.gms.telephonyspam;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class SpamLookupResult extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new audd();

    /* renamed from: a */
    public final int f109036a;

    /* renamed from: b */
    public final int f109037b;

    /* renamed from: c */
    public final int f109038c;

    /* renamed from: d */
    public final int f109039d;

    /* renamed from: e */
    public final int f109040e;

    /* renamed from: f */
    public final int f109041f;

    public SpamLookupResult(int i, int i2) {
        this.f109036a = 2;
        this.f109037b = 1;
        this.f109038c = 5;
        this.f109039d = i;
        this.f109040e = i2;
        this.f109041f = 0;
    }

    public SpamLookupResult(int i, int i2, int i3, int i4, int i5) {
        this.f109036a = 2;
        this.f109037b = i;
        this.f109038c = i2;
        this.f109039d = i3;
        this.f109040e = i4;
        this.f109041f = i5;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35063b(parcel, 1, this.f109036a);
        see.m35063b(parcel, 2, this.f109037b);
        see.m35063b(parcel, 3, this.f109038c);
        see.m35063b(parcel, 4, this.f109039d);
        see.m35063b(parcel, 5, this.f109040e);
        see.m35063b(parcel, 6, this.f109041f);
        see.m35062b(parcel, a);
    }

    public SpamLookupResult(int i, int i2, int i3, int i4, int i5, int i6) {
        this.f109036a = i;
        this.f109037b = i2;
        this.f109038c = i3;
        this.f109039d = i4;
        this.f109040e = i5;
        this.f109041f = i6;
    }
}
