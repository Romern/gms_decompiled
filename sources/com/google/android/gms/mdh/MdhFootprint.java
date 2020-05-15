package com.google.android.gms.mdh;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;
import java.util.Locale;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class MdhFootprint extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new afkt();

    /* renamed from: a */
    public final byte[] f79987a;

    /* renamed from: b */
    public final byte[] f79988b;

    /* renamed from: c */
    public final long f79989c;

    public MdhFootprint(byte[] bArr, byte[] bArr2, long j) {
        this.f79987a = bArr;
        this.f79989c = j;
        this.f79988b = bArr2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            MdhFootprint mdhFootprint = (MdhFootprint) obj;
            return this.f79989c == mdhFootprint.f79989c && Arrays.equals(this.f79987a, mdhFootprint.f79987a) && Arrays.equals(this.f79988b, mdhFootprint.f79988b);
        }
    }

    public final int hashCode() {
        Object[] objArr = new Object[3];
        byte[] bArr = this.f79987a;
        if (bArr.length >= 64) {
            bArr = Arrays.copyOf(bArr, 64);
        }
        objArr[0] = Arrays.toString(bArr);
        objArr[1] = Arrays.toString(this.f79988b);
        objArr[2] = Long.valueOf(this.f79989c);
        return Arrays.hashCode(objArr);
    }

    public final String toString() {
        return String.format(Locale.ENGLISH, "MdhFootprint{sizeOf(data)=%d, secondaryId=%s, serverEventIdTimestamp=%d}", Integer.valueOf(this.f79987a.length), Arrays.toString(this.f79988b), Long.valueOf(this.f79989c));
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
        see.m35052a(parcel, 1, this.f79987a, false);
        see.m35052a(parcel, 2, this.f79988b, false);
        see.m35036a(parcel, 3, this.f79989c);
        see.m35062b(parcel, a);
    }
}
