package com.google.android.gms.smartdevice.d2d;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.server.response.FastJsonResponse$Field;
import com.google.android.gms.smartdevice.utils.BinarySerializableFastSafeParcelableJson;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class D2DDevice extends BinarySerializableFastSafeParcelableJson {
    public static final Parcelable.Creator CREATOR = new aqzl();

    /* renamed from: i */
    private static final HashMap f107871i;

    /* renamed from: a */
    final Set f107872a;

    /* renamed from: b */
    public int f107873b;

    /* renamed from: c */
    public String f107874c;

    /* renamed from: d */
    public String f107875d;

    /* renamed from: e */
    public byte f107876e;
    @Deprecated

    /* renamed from: f */
    public String f107877f;
    @Deprecated

    /* renamed from: g */
    public byte[] f107878g;

    /* renamed from: h */
    public int f107879h;

    static {
        HashMap hashMap = new HashMap();
        f107871i = hashMap;
        hashMap.put("protocol", FastJsonResponse$Field.m22651a("protocol", 2));
        f107871i.put("name", FastJsonResponse$Field.m22666f("name", 3));
        f107871i.put("deviceId", FastJsonResponse$Field.m22666f("deviceId", 4));
        f107871i.put("deviceType", FastJsonResponse$Field.m22651a("deviceType", 5));
        f107871i.put("btUuid", FastJsonResponse$Field.m22666f("btUuid", 6));
        f107871i.put("cryptAuthHello", FastJsonResponse$Field.m22669h("cryptAuthHello", 7));
        f107871i.put("bluetoothMacAddr", FastJsonResponse$Field.m22666f("bluetoothMacAddr", 8));
        f107871i.put("verificationStyle", FastJsonResponse$Field.m22651a("verificationStyle", 9));
    }

    public D2DDevice() {
        this.f107872a = new HashSet();
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Map mo7367a() {
        return f107871i;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final Object mo7371b(FastJsonResponse$Field fastJsonResponse$Field) {
        int i = fastJsonResponse$Field.f30319g;
        switch (i) {
            case 2:
                return Integer.valueOf(this.f107873b);
            case 3:
                return this.f107874c;
            case 4:
                return this.f107875d;
            case 5:
                return Byte.valueOf(this.f107876e);
            case 6:
                return this.f107877f;
            case 7:
                return this.f107878g;
            case 8:
            default:
                StringBuilder sb = new StringBuilder(37);
                sb.append("Unknown SafeParcelable id=");
                sb.append(i);
                throw new IllegalStateException(sb.toString());
            case 9:
                return Integer.valueOf(this.f107879h);
        }
    }

    /* renamed from: e */
    public final void mo59073e(String str) {
        this.f107874c = str;
        this.f107872a.add(3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        D2DDevice d2DDevice = (D2DDevice) obj;
        String str = this.f107874c;
        if (str == null ? d2DDevice.f107874c != null : !str.equals(d2DDevice.f107874c)) {
            return false;
        }
        String str2 = this.f107875d;
        if (str2 != null) {
            return str2.equals(d2DDevice.f107875d);
        }
        return d2DDevice.f107875d == null;
    }

    /* renamed from: f */
    public final void mo59074f(String str) {
        this.f107875d = str;
        this.f107872a.add(4);
    }

    public final int hashCode() {
        String str = this.f107874c;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f107875d;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }

    public D2DDevice(int i, String str, String str2, byte b, int i2) {
        this();
        mo59072a(i);
        mo59073e(str);
        mo59074f(str2);
        mo59071a(b);
        this.f107877f = null;
        this.f107872a.add(6);
        this.f107878g = null;
        this.f107872a.add(7);
        this.f107879h = i2;
        this.f107872a.add(9);
    }

    /* renamed from: a */
    public final void mo59071a(byte b) {
        this.f107876e = b;
        this.f107872a.add(5);
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
        Set set = this.f107872a;
        if (set.contains(2)) {
            see.m35063b(parcel, 2, this.f107873b);
        }
        if (set.contains(3)) {
            see.m35046a(parcel, 3, this.f107874c, true);
        }
        if (set.contains(4)) {
            see.m35046a(parcel, 4, this.f107875d, true);
        }
        if (set.contains(5)) {
            see.m35032a(parcel, 5, this.f107876e);
        }
        if (set.contains(6)) {
            see.m35046a(parcel, 6, this.f107877f, true);
        }
        if (set.contains(7)) {
            see.m35052a(parcel, 7, this.f107878g, true);
        }
        if (set.contains(9)) {
            see.m35063b(parcel, 9, this.f107879h);
        }
        see.m35062b(parcel, a);
    }

    /* renamed from: a */
    public final void mo59072a(int i) {
        this.f107873b = i;
        this.f107872a.add(2);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo7391a(FastJsonResponse$Field fastJsonResponse$Field, String str, int i) {
        int i2 = fastJsonResponse$Field.f30319g;
        if (i2 == 2) {
            this.f107873b = i;
        } else if (i2 == 5) {
            this.f107876e = (byte) i;
        } else if (i2 == 9) {
            this.f107879h = i;
        } else {
            StringBuilder sb = new StringBuilder(52);
            sb.append("Field with id=");
            sb.append(i2);
            sb.append(" is not known to be an int.");
            throw new IllegalArgumentException(sb.toString());
        }
        this.f107872a.add(Integer.valueOf(i2));
    }

    public D2DDevice(Set set, int i, String str, String str2, byte b, String str3, byte[] bArr, int i2) {
        this.f107872a = set;
        this.f107873b = i;
        this.f107874c = str;
        this.f107875d = str2;
        this.f107876e = b;
        this.f107877f = str3;
        this.f107878g = bArr;
        this.f107879h = i2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo7376a(FastJsonResponse$Field fastJsonResponse$Field, String str, String str2) {
        int i = fastJsonResponse$Field.f30319g;
        if (i == 3) {
            this.f107874c = str2;
        } else if (i == 4) {
            this.f107875d = str2;
        } else if (i == 6) {
            this.f107877f = str2;
        } else if (i != 8) {
            throw new IllegalArgumentException(String.format("Field with id=%d is not known to be a string.", Integer.valueOf(i)));
        }
        this.f107872a.add(Integer.valueOf(i));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo7392a(FastJsonResponse$Field fastJsonResponse$Field, String str, byte[] bArr) {
        int i = fastJsonResponse$Field.f30319g;
        if (i == 7) {
            this.f107878g = bArr;
            this.f107872a.add(Integer.valueOf(i));
            return;
        }
        StringBuilder sb = new StringBuilder(59);
        sb.append("Field with id=");
        sb.append(i);
        sb.append(" is not known to be an byte array.");
        throw new IllegalArgumentException(sb.toString());
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo7370a(FastJsonResponse$Field fastJsonResponse$Field) {
        return this.f107872a.contains(Integer.valueOf(fastJsonResponse$Field.f30319g));
    }
}
