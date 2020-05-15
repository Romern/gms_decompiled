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
public final class PlusAclentryResourceEntity extends FastSafeParcelableJsonResponse implements aoib {
    public static final Parcelable.Creator CREATOR = new aoic();

    /* renamed from: f */
    private static final HashMap f83040f;

    /* renamed from: a */
    final Set f83041a;

    /* renamed from: b */
    final int f83042b;

    /* renamed from: c */
    String f83043c;

    /* renamed from: d */
    public String f83044d;

    /* renamed from: e */
    public String f83045e;

    static {
        HashMap hashMap = new HashMap();
        f83040f = hashMap;
        hashMap.put("displayName", FastJsonResponse$Field.m22666f("displayName", 2));
        f83040f.put("id", FastJsonResponse$Field.m22666f("id", 3));
        f83040f.put("type", FastJsonResponse$Field.m22666f("type", 4));
    }

    public PlusAclentryResourceEntity() {
        this.f83042b = 1;
        this.f83041a = new HashSet();
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Map mo7367a() {
        return f83040f;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final Object mo7371b(FastJsonResponse$Field fastJsonResponse$Field) {
        int i = fastJsonResponse$Field.f30319g;
        if (i == 2) {
            return this.f83043c;
        }
        if (i == 3) {
            return this.f83044d;
        }
        if (i == 4) {
            return this.f83045e;
        }
        StringBuilder sb = new StringBuilder(38);
        sb.append("Unknown safe parcelable id=");
        sb.append(i);
        throw new IllegalStateException(sb.toString());
    }

    /* renamed from: b */
    public final String mo42788b() {
        return this.f83043c;
    }

    /* renamed from: bF */
    public final /* bridge */ /* synthetic */ Object mo7556bF() {
        return this;
    }

    /* renamed from: c */
    public final String mo42789c() {
        return this.f83044d;
    }

    /* renamed from: d */
    public final String mo42790d() {
        return this.f83045e;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof PlusAclentryResourceEntity)) {
            return false;
        }
        if (this != obj) {
            PlusAclentryResourceEntity plusAclentryResourceEntity = (PlusAclentryResourceEntity) obj;
            for (FastJsonResponse$Field fastJsonResponse$Field : f83040f.values()) {
                if (mo7370a(fastJsonResponse$Field)) {
                    if (!plusAclentryResourceEntity.mo7370a(fastJsonResponse$Field) || !mo7371b(fastJsonResponse$Field).equals(plusAclentryResourceEntity.mo7371b(fastJsonResponse$Field))) {
                        return false;
                    }
                } else if (plusAclentryResourceEntity.mo7370a(fastJsonResponse$Field)) {
                    return false;
                }
            }
        }
        return true;
    }

    public final int hashCode() {
        int i = 0;
        for (FastJsonResponse$Field fastJsonResponse$Field : f83040f.values()) {
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
            this.f83043c = str2;
        } else if (i == 3) {
            this.f83044d = str2;
        } else if (i == 4) {
            this.f83045e = str2;
        } else {
            StringBuilder sb = new StringBuilder(54);
            sb.append("Field with id=");
            sb.append(i);
            sb.append(" is not known to be a String.");
            throw new IllegalArgumentException(sb.toString());
        }
        this.f83041a.add(Integer.valueOf(i));
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
        Set set = this.f83041a;
        if (set.contains(1)) {
            see.m35063b(parcel, 1, this.f83042b);
        }
        if (set.contains(2)) {
            see.m35046a(parcel, 2, this.f83043c, true);
        }
        if (set.contains(3)) {
            see.m35046a(parcel, 3, this.f83044d, true);
        }
        if (set.contains(4)) {
            see.m35046a(parcel, 4, this.f83045e, true);
        }
        see.m35062b(parcel, a);
    }

    public PlusAclentryResourceEntity(Set set, int i, String str, String str2, String str3) {
        this.f83041a = set;
        this.f83042b = i;
        this.f83043c = str;
        this.f83044d = str2;
        this.f83045e = str3;
    }

    public PlusAclentryResourceEntity(Set set, String str, String str2) {
        this.f83041a = set;
        this.f83042b = 1;
        this.f83043c = null;
        this.f83044d = str;
        this.f83045e = str2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo7370a(FastJsonResponse$Field fastJsonResponse$Field) {
        return this.f83041a.contains(Integer.valueOf(fastJsonResponse$Field.f30319g));
    }
}
