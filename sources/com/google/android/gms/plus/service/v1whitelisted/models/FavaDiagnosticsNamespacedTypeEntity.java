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
public final class FavaDiagnosticsNamespacedTypeEntity extends FastSafeParcelableJsonResponse implements aohc {
    public static final Parcelable.Creator CREATOR = new aohd();

    /* renamed from: e */
    private static final HashMap f82940e;

    /* renamed from: a */
    final Set f82941a;

    /* renamed from: b */
    final int f82942b;

    /* renamed from: c */
    String f82943c;

    /* renamed from: d */
    int f82944d;

    static {
        HashMap hashMap = new HashMap();
        f82940e = hashMap;
        hashMap.put("namespace", FastJsonResponse$Field.m22666f("namespace", 2));
        f82940e.put("typeNum", FastJsonResponse$Field.m22651a("typeNum", 3));
    }

    public FavaDiagnosticsNamespacedTypeEntity() {
        this.f82942b = 1;
        this.f82941a = new HashSet();
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Map mo7367a() {
        return f82940e;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final Object mo7371b(FastJsonResponse$Field fastJsonResponse$Field) {
        int i = fastJsonResponse$Field.f30319g;
        if (i == 2) {
            return this.f82943c;
        }
        if (i == 3) {
            return Integer.valueOf(this.f82944d);
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
        if (!(obj instanceof FavaDiagnosticsNamespacedTypeEntity)) {
            return false;
        }
        if (this != obj) {
            FavaDiagnosticsNamespacedTypeEntity favaDiagnosticsNamespacedTypeEntity = (FavaDiagnosticsNamespacedTypeEntity) obj;
            for (FastJsonResponse$Field fastJsonResponse$Field : f82940e.values()) {
                if (mo7370a(fastJsonResponse$Field)) {
                    if (!favaDiagnosticsNamespacedTypeEntity.mo7370a(fastJsonResponse$Field) || !mo7371b(fastJsonResponse$Field).equals(favaDiagnosticsNamespacedTypeEntity.mo7371b(fastJsonResponse$Field))) {
                        return false;
                    }
                } else if (favaDiagnosticsNamespacedTypeEntity.mo7370a(fastJsonResponse$Field)) {
                    return false;
                }
            }
        }
        return true;
    }

    public final int hashCode() {
        int i = 0;
        for (FastJsonResponse$Field fastJsonResponse$Field : f82940e.values()) {
            if (mo7370a(fastJsonResponse$Field)) {
                i = i + fastJsonResponse$Field.f30319g + mo7371b(fastJsonResponse$Field).hashCode();
            }
        }
        return i;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo7391a(FastJsonResponse$Field fastJsonResponse$Field, String str, int i) {
        int i2 = fastJsonResponse$Field.f30319g;
        if (i2 == 3) {
            this.f82944d = i;
            this.f82941a.add(Integer.valueOf(i2));
            return;
        }
        StringBuilder sb = new StringBuilder(52);
        sb.append("Field with id=");
        sb.append(i2);
        sb.append(" is not known to be an int.");
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
        Set set = this.f82941a;
        if (set.contains(1)) {
            see.m35063b(parcel, 1, this.f82942b);
        }
        if (set.contains(2)) {
            see.m35046a(parcel, 2, this.f82943c, true);
        }
        if (set.contains(3)) {
            see.m35063b(parcel, 3, this.f82944d);
        }
        see.m35062b(parcel, a);
    }

    public FavaDiagnosticsNamespacedTypeEntity(Set set, int i, String str, int i2) {
        this.f82941a = set;
        this.f82942b = i;
        this.f82943c = str;
        this.f82944d = i2;
    }

    public FavaDiagnosticsNamespacedTypeEntity(Set set, String str, int i) {
        this.f82941a = set;
        this.f82942b = 1;
        this.f82943c = str;
        this.f82944d = i;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo7376a(FastJsonResponse$Field fastJsonResponse$Field, String str, String str2) {
        int i = fastJsonResponse$Field.f30319g;
        if (i == 2) {
            this.f82943c = str2;
            this.f82941a.add(Integer.valueOf(i));
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
        return this.f82941a.contains(Integer.valueOf(fastJsonResponse$Field.f30319g));
    }
}
