package com.google.android.gms.auth.api.phone.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class RequestResult extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new hzo();

    /* renamed from: a */
    public int f10260a;

    /* renamed from: b */
    public String f10261b;

    /* renamed from: c */
    public int f10262c;

    /* renamed from: d */
    public long f10263d;

    public RequestResult() {
        this.f10262c = -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof RequestResult) {
            RequestResult requestResult = (RequestResult) obj;
            return sdg.m34949a(Integer.valueOf(this.f10260a), Integer.valueOf(requestResult.f10260a)) && sdg.m34949a(this.f10261b, requestResult.f10261b) && sdg.m34949a(Integer.valueOf(this.f10262c), Integer.valueOf(requestResult.f10262c)) && sdg.m34949a(Long.valueOf(this.f10263d), Long.valueOf(requestResult.f10263d));
        }
    }

    public final int hashCode() {
        String str = this.f10261b;
        if (str == null) {
            str = "";
        }
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f10260a), str, Integer.valueOf(this.f10262c), Long.valueOf(this.f10263d)});
    }

    public RequestResult(int i, String str, int i2, long j) {
        this.f10260a = i;
        this.f10261b = str;
        this.f10262c = i2;
        this.f10263d = j;
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
        see.m35063b(parcel, 1, this.f10260a);
        see.m35046a(parcel, 2, this.f10261b, false);
        see.m35063b(parcel, 3, this.f10262c);
        see.m35036a(parcel, 4, this.f10263d);
        see.m35062b(parcel, a);
    }
}
