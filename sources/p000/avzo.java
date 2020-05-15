package p000;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.vision.service.operation.DownloadDependencyOperation;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Locale;
import java.util.Set;
import java.util.TreeSet;

/* renamed from: avzo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class avzo {
    /* renamed from: a */
    public static SharedPreferences m79547a(Context context) {
        return context.getSharedPreferences("VisionDownload", 0);
    }

    /* renamed from: b */
    public static Set m79551b(Context context) {
        SharedPreferences a = m79547a(context);
        Set emptySet = Collections.emptySet();
        try {
            return a.getStringSet("DEPS2", Collections.emptySet());
        } catch (ClassCastException e) {
            avxz.m79525a("Found legacy VisionDownload.xml; clearing old preferences.", new Object[0]);
            a.edit().clear().apply();
            return emptySet;
        }
    }

    /* renamed from: a */
    public static void m79548a(Context context, String str, boolean z) {
        if (!str.isEmpty()) {
            String[] split = str.split(",");
            for (int i = 0; i < split.length; i++) {
                if (!split[i].isEmpty()) {
                    split[i] = split[i].toLowerCase(Locale.ROOT);
                }
            }
            TreeSet treeSet = new TreeSet();
            Collections.addAll(treeSet, split);
            m79550a(context, treeSet, z);
        }
    }

    /* renamed from: a */
    public static void m79549a(Context context, ArrayList arrayList, boolean z, boolean z2, int i) {
        Intent startIntent = IntentOperation.getStartIntent(context, DownloadDependencyOperation.class, "com.google.android.gms.vision.service.DOWNLOAD");
        if (startIntent == null) {
            startIntent = new Intent("com.google.android.gms.vision.service.DOWNLOAD");
            avxz.m79525a("Unable to find intent operation to initiate download.", new Object[0]);
        }
        startIntent.putExtra("ttl", i);
        startIntent.putStringArrayListExtra("deps", arrayList);
        startIntent.putExtra("prefetch", z);
        startIntent.putExtra("isDownloadInProgress", z2);
        try {
            context.startService(startIntent);
        } catch (SecurityException e) {
            avxz.m79526a(e, "Operation not allowed.", new Object[0]);
        }
    }

    /* renamed from: a */
    public static void m79550a(Context context, Set set, boolean z) {
        if (!set.isEmpty()) {
            m79549a(context, new ArrayList(set), z, false, 30);
        }
    }
}
