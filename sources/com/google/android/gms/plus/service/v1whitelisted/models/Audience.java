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
public final class Audience extends FastSafeParcelableJsonResponse {
    public static final Parcelable.Creator CREATOR = new aoft();

    /* renamed from: e */
    private static final HashMap f82844e;

    /* renamed from: a */
    final Set f82845a;

    /* renamed from: b */
    final int f82846b;

    /* renamed from: c */
    public PlusAclentryResourceEntity f82847c;

    /* renamed from: d */
    public String f82848d;

    static {
        HashMap hashMap = new HashMap();
        f82844e = hashMap;
        hashMap.put("item", FastJsonResponse$Field.m22653a("item", 3, PlusAclentryResourceEntity.class));
        f82844e.put("visibility", FastJsonResponse$Field.m22666f("visibility", 6));
    }

    public Audience() {
        this.f82846b = 1;
        this.f82845a = new HashSet();
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Map mo7367a() {
        return f82844e;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final Object mo7371b(FastJsonResponse$Field fastJsonResponse$Field) {
        int i = fastJsonResponse$Field.f30319g;
        if (i == 3) {
            return this.f82847c;
        }
        if (i == 6) {
            return this.f82848d;
        }
        StringBuilder sb = new StringBuilder(38);
        sb.append("Unknown safe parcelable id=");
        sb.append(i);
        throw new IllegalStateException(sb.toString());
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Audience)) {
            return false;
        }
        if (this != obj) {
            Audience audience = (Audience) obj;
            for (FastJsonResponse$Field fastJsonResponse$Field : f82844e.values()) {
                if (mo7370a(fastJsonResponse$Field)) {
                    if (!audience.mo7370a(fastJsonResponse$Field) || !mo7371b(fastJsonResponse$Field).equals(audience.mo7371b(fastJsonResponse$Field))) {
                        return false;
                    }
                } else if (audience.mo7370a(fastJsonResponse$Field)) {
                    return false;
                }
            }
        }
        return true;
    }

    public final int hashCode() {
        int i = 0;
        for (FastJsonResponse$Field fastJsonResponse$Field : f82844e.values()) {
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
        if (i == 6) {
            this.f82848d = str2;
            this.f82845a.add(Integer.valueOf(i));
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
        Set set = this.f82845a;
        if (set.contains(1)) {
            see.m35063b(parcel, 1, this.f82846b);
        }
        if (set.contains(3)) {
            see.m35040a(parcel, 3, this.f82847c, i, true);
        }
        if (set.contains(6)) {
            see.m35046a(parcel, 6, this.f82848d, true);
        }
        see.m35062b(parcel, a);
    }

    public Audience(Set set, int i, PlusAclentryResourceEntity plusAclentryResourceEntity, String str) {
        this.f82845a = set;
        this.f82846b = i;
        this.f82847c = plusAclentryResourceEntity;
        this.f82848d = str;
    }

    /* renamed from: a */
    public final void mo7369a(FastJsonResponse$Field fastJsonResponse$Field, String str, sio sio) {
        int i = fastJsonResponse$Field.f30319g;
        if (i == 3) {
            this.f82847c = (PlusAclentryResourceEntity) sio;
            this.f82845a.add(Integer.valueOf(i));
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
        return this.f82845a.contains(Integer.valueOf(fastJsonResponse$Field.f30319g));
    }
}
