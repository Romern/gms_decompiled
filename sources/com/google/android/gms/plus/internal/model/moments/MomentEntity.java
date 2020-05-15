package com.google.android.gms.plus.internal.model.moments;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.server.response.FastJsonResponse$Field;
import com.google.android.gms.common.server.response.FastSafeParcelableJsonResponse;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class MomentEntity extends FastSafeParcelableJsonResponse implements rty {
    public static final Parcelable.Creator CREATOR = new anwx();

    /* renamed from: h */
    private static final HashMap f82448h;

    /* renamed from: a */
    final Set f82449a;

    /* renamed from: b */
    final int f82450b;

    /* renamed from: c */
    String f82451c;

    /* renamed from: d */
    ItemScopeEntity f82452d;

    /* renamed from: e */
    String f82453e;

    /* renamed from: f */
    ItemScopeEntity f82454f;

    /* renamed from: g */
    String f82455g;

    static {
        HashMap hashMap = new HashMap();
        f82448h = hashMap;
        hashMap.put("id", FastJsonResponse$Field.m22666f("id", 2));
        f82448h.put("result", FastJsonResponse$Field.m22653a("result", 4, ItemScopeEntity.class));
        f82448h.put("startDate", FastJsonResponse$Field.m22666f("startDate", 5));
        f82448h.put("target", FastJsonResponse$Field.m22653a("target", 6, ItemScopeEntity.class));
        f82448h.put("type", FastJsonResponse$Field.m22666f("type", 7));
    }

    public MomentEntity() {
        this.f82450b = 1;
        this.f82449a = new HashSet();
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Map mo7367a() {
        return f82448h;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final Object mo7371b(FastJsonResponse$Field fastJsonResponse$Field) {
        int i = fastJsonResponse$Field.f30319g;
        if (i == 2) {
            return this.f82451c;
        }
        if (i == 4) {
            return this.f82452d;
        }
        if (i == 5) {
            return this.f82453e;
        }
        if (i == 6) {
            return this.f82454f;
        }
        if (i == 7) {
            return this.f82455g;
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
        if (!(obj instanceof MomentEntity)) {
            return false;
        }
        if (this != obj) {
            MomentEntity momentEntity = (MomentEntity) obj;
            for (FastJsonResponse$Field fastJsonResponse$Field : f82448h.values()) {
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

    public final int hashCode() {
        int i = 0;
        for (FastJsonResponse$Field fastJsonResponse$Field : f82448h.values()) {
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
            this.f82451c = str2;
        } else if (i == 5) {
            this.f82453e = str2;
        } else if (i == 7) {
            this.f82455g = str2;
        } else {
            StringBuilder sb = new StringBuilder(54);
            sb.append("Field with id=");
            sb.append(i);
            sb.append(" is not known to be a String.");
            throw new IllegalArgumentException(sb.toString());
        }
        this.f82449a.add(Integer.valueOf(i));
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
        Set set = this.f82449a;
        if (set.contains(1)) {
            see.m35063b(parcel, 1, this.f82450b);
        }
        if (set.contains(2)) {
            see.m35046a(parcel, 2, this.f82451c, true);
        }
        if (set.contains(4)) {
            see.m35040a(parcel, 4, this.f82452d, i, true);
        }
        if (set.contains(5)) {
            see.m35046a(parcel, 5, this.f82453e, true);
        }
        if (set.contains(6)) {
            see.m35040a(parcel, 6, this.f82454f, i, true);
        }
        if (set.contains(7)) {
            see.m35046a(parcel, 7, this.f82455g, true);
        }
        see.m35062b(parcel, a);
    }

    public MomentEntity(Set set, int i, String str, ItemScopeEntity itemScopeEntity, String str2, ItemScopeEntity itemScopeEntity2, String str3) {
        this.f82449a = set;
        this.f82450b = i;
        this.f82451c = str;
        this.f82452d = itemScopeEntity;
        this.f82453e = str2;
        this.f82454f = itemScopeEntity2;
        this.f82455g = str3;
    }

    /* renamed from: a */
    public final void mo7369a(FastJsonResponse$Field fastJsonResponse$Field, String str, sio sio) {
        int i = fastJsonResponse$Field.f30319g;
        if (i == 4) {
            this.f82452d = (ItemScopeEntity) sio;
        } else if (i == 6) {
            this.f82454f = (ItemScopeEntity) sio;
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
        this.f82449a.add(Integer.valueOf(i));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo7370a(FastJsonResponse$Field fastJsonResponse$Field) {
        return this.f82449a.contains(Integer.valueOf(fastJsonResponse$Field.f30319g));
    }
}
