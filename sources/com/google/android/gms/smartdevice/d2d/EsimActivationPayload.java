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
public class EsimActivationPayload extends BinarySerializableFastSafeParcelableJson {
    public static final Parcelable.Creator CREATOR = new aqzs();

    /* renamed from: g */
    private static final HashMap f107891g;

    /* renamed from: a */
    final Set f107892a;

    /* renamed from: b */
    public int f107893b;

    /* renamed from: c */
    public String f107894c;

    /* renamed from: d */
    public String f107895d;

    /* renamed from: e */
    public String f107896e;

    /* renamed from: f */
    public boolean f107897f;

    static {
        HashMap hashMap = new HashMap();
        f107891g = hashMap;
        hashMap.put("resultCode", FastJsonResponse$Field.m22651a("resultCode", 2));
        f107891g.put("activationCode", FastJsonResponse$Field.m22666f("activationCode", 3));
        f107891g.put("phoneNumber", FastJsonResponse$Field.m22666f("phoneNumber", 4));
        f107891g.put("carrierName", FastJsonResponse$Field.m22666f("carrierName", 5));
        f107891g.put("isEmbedded", FastJsonResponse$Field.m22664e("isEmbedded", 6));
    }

    public EsimActivationPayload() {
        this.f107892a = new HashSet();
        this.f107893b = 1;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Map mo7367a() {
        return f107891g;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final Object mo7371b(FastJsonResponse$Field fastJsonResponse$Field) {
        int i = fastJsonResponse$Field.f30319g;
        if (i == 2) {
            return Integer.valueOf(this.f107893b);
        }
        if (i == 3) {
            return this.f107894c;
        }
        if (i == 4) {
            return this.f107895d;
        }
        if (i == 5) {
            return this.f107896e;
        }
        if (i == 6) {
            return Boolean.valueOf(this.f107897f);
        }
        StringBuilder sb = new StringBuilder(37);
        sb.append("Unknown SafeParcelable id=");
        sb.append(i);
        throw new IllegalStateException(sb.toString());
    }

    public EsimActivationPayload(String str, String str2, String str3, boolean z) {
        this();
        this.f107893b = 0;
        this.f107892a.add(2);
        this.f107894c = str;
        this.f107892a.add(3);
        this.f107895d = str2;
        this.f107892a.add(4);
        this.f107896e = str3;
        this.f107892a.add(5);
        this.f107897f = z;
        this.f107892a.add(6);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo7391a(FastJsonResponse$Field fastJsonResponse$Field, String str, int i) {
        int i2 = fastJsonResponse$Field.f30319g;
        if (i2 == 2) {
            this.f107893b = i;
            this.f107892a.add(Integer.valueOf(i2));
            return;
        }
        throw new IllegalArgumentException(String.format("Field with id=%d is not known to be an integer.", Integer.valueOf(i2)));
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
        Set set = this.f107892a;
        if (set.contains(2)) {
            see.m35063b(parcel, 2, this.f107893b);
        }
        if (set.contains(3)) {
            see.m35046a(parcel, 3, this.f107894c, true);
        }
        if (set.contains(4)) {
            see.m35046a(parcel, 4, this.f107895d, true);
        }
        if (set.contains(5)) {
            see.m35046a(parcel, 5, this.f107896e, true);
        }
        if (set.contains(6)) {
            see.m35051a(parcel, 6, this.f107897f);
        }
        see.m35062b(parcel, a);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo7376a(FastJsonResponse$Field fastJsonResponse$Field, String str, String str2) {
        int i = fastJsonResponse$Field.f30319g;
        if (i == 3) {
            this.f107894c = str2;
        } else if (i == 4) {
            this.f107895d = str2;
        } else if (i == 5) {
            this.f107896e = str2;
        } else {
            throw new IllegalArgumentException(String.format("Field with id=%d is not known to be a string.", Integer.valueOf(i)));
        }
        this.f107892a.add(Integer.valueOf(i));
    }

    public EsimActivationPayload(Set set, int i, String str, String str2, String str3, boolean z) {
        this.f107892a = set;
        this.f107893b = i;
        this.f107894c = str;
        this.f107895d = str2;
        this.f107896e = str3;
        this.f107897f = z;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo7395a(FastJsonResponse$Field fastJsonResponse$Field, String str, boolean z) {
        int i = fastJsonResponse$Field.f30319g;
        if (i == 6) {
            this.f107897f = z;
            this.f107892a.add(Integer.valueOf(i));
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
        return this.f107892a.contains(Integer.valueOf(fastJsonResponse$Field.f30319g));
    }
}
