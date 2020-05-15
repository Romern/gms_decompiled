package p000;

import android.os.Build;
import android.text.TextUtils;
import com.google.android.gms.contextmanager.internal.ContextManagerClientInfo;

/* renamed from: doy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class doy {
    /* renamed from: a */
    public static int m8995a(doh doh) {
        if (doh.mo9338b() || dwq.m9645B().mo9368a(doh)) {
            return 1;
        }
        new Object[1][0] = doh;
        return 2;
    }

    /* renamed from: b */
    public static int m8997b(doh doh) {
        if (!doh.mo9338b() && !dwq.m9645B().mo9368a(doh)) {
            new Object[1][0] = doh;
            if (!dwq.m9645B().mo9369b(doh)) {
                new Object[1][0] = doh;
                return 2;
            }
        }
        return 1;
    }

    /* renamed from: c */
    public static int m8998c(doh doh) {
        if (doh.mo9338b() || dwq.m9645B().mo9369b(doh)) {
            return 1;
        }
        new Object[1][0] = doh;
        return 2;
    }

    /* renamed from: a */
    public static int m8996a(String str, ContextManagerClientInfo contextManagerClientInfo, boolean z) {
        String str2;
        int i;
        String str3 = contextManagerClientInfo.f30678b;
        if (contextManagerClientInfo.mo18068c() && !TextUtils.isEmpty(contextManagerClientInfo.f30683g)) {
            str3 = contextManagerClientInfo.f30683g;
        }
        if ("android.permission.PACKAGE_USAGE_STATS".equals(str)) {
            return dwq.m9668l().f13719a.mo25962d("android:get_usage_stats", contextManagerClientInfo.f30679c, contextManagerClientInfo.f30678b) == 0 ? 1 : 2;
        }
        if (dwq.m9662f().getPackageManager().checkPermission(str, str3) != 0) {
            return 2;
        }
        doq l = dwq.m9668l();
        if (!str.equals("com.google.android.gms.permission.ACTIVITY_RECOGNITION")) {
            str2 = l.f13719a.mo25953a(str);
        } else {
            int i2 = Build.VERSION.SDK_INT;
            str2 = "android:activity_recognition";
        }
        if (str2 != null) {
            int i3 = contextManagerClientInfo.f30679c;
            String str4 = contextManagerClientInfo.f30678b;
            if (contextManagerClientInfo.mo18068c() && !TextUtils.isEmpty(contextManagerClientInfo.f30683g)) {
                i3 = contextManagerClientInfo.f30685i;
                str4 = contextManagerClientInfo.f30683g;
            }
            if (str2.equals("android:fine_location")) {
                int i4 = Build.VERSION.SDK_INT;
                if (cdij.m133502b()) {
                    i = !z ? l.f13719a.mo25963e(str2, i3, str4) : l.f13719a.mo25960c(str2, i3, str4);
                }
            }
            i = l.f13719a.mo25962d(str2, i3, str4);
        } else {
            i = 0;
        }
        if (i == 0) {
            return 1;
        }
        if (i != 4) {
            return 2;
        }
        return 6;
    }
}
