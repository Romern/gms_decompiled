package com.google.android.gms.auth.proximity;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class RemoteDevice extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new jne();

    /* renamed from: a */
    public final int f11137a;

    /* renamed from: b */
    public final String f11138b;

    /* renamed from: c */
    public final String f11139c;

    /* renamed from: d */
    public final String f11140d;

    /* renamed from: e */
    public final byte[] f11141e;

    /* renamed from: f */
    public final String f11142f;
    @Deprecated

    /* renamed from: g */
    public final List f11143g;

    /* renamed from: h */
    public final String f11144h;

    public RemoteDevice(int i, String str, String str2, String str3, byte[] bArr, String str4, List list, String str5) {
        this.f11137a = i;
        this.f11138b = str;
        this.f11139c = str2;
        this.f11140d = str3;
        this.f11141e = bArr;
        this.f11142f = str4 == null ? "" : str4;
        this.f11143g = list == null ? new ArrayList() : list;
        this.f11144h = str5;
    }

    /* renamed from: a */
    public static String m6768a(byte[] bArr) {
        return Base64.encodeToString(bArr, 8);
    }

    public final boolean equals(Object obj) {
        if (obj != null && obj.getClass().equals(getClass())) {
            RemoteDevice remoteDevice = (RemoteDevice) obj;
            if (remoteDevice.f11137a != this.f11137a || !remoteDevice.f11138b.equals(this.f11138b) || !remoteDevice.f11139c.equals(this.f11139c) || !remoteDevice.f11140d.equals(this.f11140d) || !Arrays.equals(remoteDevice.f11141e, this.f11141e) || !remoteDevice.f11142f.equals(this.f11142f)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f11137a), Integer.valueOf(this.f11138b.hashCode()), Integer.valueOf(this.f11139c.hashCode()), Integer.valueOf(this.f11140d.hashCode()), Integer.valueOf(Arrays.hashCode(this.f11141e)), Integer.valueOf(this.f11142f.hashCode()), Integer.valueOf(this.f11144h.hashCode())});
    }

    public final String toString() {
        return String.format("RemoteDevice{id=%s, name=%s, type=%s, acc=%s, pk=%s, btaddr=%s}", mo7784a(), this.f11139c, this.f11144h, this.f11140d, Integer.valueOf(Arrays.hashCode(this.f11141e)), this.f11142f);
    }

    /* renamed from: a */
    public final String mo7784a() {
        return jkr.m16853a(this.f11138b);
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
        see.m35046a(parcel, 1, this.f11138b, false);
        see.m35046a(parcel, 2, this.f11139c, false);
        see.m35046a(parcel, 3, this.f11140d, false);
        see.m35052a(parcel, 4, this.f11141e, false);
        see.m35046a(parcel, 5, this.f11142f, false);
        see.m35066c(parcel, 6, this.f11143g, false);
        see.m35046a(parcel, 7, this.f11144h, false);
        see.m35063b(parcel, 1000, this.f11137a);
        see.m35062b(parcel, a);
    }
}
