package com.google.android.gms.chimera.debug.items;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class ModuleItem extends AbstractSafeParcelable implements ReflectedParcelable, Comparable {
    public static final Parcelable.Creator CREATOR = new qpm();

    /* renamed from: a */
    public final int f29995a;

    /* renamed from: b */
    public final String f29996b;

    /* renamed from: c */
    public final int f29997c;

    /* renamed from: d */
    public final String f29998d;

    /* renamed from: e */
    public final int f29999e;

    /* renamed from: f */
    public final long f30000f;

    /* renamed from: g */
    public final String f30001g;

    /* renamed from: h */
    public final int f30002h;

    /* renamed from: i */
    public boolean f30003i;

    public ModuleItem(int i, String str, int i2, String str2, int i3, long j, String str3, int i4, boolean z) {
        this.f29995a = i;
        this.f29996b = str;
        this.f29997c = i2;
        this.f29998d = str2;
        this.f29999e = i3;
        this.f30000f = j;
        this.f30001g = str3;
        this.f30002h = i4;
        this.f30003i = z;
    }

    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return this.f29996b.compareTo(((ModuleItem) obj).f29996b);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: see.a(android.os.Parcel, int, java.lang.String, boolean):void
     arg types: [android.os.Parcel, int, java.lang.String, int]
     candidates:
      see.a(android.os.Parcel, int, android.os.Bundle, boolean):void
      see.a(android.os.Parcel, int, android.os.Parcel, boolean):void
      see.a(android.os.Parcel, int, java.math.BigDecimal, boolean):void
      see.a(android.os.Parcel, int, java.util.List, boolean):void
      see.a(android.os.Parcel, int, byte[], boolean):void
      see.a(android.os.Parcel, int, double[], boolean):void
      see.a(android.os.Parcel, int, float[], boolean):void
      see.a(android.os.Parcel, int, int[], boolean):void
      see.a(android.os.Parcel, int, long[], boolean):void
      see.a(android.os.Parcel, int, android.os.Parcelable[], int):void
      see.a(android.os.Parcel, int, java.lang.String[], boolean):void
      see.a(android.os.Parcel, int, boolean[], boolean):void
      see.a(android.os.Parcel, int, java.lang.String, boolean):void */
    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35063b(parcel, 1, this.f29995a);
        see.m35046a(parcel, 2, this.f29996b, false);
        see.m35063b(parcel, 3, this.f29997c);
        see.m35046a(parcel, 4, this.f29998d, false);
        see.m35063b(parcel, 5, this.f29999e);
        see.m35036a(parcel, 6, this.f30000f);
        see.m35046a(parcel, 7, this.f30001g, false);
        see.m35063b(parcel, 8, this.f30002h);
        see.m35051a(parcel, 9, this.f30003i);
        see.m35062b(parcel, a);
    }
}
