package com.google.android.gms.plus.service.p063v1;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.server.response.FastJsonResponse$Field;
import com.google.android.gms.common.server.response.FastSafeParcelableJsonResponse;
import com.google.android.gms.plus.internal.model.people.PersonEntity;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: com.google.android.gms.plus.service.v1.PeopleFeed */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class PeopleFeed extends FastSafeParcelableJsonResponse {
    public static final Parcelable.Creator CREATOR = new aodh();

    /* renamed from: i */
    private static final HashMap f82656i;

    /* renamed from: a */
    public final Set f82657a;

    /* renamed from: b */
    public final int f82658b;

    /* renamed from: c */
    public String f82659c;

    /* renamed from: d */
    public List f82660d;

    /* renamed from: e */
    public String f82661e;

    /* renamed from: f */
    public String f82662f;

    /* renamed from: g */
    public String f82663g;

    /* renamed from: h */
    public int f82664h;

    static {
        HashMap hashMap = new HashMap();
        f82656i = hashMap;
        hashMap.put("etag", FastJsonResponse$Field.m22666f("etag", 2));
        f82656i.put("items", FastJsonResponse$Field.m22657b("items", 3, PersonEntity.class));
        f82656i.put("nextPageToken", FastJsonResponse$Field.m22666f("nextPageToken", 5));
        f82656i.put("selfLink", FastJsonResponse$Field.m22666f("selfLink", 6));
        f82656i.put("title", FastJsonResponse$Field.m22666f("title", 7));
        f82656i.put("totalItems", FastJsonResponse$Field.m22651a("totalItems", 8));
    }

    public PeopleFeed() {
        this.f82658b = 1;
        this.f82657a = new HashSet();
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Map mo7367a() {
        return f82656i;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final Object mo7371b(FastJsonResponse$Field fastJsonResponse$Field) {
        int i = fastJsonResponse$Field.f30319g;
        if (i == 2) {
            return this.f82659c;
        }
        if (i == 3) {
            return this.f82660d;
        }
        if (i == 5) {
            return this.f82661e;
        }
        if (i == 6) {
            return this.f82662f;
        }
        if (i == 7) {
            return this.f82663g;
        }
        if (i == 8) {
            return Integer.valueOf(this.f82664h);
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
            for (FastJsonResponse$Field fastJsonResponse$Field : f82656i.values()) {
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
        for (FastJsonResponse$Field fastJsonResponse$Field : f82656i.values()) {
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
            this.f82664h = i;
            this.f82657a.add(Integer.valueOf(i2));
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
        Set set = this.f82657a;
        if (set.contains(1)) {
            see.m35063b(parcel, 1, this.f82658b);
        }
        if (set.contains(2)) {
            see.m35046a(parcel, 2, this.f82659c, true);
        }
        if (set.contains(3)) {
            see.m35066c(parcel, 3, this.f82660d, true);
        }
        if (set.contains(5)) {
            see.m35046a(parcel, 5, this.f82661e, true);
        }
        if (set.contains(6)) {
            see.m35046a(parcel, 6, this.f82662f, true);
        }
        if (set.contains(7)) {
            see.m35046a(parcel, 7, this.f82663g, true);
        }
        if (set.contains(8)) {
            see.m35063b(parcel, 8, this.f82664h);
        }
        see.m35062b(parcel, a);
    }

    public PeopleFeed(Set set, int i, String str, List list, String str2, String str3, String str4, int i2) {
        this.f82657a = set;
        this.f82658b = i;
        this.f82659c = str;
        this.f82660d = list;
        this.f82661e = str2;
        this.f82662f = str3;
        this.f82663g = str4;
        this.f82664h = i2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo7376a(FastJsonResponse$Field fastJsonResponse$Field, String str, String str2) {
        int i = fastJsonResponse$Field.f30319g;
        if (i == 2) {
            this.f82659c = str2;
        } else if (i == 5) {
            this.f82661e = str2;
        } else if (i == 6) {
            this.f82662f = str2;
        } else if (i == 7) {
            this.f82663g = str2;
        } else {
            StringBuilder sb = new StringBuilder(54);
            sb.append("Field with id=");
            sb.append(i);
            sb.append(" is not known to be a String.");
            throw new IllegalArgumentException(sb.toString());
        }
        this.f82657a.add(Integer.valueOf(i));
    }

    /* renamed from: a */
    public final void mo7368a(FastJsonResponse$Field fastJsonResponse$Field, String str, ArrayList arrayList) {
        int i = fastJsonResponse$Field.f30319g;
        if (i == 3) {
            this.f82660d = arrayList;
            this.f82657a.add(Integer.valueOf(i));
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
        return this.f82657a.contains(Integer.valueOf(fastJsonResponse$Field.f30319g));
    }
}
