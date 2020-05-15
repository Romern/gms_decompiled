package com.google.android.gms.auth.authzen.gencode.server.api;

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
public final class ExternalDeviceInfoEntity extends FastSafeParcelableJsonResponse implements iho {
    public static final Parcelable.Creator CREATOR = new ihp();

    /* renamed from: p */
    private static final HashMap f10420p;

    /* renamed from: a */
    final Set f10421a;

    /* renamed from: b */
    boolean f10422b;

    /* renamed from: c */
    List f10423c;

    /* renamed from: d */
    String f10424d;

    /* renamed from: e */
    String f10425e;

    /* renamed from: f */
    List f10426f;

    /* renamed from: g */
    String f10427g;

    /* renamed from: h */
    long f10428h;

    /* renamed from: i */
    boolean f10429i;

    /* renamed from: j */
    String f10430j;

    /* renamed from: k */
    boolean f10431k;

    /* renamed from: l */
    String f10432l;

    /* renamed from: m */
    List f10433m;

    /* renamed from: n */
    boolean f10434n;

    /* renamed from: o */
    boolean f10435o;

    static {
        HashMap hashMap = new HashMap();
        f10420p = hashMap;
        hashMap.put("arcPlusPlus", FastJsonResponse$Field.m22664e("arcPlusPlus", 2));
        f10420p.put("beaconSeeds", FastJsonResponse$Field.m22657b("beaconSeeds", 3, BeaconSeedEntity.class));
        f10420p.put("bluetoothAddress", FastJsonResponse$Field.m22666f("bluetoothAddress", 4));
        f10420p.put("deviceType", FastJsonResponse$Field.m22666f("deviceType", 5));
        f10420p.put("enabledSoftwareFeatures", FastJsonResponse$Field.m22668g("enabledSoftwareFeatures", 6));
        f10420p.put("friendlyDeviceName", FastJsonResponse$Field.m22666f("friendlyDeviceName", 7));
        f10420p.put("lastUpdateTimeMillis", FastJsonResponse$Field.m22656b("lastUpdateTimeMillis", 8));
        f10420p.put("mobileHotspotSupported", FastJsonResponse$Field.m22664e("mobileHotspotSupported", 9));
        f10420p.put("noPiiDeviceName", FastJsonResponse$Field.m22666f("noPiiDeviceName", 10));
        f10420p.put("pixelPhone", FastJsonResponse$Field.m22664e("pixelPhone", 11));
        f10420p.put("publicKey", FastJsonResponse$Field.m22666f("publicKey", 12));
        f10420p.put("supportedSoftwareFeatures", FastJsonResponse$Field.m22668g("supportedSoftwareFeatures", 13));
        f10420p.put("unlockKey", FastJsonResponse$Field.m22664e("unlockKey", 14));
        f10420p.put("unlockable", FastJsonResponse$Field.m22664e("unlockable", 15));
    }

    public ExternalDeviceInfoEntity() {
        this.f10421a = new HashSet();
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Map mo7367a() {
        return f10420p;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final Object mo7371b(FastJsonResponse$Field fastJsonResponse$Field) {
        int i = fastJsonResponse$Field.f30319g;
        switch (i) {
            case 2:
                return Boolean.valueOf(this.f10422b);
            case 3:
                return this.f10423c;
            case 4:
                return this.f10424d;
            case 5:
                return this.f10425e;
            case 6:
                return this.f10426f;
            case 7:
                return this.f10427g;
            case 8:
                return Long.valueOf(this.f10428h);
            case 9:
                return Boolean.valueOf(this.f10429i);
            case 10:
                return this.f10430j;
            case 11:
                return Boolean.valueOf(this.f10431k);
            case 12:
                return this.f10432l;
            case 13:
                return this.f10433m;
            case 14:
                return Boolean.valueOf(this.f10434n);
            case 15:
                return Boolean.valueOf(this.f10435o);
            default:
                StringBuilder sb = new StringBuilder(38);
                sb.append("Unknown safe parcelable id=");
                sb.append(i);
                throw new IllegalStateException(sb.toString());
        }
    }

    /* renamed from: b */
    public final boolean mo7561b() {
        return this.f10422b;
    }

    /* renamed from: bF */
    public final /* bridge */ /* synthetic */ Object mo7556bF() {
        return this;
    }

    /* renamed from: c */
    public final List mo7562c() {
        return this.f10423c;
    }

    /* renamed from: d */
    public final boolean mo7563d() {
        return this.f10421a.contains(3);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ExternalDeviceInfoEntity)) {
            return false;
        }
        if (this != obj) {
            ExternalDeviceInfoEntity externalDeviceInfoEntity = (ExternalDeviceInfoEntity) obj;
            for (FastJsonResponse$Field fastJsonResponse$Field : f10420p.values()) {
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
    public final String mo7564f() {
        return this.f10424d;
    }

    /* renamed from: g */
    public final boolean mo7565g() {
        return this.f10421a.contains(4);
    }

    /* renamed from: h */
    public final String mo7566h() {
        return this.f10425e;
    }

    public final int hashCode() {
        int i = 0;
        for (FastJsonResponse$Field fastJsonResponse$Field : f10420p.values()) {
            if (mo7370a(fastJsonResponse$Field)) {
                i = i + fastJsonResponse$Field.f30319g + mo7371b(fastJsonResponse$Field).hashCode();
            }
        }
        return i;
    }

    /* renamed from: i */
    public final String mo7567i() {
        return this.f10427g;
    }

    /* renamed from: j */
    public final long mo7568j() {
        return this.f10428h;
    }

    /* renamed from: k */
    public final boolean mo7569k() {
        return this.f10429i;
    }

    /* renamed from: l */
    public final boolean mo7570l() {
        return this.f10431k;
    }

    /* renamed from: m */
    public final String mo7571m() {
        return this.f10432l;
    }

    /* renamed from: n */
    public final boolean mo7572n() {
        return this.f10421a.contains(12);
    }

    /* renamed from: o */
    public final boolean mo7573o() {
        return this.f10434n;
    }

    /* renamed from: p */
    public final boolean mo7574p() {
        return this.f10435o;
    }

    public ExternalDeviceInfoEntity(Set set, boolean z, List list, String str, String str2, List list2, String str3, long j, boolean z2, String str4, boolean z3, String str5, List list3, boolean z4, boolean z5) {
        this.f10421a = set;
        this.f10422b = z;
        this.f10423c = list;
        this.f10424d = str;
        this.f10425e = str2;
        this.f10426f = list2;
        this.f10427g = str3;
        this.f10428h = j;
        this.f10429i = z2;
        this.f10430j = str4;
        this.f10431k = z3;
        this.f10432l = str5;
        this.f10433m = list3;
        this.f10434n = z4;
        this.f10435o = z5;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo7394a(FastJsonResponse$Field fastJsonResponse$Field, String str, long j) {
        int i = fastJsonResponse$Field.f30319g;
        if (i == 8) {
            this.f10428h = j;
            this.f10421a.add(Integer.valueOf(i));
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
        Set set = this.f10421a;
        if (set.contains(2)) {
            see.m35051a(parcel, 2, this.f10422b);
        }
        if (set.contains(3)) {
            see.m35066c(parcel, 3, this.f10423c, true);
        }
        if (set.contains(4)) {
            see.m35046a(parcel, 4, this.f10424d, true);
        }
        if (set.contains(5)) {
            see.m35046a(parcel, 5, this.f10425e, true);
        }
        if (set.contains(6)) {
            see.m35065b(parcel, 6, this.f10426f, true);
        }
        if (set.contains(7)) {
            see.m35046a(parcel, 7, this.f10427g, true);
        }
        if (set.contains(8)) {
            see.m35036a(parcel, 8, this.f10428h);
        }
        if (set.contains(9)) {
            see.m35051a(parcel, 9, this.f10429i);
        }
        if (set.contains(10)) {
            see.m35046a(parcel, 10, this.f10430j, true);
        }
        if (set.contains(11)) {
            see.m35051a(parcel, 11, this.f10431k);
        }
        if (set.contains(12)) {
            see.m35046a(parcel, 12, this.f10432l, true);
        }
        if (set.contains(13)) {
            see.m35065b(parcel, 13, this.f10433m, true);
        }
        if (set.contains(14)) {
            see.m35051a(parcel, 14, this.f10434n);
        }
        if (set.contains(15)) {
            see.m35051a(parcel, 15, this.f10435o);
        }
        see.m35062b(parcel, a);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo7376a(FastJsonResponse$Field fastJsonResponse$Field, String str, String str2) {
        int i = fastJsonResponse$Field.f30319g;
        if (i == 4) {
            this.f10424d = str2;
        } else if (i == 5) {
            this.f10425e = str2;
        } else if (i == 7) {
            this.f10427g = str2;
        } else if (i == 10) {
            this.f10430j = str2;
        } else if (i == 12) {
            this.f10432l = str2;
        } else {
            StringBuilder sb = new StringBuilder(54);
            sb.append("Field with id=");
            sb.append(i);
            sb.append(" is not known to be a String.");
            throw new IllegalArgumentException(sb.toString());
        }
        this.f10421a.add(Integer.valueOf(i));
    }

    /* renamed from: a */
    public final void mo7368a(FastJsonResponse$Field fastJsonResponse$Field, String str, ArrayList arrayList) {
        int i = fastJsonResponse$Field.f30319g;
        if (i == 3) {
            this.f10423c = arrayList;
            this.f10421a.add(Integer.valueOf(i));
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
            this.f10422b = z;
        } else if (i == 9) {
            this.f10429i = z;
        } else if (i == 11) {
            this.f10431k = z;
        } else if (i == 14) {
            this.f10434n = z;
        } else if (i == 15) {
            this.f10435o = z;
        } else {
            StringBuilder sb = new StringBuilder(55);
            sb.append("Field with id=");
            sb.append(i);
            sb.append(" is not known to be a boolean.");
            throw new IllegalArgumentException(sb.toString());
        }
        this.f10421a.add(Integer.valueOf(i));
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo7387b(FastJsonResponse$Field fastJsonResponse$Field, String str, ArrayList arrayList) {
        int i = fastJsonResponse$Field.f30319g;
        if (i == 6) {
            this.f10426f = arrayList;
        } else if (i == 13) {
            this.f10433m = arrayList;
        } else {
            StringBuilder sb = new StringBuilder(64);
            sb.append("Field with id=");
            sb.append(i);
            sb.append(" is not known to be an array of String.");
            throw new IllegalArgumentException(sb.toString());
        }
        this.f10421a.add(Integer.valueOf(i));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo7370a(FastJsonResponse$Field fastJsonResponse$Field) {
        return this.f10421a.contains(Integer.valueOf(fastJsonResponse$Field.f30319g));
    }
}
