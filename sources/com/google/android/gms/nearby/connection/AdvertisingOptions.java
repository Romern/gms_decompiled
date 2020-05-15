package com.google.android.gms.nearby.connection;

import android.os.Parcel;
import android.os.ParcelUuid;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class AdvertisingOptions extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new ahhu();

    /* renamed from: a */
    public Strategy f80442a;

    /* renamed from: b */
    public boolean f80443b;

    /* renamed from: c */
    public boolean f80444c;

    /* renamed from: d */
    public boolean f80445d;

    /* renamed from: e */
    public boolean f80446e;

    /* renamed from: f */
    public byte[] f80447f;

    /* renamed from: g */
    public boolean f80448g;

    /* renamed from: h */
    public ParcelUuid f80449h;

    /* renamed from: i */
    public boolean f80450i;

    /* renamed from: j */
    public boolean f80451j;

    /* renamed from: k */
    public boolean f80452k;

    /* renamed from: l */
    public boolean f80453l;

    /* renamed from: m */
    public boolean f80454m;

    public AdvertisingOptions() {
        this.f80443b = true;
        this.f80444c = true;
        this.f80445d = true;
        this.f80446e = true;
        this.f80448g = false;
        this.f80450i = true;
        this.f80451j = true;
        this.f80452k = true;
        this.f80453l = false;
        this.f80454m = false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof AdvertisingOptions) {
            AdvertisingOptions advertisingOptions = (AdvertisingOptions) obj;
            return sdg.m34949a(this.f80442a, advertisingOptions.f80442a) && sdg.m34949a(Boolean.valueOf(this.f80443b), Boolean.valueOf(advertisingOptions.f80443b)) && sdg.m34949a(Boolean.valueOf(this.f80444c), Boolean.valueOf(advertisingOptions.f80444c)) && sdg.m34949a(Boolean.valueOf(this.f80445d), Boolean.valueOf(advertisingOptions.f80445d)) && sdg.m34949a(Boolean.valueOf(this.f80446e), Boolean.valueOf(advertisingOptions.f80446e)) && Arrays.equals(this.f80447f, advertisingOptions.f80447f) && sdg.m34949a(Boolean.valueOf(this.f80448g), Boolean.valueOf(advertisingOptions.f80448g)) && sdg.m34949a(this.f80449h, advertisingOptions.f80449h) && sdg.m34949a(Boolean.valueOf(this.f80450i), Boolean.valueOf(advertisingOptions.f80450i)) && sdg.m34949a(Boolean.valueOf(this.f80451j), Boolean.valueOf(advertisingOptions.f80451j)) && sdg.m34949a(Boolean.valueOf(this.f80452k), Boolean.valueOf(advertisingOptions.f80452k)) && sdg.m34949a(Boolean.valueOf(this.f80453l), Boolean.valueOf(advertisingOptions.f80453l)) && sdg.m34949a(Boolean.valueOf(this.f80454m), Boolean.valueOf(advertisingOptions.f80454m));
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f80442a, Boolean.valueOf(this.f80443b), Boolean.valueOf(this.f80444c), Boolean.valueOf(this.f80445d), Boolean.valueOf(this.f80446e), Integer.valueOf(Arrays.hashCode(this.f80447f)), Boolean.valueOf(this.f80448g), this.f80449h, Boolean.valueOf(this.f80450i), Boolean.valueOf(this.f80451j), Boolean.valueOf(this.f80452k), Boolean.valueOf(this.f80453l), Boolean.valueOf(this.f80454m)});
    }

    public AdvertisingOptions(Strategy strategy, boolean z, boolean z2, boolean z3, boolean z4, byte[] bArr, boolean z5, ParcelUuid parcelUuid, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10) {
        this.f80442a = strategy;
        this.f80443b = z;
        this.f80444c = z2;
        this.f80445d = z3;
        this.f80446e = z4;
        this.f80447f = bArr;
        this.f80448g = z5;
        this.f80449h = parcelUuid;
        this.f80450i = z6;
        this.f80451j = z7;
        this.f80452k = z8;
        this.f80453l = z9;
        this.f80454m = z10;
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
        see.m35040a(parcel, 1, this.f80442a, i, false);
        see.m35051a(parcel, 2, this.f80443b);
        see.m35051a(parcel, 3, this.f80444c);
        see.m35051a(parcel, 4, this.f80445d);
        see.m35051a(parcel, 5, this.f80446e);
        see.m35052a(parcel, 6, this.f80447f, false);
        see.m35051a(parcel, 7, this.f80448g);
        see.m35040a(parcel, 8, this.f80449h, i, false);
        see.m35051a(parcel, 9, this.f80450i);
        see.m35051a(parcel, 10, this.f80451j);
        see.m35051a(parcel, 11, this.f80452k);
        see.m35051a(parcel, 12, this.f80453l);
        see.m35051a(parcel, 13, this.f80454m);
        see.m35062b(parcel, a);
    }
}
