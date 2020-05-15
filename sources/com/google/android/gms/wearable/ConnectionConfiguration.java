package com.google.android.gms.wearable;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class ConnectionConfiguration extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new axon();

    /* renamed from: a */
    public final String f110864a;

    /* renamed from: b */
    public final String f110865b;

    /* renamed from: c */
    public final int f110866c;

    /* renamed from: d */
    public final int f110867d;

    /* renamed from: e */
    public final boolean f110868e;

    /* renamed from: f */
    public volatile boolean f110869f;

    /* renamed from: g */
    public volatile String f110870g;

    /* renamed from: h */
    public boolean f110871h;

    /* renamed from: i */
    public String f110872i;

    public ConnectionConfiguration(String str, String str2, int i, int i2, boolean z) {
        this(str, str2, i, i2, z, false, null, true, null);
    }

    /* renamed from: a */
    public final void mo60244a(String str) {
        this.f110869f = str != null;
        this.f110870g = str;
    }

    /* renamed from: a */
    public final boolean mo60245a() {
        return this.f110866c == 3;
    }

    /* renamed from: b */
    public final boolean mo60246b() {
        int i = this.f110866c;
        return !(i == 1 && this.f110867d == 1 && (this.f110865b == null || this.f110864a == null)) && this.f110867d > 0 && i > 0;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ConnectionConfiguration) {
            ConnectionConfiguration connectionConfiguration = (ConnectionConfiguration) obj;
            if (!sdg.m34949a(this.f110864a, connectionConfiguration.f110864a) || !sdg.m34949a(this.f110865b, connectionConfiguration.f110865b) || !sdg.m34949a(Integer.valueOf(this.f110866c), Integer.valueOf(connectionConfiguration.f110866c)) || !sdg.m34949a(Integer.valueOf(this.f110867d), Integer.valueOf(connectionConfiguration.f110867d)) || !sdg.m34949a(Boolean.valueOf(this.f110868e), Boolean.valueOf(connectionConfiguration.f110868e)) || !sdg.m34949a(Boolean.valueOf(this.f110871h), Boolean.valueOf(connectionConfiguration.f110871h))) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f110864a, this.f110865b, Integer.valueOf(this.f110866c), Integer.valueOf(this.f110867d), Boolean.valueOf(this.f110868e), Boolean.valueOf(this.f110871h)});
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ConnectionConfiguration[ ");
        String valueOf = String.valueOf(this.f110864a);
        sb.append(valueOf.length() == 0 ? new String("mName=") : "mName=".concat(valueOf));
        String valueOf2 = String.valueOf(this.f110865b);
        sb.append(valueOf2.length() == 0 ? new String(", mAddress=") : ", mAddress=".concat(valueOf2));
        int i = this.f110866c;
        StringBuilder sb2 = new StringBuilder(19);
        sb2.append(", mType=");
        sb2.append(i);
        sb.append(sb2.toString());
        int i2 = this.f110867d;
        StringBuilder sb3 = new StringBuilder(19);
        sb3.append(", mRole=");
        sb3.append(i2);
        sb.append(sb3.toString());
        boolean z = this.f110868e;
        StringBuilder sb4 = new StringBuilder(16);
        sb4.append(", mEnabled=");
        sb4.append(z);
        sb.append(sb4.toString());
        boolean z2 = this.f110869f;
        StringBuilder sb5 = new StringBuilder(20);
        sb5.append(", mIsConnected=");
        sb5.append(z2);
        sb.append(sb5.toString());
        String valueOf3 = String.valueOf(this.f110870g);
        sb.append(valueOf3.length() == 0 ? new String(", mPeerNodeId=") : ", mPeerNodeId=".concat(valueOf3));
        boolean z3 = this.f110871h;
        StringBuilder sb6 = new StringBuilder(21);
        sb6.append(", mBtlePriority=");
        sb6.append(z3);
        sb.append(sb6.toString());
        String valueOf4 = String.valueOf(this.f110872i);
        sb.append(valueOf4.length() == 0 ? new String(", mNodeId=") : ", mNodeId=".concat(valueOf4));
        sb.append("]");
        return sb.toString();
    }

    public ConnectionConfiguration(String str, String str2, int i, int i2, boolean z, String str3) {
        this(str, str2, i, i2, z, false, null, true, str3);
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
        see.m35046a(parcel, 2, this.f110864a, false);
        see.m35046a(parcel, 3, this.f110865b, false);
        see.m35063b(parcel, 4, this.f110866c);
        see.m35063b(parcel, 5, this.f110867d);
        see.m35051a(parcel, 6, this.f110868e);
        see.m35051a(parcel, 7, this.f110869f);
        see.m35046a(parcel, 8, this.f110870g, false);
        see.m35051a(parcel, 9, this.f110871h);
        see.m35046a(parcel, 10, this.f110872i, false);
        see.m35062b(parcel, a);
    }

    public ConnectionConfiguration(String str, String str2, int i, int i2, boolean z, boolean z2, String str3, boolean z3, String str4) {
        this.f110864a = str;
        this.f110865b = str2;
        this.f110866c = i;
        this.f110867d = i2;
        this.f110868e = z;
        this.f110869f = z2;
        this.f110870g = str3;
        this.f110871h = z3;
        this.f110872i = str4;
    }
}
