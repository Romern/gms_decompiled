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
public final class ClientOzExtensionEntity extends FastSafeParcelableJsonResponse implements rty {
    public static final Parcelable.Creator CREATOR = new aogq();

    /* renamed from: h */
    private static final HashMap f82893h;

    /* renamed from: a */
    final Set f82894a;

    /* renamed from: b */
    final int f82895b;

    /* renamed from: c */
    String f82896c;

    /* renamed from: d */
    List f82897d;

    /* renamed from: e */
    String f82898e;

    /* renamed from: f */
    String f82899f;

    /* renamed from: g */
    long f82900g;

    static {
        HashMap hashMap = new HashMap();
        f82893h = hashMap;
        hashMap.put("callingApplication", FastJsonResponse$Field.m22666f("callingApplication", 2));
        f82893h.put("clientEvent", FastJsonResponse$Field.m22657b("clientEvent", 3, ClientOzEventEntity.class));
        f82893h.put("clientId", FastJsonResponse$Field.m22666f("clientId", 4));
        f82893h.put("clientVersion", FastJsonResponse$Field.m22666f("clientVersion", 5));
        f82893h.put("sendTimeMsec", FastJsonResponse$Field.m22656b("sendTimeMsec", 6));
    }

    public ClientOzExtensionEntity() {
        this.f82895b = 1;
        this.f82894a = new HashSet();
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Map mo7367a() {
        return f82893h;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final Object mo7371b(FastJsonResponse$Field fastJsonResponse$Field) {
        int i = fastJsonResponse$Field.f30319g;
        if (i == 2) {
            return this.f82896c;
        }
        if (i == 3) {
            return this.f82897d;
        }
        if (i == 4) {
            return this.f82898e;
        }
        if (i == 5) {
            return this.f82899f;
        }
        if (i == 6) {
            return Long.valueOf(this.f82900g);
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
        if (!(obj instanceof ClientOzExtensionEntity)) {
            return false;
        }
        if (this != obj) {
            ClientOzExtensionEntity clientOzExtensionEntity = (ClientOzExtensionEntity) obj;
            for (FastJsonResponse$Field fastJsonResponse$Field : f82893h.values()) {
                if (mo7370a(fastJsonResponse$Field)) {
                    if (!clientOzExtensionEntity.mo7370a(fastJsonResponse$Field) || !mo7371b(fastJsonResponse$Field).equals(clientOzExtensionEntity.mo7371b(fastJsonResponse$Field))) {
                        return false;
                    }
                } else if (clientOzExtensionEntity.mo7370a(fastJsonResponse$Field)) {
                    return false;
                }
            }
        }
        return true;
    }

    public final int hashCode() {
        int i = 0;
        for (FastJsonResponse$Field fastJsonResponse$Field : f82893h.values()) {
            if (mo7370a(fastJsonResponse$Field)) {
                i = i + fastJsonResponse$Field.f30319g + mo7371b(fastJsonResponse$Field).hashCode();
            }
        }
        return i;
    }

    public ClientOzExtensionEntity(Set set, int i, String str, List list, String str2, String str3, long j) {
        this.f82894a = set;
        this.f82895b = i;
        this.f82896c = str;
        this.f82897d = list;
        this.f82898e = str2;
        this.f82899f = str3;
        this.f82900g = j;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo7394a(FastJsonResponse$Field fastJsonResponse$Field, String str, long j) {
        int i = fastJsonResponse$Field.f30319g;
        if (i == 6) {
            this.f82900g = j;
            this.f82894a.add(Integer.valueOf(i));
            return;
        }
        StringBuilder sb = new StringBuilder(52);
        sb.append("Field with id=");
        sb.append(i);
        sb.append(" is not known to be a long.");
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
        Set set = this.f82894a;
        if (set.contains(1)) {
            see.m35063b(parcel, 1, this.f82895b);
        }
        if (set.contains(2)) {
            see.m35046a(parcel, 2, this.f82896c, true);
        }
        if (set.contains(3)) {
            see.m35066c(parcel, 3, this.f82897d, true);
        }
        if (set.contains(4)) {
            see.m35046a(parcel, 4, this.f82898e, true);
        }
        if (set.contains(5)) {
            see.m35046a(parcel, 5, this.f82899f, true);
        }
        if (set.contains(6)) {
            see.m35036a(parcel, 6, this.f82900g);
        }
        see.m35062b(parcel, a);
    }

    public ClientOzExtensionEntity(Set set, String str, List list, String str2, String str3, long j) {
        this.f82894a = set;
        this.f82895b = 1;
        this.f82896c = str;
        this.f82897d = list;
        this.f82898e = str2;
        this.f82899f = str3;
        this.f82900g = j;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo7376a(FastJsonResponse$Field fastJsonResponse$Field, String str, String str2) {
        int i = fastJsonResponse$Field.f30319g;
        if (i == 2) {
            this.f82896c = str2;
        } else if (i == 4) {
            this.f82898e = str2;
        } else if (i == 5) {
            this.f82899f = str2;
        } else {
            StringBuilder sb = new StringBuilder(54);
            sb.append("Field with id=");
            sb.append(i);
            sb.append(" is not known to be a String.");
            throw new IllegalArgumentException(sb.toString());
        }
        this.f82894a.add(Integer.valueOf(i));
    }

    /* renamed from: a */
    public final void mo7368a(FastJsonResponse$Field fastJsonResponse$Field, String str, ArrayList arrayList) {
        int i = fastJsonResponse$Field.f30319g;
        if (i == 3) {
            this.f82897d = arrayList;
            this.f82894a.add(Integer.valueOf(i));
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
        return this.f82894a.contains(Integer.valueOf(fastJsonResponse$Field.f30319g));
    }
}
