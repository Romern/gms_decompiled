package p000;

import android.content.Context;
import android.content.IntentFilter;
import android.util.Pair;
import com.google.android.gms.people.sync.focus.notification.NotificationReceiver;
import java.util.HashMap;
import java.util.Map;

/* renamed from: amxc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class amxc {

    /* renamed from: a */
    private static final Map f76248a = new HashMap();

    /* renamed from: a */
    public static synchronized void m63597a(Context context, alsj alsj, amxg amxg) {
        synchronized (amxc.class) {
            amxg.mo41521d();
            Pair pair = new Pair(amxg.mo41521d().f76244b, Integer.valueOf(amxg.mo41521d().f76245c));
            NotificationReceiver notificationReceiver = (NotificationReceiver) f76248a.get(pair);
            if (notificationReceiver == null) {
                NotificationReceiver notificationReceiver2 = new NotificationReceiver(alsj, amxg);
                context.registerReceiver(notificationReceiver2, new IntentFilter(amxg.mo41509a()));
                context.registerReceiver(notificationReceiver2, new IntentFilter(amxg.mo41512b()));
                f76248a.put(pair, notificationReceiver2);
            } else {
                notificationReceiver.f82055a = amxg;
            }
        }
    }
}
