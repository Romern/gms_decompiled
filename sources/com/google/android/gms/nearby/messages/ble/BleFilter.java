package com.google.android.gms.nearby.messages.ble;

import android.os.Parcel;
import android.os.ParcelUuid;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class BleFilter extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new aizu();

    /* renamed from: a */
    public final int f80698a;

    /* renamed from: b */
    public final ParcelUuid f80699b;

    /* renamed from: c */
    public final ParcelUuid f80700c;

    /* renamed from: d */
    public final ParcelUuid f80701d;

    /* renamed from: e */
    public final byte[] f80702e;

    /* renamed from: f */
    public final byte[] f80703f;

    /* renamed from: g */
    public final int f80704g;

    /* renamed from: h */
    public final byte[] f80705h;

    /* renamed from: i */
    public final byte[] f80706i;

    public BleFilter(int i, ParcelUuid parcelUuid, ParcelUuid parcelUuid2, ParcelUuid parcelUuid3, byte[] bArr, byte[] bArr2, int i2, byte[] bArr3, byte[] bArr4) {
        this.f80698a = i;
        this.f80699b = parcelUuid;
        this.f80700c = parcelUuid2;
        this.f80701d = parcelUuid3;
        this.f80702e = bArr;
        this.f80703f = bArr2;
        this.f80704g = i2;
        this.f80705h = bArr3;
        this.f80706i = bArr4;
    }

    /* renamed from: a */
    public static boolean m67398a(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        if (bArr3 == null || bArr3.length < bArr.length) {
            return false;
        }
        if (bArr2 == null) {
            for (int i = 0; i < bArr.length; i++) {
                if (bArr3[i] != bArr[i]) {
                    return false;
                }
            }
            return true;
        }
        for (int i2 = 0; i2 < bArr.length; i2++) {
            byte b = bArr2[i2];
            if ((bArr3[i2] & b) != (b & bArr[i2])) {
                return false;
            }
        }
        return true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            BleFilter bleFilter = (BleFilter) obj;
            return this.f80704g == bleFilter.f80704g && Arrays.equals(this.f80705h, bleFilter.f80705h) && Arrays.equals(this.f80706i, bleFilter.f80706i) && sdg.m34949a(this.f80701d, bleFilter.f80701d) && Arrays.equals(this.f80702e, bleFilter.f80702e) && Arrays.equals(this.f80703f, bleFilter.f80703f) && sdg.m34949a(this.f80699b, bleFilter.f80699b) && sdg.m34949a(this.f80700c, bleFilter.f80700c);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f80704g), Integer.valueOf(Arrays.hashCode(this.f80705h)), Integer.valueOf(Arrays.hashCode(this.f80706i)), this.f80701d, Integer.valueOf(Arrays.hashCode(this.f80702e)), Integer.valueOf(Arrays.hashCode(this.f80703f)), this.f80699b, this.f80700c});
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
        see.m35063b(parcel, 1, this.f80698a);
        see.m35040a(parcel, 4, this.f80699b, i, false);
        see.m35040a(parcel, 5, this.f80700c, i, false);
        see.m35040a(parcel, 6, this.f80701d, i, false);
        see.m35052a(parcel, 7, this.f80702e, false);
        see.m35052a(parcel, 8, this.f80703f, false);
        see.m35063b(parcel, 9, this.f80704g);
        see.m35052a(parcel, 10, this.f80705h, false);
        see.m35052a(parcel, 11, this.f80706i, false);
        see.m35062b(parcel, a);
    }
}
