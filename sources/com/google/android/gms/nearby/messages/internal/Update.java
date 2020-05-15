package com.google.android.gms.nearby.messages.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.nearby.messages.Message;
import com.google.android.gms.nearby.messages.devices.NearbyDevice;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class Update extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new ajdw();

    /* renamed from: a */
    final int f80793a;

    /* renamed from: b */
    public final int f80794b;

    /* renamed from: c */
    public final Message f80795c;

    /* renamed from: d */
    public final DistanceImpl f80796d;

    /* renamed from: e */
    public final BleSignalImpl f80797e;

    /* renamed from: f */
    public final NearbyDevice f80798f;

    /* renamed from: g */
    public final byte[] f80799g;

    public Update(int i, int i2, Message message, DistanceImpl distanceImpl, BleSignalImpl bleSignalImpl, NearbyDevice nearbyDevice, byte[] bArr) {
        this.f80793a = i;
        boolean a = m67408a(i2, 2);
        bArr = a ? null : bArr;
        nearbyDevice = a ? null : nearbyDevice;
        bleSignalImpl = a ? null : bleSignalImpl;
        distanceImpl = a ? null : distanceImpl;
        this.f80794b = a ? 2 : i2;
        this.f80795c = message;
        this.f80796d = distanceImpl;
        this.f80797e = bleSignalImpl;
        this.f80798f = nearbyDevice;
        this.f80799g = bArr;
    }

    /* renamed from: a */
    public static boolean m67408a(int i, int i2) {
        return (i & i2) != 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Update) {
            Update update = (Update) obj;
            return this.f80794b == update.f80794b && sdg.m34949a(this.f80795c, update.f80795c) && sdg.m34949a(this.f80796d, update.f80796d) && sdg.m34949a(this.f80797e, update.f80797e) && sdg.m34949a(this.f80798f, update.f80798f) && Arrays.equals(this.f80799g, update.f80799g);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f80794b), this.f80795c, this.f80796d, this.f80797e, this.f80798f, this.f80799g});
    }

    public final String toString() {
        C1225nr nrVar = new C1225nr();
        if (mo44364a(1)) {
            nrVar.add("FOUND");
        }
        if (mo44364a(2)) {
            nrVar.add("LOST");
        }
        if (mo44364a(4)) {
            nrVar.add("DISTANCE");
        }
        if (mo44364a(8)) {
            nrVar.add("BLE_SIGNAL");
        }
        if (mo44364a(16)) {
            nrVar.add("DEVICE");
        }
        if (mo44364a(32)) {
            nrVar.add("BLE_RECORD");
        }
        String valueOf = String.valueOf(nrVar);
        String valueOf2 = String.valueOf(this.f80795c);
        String valueOf3 = String.valueOf(this.f80796d);
        String valueOf4 = String.valueOf(this.f80797e);
        String valueOf5 = String.valueOf(this.f80798f);
        String valueOf6 = String.valueOf(aizv.m58305a(this.f80799g));
        int length = String.valueOf(valueOf).length();
        int length2 = String.valueOf(valueOf2).length();
        int length3 = String.valueOf(valueOf3).length();
        int length4 = String.valueOf(valueOf4).length();
        StringBuilder sb = new StringBuilder(length + 68 + length2 + length3 + length4 + String.valueOf(valueOf5).length() + String.valueOf(valueOf6).length());
        sb.append("Update{types=");
        sb.append(valueOf);
        sb.append(", message=");
        sb.append(valueOf2);
        sb.append(", distance=");
        sb.append(valueOf3);
        sb.append(", bleSignal=");
        sb.append(valueOf4);
        sb.append(", device=");
        sb.append(valueOf5);
        sb.append(", bleRecord=");
        sb.append(valueOf6);
        sb.append("}");
        return sb.toString();
    }

    /* renamed from: a */
    public final String mo44363a() {
        String str = this.f80795c.mo44304c().f80713d;
        String valueOf = String.valueOf(this.f80796d);
        String valueOf2 = String.valueOf(this.f80797e);
        int length = String.valueOf(str).length();
        StringBuilder sb = new StringBuilder(length + 39 + String.valueOf(valueOf).length() + String.valueOf(valueOf2).length());
        sb.append("Update{address=");
        sb.append(str);
        sb.append(", distance=");
        sb.append(valueOf);
        sb.append(", bleSignal=");
        sb.append(valueOf2);
        sb.append("}");
        return sb.toString();
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
        see.m35063b(parcel, 1, this.f80793a);
        see.m35063b(parcel, 2, this.f80794b);
        see.m35040a(parcel, 3, this.f80795c, i, false);
        see.m35040a(parcel, 4, this.f80796d, i, false);
        see.m35040a(parcel, 5, this.f80797e, i, false);
        see.m35040a(parcel, 6, this.f80798f, i, false);
        see.m35052a(parcel, 7, this.f80799g, false);
        see.m35062b(parcel, a);
    }

    /* renamed from: a */
    public final boolean mo44364a(int i) {
        return m67408a(this.f80794b, i);
    }
}
