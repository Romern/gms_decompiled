package com.google.android.gms.beacon;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.WorkSource;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;
import java.util.List;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class BleSettings extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new nen();

    /* renamed from: a */
    public final int f29265a;

    /* renamed from: b */
    public final int f29266b;

    /* renamed from: c */
    public final long f29267c;

    /* renamed from: d */
    public final List f29268d;

    /* renamed from: e */
    public WorkSource f29269e;

    /* renamed from: f */
    public int f29270f;

    public BleSettings(int i, int i2, long j, List list, WorkSource workSource, int i3) {
        this.f29265a = i;
        this.f29266b = i2;
        this.f29267c = j;
        this.f29268d = list;
        this.f29269e = workSource;
        this.f29270f = i3;
    }

    /* renamed from: a */
    public static int m22043a(int i) {
        if (i == 0) {
            return 2;
        }
        if (i == 1) {
            return 3;
        }
        if (i != 2) {
            return i != 3 ? 0 : 1;
        }
        return 4;
    }

    /* renamed from: b */
    public static String m22044b(int i) {
        switch (i) {
            case 1:
                return "Nearby";
            case 2:
                return "Places";
            case 3:
                return "ULR";
            case 4:
                return "Test app";
            case 5:
                return "Tests";
            case 6:
                return "Other";
            case 7:
                return "ProximityAuth";
            case 8:
                return "GLS";
            case 9:
                return "FLP";
            default:
                return "Unknown";
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof BleSettings) {
            BleSettings bleSettings = (BleSettings) obj;
            return this.f29265a == bleSettings.f29265a && this.f29266b == bleSettings.f29266b && this.f29267c == bleSettings.f29267c && sdg.m34949a(this.f29268d, bleSettings.f29268d) && sdg.m34949a(this.f29269e, bleSettings.f29269e) && this.f29270f == bleSettings.f29270f;
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f29265a), Integer.valueOf(this.f29266b), Long.valueOf(this.f29267c), this.f29268d, this.f29269e, Integer.valueOf(this.f29270f)});
    }

    public final String toString() {
        String str;
        String str2;
        int i = this.f29265a;
        if (i == 0) {
            str = "LOW_POWER";
        } else if (i == 1) {
            str = "BALANCED";
        } else if (i == 2) {
            str = "LOW_LATENCY";
        } else if (i != 3) {
            StringBuilder sb = new StringBuilder(20);
            sb.append("UNKNOWN(");
            sb.append(i);
            sb.append(")");
            str = sb.toString();
        } else {
            str = "ZERO_POWER";
        }
        int i2 = this.f29266b;
        if (i2 == 1) {
            str2 = "ALL_MATCHES";
        } else if (i2 == 2) {
            str2 = "FIRST_MATCH";
        } else if (i2 == 4) {
            str2 = "LOST";
        } else if (i2 != 6) {
            StringBuilder sb2 = new StringBuilder(20);
            sb2.append("UNKNOWN: ");
            sb2.append(i2);
            str2 = sb2.toString();
        } else {
            str2 = "FIRST_MATCH | LOST";
        }
        long j = this.f29267c;
        int size = this.f29268d.size();
        int size2 = stx.m36340b(this.f29269e).size();
        String b = m22044b(this.f29270f);
        int length = String.valueOf(str).length();
        StringBuilder sb3 = new StringBuilder(length + 140 + String.valueOf(str2).length() + b.length());
        sb3.append("BleSettings [scanMode=");
        sb3.append(str);
        sb3.append(", callbackType=");
        sb3.append(str2);
        sb3.append(", reportDelayMillis=");
        sb3.append(j);
        sb3.append(", ");
        sb3.append(size);
        sb3.append(" filters, ");
        sb3.append(size2);
        sb3.append(" clients, callingClientName=");
        sb3.append(b);
        sb3.append("]");
        return sb3.toString();
    }

    /* renamed from: a */
    public final String mo17297a() {
        return m22044b(this.f29270f);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35063b(parcel, 2, this.f29265a);
        see.m35063b(parcel, 3, this.f29266b);
        see.m35036a(parcel, 4, this.f29267c);
        see.m35066c(parcel, 6, this.f29268d, false);
        see.m35040a(parcel, 7, this.f29269e, i, false);
        see.m35063b(parcel, 8, this.f29270f);
        see.m35062b(parcel, a);
    }
}
