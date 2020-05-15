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
public final class ClientLoggedCircleEntity extends FastSafeParcelableJsonResponse implements aogc {
    public static final Parcelable.Creator CREATOR = new aogd();

    /* renamed from: d */
    private static final HashMap f82869d;

    /* renamed from: a */
    final Set f82870a;

    /* renamed from: b */
    final int f82871b;

    /* renamed from: c */
    String f82872c;

    static {
        HashMap hashMap = new HashMap();
        f82869d = hashMap;
        hashMap.put("circleId", FastJsonResponse$Field.m22666f("circleId", 2));
    }

    public ClientLoggedCircleEntity() {
        this.f82871b = 1;
        this.f82870a = new HashSet();
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Map mo7367a() {
        return f82869d;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final Object mo7371b(FastJsonResponse$Field fastJsonResponse$Field) {
        int i = fastJsonResponse$Field.f30319g;
        if (i == 2) {
            return this.f82872c;
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
        if (!(obj instanceof ClientLoggedCircleEntity)) {
            return false;
        }
        if (this != obj) {
            ClientLoggedCircleEntity clientLoggedCircleEntity = (ClientLoggedCircleEntity) obj;
            for (FastJsonResponse$Field fastJsonResponse$Field : f82869d.values()) {
                if (mo7370a(fastJsonResponse$Field)) {
                    if (!clientLoggedCircleEntity.mo7370a(fastJsonResponse$Field) || !mo7371b(fastJsonResponse$Field).equals(clientLoggedCircleEntity.mo7371b(fastJsonResponse$Field))) {
                        return false;
                    }
                } else if (clientLoggedCircleEntity.mo7370a(fastJsonResponse$Field)) {
                    return false;
                }
            }
        }
        return true;
    }

    public final int hashCode() {
        int i = 0;
        for (FastJsonResponse$Field fastJsonResponse$Field : f82869d.values()) {
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
        if (i == 2) {
            this.f82872c = str2;
            this.f82870a.add(Integer.valueOf(i));
            return;
        }
        StringBuilder sb = new StringBuilder(54);
        sb.append("Field with id=");
        sb.append(i);
        sb.append(" is not known to be a String.");
        throw new IllegalArgumentException(sb.toString());
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
        Set set = this.f82870a;
        if (set.contains(1)) {
            see.m35063b(parcel, 1, this.f82871b);
        }
        if (set.contains(2)) {
            see.m35046a(parcel, 2, this.f82872c, true);
        }
        see.m35062b(parcel, a);
    }

    public ClientLoggedCircleEntity(Set set, int i, String str) {
        this.f82870a = set;
        this.f82871b = i;
        this.f82872c = str;
    }

    public ClientLoggedCircleEntity(Set set, String str) {
        this.f82870a = set;
        this.f82871b = 1;
        this.f82872c = str;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo7370a(FastJsonResponse$Field fastJsonResponse$Field) {
        return this.f82870a.contains(Integer.valueOf(fastJsonResponse$Field.f30319g));
    }
}
