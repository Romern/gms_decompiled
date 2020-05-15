package com.google.android.gms.smartdevice.setup.accounts;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.server.response.FastJsonResponse$Field;
import com.google.android.gms.smartdevice.utils.BinarySerializableFastSafeParcelableJson;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class ExchangeAssertionsForUserCredentialsRequest extends BinarySerializableFastSafeParcelableJson {
    public static final Parcelable.Creator CREATOR = new aruj();

    /* renamed from: j */
    private static final HashMap f108145j;

    /* renamed from: a */
    final Set f108146a;

    /* renamed from: b */
    public ArrayList f108147b;

    /* renamed from: c */
    public DeviceSignals f108148c;

    /* renamed from: d */
    public int f108149d;

    /* renamed from: e */
    public String f108150e;

    /* renamed from: f */
    public String f108151f;

    /* renamed from: g */
    public String f108152g;

    /* renamed from: h */
    public String f108153h;

    /* renamed from: i */
    public boolean f108154i;

    static {
        HashMap hashMap = new HashMap();
        f108145j = hashMap;
        hashMap.put("assertions", FastJsonResponse$Field.m22657b("assertions", 2, Assertion.class));
        f108145j.put("targetDeviceSignals", FastJsonResponse$Field.m22653a("targetDeviceSignals", 3, DeviceSignals.class));
        f108145j.put("credentialType", FastJsonResponse$Field.m22651a("credentialType", 4));
        f108145j.put("clientId", FastJsonResponse$Field.m22666f("clientId", 5));
        f108145j.put("locale", FastJsonResponse$Field.m22666f("locale", 6));
        f108145j.put("sourceBackupAccountId", FastJsonResponse$Field.m22666f("sourceBackupAccountId", 7));
        f108145j.put("sourceAndroidDeviceId", FastJsonResponse$Field.m22666f("sourceAndroidDeviceId", 8));
        f108145j.put("deferCredentialsAfterFallback", FastJsonResponse$Field.m22664e("deferCredentialsAfterFallback", 9));
    }

    public ExchangeAssertionsForUserCredentialsRequest() {
        this.f108146a = new HashSet();
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Map mo7367a() {
        return f108145j;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final Object mo7371b(FastJsonResponse$Field fastJsonResponse$Field) {
        int i = fastJsonResponse$Field.f30319g;
        switch (i) {
            case 2:
                return this.f108147b;
            case 3:
                return this.f108148c;
            case 4:
                return Integer.valueOf(this.f108149d);
            case 5:
                return this.f108150e;
            case 6:
                return this.f108151f;
            case 7:
                return this.f108152g;
            case 8:
                return this.f108153h;
            case 9:
                return Boolean.valueOf(this.f108154i);
            default:
                StringBuilder sb = new StringBuilder(37);
                sb.append("Unknown SafeParcelable id=");
                sb.append(i);
                throw new IllegalStateException(sb.toString());
        }
    }

    /* renamed from: e */
    public final void mo59157e(String str) {
        this.f108151f = str;
        this.f108146a.add(6);
    }

    /* renamed from: f */
    public final void mo59158f(String str) {
        this.f108152g = str;
        this.f108146a.add(7);
    }

    /* renamed from: g */
    public final void mo59159g(String str) {
        this.f108153h = str;
        this.f108146a.add(8);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo7391a(FastJsonResponse$Field fastJsonResponse$Field, String str, int i) {
        int i2 = fastJsonResponse$Field.f30319g;
        if (i2 == 4) {
            this.f108149d = i;
            this.f108146a.add(Integer.valueOf(i2));
            return;
        }
        StringBuilder sb = new StringBuilder(52);
        sb.append("Field with id=");
        sb.append(i2);
        sb.append(" is not known to be an int.");
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
        Set set = this.f108146a;
        if (set.contains(2)) {
            see.m35066c(parcel, 2, this.f108147b, true);
        }
        if (set.contains(3)) {
            see.m35040a(parcel, 3, this.f108148c, i, true);
        }
        if (set.contains(4)) {
            see.m35063b(parcel, 4, this.f108149d);
        }
        if (set.contains(5)) {
            see.m35046a(parcel, 5, this.f108150e, true);
        }
        if (set.contains(6)) {
            see.m35046a(parcel, 6, this.f108151f, true);
        }
        if (set.contains(7)) {
            see.m35046a(parcel, 7, this.f108152g, true);
        }
        if (set.contains(8)) {
            see.m35046a(parcel, 8, this.f108153h, true);
        }
        if (set.contains(9)) {
            see.m35051a(parcel, 9, this.f108154i);
        }
        see.m35062b(parcel, a);
    }

    public ExchangeAssertionsForUserCredentialsRequest(ArrayList arrayList, String str) {
        HashSet hashSet = new HashSet();
        this.f108146a = hashSet;
        this.f108147b = arrayList;
        hashSet.add(2);
        mo59155a((DeviceSignals) null);
        this.f108149d = 3;
        this.f108146a.add(4);
        this.f108150e = str;
        this.f108146a.add(5);
        mo59157e((String) null);
        mo59158f(null);
        mo59159g(null);
        mo59156a(false);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo7376a(FastJsonResponse$Field fastJsonResponse$Field, String str, String str2) {
        int i = fastJsonResponse$Field.f30319g;
        if (i == 5) {
            this.f108150e = str2;
        } else if (i == 6) {
            this.f108151f = str2;
        } else if (i == 7) {
            this.f108152g = str2;
        } else if (i == 8) {
            this.f108153h = str2;
        } else {
            throw new IllegalArgumentException(String.format("Field with id=%d is not known to be a string.", Integer.valueOf(i)));
        }
        this.f108146a.add(Integer.valueOf(i));
    }

    /* renamed from: a */
    public final void mo7368a(FastJsonResponse$Field fastJsonResponse$Field, String str, ArrayList arrayList) {
        int i = fastJsonResponse$Field.f30319g;
        if (i == 2) {
            this.f108147b = arrayList;
            this.f108146a.add(Integer.valueOf(i));
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

    public ExchangeAssertionsForUserCredentialsRequest(Set set, ArrayList arrayList, DeviceSignals deviceSignals, int i, String str, String str2, String str3, String str4, boolean z) {
        this.f108146a = set;
        this.f108147b = arrayList;
        this.f108148c = deviceSignals;
        this.f108149d = i;
        this.f108150e = str;
        this.f108151f = str2;
        this.f108152g = str3;
        this.f108153h = str4;
        this.f108154i = z;
    }

    /* renamed from: a */
    public final void mo7369a(FastJsonResponse$Field fastJsonResponse$Field, String str, sio sio) {
        int i = fastJsonResponse$Field.f30319g;
        if (i == 3) {
            this.f108148c = (DeviceSignals) sio;
            this.f108146a.add(Integer.valueOf(i));
            return;
        }
        throw new IllegalArgumentException(String.format("Field with id=%d is not a known custom type. Found %s", Integer.valueOf(i), sio.getClass().getCanonicalName()));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo7395a(FastJsonResponse$Field fastJsonResponse$Field, String str, boolean z) {
        int i = fastJsonResponse$Field.f30319g;
        if (i == 9) {
            this.f108154i = z;
            this.f108146a.add(Integer.valueOf(i));
            return;
        }
        StringBuilder sb = new StringBuilder(55);
        sb.append("Field with id=");
        sb.append(i);
        sb.append(" is not known to be a boolean.");
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: a */
    public final void mo59155a(DeviceSignals deviceSignals) {
        this.f108148c = deviceSignals;
        this.f108146a.add(3);
    }

    /* renamed from: a */
    public final void mo59156a(boolean z) {
        this.f108154i = z;
        this.f108146a.add(9);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo7370a(FastJsonResponse$Field fastJsonResponse$Field) {
        return this.f108146a.contains(Integer.valueOf(fastJsonResponse$Field.f30319g));
    }
}
