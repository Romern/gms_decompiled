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
public final class PeopleFeed extends FastSafeParcelableJsonResponse {
    public static final Parcelable.Creator CREATOR = new aohq();

    /* renamed from: g */
    private static final HashMap f83003g;

    /* renamed from: a */
    final Set f83004a;

    /* renamed from: b */
    final int f83005b;

    /* renamed from: c */
    String f83006c;

    /* renamed from: d */
    public List f83007d;

    /* renamed from: e */
    public String f83008e;

    /* renamed from: f */
    int f83009f;

    static {
        HashMap hashMap = new HashMap();
        f83003g = hashMap;
        hashMap.put("etag", FastJsonResponse$Field.m22666f("etag", 2));
        f83003g.put("items", FastJsonResponse$Field.m22657b("items", 3, PersonEntity.class));
        f83003g.put("nextPageToken", FastJsonResponse$Field.m22666f("nextPageToken", 5));
        f83003g.put("totalItems", FastJsonResponse$Field.m22651a("totalItems", 8));
    }

    public PeopleFeed() {
        this.f83005b = 1;
        this.f83004a = new HashSet();
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Map mo7367a() {
        return f83003g;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final Object mo7371b(FastJsonResponse$Field fastJsonResponse$Field) {
        int i = fastJsonResponse$Field.f30319g;
        if (i == 2) {
            return this.f83006c;
        }
        if (i == 3) {
            return this.f83007d;
        }
        if (i == 5) {
            return this.f83008e;
        }
        if (i == 8) {
            return Integer.valueOf(this.f83009f);
        }
        StringBuilder sb = new StringBuilder(38);
        sb.append("Unknown safe parcelable id=");
        sb.append(i);
        throw new IllegalStateException(sb.toString());
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof PeopleFeed)) {
            return false;
        }
        if (this != obj) {
            PeopleFeed peopleFeed = (PeopleFeed) obj;
            for (FastJsonResponse$Field fastJsonResponse$Field : f83003g.values()) {
                if (mo7370a(fastJsonResponse$Field)) {
                    if (!peopleFeed.mo7370a(fastJsonResponse$Field) || !mo7371b(fastJsonResponse$Field).equals(peopleFeed.mo7371b(fastJsonResponse$Field))) {
                        return false;
                    }
                } else if (peopleFeed.mo7370a(fastJsonResponse$Field)) {
                    return false;
                }
            }
        }
        return true;
    }

    public final int hashCode() {
        int i = 0;
        for (FastJsonResponse$Field fastJsonResponse$Field : f83003g.values()) {
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
        if (i2 == 8) {
            this.f83009f = i;
            this.f83004a.add(Integer.valueOf(i2));
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
        Set set = this.f83004a;
        if (set.contains(1)) {
            see.m35063b(parcel, 1, this.f83005b);
        }
        if (set.contains(2)) {
            see.m35046a(parcel, 2, this.f83006c, true);
        }
        if (set.contains(3)) {
            see.m35066c(parcel, 3, this.f83007d, true);
        }
        if (set.contains(5)) {
            see.m35046a(parcel, 5, this.f83008e, true);
        }
        if (set.contains(8)) {
            see.m35063b(parcel, 8, this.f83009f);
        }
        see.m35062b(parcel, a);
    }

    public PeopleFeed(Set set, int i, String str, List list, String str2, int i2) {
        this.f83004a = set;
        this.f83005b = i;
        this.f83006c = str;
        this.f83007d = list;
        this.f83008e = str2;
        this.f83009f = i2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo7376a(FastJsonResponse$Field fastJsonResponse$Field, String str, String str2) {
        int i = fastJsonResponse$Field.f30319g;
        if (i == 2) {
            this.f83006c = str2;
        } else if (i == 5) {
            this.f83008e = str2;
        } else {
            StringBuilder sb = new StringBuilder(54);
            sb.append("Field with id=");
            sb.append(i);
            sb.append(" is not known to be a String.");
            throw new IllegalArgumentException(sb.toString());
        }
        this.f83004a.add(Integer.valueOf(i));
    }

    /* renamed from: a */
    public final void mo7368a(FastJsonResponse$Field fastJsonResponse$Field, String str, ArrayList arrayList) {
        int i = fastJsonResponse$Field.f30319g;
        if (i == 3) {
            this.f83007d = arrayList;
            this.f83004a.add(Integer.valueOf(i));
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
        return this.f83004a.contains(Integer.valueOf(fastJsonResponse$Field.f30319g));
    }
}
