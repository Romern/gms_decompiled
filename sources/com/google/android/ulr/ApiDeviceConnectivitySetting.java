package com.google.android.ulr;

import com.google.android.gms.common.server.response.FastJsonResponse$Field;
import java.util.Map;
import java.util.TreeMap;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ApiDeviceConnectivitySetting extends sip {

    /* renamed from: a */
    private static final TreeMap f151604a;

    static {
        TreeMap treeMap = new TreeMap();
        f151604a = treeMap;
        treeMap.put("airplaneModeEnabled", FastJsonResponse$Field.m22663e("airplaneModeEnabled"));
        f151604a.put("dozeMode", FastJsonResponse$Field.m22663e("dozeMode"));
        f151604a.put("wifiEnabled", FastJsonResponse$Field.m22663e("wifiEnabled"));
    }

    public ApiDeviceConnectivitySetting() {
    }

    /* renamed from: a */
    public final Map mo7367a() {
        return f151604a;
    }

    /* renamed from: b */
    public final Boolean mo71508b() {
        return (Boolean) this.f44540b.get("airplaneModeEnabled");
    }

    /* renamed from: c */
    public final Boolean mo71509c() {
        return (Boolean) this.f44540b.get("dozeMode");
    }

    /* renamed from: d */
    public final Boolean mo71510d() {
        return (Boolean) this.f44540b.get("wifiEnabled");
    }

    public ApiDeviceConnectivitySetting(Boolean bool, Boolean bool2, Boolean bool3) {
        if (bool != null) {
            mo25605a("airplaneModeEnabled", bool.booleanValue());
        }
        if (bool2 != null) {
            mo25605a("dozeMode", bool2.booleanValue());
        }
        if (bool3 != null) {
            mo25605a("wifiEnabled", bool3.booleanValue());
        }
    }
}
