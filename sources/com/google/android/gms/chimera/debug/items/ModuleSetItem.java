package com.google.android.gms.chimera.debug.items;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class ModuleSetItem extends AbstractSafeParcelable implements ReflectedParcelable, Comparable {
    public static final Parcelable.Creator CREATOR = new qpn();

    /* renamed from: a */
    public final int f30004a;

    /* renamed from: b */
    public final String f30005b;

    /* renamed from: c */
    public final Long f30006c;

    /* renamed from: d */
    public final String f30007d;

    /* renamed from: e */
    public final boolean f30008e;

    /* renamed from: f */
    public final boolean f30009f;

    public ModuleSetItem(int i, String str, Long l, String str2, boolean z, boolean z2) {
        this.f30004a = i;
        this.f30005b = str;
        this.f30006c = l;
        this.f30007d = str2;
        this.f30008e = z;
        this.f30009f = z2;
    }

    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        ModuleSetItem moduleSetItem = (ModuleSetItem) obj;
        return bneu.f131545b.mo67473a(this.f30005b, moduleSetItem.f30005b).mo67473a(this.f30006c, moduleSetItem.f30006c).mo67470a();
    }

    public ModuleSetItem(String str, Long l, String str2, boolean z, boolean z2) {
        this(1, str, l, str2, z, z2);
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
        see.m35063b(parcel, 1, this.f30004a);
        see.m35046a(parcel, 2, this.f30005b, false);
        see.m35045a(parcel, 3, this.f30006c);
        see.m35046a(parcel, 4, this.f30007d, false);
        see.m35051a(parcel, 5, this.f30008e);
        see.m35051a(parcel, 6, this.f30009f);
        see.m35062b(parcel, a);
    }
}
