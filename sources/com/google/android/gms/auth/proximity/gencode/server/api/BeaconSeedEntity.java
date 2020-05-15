package com.google.android.gms.auth.proximity.gencode.server.api;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.server.response.FastJsonResponse$Field;
import com.google.android.gms.common.server.response.FastSafeParcelableJsonResponse;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class BeaconSeedEntity extends FastSafeParcelableJsonResponse implements jrh {
    public static final Parcelable.Creator CREATOR = new jri();

    /* renamed from: e */
    private static final HashMap f11204e;

    /* renamed from: a */
    final Set f11205a;

    /* renamed from: b */
    String f11206b;

    /* renamed from: c */
    long f11207c;

    /* renamed from: d */
    long f11208d;

    static {
        HashMap hashMap = new HashMap();
        f11204e = hashMap;
        hashMap.put("data", FastJsonResponse$Field.m22666f("data", 2));
        f11204e.put("endTimeMillis", FastJsonResponse$Field.m22656b("endTimeMillis", 3));
        f11204e.put("startTimeMillis", FastJsonResponse$Field.m22656b("startTimeMillis", 4));
    }

    public BeaconSeedEntity() {
        this.f11205a = new HashSet();
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Map mo7367a() {
        return f11204e;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final Object mo7371b(FastJsonResponse$Field fastJsonResponse$Field) {
        int i = fastJsonResponse$Field.f30319g;
        if (i == 2) {
            return this.f11206b;
        }
        if (i == 3) {
            return Long.valueOf(this.f11207c);
        }
        if (i == 4) {
            return Long.valueOf(this.f11208d);
        }
        StringBuilder sb = new StringBuilder(38);
        sb.append("Unknown safe parcelable id=");
        sb.append(i);
        throw new IllegalStateException(sb.toString());
    }

    /* renamed from: b */
    public final String mo7822b() {
        return this.f11206b;
    }

    /* renamed from: bF */
    public final /* bridge */ /* synthetic */ Object mo7556bF() {
        return this;
    }

    /* renamed from: c */
    public final boolean mo7823c() {
        return this.f11205a.contains(2);
    }

    /* renamed from: d */
    public final long mo7824d() {
        return this.f11207c;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof BeaconSeedEntity)) {
            return false;
        }
        if (this != obj) {
            BeaconSeedEntity beaconSeedEntity = (BeaconSeedEntity) obj;
            for (FastJsonResponse$Field fastJsonResponse$Field : f11204e.values()) {
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

    /* renamed from: f */
    public final boolean mo7825f() {
        return this.f11205a.contains(3);
    }

    /* renamed from: g */
    public final long mo7826g() {
        return this.f11208d;
    }

    /* renamed from: h */
    public final boolean mo7827h() {
        return this.f11205a.contains(4);
    }

    public final int hashCode() {
        int i = 0;
        for (FastJsonResponse$Field fastJsonResponse$Field : f11204e.values()) {
            if (mo7370a(fastJsonResponse$Field)) {
                i = i + fastJsonResponse$Field.f30319g + mo7371b(fastJsonResponse$Field).hashCode();
            }
        }
        return i;
    }

    public BeaconSeedEntity(Set set, String str, long j, long j2) {
        this.f11205a = set;
        this.f11206b = str;
        this.f11207c = j;
        this.f11208d = j2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo7394a(FastJsonResponse$Field fastJsonResponse$Field, String str, long j) {
        int i = fastJsonResponse$Field.f30319g;
        if (i == 3) {
            this.f11207c = j;
        } else if (i == 4) {
            this.f11208d = j;
        } else {
            StringBuilder sb = new StringBuilder(52);
            sb.append("Field with id=");
            sb.append(i);
            sb.append(" is not known to be a long.");
            throw new IllegalArgumentException(sb.toString());
        }
        this.f11205a.add(Integer.valueOf(i));
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
        Set set = this.f11205a;
        if (set.contains(2)) {
            see.m35046a(parcel, 2, this.f11206b, true);
        }
        if (set.contains(3)) {
            see.m35036a(parcel, 3, this.f11207c);
        }
        if (set.contains(4)) {
            see.m35036a(parcel, 4, this.f11208d);
        }
        see.m35062b(parcel, a);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo7376a(FastJsonResponse$Field fastJsonResponse$Field, String str, String str2) {
        int i = fastJsonResponse$Field.f30319g;
        if (i == 2) {
            this.f11206b = str2;
            this.f11205a.add(Integer.valueOf(i));
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
        return this.f11205a.contains(Integer.valueOf(fastJsonResponse$Field.f30319g));
    }
}
