package com.google.android.gms.plus.service.v1whitelisted.models;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.server.response.FastJsonResponse$Field;
import com.google.android.gms.common.server.response.FastSafeParcelableJsonResponse;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ActionTargetEntity extends FastSafeParcelableJsonResponse implements ReflectedParcelable, aoes {
    public static final Parcelable.Creator CREATOR = new aoet();

    /* renamed from: j */
    private static final HashMap f82746j;

    /* renamed from: a */
    final Set f82747a;

    /* renamed from: b */
    final int f82748b;

    /* renamed from: c */
    AclDetailsEntity f82749c;

    /* renamed from: d */
    String f82750d;

    /* renamed from: e */
    int f82751e;

    /* renamed from: f */
    List f82752f;

    /* renamed from: g */
    LoggedProfileEntity f82753g;

    /* renamed from: h */
    String f82754h;

    /* renamed from: i */
    List f82755i;

    static {
        HashMap hashMap = new HashMap();
        f82746j = hashMap;
        hashMap.put("aclDetails", FastJsonResponse$Field.m22653a("aclDetails", 2, AclDetailsEntity.class));
        f82746j.put("activityId", FastJsonResponse$Field.m22666f("activityId", 5));
        f82746j.put("alphabeticalAclListCount", FastJsonResponse$Field.m22651a("alphabeticalAclListCount", 6));
        f82746j.put("gaiaId", FastJsonResponse$Field.m22668g("gaiaId", 25));
        f82746j.put("profile", FastJsonResponse$Field.m22653a("profile", 61, LoggedProfileEntity.class));
        f82746j.put("profileData", FastJsonResponse$Field.m22666f("profileData", 62));
        f82746j.put("targetType", FastJsonResponse$Field.m22668g("targetType", 89));
    }

    public ActionTargetEntity() {
        this.f82748b = 1;
        this.f82747a = new HashSet();
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Map mo7367a() {
        return f82746j;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final Object mo7371b(FastJsonResponse$Field fastJsonResponse$Field) {
        int i = fastJsonResponse$Field.f30319g;
        if (i == 2) {
            return this.f82749c;
        }
        if (i == 25) {
            return this.f82752f;
        }
        if (i == 89) {
            return this.f82755i;
        }
        if (i == 5) {
            return this.f82750d;
        }
        if (i == 6) {
            return Integer.valueOf(this.f82751e);
        }
        if (i == 61) {
            return this.f82753g;
        }
        if (i == 62) {
            return this.f82754h;
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
        if (!(obj instanceof ActionTargetEntity)) {
            return false;
        }
        if (this != obj) {
            ActionTargetEntity actionTargetEntity = (ActionTargetEntity) obj;
            for (FastJsonResponse$Field fastJsonResponse$Field : f82746j.values()) {
                if (mo7370a(fastJsonResponse$Field)) {
                    if (!actionTargetEntity.mo7370a(fastJsonResponse$Field) || !mo7371b(fastJsonResponse$Field).equals(actionTargetEntity.mo7371b(fastJsonResponse$Field))) {
                        return false;
                    }
                } else if (actionTargetEntity.mo7370a(fastJsonResponse$Field)) {
                    return false;
                }
            }
        }
        return true;
    }

    public final int hashCode() {
        int i = 0;
        for (FastJsonResponse$Field fastJsonResponse$Field : f82746j.values()) {
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
        if (i2 == 6) {
            this.f82751e = i;
            this.f82747a.add(Integer.valueOf(i2));
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
        Set set = this.f82747a;
        if (set.contains(1)) {
            see.m35063b(parcel, 1, this.f82748b);
        }
        if (set.contains(2)) {
            see.m35040a(parcel, 2, this.f82749c, i, true);
        }
        if (set.contains(5)) {
            see.m35046a(parcel, 5, this.f82750d, true);
        }
        if (set.contains(6)) {
            see.m35063b(parcel, 6, this.f82751e);
        }
        if (set.contains(25)) {
            see.m35065b(parcel, 25, this.f82752f, true);
        }
        if (set.contains(61)) {
            see.m35040a(parcel, 61, this.f82753g, i, true);
        }
        if (set.contains(62)) {
            see.m35046a(parcel, 62, this.f82754h, true);
        }
        if (set.contains(89)) {
            see.m35065b(parcel, 89, this.f82755i, true);
        }
        see.m35062b(parcel, a);
    }

    public ActionTargetEntity(Set set, int i, AclDetailsEntity aclDetailsEntity, String str, int i2, List list, LoggedProfileEntity loggedProfileEntity, String str2, List list2) {
        this.f82747a = set;
        this.f82748b = i;
        this.f82749c = aclDetailsEntity;
        this.f82750d = str;
        this.f82751e = i2;
        this.f82752f = list;
        this.f82753g = loggedProfileEntity;
        this.f82754h = str2;
        this.f82755i = list2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo7387b(FastJsonResponse$Field fastJsonResponse$Field, String str, ArrayList arrayList) {
        int i = fastJsonResponse$Field.f30319g;
        if (i == 25) {
            this.f82752f = arrayList;
        } else if (i == 89) {
            this.f82755i = arrayList;
        } else {
            StringBuilder sb = new StringBuilder(64);
            sb.append("Field with id=");
            sb.append(i);
            sb.append(" is not known to be an array of String.");
            throw new IllegalArgumentException(sb.toString());
        }
        this.f82747a.add(Integer.valueOf(i));
    }

    public ActionTargetEntity(Set set, AclDetailsEntity aclDetailsEntity, String str, int i, String str2) {
        this.f82747a = set;
        this.f82748b = 1;
        this.f82749c = aclDetailsEntity;
        this.f82750d = str;
        this.f82751e = i;
        this.f82752f = null;
        this.f82753g = null;
        this.f82754h = str2;
        this.f82755i = null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo7376a(FastJsonResponse$Field fastJsonResponse$Field, String str, String str2) {
        int i = fastJsonResponse$Field.f30319g;
        if (i == 5) {
            this.f82750d = str2;
        } else if (i == 62) {
            this.f82754h = str2;
        } else {
            StringBuilder sb = new StringBuilder(54);
            sb.append("Field with id=");
            sb.append(i);
            sb.append(" is not known to be a String.");
            throw new IllegalArgumentException(sb.toString());
        }
        this.f82747a.add(Integer.valueOf(i));
    }

    /* renamed from: a */
    public final void mo7369a(FastJsonResponse$Field fastJsonResponse$Field, String str, sio sio) {
        int i = fastJsonResponse$Field.f30319g;
        if (i == 2) {
            this.f82749c = (AclDetailsEntity) sio;
        } else if (i == 61) {
            this.f82753g = (LoggedProfileEntity) sio;
        } else {
            String canonicalName = sio.getClass().getCanonicalName();
            StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 62);
            sb.append("Field with id=");
            sb.append(i);
            sb.append(" is not a known custom type.  Found ");
            sb.append(canonicalName);
            sb.append(".");
            throw new IllegalArgumentException(sb.toString());
        }
        this.f82747a.add(Integer.valueOf(i));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo7370a(FastJsonResponse$Field fastJsonResponse$Field) {
        return this.f82747a.contains(Integer.valueOf(fastJsonResponse$Field.f30319g));
    }
}
