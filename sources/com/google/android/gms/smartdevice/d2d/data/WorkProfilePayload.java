package com.google.android.gms.smartdevice.d2d.data;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.server.response.FastJsonResponse$Field;
import com.google.android.gms.smartdevice.utils.BinarySerializableFastSafeParcelableJson;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class WorkProfilePayload extends BinarySerializableFastSafeParcelableJson {
    public static final Parcelable.Creator CREATOR = new arhm();

    /* renamed from: f */
    private static final Map f107994f;

    /* renamed from: a */
    final Set f107995a;

    /* renamed from: b */
    public String f107996b;

    /* renamed from: c */
    public int f107997c;

    /* renamed from: d */
    public AccountBootstrapPayload f107998d;

    /* renamed from: e */
    public String f107999e;

    static {
        bnha h = bnhe.m109414h();
        h.mo67695b("accountName", FastJsonResponse$Field.m22666f("accountName", 2));
        h.mo67695b("managementMode", FastJsonResponse$Field.m22651a("managementMode", 3));
        h.mo67695b("accountPayload", FastJsonResponse$Field.m22653a("accountPayload", 4, AccountBootstrapPayload.class));
        h.mo67695b("sourceId", FastJsonResponse$Field.m22666f("sourceId", 5));
        f107994f = h.mo67618b();
    }

    public WorkProfilePayload() {
        this.f107995a = new HashSet();
    }

    /* renamed from: a */
    public final Map mo7367a() {
        return f107994f;
    }

    /* renamed from: b */
    public final int mo59107b() {
        return bouo.m111561a(this.f107997c);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo7391a(FastJsonResponse$Field fastJsonResponse$Field, String str, int i) {
        int i2 = fastJsonResponse$Field.f30319g;
        if (i2 == 3) {
            this.f107997c = i;
            this.f107995a.add(Integer.valueOf(i2));
            return;
        }
        throw new IllegalStateException();
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final Object mo7371b(FastJsonResponse$Field fastJsonResponse$Field) {
        int i = fastJsonResponse$Field.f30319g;
        if (i == 2) {
            return this.f107996b;
        }
        if (i == 3) {
            return Integer.valueOf(this.f107997c);
        }
        if (i == 4) {
            return this.f107998d;
        }
        if (i == 5) {
            return this.f107999e;
        }
        throw new IllegalStateException();
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
        Set set = this.f107995a;
        if (set.contains(2)) {
            see.m35046a(parcel, 2, this.f107996b, true);
        }
        if (set.contains(3)) {
            see.m35063b(parcel, 3, this.f107997c);
        }
        if (set.contains(4)) {
            see.m35040a(parcel, 4, this.f107998d, i, true);
        }
        if (set.contains(5)) {
            see.m35046a(parcel, 5, this.f107999e, true);
        }
        see.m35062b(parcel, a);
    }

    public WorkProfilePayload(String str, int i, String str2) {
        HashSet hashSet = new HashSet();
        this.f107995a = hashSet;
        this.f107996b = str;
        hashSet.add(2);
        this.f107997c = i;
        this.f107995a.add(3);
        this.f107999e = str2;
        this.f107995a.add(5);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo7376a(FastJsonResponse$Field fastJsonResponse$Field, String str, String str2) {
        int i = fastJsonResponse$Field.f30319g;
        if (i == 2) {
            this.f107996b = str2;
        } else if (i == 5) {
            this.f107999e = str2;
        } else {
            throw new IllegalStateException();
        }
        this.f107995a.add(Integer.valueOf(i));
    }

    /* renamed from: a */
    public final void mo7369a(FastJsonResponse$Field fastJsonResponse$Field, String str, sio sio) {
        if (fastJsonResponse$Field.f30319g == 4) {
            this.f107998d = (AccountBootstrapPayload) sio;
            return;
        }
        throw new IllegalStateException();
    }

    public WorkProfilePayload(Set set, String str, int i, AccountBootstrapPayload accountBootstrapPayload, String str2) {
        this.f107995a = set;
        this.f107996b = str;
        this.f107997c = i;
        this.f107998d = accountBootstrapPayload;
        this.f107999e = str2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo7370a(FastJsonResponse$Field fastJsonResponse$Field) {
        return this.f107995a.contains(Integer.valueOf(fastJsonResponse$Field.f30319g));
    }
}
