package p000;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.util.Log;

/* renamed from: amwo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class amwo {
    /* renamed from: a */
    private static int m63556a(PackageManager packageManager, ComponentName componentName) {
        try {
            int componentEnabledSetting = packageManager.getComponentEnabledSetting(componentName);
            if (componentEnabledSetting == 0) {
                try {
                    return !packageManager.getServiceInfo(componentName, 128).enabled ? 3 : 2;
                } catch (PackageManager.NameNotFoundException e) {
                    amdk.m62658a("FsaEntryPointSwitcher", "getServiceInfo failed for %s", componentName.getClassName());
                    return 3;
                }
            } else if (componentEnabledSetting != 1) {
                return componentEnabledSetting != 2 ? 1 : 3;
            } else {
                return 2;
            }
        } catch (IllegalArgumentException e2) {
            amdk.m62658a("FsaEntryPointSwitcher", "getComponentEnabledSetting failed for %s", componentName.getClassName());
            return 1;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x004e, code lost:
        return;
     */
    /* renamed from: a */
    public static synchronized void m63557a(Context context) {
        synchronized (amwo.class) {
            PackageManager packageManager = context.getPackageManager();
            ComponentName componentName = new ComponentName("com.google.android.gms", "com.google.android.gms.people.sync.focus.ContactsSyncAdapterService");
            ComponentName componentName2 = new ComponentName("com.google.android.syncadapters.contacts", "com.google.android.syncadapters.contacts.ContactsSyncAdapterService");
            int a = m63556a(packageManager, componentName);
            int a2 = m63556a(packageManager, componentName2);
            if (a == 1) {
                Log.w("FsaEntryPointSwitcher", "FSA2 new entry service doesn't exist.");
            } else if (a2 == 1) {
                Log.w("FsaEntryPointSwitcher", "FSA1 proxy package doesn't exist.");
                if (cfxi.f185925a.mo6606a().mo82906b()) {
                    Log.w("FsaEntryPointSwitcher", "Disabling GmsCore entry point.");
                    m63558a(packageManager, componentName, 2);
                }
            } else {
                if (!cfxi.f185925a.mo6606a().mo82905a()) {
                    if (!cgbt.m144707c()) {
                        Log.w("FsaEntryPointSwitcher", "FSA delegation disabled. Using FSA1. Will not enable sync service switcher.");
                        return;
                    }
                }
                if (!cfvk.f185780a.mo6606a().mo82915F()) {
                    m63558a(packageManager, componentName2, 0);
                    m63558a(packageManager, componentName, 2);
                } else if (m63558a(packageManager, componentName, 1)) {
                    m63558a(packageManager, componentName2, 2);
                }
                m63556a(packageManager, componentName2);
                m63556a(packageManager, componentName);
            }
        }
    }

    /* renamed from: a */
    private static boolean m63558a(PackageManager packageManager, ComponentName componentName, int i) {
        amdk.m62657a("FsaEntryPointSwitcher", "setting component enabled=%d for %s", Integer.valueOf(i), componentName.getClassName());
        try {
            packageManager.setComponentEnabledSetting(componentName, i, 1);
            Log.i("FsaEntryPointSwitcher", "Setting component enabled succeeds.");
            return true;
        } catch (IllegalArgumentException | SecurityException e) {
            Log.e("FsaEntryPointSwitcher", "SetComponentEnabledSetting failed for %s", e);
            return false;
        }
    }
}
