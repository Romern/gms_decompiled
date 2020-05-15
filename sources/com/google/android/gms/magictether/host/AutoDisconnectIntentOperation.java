package com.google.android.gms.magictether.host;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.SystemClock;
import com.google.android.chimera.IntentOperation;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class AutoDisconnectIntentOperation extends IntentOperation {

    /* renamed from: a */
    static final long f79804a;

    /* renamed from: b */
    private static final Map f79805b = new HashMap();

    static {
        new sek(new String[]{"AutoDisconnectIntentOperation"}, (int[]) null);
        double g = (double) cfcj.f183615a.mo6606a().mo80833g();
        Double.isNaN(g);
        f79804a = Math.round(g * 2.5d);
    }

    /* renamed from: a */
    static PendingIntent m67132a(Context context) {
        return PendingIntent.getService(context, 0, IntentOperation.getStartIntent(context, AutoDisconnectIntentOperation.class, "com.google.android.gms.magictether.operation.AUTO_DISCONNECT"), 134217728);
    }

    public final void onHandleIntent(Intent intent) {
        if (cfcj.m138656c() && intent != null && "com.google.android.gms.magictether.operation.AUTO_DISCONNECT".equals(intent.getAction())) {
            f79805b.clear();
            aezy.m52769a(rpr.m34216b()).mo34703a(true);
        }
    }

    /* renamed from: a */
    public static void m67133a() {
        rpr b = rpr.m34216b();
        new skc(b).mo25668a(m67132a(b));
    }

    /* renamed from: a */
    public static void m67134a(String str) {
        rpr b = rpr.m34216b();
        aezy a = aezy.m52769a(b);
        long elapsedRealtime = SystemClock.elapsedRealtime();
        Iterator it = f79805b.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            if (elapsedRealtime - ((Long) entry.getValue()).longValue() > f79804a) {
                a.mo34704b((String) entry.getKey());
                it.remove();
            }
        }
        f79805b.put(str, Long.valueOf(SystemClock.elapsedRealtime()));
        a.mo34702a(str);
        m67133a();
        new skc(b).mo25675a("AutoDisconnectIntentOperation", 2, f79804a + SystemClock.elapsedRealtime(), m67132a(b), b.getPackageName());
    }
}
