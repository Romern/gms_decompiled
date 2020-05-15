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
public final class BeaconSeedEntity extends FastSafeParcelableJsonResponse implements ihh {
    public static final Parcelable.Creator CREATOR = new ihi();

    /* renamed from: e */
    private static final HashMap f10409e;

    /* renamed from: a */
    final Set f10410a;

    /* renamed from: b */
    String f10411b;

    /* renamed from: c */
    long f10412c;

    /* renamed from: d */
    long f10413d;

    static {
        HashMap hashMap = new HashMap();
        f10409e = hashMap;
        hashMap.put("data", FastJsonResponse$Field.m22666f("data", 2));
        f10409e.put("endTimeMillis", FastJsonResponse$Field.m22656b("endTimeMillis", 3));
        f10409e.put("startTimeMillis", FastJsonResponse$Field.m22656b("startTimeMillis", 4));
    }

    public BeaconSeedEntity() {
        this.f10410a = new HashSet();
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Map mo7367a() {
        return f10409e;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final Object mo7371b(FastJsonResponse$Field fastJsonResponse$Field) {
        int i = fastJsonResponse$Field.f30319g;
        if (i == 2) {
            return this.f10411b;
        }
        if (i == 3) {
            return Long.valueOf(this.f10412c);
        }
        if (i == 4) {
            return Long.valueOf(this.f10413d);
        }
        StringBuilder sb = new StringBuilder(38);
        sb.append("Unknown safe parcelable id=");
        sb.append(i);
        throw new IllegalStateException(sb.toString());
    }

    /* renamed from: b */
    public final String mo7555b() {
        return this.f10411b;
    }

    /* renamed from: bF */
    public final /* bridge */ /* synthetic */ Object mo7556bF() {
        return this;
    }

    /* renamed from: c */
    public final long mo7557c() {
        return this.f10412c;
    }

    /* renamed from: d */
    public final long mo7558d() {
        return this.f10413d;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof BeaconSeedEntity)) {
            return false;
        }
        if (this != obj) {
            BeaconSeedEntity beaconSeedEntity = (BeaconSeedEntity) obj;
            for (FastJsonResponse$Field fastJsonResponse$Field : f10409e.values()) {
                if (mo7370a(fastJsonResponse$Field)) {
                    if (!beaconSeedEntity.mo7370a(fastJsonResponse$Field) || !mo7371b(fastJsonResponse$Field).equals(beaconSeedEntity.mo7371b(fastJsonResponse$Field))) {
                        return false;
                    }
                } else if (beaconSeedEntity.mo7370a(fastJsonResponse$Field)) {
                    return false;
                }
            }
        }
        return true;
    }

    public final int hashCode() {
        int i = 0;
        for (FastJsonResponse$Field fastJsonResponse$Field : f10409e.values()) {
            if (mo7370a(fastJsonResponse$Field)) {
                i = i + fastJsonResponse$Field.f30319g + mo7371b(fastJsonResponse$Field).hashCode();
            }
        }
        return i;
    }

    public BeaconSeedEntity(Set set, String str, long j, long j2) {
        this.f10410a = set;
        this.f10411b = str;
        this.f10412c = j;
        this.f10413d = j2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo7394a(FastJsonResponse$Field fastJsonResponse$Field, String str, long j) {
        int i = fastJsonResponse$Field.f30319g;
        if (i == 3) {
            this.f10412c = j;
        } else if (i == 4) {
            this.f10413d = j;
        } else {
            StringBuilder sb = new StringBuilder(52);
            sb.append("Field with id=");
            sb.append(i);
            sb.append(" is not known to be a long.");
            throw new IllegalArgumentException(sb.toString());
        }
        this.f10410a.add(Integer.valueOf(i));
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
        Set set = this.f10410a;
        if (set.contains(2)) {
            see.m35046a(parcel, 2, this.f10411b, true);
        }
        if (set.contains(3)) {
            see.m35036a(parcel, 3, this.f10412c);
        }
        if (set.contains(4)) {
            see.m35036a(parcel, 4, this.f10413d);
        }
        see.m35062b(parcel, a);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo7376a(FastJsonResponse$Field fastJsonResponse$Field, String str, String str2) {
        int i = fastJsonResponse$Field.f30319g;
        if (i == 2) {
            this.f10411b = str2;
            this.f10410a.add(Integer.valueOf(i));
            return;
        }
        StringBuilder sb = new StringBuilder(54);
        sb.append("Field with id=");
        sb.append(i);
        sb.append(" is not known to be a String.");
        throw new IllegalArgumentException(sb.toString());
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo7370a(FastJsonResponse$Field fastJsonResponse$Field) {
        return this.f10410a.contains(Integer.valueOf(fastJsonResponse$Field.f30319g));
    }
}
