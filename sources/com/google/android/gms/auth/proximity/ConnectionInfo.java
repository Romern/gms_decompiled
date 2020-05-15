package com.google.android.gms.auth.proximity;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class ConnectionInfo extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new jkj();

    /* renamed from: a */
    public final int f11123a;

    /* renamed from: b */
    public final RemoteDevice f11124b;

    /* renamed from: c */
    public final Role[] f11125c;

    /* renamed from: d */
    public final int f11126d;

    /* renamed from: e */
    public final byte[] f11127e;

    public ConnectionInfo(int i, RemoteDevice remoteDevice, Role[] roleArr, int i2, byte[] bArr) {
        this.f11123a = i;
        this.f11124b = remoteDevice;
        this.f11125c = roleArr;
        this.f11126d = i2;
        this.f11127e = bArr;
    }

    /* renamed from: a */
    public static String m6759a(int i) {
        return i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? "[unknown]" : "[connecting]" : "[authenticated]" : "[authenticating]" : "[connected]" : "[disconnected]";
    }

    public final boolean equals(Object obj) {
        if (obj != null && obj.getClass().equals(getClass())) {
            ConnectionInfo connectionInfo = (ConnectionInfo) obj;
            boolean equals = new C1225nr(Arrays.asList(this.f11125c)).equals(new C1225nr(Arrays.asList(connectionInfo.f11125c)));
            if (!connectionInfo.f11124b.equals(this.f11124b) || !equals || connectionInfo.f11126d != this.f11126d || !Arrays.equals(connectionInfo.f11127e, this.f11127e)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        Role[] roleArr = this.f11125c;
        Role[] roleArr2 = (Role[]) Arrays.copyOf(roleArr, roleArr.length);
        Arrays.sort(roleArr2);
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f11123a), Integer.valueOf(this.f11124b.hashCode()), Integer.valueOf(Arrays.hashCode(roleArr2)), Integer.valueOf(this.f11126d), this.f11127e});
    }

    public final String toString() {
        Object obj;
        Object[] objArr = new Object[4];
        objArr[0] = this.f11124b.toString();
        objArr[1] = Arrays.toString(this.f11125c);
        objArr[2] = m6759a(this.f11126d);
        byte[] bArr = this.f11127e;
        if (bArr != null) {
            obj = Integer.valueOf(bArr.length);
        } else {
            obj = "<null>";
        }
        objArr[3] = obj;
        return String.format("(%s, %s, %s, len(cbd)=%s)", objArr);
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
        see.m35040a(parcel, 1, this.f11124b, i, false);
        see.m35057a(parcel, 2, this.f11125c, i);
        see.m35063b(parcel, 3, this.f11126d);
        see.m35052a(parcel, 4, this.f11127e, false);
        see.m35063b(parcel, 1000, this.f11123a);
        see.m35062b(parcel, a);
    }
}
