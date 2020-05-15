package com.google.android.gms.auth.account.gencode.server.api;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.server.response.FastJsonResponse$Field;
import com.google.android.gms.common.server.response.FastSafeParcelableJsonResponse;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class RevokeDevice extends FastSafeParcelableJsonResponse {
    public static final Parcelable.Creator CREATOR = new grd();

    /* renamed from: d */
    private static final HashMap f10010d;

    /* renamed from: a */
    public final Set f10011a;

    /* renamed from: b */
    final int f10012b;

    /* renamed from: c */
    String f10013c;

    static {
        HashMap hashMap = new HashMap();
        f10010d = hashMap;
        hashMap.put("version_info", FastJsonResponse$Field.m22666f("version_info", 2));
    }

    public RevokeDevice() {
        this.f10012b = 1;
        this.f10011a = new HashSet();
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Map mo7367a() {
        return f10010d;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final Object mo7371b(FastJsonResponse$Field fastJsonResponse$Field) {
        int i = fastJsonResponse$Field.f30319g;
        if (i == 2) {
            return this.f10013c;
        }
        StringBuilder sb = new StringBuilder(38);
        sb.append("Unknown safe parcelable id=");
        sb.append(i);
        throw new IllegalStateException(sb.toString());
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof RevokeDevice)) {
            return false;
        }
        if (this != obj) {
            RevokeDevice revokeDevice = (RevokeDevice) obj;
            for (FastJsonResponse$Field fastJsonResponse$Field : f10010d.values()) {
                if (mo7370a(fastJsonResponse$Field)) {
                    if (!revokeDevice.mo7370a(fastJsonResponse$Field) || !mo7371b(fastJsonResponse$Field).equals(revokeDevice.mo7371b(fastJsonResponse$Field))) {
                        return false;
                    }
                } else if (revokeDevice.mo7370a(fastJsonResponse$Field)) {
                    return false;
                }
            }
        }
        return true;
    }

    public final int hashCode() {
        int i = 0;
        for (FastJsonResponse$Field fastJsonResponse$Field : f10010d.values()) {
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
            this.f10013c = str2;
            this.f10011a.add(Integer.valueOf(i));
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
        Set set = this.f10011a;
        if (set.contains(1)) {
            see.m35063b(parcel, 1, this.f10012b);
        }
        if (set.contains(2)) {
            see.m35046a(parcel, 2, this.f10013c, true);
        }
        see.m35062b(parcel, a);
    }

    public RevokeDevice(Set set, int i, String str) {
        this.f10011a = set;
        this.f10012b = i;
        this.f10013c = str;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo7370a(FastJsonResponse$Field fastJsonResponse$Field) {
        return this.f10011a.contains(Integer.valueOf(fastJsonResponse$Field.f30319g));
    }
}
