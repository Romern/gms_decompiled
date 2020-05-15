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
public final class PlusAppClient extends FastSafeParcelableJsonResponse {
    public static final Parcelable.Creator CREATOR = new aoid();

    /* renamed from: f */
    private static final HashMap f83046f;

    /* renamed from: a */
    final Set f83047a;

    /* renamed from: b */
    final int f83048b;

    /* renamed from: c */
    public String f83049c;

    /* renamed from: d */
    public String f83050d;

    /* renamed from: e */
    public String f83051e;

    static {
        HashMap hashMap = new HashMap();
        f83046f = hashMap;
        hashMap.put("androidCertificateHash", FastJsonResponse$Field.m22666f("androidCertificateHash", 2));
        f83046f.put("androidPackageName", FastJsonResponse$Field.m22666f("androidPackageName", 3));
        f83046f.put("type", FastJsonResponse$Field.m22666f("type", 6));
    }

    public PlusAppClient() {
        this.f83048b = 1;
        this.f83047a = new HashSet();
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Map mo7367a() {
        return f83046f;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final Object mo7371b(FastJsonResponse$Field fastJsonResponse$Field) {
        int i = fastJsonResponse$Field.f30319g;
        if (i == 2) {
            return this.f83049c;
        }
        if (i == 3) {
            return this.f83050d;
        }
        if (i == 6) {
            return this.f83051e;
        }
        StringBuilder sb = new StringBuilder(38);
        sb.append("Unknown safe parcelable id=");
        sb.append(i);
        throw new IllegalStateException(sb.toString());
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof PlusAppClient)) {
            return false;
        }
        if (this != obj) {
            PlusAppClient plusAppClient = (PlusAppClient) obj;
            for (FastJsonResponse$Field fastJsonResponse$Field : f83046f.values()) {
                if (mo7370a(fastJsonResponse$Field)) {
                    if (!plusAppClient.mo7370a(fastJsonResponse$Field) || !mo7371b(fastJsonResponse$Field).equals(plusAppClient.mo7371b(fastJsonResponse$Field))) {
                        return false;
                    }
                } else if (plusAppClient.mo7370a(fastJsonResponse$Field)) {
                    return false;
                }
            }
        }
        return true;
    }

    public final int hashCode() {
        int i = 0;
        for (FastJsonResponse$Field fastJsonResponse$Field : f83046f.values()) {
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
            this.f83049c = str2;
        } else if (i == 3) {
            this.f83050d = str2;
        } else if (i == 6) {
            this.f83051e = str2;
        } else {
            StringBuilder sb = new StringBuilder(54);
            sb.append("Field with id=");
            sb.append(i);
            sb.append(" is not known to be a String.");
            throw new IllegalArgumentException(sb.toString());
        }
        this.f83047a.add(Integer.valueOf(i));
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
        Set set = this.f83047a;
        if (set.contains(1)) {
            see.m35063b(parcel, 1, this.f83048b);
        }
        if (set.contains(2)) {
            see.m35046a(parcel, 2, this.f83049c, true);
        }
        if (set.contains(3)) {
            see.m35046a(parcel, 3, this.f83050d, true);
        }
        if (set.contains(6)) {
            see.m35046a(parcel, 6, this.f83051e, true);
        }
        see.m35062b(parcel, a);
    }

    public PlusAppClient(Set set, int i, String str, String str2, String str3) {
        this.f83047a = set;
        this.f83048b = i;
        this.f83049c = str;
        this.f83050d = str2;
        this.f83051e = str3;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo7370a(FastJsonResponse$Field fastJsonResponse$Field) {
        return this.f83047a.contains(Integer.valueOf(fastJsonResponse$Field.f30319g));
    }
}
