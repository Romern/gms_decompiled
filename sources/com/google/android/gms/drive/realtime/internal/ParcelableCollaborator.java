package com.google.android.gms.drive.realtime.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class ParcelableCollaborator extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new vjy();

    /* renamed from: a */
    final boolean f31136a;

    /* renamed from: b */
    final boolean f31137b;

    /* renamed from: c */
    final String f31138c;

    /* renamed from: d */
    final String f31139d;

    /* renamed from: e */
    final String f31140e;

    /* renamed from: f */
    final String f31141f;

    /* renamed from: g */
    final String f31142g;

    public ParcelableCollaborator(boolean z, boolean z2, String str, String str2, String str3, String str4, String str5) {
        this.f31136a = z;
        this.f31137b = z2;
        this.f31138c = str;
        this.f31139d = str2;
        this.f31140e = str3;
        this.f31141f = str4;
        this.f31142g = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || obj.getClass() != getClass()) {
            return false;
        }
        return this.f31138c.equals(((ParcelableCollaborator) obj).f31138c);
    }

    public final int hashCode() {
        return this.f31138c.hashCode();
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
        see.m35051a(parcel, 2, this.f31136a);
        see.m35051a(parcel, 3, this.f31137b);
        see.m35046a(parcel, 4, this.f31138c, false);
        see.m35046a(parcel, 5, this.f31139d, false);
        see.m35046a(parcel, 6, this.f31140e, false);
        see.m35046a(parcel, 7, this.f31141f, false);
        see.m35046a(parcel, 8, this.f31142g, false);
        see.m35062b(parcel, a);
    }
}
