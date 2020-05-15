package com.google.android.gms.mobilesubscription.serviceconfig;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class UserKey extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new ahba();

    /* renamed from: a */
    public Long f80385a;

    /* renamed from: b */
    public AuthType f80386b;

    /* renamed from: c */
    public String f80387c;

    /* renamed from: d */
    public Long f80388d;

    private UserKey() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof UserKey) {
            UserKey userKey = (UserKey) obj;
            return sdg.m34949a(this.f80385a, userKey.f80385a) && sdg.m34949a(this.f80386b, userKey.f80386b) && sdg.m34949a(this.f80387c, userKey.f80387c) && sdg.m34949a(this.f80388d, userKey.f80388d);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f80385a, this.f80386b, this.f80387c, this.f80388d});
    }

    public UserKey(Long l, AuthType authType, String str, Long l2) {
        this.f80385a = l;
        this.f80386b = authType;
        this.f80387c = str;
        this.f80388d = l2;
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
        see.m35045a(parcel, 1, this.f80385a);
        see.m35040a(parcel, 2, this.f80386b, i, false);
        see.m35046a(parcel, 3, this.f80387c, false);
        see.m35045a(parcel, 4, this.f80388d);
        see.m35062b(parcel, a);
    }
}
