package com.google.android.gms.contextmanager.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class QueryFilterParameters extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new tmz();

    /* renamed from: a */
    public final int f30696a;

    /* renamed from: b */
    public final int f30697b;

    /* renamed from: c */
    public final int[] f30698c;

    public QueryFilterParameters(int i, int i2, int[] iArr) {
        this.f30696a = i;
        this.f30697b = i2;
        this.f30698c = iArr;
    }

    /* renamed from: a */
    public final boolean mo18086a() {
        return this.f30698c != null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof QueryFilterParameters) {
            QueryFilterParameters queryFilterParameters = (QueryFilterParameters) obj;
            if (queryFilterParameters.f30697b == this.f30697b && queryFilterParameters.f30696a == this.f30696a && mo18086a() == queryFilterParameters.mo18086a()) {
                if (mo18086a()) {
                    int length = this.f30698c.length;
                    int[] iArr = queryFilterParameters.f30698c;
                    int length2 = iArr.length;
                    if (length == length2) {
                        int i = 0;
                        while (i < length2) {
                            int i2 = iArr[i];
                            int[] iArr2 = this.f30698c;
                            int length3 = iArr2.length;
                            int i3 = 0;
                            while (i3 < length3) {
                                if (iArr2[i3] != i2) {
                                    i3++;
                                } else {
                                    i++;
                                }
                            }
                        }
                    }
                    return false;
                }
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int[] iArr = this.f30698c;
        if (iArr != null) {
            i = 0;
            for (int i2 : iArr) {
                i += i2 * 13;
            }
        } else {
            i = 0;
        }
        return Arrays.hashCode(new Object[]{Integer.valueOf(i), Integer.valueOf(this.f30696a), Integer.valueOf(this.f30697b)});
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: see.a(android.os.Parcel, int, int[], boolean):void
     arg types: [android.os.Parcel, int, int[], int]
     candidates:
      see.a(android.os.Parcel, int, android.os.Bundle, boolean):void
      see.a(android.os.Parcel, int, android.os.Parcel, boolean):void
      see.a(android.os.Parcel, int, java.lang.String, boolean):void
      see.a(android.os.Parcel, int, java.math.BigDecimal, boolean):void
      see.a(android.os.Parcel, int, java.util.List, boolean):void
      see.a(android.os.Parcel, int, byte[], boolean):void
      see.a(android.os.Parcel, int, double[], boolean):void
      see.a(android.os.Parcel, int, float[], boolean):void
      see.a(android.os.Parcel, int, long[], boolean):void
      see.a(android.os.Parcel, int, android.os.Parcelable[], int):void
      see.a(android.os.Parcel, int, java.lang.String[], boolean):void
      see.a(android.os.Parcel, int, boolean[], boolean):void
      see.a(android.os.Parcel, int, int[], boolean):void */
    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35063b(parcel, 2, this.f30696a);
        see.m35063b(parcel, 3, this.f30697b);
        see.m35055a(parcel, 4, this.f30698c, false);
        see.m35062b(parcel, a);
    }
}
