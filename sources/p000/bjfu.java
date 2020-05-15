package p000;

import android.content.Intent;
import com.google.android.wallet.bender3.framework.client.WidgetConfig;

/* renamed from: bjfu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bjfu {
    /* renamed from: a */
    public static int m103320a(bjfd bjfd) {
        return bjfd.f122613a.getIntExtra("resultCode", -1);
    }

    /* renamed from: b */
    public static C1245ok m103322b(bjfd bjfd) {
        C1245ok okVar = new C1245ok();
        if (m103320a(bjfd) == -1) {
            String[] stringArrayExtra = bjfd.f122613a.getStringArrayExtra("permissionsRequested");
            int[] intArrayExtra = bjfd.f122613a.getIntArrayExtra("requestedPermissionsGrantResults");
            if (!(stringArrayExtra == null || intArrayExtra == null)) {
                int length = intArrayExtra.length;
                for (int i = 0; i < length; i++) {
                    okVar.put(stringArrayExtra[i], Integer.valueOf(intArrayExtra[i]));
                }
            }
        }
        return okVar;
    }

    /* renamed from: a */
    public static bjfc m103321a(WidgetConfig widgetConfig, String... strArr) {
        Intent a = bjfc.m103290a("RequestPermissionsAction", widgetConfig);
        a.putExtra("permissionsRequested", strArr);
        return new bjfc(a);
    }
}
