package com.google.android.gms.nearby.connection;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ConnectionOptions extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new ahic();

    /* renamed from: a */
    public boolean f80457a;

    /* renamed from: b */
    public boolean f80458b;

    /* renamed from: c */
    public boolean f80459c;

    /* renamed from: d */
    public boolean f80460d;

    /* renamed from: e */
    public boolean f80461e;

    /* renamed from: f */
    public boolean f80462f;

    /* renamed from: g */
    public boolean f80463g;

    /* renamed from: h */
    public boolean f80464h;

    /* renamed from: i */
    public byte[] f80465i;

    /* renamed from: j */
    public boolean f80466j;

    public ConnectionOptions() {
        this.f80457a = false;
        this.f80458b = true;
        this.f80459c = true;
        this.f80460d = true;
        this.f80461e = true;
        this.f80462f = true;
        this.f80463g = true;
        this.f80464h = true;
        this.f80466j = false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ConnectionOptions) {
            ConnectionOptions connectionOptions = (ConnectionOptions) obj;
            return sdg.m34949a(Boolean.valueOf(this.f80457a), Boolean.valueOf(connectionOptions.f80457a)) && sdg.m34949a(Boolean.valueOf(this.f80458b), Boolean.valueOf(connectionOptions.f80458b)) && sdg.m34949a(Boolean.valueOf(this.f80459c), Boolean.valueOf(connectionOptions.f80459c)) && sdg.m34949a(Boolean.valueOf(this.f80460d), Boolean.valueOf(connectionOptions.f80460d)) && sdg.m34949a(Boolean.valueOf(this.f80461e), Boolean.valueOf(connectionOptions.f80461e)) && sdg.m34949a(Boolean.valueOf(this.f80462f), Boolean.valueOf(connectionOptions.f80462f)) && sdg.m34949a(Boolean.valueOf(this.f80463g), Boolean.valueOf(connectionOptions.f80463g)) && sdg.m34949a(Boolean.valueOf(this.f80464h), Boolean.valueOf(connectionOptions.f80464h)) && Arrays.equals(this.f80465i, connectionOptions.f80465i) && sdg.m34949a(Boolean.valueOf(this.f80466j), Boolean.valueOf(connectionOptions.f80466j));
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f80457a), Boolean.valueOf(this.f80458b), Boolean.valueOf(this.f80459c), Boolean.valueOf(this.f80460d), Boolean.valueOf(this.f80461e), Boolean.valueOf(this.f80462f), Boolean.valueOf(this.f80463g), Boolean.valueOf(this.f80464h), Integer.valueOf(Arrays.hashCode(this.f80465i)), Boolean.valueOf(this.f80466j)});
    }

    public ConnectionOptions(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, byte[] bArr, boolean z9) {
        this.f80457a = z;
        this.f80458b = z2;
        this.f80459c = z3;
        this.f80460d = z4;
        this.f80461e = z5;
        this.f80462f = z6;
        this.f80463g = z7;
        this.f80464h = z8;
        this.f80465i = bArr;
        this.f80466j = z9;
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
        see.m35051a(parcel, 1, this.f80457a);
        see.m35051a(parcel, 2, this.f80458b);
        see.m35051a(parcel, 3, this.f80459c);
        see.m35051a(parcel, 4, this.f80460d);
        see.m35051a(parcel, 5, this.f80461e);
        see.m35051a(parcel, 6, this.f80462f);
        see.m35051a(parcel, 7, this.f80463g);
        see.m35051a(parcel, 8, this.f80464h);
        see.m35052a(parcel, 9, this.f80465i, false);
        see.m35051a(parcel, 10, this.f80466j);
        see.m35062b(parcel, a);
    }
}
