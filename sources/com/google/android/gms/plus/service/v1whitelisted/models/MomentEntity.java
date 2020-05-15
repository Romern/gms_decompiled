package com.google.android.gms.plus.service.v1whitelisted.models;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.server.response.FastJsonResponse$Field;
import com.google.android.gms.common.server.response.FastSafeParcelableJsonResponse;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class MomentEntity extends FastSafeParcelableJsonResponse implements ReflectedParcelable, aohj {
    public static final Parcelable.Creator CREATOR = new aohk();

    /* renamed from: j */
    private static final HashMap f82967j;

    /* renamed from: a */
    final Set f82968a;

    /* renamed from: b */
    final int f82969b;

    /* renamed from: c */
    AclEntity f82970c;

    /* renamed from: d */
    public String f82971d;

    /* renamed from: e */
    public String f82972e;

    /* renamed from: f */
    public String f82973f;

    /* renamed from: g */
    public String f82974g;

    /* renamed from: h */
    public String f82975h;

    /* renamed from: i */
    public ItemScope f82976i;

    static {
        HashMap hashMap = new HashMap();
        f82967j = hashMap;
        hashMap.put("access", FastJsonResponse$Field.m22653a("access", 2, AclEntity.class));
        f82967j.put("applicationId", FastJsonResponse$Field.m22666f("applicationId", 3));
        f82967j.put("confirmDeleteText", FastJsonResponse$Field.m22666f("confirmDeleteText", 4));
        f82967j.put("description", FastJsonResponse$Field.m22666f("description", 5));
        f82967j.put("id", FastJsonResponse$Field.m22666f("id", 6));
        f82967j.put("startDate", FastJsonResponse$Field.m22666f("startDate", 10));
        f82967j.put("target", FastJsonResponse$Field.m22653a("target", 11, ItemScope.class));
    }

    public MomentEntity() {
        this.f82969b = 1;
        this.f82968a = new HashSet();
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Map mo7367a() {
        return f82967j;
    }

    /* renamed from: b */
    public final aoem mo42745b() {
        return this.f82970c;
    }

    /* renamed from: bF */
    public final /* bridge */ /* synthetic */ Object mo7556bF() {
        return this;
    }

    /* renamed from: c */
    public final String mo42746c() {
        return this.f82971d;
    }

    /* renamed from: d */
    public final String mo42747d() {
        return this.f82973f;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof MomentEntity)) {
            return false;
        }
        if (this != obj) {
            MomentEntity momentEntity = (MomentEntity) obj;
            for (FastJsonResponse$Field fastJsonResponse$Field : f82967j.values()) {
                if (mo7370a(fastJsonResponse$Field)) {
                    if (!momentEntity.mo7370a(fastJsonResponse$Field) || !mo7371b(fastJsonResponse$Field).equals(momentEntity.mo7371b(fastJsonResponse$Field))) {
                        return false;
                    }
                } else if (momentEntity.mo7370a(fastJsonResponse$Field)) {
                    return false;
                }
            }
        }
        return true;
    }

    /* renamed from: f */
    public final String mo42748f() {
        return this.f82974g;
    }

    /* renamed from: g */
    public final String mo42749g() {
        return this.f82975h;
    }

    /* renamed from: h */
    public final boolean mo42750h() {
        return this.f82968a.contains(10);
    }

    public final int hashCode() {
        int i = 0;
        for (FastJsonResponse$Field fastJsonResponse$Field : f82967j.values()) {
            if (mo7370a(fastJsonResponse$Field)) {
                i = i + fastJsonResponse$Field.f30319g + mo7371b(fastJsonResponse$Field).hashCode();
            }
        }
        return i;
    }

    /* renamed from: i */
    public final ItemScope mo42751i() {
        return this.f82976i;
    }

    /* renamed from: j */
    public final boolean mo46694j() {
        return this.f82968a.contains(4);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo7376a(FastJsonResponse$Field fastJsonResponse$Field, String str, String str2) {
        int i = fastJsonResponse$Field.f30319g;
        if (i == 3) {
            this.f82971d = str2;
        } else if (i == 4) {
            this.f82972e = str2;
        } else if (i == 5) {
            this.f82973f = str2;
        } else if (i == 6) {
            this.f82974g = str2;
        } else if (i == 10) {
            this.f82975h = str2;
        } else {
            StringBuilder sb = new StringBuilder(54);
            sb.append("Field with id=");
            sb.append(i);
            sb.append(" is not known to be a String.");
            throw new IllegalArgumentException(sb.toString());
        }
        this.f82968a.add(Integer.valueOf(i));
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final Object mo7371b(FastJsonResponse$Field fastJsonResponse$Field) {
        int i = fastJsonResponse$Field.f30319g;
        if (i == 2) {
            return this.f82970c;
        }
        if (i == 3) {
            return this.f82971d;
        }
        if (i == 4) {
            return this.f82972e;
        }
        if (i == 5) {
            return this.f82973f;
        }
        if (i == 6) {
            return this.f82974g;
        }
        if (i == 10) {
            return this.f82975h;
        }
        if (i == 11) {
            return this.f82976i;
        }
        StringBuilder sb = new StringBuilder(38);
        sb.append("Unknown safe parcelable id=");
        sb.append(i);
        throw new IllegalStateException(sb.toString());
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
        Set set = this.f82968a;
        if (set.contains(1)) {
            see.m35063b(parcel, 1, this.f82969b);
        }
        if (set.contains(2)) {
            see.m35040a(parcel, 2, this.f82970c, i, true);
        }
        if (set.contains(3)) {
            see.m35046a(parcel, 3, this.f82971d, true);
        }
        if (set.contains(4)) {
            see.m35046a(parcel, 4, this.f82972e, true);
        }
        if (set.contains(5)) {
            see.m35046a(parcel, 5, this.f82973f, true);
        }
        if (set.contains(6)) {
            see.m35046a(parcel, 6, this.f82974g, true);
        }
        if (set.contains(10)) {
            see.m35046a(parcel, 10, this.f82975h, true);
        }
        if (set.contains(11)) {
            see.m35040a(parcel, 11, this.f82976i, i, true);
        }
        see.m35062b(parcel, a);
    }

    public MomentEntity(Set set, int i, AclEntity aclEntity, String str, String str2, String str3, String str4, String str5, ItemScope itemScope) {
        this.f82968a = set;
        this.f82969b = i;
        this.f82970c = aclEntity;
        this.f82971d = str;
        this.f82972e = str2;
        this.f82973f = str3;
        this.f82974g = str4;
        this.f82975h = str5;
        this.f82976i = itemScope;
    }

    /* renamed from: a */
    public final void mo7369a(FastJsonResponse$Field fastJsonResponse$Field, String str, sio sio) {
        int i = fastJsonResponse$Field.f30319g;
        if (i == 2) {
            this.f82970c = (AclEntity) sio;
        } else if (i == 11) {
            this.f82976i = (ItemScope) sio;
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
        this.f82968a.add(Integer.valueOf(i));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo7370a(FastJsonResponse$Field fastJsonResponse$Field) {
        return this.f82968a.contains(Integer.valueOf(fastJsonResponse$Field.f30319g));
    }
}
