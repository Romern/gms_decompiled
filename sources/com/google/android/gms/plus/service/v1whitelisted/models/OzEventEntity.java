package com.google.android.gms.plus.service.v1whitelisted.models;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.server.response.FastJsonResponse$Field;
import com.google.android.gms.common.server.response.FastSafeParcelableJsonResponse;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class OzEventEntity extends FastSafeParcelableJsonResponse implements rty {
    public static final Parcelable.Creator CREATOR = new aohp();

    /* renamed from: i */
    private static final HashMap f82994i;

    /* renamed from: a */
    final Set f82995a;

    /* renamed from: b */
    final int f82996b;

    /* renamed from: c */
    ActionTargetEntity f82997c;

    /* renamed from: d */
    OzDeviceInfoEntity f82998d;

    /* renamed from: e */
    FavaDiagnosticsEntity f82999e;

    /* renamed from: f */
    boolean f83000f;

    /* renamed from: g */
    String f83001g;

    /* renamed from: h */
    String f83002h;

    static {
        HashMap hashMap = new HashMap();
        f82994i = hashMap;
        hashMap.put("actionTarget", FastJsonResponse$Field.m22653a("actionTarget", 2, ActionTargetEntity.class));
        f82994i.put("deviceInfo", FastJsonResponse$Field.m22653a("deviceInfo", 5, OzDeviceInfoEntity.class));
        f82994i.put("favaDiagnostics", FastJsonResponse$Field.m22653a("favaDiagnostics", 7, FavaDiagnosticsEntity.class));
        f82994i.put("isNativePlatformEvent", FastJsonResponse$Field.m22664e("isNativePlatformEvent", 10));
        f82994i.put("thirdPartyAppName", FastJsonResponse$Field.m22666f("thirdPartyAppName", 14));
        f82994i.put("thirdPartyCertificateHash", FastJsonResponse$Field.m22666f("thirdPartyCertificateHash", 15));
    }

    public OzEventEntity() {
        this.f82996b = 1;
        this.f82995a = new HashSet();
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Map mo7367a() {
        return f82994i;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final Object mo7371b(FastJsonResponse$Field fastJsonResponse$Field) {
        int i = fastJsonResponse$Field.f30319g;
        if (i == 2) {
            return this.f82997c;
        }
        if (i == 5) {
            return this.f82998d;
        }
        if (i == 7) {
            return this.f82999e;
        }
        if (i == 10) {
            return Boolean.valueOf(this.f83000f);
        }
        if (i == 14) {
            return this.f83001g;
        }
        if (i == 15) {
            return this.f83002h;
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
        if (!(obj instanceof OzEventEntity)) {
            return false;
        }
        if (this != obj) {
            OzEventEntity ozEventEntity = (OzEventEntity) obj;
            for (FastJsonResponse$Field fastJsonResponse$Field : f82994i.values()) {
                if (mo7370a(fastJsonResponse$Field)) {
                    if (!ozEventEntity.mo7370a(fastJsonResponse$Field) || !mo7371b(fastJsonResponse$Field).equals(ozEventEntity.mo7371b(fastJsonResponse$Field))) {
                        return false;
                    }
                } else if (ozEventEntity.mo7370a(fastJsonResponse$Field)) {
                    return false;
                }
            }
        }
        return true;
    }

    public final int hashCode() {
        int i = 0;
        for (FastJsonResponse$Field fastJsonResponse$Field : f82994i.values()) {
            if (mo7370a(fastJsonResponse$Field)) {
                i = i + fastJsonResponse$Field.f30319g + mo7371b(fastJsonResponse$Field).hashCode();
            }
        }
        return i;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo7376a(FastJsonResponse$Field fastJsonResponse$Field, String str, String str2) {
        int i = fastJsonResponse$Field.f30319g;
        if (i == 14) {
            this.f83001g = str2;
        } else if (i == 15) {
            this.f83002h = str2;
        } else {
            StringBuilder sb = new StringBuilder(54);
            sb.append("Field with id=");
            sb.append(i);
            sb.append(" is not known to be a String.");
            throw new IllegalArgumentException(sb.toString());
        }
        this.f82995a.add(Integer.valueOf(i));
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
        Set set = this.f82995a;
        if (set.contains(1)) {
            see.m35063b(parcel, 1, this.f82996b);
        }
        if (set.contains(2)) {
            see.m35040a(parcel, 2, this.f82997c, i, true);
        }
        if (set.contains(5)) {
            see.m35040a(parcel, 5, this.f82998d, i, true);
        }
        if (set.contains(7)) {
            see.m35040a(parcel, 7, this.f82999e, i, true);
        }
        if (set.contains(10)) {
            see.m35051a(parcel, 10, this.f83000f);
        }
        if (set.contains(14)) {
            see.m35046a(parcel, 14, this.f83001g, true);
        }
        if (set.contains(15)) {
            see.m35046a(parcel, 15, this.f83002h, true);
        }
        see.m35062b(parcel, a);
    }

    public OzEventEntity(Set set, int i, ActionTargetEntity actionTargetEntity, OzDeviceInfoEntity ozDeviceInfoEntity, FavaDiagnosticsEntity favaDiagnosticsEntity, boolean z, String str, String str2) {
        this.f82995a = set;
        this.f82996b = i;
        this.f82997c = actionTargetEntity;
        this.f82998d = ozDeviceInfoEntity;
        this.f82999e = favaDiagnosticsEntity;
        this.f83000f = z;
        this.f83001g = str;
        this.f83002h = str2;
    }

    public OzEventEntity(Set set, ActionTargetEntity actionTargetEntity, OzDeviceInfoEntity ozDeviceInfoEntity, FavaDiagnosticsEntity favaDiagnosticsEntity, boolean z, String str, String str2) {
        this.f82995a = set;
        this.f82996b = 1;
        this.f82997c = actionTargetEntity;
        this.f82998d = ozDeviceInfoEntity;
        this.f82999e = favaDiagnosticsEntity;
        this.f83000f = z;
        this.f83001g = str;
        this.f83002h = str2;
    }

    /* renamed from: a */
    public final void mo7369a(FastJsonResponse$Field fastJsonResponse$Field, String str, sio sio) {
        int i = fastJsonResponse$Field.f30319g;
        if (i == 2) {
            this.f82997c = (ActionTargetEntity) sio;
        } else if (i == 5) {
            this.f82998d = (OzDeviceInfoEntity) sio;
        } else if (i == 7) {
            this.f82999e = (FavaDiagnosticsEntity) sio;
        } else {
            String canonicalName = sio.getClass().getCanonicalName();
            StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 62);
            sb.append("Field with id=");
            sb.append(i);
            sb.append(" is not a known custom type.  Found ");
            sb.append(canonicalName);
            sb.append(".");
            throw new IllegalArgumentException(sb.toString());
        }
        this.f82995a.add(Integer.valueOf(i));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo7395a(FastJsonResponse$Field fastJsonResponse$Field, String str, boolean z) {
        int i = fastJsonResponse$Field.f30319g;
        if (i == 10) {
            this.f83000f = z;
            this.f82995a.add(Integer.valueOf(i));
            return;
        }
        StringBuilder sb = new StringBuilder(55);
        sb.append("Field with id=");
        sb.append(i);
        sb.append(" is not known to be a boolean.");
        throw new IllegalArgumentException(sb.toString());
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo7370a(FastJsonResponse$Field fastJsonResponse$Field) {
        return this.f82995a.contains(Integer.valueOf(fastJsonResponse$Field.f30319g));
    }
}
