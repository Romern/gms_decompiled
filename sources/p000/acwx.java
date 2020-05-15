package p000;

import android.app.UiModeManager;
import android.content.pm.PackageManager;

/* renamed from: acwx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class acwx {

    /* renamed from: a */
    static int f60990a;

    /* renamed from: b */
    static boolean f60991b;

    /* renamed from: c */
    private static final Object f60992c = new Object();

    /* renamed from: a */
    public static boolean m49915a() {
        Integer num;
        String str;
        String str2;
        String str3;
        int intValue = ((Integer) abzt.f58958bt.mo58455c()).intValue();
        synchronized (f60992c) {
            if (f60990a != intValue) {
                boolean z = true;
                if (intValue == 1) {
                    f60991b = false;
                } else if (intValue == 2) {
                    if (((UiModeManager) rpr.m34216b().getSystemService("uimode")).getCurrentModeType() != 4) {
                        z = false;
                    }
                    f60991b = z;
                } else if (intValue == 3) {
                    try {
                        rpr.m34216b().getPackageManager().getPackageInfo("com.google.android.katniss", 0);
                        f60991b = true;
                    } catch (PackageManager.NameNotFoundException e) {
                        f60991b = false;
                    }
                } else if (intValue != 4) {
                    try {
                        f60991b = false;
                    } catch (Exception e2) {
                        try {
                            f60991b = false;
                            absg.m48211g("Failure resolving TV device", new Object[0]);
                            try {
                                new abym(rpr.m34216b()).mo32453b(10005);
                            } catch (Exception e3) {
                                absg.m48211g("Failure logging TV device resolution error", new Object[0]);
                            }
                            f60990a = intValue;
                            str2 = "Using %s flags by method %d";
                            if (!f60991b) {
                                str = "regular";
                            } else {
                                str = "TV";
                            }
                            num = Integer.valueOf(f60990a);
                        } catch (Throwable th) {
                            f60990a = intValue;
                            if (!f60991b) {
                                str3 = "regular";
                            } else {
                                str3 = "TV";
                            }
                            absg.m48198c("Using %s flags by method %d", str3, Integer.valueOf(f60990a));
                            throw th;
                        }
                    }
                } else {
                    PackageManager packageManager = rpr.m34216b().getPackageManager();
                    if (!packageManager.hasSystemFeature("com.google.android.tv") && !packageManager.hasSystemFeature("android.hardware.type.television") && !packageManager.hasSystemFeature("android.software.leanback")) {
                        z = false;
                    }
                    f60991b = z;
                }
                f60990a = intValue;
                str2 = "Using %s flags by method %d";
                str = !f60991b ? "regular" : "TV";
                num = Integer.valueOf(f60990a);
                absg.m48198c(str2, str, num);
            }
        }
        return f60991b;
    }
}
