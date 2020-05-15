package com.google.android.gms.plus.service.v2whitelisted.models;

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
public final class PeopleList extends FastSafeParcelableJsonResponse {
    public static final Parcelable.Creator CREATOR = new aoja();

    /* renamed from: h */
    private static final HashMap f83131h;

    /* renamed from: a */
    final Set f83132a;

    /* renamed from: b */
    String f83133b;

    /* renamed from: c */
    public List f83134c;

    /* renamed from: d */
    public String f83135d;

    /* renamed from: e */
    public String f83136e;

    /* renamed from: f */
    String f83137f;

    /* renamed from: g */
    int f83138g;

    static {
        HashMap hashMap = new HashMap();
        f83131h = hashMap;
        hashMap.put("etag", FastJsonResponse$Field.m22666f("etag", 2));
        f83131h.put("items", FastJsonResponse$Field.m22657b("items", 3, Person.class));
        f83131h.put("nextPageToken", FastJsonResponse$Field.m22666f("nextPageToken", 5));
        f83131h.put("nextSyncToken", FastJsonResponse$Field.m22666f("nextSyncToken", 6));
        f83131h.put("title", FastJsonResponse$Field.m22666f("title", 7));
        f83131h.put("totalItems", FastJsonResponse$Field.m22651a("totalItems", 8));
    }

    public PeopleList() {
        this.f83132a = new HashSet();
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Map mo7367a() {
        return f83131h;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final Object mo7371b(FastJsonResponse$Field fastJsonResponse$Field) {
        int i = fastJsonResponse$Field.f30319g;
        if (i == 2) {
            return this.f83133b;
        }
        if (i == 3) {
            return this.f83134c;
        }
        if (i == 5) {
            return this.f83135d;
        }
        if (i == 6) {
            return this.f83136e;
        }
        if (i == 7) {
            return this.f83137f;
        }
        if (i == 8) {
            return Integer.valueOf(this.f83138g);
        }
        StringBuilder sb = new StringBuilder(38);
        sb.append("Unknown safe parcelable id=");
        sb.append(i);
        throw new IllegalStateException(sb.toString());
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof PeopleList)) {
            return false;
        }
        if (this != obj) {
            PeopleList peopleList = (PeopleList) obj;
            for (FastJsonResponse$Field fastJsonResponse$Field : f83131h.values()) {
                if (mo7370a(fastJsonResponse$Field)) {
                    if (!peopleList.mo7370a(fastJsonResponse$Field) || !mo7371b(fastJsonResponse$Field).equals(peopleList.mo7371b(fastJsonResponse$Field))) {
                        return false;
                    }
                } else if (peopleList.mo7370a(fastJsonResponse$Field)) {
                    return false;
                }
            }
        }
        return true;
    }

    public final int hashCode() {
        int i = 0;
        for (FastJsonResponse$Field fastJsonResponse$Field : f83131h.values()) {
            if (mo7370a(fastJsonResponse$Field)) {
                i = i + fastJsonResponse$Field.f30319g + mo7371b(fastJsonResponse$Field).hashCode();
            }
        }
        return i;
    }

    public PeopleList(Set set, String str, List list, String str2, String str3, String str4, int i) {
        this.f83132a = set;
        this.f83133b = str;
        this.f83134c = list;
        this.f83135d = str2;
        this.f83136e = str3;
        this.f83137f = str4;
        this.f83138g = i;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo7391a(FastJsonResponse$Field fastJsonResponse$Field, String str, int i) {
        int i2 = fastJsonResponse$Field.f30319g;
        if (i2 == 8) {
            this.f83138g = i;
            this.f83132a.add(Integer.valueOf(i2));
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
        Set set = this.f83132a;
        if (set.contains(2)) {
            see.m35046a(parcel, 2, this.f83133b, true);
        }
        if (set.contains(3)) {
            see.m35066c(parcel, 3, this.f83134c, true);
        }
        if (set.contains(5)) {
            see.m35046a(parcel, 5, this.f83135d, true);
        }
        if (set.contains(6)) {
            see.m35046a(parcel, 6, this.f83136e, true);
        }
        if (set.contains(7)) {
            see.m35046a(parcel, 7, this.f83137f, true);
        }
        if (set.contains(8)) {
            see.m35063b(parcel, 8, this.f83138g);
        }
        see.m35062b(parcel, a);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo7376a(FastJsonResponse$Field fastJsonResponse$Field, String str, String str2) {
        int i = fastJsonResponse$Field.f30319g;
        if (i == 2) {
            this.f83133b = str2;
        } else if (i == 5) {
            this.f83135d = str2;
        } else if (i == 6) {
            this.f83136e = str2;
        } else if (i == 7) {
            this.f83137f = str2;
        } else {
            StringBuilder sb = new StringBuilder(54);
            sb.append("Field with id=");
            sb.append(i);
            sb.append(" is not known to be a String.");
            throw new IllegalArgumentException(sb.toString());
        }
        this.f83132a.add(Integer.valueOf(i));
    }

    /* renamed from: a */
    public final void mo7368a(FastJsonResponse$Field fastJsonResponse$Field, String str, ArrayList arrayList) {
        int i = fastJsonResponse$Field.f30319g;
        if (i == 3) {
            this.f83134c = arrayList;
            this.f83132a.add(Integer.valueOf(i));
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
        return this.f83132a.contains(Integer.valueOf(fastJsonResponse$Field.f30319g));
    }
}
