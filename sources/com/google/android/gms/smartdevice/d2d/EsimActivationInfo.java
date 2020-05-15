package com.google.android.gms.smartdevice.d2d;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.server.response.FastJsonResponse$Field;
import com.google.android.gms.smartdevice.utils.BinarySerializableFastSafeParcelableJson;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class EsimActivationInfo extends BinarySerializableFastSafeParcelableJson {
    public static final Parcelable.Creator CREATOR = new aqzr();

    /* renamed from: f */
    private static final HashMap f107885f;

    /* renamed from: a */
    final Set f107886a;

    /* renamed from: b */
    public String f107887b;

    /* renamed from: c */
    public String f107888c;

    /* renamed from: d */
    public String f107889d;

    /* renamed from: e */
    public String f107890e;

    static {
        HashMap hashMap = new HashMap();
        f107885f = hashMap;
        hashMap.put("eid", FastJsonResponse$Field.m22666f("eid", 2));
        f107885f.put("imei", FastJsonResponse$Field.m22666f("imei", 3));
        f107885f.put("carrierName", FastJsonResponse$Field.m22666f("carrierName", 4));
        f107885f.put("carrierId", FastJsonResponse$Field.m22666f("carrierId", 5));
    }

    public EsimActivationInfo() {
        this.f107886a = new HashSet();
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Map mo7367a() {
        return f107885f;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final Object mo7371b(FastJsonResponse$Field fastJsonResponse$Field) {
        int i = fastJsonResponse$Field.f30319g;
        if (i == 2) {
            return this.f107887b;
        }
        if (i == 3) {
            return this.f107888c;
        }
        if (i == 4) {
            return this.f107889d;
        }
        if (i == 5) {
            return this.f107890e;
        }
        StringBuilder sb = new StringBuilder(37);
        sb.append("Unknown SafeParcelable id=");
        sb.append(i);
        throw new IllegalStateException(sb.toString());
    }

    public EsimActivationInfo(Set set, String str, String str2, String str3, String str4) {
        this.f107886a = set;
        this.f107887b = str;
        this.f107888c = str2;
        this.f107889d = str3;
        this.f107890e = str4;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo7376a(FastJsonResponse$Field fastJsonResponse$Field, String str, String str2) {
        int i = fastJsonResponse$Field.f30319g;
        if (i == 2) {
            this.f107887b = str2;
        } else if (i == 3) {
            this.f107888c = str2;
        } else if (i == 4) {
            this.f107889d = str2;
        } else if (i == 5) {
            this.f107890e = str2;
        } else {
            throw new IllegalArgumentException(String.format("Field with id=%d is not known to be a string.", Integer.valueOf(i)));
        }
        this.f107886a.add(Integer.valueOf(i));
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
        Set set = this.f107886a;
        if (set.contains(2)) {
            see.m35046a(parcel, 2, this.f107887b, true);
        }
        if (set.contains(3)) {
            see.m35046a(parcel, 3, this.f107888c, true);
        }
        if (set.contains(4)) {
            see.m35046a(parcel, 4, this.f107889d, true);
        }
        if (set.contains(5)) {
            see.m35046a(parcel, 5, this.f107890e, true);
        }
        see.m35062b(parcel, a);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo7370a(FastJsonResponse$Field fastJsonResponse$Field) {
        return this.f107886a.contains(Integer.valueOf(fastJsonResponse$Field.f30319g));
    }
}
