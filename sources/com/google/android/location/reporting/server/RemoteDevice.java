package com.google.android.location.reporting.server;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class RemoteDevice extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new bgwt();

    /* renamed from: a */
    public final int f150869a;

    /* renamed from: b */
    public final String f150870b;

    /* renamed from: c */
    public final boolean f150871c;

    /* renamed from: d */
    public final boolean f150872d;

    /* renamed from: e */
    public final Long f150873e;

    /* renamed from: f */
    public final Long f150874f;

    public RemoteDevice(int i, String str, boolean z, boolean z2, Long l, Long l2) {
        this.f150869a = i;
        this.f150870b = str;
        this.f150871c = z;
        this.f150872d = z2;
        this.f150873e = l;
        this.f150874f = l2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof RemoteDevice) {
            RemoteDevice remoteDevice = (RemoteDevice) obj;
            return this.f150869a == remoteDevice.f150869a && this.f150871c == remoteDevice.f150871c && this.f150872d == remoteDevice.f150872d && bxbl.m122538a(this.f150870b, remoteDevice.f150870b) && bxbl.m122538a(this.f150873e, remoteDevice.f150873e) && bxbl.m122538a(this.f150874f, remoteDevice.f150874f);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f150869a), this.f150870b, Boolean.valueOf(this.f150871c), Boolean.valueOf(this.f150872d), this.f150873e, this.f150874f});
    }

    public final String toString() {
        int i = this.f150869a;
        String str = this.f150870b;
        boolean z = this.f150871c;
        boolean z2 = this.f150872d;
        String valueOf = String.valueOf(this.f150873e);
        String valueOf2 = String.valueOf(this.f150874f);
        int length = String.valueOf(str).length();
        StringBuilder sb = new StringBuilder(length + 141 + String.valueOf(valueOf).length() + String.valueOf(valueOf2).length());
        sb.append("RemoteDevice{mDeviceTag=");
        sb.append(i);
        sb.append(",mPrettyName='");
        sb.append(str);
        sb.append("',mIsRestricted=");
        sb.append(z);
        sb.append(",mIsReportingEnabled=");
        sb.append(z2);
        sb.append(",mLastReportTimeMs=");
        sb.append(valueOf);
        sb.append(",mLastModificationTimeMs=");
        sb.append(valueOf2);
        sb.append("}");
        return sb.toString();
    }

    public RemoteDevice(bgws bgws) {
        this.f150869a = bgws.f117861a;
        this.f150870b = bgws.f117862b;
        this.f150871c = bgws.f117863c.booleanValue();
        this.f150872d = bgws.f117864d.booleanValue();
        this.f150873e = bgws.f117865e;
        this.f150874f = bgws.f117866f;
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
        see.m35063b(parcel, 2, this.f150869a);
        see.m35046a(parcel, 3, this.f150870b, false);
        see.m35051a(parcel, 4, this.f150871c);
        see.m35051a(parcel, 5, this.f150872d);
        see.m35045a(parcel, 6, this.f150873e);
        see.m35045a(parcel, 7, this.f150874f);
        see.m35062b(parcel, a);
    }
}
