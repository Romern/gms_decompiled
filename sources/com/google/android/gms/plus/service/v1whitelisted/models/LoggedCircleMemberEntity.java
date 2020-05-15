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
public final class LoggedCircleMemberEntity extends FastSafeParcelableJsonResponse implements rty {
    public static final Parcelable.Creator CREATOR = new aohg();

    /* renamed from: f */
    private static final HashMap f82953f;

    /* renamed from: a */
    final Set f82954a;

    /* renamed from: b */
    final int f82955b;

    /* renamed from: c */
    String f82956c;

    /* renamed from: d */
    String f82957d;

    /* renamed from: e */
    String f82958e;

    static {
        HashMap hashMap = new HashMap();
        f82953f = hashMap;
        hashMap.put("emailId", FastJsonResponse$Field.m22666f("emailId", 3));
        f82953f.put("focusContactId", FastJsonResponse$Field.m22666f("focusContactId", 4));
        f82953f.put("gaiaId", FastJsonResponse$Field.m22666f("gaiaId", 5));
    }

    public LoggedCircleMemberEntity() {
        this.f82955b = 1;
        this.f82954a = new HashSet();
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Map mo7367a() {
        return f82953f;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final Object mo7371b(FastJsonResponse$Field fastJsonResponse$Field) {
        int i = fastJsonResponse$Field.f30319g;
        if (i == 3) {
            return this.f82956c;
        }
        if (i == 4) {
            return this.f82957d;
        }
        if (i == 5) {
            return this.f82958e;
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
        if (!(obj instanceof LoggedCircleMemberEntity)) {
            return false;
        }
        if (this != obj) {
            LoggedCircleMemberEntity loggedCircleMemberEntity = (LoggedCircleMemberEntity) obj;
            for (FastJsonResponse$Field fastJsonResponse$Field : f82953f.values()) {
                if (mo7370a(fastJsonResponse$Field)) {
                    if (!loggedCircleMemberEntity.mo7370a(fastJsonResponse$Field) || !mo7371b(fastJsonResponse$Field).equals(loggedCircleMemberEntity.mo7371b(fastJsonResponse$Field))) {
                        return false;
                    }
                } else if (loggedCircleMemberEntity.mo7370a(fastJsonResponse$Field)) {
                    return false;
                }
            }
        }
        return true;
    }

    public final int hashCode() {
        int i = 0;
        for (FastJsonResponse$Field fastJsonResponse$Field : f82953f.values()) {
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
        if (i == 3) {
            this.f82956c = str2;
        } else if (i == 4) {
            this.f82957d = str2;
        } else if (i == 5) {
            this.f82958e = str2;
        } else {
            StringBuilder sb = new StringBuilder(54);
            sb.append("Field with id=");
            sb.append(i);
            sb.append(" is not known to be a String.");
            throw new IllegalArgumentException(sb.toString());
        }
        this.f82954a.add(Integer.valueOf(i));
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
        Set set = this.f82954a;
        if (set.contains(1)) {
            see.m35063b(parcel, 1, this.f82955b);
        }
        if (set.contains(3)) {
            see.m35046a(parcel, 3, this.f82956c, true);
        }
        if (set.contains(4)) {
            see.m35046a(parcel, 4, this.f82957d, true);
        }
        if (set.contains(5)) {
            see.m35046a(parcel, 5, this.f82958e, true);
        }
        see.m35062b(parcel, a);
    }

    public LoggedCircleMemberEntity(Set set, int i, String str, String str2, String str3) {
        this.f82954a = set;
        this.f82955b = i;
        this.f82956c = str;
        this.f82957d = str2;
        this.f82958e = str3;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo7370a(FastJsonResponse$Field fastJsonResponse$Field) {
        return this.f82954a.contains(Integer.valueOf(fastJsonResponse$Field.f30319g));
    }
}
