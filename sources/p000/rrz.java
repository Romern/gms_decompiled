package p000;

import android.content.Context;
import android.content.IntentFilter;
import android.os.Build;
import android.util.Log;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Map;

/* renamed from: rrz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class rrz {

    /* renamed from: a */
    private static rrv f43567a;

    /* renamed from: a */
    public static synchronized void m34321a(Context context) {
        synchronized (rrz.class) {
            int i = Build.VERSION.SDK_INT;
            if (f43567a == null) {
                if (m34323a()) {
                    Context applicationContext = context.getApplicationContext();
                    m34322a(applicationContext, new rsc(applicationContext));
                    return;
                }
            }
            Log.w("GmsReceiverSupport", "Didn't register runtime background receiver.");
        }
    }

    /* renamed from: a */
    static synchronized void m34322a(Context context, rsc rsc) {
        synchronized (rrz.class) {
            f43567a = new rrv(rsc);
            ArrayList arrayList = new ArrayList();
            Map map = rsc.f43573a;
            if (map != null) {
                for (rsb rsb : map.values()) {
                    if (rsb.f43571b) {
                        arrayList.add(rsb.f43570a);
                    }
                }
            }
            ArrayList arrayList2 = new ArrayList();
            Map map2 = rsc.f43573a;
            if (map2 != null) {
                for (rsb rsb2 : map2.values()) {
                    if (!rsb2.f43571b) {
                        arrayList2.add(rsb2.f43570a);
                    }
                }
            }
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                context.registerReceiver(f43567a, (IntentFilter) arrayList.get(i));
            }
            int size2 = arrayList2.size();
            for (int i2 = 0; i2 < size2; i2++) {
                context.registerReceiver(f43567a, (IntentFilter) arrayList2.get(i2), "com.google.android.gms.permission.INTERNAL_BROADCAST", null);
            }
            Log.i("GmsReceiverSupport", String.format(Locale.getDefault(), "Registered Receiver for %d+%d IntentFilters", Integer.valueOf(arrayList.size()), Integer.valueOf(arrayList2.size())));
        }
    }

    /* renamed from: a */
    public static boolean m34323a() {
        return "com.google.android.gms.persistent".equals(ssy.m36271a());
    }
}
