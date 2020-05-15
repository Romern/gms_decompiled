package com.google.android.gms.common.lso;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.server.response.FastJsonResponse$Field;
import com.google.android.gms.common.server.response.FastSafeParcelableJsonResponse;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class RevokeToken extends FastSafeParcelableJsonResponse {
    public static final Parcelable.Creator CREATOR = new ser();

    /* renamed from: c */
    private static final HashMap f30281c;

    /* renamed from: a */
    final Set f30282a;

    /* renamed from: b */
    String f30283b;

    static {
        HashMap hashMap = new HashMap();
        f30281c = hashMap;
        hashMap.put("version_info", FastJsonResponse$Field.m22666f("version_info", 2));
    }

    public RevokeToken() {
        this.f30282a = new HashSet();
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Map mo7367a() {
        return f30281c;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final Object mo7371b(FastJsonResponse$Field fastJsonResponse$Field) {
        int i = fastJsonResponse$Field.f30319g;
        if (i == 2) {
            return this.f30283b;
        }
        StringBuilder sb = new StringBuilder(38);
        sb.append("Unknown safe parcelable id=");
        sb.append(i);
        throw new IllegalStateException(sb.toString());
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof RevokeToken)) {
            return false;
        }
        if (this != obj) {
            RevokeToken revokeToken = (RevokeToken) obj;
            for (FastJsonResponse$Field fastJsonResponse$Field : f30281c.values()) {
                if (mo7370a(fastJsonResponse$Field)) {
                    if (!revokeToken.mo7370a(fastJsonResponse$Field) || !mo7371b(fastJsonResponse$Field).equals(revokeToken.mo7371b(fastJsonResponse$Field))) {
                        return false;
                    }
                } else if (revokeToken.mo7370a(fastJsonResponse$Field)) {
                    return false;
                }
            }
        }
        return true;
    }

    public final int hashCode() {
        int i = 0;
        for (FastJsonResponse$Field fastJsonResponse$Field : f30281c.values()) {
            if (mo7370a(fastJsonResponse$Field)) {
                i = i + fastJsonResponse$Field.f30319g + mo7371b(fastJsonResponse$Field).hashCode();
            }
        }
        return i;
    }

    public RevokeToken(Set set, String str) {
        this.f30282a = set;
        this.f30283b = str;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo7376a(FastJsonResponse$Field fastJsonResponse$Field, String str, String str2) {
        int i = fastJsonResponse$Field.f30319g;
        if (i == 2) {
            this.f30283b = str2;
            this.f30282a.add(Integer.valueOf(i));
            return;
        }
        StringBuilder sb = new StringBuilder(54);
        sb.append("Field with id=");
        sb.append(i);
        sb.append(" is not known to be a String.");
        throw new IllegalArgumentException(sb.toString());
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
        if (this.f30282a.contains(2)) {
            see.m35046a(parcel, 2, this.f30283b, true);
        }
        see.m35062b(parcel, a);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo7370a(FastJsonResponse$Field fastJsonResponse$Field) {
        return this.f30282a.contains(Integer.valueOf(fastJsonResponse$Field.f30319g));
    }
}
