package com.google.android.gms.auth.proximity.gencode.server.api;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.server.response.FastJsonResponse$Field;
import com.google.android.gms.common.server.response.FastSafeParcelableJsonResponse;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ExternalDeviceInfoEntity extends FastSafeParcelableJsonResponse implements jrn {
    public static final Parcelable.Creator CREATOR = new jro();

    /* renamed from: p */
    private static final HashMap f11215p;

    /* renamed from: a */
    final Set f11216a;

    /* renamed from: b */
    boolean f11217b;

    /* renamed from: c */
    List f11218c;

    /* renamed from: d */
    String f11219d;

    /* renamed from: e */
    String f11220e;

    /* renamed from: f */
    List f11221f;

    /* renamed from: g */
    String f11222g;

    /* renamed from: h */
    long f11223h;

    /* renamed from: i */
    boolean f11224i;

    /* renamed from: j */
    String f11225j;

    /* renamed from: k */
    boolean f11226k;

    /* renamed from: l */
    String f11227l;

    /* renamed from: m */
    List f11228m;

    /* renamed from: n */
    boolean f11229n;

    /* renamed from: o */
    boolean f11230o;

    static {
        HashMap hashMap = new HashMap();
        f11215p = hashMap;
        hashMap.put("arcPlusPlus", FastJsonResponse$Field.m22664e("arcPlusPlus", 2));
        f11215p.put("beaconSeeds", FastJsonResponse$Field.m22657b("beaconSeeds", 3, BeaconSeedEntity.class));
        f11215p.put("bluetoothAddress", FastJsonResponse$Field.m22666f("bluetoothAddress", 4));
        f11215p.put("deviceType", FastJsonResponse$Field.m22666f("deviceType", 5));
        f11215p.put("enabledSoftwareFeatures", FastJsonResponse$Field.m22668g("enabledSoftwareFeatures", 6));
        f11215p.put("friendlyDeviceName", FastJsonResponse$Field.m22666f("friendlyDeviceName", 7));
        f11215p.put("lastUpdateTimeMillis", FastJsonResponse$Field.m22656b("lastUpdateTimeMillis", 8));
        f11215p.put("mobileHotspotSupported", FastJsonResponse$Field.m22664e("mobileHotspotSupported", 9));
        f11215p.put("noPiiDeviceName", FastJsonResponse$Field.m22666f("noPiiDeviceName", 10));
        f11215p.put("pixelPhone", FastJsonResponse$Field.m22664e("pixelPhone", 11));
        f11215p.put("publicKey", FastJsonResponse$Field.m22666f("publicKey", 12));
        f11215p.put("supportedSoftwareFeatures", FastJsonResponse$Field.m22668g("supportedSoftwareFeatures", 13));
        f11215p.put("unlockKey", FastJsonResponse$Field.m22664e("unlockKey", 14));
        f11215p.put("unlockable", FastJsonResponse$Field.m22664e("unlockable", 15));
    }

    public ExternalDeviceInfoEntity() {
        this.f11216a = new HashSet();
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Map mo7367a() {
        return f11215p;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final Object mo7371b(FastJsonResponse$Field fastJsonResponse$Field) {
        int i = fastJsonResponse$Field.f30319g;
        switch (i) {
            case 2:
                return Boolean.valueOf(this.f11217b);
            case 3:
                return this.f11218c;
            case 4:
                return this.f11219d;
            case 5:
                return this.f11220e;
            case 6:
                return this.f11221f;
            case 7:
                return this.f11222g;
            case 8:
                return Long.valueOf(this.f11223h);
            case 9:
                return Boolean.valueOf(this.f11224i);
            case 10:
                return this.f11225j;
            case 11:
                return Boolean.valueOf(this.f11226k);
            case 12:
                return this.f11227l;
            case 13:
                return this.f11228m;
            case 14:
                return Boolean.valueOf(this.f11229n);
            case 15:
                return Boolean.valueOf(this.f11230o);
            default:
                StringBuilder sb = new StringBuilder(38);
                sb.append("Unknown safe parcelable id=");
                sb.append(i);
                throw new IllegalStateException(sb.toString());
        }
    }

    /* renamed from: b */
    public final boolean mo7830b() {
        return this.f11217b;
    }

    /* renamed from: bF */
    public final /* bridge */ /* synthetic */ Object mo7556bF() {
        return this;
    }

    /* renamed from: c */
    public final List mo7831c() {
        return this.f11218c;
    }

    /* renamed from: d */
    public final String mo7832d() {
        return this.f11219d;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ExternalDeviceInfoEntity)) {
            return false;
        }
        if (this != obj) {
            ExternalDeviceInfoEntity externalDeviceInfoEntity = (ExternalDeviceInfoEntity) obj;
            for (FastJsonResponse$Field fastJsonResponse$Field : f11215p.values()) {
                if (mo7370a(fastJsonResponse$Field)) {
                    if (!externalDeviceInfoEntity.mo7370a(fastJsonResponse$Field) || !mo7371b(fastJsonResponse$Field).equals(externalDeviceInfoEntity.mo7371b(fastJsonResponse$Field))) {
                        return false;
                    }
                } else if (externalDeviceInfoEntity.mo7370a(fastJsonResponse$Field)) {
                    return false;
                }
            }
        }
        return true;
    }

    /* renamed from: f */
    public final String mo7833f() {
        return this.f11220e;
    }

    /* renamed from: g */
    public final List mo7834g() {
        return this.f11221f;
    }

    /* renamed from: h */
    public final boolean mo7835h() {
        return this.f11216a.contains(6);
    }

    public final int hashCode() {
        int i = 0;
        for (FastJsonResponse$Field fastJsonResponse$Field : f11215p.values()) {
            if (mo7370a(fastJsonResponse$Field)) {
                i = i + fastJsonResponse$Field.f30319g + mo7371b(fastJsonResponse$Field).hashCode();
            }
        }
        return i;
    }

    /* renamed from: i */
    public final String mo7836i() {
        return this.f11222g;
    }

    /* renamed from: j */
    public final long mo7837j() {
        return this.f11223h;
    }

    /* renamed from: k */
    public final boolean mo7838k() {
        return this.f11224i;
    }

    /* renamed from: l */
    public final boolean mo7839l() {
        return this.f11226k;
    }

    /* renamed from: m */
    public final String mo7840m() {
        return this.f11227l;
    }

    /* renamed from: n */
    public final boolean mo7841n() {
        return this.f11216a.contains(12);
    }

    /* renamed from: o */
    public final List mo7842o() {
        return this.f11228m;
    }

    /* renamed from: p */
    public final boolean mo7843p() {
        return this.f11216a.contains(13);
    }

    /* renamed from: q */
    public final boolean mo7844q() {
        return this.f11229n;
    }

    /* renamed from: r */
    public final boolean mo7845r() {
        return this.f11230o;
    }

    public ExternalDeviceInfoEntity(Set set, boolean z, List list, String str, String str2, List list2, String str3, long j, boolean z2, String str4, boolean z3, String str5, List list3, boolean z4, boolean z5) {
        this.f11216a = set;
        this.f11217b = z;
        this.f11218c = list;
        this.f11219d = str;
        this.f11220e = str2;
        this.f11221f = list2;
        this.f11222g = str3;
        this.f11223h = j;
        this.f11224i = z2;
        this.f11225j = str4;
        this.f11226k = z3;
        this.f11227l = str5;
        this.f11228m = list3;
        this.f11229n = z4;
        this.f11230o = z5;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo7394a(FastJsonResponse$Field fastJsonResponse$Field, String str, long j) {
        int i = fastJsonResponse$Field.f30319g;
        if (i == 8) {
            this.f11223h = j;
            this.f11216a.add(Integer.valueOf(i));
            return;
        }
        StringBuilder sb = new StringBuilder(52);
        sb.append("Field with id=");
        sb.append(i);
        sb.append(" is not known to be a long.");
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
        Set set = this.f11216a;
        if (set.contains(2)) {
            see.m35051a(parcel, 2, this.f11217b);
        }
        if (set.contains(3)) {
            see.m35066c(parcel, 3, this.f11218c, true);
        }
        if (set.contains(4)) {
            see.m35046a(parcel, 4, this.f11219d, true);
        }
        if (set.contains(5)) {
            see.m35046a(parcel, 5, this.f11220e, true);
        }
        if (set.contains(6)) {
            see.m35065b(parcel, 6, this.f11221f, true);
        }
        if (set.contains(7)) {
            see.m35046a(parcel, 7, this.f11222g, true);
        }
        if (set.contains(8)) {
            see.m35036a(parcel, 8, this.f11223h);
        }
        if (set.contains(9)) {
            see.m35051a(parcel, 9, this.f11224i);
        }
        if (set.contains(10)) {
            see.m35046a(parcel, 10, this.f11225j, true);
        }
        if (set.contains(11)) {
            see.m35051a(parcel, 11, this.f11226k);
        }
        if (set.contains(12)) {
            see.m35046a(parcel, 12, this.f11227l, true);
        }
        if (set.contains(13)) {
            see.m35065b(parcel, 13, this.f11228m, true);
        }
        if (set.contains(14)) {
            see.m35051a(parcel, 14, this.f11229n);
        }
        if (set.contains(15)) {
            see.m35051a(parcel, 15, this.f11230o);
        }
        see.m35062b(parcel, a);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo7376a(FastJsonResponse$Field fastJsonResponse$Field, String str, String str2) {
        int i = fastJsonResponse$Field.f30319g;
        if (i == 4) {
            this.f11219d = str2;
        } else if (i == 5) {
            this.f11220e = str2;
        } else if (i == 7) {
            this.f11222g = str2;
        } else if (i == 10) {
            this.f11225j = str2;
        } else if (i == 12) {
            this.f11227l = str2;
        } else {
            StringBuilder sb = new StringBuilder(54);
            sb.append("Field with id=");
            sb.append(i);
            sb.append(" is not known to be a String.");
            throw new IllegalArgumentException(sb.toString());
        }
        this.f11216a.add(Integer.valueOf(i));
    }

    /* renamed from: a */
    public final void mo7368a(FastJsonResponse$Field fastJsonResponse$Field, String str, ArrayList arrayList) {
        int i = fastJsonResponse$Field.f30319g;
        if (i == 3) {
            this.f11218c = arrayList;
            this.f11216a.add(Integer.valueOf(i));
            return;
        }
        String canonicalName = arrayList.getClass().getCanonicalName();
        StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 71);
        sb.append("Field with id=");
        sb.append(i);
        sb.append(" is not a known array of custom type.  Found ");
        sb.append(canonicalName);
        sb.append(".");
        throw new IllegalArgumentException(sb.toString());
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo7395a(FastJsonResponse$Field fastJsonResponse$Field, String str, boolean z) {
        int i = fastJsonResponse$Field.f30319g;
        if (i == 2) {
            this.f11217b = z;
        } else if (i == 9) {
            this.f11224i = z;
        } else if (i == 11) {
            this.f11226k = z;
        } else if (i == 14) {
            this.f11229n = z;
        } else if (i == 15) {
            this.f11230o = z;
        } else {
            StringBuilder sb = new StringBuilder(55);
            sb.append("Field with id=");
            sb.append(i);
            sb.append(" is not known to be a boolean.");
            throw new IllegalArgumentException(sb.toString());
        }
        this.f11216a.add(Integer.valueOf(i));
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo7387b(FastJsonResponse$Field fastJsonResponse$Field, String str, ArrayList arrayList) {
        int i = fastJsonResponse$Field.f30319g;
        if (i == 6) {
            this.f11221f = arrayList;
        } else if (i == 13) {
            this.f11228m = arrayList;
        } else {
            StringBuilder sb = new StringBuilder(64);
            sb.append("Field with id=");
            sb.append(i);
            sb.append(" is not known to be an array of String.");
            throw new IllegalArgumentException(sb.toString());
        }
        this.f11216a.add(Integer.valueOf(i));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo7370a(FastJsonResponse$Field fastJsonResponse$Field) {
        return this.f11216a.contains(Integer.valueOf(fastJsonResponse$Field.f30319g));
    }
}
