package p000;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import java.io.File;

/* renamed from: aaka */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aaka {

    /* renamed from: a */
    private static Boolean f28337a;

    /* renamed from: a */
    public static synchronized void m21375a(Context context, boolean z) {
        synchronized (aaka.class) {
            if (ceck.m135995e()) {
                context.createDeviceProtectedStorageContext().getSharedPreferences("gcm_direct_boot_data", 0).edit().putBoolean("deviceProtected", z).apply();
                f28337a = Boolean.valueOf(z);
            }
        }
    }

    /* renamed from: b */
    public static boolean m21377b(Context context) {
        aytw.m84814b();
        return aytw.m84815b(context) && ceck.m135995e();
    }

    /* renamed from: c */
    public static synchronized Context m21378c(Context context) {
        synchronized (aaka.class) {
            if (ceck.m135995e() && ceck.m135994d() && m21379d(context)) {
                context = context.createDeviceProtectedStorageContext();
            }
        }
        return context;
    }

    /* renamed from: d */
    public static synchronized boolean m21379d(Context context) {
        synchronized (aaka.class) {
            if (!ceck.m135995e()) {
                return false;
            }
            if (f28337a == null) {
                aytw.m84814b();
                f28337a = Boolean.valueOf(context.createDeviceProtectedStorageContext().getSharedPreferences("gcm_direct_boot_data", 0).getBoolean("deviceProtected", false));
            }
            boolean booleanValue = f28337a.booleanValue();
            return booleanValue;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00b1, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0133, code lost:
        return;
     */
    /* renamed from: e */
    static synchronized void m21380e(Context context) {
        synchronized (aaka.class) {
            if (ceck.m135995e()) {
                aytw.m84814b();
                if (aytw.m84815b(context)) {
                    boolean d = ceck.m135994d();
                    boolean d2 = m21379d(context);
                    if (!d) {
                        if (d2) {
                            aytw.m84814b();
                            if (ceck.m135995e()) {
                                SharedPreferences.Editor edit = aaoe.m21748d(context).edit();
                                edit.remove("gcm_local_directboot_token");
                                edit.apply();
                            }
                            if (m21377b(context)) {
                                File file = new File(context.createDeviceProtectedStorageContext().getFilesDir(), "gcm_connection_infos");
                                if (file.exists() && !file.renameTo(new File(context.getFilesDir(), "gcm_connection_infos"))) {
                                    Log.w("GCM", "HeartbeatChimeraAlarm data migration failed, data will be lost.");
                                }
                            }
                            if (m21377b(context)) {
                                File file2 = new File(context.createDeviceProtectedStorageContext().getFilesDir(), "fcm_package_info.ldb");
                                if (file2.exists() && !file2.renameTo(new File(context.getFilesDir(), "fcm_package_info.ldb"))) {
                                    Log.w("GCM", "PackageInfoStore data migration failed, data will be lost.");
                                }
                            }
                            if (m21377b(context)) {
                                context.createDeviceProtectedStorageContext().deleteDatabase("rmq.db");
                            }
                            m21375a(context, false);
                        }
                    } else if (!d2) {
                        aaoe.m21747c(context);
                        if (m21377b(context)) {
                            File file3 = new File(context.getFilesDir(), "gcm_connection_infos");
                            if (file3.exists() && !file3.renameTo(new File(context.createDeviceProtectedStorageContext().getFilesDir(), "gcm_connection_infos"))) {
                                Log.w("GCM", "HeartbeatChimeraAlarm data migration failed, data will be lost.");
                            }
                        }
                        if (m21377b(context)) {
                            File file4 = new File(context.getFilesDir(), "fcm_package_info.ldb");
                            if (file4.exists() && !file4.renameTo(new File(context.createDeviceProtectedStorageContext().getFilesDir(), "fcm_package_info.ldb"))) {
                                Log.w("GCM", "PackageInfoStore data migration failed, data will be lost.");
                            }
                        }
                        m21375a(context, true);
                    } else if (ceck.f182254a.mo6606a().mo78760e()) {
                        aaoe.m21747c(context);
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public static boolean m21376a(Context context) {
        if (!ceck.m135995e() || !ceck.m135994d() || !aaoe.m21746b(context) || !m21379d(context)) {
            return false;
        }
        return true;
    }
}
