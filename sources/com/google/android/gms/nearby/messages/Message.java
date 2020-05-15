package com.google.android.gms.nearby.messages;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.nearby.messages.devices.NearbyDevice;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class Message extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new aixc();

    /* renamed from: g */
    private static final NearbyDevice[] f80674g = {NearbyDevice.f80710a};

    /* renamed from: a */
    final int f80675a;

    /* renamed from: b */
    public final byte[] f80676b;

    /* renamed from: c */
    public final String f80677c;

    /* renamed from: d */
    public final String f80678d;
    @Deprecated

    /* renamed from: e */
    final NearbyDevice[] f80679e;

    /* renamed from: f */
    public final long f80680f;

    public Message(int i, byte[] bArr, String str, String str2, NearbyDevice[] nearbyDeviceArr, long j) {
        boolean z;
        boolean z2;
        this.f80675a = i;
        sdo.m34959a((Object) str2);
        this.f80677c = str2;
        this.f80678d = str == null ? "" : str;
        this.f80680f = j;
        sdo.m34959a(bArr);
        int length = bArr.length;
        if (length <= 102400) {
            z = true;
        } else {
            z = false;
        }
        sdo.m34976b(z, "Content length(%d) must not exceed MAX_CONTENT_SIZE_BYTES(%d)", Integer.valueOf(length), 102400);
        this.f80676b = bArr;
        this.f80679e = (nearbyDeviceArr == null || nearbyDeviceArr.length == 0) ? f80674g : nearbyDeviceArr;
        if (str2.length() <= 32) {
            z2 = true;
        } else {
            z2 = false;
        }
        sdo.m34976b(z2, "Type length(%d) must not exceed MAX_TYPE_LENGTH(%d)", Integer.valueOf(str2.length()), 32);
    }

    /* renamed from: a */
    public final boolean mo44301a() {
        return "__reserved_namespace".equals(this.f80678d);
    }

    /* renamed from: b */
    public final boolean mo44303b() {
        return mo44302a("__audio_bytes");
    }

    @Deprecated
    /* renamed from: c */
    public final NearbyDevice mo44304c() {
        return this.f80679e[0];
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Message) {
            Message message = (Message) obj;
            return TextUtils.equals(this.f80678d, message.f80678d) && TextUtils.equals(this.f80677c, message.f80677c) && Arrays.equals(this.f80676b, message.f80676b) && this.f80680f == message.f80680f;
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f80678d, this.f80677c, Integer.valueOf(Arrays.hashCode(this.f80676b)), Long.valueOf(this.f80680f)});
    }

    public final String toString() {
        String str = this.f80678d;
        String str2 = this.f80677c;
        byte[] bArr = this.f80676b;
        int length = bArr != null ? bArr.length : 0;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 59 + String.valueOf(str2).length());
        sb.append("Message{namespace='");
        sb.append(str);
        sb.append("', type='");
        sb.append(str2);
        sb.append("', content=[");
        sb.append(length);
        sb.append(" bytes]}");
        return sb.toString();
    }

    /* renamed from: a */
    public final boolean mo44302a(String str) {
        return mo44301a() && str.equals(this.f80677c);
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
        see.m35052a(parcel, 1, this.f80676b, false);
        see.m35046a(parcel, 2, this.f80677c, false);
        see.m35046a(parcel, 3, this.f80678d, false);
        see.m35057a(parcel, 4, this.f80679e, i);
        see.m35036a(parcel, 5, this.f80680f);
        see.m35063b(parcel, 1000, this.f80675a);
        see.m35062b(parcel, a);
    }

    public Message(byte[] bArr, String str, String str2, NearbyDevice nearbyDevice) {
        this(bArr, str, str2, new NearbyDevice[]{nearbyDevice}, 0);
    }

    public Message(byte[] bArr, String str, String str2, NearbyDevice[] nearbyDeviceArr, long j) {
        this(2, bArr, str, str2, nearbyDeviceArr, j);
    }
}
