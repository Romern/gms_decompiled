package com.google.android.gms.tapandpay.internal.firstparty;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class FirstPartyTokenizePanRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new asxy();

    /* renamed from: a */
    public String f108527a;

    /* renamed from: b */
    public boolean f108528b;

    /* renamed from: c */
    public String f108529c;

    /* renamed from: d */
    public byte[] f108530d;

    /* renamed from: e */
    public boolean f108531e;

    /* renamed from: f */
    public String f108532f;

    /* renamed from: g */
    public boolean f108533g;

    /* renamed from: h */
    public boolean f108534h;

    /* renamed from: i */
    public boolean f108535i;

    /* renamed from: j */
    public String f108536j;

    public FirstPartyTokenizePanRequest() {
    }

    public FirstPartyTokenizePanRequest(String str, boolean z, String str2, byte[] bArr, boolean z2, String str3, boolean z3, boolean z4, boolean z5, String str4) {
        this.f108527a = str;
        this.f108528b = z;
        this.f108529c = str2;
        this.f108530d = bArr;
        this.f108531e = z2;
        this.f108532f = str3;
        this.f108533g = z3;
        this.f108534h = z4;
        this.f108535i = z5;
        this.f108536j = str4;
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
        see.m35046a(parcel, 2, this.f108527a, false);
        see.m35051a(parcel, 3, this.f108528b);
        see.m35046a(parcel, 4, this.f108529c, false);
        see.m35052a(parcel, 5, this.f108530d, false);
        see.m35051a(parcel, 6, this.f108531e);
        see.m35046a(parcel, 7, this.f108532f, false);
        see.m35051a(parcel, 8, this.f108533g);
        see.m35051a(parcel, 9, this.f108534h);
        see.m35051a(parcel, 10, this.f108535i);
        see.m35046a(parcel, 11, this.f108536j, false);
        see.m35062b(parcel, a);
    }
}
