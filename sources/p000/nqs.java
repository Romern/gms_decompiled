package p000;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Build;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* renamed from: nqs */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class nqs {

    /* renamed from: a */
    private static final List f36428a = Collections.unmodifiableList(Arrays.asList("com.google.android.projection.bumblebee", "com.google.android.projection.gearhead"));

    /* renamed from: a */
    public static String m27346a(Context context, boolean z) {
        if (m27347a(context.getPackageName())) {
            return context.getPackageName();
        }
        ComponentName resolveActivity = new Intent("android.intent.action.MAIN").addCategory("android.intent.category.CAR_DOCK").resolveActivity(context.getPackageManager());
        if (resolveActivity != null && f36428a.contains(resolveActivity.getPackageName())) {
            try {
                String packageName = resolveActivity.getPackageName();
                C1581nts.m27680a(context, packageName, z);
                return packageName;
            } catch (PackageManager.NameNotFoundException | SecurityException e) {
            }
        }
        ArrayList arrayList = null;
        for (String str : f36428a) {
            try {
                C1581nts.m27680a(context, str, z);
                return str;
            } catch (PackageManager.NameNotFoundException e2) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(e2);
            }
        }
        IllegalStateException illegalStateException = new IllegalStateException("Android Auto is not installed!");
        if (arrayList != null && !arrayList.isEmpty()) {
            int i = Build.VERSION.SDK_INT;
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                bqye.m113761a(illegalStateException, (Exception) arrayList.get(i2));
            }
        }
        throw illegalStateException;
    }

    /* renamed from: a */
    public static boolean m27347a(String str) {
        return f36428a.contains(str);
    }
}
