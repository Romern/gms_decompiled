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
public final class ItemScope extends FastSafeParcelableJsonResponse {
    public static final Parcelable.Creator CREATOR = new aohe();

    /* renamed from: e */
    private static final HashMap f82945e;

    /* renamed from: a */
    final Set f82946a;

    /* renamed from: b */
    final int f82947b;

    /* renamed from: c */
    public String f82948c;

    /* renamed from: d */
    public String f82949d;

    static {
        HashMap hashMap = new HashMap();
        f82945e = hashMap;
        hashMap.put("image", FastJsonResponse$Field.m22666f("image", 33));
        f82945e.put("url", FastJsonResponse$Field.m22666f("url", 54));
    }

    public ItemScope() {
        this.f82947b = 1;
        this.f82946a = new HashSet();
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Map mo7367a() {
        return f82945e;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final Object mo7371b(FastJsonResponse$Field fastJsonResponse$Field) {
        int i = fastJsonResponse$Field.f30319g;
        if (i == 33) {
            return this.f82948c;
        }
        if (i == 54) {
            return this.f82949d;
        }
        StringBuilder sb = new StringBuilder(38);
        sb.append("Unknown safe parcelable id=");
        sb.append(i);
        throw new IllegalStateException(sb.toString());
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ItemScope)) {
            return false;
        }
        if (this != obj) {
            ItemScope itemScope = (ItemScope) obj;
            for (FastJsonResponse$Field fastJsonResponse$Field : f82945e.values()) {
                if (mo7370a(fastJsonResponse$Field)) {
                    if (!itemScope.mo7370a(fastJsonResponse$Field) || !mo7371b(fastJsonResponse$Field).equals(itemScope.mo7371b(fastJsonResponse$Field))) {
                        return false;
                    }
                } else if (itemScope.mo7370a(fastJsonResponse$Field)) {
                    return false;
                }
            }
        }
        return true;
    }

    public final int hashCode() {
        int i = 0;
        for (FastJsonResponse$Field fastJsonResponse$Field : f82945e.values()) {
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
        if (i == 33) {
            this.f82948c = str2;
        } else if (i == 54) {
            this.f82949d = str2;
        } else {
            StringBuilder sb = new StringBuilder(54);
            sb.append("Field with id=");
            sb.append(i);
            sb.append(" is not known to be a String.");
            throw new IllegalArgumentException(sb.toString());
        }
        this.f82946a.add(Integer.valueOf(i));
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
        Set set = this.f82946a;
        if (set.contains(1)) {
            see.m35063b(parcel, 1, this.f82947b);
        }
        if (set.contains(33)) {
            see.m35046a(parcel, 33, this.f82948c, true);
        }
        if (set.contains(54)) {
            see.m35046a(parcel, 54, this.f82949d, true);
        }
        see.m35062b(parcel, a);
    }

    public ItemScope(Set set, int i, String str, String str2) {
        this.f82946a = set;
        this.f82947b = i;
        this.f82948c = str;
        this.f82949d = str2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo7370a(FastJsonResponse$Field fastJsonResponse$Field) {
        return this.f82946a.contains(Integer.valueOf(fastJsonResponse$Field.f30319g));
    }
}
