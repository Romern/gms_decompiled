package com.felicanetworks.cmnctrl.net;

import android.os.Build;
import com.felicanetworks.cmnctrl.packages.PackageAccess;
import com.felicanetworks.cmnlib.AppContext;
import com.felicanetworks.cmnlib.p005sg.SgMgr;
import com.felicanetworks.cmnlib.util.CommonUtil;
import com.felicanetworks.sdu.SystemDividingUtility;
import java.util.Locale;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class NetworkUtil {
    public static void setUserAgent(AppContext appContext, String str) {
        try {
            String libraryVersion = SystemDividingUtility.getLibraryVersion();
            String intToHexString = CommonUtil.intToHexString(new PackageAccess(appContext).getAppVersionInfo().version, 8);
            String str2 = Build.VERSION.RELEASE;
            String str3 = (String) appContext.sgMgr.getSgValue(SgMgr.KEY_MFC_ISSUER_CODE);
            String str4 = Build.MODEL;
            if (str4.length() > 30) {
                str4 = str4.substring(0, 30);
            }
            appContext.userAgent = String.format(Locale.US, "%s/%sVC%s (Android %s; %s; %s)", str, libraryVersion, intToHexString, str2, str3, str4);
        } catch (Exception e) {
            throw new NetworkAccessException("User agent generation failure", e);
        }
    }
}
