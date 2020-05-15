package p000;

import android.app.ActivityManager;
import android.app.usage.UsageEvents;
import android.app.usage.UsageStatsManager;
import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.TreeSet;

/* renamed from: acxm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class acxm {

    /* renamed from: a */
    private static final List f61037a = Arrays.asList("android", "com.android.systemui", "com.android.vending", "com.android.settings");

    /* renamed from: a */
    public static List m49954a(Context context, long j) {
        ArrayList arrayList = new ArrayList();
        int intValue = ((Long) abzt.f58876aQ.mo58455c()).intValue();
        if (intValue <= 0) {
            return arrayList;
        }
        int i = Build.VERSION.SDK_INT;
        int i2 = Build.VERSION.SDK_INT;
        ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
        UsageEvents queryEvents = ((UsageStatsManager) context.getSystemService("usagestats")).queryEvents(j - ((Long) abzt.f58877aR.mo58455c()).longValue(), j);
        UsageEvents.Event event = new UsageEvents.Event();
        TreeSet<String> treeSet = new TreeSet();
        while (queryEvents.hasNextEvent() && treeSet.size() <= intValue) {
            queryEvents.getNextEvent(event);
            String packageName = event.getPackageName();
            if (!TextUtils.isEmpty(packageName) && !f61037a.contains(packageName)) {
                treeSet.add(event.getPackageName());
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (String str : treeSet) {
            if (activityManager.getPackageImportance(str) <= 200) {
                arrayList2.add(str);
            }
        }
        arrayList.addAll(arrayList2);
        if (arrayList.isEmpty() || TextUtils.isEmpty(null)) {
            String valueOf = String.valueOf(arrayList);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 24);
            sb.append("Currently running apps: ");
            sb.append(valueOf);
            absg.m48201d(sb.toString());
            return arrayList;
        }
        String str2 = (String) arrayList.get(0);
        throw null;
    }
}
