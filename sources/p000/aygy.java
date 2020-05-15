package p000;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.os.Process;
import android.os.UserHandle;
import android.os.UserManager;
import android.util.Log;
import com.felicanetworks.sdu.ErrorInfo;
import com.google.android.chimera.config.ModuleManager;

/* renamed from: aygy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aygy {

    /* renamed from: a */
    private static volatile aygy f97555a;

    /* renamed from: b */
    private static final bnic f97556b = bnic.m109491a("com.google.android.wearable.app", "com.google.glass.companion", "com.google.glass.app");

    private aygy() {
    }

    /* renamed from: a */
    public static void m83985a() {
        if (f97555a == null) {
            synchronized (aygy.class) {
                if (f97555a == null) {
                    f97555a = new aygy();
                }
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x005e  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0060  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0065  */
    /* renamed from: b */
    public static final boolean m83989b(Context context) {
        long serialNumberForUser;
        int i = Build.VERSION.SDK_INT;
        boolean z = false;
        if (chnj.f188812a.mo6606a().mo85406ae() || context.getPackageName().equals("com.google.android.wearable.app.cn")) {
            int i2 = Build.VERSION.SDK_INT;
            UserHandle myUserHandle = Process.myUserHandle();
            UserManager userManager = (UserManager) context.getSystemService("user");
            serialNumberForUser = userManager.getSerialNumberForUser(myUserHandle);
            int size = userManager.getUserProfiles().size();
            if (serialNumberForUser != 0) {
                z = true;
            } else if (size == 1) {
                z = true;
            }
            if (!z) {
                String valueOf = String.valueOf(myUserHandle);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + ErrorInfo.TYPE_SDU_FAILED);
                sb.append("Wear is not running on the primary user profile. handle=");
                sb.append(valueOf);
                sb.append(", serial=");
                sb.append(serialNumberForUser);
                sb.append(", count=");
                sb.append(size);
                Log.i("Wear_Controller", sb.toString());
            }
            return z;
        }
        bnrd a = f97556b.iterator();
        while (a.hasNext()) {
            if (m83990b(context, (String) a.next())) {
                int i22 = Build.VERSION.SDK_INT;
                UserHandle myUserHandle2 = Process.myUserHandle();
                UserManager userManager2 = (UserManager) context.getSystemService("user");
                serialNumberForUser = userManager2.getSerialNumberForUser(myUserHandle2);
                int size2 = userManager2.getUserProfiles().size();
                if (serialNumberForUser != 0) {
                }
                if (!z) {
                }
                return z;
            }
        }
        Log.i("Wear_Controller", "Wear requires a companion app to be installed.");
        return false;
    }

    /* renamed from: a */
    public static final void m83986a(Context context) {
        if (chnd.f188805a.mo6606a().mo85370a()) {
            ModuleManager.FeatureRequest featureRequest = new ModuleManager.FeatureRequest();
            featureRequest.setUrgent(new aygx());
            featureRequest.requestFeatureAtLatestVersion("wearable_services");
            if (!ModuleManager.get(context).requestFeatures(featureRequest)) {
                Log.w("Wear_Controller", "loadWearableServices: feature request failed.");
            } else if (Log.isLoggable("Wear_Controller", 3)) {
                Log.d("Wear_Controller", "loadWearableServices: feature request succeeded.");
            }
        } else if (Log.isLoggable("Wear_Controller", 3)) {
            Log.d("Wear_Controller", "loadWearableServices: the wearable optional module is not enabled.");
        }
    }

    /* renamed from: a */
    public static final void m83987a(Context context, String str, String str2) {
        Intent intent = new Intent(str);
        intent.setClassName(context, "com.google.android.gms.wearable.service.WearableControlService");
        intent.setData(Uri.parse(str2.length() == 0 ? new String("package:") : "package:".concat(str2)));
        context.startService(intent);
    }

    /* renamed from: b */
    private static final boolean m83990b(Context context, String str) {
        try {
            context.getPackageManager().getPackageInfo(str, 128);
            return true;
        } catch (PackageManager.NameNotFoundException e) {
            return false;
        }
    }

    /* renamed from: a */
    public static final boolean m83988a(Context context, String str) {
        if (!f97556b.contains(str)) {
            return false;
        }
        bnrd a = f97556b.iterator();
        while (a.hasNext()) {
            String str2 = (String) a.next();
            if (!str2.equals(str) && m83990b(context, str2)) {
                return false;
            }
        }
        return true;
    }
}
