package p000;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Binder;
import android.os.StrictMode;
import android.text.TextUtils;
import com.felicanetworks.sdu.ErrorInfo;

/* renamed from: buqy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class buqy {
    /* renamed from: a */
    public static bzau m120263a(Context context, bmxz bmxz) {
        int length;
        bzau bzau;
        if (Binder.getCallingUid() == 1000) {
            return bzau.BLUETOOTH_SETTINGS;
        }
        String[] packagesForUid = context.getPackageManager().getPackagesForUid(Binder.getCallingUid());
        if (packagesForUid != null && (length = packagesForUid.length) > 0) {
            StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
            StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitCustomSlowCalls().build());
            int i = 0;
            while (i < length) {
                try {
                    String str = packagesForUid[i];
                    if (!context.getPackageName().equals(str)) {
                        if (cfog.m141291s().equals(str)) {
                            if (bmxz.mo6527a(str)) {
                                bzau = bzau.GOOGLE_APPS;
                            }
                        }
                        i++;
                    } else {
                        bzau = bzau.GMS_SETTINGS;
                    }
                    return bzau;
                } finally {
                    StrictMode.setThreadPolicy(threadPolicy);
                }
            }
            StrictMode.setThreadPolicy(threadPolicy);
            bnsl bnsl = (bnsl) busr.f154819a.mo68388c();
            bnsl.mo68432a("buqy", "a", (int) ErrorInfo.TYPE_SDU_FAILED, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68409a("CommonUtils: uid:%d is not whitelisted and google signed", Binder.getCallingUid());
            return bzau.ENTRY_POINT_UNKNOWN;
        }
        bnsl bnsl2 = (bnsl) busr.f154819a.mo68388c();
        bnsl2.mo68432a("buqy", "a", 81, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        bnsl2.mo68409a("CommonUtils: can't find package for uid:%d", Binder.getCallingUid());
        return bzau.ENTRY_POINT_UNKNOWN;
    }

    /* renamed from: b */
    public static String m120266b(Context context, String str) {
        try {
            PackageManager packageManager = context.getPackageManager();
            PackageInfo packageInfo = packageManager.getPackageInfo(str, 0);
            if (packageInfo != null) {
                return packageManager.getApplicationLabel(packageInfo.applicationInfo).toString();
            }
            return null;
        } catch (PackageManager.NameNotFoundException e) {
            return null;
        }
    }

    /* renamed from: a */
    public static boolean m120264a(aiaa aiaa) {
        if ((aiaa.f68513a & Integer.MIN_VALUE) == 0) {
            return false;
        }
        byzb byzb = aiaa.f68511I;
        if (byzb == null) {
            byzb = byzb.f169045j;
        }
        if ((byzb.f169047a & 4) != 0) {
            bzaa bzaa = byzb.f169050d;
            if (bzaa == null) {
                bzaa = bzaa.f169202d;
            }
            if (!bzaa.f169204a.isEmpty()) {
                bzaa bzaa2 = byzb.f169050d;
                if (bzaa2 == null) {
                    bzaa2 = bzaa.f169202d;
                }
                if (!bzaa2.f169205b.isEmpty()) {
                    bzaa bzaa3 = byzb.f169050d;
                    if (bzaa3 == null) {
                        bzaa3 = bzaa.f169202d;
                    }
                    if (!bzaa3.f169206c.isEmpty()) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* renamed from: a */
    public static boolean m120265a(Context context, String str) {
        return !TextUtils.isEmpty(m120266b(context, str));
    }
}
