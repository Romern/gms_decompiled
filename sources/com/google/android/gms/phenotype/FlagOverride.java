package com.google.android.gms.phenotype;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class FlagOverride extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new aneb();

    /* renamed from: a */
    public final String f82108a;

    /* renamed from: b */
    public final String f82109b;

    /* renamed from: c */
    public final Flag f82110c;

    /* renamed from: d */
    public final boolean f82111d;

    public FlagOverride(String str, String str2, Flag flag, boolean z) {
        this.f82108a = str;
        this.f82109b = str2;
        this.f82110c = flag;
        this.f82111d = z;
    }

    /* renamed from: a */
    public final String mo46508a(StringBuilder sb) {
        sb.append("FlagOverride(");
        sb.append(this.f82108a);
        sb.append(", ");
        sb.append(this.f82109b);
        sb.append(", ");
        this.f82110c.mo46498a(sb);
        sb.append(", ");
        sb.append(this.f82111d);
        sb.append(")");
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof FlagOverride) {
            FlagOverride flagOverride = (FlagOverride) obj;
            return anez.m64128a(this.f82108a, flagOverride.f82108a) && anez.m64128a(this.f82109b, flagOverride.f82109b) && anez.m64128a(this.f82110c, flagOverride.f82110c) && this.f82111d == flagOverride.f82111d;
        }
    }

    public final String toString() {
        return mo46508a(new StringBuilder());
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
        see.m35046a(parcel, 2, this.f82108a, false);
        see.m35046a(parcel, 3, this.f82109b, false);
        see.m35040a(parcel, 4, this.f82110c, i, false);
        see.m35051a(parcel, 5, this.f82111d);
        see.m35062b(parcel, a);
    }
}
