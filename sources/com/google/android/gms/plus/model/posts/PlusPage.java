package com.google.android.gms.plus.model.posts;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class PlusPage extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new anxr();

    /* renamed from: a */
    public final int f82547a;

    /* renamed from: b */
    public final String f82548b;

    /* renamed from: c */
    public final String f82549c;

    /* renamed from: d */
    public final String f82550d;

    public PlusPage(int i, String str, String str2, String str3) {
        this.f82547a = i;
        this.f82548b = str;
        this.f82549c = str2;
        this.f82550d = str3;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof PlusPage) {
            PlusPage plusPage = (PlusPage) obj;
            if (this.f82547a != plusPage.f82547a || !sdg.m34949a(this.f82548b, plusPage.f82548b) || !sdg.m34949a(this.f82549c, plusPage.f82549c) || !sdg.m34949a(this.f82550d, plusPage.f82550d)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f82547a), this.f82549c, this.f82550d});
    }

    public PlusPage(String str, String str2, String str3) {
        this(1, str, str2, str3);
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
        see.m35046a(parcel, 1, this.f82548b, false);
        see.m35046a(parcel, 2, this.f82549c, false);
        see.m35046a(parcel, 3, this.f82550d, false);
        see.m35063b(parcel, 1000, this.f82547a);
        see.m35062b(parcel, a);
    }
}
