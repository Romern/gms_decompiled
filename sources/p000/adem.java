package p000;

import android.content.pm.PackageManager;

/* renamed from: adem */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class adem {

    /* renamed from: a */
    public static final adfs f61499a = new adfs("DevManagerStatus");

    /* renamed from: b */
    public static Boolean f61500b = null;

    /* renamed from: c */
    public static final Object f61501c = new Object();

    /* renamed from: d */
    private final PackageManager f61502d;

    public adem(PackageManager packageManager) {
        this.f61502d = packageManager;
        m50267a(packageManager);
    }

    /* renamed from: a */
    private static boolean m50267a(PackageManager packageManager) {
        synchronized (f61501c) {
            if (f61500b != null) {
                boolean booleanValue = f61500b.booleanValue();
                return booleanValue;
            }
            try {
                packageManager.getPackageInfo("com.google.android.instantapps.devman", 0);
                f61500b = true;
            } catch (PackageManager.NameNotFoundException e) {
                f61500b = false;
            }
            boolean booleanValue2 = f61500b.booleanValue();
            return booleanValue2;
        }
    }

    /* renamed from: a */
    public final boolean mo33394a() {
        return m50267a(this.f61502d);
    }
}
