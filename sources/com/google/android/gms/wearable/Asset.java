package com.google.android.gms.wearable;

import android.net.Uri;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class Asset extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new axoi();

    /* renamed from: a */
    public byte[] f110860a;

    /* renamed from: b */
    public String f110861b;

    /* renamed from: c */
    public ParcelFileDescriptor f110862c;

    /* renamed from: d */
    public Uri f110863d;

    public Asset(byte[] bArr, String str, ParcelFileDescriptor parcelFileDescriptor, Uri uri) {
        this.f110860a = bArr;
        this.f110861b = str;
        this.f110862c = parcelFileDescriptor;
        this.f110863d = uri;
    }

    /* renamed from: a */
    public static Asset m94387a(ParcelFileDescriptor parcelFileDescriptor) {
        rzz.m34731b(parcelFileDescriptor);
        return new Asset(null, null, parcelFileDescriptor, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Asset) {
            Asset asset = (Asset) obj;
            return Arrays.equals(this.f110860a, asset.f110860a) && sdg.m34949a(this.f110861b, asset.f110861b) && sdg.m34949a(this.f110862c, asset.f110862c) && sdg.m34949a(this.f110863d, asset.f110863d);
        }
    }

    public final int hashCode() {
        return Arrays.deepHashCode(new Object[]{this.f110860a, this.f110861b, this.f110862c, this.f110863d});
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Asset[@");
        sb.append(Integer.toHexString(hashCode()));
        if (this.f110861b == null) {
            sb.append(", nodigest");
        } else {
            sb.append(", ");
            sb.append(this.f110861b);
        }
        if (this.f110860a != null) {
            sb.append(", size=");
            sb.append(this.f110860a.length);
        }
        if (this.f110862c != null) {
            sb.append(", fd=");
            sb.append(this.f110862c);
        }
        if (this.f110863d != null) {
            sb.append(", uri=");
            sb.append(this.f110863d);
        }
        sb.append("]");
        return sb.toString();
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
        rzz.m34731b(parcel);
        int i2 = i | 1;
        int a = see.m35030a(parcel);
        see.m35052a(parcel, 2, this.f110860a, false);
        see.m35046a(parcel, 3, this.f110861b, false);
        see.m35040a(parcel, 4, this.f110862c, i2, false);
        see.m35040a(parcel, 5, this.f110863d, i2, false);
        see.m35062b(parcel, a);
    }
}
