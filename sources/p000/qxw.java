package p000;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.android.gms.clearcut.CollectForDebugParcelable;
import java.util.concurrent.TimeUnit;

/* renamed from: qxw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class qxw {

    /* renamed from: a */
    private static final long f42405a = TimeUnit.MILLISECONDS.convert(3, TimeUnit.DAYS);

    /* renamed from: a */
    public static CollectForDebugParcelable m33074a(Context context, boolean z) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("collectForDebug", 0);
        long min = Math.min(cdee.f180578a.mo6606a().mo77329a(), f42405a);
        long currentTimeMillis = System.currentTimeMillis();
        long j = currentTimeMillis + min;
        long j2 = sharedPreferences.getLong("collectForDebugStartTime", 0);
        long j3 = sharedPreferences.getLong("collectForDebug", 0);
        if (j2 == 0 || currentTimeMillis > j3) {
            j2 = currentTimeMillis;
        }
        sharedPreferences.edit().putLong("collectForDebugStartTime", j2).putLong("collectForDebug", j).putBoolean("collectForDebugSkipPersistentStorage", z).apply();
        return new CollectForDebugParcelable(z, j2, j);
    }

    /* renamed from: b */
    public static CollectForDebugParcelable m33077b(Context context) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("collectForDebug", 0);
        return new CollectForDebugParcelable(sharedPreferences.getBoolean("collectForDebugSkipPersistentStorage", false), sharedPreferences.getLong("collectForDebugStartTime", 0), sharedPreferences.getLong("collectForDebug", 0));
    }

    /* renamed from: a */
    public static void m33075a(Context context) {
        context.getSharedPreferences("collectForDebug", 0).edit().putLong("collectForDebugStartTime", 0).putLong("collectForDebug", 0).apply();
    }

    /* renamed from: a */
    public static boolean m33076a(Context context, sqv sqv) {
        return context.getSharedPreferences("collectForDebug", 0).getLong("collectForDebug", 0) - sqv.mo20505a() > 0;
    }
}
