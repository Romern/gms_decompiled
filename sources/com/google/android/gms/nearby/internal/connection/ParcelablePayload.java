package com.google.android.gms.nearby.internal.connection;

import android.net.Uri;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ParcelablePayload extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new aiid();

    /* renamed from: a */
    public long f80605a;

    /* renamed from: b */
    public int f80606b;

    /* renamed from: c */
    public byte[] f80607c;

    /* renamed from: d */
    public ParcelFileDescriptor f80608d;

    /* renamed from: e */
    public String f80609e;

    /* renamed from: f */
    public long f80610f;

    /* renamed from: g */
    public ParcelFileDescriptor f80611g;

    /* renamed from: h */
    public Uri f80612h;

    public ParcelablePayload() {
        this.f80610f = -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ParcelablePayload) {
            ParcelablePayload parcelablePayload = (ParcelablePayload) obj;
            return sdg.m34949a(Long.valueOf(this.f80605a), Long.valueOf(parcelablePayload.f80605a)) && sdg.m34949a(Integer.valueOf(this.f80606b), Integer.valueOf(parcelablePayload.f80606b)) && Arrays.equals(this.f80607c, parcelablePayload.f80607c) && sdg.m34949a(this.f80608d, parcelablePayload.f80608d) && sdg.m34949a(this.f80609e, parcelablePayload.f80609e) && sdg.m34949a(Long.valueOf(this.f80610f), Long.valueOf(parcelablePayload.f80610f)) && sdg.m34949a(this.f80611g, parcelablePayload.f80611g) && sdg.m34949a(this.f80612h, parcelablePayload.f80612h);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f80605a), Integer.valueOf(this.f80606b), Integer.valueOf(Arrays.hashCode(this.f80607c)), this.f80608d, this.f80609e, Long.valueOf(this.f80610f), this.f80611g, this.f80612h});
    }

    public ParcelablePayload(long j, int i, byte[] bArr, ParcelFileDescriptor parcelFileDescriptor, String str, long j2, ParcelFileDescriptor parcelFileDescriptor2, Uri uri) {
        this.f80605a = j;
        this.f80606b = i;
        this.f80607c = bArr;
        this.f80608d = parcelFileDescriptor;
        this.f80609e = str;
        this.f80610f = j2;
        this.f80611g = parcelFileDescriptor2;
        this.f80612h = uri;
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
        see.m35036a(parcel, 1, this.f80605a);
        see.m35063b(parcel, 2, this.f80606b);
        see.m35052a(parcel, 3, this.f80607c, false);
        see.m35040a(parcel, 4, this.f80608d, i, false);
        see.m35046a(parcel, 5, this.f80609e, false);
        see.m35036a(parcel, 6, this.f80610f);
        see.m35040a(parcel, 7, this.f80611g, i, false);
        see.m35040a(parcel, 8, this.f80612h, i, false);
        see.m35062b(parcel, a);
    }
}
