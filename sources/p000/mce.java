package p000;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import android.provider.Settings;
import java.io.File;

/* renamed from: mce */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class mce {

    /* renamed from: a */
    public static final lvn f33399a = new lvn("MigrateUtil");

    /* renamed from: a */
    public static int m24855a(int i, boolean z) {
        if (!z) {
            return Math.min(i + 100, 149);
        }
        return Math.min(i + 50, 99);
    }

    /* renamed from: b */
    public static File m24859b(Context context, String str) {
        File file = new File(context.getFilesDir(), str);
        if (!file.isDirectory()) {
            try {
                if (!file.mkdirs()) {
                    throw new mcd("Cannot create temp dir");
                }
            } catch (SecurityException e) {
                throw new mcd("Cannot create temp dir", e);
            }
        }
        return file;
    }

    /* renamed from: c */
    public static void m24862c() {
        int i = Build.VERSION.SDK_INT;
        f33399a.mo25409a("Using O+ request backup api", new Object[0]);
    }

    /* renamed from: d */
    public static void m24864d() {
        int i = Build.VERSION.SDK_INT;
        f33399a.mo25409a("Using O+ select transport api", new Object[0]);
    }

    /* renamed from: a */
    public static File m24856a(Context context) {
        return m24859b(context, "migrate_dir");
    }

    /* renamed from: c */
    public static boolean m24863c(Context context) {
        int i;
        long j;
        lvr lvr = lvr.f33060a;
        synchronized (lvq.f33059b) {
            if (lvq.f33058a == -1) {
                try {
                    j = context.getPackageManager().getPackageInfo("com.google.android.gms.setup", 0).lastUpdateTime;
                } catch (PackageManager.NameNotFoundException e) {
                    j = 0;
                }
                lvq.f33058a = j;
            }
        }
        if (lvq.f33058a == Settings.Secure.getLong(context.getContentResolver(), String.format("%s_version", "usb_migration_state"), -1)) {
            i = Settings.Secure.getInt(context.getContentResolver(), "usb_migration_state", 0);
        } else {
            i = 0;
        }
        lvr.m24472a("usb_migration_state", i, lvr.f33063d);
        if (i == 1 || i == 2) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static File m24857a(Context context, String str) {
        return new File(m24856a(context), str);
    }

    /* renamed from: a */
    public static boolean m24858a() {
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            return "true".equals((String) cls.getDeclaredMethod("get", String.class).invoke(cls, "ro.mobile_ninjas.is_emulated"));
        } catch (ReflectiveOperationException e) {
            return false;
        }
    }

    /* renamed from: b */
    public static void m24860b(Context context) {
        try {
            File a = m24856a(context);
            f33399a.mo25409a("Clearing migrate temp dir: %s", a.getAbsolutePath());
            srj.m36120a(a);
        } catch (mcd e) {
            f33399a.mo25417e("Couldn't clear temp directory", e, new Object[0]);
        }
    }

    /* renamed from: b */
    public static boolean m24861b() {
        if (!m24858a()) {
            return cckw.f179263a.mo6606a().mo76215E();
        }
        return true;
    }
}
