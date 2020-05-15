package com.google.android.gms.smartdevice.setup.accounts;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.server.response.FastJsonResponse$Field;
import com.google.android.gms.smartdevice.utils.BinarySerializableFastSafeParcelableJson;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class DeviceRiskSignals extends BinarySerializableFastSafeParcelableJson {
    public static final Parcelable.Creator CREATOR = new arug();

    /* renamed from: j */
    private static final HashMap f108126j;

    /* renamed from: a */
    final Set f108127a;

    /* renamed from: b */
    public int f108128b;

    /* renamed from: c */
    public long f108129c;

    /* renamed from: d */
    public String f108130d;

    /* renamed from: e */
    public String f108131e;

    /* renamed from: f */
    public long f108132f;

    /* renamed from: g */
    public long f108133g;

    /* renamed from: h */
    public ScreenlockState f108134h;

    /* renamed from: i */
    public StarguardData f108135i;

    static {
        HashMap hashMap = new HashMap();
        f108126j = hashMap;
        hashMap.put("deviceType", FastJsonResponse$Field.m22651a("deviceType", 2));
        f108126j.put("androidDeviceId", FastJsonResponse$Field.m22656b("androidDeviceId", 3));
        f108126j.put("deviceModel", FastJsonResponse$Field.m22666f("deviceModel", 4));
        f108126j.put("deviceManufacturer", FastJsonResponse$Field.m22666f("deviceManufacturer", 5));
        f108126j.put("osMajorVersionCode", FastJsonResponse$Field.m22656b("osMajorVersionCode", 6));
        f108126j.put("softwareMajorVersionCode", FastJsonResponse$Field.m22656b("softwareMajorVersionCode", 7));
        f108126j.put("screenlockState", FastJsonResponse$Field.m22653a("screenlockState", 8, ScreenlockState.class));
        f108126j.put("starguardData", FastJsonResponse$Field.m22653a("starguardData", 9, StarguardData.class));
    }

    public DeviceRiskSignals() {
        this.f108127a = new HashSet();
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Map mo7367a() {
        return f108126j;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final Object mo7371b(FastJsonResponse$Field fastJsonResponse$Field) {
        int i = fastJsonResponse$Field.f30319g;
        switch (i) {
            case 2:
                return Integer.valueOf(this.f108128b);
            case 3:
                return Long.valueOf(this.f108129c);
            case 4:
                return this.f108130d;
            case 5:
                return this.f108131e;
            case 6:
                return Long.valueOf(this.f108132f);
            case 7:
                return Long.valueOf(this.f108133g);
            case 8:
                return this.f108134h;
            case 9:
                return this.f108135i;
            default:
                StringBuilder sb = new StringBuilder(37);
                sb.append("Unknown SafeParcelable id=");
                sb.append(i);
                throw new IllegalStateException(sb.toString());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo7391a(FastJsonResponse$Field fastJsonResponse$Field, String str, int i) {
        int i2 = fastJsonResponse$Field.f30319g;
        if (i2 == 2) {
            this.f108128b = i;
            this.f108127a.add(Integer.valueOf(i2));
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
        Set set = this.f108127a;
        if (set.contains(2)) {
            see.m35063b(parcel, 2, this.f108128b);
        }
        if (set.contains(3)) {
            see.m35036a(parcel, 3, this.f108129c);
        }
        if (set.contains(4)) {
            see.m35046a(parcel, 4, this.f108130d, true);
        }
        if (set.contains(5)) {
            see.m35046a(parcel, 5, this.f108131e, true);
        }
        if (set.contains(6)) {
            see.m35036a(parcel, 6, this.f108132f);
        }
        if (set.contains(7)) {
            see.m35036a(parcel, 7, this.f108133g);
        }
        if (set.contains(8)) {
            see.m35040a(parcel, 8, this.f108134h, i, true);
        }
        if (set.contains(9)) {
            see.m35040a(parcel, 9, this.f108135i, i, true);
        }
        see.m35062b(parcel, a);
    }

    public DeviceRiskSignals(long j, String str, String str2, long j2, ScreenlockState screenlockState, StarguardData starguardData) {
        HashSet hashSet = new HashSet();
        this.f108127a = hashSet;
        this.f108128b = 1;
        hashSet.add(2);
        this.f108129c = j;
        this.f108127a.add(3);
        this.f108130d = str;
        this.f108127a.add(4);
        this.f108131e = str2;
        this.f108127a.add(5);
        this.f108132f = j2;
        this.f108127a.add(6);
        this.f108133g = 201515033;
        this.f108127a.add(7);
        this.f108134h = screenlockState;
        this.f108127a.add(8);
        this.f108135i = starguardData;
        this.f108127a.add(9);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo7394a(FastJsonResponse$Field fastJsonResponse$Field, String str, long j) {
        int i = fastJsonResponse$Field.f30319g;
        if (i == 3) {
            this.f108129c = j;
        } else if (i == 6) {
            this.f108132f = j;
        } else if (i == 7) {
            this.f108133g = j;
        } else {
            StringBuilder sb = new StringBuilder(53);
            sb.append("Field with id=");
            sb.append(i);
            sb.append(" is not known to be an long.");
            throw new IllegalArgumentException(sb.toString());
        }
        this.f108127a.add(Integer.valueOf(i));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo7376a(FastJsonResponse$Field fastJsonResponse$Field, String str, String str2) {
        int i = fastJsonResponse$Field.f30319g;
        if (i == 4) {
            this.f108130d = str2;
        } else if (i == 5) {
            this.f108131e = str2;
        } else {
            throw new IllegalArgumentException(String.format("Field with id=%d is not known to be a string.", Integer.valueOf(i)));
        }
        this.f108127a.add(Integer.valueOf(i));
    }

    /* renamed from: a */
    public final void mo7369a(FastJsonResponse$Field fastJsonResponse$Field, String str, sio sio) {
        int i = fastJsonResponse$Field.f30319g;
        if (i == 8) {
            this.f108134h = (ScreenlockState) sio;
        } else if (i == 9) {
            this.f108135i = (StarguardData) sio;
        } else {
            throw new IllegalArgumentException(String.format("Field with id=%d is not a known custom type. Found %s", Integer.valueOf(i), sio.getClass().getCanonicalName()));
        }
        this.f108127a.add(Integer.valueOf(i));
    }

    public DeviceRiskSignals(Set set, int i, long j, String str, String str2, long j2, long j3, ScreenlockState screenlockState, StarguardData starguardData) {
        this.f108127a = set;
        this.f108128b = i;
        this.f108129c = j;
        this.f108130d = str;
        this.f108131e = str2;
        this.f108132f = j2;
        this.f108133g = j3;
        this.f108134h = screenlockState;
        this.f108135i = starguardData;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo7370a(FastJsonResponse$Field fastJsonResponse$Field) {
        return this.f108127a.contains(Integer.valueOf(fastJsonResponse$Field.f30319g));
    }
}
