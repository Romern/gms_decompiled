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
public final class OzDeviceInfoEntity extends FastSafeParcelableJsonResponse implements rty {
    public static final Parcelable.Creator CREATOR = new aohn();

    /* renamed from: k */
    private static final HashMap f82983k;

    /* renamed from: a */
    final Set f82984a;

    /* renamed from: b */
    final int f82985b;

    /* renamed from: c */
    int f82986c;

    /* renamed from: d */
    boolean f82987d;

    /* renamed from: e */
    boolean f82988e;

    /* renamed from: f */
    String f82989f;

    /* renamed from: g */
    String f82990g;

    /* renamed from: h */
    String f82991h;

    /* renamed from: i */
    int f82992i;

    /* renamed from: j */
    int f82993j;

    static {
        HashMap hashMap = new HashMap();
        f82983k = hashMap;
        hashMap.put("densityDpi", FastJsonResponse$Field.m22651a("densityDpi", 2));
        f82983k.put("featureLandscape", FastJsonResponse$Field.m22664e("featureLandscape", 3));
        f82983k.put("featurePortrait", FastJsonResponse$Field.m22664e("featurePortrait", 4));
        f82983k.put("fingerprint", FastJsonResponse$Field.m22666f("fingerprint", 5));
        f82983k.put("manufacturer", FastJsonResponse$Field.m22666f("manufacturer", 6));
        f82983k.put("orientation", FastJsonResponse$Field.m22666f("orientation", 7));
        f82983k.put("screenHeightDp", FastJsonResponse$Field.m22651a("screenHeightDp", 8));
        f82983k.put("screenWidthDp", FastJsonResponse$Field.m22651a("screenWidthDp", 9));
    }

    public OzDeviceInfoEntity() {
        this.f82985b = 1;
        this.f82984a = new HashSet();
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Map mo7367a() {
        return f82983k;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final Object mo7371b(FastJsonResponse$Field fastJsonResponse$Field) {
        int i = fastJsonResponse$Field.f30319g;
        switch (i) {
            case 2:
                return Integer.valueOf(this.f82986c);
            case 3:
                return Boolean.valueOf(this.f82987d);
            case 4:
                return Boolean.valueOf(this.f82988e);
            case 5:
                return this.f82989f;
            case 6:
                return this.f82990g;
            case 7:
                return this.f82991h;
            case 8:
                return Integer.valueOf(this.f82992i);
            case 9:
                return Integer.valueOf(this.f82993j);
            default:
                StringBuilder sb = new StringBuilder(38);
                sb.append("Unknown safe parcelable id=");
                sb.append(i);
                throw new IllegalStateException(sb.toString());
        }
    }

    /* renamed from: bF */
    public final /* bridge */ /* synthetic */ Object mo7556bF() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof OzDeviceInfoEntity)) {
            return false;
        }
        if (this != obj) {
            OzDeviceInfoEntity ozDeviceInfoEntity = (OzDeviceInfoEntity) obj;
            for (FastJsonResponse$Field fastJsonResponse$Field : f82983k.values()) {
                if (mo7370a(fastJsonResponse$Field)) {
                    if (!ozDeviceInfoEntity.mo7370a(fastJsonResponse$Field) || !mo7371b(fastJsonResponse$Field).equals(ozDeviceInfoEntity.mo7371b(fastJsonResponse$Field))) {
                        return false;
                    }
                } else if (ozDeviceInfoEntity.mo7370a(fastJsonResponse$Field)) {
                    return false;
                }
            }
        }
        return true;
    }

    public final int hashCode() {
        int i = 0;
        for (FastJsonResponse$Field fastJsonResponse$Field : f82983k.values()) {
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
        if (i2 == 2) {
            this.f82986c = i;
        } else if (i2 == 8) {
            this.f82992i = i;
        } else if (i2 == 9) {
            this.f82993j = i;
        } else {
            StringBuilder sb = new StringBuilder(52);
            sb.append("Field with id=");
            sb.append(i2);
            sb.append(" is not known to be an int.");
            throw new IllegalArgumentException(sb.toString());
        }
        this.f82984a.add(Integer.valueOf(i2));
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
        Set set = this.f82984a;
        if (set.contains(1)) {
            see.m35063b(parcel, 1, this.f82985b);
        }
        if (set.contains(2)) {
            see.m35063b(parcel, 2, this.f82986c);
        }
        if (set.contains(3)) {
            see.m35051a(parcel, 3, this.f82987d);
        }
        if (set.contains(4)) {
            see.m35051a(parcel, 4, this.f82988e);
        }
        if (set.contains(5)) {
            see.m35046a(parcel, 5, this.f82989f, true);
        }
        if (set.contains(6)) {
            see.m35046a(parcel, 6, this.f82990g, true);
        }
        if (set.contains(7)) {
            see.m35046a(parcel, 7, this.f82991h, true);
        }
        if (set.contains(8)) {
            see.m35063b(parcel, 8, this.f82992i);
        }
        if (set.contains(9)) {
            see.m35063b(parcel, 9, this.f82993j);
        }
        see.m35062b(parcel, a);
    }

    public OzDeviceInfoEntity(Set set, int i, int i2, boolean z, boolean z2, String str, String str2, String str3, int i3, int i4) {
        this.f82984a = set;
        this.f82985b = i;
        this.f82986c = i2;
        this.f82987d = z;
        this.f82988e = z2;
        this.f82989f = str;
        this.f82990g = str2;
        this.f82991h = str3;
        this.f82992i = i3;
        this.f82993j = i4;
    }

    public OzDeviceInfoEntity(Set set, int i, boolean z, boolean z2, String str, String str2, String str3, int i2, int i3) {
        this.f82984a = set;
        this.f82985b = 1;
        this.f82986c = i;
        this.f82987d = z;
        this.f82988e = z2;
        this.f82989f = str;
        this.f82990g = str2;
        this.f82991h = str3;
        this.f82992i = i2;
        this.f82993j = i3;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo7376a(FastJsonResponse$Field fastJsonResponse$Field, String str, String str2) {
        int i = fastJsonResponse$Field.f30319g;
        if (i == 5) {
            this.f82989f = str2;
        } else if (i == 6) {
            this.f82990g = str2;
        } else if (i == 7) {
            this.f82991h = str2;
        } else {
            StringBuilder sb = new StringBuilder(54);
            sb.append("Field with id=");
            sb.append(i);
            sb.append(" is not known to be a String.");
            throw new IllegalArgumentException(sb.toString());
        }
        this.f82984a.add(Integer.valueOf(i));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo7395a(FastJsonResponse$Field fastJsonResponse$Field, String str, boolean z) {
        int i = fastJsonResponse$Field.f30319g;
        if (i == 3) {
            this.f82987d = z;
        } else if (i == 4) {
            this.f82988e = z;
        } else {
            StringBuilder sb = new StringBuilder(55);
            sb.append("Field with id=");
            sb.append(i);
            sb.append(" is not known to be a boolean.");
            throw new IllegalArgumentException(sb.toString());
        }
        this.f82984a.add(Integer.valueOf(i));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo7370a(FastJsonResponse$Field fastJsonResponse$Field) {
        return this.f82984a.contains(Integer.valueOf(fastJsonResponse$Field.f30319g));
    }
}
