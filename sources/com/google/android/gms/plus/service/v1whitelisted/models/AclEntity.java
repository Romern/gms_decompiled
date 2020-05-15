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
public final class AclEntity extends FastSafeParcelableJsonResponse implements aoem {
    public static final Parcelable.Creator CREATOR = new aoeq();

    /* renamed from: m */
    private static final HashMap f82733m;

    /* renamed from: a */
    final Set f82734a;

    /* renamed from: b */
    final int f82735b;

    /* renamed from: c */
    public String f82736c;

    /* renamed from: d */
    public String f82737d;

    /* renamed from: e */
    boolean f82738e;

    /* renamed from: f */
    String f82739f;

    /* renamed from: g */
    public List f82740g;

    /* renamed from: h */
    boolean f82741h;

    /* renamed from: i */
    boolean f82742i;

    /* renamed from: j */
    public boolean f82743j;

    /* renamed from: k */
    public boolean f82744k;

    /* renamed from: l */
    public String f82745l;

    static {
        HashMap hashMap = new HashMap();
        f82733m = hashMap;
        hashMap.put("accessSummary", FastJsonResponse$Field.m22666f("accessSummary", 2));
        f82733m.put("description", FastJsonResponse$Field.m22666f("description", 3));
        f82733m.put("domainRestricted", FastJsonResponse$Field.m22664e("domainRestricted", 4));
        f82733m.put("etag", FastJsonResponse$Field.m22666f("etag", 5));
        f82733m.put("items", FastJsonResponse$Field.m22657b("items", 6, PlusAclentryResourceEntity.class));
        f82733m.put("readOnly", FastJsonResponse$Field.m22664e("readOnly", 8));
        f82733m.put("restricted", FastJsonResponse$Field.m22664e("restricted", 9));
        f82733m.put("showCircles", FastJsonResponse$Field.m22664e("showCircles", 10));
        f82733m.put("showContacts", FastJsonResponse$Field.m22664e("showContacts", 11));
        f82733m.put("title", FastJsonResponse$Field.m22666f("title", 12));
    }

    public AclEntity() {
        this.f82735b = 1;
        this.f82734a = new HashSet();
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Map mo7367a() {
        return f82733m;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final Object mo7371b(FastJsonResponse$Field fastJsonResponse$Field) {
        int i = fastJsonResponse$Field.f30319g;
        switch (i) {
            case 2:
                return this.f82736c;
            case 3:
                return this.f82737d;
            case 4:
                return Boolean.valueOf(this.f82738e);
            case 5:
                return this.f82739f;
            case 6:
                return this.f82740g;
            case 7:
            default:
                StringBuilder sb = new StringBuilder(38);
                sb.append("Unknown safe parcelable id=");
                sb.append(i);
                throw new IllegalStateException(sb.toString());
            case 8:
                return Boolean.valueOf(this.f82741h);
            case 9:
                return Boolean.valueOf(this.f82742i);
            case 10:
                return Boolean.valueOf(this.f82743j);
            case 11:
                return Boolean.valueOf(this.f82744k);
            case 12:
                return this.f82745l;
        }
    }

    /* renamed from: b */
    public final String mo42629b() {
        return this.f82737d;
    }

    /* renamed from: bF */
    public final /* bridge */ /* synthetic */ Object mo7556bF() {
        return this;
    }

    /* renamed from: c */
    public final boolean mo42630c() {
        return this.f82734a.contains(4);
    }

    /* renamed from: d */
    public final List mo42631d() {
        return this.f82740g;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof AclEntity)) {
            return false;
        }
        if (this != obj) {
            AclEntity aclEntity = (AclEntity) obj;
            for (FastJsonResponse$Field fastJsonResponse$Field : f82733m.values()) {
                if (mo7370a(fastJsonResponse$Field)) {
                    if (!aclEntity.mo7370a(fastJsonResponse$Field) || !mo7371b(fastJsonResponse$Field).equals(aclEntity.mo7371b(fastJsonResponse$Field))) {
                        return false;
                    }
                } else if (aclEntity.mo7370a(fastJsonResponse$Field)) {
                    return false;
                }
            }
        }
        return true;
    }

    /* renamed from: f */
    public final boolean mo42632f() {
        return this.f82734a.contains(6);
    }

    /* renamed from: g */
    public final boolean mo42633g() {
        return this.f82741h;
    }

    /* renamed from: h */
    public final boolean mo42634h() {
        return this.f82734a.contains(8);
    }

    public final int hashCode() {
        int i = 0;
        for (FastJsonResponse$Field fastJsonResponse$Field : f82733m.values()) {
            if (mo7370a(fastJsonResponse$Field)) {
                i = i + fastJsonResponse$Field.f30319g + mo7371b(fastJsonResponse$Field).hashCode();
            }
        }
        return i;
    }

    /* renamed from: i */
    public final boolean mo42635i() {
        return this.f82742i;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo7376a(FastJsonResponse$Field fastJsonResponse$Field, String str, String str2) {
        int i = fastJsonResponse$Field.f30319g;
        if (i == 2) {
            this.f82736c = str2;
        } else if (i == 3) {
            this.f82737d = str2;
        } else if (i == 5) {
            this.f82739f = str2;
        } else if (i == 12) {
            this.f82745l = str2;
        } else {
            StringBuilder sb = new StringBuilder(54);
            sb.append("Field with id=");
            sb.append(i);
            sb.append(" is not known to be a String.");
            throw new IllegalArgumentException(sb.toString());
        }
        this.f82734a.add(Integer.valueOf(i));
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
        Set set = this.f82734a;
        if (set.contains(1)) {
            see.m35063b(parcel, 1, this.f82735b);
        }
        if (set.contains(2)) {
            see.m35046a(parcel, 2, this.f82736c, true);
        }
        if (set.contains(3)) {
            see.m35046a(parcel, 3, this.f82737d, true);
        }
        if (set.contains(4)) {
            see.m35051a(parcel, 4, this.f82738e);
        }
        if (set.contains(5)) {
            see.m35046a(parcel, 5, this.f82739f, true);
        }
        if (set.contains(6)) {
            see.m35066c(parcel, 6, this.f82740g, true);
        }
        if (set.contains(8)) {
            see.m35051a(parcel, 8, this.f82741h);
        }
        if (set.contains(9)) {
            see.m35051a(parcel, 9, this.f82742i);
        }
        if (set.contains(10)) {
            see.m35051a(parcel, 10, this.f82743j);
        }
        if (set.contains(11)) {
            see.m35051a(parcel, 11, this.f82744k);
        }
        if (set.contains(12)) {
            see.m35046a(parcel, 12, this.f82745l, true);
        }
        see.m35062b(parcel, a);
    }

    public AclEntity(Set set, int i, String str, String str2, boolean z, String str3, List list, boolean z2, boolean z3, boolean z4, boolean z5, String str4) {
        this.f82734a = set;
        this.f82735b = i;
        this.f82736c = str;
        this.f82737d = str2;
        this.f82738e = z;
        this.f82739f = str3;
        this.f82740g = list;
        this.f82741h = z2;
        this.f82742i = z3;
        this.f82743j = z4;
        this.f82744k = z5;
        this.f82745l = str4;
    }

    public AclEntity(Set set, boolean z, List list, boolean z2, boolean z3) {
        this.f82734a = set;
        this.f82735b = 1;
        this.f82736c = null;
        this.f82737d = null;
        this.f82738e = z;
        this.f82739f = null;
        this.f82740g = list;
        this.f82741h = false;
        this.f82742i = false;
        this.f82743j = z2;
        this.f82744k = z3;
        this.f82745l = null;
    }

    /* renamed from: a */
    public final void mo7368a(FastJsonResponse$Field fastJsonResponse$Field, String str, ArrayList arrayList) {
        int i = fastJsonResponse$Field.f30319g;
        if (i == 6) {
            this.f82740g = arrayList;
            this.f82734a.add(Integer.valueOf(i));
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
    public final void mo7395a(FastJsonResponse$Field fastJsonResponse$Field, String str, boolean z) {
        int i = fastJsonResponse$Field.f30319g;
        if (i != 4) {
            switch (i) {
                case 8:
                    this.f82741h = z;
                    break;
                case 9:
                    this.f82742i = z;
                    break;
                case 10:
                    this.f82743j = z;
                    break;
                case 11:
                    this.f82744k = z;
                    break;
                default:
                    StringBuilder sb = new StringBuilder(55);
                    sb.append("Field with id=");
                    sb.append(i);
                    sb.append(" is not known to be a boolean.");
                    throw new IllegalArgumentException(sb.toString());
            }
        } else {
            this.f82738e = z;
        }
        this.f82734a.add(Integer.valueOf(i));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo7370a(FastJsonResponse$Field fastJsonResponse$Field) {
        return this.f82734a.contains(Integer.valueOf(fastJsonResponse$Field.f30319g));
    }
}
