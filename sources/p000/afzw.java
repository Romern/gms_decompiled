package p000;

import android.app.KeyguardManager;
import android.app.NotificationChannel;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.telephony.CellInfo;
import android.telephony.CellInfoCdma;
import android.telephony.CellInfoGsm;
import android.telephony.CellInfoLte;
import android.telephony.CellInfoWcdma;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;
import java.util.List;
import java.util.Locale;

/* renamed from: afzw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class afzw {
    /* renamed from: a */
    public static String m53776a() {
        int i = Build.VERSION.SDK_INT;
        return Build.getSerial();
    }

    /* renamed from: b */
    public static void m53779b(Context context) {
        int i = Build.VERSION.SDK_INT;
        sex.m35104a(context).mo25442a(new NotificationChannel("find_my_device", "Find My Device", 4));
    }

    /* renamed from: c */
    public static cajt m53780c(Context context) {
        NetworkInfo networkInfo;
        WifiManager wifiManager;
        String str;
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        String str2 = null;
        if (connectivityManager != null) {
            networkInfo = connectivityManager.getNetworkInfo(1);
        } else {
            networkInfo = null;
        }
        if (networkInfo != null && networkInfo.isConnected() && (wifiManager = (WifiManager) context.getSystemService("wifi")) != null && wifiManager.isWifiEnabled()) {
            WifiInfo connectionInfo = wifiManager.getConnectionInfo();
            if (connectionInfo != null) {
                str = connectionInfo.getSSID();
            } else {
                str = null;
            }
            if (!TextUtils.isEmpty(str) && !"<unknown ssid>".equals(str) && !str.toLowerCase(Locale.getDefault()).endsWith("_nomap")) {
                str2 = str;
            }
        }
        bxvd da = cajt.f174864g.mo74144da();
        int calculateSignalLevel = WifiManager.calculateSignalLevel(((WifiManager) context.getSystemService("wifi")).getConnectionInfo().getRssi(), 5);
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        cajt cajt = (cajt) da.f164949b;
        cajt.f174866a |= 16;
        cajt.f174869d = calculateSignalLevel;
        int i = Build.VERSION.SDK_INT;
        TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
        String networkOperatorName = telephonyManager.getNetworkOperatorName();
        if (!TextUtils.isEmpty(networkOperatorName)) {
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            cajt cajt2 = (cajt) da.f164949b;
            networkOperatorName.getClass();
            cajt2.f174866a |= 64;
            cajt2.f174871f = networkOperatorName;
        }
        try {
            List<CellInfo> allCellInfo = telephonyManager.getAllCellInfo();
            if (allCellInfo != null) {
                for (CellInfo cellInfo : allCellInfo) {
                    if (cellInfo instanceof CellInfoGsm) {
                        int level = ((CellInfoGsm) cellInfo).getCellSignalStrength().getLevel();
                        if (da.f164950c) {
                            da.mo74035c();
                            da.f164950c = false;
                        }
                        cajt cajt3 = (cajt) da.f164949b;
                        cajt3.f174866a |= 32;
                        cajt3.f174870e = level;
                    } else if (cellInfo instanceof CellInfoCdma) {
                        int level2 = ((CellInfoCdma) cellInfo).getCellSignalStrength().getLevel();
                        if (da.f164950c) {
                            da.mo74035c();
                            da.f164950c = false;
                        }
                        cajt cajt4 = (cajt) da.f164949b;
                        cajt4.f174866a |= 32;
                        cajt4.f174870e = level2;
                    } else if (cellInfo instanceof CellInfoLte) {
                        int level3 = ((CellInfoLte) cellInfo).getCellSignalStrength().getLevel();
                        if (da.f164950c) {
                            da.mo74035c();
                            da.f164950c = false;
                        }
                        cajt cajt5 = (cajt) da.f164949b;
                        cajt5.f174866a |= 32;
                        cajt5.f174870e = level3;
                    } else if (cellInfo instanceof CellInfoWcdma) {
                        int level4 = ((CellInfoWcdma) cellInfo).getCellSignalStrength().getLevel();
                        if (da.f164950c) {
                            da.mo74035c();
                            da.f164950c = false;
                        }
                        cajt cajt6 = (cajt) da.f164949b;
                        cajt6.f174866a |= 32;
                        cajt6.f174870e = level4;
                    }
                }
            }
        } catch (SecurityException e) {
            agac.m53792b("GmsCore does not have ACCESS_COARSE_LOCATION permission", new Object[0]);
        }
        if (str2 == null) {
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            cajt cajt7 = (cajt) da.f164949b;
            cajt7.f174866a |= 4;
            cajt7.f174867b = false;
        } else {
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            cajt cajt8 = (cajt) da.f164949b;
            int i2 = cajt8.f174866a | 4;
            cajt8.f174866a = i2;
            cajt8.f174867b = true;
            str2.getClass();
            cajt8.f174866a = i2 | 8;
            cajt8.f174868c = str2;
        }
        return (cajt) da.mo74062i();
    }

    /* renamed from: a */
    public static String m53777a(PackageManager packageManager, Intent intent) {
        List<ResolveInfo> queryIntentActivities = packageManager.queryIntentActivities(intent, AndroidInputTypeSignal.TYPE_TEXT_FLAG_AUTO_COMPLETE);
        if (!queryIntentActivities.isEmpty()) {
            return queryIntentActivities.get(0).activityInfo.packageName;
        }
        return null;
    }

    /* renamed from: a */
    public static boolean m53778a(Context context) {
        KeyguardManager keyguardManager = (KeyguardManager) context.getSystemService("keyguard");
        try {
            int i = Build.VERSION.SDK_INT;
            if (keyguardManager == null || !keyguardManager.isDeviceSecure()) {
                return false;
            }
            return true;
        } catch (NullPointerException e) {
            return false;
        }
    }
}
