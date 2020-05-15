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
public final class DeviceClassifierEntity extends FastSafeParcelableJsonResponse implements ihk {
    public static final Parcelable.Creator CREATOR = new ihl();

    /* renamed from: f */
    private static final HashMap f10414f;

    /* renamed from: a */
    final Set f10415a;

    /* renamed from: b */
    long f10416b;

    /* renamed from: c */
    String f10417c;

    /* renamed from: d */
    long f10418d;

    /* renamed from: e */
    String f10419e;

    static {
        HashMap hashMap = new HashMap();
        f10414f = hashMap;
        hashMap.put("deviceOsVersionCode", FastJsonResponse$Field.m22656b("deviceOsVersionCode", 2));
        f10414f.put("deviceSoftwarePackage", FastJsonResponse$Field.m22666f("deviceSoftwarePackage", 3));
        f10414f.put("deviceSoftwareVersionCode", FastJsonResponse$Field.m22656b("deviceSoftwareVersionCode", 4));
        f10414f.put("deviceType", FastJsonResponse$Field.m22666f("deviceType", 5));
    }

    public DeviceClassifierEntity() {
        this.f10415a = new HashSet();
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Map mo7367a() {
        return f10414f;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final Object mo7371b(FastJsonResponse$Field fastJsonResponse$Field) {
        int i = fastJsonResponse$Field.f30319g;
        if (i == 2) {
            return Long.valueOf(this.f10416b);
        }
        if (i == 3) {
            return this.f10417c;
        }
        if (i == 4) {
            return Long.valueOf(this.f10418d);
        }
        if (i == 5) {
            return this.f10419e;
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
        if (!(obj instanceof DeviceClassifierEntity)) {
            return false;
        }
        if (this != obj) {
            DeviceClassifierEntity deviceClassifierEntity = (DeviceClassifierEntity) obj;
            for (FastJsonResponse$Field fastJsonResponse$Field : f10414f.values()) {
                if (mo7370a(fastJsonResponse$Field)) {
                    if (!deviceClassifierEntity.mo7370a(fastJsonResponse$Field) || !mo7371b(fastJsonResponse$Field).equals(deviceClassifierEntity.mo7371b(fastJsonResponse$Field))) {
                        return false;
                    }
                } else if (deviceClassifierEntity.mo7370a(fastJsonResponse$Field)) {
                    return false;
                }
            }
        }
        return true;
    }

    public final int hashCode() {
        int i = 0;
        for (FastJsonResponse$Field fastJsonResponse$Field : f10414f.values()) {
            if (mo7370a(fastJsonResponse$Field)) {
                i = i + fastJsonResponse$Field.f30319g + mo7371b(fastJsonResponse$Field).hashCode();
            }
        }
        return i;
    }

    public DeviceClassifierEntity(Set set, long j, String str, long j2, String str2) {
        this.f10415a = set;
        this.f10416b = j;
        this.f10417c = str;
        this.f10418d = j2;
        this.f10419e = str2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo7394a(FastJsonResponse$Field fastJsonResponse$Field, String str, long j) {
        int i = fastJsonResponse$Field.f30319g;
        if (i == 2) {
            this.f10416b = j;
        } else if (i == 4) {
            this.f10418d = j;
        } else {
            StringBuilder sb = new StringBuilder(52);
            sb.append("Field with id=");
            sb.append(i);
            sb.append(" is not known to be a long.");
            throw new IllegalArgumentException(sb.toString());
        }
        this.f10415a.add(Integer.valueOf(i));
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
        Set set = this.f10415a;
        if (set.contains(2)) {
            see.m35036a(parcel, 2, this.f10416b);
        }
        if (set.contains(3)) {
            see.m35046a(parcel, 3, this.f10417c, true);
        }
        if (set.contains(4)) {
            see.m35036a(parcel, 4, this.f10418d);
        }
        if (set.contains(5)) {
            see.m35046a(parcel, 5, this.f10419e, true);
        }
        see.m35062b(parcel, a);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo7376a(FastJsonResponse$Field fastJsonResponse$Field, String str, String str2) {
        int i = fastJsonResponse$Field.f30319g;
        if (i == 3) {
            this.f10417c = str2;
        } else if (i == 5) {
            this.f10419e = str2;
        } else {
            StringBuilder sb = new StringBuilder(54);
            sb.append("Field with id=");
            sb.append(i);
            sb.append(" is not known to be a String.");
            throw new IllegalArgumentException(sb.toString());
        }
        this.f10415a.add(Integer.valueOf(i));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo7370a(FastJsonResponse$Field fastJsonResponse$Field) {
        return this.f10415a.contains(Integer.valueOf(fastJsonResponse$Field.f30319g));
    }
}
