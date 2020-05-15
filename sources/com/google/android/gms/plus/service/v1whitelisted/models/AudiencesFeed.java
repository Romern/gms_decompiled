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
public final class AudiencesFeed extends FastSafeParcelableJsonResponse {
    public static final Parcelable.Creator CREATOR = new aofu();

    /* renamed from: f */
    private static final HashMap f82849f;

    /* renamed from: a */
    final Set f82850a;

    /* renamed from: b */
    final int f82851b;

    /* renamed from: c */
    String f82852c;

    /* renamed from: d */
    public List f82853d;

    /* renamed from: e */
    public String f82854e;

    static {
        HashMap hashMap = new HashMap();
        f82849f = hashMap;
        hashMap.put("etag", FastJsonResponse$Field.m22666f("etag", 2));
        f82849f.put("items", FastJsonResponse$Field.m22657b("items", 3, Audience.class));
        f82849f.put("nextPageToken", FastJsonResponse$Field.m22666f("nextPageToken", 5));
    }

    public AudiencesFeed() {
        this.f82851b = 1;
        this.f82850a = new HashSet();
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Map mo7367a() {
        return f82849f;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final Object mo7371b(FastJsonResponse$Field fastJsonResponse$Field) {
        int i = fastJsonResponse$Field.f30319g;
        if (i == 2) {
            return this.f82852c;
        }
        if (i == 3) {
            return this.f82853d;
        }
        if (i == 5) {
            return this.f82854e;
        }
        StringBuilder sb = new StringBuilder(38);
        sb.append("Unknown safe parcelable id=");
        sb.append(i);
        throw new IllegalStateException(sb.toString());
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof AudiencesFeed)) {
            return false;
        }
        if (this != obj) {
            AudiencesFeed audiencesFeed = (AudiencesFeed) obj;
            for (FastJsonResponse$Field fastJsonResponse$Field : f82849f.values()) {
                if (mo7370a(fastJsonResponse$Field)) {
                    if (!audiencesFeed.mo7370a(fastJsonResponse$Field) || !mo7371b(fastJsonResponse$Field).equals(audiencesFeed.mo7371b(fastJsonResponse$Field))) {
                        return false;
                    }
                } else if (audiencesFeed.mo7370a(fastJsonResponse$Field)) {
                    return false;
                }
            }
        }
        return true;
    }

    public final int hashCode() {
        int i = 0;
        for (FastJsonResponse$Field fastJsonResponse$Field : f82849f.values()) {
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
            this.f82852c = str2;
        } else if (i == 5) {
            this.f82854e = str2;
        } else {
            StringBuilder sb = new StringBuilder(54);
            sb.append("Field with id=");
            sb.append(i);
            sb.append(" is not known to be a String.");
            throw new IllegalArgumentException(sb.toString());
        }
        this.f82850a.add(Integer.valueOf(i));
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
        Set set = this.f82850a;
        if (set.contains(1)) {
            see.m35063b(parcel, 1, this.f82851b);
        }
        if (set.contains(2)) {
            see.m35046a(parcel, 2, this.f82852c, true);
        }
        if (set.contains(3)) {
            see.m35066c(parcel, 3, this.f82853d, true);
        }
        if (set.contains(5)) {
            see.m35046a(parcel, 5, this.f82854e, true);
        }
        see.m35062b(parcel, a);
    }

    public AudiencesFeed(Set set, int i, String str, List list, String str2) {
        this.f82850a = set;
        this.f82851b = i;
        this.f82852c = str;
        this.f82853d = list;
        this.f82854e = str2;
    }

    /* renamed from: a */
    public final void mo7368a(FastJsonResponse$Field fastJsonResponse$Field, String str, ArrayList arrayList) {
        int i = fastJsonResponse$Field.f30319g;
        if (i == 3) {
            this.f82853d = arrayList;
            this.f82850a.add(Integer.valueOf(i));
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
        return this.f82850a.contains(Integer.valueOf(fastJsonResponse$Field.f30319g));
    }
}
