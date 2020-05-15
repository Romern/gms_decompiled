package com.google.android.gms.smartdevice.d2d;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.server.response.FastJsonResponse$Field;
import com.google.android.gms.smartdevice.utils.BinarySerializableFastSafeParcelableJson;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class BootstrapOptions extends BinarySerializableFastSafeParcelableJson {

    /* renamed from: B */
    private static final Map f107826B;
    public static final Parcelable.Creator CREATOR = new aqyu();

    /* renamed from: A */
    public String f107827A;

    /* renamed from: a */
    final Set f107828a;

    /* renamed from: b */
    public int f107829b;

    /* renamed from: c */
    public int f107830c;

    /* renamed from: d */
    public boolean f107831d;

    /* renamed from: e */
    public List f107832e;

    /* renamed from: f */
    public byte f107833f;

    /* renamed from: g */
    public String f107834g;

    /* renamed from: h */
    public CompanionApp f107835h;

    /* renamed from: i */
    public boolean f107836i;

    /* renamed from: j */
    public int f107837j;

    /* renamed from: k */
    public int f107838k;

    /* renamed from: l */
    public long f107839l;

    /* renamed from: m */
    public boolean f107840m;

    /* renamed from: n */
    public boolean f107841n;

    /* renamed from: o */
    public boolean f107842o;

    /* renamed from: p */
    public boolean f107843p;

    /* renamed from: q */
    public int f107844q;

    /* renamed from: r */
    public long f107845r;

    /* renamed from: s */
    public int f107846s;

    /* renamed from: t */
    public long f107847t;

    /* renamed from: u */
    public PostTransferAction f107848u;

    /* renamed from: v */
    public byte[] f107849v;

    /* renamed from: w */
    public EsimActivationInfo f107850w;

    /* renamed from: x */
    public AdvertisementOptions f107851x;

    /* renamed from: y */
    public int f107852y;

    /* renamed from: z */
    public boolean f107853z;

    static {
        C1223np npVar = new C1223np();
        npVar.put("protocol", FastJsonResponse$Field.m22651a("protocol", 2));
        npVar.put("accountRequirement", FastJsonResponse$Field.m22651a("accountRequirement", 3));
        npVar.put("isWiFiBootstrappable", FastJsonResponse$Field.m22664e("isWiFiBootstrappable", 4));
        npVar.put("visibleWiFiSSIDs", FastJsonResponse$Field.m22668g("visibleWiFiSSIDs", 5));
        npVar.put("deviceType", FastJsonResponse$Field.m22651a("deviceType", 6));
        npVar.put("deviceName", FastJsonResponse$Field.m22666f("deviceName", 7));
        npVar.put("companionApp", FastJsonResponse$Field.m22653a("companionApp", 8, CompanionApp.class));
        npVar.put("isSourceSideChallengeRequired", FastJsonResponse$Field.m22664e("isSourceSideChallengeRequired", 9));
        npVar.put("flowType", FastJsonResponse$Field.m22651a("flowType", 10));
        npVar.put("transportMedium", FastJsonResponse$Field.m22651a("transportMedium", 11));
        npVar.put("sessionId", FastJsonResponse$Field.m22656b("sessionId", 12));
        npVar.put("supportsDevicePolicySetup", FastJsonResponse$Field.m22664e("supportsDevicePolicySetup", 13));
        npVar.put("supportsAccountTransferImport", FastJsonResponse$Field.m22664e("supportsAccountTransferImport", 14));
        npVar.put("isAccountTransferImportAllowed", FastJsonResponse$Field.m22664e("isAccountTransferImportAllowed", 15));
        npVar.put("supportsPacketMode", FastJsonResponse$Field.m22664e("supportsPacketMode", 16));
        npVar.put("maxPacketSize", FastJsonResponse$Field.m22651a("maxPacketSize", 17));
        npVar.put("optionFlags", FastJsonResponse$Field.m22656b("optionFlags", 18));
        npVar.put("gmsVersion", FastJsonResponse$Field.m22651a("gmsVersion", 19));
        npVar.put("optionFlagsSetIndicator", FastJsonResponse$Field.m22656b("optionFlagsSetIndicator", 20));
        npVar.put("PostTransferAction", FastJsonResponse$Field.m22653a("PostTransferAction", 21, PostTransferAction.class));
        npVar.put("SharedSecret", FastJsonResponse$Field.m22669h("SharedSecret", 22));
        npVar.put("esimActivationInfo", FastJsonResponse$Field.m22653a("esimActivationInfo", 23, EsimActivationInfo.class));
        npVar.put("advertisementOptions", FastJsonResponse$Field.m22653a("advertisementOptions", 24, AdvertisementOptions.class));
        npVar.put("moduleVersion", FastJsonResponse$Field.m22651a("moduleVersion", 25));
        npVar.put("nearbyDirectTransfer", FastJsonResponse$Field.m22664e("nearbyDirectTransfer", 26));
        npVar.put("deeplinkPairingCode", FastJsonResponse$Field.m22666f("deeplinkPairingCode", 27));
        f107826B = Collections.unmodifiableMap(npVar);
    }

    public BootstrapOptions() {
        this.f107828a = new HashSet();
    }

    /* renamed from: a */
    public final Map mo7367a() {
        return f107826B;
    }

    /* renamed from: b */
    public final araa mo59048b() {
        return new araa(this.f107845r, this.f107847t);
    }

    /* renamed from: c */
    public final void mo59052c(int i) {
        this.f107844q = i;
        this.f107828a.add(17);
    }

    /* renamed from: c */
    public final boolean mo59056c() {
        return (this.f107830c & 1) != 1;
    }

    /* renamed from: d */
    public final void mo59057d(int i) {
        this.f107846s = i;
        this.f107828a.add(19);
    }

    /* renamed from: d */
    public final boolean mo59059d() {
        return (this.f107830c & 2) == 2;
    }

    /* renamed from: e */
    public final void mo59060e(int i) {
        this.f107852y = i;
        this.f107828a.add(25);
    }

    /* renamed from: e */
    public final boolean mo59063e() {
        return (this.f107830c & 4) == 4;
    }

    /* renamed from: f */
    public final void mo59064f() {
        this.f107850w = null;
        this.f107828a.add(23);
    }

    public BootstrapOptions(int i, int i2, boolean z, List list, byte b, String str, CompanionApp companionApp, boolean z2, long j, boolean z3, boolean z4, long j2, int i3, long j3, PostTransferAction postTransferAction, AdvertisementOptions advertisementOptions) {
        this();
        mo59044a(i);
        this.f107830c = i2;
        this.f107828a.add(3);
        this.f107831d = false;
        this.f107828a.add(4);
        this.f107832e = list;
        this.f107828a.add(5);
        this.f107833f = 0;
        this.f107828a.add(6);
        mo59061e(str);
        this.f107835h = null;
        this.f107828a.add(8);
        this.f107836i = z2;
        this.f107828a.add(9);
        mo59049b(-1);
        this.f107838k = 1;
        this.f107828a.add(11);
        mo59045a(j);
        mo59047a(z3);
        mo59051b(false);
        mo59054c(z4);
        mo59058d(false);
        mo59052c(0);
        mo59050b(j2);
        mo59057d(i3);
        mo59053c(j3);
        mo59046a((PostTransferAction) null);
        mo59055c((byte[]) null);
        mo59064f();
        this.f107851x = advertisementOptions;
        this.f107828a.add(24);
        mo59060e(0);
        mo59062e(false);
        this.f107827A = null;
        this.f107828a.add(27);
    }

    /* renamed from: a */
    public final void mo59044a(int i) {
        this.f107829b = i;
        this.f107828a.add(2);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final Object mo7371b(FastJsonResponse$Field fastJsonResponse$Field) {
        int i = fastJsonResponse$Field.f30319g;
        switch (i) {
            case 2:
                return Integer.valueOf(this.f107829b);
            case 3:
                return Integer.valueOf(this.f107830c);
            case 4:
                return Boolean.valueOf(this.f107831d);
            case 5:
                return this.f107832e;
            case 6:
                return Byte.valueOf(this.f107833f);
            case 7:
                return this.f107834g;
            case 8:
                return this.f107835h;
            case 9:
                return Boolean.valueOf(this.f107836i);
            case 10:
                return Integer.valueOf(this.f107837j);
            case 11:
                return Integer.valueOf(this.f107838k);
            case 12:
                return Long.valueOf(this.f107839l);
            case 13:
                return Boolean.valueOf(this.f107840m);
            case 14:
                return Boolean.valueOf(this.f107841n);
            case 15:
                return Boolean.valueOf(this.f107842o);
            case 16:
                return Boolean.valueOf(this.f107843p);
            case 17:
                return Integer.valueOf(this.f107844q);
            case 18:
                return Long.valueOf(this.f107845r);
            case 19:
                return Integer.valueOf(this.f107846s);
            case 20:
                return Long.valueOf(this.f107847t);
            case 21:
                return this.f107848u;
            case 22:
                return this.f107849v;
            case 23:
                return this.f107850w;
            case 24:
                return this.f107851x;
            case 25:
                return Integer.valueOf(this.f107852y);
            case 26:
                return Boolean.valueOf(this.f107853z);
            case 27:
                return this.f107827A;
            default:
                StringBuilder sb = new StringBuilder(37);
                sb.append("Unknown SafeParcelable id=");
                sb.append(i);
                throw new IllegalStateException(sb.toString());
        }
    }

    /* renamed from: c */
    public final void mo59053c(long j) {
        this.f107847t = j;
        this.f107828a.add(20);
    }

    /* renamed from: d */
    public final void mo59058d(boolean z) {
        this.f107843p = z;
        this.f107828a.add(16);
    }

    /* renamed from: e */
    public final void mo59061e(String str) {
        this.f107834g = str;
        this.f107828a.add(7);
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
     method: see.a(android.os.Parcel, int, byte[], boolean):void
     arg types: [android.os.Parcel, int, byte[], int]
     candidates:
      see.a(android.os.Parcel, int, android.os.Bundle, boolean):void
      see.a(android.os.Parcel, int, android.os.Parcel, boolean):void
      see.a(android.os.Parcel, int, java.lang.String, boolean):void
      see.a(android.os.Parcel, int, java.math.BigDecimal, boolean):void
      see.a(android.os.Parcel, int, java.util.List, boolean):void
      see.a(android.os.Parcel, int, double[], boolean):void
      see.a(android.os.Parcel, int, float[], boolean):void
      see.a(android.os.Parcel, int, int[], boolean):void
      see.a(android.os.Parcel, int, long[], boolean):void
      see.a(android.os.Parcel, int, android.os.Parcelable[], int):void
      see.a(android.os.Parcel, int, java.lang.String[], boolean):void
      see.a(android.os.Parcel, int, boolean[], boolean):void
      see.a(android.os.Parcel, int, byte[], boolean):void */
    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        Set set = this.f107828a;
        if (set.contains(2)) {
            see.m35063b(parcel, 2, this.f107829b);
        }
        if (set.contains(3)) {
            see.m35063b(parcel, 3, this.f107830c);
        }
        if (set.contains(4)) {
            see.m35051a(parcel, 4, this.f107831d);
        }
        if (set.contains(5)) {
            see.m35065b(parcel, 5, this.f107832e, true);
        }
        if (set.contains(6)) {
            see.m35032a(parcel, 6, this.f107833f);
        }
        if (set.contains(7)) {
            see.m35046a(parcel, 7, this.f107834g, true);
        }
        if (set.contains(8)) {
            see.m35040a(parcel, 8, this.f107835h, i, true);
        }
        if (set.contains(9)) {
            see.m35051a(parcel, 9, this.f107836i);
        }
        if (set.contains(10)) {
            see.m35063b(parcel, 10, this.f107837j);
        }
        if (set.contains(11)) {
            see.m35063b(parcel, 11, this.f107838k);
        }
        if (set.contains(12)) {
            see.m35036a(parcel, 12, this.f107839l);
        }
        if (set.contains(13)) {
            see.m35051a(parcel, 13, this.f107840m);
        }
        if (set.contains(14)) {
            see.m35051a(parcel, 14, this.f107841n);
        }
        if (set.contains(15)) {
            see.m35051a(parcel, 15, this.f107842o);
        }
        if (set.contains(16)) {
            see.m35051a(parcel, 16, this.f107843p);
        }
        if (set.contains(17)) {
            see.m35063b(parcel, 17, this.f107844q);
        }
        if (set.contains(18)) {
            see.m35036a(parcel, 18, this.f107845r);
        }
        if (set.contains(19)) {
            see.m35063b(parcel, 19, this.f107846s);
        }
        if (set.contains(20)) {
            see.m35036a(parcel, 20, this.f107847t);
        }
        if (set.contains(21)) {
            see.m35040a(parcel, 21, this.f107848u, i, true);
        }
        if (set.contains(22)) {
            see.m35052a(parcel, 22, this.f107849v, true);
        }
        if (set.contains(23)) {
            see.m35040a(parcel, 23, this.f107850w, i, true);
        }
        if (set.contains(24)) {
            see.m35040a(parcel, 24, this.f107851x, i, true);
        }
        if (set.contains(25)) {
            see.m35063b(parcel, 25, this.f107852y);
        }
        if (set.contains(26)) {
            see.m35051a(parcel, 26, this.f107853z);
        }
        if (set.contains(27)) {
            see.m35046a(parcel, 27, this.f107827A, true);
        }
        see.m35062b(parcel, a);
    }

    /* renamed from: a */
    public final void mo59045a(long j) {
        this.f107839l = j;
        this.f107828a.add(12);
    }

    /* renamed from: c */
    public final void mo59054c(boolean z) {
        this.f107842o = z;
        this.f107828a.add(15);
    }

    /* renamed from: e */
    public final void mo59062e(boolean z) {
        this.f107853z = z;
        this.f107828a.add(26);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo7391a(FastJsonResponse$Field fastJsonResponse$Field, String str, int i) {
        int i2 = fastJsonResponse$Field.f30319g;
        if (i2 == 2) {
            this.f107829b = i;
        } else if (i2 == 3) {
            this.f107830c = i;
        } else if (i2 == 6) {
            this.f107833f = (byte) i;
        } else if (i2 == 17) {
            this.f107844q = i;
        } else if (i2 == 19) {
            this.f107846s = i;
        } else if (i2 == 25) {
            this.f107852y = i;
        } else if (i2 == 10) {
            this.f107837j = i;
        } else if (i2 == 11) {
            this.f107838k = i;
        } else {
            StringBuilder sb = new StringBuilder(52);
            sb.append("Field with id=");
            sb.append(i2);
            sb.append(" is not known to be an int.");
            throw new IllegalArgumentException(sb.toString());
        }
        this.f107828a.add(Integer.valueOf(i2));
    }

    /* renamed from: c */
    public final void mo59055c(byte[] bArr) {
        this.f107849v = bArr;
        this.f107828a.add(22);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo7394a(FastJsonResponse$Field fastJsonResponse$Field, String str, long j) {
        int i = fastJsonResponse$Field.f30319g;
        if (i == 12) {
            this.f107839l = j;
        } else if (i == 18) {
            this.f107845r = j;
        } else if (i == 20) {
            this.f107847t = j;
        } else {
            StringBuilder sb = new StringBuilder(52);
            sb.append("Field with id=");
            sb.append(i);
            sb.append(" is not known to be a long.");
            throw new IllegalArgumentException(sb.toString());
        }
        this.f107828a.add(Integer.valueOf(i));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo7376a(FastJsonResponse$Field fastJsonResponse$Field, String str, String str2) {
        int i = fastJsonResponse$Field.f30319g;
        if (i == 7) {
            this.f107834g = str2;
        } else if (i == 27) {
            this.f107827A = str2;
        } else {
            throw new IllegalArgumentException(String.format("Field with id=%d is not known to be a string.", Integer.valueOf(i)));
        }
        this.f107828a.add(Integer.valueOf(i));
    }

    /* renamed from: a */
    public final void mo7369a(FastJsonResponse$Field fastJsonResponse$Field, String str, sio sio) {
        int i = fastJsonResponse$Field.f30319g;
        if (i == 8) {
            this.f107835h = (CompanionApp) sio;
        } else if (i == 21) {
            this.f107848u = (PostTransferAction) sio;
        } else if (i == 23) {
            this.f107850w = (EsimActivationInfo) sio;
        } else if (i == 24) {
            this.f107851x = (AdvertisementOptions) sio;
        } else {
            throw new IllegalArgumentException(String.format("Field with id=%d is not a known custom type. Found %s", Integer.valueOf(i), sio.getClass().getCanonicalName()));
        }
        this.f107828a.add(Integer.valueOf(i));
    }

    public BootstrapOptions(Set set, int i, int i2, boolean z, List list, byte b, String str, CompanionApp companionApp, boolean z2, int i3, int i4, long j, boolean z3, boolean z4, boolean z5, boolean z6, int i5, long j2, int i6, long j3, PostTransferAction postTransferAction, byte[] bArr, EsimActivationInfo esimActivationInfo, AdvertisementOptions advertisementOptions, int i7, boolean z7, String str2) {
        this.f107828a = set;
        this.f107829b = i;
        this.f107830c = i2;
        this.f107831d = z;
        this.f107832e = list;
        this.f107833f = b;
        this.f107834g = str;
        this.f107835h = companionApp;
        this.f107836i = z2;
        this.f107837j = i3;
        this.f107838k = i4;
        this.f107839l = j;
        this.f107840m = z3;
        this.f107841n = z4;
        this.f107842o = z5;
        this.f107843p = z6;
        this.f107844q = i5;
        this.f107845r = j2;
        this.f107846s = i6;
        this.f107847t = j3;
        this.f107848u = postTransferAction;
        this.f107849v = bArr;
        this.f107850w = esimActivationInfo;
        this.f107851x = advertisementOptions;
        this.f107852y = i7;
        this.f107853z = z7;
        this.f107827A = str2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo7395a(FastJsonResponse$Field fastJsonResponse$Field, String str, boolean z) {
        int i = fastJsonResponse$Field.f30319g;
        if (i == 4) {
            this.f107831d = z;
        } else if (i == 9) {
            this.f107836i = z;
        } else if (i != 26) {
            switch (i) {
                case 13:
                    this.f107840m = z;
                    break;
                case 14:
                    this.f107841n = z;
                    break;
                case 15:
                    this.f107842o = z;
                    break;
                case 16:
                    this.f107843p = z;
                    break;
                default:
                    throw new IllegalArgumentException(String.format("Field with id=%d is not known to be a boolean.", Integer.valueOf(i)));
            }
        } else {
            this.f107853z = z;
        }
        this.f107828a.add(Integer.valueOf(i));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo7392a(FastJsonResponse$Field fastJsonResponse$Field, String str, byte[] bArr) {
        int i = fastJsonResponse$Field.f30319g;
        if (i == 22) {
            this.f107849v = bArr;
            this.f107828a.add(Integer.valueOf(i));
            return;
        }
        StringBuilder sb = new StringBuilder(59);
        sb.append("Field with id=");
        sb.append(i);
        sb.append(" is not known to be an byte array.");
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: b */
    public final void mo59049b(int i) {
        this.f107837j = i;
        this.f107828a.add(10);
    }

    /* renamed from: b */
    public final void mo59050b(long j) {
        this.f107845r = j;
        this.f107828a.add(18);
    }

    /* renamed from: a */
    public final void mo59046a(PostTransferAction postTransferAction) {
        this.f107848u = postTransferAction;
        this.f107828a.add(21);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo7387b(FastJsonResponse$Field fastJsonResponse$Field, String str, ArrayList arrayList) {
        int i = fastJsonResponse$Field.f30319g;
        if (i == 5) {
            this.f107832e = arrayList;
            this.f107828a.add(Integer.valueOf(i));
            return;
        }
        throw new IllegalArgumentException(String.format("Field with id=%d is not known to be a string list.", Integer.valueOf(i)));
    }

    /* renamed from: a */
    public final void mo59047a(boolean z) {
        this.f107840m = z;
        this.f107828a.add(13);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo7370a(FastJsonResponse$Field fastJsonResponse$Field) {
        return this.f107828a.contains(Integer.valueOf(fastJsonResponse$Field.f30319g));
    }

    /* renamed from: b */
    public final void mo59051b(boolean z) {
        this.f107841n = z;
        this.f107828a.add(14);
    }
}
