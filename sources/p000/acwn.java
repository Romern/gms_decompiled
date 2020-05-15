package p000;

import android.app.usage.UsageStatsManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import java.util.concurrent.TimeUnit;

/* renamed from: acwn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class acwn {

    /* renamed from: a */
    public static final /* synthetic */ int f60979a = 0;

    /* renamed from: b */
    private static final acak f60980b = new acak("com.google.android.gms", "apps");

    /* renamed from: c */
    private static final long f60981c = TimeUnit.DAYS.toMillis(3);

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: absg.a(java.lang.String, java.lang.Object, java.lang.Object):void
     arg types: [java.lang.String, java.lang.Integer, boolean]
     candidates:
      absg.a(java.lang.String, java.lang.String, java.lang.Object[]):void
      absg.a(java.lang.Throwable, java.lang.String, java.lang.Object[]):void
      absg.a(java.lang.String, java.lang.Object, java.lang.Object):void */
    /* renamed from: a */
    public static acwo m49907a(Context context, abzm abzm, abym abym) {
        int i = Build.VERSION.SDK_INT;
        if (((Boolean) acaw.f59319aw.mo58455c()).booleanValue()) {
            absr d = abzm.mo32543d(f60980b);
            if (d == null) {
                absg.m48191b("Can't get CorpusConfig for Apps Corpus.");
                return acxe.m49929b();
            }
            long currentTimeMillis = System.currentTimeMillis();
            SharedPreferences sharedPreferences = context.getSharedPreferences("usage_stats_manager_prefs", 0);
            long j = sharedPreferences.getLong("usage_stats_timestamp", 0);
            sharedPreferences.edit().putLong("usage_stats_timestamp", currentTimeMillis).commit();
            try {
                return new acwm(context.getPackageManager(), d, ((UsageStatsManager) context.getSystemService("usagestats")).queryEvents(Math.max(j, currentTimeMillis - f60981c), currentTimeMillis), C1599acls.m49404b(context.getPackageManager()), abym);
            } catch (RuntimeException e) {
                absg.m48191b("b/62250956. Bad implementation of UsageStatsManager.queryEvents on LeEco devices");
                return acxe.m49929b();
            }
        } else {
            Integer valueOf = Integer.valueOf(Build.VERSION.SDK_INT);
            int i2 = Build.VERSION.SDK_INT;
            absg.m48186a("Apps Usage Signals is not enabled. API level: %d isAtLeastM: %b", (Object) valueOf, (Object) true);
            return acxe.m49929b();
        }
    }
}
