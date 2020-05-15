package com.google.android.gms.plus.service.pos;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.server.response.FastJsonResponse$Field;
import com.google.android.gms.common.server.response.FastSafeParcelableJsonResponse;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class GetsignupstateEntity extends FastSafeParcelableJsonResponse implements rty {
    public static final Parcelable.Creator CREATOR = new aocp();

    /* renamed from: g */
    private static final HashMap f82611g;

    /* renamed from: a */
    public final Set f82612a;

    /* renamed from: b */
    public final int f82613b;

    /* renamed from: c */
    public String f82614c;

    /* renamed from: d */
    public String f82615d;

    /* renamed from: e */
    public String f82616e;

    /* renamed from: f */
    public boolean f82617f;

    static {
        HashMap hashMap = new HashMap();
        f82611g = hashMap;
        hashMap.put("display_name", FastJsonResponse$Field.m22666f("display_name", 2));
        f82611g.put("email", FastJsonResponse$Field.m22666f("email", 3));
        f82611g.put("profile_image_url", FastJsonResponse$Field.m22666f("profile_image_url", 5));
        f82611g.put("signedUp", FastJsonResponse$Field.m22664e("signedUp", 6));
    }

    public GetsignupstateEntity() {
        this.f82613b = 1;
        this.f82612a = new HashSet();
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Map mo7367a() {
        return f82611g;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final Object mo7371b(FastJsonResponse$Field fastJsonResponse$Field) {
        int i = fastJsonResponse$Field.f30319g;
        if (i == 2) {
            return this.f82614c;
        }
        if (i == 3) {
            return this.f82615d;
        }
        if (i == 5) {
            return this.f82616e;
        }
        if (i == 6) {
            return Boolean.valueOf(this.f82617f);
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
        if (!(obj instanceof GetsignupstateEntity)) {
            return false;
        }
        if (this != obj) {
            GetsignupstateEntity getsignupstateEntity = (GetsignupstateEntity) obj;
            for (FastJsonResponse$Field fastJsonResponse$Field : f82611g.values()) {
                if (mo7370a(fastJsonResponse$Field)) {
                    if (!getsignupstateEntity.mo7370a(fastJsonResponse$Field) || !mo7371b(fastJsonResponse$Field).equals(getsignupstateEntity.mo7371b(fastJsonResponse$Field))) {
                        return false;
                    }
                } else if (getsignupstateEntity.mo7370a(fastJsonResponse$Field)) {
                    return false;
                }
            }
        }
        return true;
    }

    public final int hashCode() {
        int i = 0;
        for (FastJsonResponse$Field fastJsonResponse$Field : f82611g.values()) {
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
            this.f82614c = str2;
        } else if (i == 3) {
            this.f82615d = str2;
        } else if (i == 5) {
            this.f82616e = str2;
        } else {
            StringBuilder sb = new StringBuilder(54);
            sb.append("Field with id=");
            sb.append(i);
            sb.append(" is not known to be a String.");
            throw new IllegalArgumentException(sb.toString());
        }
        this.f82612a.add(Integer.valueOf(i));
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
        Set set = this.f82612a;
        if (set.contains(1)) {
            see.m35063b(parcel, 1, this.f82613b);
        }
        if (set.contains(2)) {
            see.m35046a(parcel, 2, this.f82614c, true);
        }
        if (set.contains(3)) {
            see.m35046a(parcel, 3, this.f82615d, true);
        }
        if (set.contains(5)) {
            see.m35046a(parcel, 5, this.f82616e, true);
        }
        if (set.contains(6)) {
            see.m35051a(parcel, 6, this.f82617f);
        }
        see.m35062b(parcel, a);
    }

    public GetsignupstateEntity(Set set, int i, String str, String str2, String str3, boolean z) {
        this.f82612a = set;
        this.f82613b = i;
        this.f82614c = str;
        this.f82615d = str2;
        this.f82616e = str3;
        this.f82617f = z;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo7395a(FastJsonResponse$Field fastJsonResponse$Field, String str, boolean z) {
        int i = fastJsonResponse$Field.f30319g;
        if (i == 6) {
            this.f82617f = z;
            this.f82612a.add(Integer.valueOf(i));
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
        return this.f82612a.contains(Integer.valueOf(fastJsonResponse$Field.f30319g));
    }
}
