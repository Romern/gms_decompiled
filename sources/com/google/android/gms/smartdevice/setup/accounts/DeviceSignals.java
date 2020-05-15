package com.google.android.gms.smartdevice.setup.accounts;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.server.response.FastJsonResponse$Field;
import com.google.android.gms.smartdevice.utils.BinarySerializableFastSafeParcelableJson;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

@Deprecated
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class DeviceSignals extends BinarySerializableFastSafeParcelableJson {
    public static final Parcelable.Creator CREATOR = new aruh();

    /* renamed from: i */
    private static final HashMap f108136i;

    /* renamed from: a */
    final Set f108137a;

    /* renamed from: b */
    public String f108138b;

    /* renamed from: c */
    public String f108139c;

    /* renamed from: d */
    public String f108140d;

    /* renamed from: e */
    public String f108141e;

    /* renamed from: f */
    public String f108142f;

    /* renamed from: g */
    public String f108143g;

    /* renamed from: h */
    public UserPresence f108144h;

    static {
        HashMap hashMap = new HashMap();
        f108136i = hashMap;
        hashMap.put("deviceId", FastJsonResponse$Field.m22666f("deviceId", 2));
        f108136i.put("deviceName", FastJsonResponse$Field.m22666f("deviceName", 3));
        f108136i.put("deviceModel", FastJsonResponse$Field.m22666f("deviceModel", 4));
        f108136i.put("sdkVersion", FastJsonResponse$Field.m22666f("sdkVersion", 5));
        f108136i.put("googlePlayServicesVersion", FastJsonResponse$Field.m22666f("googlePlayServicesVersion", 6));
        f108136i.put("droidGuardResults", FastJsonResponse$Field.m22666f("droidGuardResults", 7));
        f108136i.put("userPresence", FastJsonResponse$Field.m22653a("userPresence", 8, UserPresence.class));
    }

    public DeviceSignals() {
        this.f108137a = new HashSet();
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Map mo7367a() {
        return f108136i;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final Object mo7371b(FastJsonResponse$Field fastJsonResponse$Field) {
        int i = fastJsonResponse$Field.f30319g;
        switch (i) {
            case 2:
                return this.f108138b;
            case 3:
                return this.f108139c;
            case 4:
                return this.f108140d;
            case 5:
                return this.f108141e;
            case 6:
                return this.f108142f;
            case 7:
                return this.f108143g;
            case 8:
                return this.f108144h;
            default:
                StringBuilder sb = new StringBuilder(37);
                sb.append("Unknown SafeParcelable id=");
                sb.append(i);
                throw new IllegalStateException(sb.toString());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo7376a(FastJsonResponse$Field fastJsonResponse$Field, String str, String str2) {
        int i = fastJsonResponse$Field.f30319g;
        switch (i) {
            case 2:
                this.f108138b = str2;
                break;
            case 3:
                this.f108139c = str2;
                break;
            case 4:
                this.f108140d = str2;
                break;
            case 5:
                this.f108141e = str2;
                break;
            case 6:
                this.f108142f = str2;
                break;
            case 7:
                this.f108143g = str2;
                break;
            default:
                throw new IllegalArgumentException(String.format("Field with id=%d is not known to be a string.", Integer.valueOf(i)));
        }
        this.f108137a.add(Integer.valueOf(i));
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
        Set set = this.f108137a;
        if (set.contains(2)) {
            see.m35046a(parcel, 2, this.f108138b, true);
        }
        if (set.contains(3)) {
            see.m35046a(parcel, 3, this.f108139c, true);
        }
        if (set.contains(4)) {
            see.m35046a(parcel, 4, this.f108140d, true);
        }
        if (set.contains(5)) {
            see.m35046a(parcel, 5, this.f108141e, true);
        }
        if (set.contains(6)) {
            see.m35046a(parcel, 6, this.f108142f, true);
        }
        if (set.contains(7)) {
            see.m35046a(parcel, 7, this.f108143g, true);
        }
        if (set.contains(8)) {
            see.m35040a(parcel, 8, this.f108144h, i, true);
        }
        see.m35062b(parcel, a);
    }

    public DeviceSignals(String str, String str2, String str3, String str4, String str5, String str6) {
        HashSet hashSet = new HashSet();
        this.f108137a = hashSet;
        this.f108138b = str;
        hashSet.add(2);
        this.f108139c = str2;
        this.f108137a.add(3);
        this.f108140d = str3;
        this.f108137a.add(4);
        this.f108141e = str4;
        this.f108137a.add(5);
        this.f108142f = str5;
        this.f108137a.add(6);
        this.f108143g = str6;
        this.f108137a.add(7);
        this.f108144h = null;
        this.f108137a.add(8);
    }

    /* renamed from: a */
    public final void mo7369a(FastJsonResponse$Field fastJsonResponse$Field, String str, sio sio) {
        int i = fastJsonResponse$Field.f30319g;
        if (i == 8) {
            this.f108144h = (UserPresence) sio;
            this.f108137a.add(Integer.valueOf(i));
            return;
        }
        throw new IllegalArgumentException(String.format("Field with id=%d is not a known custom type. Found %s", Integer.valueOf(i), sio.getClass().getCanonicalName()));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo7370a(FastJsonResponse$Field fastJsonResponse$Field) {
        return this.f108137a.contains(Integer.valueOf(fastJsonResponse$Field.f30319g));
    }

    public DeviceSignals(Set set, String str, String str2, String str3, String str4, String str5, String str6, UserPresence userPresence) {
        this.f108137a = set;
        this.f108138b = str;
        this.f108139c = str2;
        this.f108140d = str3;
        this.f108141e = str4;
        this.f108142f = str5;
        this.f108143g = str6;
        this.f108144h = userPresence;
    }
}
