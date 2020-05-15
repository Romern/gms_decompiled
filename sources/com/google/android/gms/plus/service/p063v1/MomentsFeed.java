package com.google.android.gms.plus.service.p063v1;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.server.response.FastJsonResponse$Field;
import com.google.android.gms.common.server.response.FastSafeParcelableJsonResponse;
import com.google.android.gms.plus.internal.model.moments.MomentEntity;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: com.google.android.gms.plus.service.v1.MomentsFeed */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class MomentsFeed extends FastSafeParcelableJsonResponse {
    public static final Parcelable.Creator CREATOR = new aodf();

    /* renamed from: j */
    private static final HashMap f82646j;

    /* renamed from: a */
    public final Set f82647a;

    /* renamed from: b */
    public final int f82648b;

    /* renamed from: c */
    public String f82649c;

    /* renamed from: d */
    public List f82650d;

    /* renamed from: e */
    public String f82651e;

    /* renamed from: f */
    public String f82652f;

    /* renamed from: g */
    public String f82653g;

    /* renamed from: h */
    public String f82654h;

    /* renamed from: i */
    public String f82655i;

    static {
        HashMap hashMap = new HashMap();
        f82646j = hashMap;
        hashMap.put("etag", FastJsonResponse$Field.m22666f("etag", 2));
        f82646j.put("items", FastJsonResponse$Field.m22657b("items", 3, MomentEntity.class));
        f82646j.put("nextLink", FastJsonResponse$Field.m22666f("nextLink", 5));
        f82646j.put("nextPageToken", FastJsonResponse$Field.m22666f("nextPageToken", 6));
        f82646j.put("selfLink", FastJsonResponse$Field.m22666f("selfLink", 7));
        f82646j.put("title", FastJsonResponse$Field.m22666f("title", 8));
        f82646j.put("updated", FastJsonResponse$Field.m22666f("updated", 9));
    }

    public MomentsFeed() {
        this.f82648b = 1;
        this.f82647a = new HashSet();
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Map mo7367a() {
        return f82646j;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final Object mo7371b(FastJsonResponse$Field fastJsonResponse$Field) {
        int i = fastJsonResponse$Field.f30319g;
        switch (i) {
            case 2:
                return this.f82649c;
            case 3:
                return this.f82650d;
            case 4:
            default:
                StringBuilder sb = new StringBuilder(38);
                sb.append("Unknown safe parcelable id=");
                sb.append(i);
                throw new IllegalStateException(sb.toString());
            case 5:
                return this.f82651e;
            case 6:
                return this.f82652f;
            case 7:
                return this.f82653g;
            case 8:
                return this.f82654h;
            case 9:
                return this.f82655i;
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof MomentsFeed)) {
            return false;
        }
        if (this != obj) {
            MomentsFeed momentsFeed = (MomentsFeed) obj;
            for (FastJsonResponse$Field fastJsonResponse$Field : f82646j.values()) {
                if (mo7370a(fastJsonResponse$Field)) {
                    if (!momentsFeed.mo7370a(fastJsonResponse$Field) || !mo7371b(fastJsonResponse$Field).equals(momentsFeed.mo7371b(fastJsonResponse$Field))) {
                        return false;
                    }
                } else if (momentsFeed.mo7370a(fastJsonResponse$Field)) {
                    return false;
                }
            }
        }
        return true;
    }

    public final int hashCode() {
        int i = 0;
        for (FastJsonResponse$Field fastJsonResponse$Field : f82646j.values()) {
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
        if (i != 2) {
            switch (i) {
                case 5:
                    this.f82651e = str2;
                    break;
                case 6:
                    this.f82652f = str2;
                    break;
                case 7:
                    this.f82653g = str2;
                    break;
                case 8:
                    this.f82654h = str2;
                    break;
                case 9:
                    this.f82655i = str2;
                    break;
                default:
                    StringBuilder sb = new StringBuilder(54);
                    sb.append("Field with id=");
                    sb.append(i);
                    sb.append(" is not known to be a String.");
                    throw new IllegalArgumentException(sb.toString());
            }
        } else {
            this.f82649c = str2;
        }
        this.f82647a.add(Integer.valueOf(i));
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
        Set set = this.f82647a;
        if (set.contains(1)) {
            see.m35063b(parcel, 1, this.f82648b);
        }
        if (set.contains(2)) {
            see.m35046a(parcel, 2, this.f82649c, true);
        }
        if (set.contains(3)) {
            see.m35066c(parcel, 3, this.f82650d, true);
        }
        if (set.contains(5)) {
            see.m35046a(parcel, 5, this.f82651e, true);
        }
        if (set.contains(6)) {
            see.m35046a(parcel, 6, this.f82652f, true);
        }
        if (set.contains(7)) {
            see.m35046a(parcel, 7, this.f82653g, true);
        }
        if (set.contains(8)) {
            see.m35046a(parcel, 8, this.f82654h, true);
        }
        if (set.contains(9)) {
            see.m35046a(parcel, 9, this.f82655i, true);
        }
        see.m35062b(parcel, a);
    }

    public MomentsFeed(Set set, int i, String str, List list, String str2, String str3, String str4, String str5, String str6) {
        this.f82647a = set;
        this.f82648b = i;
        this.f82649c = str;
        this.f82650d = list;
        this.f82651e = str2;
        this.f82652f = str3;
        this.f82653g = str4;
        this.f82654h = str5;
        this.f82655i = str6;
    }

    /* renamed from: a */
    public final void mo7368a(FastJsonResponse$Field fastJsonResponse$Field, String str, ArrayList arrayList) {
        int i = fastJsonResponse$Field.f30319g;
        if (i == 3) {
            this.f82650d = arrayList;
            this.f82647a.add(Integer.valueOf(i));
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
        return this.f82647a.contains(Integer.valueOf(fastJsonResponse$Field.f30319g));
    }
}
