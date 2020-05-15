package com.google.android.gms.smartdevice.d2d;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.server.response.FastJsonResponse$Field;
import com.google.android.gms.smartdevice.utils.BinarySerializableFastSafeParcelableJson;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class BootstrapConfigurations extends BinarySerializableFastSafeParcelableJson {
    public static final Parcelable.Creator CREATOR = new aqyr();

    /* renamed from: a */
    public static String f107808a = "directTransferTransitionTitle";

    /* renamed from: b */
    public static String f107809b = "directTransferConfirmationButton";

    /* renamed from: r */
    private static final Map f107810r;

    /* renamed from: c */
    public final Set f107811c;

    /* renamed from: d */
    public String f107812d;

    /* renamed from: e */
    public String f107813e;

    /* renamed from: f */
    public String f107814f;

    /* renamed from: g */
    public boolean f107815g;

    /* renamed from: h */
    public ArrayList f107816h;

    /* renamed from: i */
    public Bundle f107817i;

    /* renamed from: j */
    public boolean f107818j;

    /* renamed from: k */
    public boolean f107819k;

    /* renamed from: l */
    public int f107820l;

    /* renamed from: m */
    public long f107821m;

    /* renamed from: n */
    public long f107822n;

    /* renamed from: o */
    public DeviceDetails f107823o;

    /* renamed from: p */
    public boolean f107824p;

    /* renamed from: q */
    public boolean f107825q;

    static {
        C1223np npVar = new C1223np();
        npVar.put("wifiNetworkSsid", FastJsonResponse$Field.m22666f("wifiNetworkSsid", 2));
        npVar.put("wifiNetworkPassword", FastJsonResponse$Field.m22666f("wifiNetworkPassword", 3));
        npVar.put("wifiNetworkSecurity", FastJsonResponse$Field.m22666f("wifiNetworkSecurity", 4));
        npVar.put("isLockScreenShown", FastJsonResponse$Field.m22664e("isLockScreenShown", 5));
        npVar.put("bootstrapAccounts", FastJsonResponse$Field.m22657b("bootstrapAccounts", 6, BootstrapAccount.class));
        npVar.put("extraParameters", new FastJsonResponse$Field(10, false, 10, false, "extraParameters", 7, null, null));
        npVar.put("hasUserConfirmed", FastJsonResponse$Field.m22664e("hasUserConfirmed", 8));
        npVar.put("supportsUnencryptedCommunication", FastJsonResponse$Field.m22664e("supportsUnencryptedCommunication", 9));
        npVar.put("maxPacketSize", FastJsonResponse$Field.m22651a("maxPacketSize", 10));
        npVar.put("optionFlags", FastJsonResponse$Field.m22656b("optionFlags", 11));
        npVar.put("optionFlagSetIndicators", FastJsonResponse$Field.m22656b("optionFlagSetIndicators", 12));
        npVar.put("deviceDetails", FastJsonResponse$Field.m22653a("deviceDetails", 13, DeviceDetails.class));
        npVar.put("nearbyDirectTransfer", FastJsonResponse$Field.m22664e("nearbyDirectTransfer", 14));
        npVar.put("targetNearbyDirectTransfer", FastJsonResponse$Field.m22664e("targetNearbyDirectTransfer", 15));
        f107810r = Collections.unmodifiableMap(npVar);
    }

    public BootstrapConfigurations() {
        this.f107811c = new HashSet();
    }

    /* renamed from: a */
    public final Map mo7367a() {
        return f107810r;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final Object mo7371b(FastJsonResponse$Field fastJsonResponse$Field) {
        int i = fastJsonResponse$Field.f30319g;
        switch (i) {
            case 2:
                return this.f107812d;
            case 3:
                return this.f107813e;
            case 4:
                return this.f107814f;
            case 5:
                return Boolean.valueOf(this.f107815g);
            case 6:
                return this.f107816h;
            case 7:
                return mo59039b();
            case 8:
                return Boolean.valueOf(this.f107818j);
            case 9:
                return Boolean.valueOf(this.f107819k);
            case 10:
                return Integer.valueOf(this.f107820l);
            case 11:
                return Long.valueOf(this.f107821m);
            case 12:
                return Long.valueOf(this.f107822n);
            case 13:
                return this.f107823o;
            case 14:
                return Boolean.valueOf(this.f107824p);
            case 15:
                return Boolean.valueOf(this.f107825q);
            default:
                StringBuilder sb = new StringBuilder(37);
                sb.append("Unknown SafeParcelable id=");
                sb.append(i);
                throw new IllegalStateException(sb.toString());
        }
    }

    /* renamed from: c */
    public final araa mo59041c() {
        return new araa(this.f107821m, this.f107822n);
    }

    /* renamed from: d */
    public final void mo59042d() {
        this.f107818j = false;
        this.f107811c.add(8);
    }

    public BootstrapConfigurations(String str, String str2, String str3, boolean z, ArrayList arrayList, Map map, long j, long j2) {
        this();
        this.f107812d = str;
        this.f107811c.add(2);
        this.f107813e = str2;
        this.f107811c.add(3);
        this.f107814f = str3;
        this.f107811c.add(4);
        this.f107815g = z;
        this.f107811c.add(5);
        mo59036a(arrayList);
        mo59037a(map);
        mo59042d();
        mo59038a(false);
        mo59032a(0);
        mo59033a(j);
        mo59040b(j2);
    }

    /* renamed from: a */
    public final void mo59032a(int i) {
        this.f107820l = i;
        this.f107811c.add(10);
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
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: see.a(android.os.Parcel, int, android.os.Bundle, boolean):void
     arg types: [android.os.Parcel, int, android.os.Bundle, int]
     candidates:
      see.a(android.os.Parcel, int, android.os.Parcel, boolean):void
      see.a(android.os.Parcel, int, java.lang.String, boolean):void
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
      see.a(android.os.Parcel, int, android.os.Bundle, boolean):void */
    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        Set set = this.f107811c;
        if (set.contains(2)) {
            see.m35046a(parcel, 2, this.f107812d, true);
        }
        if (set.contains(3)) {
            see.m35046a(parcel, 3, this.f107813e, true);
        }
        if (set.contains(4)) {
            see.m35046a(parcel, 4, this.f107814f, true);
        }
        if (set.contains(5)) {
            see.m35051a(parcel, 5, this.f107815g);
        }
        if (set.contains(6)) {
            see.m35066c(parcel, 6, this.f107816h, true);
        }
        if (set.contains(7)) {
            see.m35037a(parcel, 7, this.f107817i, true);
        }
        if (set.contains(8)) {
            see.m35051a(parcel, 8, this.f107818j);
        }
        if (set.contains(9)) {
            see.m35051a(parcel, 9, this.f107819k);
        }
        if (set.contains(10)) {
            see.m35063b(parcel, 10, this.f107820l);
        }
        if (set.contains(11)) {
            see.m35036a(parcel, 11, this.f107821m);
        }
        if (set.contains(12)) {
            see.m35036a(parcel, 12, this.f107822n);
        }
        if (set.contains(13)) {
            see.m35040a(parcel, 13, this.f107823o, i, true);
        }
        if (set.contains(14)) {
            see.m35051a(parcel, 14, this.f107824p);
        }
        if (set.contains(15)) {
            see.m35051a(parcel, 15, this.f107825q);
        }
        see.m35062b(parcel, a);
    }

    /* renamed from: a */
    public final void mo59033a(long j) {
        this.f107821m = j;
        this.f107811c.add(11);
    }

    /* renamed from: a */
    public final void mo59034a(araa araa) {
        mo59033a(araa.f87187a);
        mo59040b(araa.f87188b);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo7391a(FastJsonResponse$Field fastJsonResponse$Field, String str, int i) {
        int i2 = fastJsonResponse$Field.f30319g;
        if (i2 == 10) {
            this.f107820l = i;
            this.f107811c.add(Integer.valueOf(i2));
            return;
        }
        throw new IllegalStateException(String.format("Field with id=%d  is not known to be an integer.", Integer.valueOf(i2)));
    }

    public BootstrapConfigurations(Set set, String str, String str2, String str3, boolean z, ArrayList arrayList, Bundle bundle, boolean z2, boolean z3, int i, long j, long j2, DeviceDetails deviceDetails, boolean z4, boolean z5) {
        this.f107811c = set;
        this.f107812d = str;
        this.f107813e = str2;
        this.f107814f = str3;
        this.f107815g = z;
        this.f107816h = arrayList;
        this.f107817i = bundle;
        this.f107818j = z2;
        this.f107819k = z3;
        this.f107820l = i;
        this.f107821m = j;
        this.f107822n = j2;
        this.f107823o = deviceDetails;
        this.f107824p = z4;
        this.f107825q = z5;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo7394a(FastJsonResponse$Field fastJsonResponse$Field, String str, long j) {
        int i = fastJsonResponse$Field.f30319g;
        if (i == 11) {
            this.f107821m = j;
        } else if (i == 12) {
            this.f107822n = j;
        } else {
            throw new IllegalStateException(String.format("Field id %d is not a known long", Integer.valueOf(i)));
        }
        this.f107811c.add(Integer.valueOf(i));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo7376a(FastJsonResponse$Field fastJsonResponse$Field, String str, String str2) {
        int i = fastJsonResponse$Field.f30319g;
        if (i == 2) {
            this.f107812d = str2;
        } else if (i == 3) {
            this.f107813e = str2;
        } else if (i == 4) {
            this.f107814f = str2;
        } else {
            throw new IllegalArgumentException(String.format("Field with id=%d is not known to be a string.", Integer.valueOf(i)));
        }
        this.f107811c.add(Integer.valueOf(i));
    }

    /* renamed from: b */
    public final Map mo59039b() {
        if (this.f107817i == null) {
            return Collections.emptyMap();
        }
        HashMap hashMap = new HashMap();
        for (String str : this.f107817i.keySet()) {
            hashMap.put(str, this.f107817i.getString(str));
        }
        return hashMap;
    }

    /* renamed from: a */
    public final void mo7368a(FastJsonResponse$Field fastJsonResponse$Field, String str, ArrayList arrayList) {
        int i = fastJsonResponse$Field.f30319g;
        if (i == 6) {
            this.f107816h = arrayList;
            this.f107811c.add(Integer.valueOf(i));
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

    /* renamed from: b */
    public final void mo59040b(long j) {
        this.f107822n = j;
        this.f107811c.add(12);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo17877a(FastJsonResponse$Field fastJsonResponse$Field, String str, Map map) {
        int i = fastJsonResponse$Field.f30319g;
        if (i == 7) {
            mo59037a(map);
            this.f107811c.add(Integer.valueOf(i));
            return;
        }
        throw new IllegalArgumentException(String.format("Field with id=%d is not known to be a string map.", Integer.valueOf(i)));
    }

    /* renamed from: a */
    public final void mo7369a(FastJsonResponse$Field fastJsonResponse$Field, String str, sio sio) {
        int i = fastJsonResponse$Field.f30319g;
        if (i == 13) {
            this.f107823o = (DeviceDetails) sio;
            this.f107811c.add(Integer.valueOf(i));
            return;
        }
        throw new IllegalArgumentException(String.format("Field with id=%d not a concrete type", Integer.valueOf(i)));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo7395a(FastJsonResponse$Field fastJsonResponse$Field, String str, boolean z) {
        int i = fastJsonResponse$Field.f30319g;
        if (i == 5) {
            this.f107815g = z;
        } else if (i == 8) {
            this.f107818j = z;
        } else if (i == 9) {
            this.f107819k = z;
        } else if (i == 14) {
            this.f107824p = z;
        } else if (i == 15) {
            this.f107825q = z;
        } else {
            throw new IllegalArgumentException(String.format("Field with id=%d is not known to be a boolean.", Integer.valueOf(i)));
        }
        this.f107811c.add(Integer.valueOf(i));
    }

    /* renamed from: a */
    public final void mo59035a(DeviceDetails deviceDetails) {
        this.f107823o = deviceDetails;
        this.f107811c.add(13);
    }

    /* renamed from: a */
    public final void mo59036a(ArrayList arrayList) {
        this.f107816h = arrayList;
        this.f107811c.add(6);
    }

    /* renamed from: a */
    public final void mo59037a(Map map) {
        if (map != null) {
            this.f107817i = new Bundle();
            for (Map.Entry entry : map.entrySet()) {
                this.f107817i.putString((String) entry.getKey(), (String) entry.getValue());
            }
        } else {
            this.f107817i = null;
        }
        this.f107811c.add(7);
    }

    /* renamed from: a */
    public final void mo59038a(boolean z) {
        this.f107819k = z;
        this.f107811c.add(9);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo7370a(FastJsonResponse$Field fastJsonResponse$Field) {
        return this.f107811c.contains(Integer.valueOf(fastJsonResponse$Field.f30319g));
    }
}
