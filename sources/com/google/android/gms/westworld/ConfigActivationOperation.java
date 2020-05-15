package com.google.android.gms.westworld;

import android.app.PendingIntent;
import android.app.StatsManager;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import com.google.android.chimera.IntentOperation;
import java.lang.reflect.InvocationTargetException;
import java.util.List;
import java.util.Set;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ConfigActivationOperation extends IntentOperation {
    /* renamed from: a */
    private static List m94454a(StatsManager statsManager, PendingIntent pendingIntent) {
        try {
            long[] jArr = (long[]) statsManager.getClass().getDeclaredMethod("setActiveConfigsChangedOperation", PendingIntent.class).invoke(statsManager, pendingIntent);
            if (pendingIntent != null) {
                if (jArr != null) {
                    return m94456a(jArr);
                }
            }
            return bngx.m109376e();
        } catch (NoSuchMethodException e) {
            return bngx.m109376e();
        } catch (ClassCastException | IllegalAccessException | SecurityException | InvocationTargetException e2) {
            return bngx.m109376e();
        } catch (Exception e3) {
            if (e3 instanceof StatsManager.StatsUnavailableException) {
                return bngx.m109376e();
            }
            throw e3;
        }
    }

    public final void onHandleIntent(Intent intent) {
        long[] longArrayExtra;
        rjx rjx;
        bymq bymq;
        if (!aykg.m84157a()) {
            int i = Build.VERSION.SDK_INT;
            if (intent.hasExtra("android.app.extra.STATS_ACTIVE_CONFIG_KEYS") && (longArrayExtra = intent.getLongArrayExtra("android.app.extra.STATS_ACTIVE_CONFIG_KEYS")) != null) {
                if (choh.m149231b()) {
                    rjx = avtz.m79336a(rpr.m34216b(), new avty());
                    bymq = null;
                } else {
                    bymq = aykk.m84163a(rpr.m34216b());
                    rjx = null;
                }
                if (aykk.m84174a(bymq, rjx)) {
                    List a = m94456a(longArrayExtra);
                    rpr b = rpr.m34216b();
                    Set<String> stringSet = aykk.m84183d(b).getStringSet("SENT_CONFIGS", bnon.f131923a);
                    bnia j = bnic.m109500j();
                    for (String str : stringSet) {
                        j.mo67629b(Long.valueOf(Long.parseLong(str)));
                    }
                    ayka.m84137a(b, j.mo67751a(), a, false, bymq, rjx);
                }
            }
        }
    }

    /* renamed from: a */
    public static List m94455a(StatsManager statsManager, Context context) {
        PendingIntent pendingIntent = IntentOperation.getPendingIntent(context, ConfigActivationOperation.class, new Intent("com.android.server.stats.action.ACTIVATE_CONFIG"), 0, 134217728);
        if (!chpz.m149330g()) {
            return m94454a(statsManager, pendingIntent);
        }
        try {
            return m94456a(statsManager.setActiveConfigsChangedOperation(pendingIntent));
        } catch (StatsManager.StatsUnavailableException e) {
            return bngx.m109376e();
        }
    }

    /* renamed from: a */
    private static List m94456a(long[] jArr) {
        bngs j = bngx.m109377j();
        for (long j2 : jArr) {
            j.mo67668c(Long.valueOf(j2));
        }
        return j.mo67664a();
    }

    /* renamed from: a */
    public static void m94457a(StatsManager statsManager) {
        if (chpz.m149330g()) {
            try {
                m94456a(statsManager.setActiveConfigsChangedOperation((PendingIntent) null));
            } catch (StatsManager.StatsUnavailableException e) {
            }
        } else {
            m94454a(statsManager, (PendingIntent) null);
        }
    }
}
