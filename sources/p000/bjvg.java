package p000;

import android.os.Bundle;
import android.text.TextUtils;

/* renamed from: bjvg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bjvg {
    /* renamed from: a */
    public static bmav m104690a(Bundle bundle) {
        String string;
        bxvd da = bmav.f128500h.mo74144da();
        int a = bmau.m107847a(bundle.getInt("ErrorUtils.KEY_TYPE"));
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bmav bmav = (bmav) da.f164949b;
        if (a != 0) {
            bmav.f128504c = a;
            bmav.f128502a |= 8;
            String str = ((bmnr) bjvp.m104730a(bundle, "ErrorUtils.KEY_ERROR_INFO_MESSAGE", (bxxk) bmnr.f130153o.mo74142c(7))).f130159e;
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bmav bmav2 = (bmav) da.f164949b;
            str.getClass();
            bmav2.f128502a |= 1;
            bmav2.f128503b = str;
            if (bundle.containsKey("ErrorUtils.KEY_ERROR_CODE") && (string = bundle.getString("ErrorUtils.KEY_ERROR_CODE")) != null) {
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                bmav bmav3 = (bmav) da.f164949b;
                string.getClass();
                bmav3.f128502a |= 16;
                bmav3.f128506e = string;
            }
            return (bmav) da.mo74062i();
        }
        throw null;
    }

    /* renamed from: a */
    public static void m104691a(Bundle bundle, int i, String str, String str2, bxvd bxvd, String str3, String str4) {
        if (TextUtils.isEmpty(str) || ((TextUtils.isEmpty(str2) && bxvd == null) || TextUtils.isEmpty(str4))) {
            Object[] objArr = new Object[4];
            objArr[0] = str;
            objArr[1] = str2;
            objArr[2] = bxvd != null ? ((bmnr) bxvd.f164949b).f130159e : null;
            objArr[3] = str4;
            throw new IllegalArgumentException(String.format("Error title, message, and button text are required. Received values: title: %s  errorMessage: %s  infoMessage: %s  buttonText: %s", objArr));
        } else if (!TextUtils.isEmpty(str2) && bxvd != null) {
            throw new IllegalArgumentException(String.format("Error message and InfoMessage may not both be set. Received values: message: %s infoMessage: %s", str2, ((bmnr) bxvd.f164949b).f130159e));
        } else {
            bundle.putInt("ErrorUtils.KEY_TYPE", i);
            bundle.putString("ErrorUtils.KEY_TITLE", str);
            if (bxvd == null) {
                bxvd = bmnr.f130153o.mo74144da();
                if (bxvd.f164950c) {
                    bxvd.mo74035c();
                    bxvd.f164950c = false;
                }
                bmnr bmnr = (bmnr) bxvd.f164949b;
                str2.getClass();
                bmnr.f130155a |= 4;
                bmnr.f130159e = str2;
            }
            bjvp.m104736a(bundle, "ErrorUtils.KEY_ERROR_INFO_MESSAGE", bxvd.mo74062i());
            if (!TextUtils.isEmpty(str3)) {
                bundle.putString("ErrorUtils.KEY_ERROR_CODE", str3);
            }
            bundle.putString("ErrorUtils.KEY_ERROR_BUTTON_TEXT", str4);
        }
    }
}
