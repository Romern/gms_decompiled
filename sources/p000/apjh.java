package p000;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.os.Build;
import android.util.Log;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* renamed from: apjh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class apjh {

    /* renamed from: a */
    static final ScheduledExecutorService f84534a = snp.m35703a(1, 10);

    /* renamed from: b */
    public static final /* synthetic */ int f84535b = 0;

    /* renamed from: a */
    public static void m70453a(Context context, aamh aamh) {
        ComponentName[] componentNameArr;
        boolean z;
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            context = applicationContext;
        }
        aajg.m21335a(context);
        int d = aajg.m21344d();
        int i = aamh.f28458b;
        if (d == i) {
            List<ResolveInfo> queryIntentServices = context.getPackageManager().queryIntentServices(new Intent("com.google.android.gms.gcm.ACTION_TASK_READY").setPackage(aamh.f28457a), 0);
            if (queryIntentServices == null || queryIntentServices.isEmpty()) {
                componentNameArr = null;
            } else {
                int size = queryIntentServices.size();
                ComponentName[] componentNameArr2 = new ComponentName[size];
                for (int i2 = 0; i2 < size; i2++) {
                    ResolveInfo resolveInfo = queryIntentServices.get(i2);
                    componentNameArr2[i2] = new ComponentName(resolveInfo.serviceInfo.packageName, resolveInfo.serviceInfo.name);
                }
                componentNameArr = componentNameArr2;
            }
            if (componentNameArr != null) {
                int i3 = Build.VERSION.SDK_INT;
                String str = aamh.f28457a;
                try {
                    PackageManager packageManager = context.getPackageManager();
                    z = packageManager == null || packageManager.getApplicationInfo(str, 0).targetSdkVersion >= 26;
                } catch (PackageManager.NameNotFoundException e) {
                    z = false;
                }
                for (ComponentName componentName : componentNameArr) {
                    try {
                        Intent component = new Intent("com.google.android.gms.gcm.ACTION_TASK_READY").setComponent(componentName);
                        if (z) {
                            apjg apjg = new apjg(context);
                            if (!skh.m35531a().mo25691a(context, "NetworkScheduler", component, apjg, apjc.m70442a())) {
                                String valueOf = String.valueOf(componentName);
                                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 18);
                                sb.append("Failed to bind to ");
                                sb.append(valueOf);
                                Log.e("NetworkScheduler.TID", sb.toString());
                                apjg.mo47343a();
                            } else {
                                ScheduledExecutorService scheduledExecutorService = f84534a;
                                apjg.getClass();
                                ((sny) scheduledExecutorService).schedule(new apjf(apjg), (long) ((int) cedr.m136294b()), TimeUnit.SECONDS);
                            }
                        } else if (!sqr.m36000c(context, componentName.getPackageName())) {
                            context.startService(new Intent("com.google.android.gms.gcm.SERVICE_ACTION_INITIALIZE").setComponent(componentName));
                        }
                    } catch (IllegalStateException | SecurityException e2) {
                        String valueOf2 = String.valueOf(e2);
                        StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 41);
                        sb2.append("Encountered exception sending broadcast: ");
                        sb2.append(valueOf2);
                        Log.e("NetworkScheduler.TID", sb2.toString());
                    }
                }
                return;
            }
            return;
        }
        aajg.m21336a(context, i, new Intent("com.google.android.gms.gcm.SERVICE_ACTION_INITIALIZE").putExtra("user_serial", aamh.f28458b).putExtra("package", aamh.f28457a).setClassName("com.google.android.gms", "com.google.android.gms.gcm.nts.SchedulerInternalReceiver"), "com.google.android.gms.permission.INTERNAL_BROADCAST", null, null);
    }
}
