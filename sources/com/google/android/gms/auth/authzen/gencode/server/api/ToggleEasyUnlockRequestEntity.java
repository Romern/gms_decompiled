package com.google.android.gms.auth.authzen.gencode.server.api;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.server.response.FastJsonResponse$Field;
import com.google.android.gms.common.server.response.FastSafeParcelableJsonResponse;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ToggleEasyUnlockRequestEntity extends FastSafeParcelableJsonResponse implements rty {
    public static final Parcelable.Creator CREATOR = new iia();

    /* renamed from: h */
    private static final HashMap f10465h;

    /* renamed from: a */
    final Set f10466a;

    /* renamed from: b */
    boolean f10467b;

    /* renamed from: c */
    DeviceClassifierEntity f10468c;

    /* renamed from: d */
    boolean f10469d;

    /* renamed from: e */
    String f10470e;

    /* renamed from: f */
    boolean f10471f;

    /* renamed from: g */
    String f10472g;

    static {
        HashMap hashMap = new HashMap();
        f10465h = hashMap;
        hashMap.put("applyToAll", FastJsonResponse$Field.m22664e("applyToAll", 2));
        f10465h.put("deviceClassifier", FastJsonResponse$Field.m22653a("deviceClassifier", 3, DeviceClassifierEntity.class));
        f10465h.put("enable", FastJsonResponse$Field.m22664e("enable", 4));
        f10465h.put("feature", FastJsonResponse$Field.m22666f("feature", 5));
        f10465h.put("isExclusive", FastJsonResponse$Field.m22664e("isExclusive", 6));
        f10465h.put("publicKey", FastJsonResponse$Field.m22666f("publicKey", 7));
    }

    public ToggleEasyUnlockRequestEntity() {
        this.f10466a = new HashSet();
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Map mo7367a() {
        return f10465h;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final Object mo7371b(FastJsonResponse$Field fastJsonResponse$Field) {
        int i = fastJsonResponse$Field.f30319g;
        switch (i) {
            case 2:
                return Boolean.valueOf(this.f10467b);
            case 3:
                return this.f10468c;
            case 4:
                return Boolean.valueOf(this.f10469d);
            case 5:
                return this.f10470e;
            case 6:
                return Boolean.valueOf(this.f10471f);
            case 7:
                return this.f10472g;
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
        if (!(obj instanceof ToggleEasyUnlockRequestEntity)) {
            return false;
        }
        if (this != obj) {
            ToggleEasyUnlockRequestEntity toggleEasyUnlockRequestEntity = (ToggleEasyUnlockRequestEntity) obj;
            for (FastJsonResponse$Field fastJsonResponse$Field : f10465h.values()) {
                if (mo7370a(fastJsonResponse$Field)) {
                    if (!toggleEasyUnlockRequestEntity.mo7370a(fastJsonResponse$Field) || !mo7371b(fastJsonResponse$Field).equals(toggleEasyUnlockRequestEntity.mo7371b(fastJsonResponse$Field))) {
                        return false;
                    }
                } else if (toggleEasyUnlockRequestEntity.mo7370a(fastJsonResponse$Field)) {
                    return false;
                }
            }
        }
        return true;
    }

    public final int hashCode() {
        int i = 0;
        for (FastJsonResponse$Field fastJsonResponse$Field : f10465h.values()) {
            if (mo7370a(fastJsonResponse$Field)) {
                i = i + fastJsonResponse$Field.f30319g + mo7371b(fastJsonResponse$Field).hashCode();
            }
        }
        return i;
    }

    public ToggleEasyUnlockRequestEntity(Set set, boolean z, DeviceClassifierEntity deviceClassifierEntity, boolean z2, String str, boolean z3, String str2) {
        this.f10466a = set;
        this.f10467b = z;
        this.f10468c = deviceClassifierEntity;
        this.f10469d = z2;
        this.f10470e = str;
        this.f10471f = z3;
        this.f10472g = str2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo7376a(FastJsonResponse$Field fastJsonResponse$Field, String str, String str2) {
        int i = fastJsonResponse$Field.f30319g;
        if (i == 5) {
            this.f10470e = str2;
        } else if (i == 7) {
            this.f10472g = str2;
        } else {
            StringBuilder sb = new StringBuilder(54);
            sb.append("Field with id=");
            sb.append(i);
            sb.append(" is not known to be a String.");
            throw new IllegalArgumentException(sb.toString());
        }
        this.f10466a.add(Integer.valueOf(i));
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
        Set set = this.f10466a;
        if (set.contains(2)) {
            see.m35051a(parcel, 2, this.f10467b);
        }
        if (set.contains(3)) {
            see.m35040a(parcel, 3, this.f10468c, i, true);
        }
        if (set.contains(4)) {
            see.m35051a(parcel, 4, this.f10469d);
        }
        if (set.contains(5)) {
            see.m35046a(parcel, 5, this.f10470e, true);
        }
        if (set.contains(6)) {
            see.m35051a(parcel, 6, this.f10471f);
        }
        if (set.contains(7)) {
            see.m35046a(parcel, 7, this.f10472g, true);
        }
        see.m35062b(parcel, a);
    }

    /* renamed from: a */
    public final void mo7369a(FastJsonResponse$Field fastJsonResponse$Field, String str, sio sio) {
        int i = fastJsonResponse$Field.f30319g;
        if (i == 3) {
            this.f10468c = (DeviceClassifierEntity) sio;
            this.f10466a.add(Integer.valueOf(i));
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
        if (i == 2) {
            this.f10467b = z;
        } else if (i == 4) {
            this.f10469d = z;
        } else if (i == 6) {
            this.f10471f = z;
        } else {
            StringBuilder sb = new StringBuilder(55);
            sb.append("Field with id=");
            sb.append(i);
            sb.append(" is not known to be a boolean.");
            throw new IllegalArgumentException(sb.toString());
        }
        this.f10466a.add(Integer.valueOf(i));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo7370a(FastJsonResponse$Field fastJsonResponse$Field) {
        return this.f10466a.contains(Integer.valueOf(fastJsonResponse$Field.f30319g));
    }
}
