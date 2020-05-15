package com.google.android.ulr;

import com.google.android.gms.common.server.response.FastJsonResponse$Field;
import java.util.Map;
import java.util.TreeMap;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ApiDeviceSetting extends sip {

    /* renamed from: a */
    private static final TreeMap f151605a;

    static {
        TreeMap treeMap = new TreeMap();
        f151605a = treeMap;
        treeMap.put("batterySaverEnabled", FastJsonResponse$Field.m22663e("batterySaverEnabled"));
        f151605a.put("batterySaverThreshold", FastJsonResponse$Field.m22650a("batterySaverThreshold"));
        f151605a.put("isGeoSupported", FastJsonResponse$Field.m22663e("isGeoSupported"));
        f151605a.put("isLocationEnabled", FastJsonResponse$Field.m22663e("isLocationEnabled"));
        f151605a.put("isLocationEnabledForGoogleApp", FastJsonResponse$Field.m22663e("isLocationEnabledForGoogleApp"));
        f151605a.put("isRunningRestrictedProfile", FastJsonResponse$Field.m22663e("isRunningRestrictedProfile"));
        f151605a.put("isSupportedFormFactor", FastJsonResponse$Field.m22663e("isSupportedFormFactor"));
        f151605a.put("locationBleScanEnabled", FastJsonResponse$Field.m22663e("locationBleScanEnabled"));
        f151605a.put("locationMode", FastJsonResponse$Field.m22665f("locationMode"));
        f151605a.put("locationWifiScanEnabled", FastJsonResponse$Field.m22663e("locationWifiScanEnabled"));
    }

    public ApiDeviceSetting() {
    }

    /* renamed from: a */
    public final Map mo7367a() {
        return f151605a;
    }

    public ApiDeviceSetting(Boolean bool, Integer num, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, Boolean bool6, Boolean bool7, String str, Boolean bool8) {
        if (bool != null) {
            mo25605a("batterySaverEnabled", bool.booleanValue());
        }
        if (num != null) {
            mo25602a("batterySaverThreshold", num.intValue());
        }
        if (bool2 != null) {
            mo25605a("isGeoSupported", bool2.booleanValue());
        }
        mo25605a("isLocationEnabled", bool3.booleanValue());
        if (bool4 != null) {
            mo25605a("isLocationEnabledForGoogleApp", bool4.booleanValue());
        }
        if (bool5 != null) {
            mo25605a("isRunningRestrictedProfile", bool5.booleanValue());
        }
        if (bool6 != null) {
            mo25605a("isSupportedFormFactor", bool6.booleanValue());
        }
        if (bool7 != null) {
            mo25605a("locationBleScanEnabled", bool7.booleanValue());
        }
        if (str != null) {
            mo25604a("locationMode", str);
        }
        if (bool8 != null) {
            mo25605a("locationWifiScanEnabled", bool8.booleanValue());
        }
    }
}
