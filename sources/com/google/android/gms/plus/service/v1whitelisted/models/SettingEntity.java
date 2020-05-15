package com.google.android.gms.plus.service.v1whitelisted.models;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.server.response.FastJsonResponse$Field;
import com.google.android.gms.common.server.response.FastSafeParcelableJsonResponse;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class SettingEntity extends FastSafeParcelableJsonResponse implements aoie {
    public static final Parcelable.Creator CREATOR = new aoif();

    /* renamed from: h */
    private static final HashMap f83052h;

    /* renamed from: a */
    final Set f83053a;

    /* renamed from: b */
    final int f83054b;

    /* renamed from: c */
    AclEntity f83055c;

    /* renamed from: d */
    boolean f83056d;

    /* renamed from: e */
    String f83057e;

    /* renamed from: f */
    int f83058f;

    /* renamed from: g */
    String f83059g;

    static {
        HashMap hashMap = new HashMap();
        f83052h = hashMap;
        hashMap.put("accessValue", FastJsonResponse$Field.m22653a("accessValue", 2, AclEntity.class));
        f83052h.put("booleanValue", FastJsonResponse$Field.m22664e("booleanValue", 3));
        f83052h.put("id", FastJsonResponse$Field.m22666f("id", 5));
        f83052h.put("int32Value", FastJsonResponse$Field.m22651a("int32Value", 6));
        f83052h.put("stringValue", FastJsonResponse$Field.m22666f("stringValue", 9));
    }

    public SettingEntity() {
        this.f83054b = 1;
        this.f83053a = new HashSet();
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Map mo7367a() {
        return f83052h;
    }

    /* renamed from: b */
    public final aoem mo42795b() {
        return this.f83055c;
    }

    /* renamed from: bF */
    public final /* bridge */ /* synthetic */ Object mo7556bF() {
        return this;
    }

    /* renamed from: c */
    public final boolean mo42796c() {
        return this.f83053a.contains(2);
    }

    /* renamed from: d */
    public final boolean mo42797d() {
        return this.f83056d;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof SettingEntity)) {
            return false;
        }
        if (this != obj) {
            SettingEntity settingEntity = (SettingEntity) obj;
            for (FastJsonResponse$Field fastJsonResponse$Field : f83052h.values()) {
                if (mo7370a(fastJsonResponse$Field)) {
                    if (!settingEntity.mo7370a(fastJsonResponse$Field) || !mo7371b(fastJsonResponse$Field).equals(settingEntity.mo7371b(fastJsonResponse$Field))) {
                        return false;
                    }
                } else if (settingEntity.mo7370a(fastJsonResponse$Field)) {
                    return false;
                }
            }
        }
        return true;
    }

    /* renamed from: f */
    public final boolean mo42798f() {
        return this.f83053a.contains(3);
    }

    /* renamed from: g */
    public final String mo42799g() {
        return this.f83057e;
    }

    /* renamed from: h */
    public final int mo42800h() {
        return this.f83058f;
    }

    public final int hashCode() {
        int i = 0;
        for (FastJsonResponse$Field fastJsonResponse$Field : f83052h.values()) {
            if (mo7370a(fastJsonResponse$Field)) {
                i = i + fastJsonResponse$Field.f30319g + mo7371b(fastJsonResponse$Field).hashCode();
            }
        }
        return i;
    }

    /* renamed from: i */
    public final boolean mo42801i() {
        return this.f83053a.contains(6);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo7391a(FastJsonResponse$Field fastJsonResponse$Field, String str, int i) {
        int i2 = fastJsonResponse$Field.f30319g;
        if (i2 == 6) {
            this.f83058f = i;
            this.f83053a.add(Integer.valueOf(i2));
            return;
        }
        StringBuilder sb = new StringBuilder(52);
        sb.append("Field with id=");
        sb.append(i2);
        sb.append(" is not known to be an int.");
        throw new IllegalArgumentException(sb.toString());
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final Object mo7371b(FastJsonResponse$Field fastJsonResponse$Field) {
        int i = fastJsonResponse$Field.f30319g;
        if (i == 2) {
            return this.f83055c;
        }
        if (i == 3) {
            return Boolean.valueOf(this.f83056d);
        }
        if (i == 5) {
            return this.f83057e;
        }
        if (i == 6) {
            return Integer.valueOf(this.f83058f);
        }
        if (i == 9) {
            return this.f83059g;
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
        Set set = this.f83053a;
        if (set.contains(1)) {
            see.m35063b(parcel, 1, this.f83054b);
        }
        if (set.contains(2)) {
            see.m35040a(parcel, 2, this.f83055c, i, true);
        }
        if (set.contains(3)) {
            see.m35051a(parcel, 3, this.f83056d);
        }
        if (set.contains(5)) {
            see.m35046a(parcel, 5, this.f83057e, true);
        }
        if (set.contains(6)) {
            see.m35063b(parcel, 6, this.f83058f);
        }
        if (set.contains(9)) {
            see.m35046a(parcel, 9, this.f83059g, true);
        }
        see.m35062b(parcel, a);
    }

    public SettingEntity(Set set, int i, AclEntity aclEntity, boolean z, String str, int i2, String str2) {
        this.f83053a = set;
        this.f83054b = i;
        this.f83055c = aclEntity;
        this.f83056d = z;
        this.f83057e = str;
        this.f83058f = i2;
        this.f83059g = str2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo7376a(FastJsonResponse$Field fastJsonResponse$Field, String str, String str2) {
        int i = fastJsonResponse$Field.f30319g;
        if (i == 5) {
            this.f83057e = str2;
        } else if (i == 9) {
            this.f83059g = str2;
        } else {
            StringBuilder sb = new StringBuilder(54);
            sb.append("Field with id=");
            sb.append(i);
            sb.append(" is not known to be a String.");
            throw new IllegalArgumentException(sb.toString());
        }
        this.f83053a.add(Integer.valueOf(i));
    }

    /* renamed from: a */
    public final void mo7369a(FastJsonResponse$Field fastJsonResponse$Field, String str, sio sio) {
        int i = fastJsonResponse$Field.f30319g;
        if (i == 2) {
            this.f83055c = (AclEntity) sio;
            this.f83053a.add(Integer.valueOf(i));
            return;
        }
        String canonicalName = sio.getClass().getCanonicalName();
        StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 62);
        sb.append("Field with id=");
        sb.append(i);
        sb.append(" is not a known custom type.  Found ");
        sb.append(canonicalName);
        sb.append(".");
        throw new IllegalArgumentException(sb.toString());
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo7395a(FastJsonResponse$Field fastJsonResponse$Field, String str, boolean z) {
        int i = fastJsonResponse$Field.f30319g;
        if (i == 3) {
            this.f83056d = z;
            this.f83053a.add(Integer.valueOf(i));
            return;
        }
        StringBuilder sb = new StringBuilder(55);
        sb.append("Field with id=");
        sb.append(i);
        sb.append(" is not known to be a boolean.");
        throw new IllegalArgumentException(sb.toString());
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo7370a(FastJsonResponse$Field fastJsonResponse$Field) {
        return this.f83053a.contains(Integer.valueOf(fastJsonResponse$Field.f30319g));
    }
}
