package p000;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import android.telephony.TelephonyManager;
import android.util.DisplayMetrics;
import com.felicanetworks.mfc.BuildConfig;

/* renamed from: asiy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class asiy {
    /* JADX WARNING: Removed duplicated region for block: B:163:0x0480  */
    /* JADX WARNING: Removed duplicated region for block: B:166:0x048f  */
    /* JADX WARNING: Removed duplicated region for block: B:170:0x0499  */
    /* JADX WARNING: Removed duplicated region for block: B:173:0x049f  */
    /* JADX WARNING: Removed duplicated region for block: B:176:0x04b5  */
    /* JADX WARNING: Removed duplicated region for block: B:179:0x04d8  */
    /* JADX WARNING: Removed duplicated region for block: B:182:0x04ea  */
    /* JADX WARNING: Removed duplicated region for block: B:185:0x04fc  */
    /* JADX WARNING: Removed duplicated region for block: B:188:0x0512  */
    /* renamed from: a */
    public static final btnn m74204a(Context context) {
        int i;
        int i2;
        boolean z;
        bxvd da;
        bxvd da2 = btnn.f149659h.mo74144da();
        bxvd da3 = btng.f149607j.mo74144da();
        String a = stm.m36299a(Build.BRAND);
        if (da3.f164950c) {
            da3.mo74035c();
            da3.f164950c = false;
        }
        a.getClass();
        ((btng) da3.f164949b).f149609a = a;
        String a2 = stm.m36299a(Build.DEVICE);
        if (da3.f164950c) {
            da3.mo74035c();
            da3.f164950c = false;
        }
        a2.getClass();
        ((btng) da3.f164949b).f149610b = a2;
        String a3 = stm.m36299a(Build.FINGERPRINT);
        if (da3.f164950c) {
            da3.mo74035c();
            da3.f164950c = false;
        }
        a3.getClass();
        ((btng) da3.f164949b).f149611c = a3;
        String a4 = stm.m36299a(Build.HARDWARE);
        if (da3.f164950c) {
            da3.mo74035c();
            da3.f164950c = false;
        }
        a4.getClass();
        ((btng) da3.f164949b).f149612d = a4;
        String a5 = stm.m36299a(Build.MANUFACTURER);
        if (da3.f164950c) {
            da3.mo74035c();
            da3.f164950c = false;
        }
        a5.getClass();
        ((btng) da3.f164949b).f149613e = a5;
        String a6 = stm.m36299a(Build.MODEL);
        if (da3.f164950c) {
            da3.mo74035c();
            da3.f164950c = false;
        }
        a6.getClass();
        ((btng) da3.f164949b).f149614f = a6;
        String a7 = stm.m36299a(Build.PRODUCT);
        if (da3.f164950c) {
            da3.mo74035c();
            da3.f164950c = false;
        }
        a7.getClass();
        ((btng) da3.f164949b).f149615g = a7;
        int i3 = 4;
        int i4 = !asjw.m74255a() ? 4 : 3;
        if (da3.f164950c) {
            da3.mo74035c();
            da3.f164950c = false;
        }
        ((btng) da3.f164949b).f149616h = i4 - 2;
        int i5 = Build.VERSION.SDK_INT;
        try {
            context.getPackageManager().getPackageInfo(BuildConfig.APPLICATION_ID, 512);
            i = 3;
        } catch (PackageManager.NameNotFoundException e) {
            i = 4;
        }
        if (da3.f164950c) {
            da3.mo74035c();
            da3.f164950c = false;
        }
        ((btng) da3.f164949b).f149617i = i - 2;
        btng btng = (btng) da3.mo74062i();
        if (da2.f164950c) {
            da2.mo74035c();
            da2.f164950c = false;
        }
        btng.getClass();
        ((btnn) da2.f164949b).f149661a = btng;
        TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
        bxvd da4 = btnk.f149635j.mo74144da();
        if (telephonyManager != null) {
            if (sfr.f44142a.mo25481a("android.permission.READ_PHONE_STATE") == 0) {
                String a8 = stm.m36299a(telephonyManager.getGroupIdLevel1());
                if (da4.f164950c) {
                    da4.mo74035c();
                    da4.f164950c = false;
                }
                a8.getClass();
                ((btnk) da4.f164949b).f149637a = a8;
            } else {
                if (da4.f164950c) {
                    da4.mo74035c();
                    da4.f164950c = false;
                }
                "NO_PERMISSION".getClass();
                ((btnk) da4.f164949b).f149637a = "NO_PERMISSION";
            }
        }
        String a9 = stm.m36299a(telephonyManager.getNetworkCountryIso());
        if (da4.f164950c) {
            da4.mo74035c();
            da4.f164950c = false;
        }
        a9.getClass();
        ((btnk) da4.f164949b).f149638b = a9;
        String a10 = stm.m36299a(telephonyManager.getNetworkOperator());
        if (da4.f164950c) {
            da4.mo74035c();
            da4.f164950c = false;
        }
        a10.getClass();
        ((btnk) da4.f164949b).f149639c = a10;
        String a11 = stm.m36299a(telephonyManager.getNetworkOperatorName());
        if (da4.f164950c) {
            da4.mo74035c();
            da4.f164950c = false;
        }
        a11.getClass();
        ((btnk) da4.f164949b).f149640d = a11;
        int networkType = telephonyManager.getNetworkType();
        if (da4.f164950c) {
            da4.mo74035c();
            da4.f164950c = false;
        }
        ((btnk) da4.f164949b).f149641e = networkType;
        int phoneType = telephonyManager.getPhoneType();
        if (da4.f164950c) {
            da4.mo74035c();
            da4.f164950c = false;
        }
        ((btnk) da4.f164949b).f149642f = phoneType;
        String a12 = stm.m36299a(telephonyManager.getSimCountryIso());
        if (da4.f164950c) {
            da4.mo74035c();
            da4.f164950c = false;
        }
        a12.getClass();
        ((btnk) da4.f164949b).f149643g = a12;
        String a13 = stm.m36299a(telephonyManager.getSimOperator());
        if (da4.f164950c) {
            da4.mo74035c();
            da4.f164950c = false;
        }
        a13.getClass();
        ((btnk) da4.f164949b).f149644h = a13;
        String a14 = stm.m36299a(telephonyManager.getSimOperatorName());
        if (da4.f164950c) {
            da4.mo74035c();
            da4.f164950c = false;
        }
        a14.getClass();
        ((btnk) da4.f164949b).f149645i = a14;
        btnk btnk = (btnk) da4.mo74062i();
        if (da2.f164950c) {
            da2.mo74035c();
            da2.f164950c = false;
        }
        btnk.getClass();
        ((btnn) da2.f164949b).f149662b = btnk;
        TelephonyManager telephonyManager2 = (TelephonyManager) context.getSystemService("phone");
        bxvd da5 = btnl.f149646e.mo74144da();
        if (telephonyManager2 != null) {
            if (sfr.f44142a.mo25481a("android.permission.READ_PHONE_STATE") == 0) {
                String a15 = stm.m36299a(telephonyManager2.getDeviceId());
                if (da5.f164950c) {
                    da5.mo74035c();
                    da5.f164950c = false;
                }
                a15.getClass();
                ((btnl) da5.f164949b).f149648a = a15;
                String a16 = stm.m36299a(telephonyManager2.getLine1Number());
                if (da5.f164950c) {
                    da5.mo74035c();
                    da5.f164950c = false;
                }
                a16.getClass();
                ((btnl) da5.f164949b).f149649b = a16;
                String a17 = stm.m36299a(telephonyManager2.getSimSerialNumber());
                if (da5.f164950c) {
                    da5.mo74035c();
                    da5.f164950c = false;
                }
                a17.getClass();
                ((btnl) da5.f164949b).f149650c = a17;
                String a18 = stm.m36299a(telephonyManager2.getSubscriberId());
                if (da5.f164950c) {
                    da5.mo74035c();
                    da5.f164950c = false;
                }
                a18.getClass();
                ((btnl) da5.f164949b).f149651d = a18;
            } else {
                if (da5.f164950c) {
                    da5.mo74035c();
                    da5.f164950c = false;
                }
                btnl btnl = (btnl) da5.f164949b;
                "NO_PERMISSION".getClass();
                btnl.f149648a = "NO_PERMISSION";
                "NO_PERMISSION".getClass();
                btnl.f149649b = "NO_PERMISSION";
                "NO_PERMISSION".getClass();
                btnl.f149650c = "NO_PERMISSION";
                "NO_PERMISSION".getClass();
                btnl.f149651d = "NO_PERMISSION";
            }
        }
        btnl btnl2 = (btnl) da5.mo74062i();
        if (da2.f164950c) {
            da2.mo74035c();
            da2.f164950c = false;
        }
        btnl2.getClass();
        ((btnn) da2.f164949b).f149663c = btnl2;
        bxvd da6 = btnh.f149618e.mo74144da();
        String a19 = stm.m36299a(aymk.m84258a(context.getContentResolver(), "client_id"));
        if (da6.f164950c) {
            da6.mo74035c();
            da6.f164950c = false;
        }
        a19.getClass();
        ((btnh) da6.f164949b).f149620a = a19;
        String a20 = stm.m36299a(aymk.m84258a(context.getContentResolver(), "search_client_id"));
        if (da6.f164950c) {
            da6.mo74035c();
            da6.f164950c = false;
        }
        a20.getClass();
        ((btnh) da6.f164949b).f149621b = a20;
        String a21 = stm.m36299a(aymk.m84258a(context.getContentResolver(), "market_client_id"));
        if (da6.f164950c) {
            da6.mo74035c();
            da6.f164950c = false;
        }
        a21.getClass();
        ((btnh) da6.f164949b).f149622c = a21;
        String a22 = stm.m36299a(aymk.m84258a(context.getContentResolver(), "wallet_client_id"));
        if (da6.f164950c) {
            da6.mo74035c();
            da6.f164950c = false;
        }
        a22.getClass();
        ((btnh) da6.f164949b).f149623d = a22;
        btnh btnh = (btnh) da6.mo74062i();
        if (da2.f164950c) {
            da2.mo74035c();
            da2.f164950c = false;
        }
        btnh.getClass();
        ((btnn) da2.f164949b).f149664d = btnh;
        bxvd da7 = btnm.f149652f.mo74144da();
        String a23 = stm.m36299a(Build.VERSION.RELEASE);
        if (da7.f164950c) {
            da7.mo74035c();
            da7.f164950c = false;
        }
        btnm btnm = (btnm) da7.f164949b;
        a23.getClass();
        btnm.f149654a = a23;
        "20.15.15 (120300-{{cl}})".getClass();
        btnm.f149655b = "20.15.15 (120300-{{cl}})";
        btnm.f149657d = 2;
        try {
            String a24 = stm.m36299a(spn.m35848a(context, "com.google.android.apps.walletnfcrel"));
            if (da7.f164950c) {
                da7.mo74035c();
                da7.f164950c = false;
            }
            a24.getClass();
            ((btnm) da7.f164949b).f149656c = a24;
        } catch (PackageManager.NameNotFoundException e2) {
        }
        try {
            String a25 = stm.m36299a(spn.m35848a(context, "com.google.android.apps.nbu.paisa.user"));
            if (da7.f164950c) {
                da7.mo74035c();
                da7.f164950c = false;
            }
            a25.getClass();
            ((btnm) da7.f164949b).f149658e = a25;
        } catch (PackageManager.NameNotFoundException e3) {
        }
        btnm btnm2 = (btnm) da7.mo74062i();
        if (da2.f164950c) {
            da2.mo74035c();
            da2.f164950c = false;
        }
        btnm2.getClass();
        ((btnn) da2.f164949b).f149665e = btnm2;
        atya a26 = atyb.m76543a(context);
        bxvd da8 = btni.f149624e.mo74144da();
        boolean g = asjk.m74233g(context);
        if (da8.f164950c) {
            da8.mo74035c();
            da8.f164950c = false;
        }
        ((btni) da8.f164949b).f149626a = g;
        if (a26 != null) {
            i2 = a26.mo50312a() ? 3 : 4;
        } else {
            i2 = 5;
        }
        if (da8.f164950c) {
            da8.mo74035c();
            da8.f164950c = false;
        }
        ((btni) da8.f164949b).f149627b = i2 - 2;
        if (a26 != null) {
            int i6 = Build.VERSION.SDK_INT;
            atyb atyb = (atyb) a26;
            if (atyb.f91106b.isSecureNfcSupported()) {
                int i7 = Build.VERSION.SDK_INT;
                if (atyb.f91106b.isSecureNfcEnabled()) {
                    i3 = 3;
                }
                if (da8.f164950c) {
                    da8.mo74035c();
                    da8.f164950c = false;
                }
                ((btni) da8.f164949b).f149628c = i3 - 2;
                if (a26 == null) {
                    z = a26.mo50314c();
                } else {
                    z = false;
                }
                if (da8.f164950c) {
                    da8.mo74035c();
                    da8.f164950c = false;
                }
                ((btni) da8.f164949b).f149629d = z;
                btni btni = (btni) da8.mo74062i();
                if (da2.f164950c) {
                    da2.mo74035c();
                    da2.f164950c = false;
                }
                btni.getClass();
                ((btnn) da2.f164949b).f149666f = btni;
                DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
                da = btnj.f149630d.mo74144da();
                int i8 = displayMetrics.heightPixels;
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                ((btnj) da.f164949b).f149633b = i8;
                int i9 = displayMetrics.widthPixels;
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                ((btnj) da.f164949b).f149632a = i9;
                int i10 = displayMetrics.densityDpi;
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                ((btnj) da.f164949b).f149634c = i10;
                btnj btnj = (btnj) da.mo74062i();
                if (da2.f164950c) {
                    da2.mo74035c();
                    da2.f164950c = false;
                }
                btnj.getClass();
                ((btnn) da2.f164949b).f149667g = btnj;
                return (btnn) da2.mo74062i();
            }
        }
        i3 = 5;
        if (da8.f164950c) {
        }
        ((btni) da8.f164949b).f149628c = i3 - 2;
        if (a26 == null) {
        }
        if (da8.f164950c) {
        }
        ((btni) da8.f164949b).f149629d = z;
        btni btni2 = (btni) da8.mo74062i();
        if (da2.f164950c) {
        }
        btni2.getClass();
        ((btnn) da2.f164949b).f149666f = btni2;
        DisplayMetrics displayMetrics2 = context.getResources().getDisplayMetrics();
        da = btnj.f149630d.mo74144da();
        int i82 = displayMetrics2.heightPixels;
        if (da.f164950c) {
        }
        ((btnj) da.f164949b).f149633b = i82;
        int i92 = displayMetrics2.widthPixels;
        if (da.f164950c) {
        }
        ((btnj) da.f164949b).f149632a = i92;
        int i102 = displayMetrics2.densityDpi;
        if (da.f164950c) {
        }
        ((btnj) da.f164949b).f149634c = i102;
        btnj btnj2 = (btnj) da.mo74062i();
        if (da2.f164950c) {
        }
        btnj2.getClass();
        ((btnn) da2.f164949b).f149667g = btnj2;
        return (btnn) da2.mo74062i();
    }
}
