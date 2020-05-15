package com.google.android.gms.gass.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.ads.afma.proto2api.C0152c;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class GassResponseParcel extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new aahv();

    /* renamed from: a */
    public final int f32757a;

    /* renamed from: b */
    public C0152c f32758b;

    /* renamed from: c */
    public byte[] f32759c;

    public GassResponseParcel(int i, byte[] bArr) {
        this.f32757a = i;
        this.f32758b = null;
        this.f32759c = bArr;
        mo19548a();
    }

    /* renamed from: a */
    public final void mo19548a() {
        C0152c cVar = this.f32758b;
        if (cVar == null && this.f32759c != null) {
            return;
        }
        if (cVar != null && this.f32759c == null) {
            return;
        }
        if (cVar != null && this.f32759c != null) {
            throw new IllegalStateException("Invalid internal representation - full");
        } else if (cVar == null && this.f32759c == null) {
            throw new IllegalStateException("Invalid internal representation - empty");
        } else {
            throw new IllegalStateException("Impossible");
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: see.a(android.os.Parcel, int, byte[], boolean):void
     arg types: [android.os.Parcel, int, byte[], int]
     candidates:
      see.a(android.os.Parcel, int, android.os.Bundle, boolean):void
      see.a(android.os.Parcel, int, android.os.Parcel, boolean):void
      see.a(android.os.Parcel, int, java.lang.String, boolean):void
      see.a(android.os.Parcel, int, java.math.BigDecimal, boolean):void
      see.a(android.os.Parcel, int, java.util.List, boolean):void
      see.a(android.os.Parcel, int, double[], boolean):void
      see.a(android.os.Parcel, int, float[], boolean):void
      see.a(android.os.Parcel, int, int[], boolean):void
      see.a(android.os.Parcel, int, long[], boolean):void
      see.a(android.os.Parcel, int, android.os.Parcelable[], int):void
      see.a(android.os.Parcel, int, java.lang.String[], boolean):void
      see.a(android.os.Parcel, int, boolean[], boolean):void
      see.a(android.os.Parcel, int, byte[], boolean):void */
    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35063b(parcel, 1, this.f32757a);
        byte[] bArr = this.f32759c;
        if (bArr == null) {
            bArr = this.f32758b.mo73642k();
        }
        see.m35052a(parcel, 2, bArr, false);
        see.m35062b(parcel, a);
    }

    public GassResponseParcel(C0152c cVar) {
        this.f32757a = 1;
        sdo.m34959a(cVar);
        this.f32758b = cVar;
        this.f32759c = null;
        mo19548a();
    }
}
