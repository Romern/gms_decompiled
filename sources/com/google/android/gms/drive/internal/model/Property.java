package com.google.android.gms.drive.internal.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.server.response.FastJsonResponse$Field;
import com.google.android.gms.common.server.response.FastSafeParcelableJsonResponse;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class Property extends FastSafeParcelableJsonResponse {
    public static final Parcelable.Creator CREATOR = new uvq();

    /* renamed from: f */
    private static final HashMap f31047f;

    /* renamed from: a */
    public final Set f31048a;

    /* renamed from: b */
    public String f31049b;

    /* renamed from: c */
    public String f31050c;

    /* renamed from: d */
    public String f31051d;

    /* renamed from: e */
    public String f31052e;

    static {
        HashMap hashMap = new HashMap();
        f31047f = hashMap;
        hashMap.put("appId", FastJsonResponse$Field.m22666f("appId", 2));
        f31047f.put("key", FastJsonResponse$Field.m22666f("key", 4));
        f31047f.put("value", FastJsonResponse$Field.m22666f("value", 7));
        f31047f.put("visibility", FastJsonResponse$Field.m22666f("visibility", 8));
    }

    public Property() {
        this.f31048a = new HashSet();
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Map mo7367a() {
        return f31047f;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final Object mo7371b(FastJsonResponse$Field fastJsonResponse$Field) {
        int i = fastJsonResponse$Field.f30319g;
        if (i == 2) {
            return this.f31049b;
        }
        if (i == 4) {
            return this.f31050c;
        }
        if (i == 7) {
            return this.f31051d;
        }
        if (i == 8) {
            return this.f31052e;
        }
        StringBuilder sb = new StringBuilder(38);
        sb.append("Unknown safe parcelable id=");
        sb.append(i);
        throw new IllegalStateException(sb.toString());
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Property)) {
            return false;
        }
        if (this != obj) {
            Property property = (Property) obj;
            for (FastJsonResponse$Field fastJsonResponse$Field : f31047f.values()) {
                if (mo7370a(fastJsonResponse$Field)) {
                    if (!property.mo7370a(fastJsonResponse$Field) || !mo7371b(fastJsonResponse$Field).equals(property.mo7371b(fastJsonResponse$Field))) {
                        return false;
                    }
                } else if (property.mo7370a(fastJsonResponse$Field)) {
                    return false;
                }
            }
        }
        return true;
    }

    public final int hashCode() {
        int i = 0;
        for (FastJsonResponse$Field fastJsonResponse$Field : f31047f.values()) {
            if (mo7370a(fastJsonResponse$Field)) {
                i = i + fastJsonResponse$Field.f30319g + mo7371b(fastJsonResponse$Field).hashCode();
            }
        }
        return i;
    }

    public Property(Set set, String str, String str2, String str3, String str4) {
        this.f31048a = set;
        this.f31049b = str;
        this.f31050c = str2;
        this.f31051d = str3;
        this.f31052e = str4;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo7376a(FastJsonResponse$Field fastJsonResponse$Field, String str, String str2) {
        int i = fastJsonResponse$Field.f30319g;
        if (i == 2) {
            this.f31049b = str2;
        } else if (i == 4) {
            this.f31050c = str2;
        } else if (i == 7) {
            this.f31051d = str2;
        } else if (i == 8) {
            this.f31052e = str2;
        } else {
            StringBuilder sb = new StringBuilder(54);
            sb.append("Field with id=");
            sb.append(i);
            sb.append(" is not known to be a String.");
            throw new IllegalArgumentException(sb.toString());
        }
        this.f31048a.add(Integer.valueOf(i));
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
        Set set = this.f31048a;
        if (set.contains(2)) {
            see.m35046a(parcel, 2, this.f31049b, true);
        }
        if (set.contains(4)) {
            see.m35046a(parcel, 4, this.f31050c, true);
        }
        if (set.contains(7)) {
            see.m35046a(parcel, 7, this.f31051d, true);
        }
        if (set.contains(8)) {
            see.m35046a(parcel, 8, this.f31052e, true);
        }
        see.m35062b(parcel, a);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo7370a(FastJsonResponse$Field fastJsonResponse$Field) {
        return this.f31048a.contains(Integer.valueOf(fastJsonResponse$Field.f30319g));
    }
}
