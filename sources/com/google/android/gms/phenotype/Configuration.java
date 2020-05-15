package com.google.android.gms.phenotype;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class Configuration extends AbstractSafeParcelable implements Comparable {
    public static final Parcelable.Creator CREATOR = new andp();

    /* renamed from: a */
    public final int f82070a;

    /* renamed from: b */
    public final Flag[] f82071b;

    /* renamed from: c */
    public final String[] f82072c;

    /* renamed from: d */
    public final Map f82073d = new TreeMap();

    public Configuration(int i, Flag[] flagArr, String[] strArr) {
        this.f82070a = i;
        this.f82071b = flagArr;
        for (Flag flag : flagArr) {
            this.f82073d.put(flag.f82099a, flag);
        }
        this.f82072c = strArr;
        if (strArr != null) {
            Arrays.sort(strArr);
        }
    }

    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return this.f82070a - ((Configuration) obj).f82070a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof Configuration) {
            Configuration configuration = (Configuration) obj;
            return this.f82070a == configuration.f82070a && anez.m64128a(this.f82073d, configuration.f82073d) && Arrays.equals(this.f82072c, configuration.f82072c);
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Configuration(");
        sb.append(this.f82070a);
        sb.append(", (");
        for (Flag flag : this.f82073d.values()) {
            sb.append(flag);
            sb.append(", ");
        }
        sb.append("), (");
        String[] strArr = this.f82072c;
        if (strArr == null) {
            sb.append("null");
        } else {
            for (String str : strArr) {
                sb.append(str);
                sb.append(", ");
            }
        }
        sb.append("))");
        return sb.toString();
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: see.a(android.os.Parcel, int, java.lang.String[], boolean):void
     arg types: [android.os.Parcel, int, java.lang.String[], int]
     candidates:
      see.a(android.os.Parcel, int, android.os.Bundle, boolean):void
      see.a(android.os.Parcel, int, android.os.Parcel, boolean):void
      see.a(android.os.Parcel, int, java.lang.String, boolean):void
      see.a(android.os.Parcel, int, java.math.BigDecimal, boolean):void
      see.a(android.os.Parcel, int, java.util.List, boolean):void
      see.a(android.os.Parcel, int, byte[], boolean):void
      see.a(android.os.Parcel, int, double[], boolean):void
      see.a(android.os.Parcel, int, float[], boolean):void
      see.a(android.os.Parcel, int, int[], boolean):void
      see.a(android.os.Parcel, int, long[], boolean):void
      see.a(android.os.Parcel, int, android.os.Parcelable[], int):void
      see.a(android.os.Parcel, int, boolean[], boolean):void
      see.a(android.os.Parcel, int, java.lang.String[], boolean):void */
    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35063b(parcel, 2, this.f82070a);
        see.m35057a(parcel, 3, this.f82071b, i);
        see.m35058a(parcel, 4, this.f82072c, false);
        see.m35062b(parcel, a);
    }
}
