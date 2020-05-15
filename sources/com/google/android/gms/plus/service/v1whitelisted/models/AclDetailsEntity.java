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
public final class AclDetailsEntity extends FastSafeParcelableJsonResponse implements aoeo {
    public static final Parcelable.Creator CREATOR = new aoep();

    /* renamed from: n */
    private static final HashMap f82719n;

    /* renamed from: a */
    final Set f82720a;

    /* renamed from: b */
    final int f82721b;

    /* renamed from: c */
    List f82722c;

    /* renamed from: d */
    List f82723d;

    /* renamed from: e */
    int f82724e;

    /* renamed from: f */
    int f82725f;

    /* renamed from: g */
    float f82726g;

    /* renamed from: h */
    int f82727h;

    /* renamed from: i */
    float f82728i;

    /* renamed from: j */
    int f82729j;

    /* renamed from: k */
    float f82730k;

    /* renamed from: l */
    int f82731l;

    /* renamed from: m */
    int f82732m;

    static {
        HashMap hashMap = new HashMap();
        f82719n = hashMap;
        hashMap.put("circle", FastJsonResponse$Field.m22657b("circle", 2, LoggedCircleEntity.class));
        f82719n.put("person", FastJsonResponse$Field.m22657b("person", 4, LoggedCircleMemberEntity.class));
        f82719n.put("personCount", FastJsonResponse$Field.m22651a("personCount", 5));
        f82719n.put("selectedAlphabeticalIndividualCount", FastJsonResponse$Field.m22651a("selectedAlphabeticalIndividualCount", 6));
        f82719n.put("selectedAlphabeticalIndividualCtr", FastJsonResponse$Field.m22660c("selectedAlphabeticalIndividualCtr", 7));
        f82719n.put("selectedAvatarCount", FastJsonResponse$Field.m22651a("selectedAvatarCount", 8));
        f82719n.put("selectedAvatarCtr", FastJsonResponse$Field.m22660c("selectedAvatarCtr", 9));
        f82719n.put("selectedRankedIndividualCount", FastJsonResponse$Field.m22651a("selectedRankedIndividualCount", 10));
        f82719n.put("selectedRankedIndividualCtr", FastJsonResponse$Field.m22660c("selectedRankedIndividualCtr", 11));
        f82719n.put("totalAvatarCount", FastJsonResponse$Field.m22651a("totalAvatarCount", 13));
        f82719n.put("totalRankedIndividualCount", FastJsonResponse$Field.m22651a("totalRankedIndividualCount", 14));
    }

    public AclDetailsEntity() {
        this.f82721b = 1;
        this.f82720a = new HashSet();
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Map mo7367a() {
        return f82719n;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final Object mo7371b(FastJsonResponse$Field fastJsonResponse$Field) {
        int i = fastJsonResponse$Field.f30319g;
        switch (i) {
            case 2:
                return this.f82722c;
            case 3:
            case 12:
            default:
                StringBuilder sb = new StringBuilder(38);
                sb.append("Unknown safe parcelable id=");
                sb.append(i);
                throw new IllegalStateException(sb.toString());
            case 4:
                return this.f82723d;
            case 5:
                return Integer.valueOf(this.f82724e);
            case 6:
                return Integer.valueOf(this.f82725f);
            case 7:
                return Float.valueOf(this.f82726g);
            case 8:
                return Integer.valueOf(this.f82727h);
            case 9:
                return Float.valueOf(this.f82728i);
            case 10:
                return Integer.valueOf(this.f82729j);
            case 11:
                return Float.valueOf(this.f82730k);
            case 13:
                return Integer.valueOf(this.f82731l);
            case 14:
                return Integer.valueOf(this.f82732m);
        }
    }

    /* renamed from: bF */
    public final /* bridge */ /* synthetic */ Object mo7556bF() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof AclDetailsEntity)) {
            return false;
        }
        if (this != obj) {
            AclDetailsEntity aclDetailsEntity = (AclDetailsEntity) obj;
            for (FastJsonResponse$Field fastJsonResponse$Field : f82719n.values()) {
                if (mo7370a(fastJsonResponse$Field)) {
                    if (!aclDetailsEntity.mo7370a(fastJsonResponse$Field) || !mo7371b(fastJsonResponse$Field).equals(aclDetailsEntity.mo7371b(fastJsonResponse$Field))) {
                        return false;
                    }
                } else if (aclDetailsEntity.mo7370a(fastJsonResponse$Field)) {
                    return false;
                }
            }
        }
        return true;
    }

    public final int hashCode() {
        int i = 0;
        for (FastJsonResponse$Field fastJsonResponse$Field : f82719n.values()) {
            if (mo7370a(fastJsonResponse$Field)) {
                i = i + fastJsonResponse$Field.f30319g + mo7371b(fastJsonResponse$Field).hashCode();
            }
        }
        return i;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo17874a(FastJsonResponse$Field fastJsonResponse$Field, String str, float f) {
        int i = fastJsonResponse$Field.f30319g;
        if (i == 7) {
            this.f82726g = f;
        } else if (i == 9) {
            this.f82728i = f;
        } else if (i == 11) {
            this.f82730k = f;
        } else {
            StringBuilder sb = new StringBuilder(53);
            sb.append("Field with id=");
            sb.append(i);
            sb.append(" is not known to be a float.");
            throw new IllegalArgumentException(sb.toString());
        }
        this.f82720a.add(Integer.valueOf(i));
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        Set set = this.f82720a;
        if (set.contains(1)) {
            see.m35063b(parcel, 1, this.f82721b);
        }
        if (set.contains(2)) {
            see.m35066c(parcel, 2, this.f82722c, true);
        }
        if (set.contains(4)) {
            see.m35066c(parcel, 4, this.f82723d, true);
        }
        if (set.contains(5)) {
            see.m35063b(parcel, 5, this.f82724e);
        }
        if (set.contains(6)) {
            see.m35063b(parcel, 6, this.f82725f);
        }
        if (set.contains(7)) {
            see.m35034a(parcel, 7, this.f82726g);
        }
        if (set.contains(8)) {
            see.m35063b(parcel, 8, this.f82727h);
        }
        if (set.contains(9)) {
            see.m35034a(parcel, 9, this.f82728i);
        }
        if (set.contains(10)) {
            see.m35063b(parcel, 10, this.f82729j);
        }
        if (set.contains(11)) {
            see.m35034a(parcel, 11, this.f82730k);
        }
        if (set.contains(13)) {
            see.m35063b(parcel, 13, this.f82731l);
        }
        if (set.contains(14)) {
            see.m35063b(parcel, 14, this.f82732m);
        }
        see.m35062b(parcel, a);
    }

    public AclDetailsEntity(Set set, int i, int i2, float f, int i3, float f2, int i4, float f3, int i5, int i6) {
        this.f82720a = set;
        this.f82721b = 1;
        this.f82722c = null;
        this.f82723d = null;
        this.f82724e = i;
        this.f82725f = i2;
        this.f82726g = f;
        this.f82727h = i3;
        this.f82728i = f2;
        this.f82729j = i4;
        this.f82730k = f3;
        this.f82731l = i5;
        this.f82732m = i6;
    }

    public AclDetailsEntity(Set set, int i, List list, List list2, int i2, int i3, float f, int i4, float f2, int i5, float f3, int i6, int i7) {
        this.f82720a = set;
        this.f82721b = i;
        this.f82722c = list;
        this.f82723d = list2;
        this.f82724e = i2;
        this.f82725f = i3;
        this.f82726g = f;
        this.f82727h = i4;
        this.f82728i = f2;
        this.f82729j = i5;
        this.f82730k = f3;
        this.f82731l = i6;
        this.f82732m = i7;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo7391a(FastJsonResponse$Field fastJsonResponse$Field, String str, int i) {
        int i2 = fastJsonResponse$Field.f30319g;
        if (i2 == 5) {
            this.f82724e = i;
        } else if (i2 == 6) {
            this.f82725f = i;
        } else if (i2 == 8) {
            this.f82727h = i;
        } else if (i2 == 10) {
            this.f82729j = i;
        } else if (i2 == 13) {
            this.f82731l = i;
        } else if (i2 == 14) {
            this.f82732m = i;
        } else {
            StringBuilder sb = new StringBuilder(52);
            sb.append("Field with id=");
            sb.append(i2);
            sb.append(" is not known to be an int.");
            throw new IllegalArgumentException(sb.toString());
        }
        this.f82720a.add(Integer.valueOf(i2));
    }

    /* renamed from: a */
    public final void mo7368a(FastJsonResponse$Field fastJsonResponse$Field, String str, ArrayList arrayList) {
        int i = fastJsonResponse$Field.f30319g;
        if (i == 2) {
            this.f82722c = arrayList;
        } else if (i == 4) {
            this.f82723d = arrayList;
        } else {
            String canonicalName = arrayList.getClass().getCanonicalName();
            StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 71);
            sb.append("Field with id=");
            sb.append(i);
            sb.append(" is not a known array of custom type.  Found ");
            sb.append(canonicalName);
            sb.append(".");
            throw new IllegalArgumentException(sb.toString());
        }
        this.f82720a.add(Integer.valueOf(i));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo7370a(FastJsonResponse$Field fastJsonResponse$Field) {
        return this.f82720a.contains(Integer.valueOf(fastJsonResponse$Field.f30319g));
    }
}
