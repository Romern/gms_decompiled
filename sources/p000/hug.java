package p000;

import android.accounts.Account;
import android.accounts.AuthenticatorException;
import android.accounts.OperationCanceledException;
import android.app.ActivityManager;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import com.google.android.chimera.config.InvalidConfigException;
import com.google.android.chimera.config.ModuleManager;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

/* renamed from: hug */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class hug {

    /* renamed from: a */
    public static final sbw f20436a = new sbw("AuthEarlyUpdate", "[EUActionHelper]");

    /* renamed from: f */
    private static WeakReference f20437f = new WeakReference(null);

    /* renamed from: b */
    public final ModuleManager f20438b;

    /* renamed from: c */
    public final ActivityManager f20439c;

    /* renamed from: d */
    private final adyd f20440d;

    /* renamed from: e */
    private final PackageManager f20441e;

    public hug(Context context) {
        ModuleManager moduleManager = ModuleManager.get(context);
        PackageManager packageManager = context.getPackageManager();
        adyd a = adyd.m51363a(context);
        sdo.m34959a(context);
        this.f20438b = moduleManager;
        this.f20441e = packageManager;
        this.f20440d = a;
        this.f20439c = (ActivityManager) context.getSystemService("activity");
    }

    /* renamed from: a */
    public static long m14869a(long j) {
        return (j == -1 || j <= 0) ? ccdm.m129312f() : j;
    }

    /* renamed from: c */
    static final ModuleManager.FeatureRequest m14871c() {
        return new ModuleManager.FeatureRequest();
    }

    /* renamed from: b */
    public final boolean mo12727b() {
        return mo12728d() == 2;
    }

    /* renamed from: d */
    public final int mo12728d() {
        Collection collection;
        ModuleManager.ModuleInfo moduleInfo;
        f20436a.mo25371b("Performing isSidecarUpdated()");
        String c = ccdm.m129309c();
        PackageInfo packageInfo = null;
        try {
            collection = this.f20438b.getAllModules();
        } catch (InvalidConfigException e) {
            f20436a.mo25371b("InvalidConfigException while trying to get all modules from module manager!");
            collection = null;
        }
        if (collection != null) {
            Iterator it = collection.iterator();
            while (true) {
                if (!it.hasNext()) {
                    sbw sbw = f20436a;
                    StringBuilder sb = new StringBuilder(String.valueOf(c).length() + 47);
                    sb.append("ModuleId: ");
                    sb.append(c);
                    sb.append(" is not found in the list of modules.");
                    sbw.mo25372b("AuthEarlyUpdate", sb.toString());
                    moduleInfo = null;
                    break;
                }
                moduleInfo = (ModuleManager.ModuleInfo) it.next();
                if (c.equals(moduleInfo.moduleId)) {
                    break;
                }
            }
        } else {
            f20436a.mo25372b("AuthEarlyUpdate", "Was not able to fetch list of modules or list is emptry!");
            moduleInfo = null;
        }
        if (moduleInfo != null) {
            f20436a.mo25371b("Performing isModuleLoadedFromContainer()");
            if (!"com.google.android.gms".equals(moduleInfo.moduleApk.apkPackageName)) {
                boolean z = false;
                try {
                    packageInfo = this.f20441e.getPackageInfo(ccdm.m129311e(), 0);
                } catch (PackageManager.NameNotFoundException e2) {
                }
                if (packageInfo == null || (packageInfo.applicationInfo.flags & 128) == 0) {
                    try {
                        for (ModuleManager.ModuleSetInfo moduleSetInfo : this.f20438b.getCurrentConfig().moduleSets) {
                            try {
                                for (String str : ((bojy) GeneratedMessageLite.m124014a(bojy.f133367g, moduleSetInfo.getProtoBytes())).f133374f) {
                                    if ("auth_suw".equals(str)) {
                                        sbw sbw2 = f20436a;
                                        String str2 = moduleSetInfo.moduleSetId;
                                        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 47 + String.valueOf(str2).length());
                                        sb2.append("Feature ");
                                        sb2.append(str);
                                        sb2.append(" is successfully enabled on module set ");
                                        sb2.append(str2);
                                        sbw2.mo25371b(sb2.toString());
                                        return 2;
                                    }
                                }
                                continue;
                            } catch (bxwf e3) {
                                sbw sbw3 = f20436a;
                                String str3 = moduleSetInfo.moduleSetId;
                                StringBuilder sb3 = new StringBuilder(String.valueOf(str3).length() + 33);
                                sb3.append("Can't parse module set ");
                                sb3.append(str3);
                                sb3.append("; ignoring");
                                sbw3.mo25372b("AuthEarlyUpdate", sb3.toString());
                                z = true;
                            }
                        }
                        f20436a.mo25371b("Sidecar has not been updated and feature auth_suw was not successfully enabled");
                        return !z ? 9 : 6;
                    } catch (InvalidConfigException e4) {
                        sbw sbw4 = f20436a;
                        String valueOf = String.valueOf(e4);
                        StringBuilder sb4 = new StringBuilder(String.valueOf(valueOf).length() + 29);
                        sb4.append("Failed to get module config: ");
                        sb4.append(valueOf);
                        sbw4.mo25372b("AuthEarlyUpdate", sb4.toString());
                        return 7;
                    }
                } else {
                    f20436a.mo25371b("Found flag which says Sidecar Apk is updated");
                    return 2;
                }
            } else {
                f20436a.mo25371b("Module from SidecarAps is loaded from container!");
                f20436a.mo25372b("AuthEarlyUpdate", "Critical G.moduleInSidecar is loaded from container.");
                return 8;
            }
        } else {
            f20436a.mo25372b("AuthEarlyUpdate", "Critical G.moduleInSidecar is not found in list of modules!");
            return 3;
        }
    }

    /* renamed from: a */
    static synchronized hug m14870a(Context context) {
        hug hug;
        synchronized (hug.class) {
            hug = (hug) f20437f.get();
            if (hug == null) {
                hug = new hug(context);
                f20437f = new WeakReference(hug);
            }
        }
        return hug;
    }

    /* renamed from: a */
    public final void mo12726a() {
        f20436a.mo25371b("Performing removeGoogleAccounts()");
        ArrayList<Account> arrayList = new ArrayList(Arrays.asList(this.f20440d.mo33916a("com.google")));
        Collections.addAll(arrayList, this.f20440d.mo33916a("com.google.work"));
        try {
            for (Account account : arrayList) {
                int i = Build.VERSION.SDK_INT;
                this.f20440d.mo33925d(account);
            }
        } catch (AuthenticatorException | OperationCanceledException | IOException e) {
            f20436a.mo25378c("AuthEarlyUpdate", "Exception removing account.", e);
        }
    }
}
