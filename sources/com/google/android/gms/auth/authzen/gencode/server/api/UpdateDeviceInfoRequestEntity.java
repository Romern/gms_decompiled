package com.google.android.gms.auth.authzen.gencode.server.api;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.server.response.FastJsonResponse$Field;
import com.google.android.gms.common.server.response.FastSafeParcelableJsonResponse;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class UpdateDeviceInfoRequestEntity extends FastSafeParcelableJsonResponse implements rty {
    public static final Parcelable.Creator CREATOR = new iic();

    /* renamed from: g */
    private static final HashMap f10473g;

    /* renamed from: a */
    final Set f10474a;

    /* renamed from: b */
    DeviceClassifierEntity f10475b;

    /* renamed from: c */
    String f10476c;

    /* renamed from: d */
    int f10477d;

    /* renamed from: e */
    String f10478e;

    /* renamed from: f */
    int f10479f;

    static {
        HashMap hashMap = new HashMap();
        f10473g = hashMap;
        hashMap.put("deviceClassifier", FastJsonResponse$Field.m22653a("deviceClassifier", 2, DeviceClassifierEntity.class));
        f10473g.put("deviceInfoUpdate", FastJsonResponse$Field.m22666f("deviceInfoUpdate", 3));
        f10473g.put("invocationReason", FastJsonResponse$Field.m22651a("invocationReason", 4));
        f10473g.put("protocolType", FastJsonResponse$Field.m22666f("protocolType", 5));
        f10473g.put("retryCount", FastJsonResponse$Field.m22651a("retryCount", 6));
    }

    public UpdateDeviceInfoRequestEntity() {
        this.f10474a = new HashSet();
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Map mo7367a() {
        return f10473g;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final Object mo7371b(FastJsonResponse$Field fastJsonResponse$Field) {
        int i = fastJsonResponse$Field.f30319g;
        if (i == 2) {
            return this.f10475b;
        }
        if (i == 3) {
            return this.f10476c;
        }
        if (i == 4) {
            return Integer.valueOf(this.f10477d);
        }
        if (i == 5) {
            return this.f10478e;
        }
        if (i == 6) {
            return Integer.valueOf(this.f10479f);
        }
        StringBuilder sb = new StringBuilder(38);
        sb.append("Unknown safe parcelable id=");
        sb.append(i);
        throw new IllegalStateException(sb.toString());
    }

    /* renamed from: bF */
    public final /* bridge */ /* synthetic */ Object mo7556bF() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof UpdateDeviceInfoRequestEntity)) {
            return false;
        }
        if (this != obj) {
            UpdateDeviceInfoRequestEntity updateDeviceInfoRequestEntity = (UpdateDeviceInfoRequestEntity) obj;
            for (FastJsonResponse$Field fastJsonResponse$Field : f10473g.values()) {
                if (mo7370a(fastJsonResponse$Field)) {
                    if (!updateDeviceInfoRequestEntity.mo7370a(fastJsonResponse$Field) || !mo7371b(fastJsonResponse$Field).equals(updateDeviceInfoRequestEntity.mo7371b(fastJsonResponse$Field))) {
                        return false;
                    }
                } else if (updateDeviceInfoRequestEntity.mo7370a(fastJsonResponse$Field)) {
                    return false;
                }
            }
        }
        return true;
    }

    public final int hashCode() {
        int i = 0;
        for (FastJsonResponse$Field fastJsonResponse$Field : f10473g.values()) {
            if (mo7370a(fastJsonResponse$Field)) {
                i = i + fastJsonResponse$Field.f30319g + mo7371b(fastJsonResponse$Field).hashCode();
            }
        }
        return i;
    }

    public UpdateDeviceInfoRequestEntity(Set set, DeviceClassifierEntity deviceClassifierEntity, String str, int i, String str2, int i2) {
        this.f10474a = set;
        this.f10475b = deviceClassifierEntity;
        this.f10476c = str;
        this.f10477d = i;
        this.f10478e = str2;
        this.f10479f = i2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo7391a(FastJsonResponse$Field fastJsonResponse$Field, String str, int i) {
        int i2 = fastJsonResponse$Field.f30319g;
        if (i2 == 4) {
            this.f10477d = i;
        } else if (i2 == 6) {
            this.f10479f = i;
        } else {
            StringBuilder sb = new StringBuilder(52);
            sb.append("Field with id=");
            sb.append(i2);
            sb.append(" is not known to be an int.");
            throw new IllegalArgumentException(sb.toString());
        }
        this.f10474a.add(Integer.valueOf(i2));
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
        Set set = this.f10474a;
        if (set.contains(2)) {
            see.m35040a(parcel, 2, this.f10475b, i, true);
        }
        if (set.contains(3)) {
            see.m35046a(parcel, 3, this.f10476c, true);
        }
        if (set.contains(4)) {
            see.m35063b(parcel, 4, this.f10477d);
        }
        if (set.contains(5)) {
            see.m35046a(parcel, 5, this.f10478e, true);
        }
        if (set.contains(6)) {
            see.m35063b(parcel, 6, this.f10479f);
        }
        see.m35062b(parcel, a);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo7376a(FastJsonResponse$Field fastJsonResponse$Field, String str, String str2) {
        int i = fastJsonResponse$Field.f30319g;
        if (i == 3) {
            this.f10476c = str2;
        } else if (i == 5) {
            this.f10478e = str2;
        } else {
            StringBuilder sb = new StringBuilder(54);
            sb.append("Field with id=");
            sb.append(i);
            sb.append(" is not known to be a String.");
            throw new IllegalArgumentException(sb.toString());
        }
        this.f10474a.add(Integer.valueOf(i));
    }

    /* renamed from: a */
    public final void mo7369a(FastJsonResponse$Field fastJsonResponse$Field, String str, sio sio) {
        int i = fastJsonResponse$Field.f30319g;
        if (i == 2) {
            this.f10475b = (DeviceClassifierEntity) sio;
            this.f10474a.add(Integer.valueOf(i));
            return;
        }
        String canonicalName = sio.getClass().getCanonicalName();
        StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 62);
        sb.append("Field with id=");
        sb.append(i);
        sb.append(" is not a known custom type.  Found ");
        sb.append(canonicalName);
        sb.append(".");
        throw new IllegalArgumentException(sb.toString());
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo7370a(FastJsonResponse$Field fastJsonResponse$Field) {
        return this.f10474a.contains(Integer.valueOf(fastJsonResponse$Field.f30319g));
    }
}
