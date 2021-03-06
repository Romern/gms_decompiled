package com.google.android.gms.plus.service.v1whitelisted.models;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.server.response.FastJsonResponse$Field;
import com.google.android.gms.common.server.response.FastSafeParcelableJsonResponse;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class Applications extends FastSafeParcelableJsonResponse {
    public static final Parcelable.Creator CREATOR = new aofs();

    /* renamed from: e */
    private static final HashMap f82839e;

    /* renamed from: a */
    final Set f82840a;

    /* renamed from: b */
    final int f82841b;

    /* renamed from: c */
    public List f82842c;

    /* renamed from: d */
    public String f82843d;

    static {
        HashMap hashMap = new HashMap();
        f82839e = hashMap;
        hashMap.put("items", FastJsonResponse$Field.m22657b("items", 3, Application.class));
        f82839e.put("nextPageToken", FastJsonResponse$Field.m22666f("nextPageToken", 5));
    }

    public Applications() {
        this.f82841b = 1;
        this.f82840a = new HashSet();
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Map mo7367a() {
        return f82839e;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final Object mo7371b(FastJsonResponse$Field fastJsonResponse$Field) {
        int i = fastJsonResponse$Field.f30319g;
        if (i == 3) {
            return this.f82842c;
        }
        if (i == 5) {
            return this.f82843d;
        }
        StringBuilder sb = new StringBuilder(38);
        sb.append("Unknown safe parcelable id=");
        sb.append(i);
        throw new IllegalStateException(sb.toString());
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Applications)) {
            return false;
        }
        if (this != obj) {
            Applications applications = (Applications) obj;
            for (FastJsonResponse$Field fastJsonResponse$Field : f82839e.values()) {
                if (mo7370a(fastJsonResponse$Field)) {
                    if (!applications.mo7370a(fastJsonResponse$Field) || !mo7371b(fastJsonResponse$Field).equals(applications.mo7371b(fastJsonResponse$Field))) {
                        return false;
                    }
                } else if (applications.mo7370a(fastJsonResponse$Field)) {
                    return false;
                }
            }
        }
        return true;
    }

    public final int hashCode() {
        int i = 0;
        for (FastJsonResponse$Field fastJsonResponse$Field : f82839e.values()) {
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
        if (i == 5) {
            this.f82843d = str2;
            this.f82840a.add(Integer.valueOf(i));
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
        Set set = this.f82840a;
        if (set.contains(1)) {
            see.m35063b(parcel, 1, this.f82841b);
        }
        if (set.contains(3)) {
            see.m35066c(parcel, 3, this.f82842c, true);
        }
        if (set.contains(5)) {
            see.m35046a(parcel, 5, this.f82843d, true);
        }
        see.m35062b(parcel, a);
    }

    public Applications(Set set, int i, List list, String str) {
        this.f82840a = set;
        this.f82841b = i;
        this.f82842c = list;
        this.f82843d = str;
    }

    /* renamed from: a */
    public final void mo7368a(FastJsonResponse$Field fastJsonResponse$Field, String str, ArrayList arrayList) {
        int i = fastJsonResponse$Field.f30319g;
        if (i == 3) {
            this.f82842c = arrayList;
            this.f82840a.add(Integer.valueOf(i));
            return;
        }
        String canonicalName = arrayList.getClass().getCanonicalName();
        StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 71);
        sb.append("Field with id=");
        sb.append(i);
        sb.append(" is not a known array of custom type.  Found ");
        sb.append(canonicalName);
        sb.append(".");
        throw new IllegalArgumentException(sb.toString());
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo7370a(FastJsonResponse$Field fastJsonResponse$Field) {
        return this.f82840a.contains(Integer.valueOf(fastJsonResponse$Field.f30319g));
    }
}
