package com.google.android.gms.phenotype;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class Configurations extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new andq();

    /* renamed from: a */
    public final String f82074a;

    /* renamed from: b */
    public final byte[] f82075b;

    /* renamed from: c */
    public final String f82076c;

    /* renamed from: d */
    public final Configuration[] f82077d;

    /* renamed from: e */
    public final Map f82078e = new TreeMap();

    /* renamed from: f */
    public final boolean f82079f;

    /* renamed from: g */
    public final long f82080g;

    public Configurations(String str, String str2, Configuration[] configurationArr, boolean z, byte[] bArr, long j) {
        this.f82074a = str;
        this.f82076c = str2;
        this.f82077d = configurationArr;
        this.f82079f = z;
        this.f82075b = bArr;
        this.f82080g = j;
        for (Configuration configuration : configurationArr) {
            this.f82078e.put(Integer.valueOf(configuration.f82070a), configuration);
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof Configurations) {
            Configurations configurations = (Configurations) obj;
            if (!anez.m64128a(this.f82074a, configurations.f82074a) || !anez.m64128a(this.f82076c, configurations.f82076c) || !this.f82078e.equals(configurations.f82078e) || this.f82079f != configurations.f82079f || !Arrays.equals(this.f82075b, configurations.f82075b) || this.f82080g != configurations.f82080g) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f82074a, this.f82076c, this.f82078e, Boolean.valueOf(this.f82079f), this.f82075b, Long.valueOf(this.f82080g)});
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("Configurations('");
        sb.append(this.f82074a);
        sb.append("', '");
        sb.append(this.f82076c);
        sb.append("', (");
        for (Configuration configuration : this.f82078e.values()) {
            sb.append(configuration);
            sb.append(", ");
        }
        sb.append("), ");
        sb.append(this.f82079f);
        sb.append(", ");
        byte[] bArr = this.f82075b;
        if (bArr != null) {
            str = Base64.encodeToString(bArr, 3);
        } else {
            str = "null";
        }
        sb.append(str);
        sb.append(", ");
        sb.append(this.f82080g);
        sb.append(')');
        return sb.toString();
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
        see.m35046a(parcel, 2, this.f82074a, false);
        see.m35046a(parcel, 3, this.f82076c, false);
        see.m35057a(parcel, 4, this.f82077d, i);
        see.m35051a(parcel, 5, this.f82079f);
        see.m35052a(parcel, 6, this.f82075b, false);
        see.m35036a(parcel, 7, this.f82080g);
        see.m35062b(parcel, a);
    }
}
