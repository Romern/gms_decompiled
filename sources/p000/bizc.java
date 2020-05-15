package p000;

import android.content.Intent;
import android.os.Build;
import java.util.Arrays;

/* renamed from: bizc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bizc {
    /* renamed from: a */
    public static void m103024a(Intent intent, Intent intent2) {
        intent2.putExtra("wizardBundle", intent.getBundleExtra("wizardBundle"));
        for (String str : Arrays.asList("firstRun", "deferredSetup", "preDeferredSetup", "isSetupFlow")) {
            intent2.putExtra(str, intent.getBooleanExtra(str, false));
        }
        for (String str2 : Arrays.asList("theme", "scriptUri", "actionId")) {
            intent2.putExtra(str2, intent.getStringExtra(str2));
        }
    }

    /* renamed from: b */
    public static boolean m103026b(Intent intent) {
        if (intent == null) {
            return false;
        }
        int i = Build.VERSION.SDK_INT;
        return intent.getBooleanExtra("isSetupFlow", false);
    }

    /* renamed from: a */
    public static boolean m103025a(Intent intent) {
        return intent.getBooleanExtra("firstRun", false);
    }
}
