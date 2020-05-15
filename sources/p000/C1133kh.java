package p000;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Process;
import java.io.File;
import java.util.concurrent.Executor;

/* renamed from: kh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class C1133kh {
    /* renamed from: a */
    public static int m17835a(Context context, String str) {
        if (str != null) {
            return context.checkPermission(str, Process.myPid(), Process.myUid());
        }
        throw new IllegalArgumentException("permission is null");
    }

    /* renamed from: b */
    public static int m17843b(Context context, int i) {
        int i2 = Build.VERSION.SDK_INT;
        return context.getColor(i);
    }

    /* renamed from: c */
    public static File m17845c(Context context) {
        int i = Build.VERSION.SDK_INT;
        return context.getNoBackupFilesDir();
    }

    /* renamed from: d */
    public static Executor m17846d(Context context) {
        int i = Build.VERSION.SDK_INT;
        return context.getMainExecutor();
    }

    /* renamed from: e */
    public static File[] m17847e(Context context) {
        int i = Build.VERSION.SDK_INT;
        return context.getExternalFilesDirs(null);
    }

    /* renamed from: b */
    public static File[] m17844b(Context context) {
        int i = Build.VERSION.SDK_INT;
        return context.getExternalCacheDirs();
    }

    /* renamed from: a */
    public static Drawable m17836a(Context context, int i) {
        int i2 = Build.VERSION.SDK_INT;
        return context.getDrawable(i);
    }

    /* renamed from: a */
    public static File m17837a(Context context) {
        int i = Build.VERSION.SDK_INT;
        return context.getDataDir();
    }

    /* renamed from: a */
    public static Object m17838a(Context context, Class cls) {
        int i = Build.VERSION.SDK_INT;
        return context.getSystemService(cls);
    }

    /* renamed from: a */
    public static void m17839a(Activity activity) {
        int i = Build.VERSION.SDK_INT;
        activity.finishAffinity();
    }

    /* renamed from: a */
    public static void m17840a(Activity activity, Intent intent, int i) {
        int i2 = Build.VERSION.SDK_INT;
        activity.startActivityForResult(intent, i, null);
    }

    /* renamed from: a */
    public static void m17841a(Activity activity, IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) {
        int i5 = Build.VERSION.SDK_INT;
        activity.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4, bundle);
    }

    /* renamed from: a */
    public static void m17842a(Activity activity, String[] strArr, int i) {
        int i2 = Build.VERSION.SDK_INT;
        if (activity instanceof C0997fr) {
            ((C0997fr) activity).mo11182a(i);
        }
        activity.requestPermissions(strArr, i);
    }
}
