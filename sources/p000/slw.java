package p000;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.stats.WakeLockEvent;
import java.util.Arrays;
import java.util.List;

/* renamed from: slw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class slw {

    /* renamed from: a */
    public static final slw f44710a = new slw();

    /* renamed from: b */
    private static Boolean f44711b;

    /* renamed from: a */
    public static final void m35610a(Context context, String str, int i, String str2, String str3, int i2, List list) {
        m35611a(context, str, i, str2, str3, null, i2, list, 0);
    }

    /* renamed from: a */
    public static final void m35611a(Context context, String str, int i, String str2, String str3, String str4, int i2, List list, long j) {
        int i3 = i;
        if (!m35613a()) {
            return;
        }
        if (TextUtils.isEmpty(str)) {
            String valueOf = String.valueOf(str);
            Log.e("WakeLockTracker", valueOf.length() == 0 ? new String("missing wakeLock key. ") : "missing wakeLock key. ".concat(valueOf));
        } else if (i3 == 7 || i3 == 8 || i3 == 10 || i3 == 11) {
            m35612a(new WakeLockEvent(System.currentTimeMillis(), i, str2, i2, slp.m35593a(list), str, SystemClock.elapsedRealtime(), srf.m36091a(context), str3, slp.m35592a(context.getPackageName()), srf.m36096e(context), j, str4, false));
        }
    }

    /* renamed from: a */
    public static void m35612a(WakeLockEvent wakeLockEvent) {
        slh.f44684a.mo25705a(wakeLockEvent);
    }

    /* renamed from: a */
    public static boolean m35613a() {
        if (f44711b == null) {
            slg slg = slh.f44684a;
            boolean z = true;
            if (slg != null) {
                int a = slg.mo25703a(1);
                ComponentName componentName = skr.f44644a;
                if (a == 0) {
                    z = false;
                }
            } else {
                z = false;
            }
            f44711b = Boolean.valueOf(z);
        }
        return f44711b.booleanValue();
    }

    /* renamed from: a */
    public final void mo25722a(Context context, Intent intent) {
        m35610a(context, intent.getStringExtra("WAKE_LOCK_KEY"), 8, null, null, 0, null);
    }

    /* renamed from: a */
    public final void mo25723a(Context context, Intent intent, String str, String str2, String str3) {
        m35610a(context, intent.getStringExtra("WAKE_LOCK_KEY"), 7, str, str2, 1, Arrays.asList(str3));
    }
}
