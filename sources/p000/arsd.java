package p000;

import android.app.PendingIntent;
import android.content.Context;
import android.content.SharedPreferences;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.smartdevice.notification.PersistentNotificationCancellationBroadcastChimeraReceiver;
import com.google.android.gms.smartdevice.notification.PersistentNotificationDelayIntentOperation;
import com.google.android.gms.smartdevice.notification.SerializableNotification;

/* renamed from: arsd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class arsd {

    /* renamed from: a */
    public static final Logger f88223a = ascp.m73787a("Notification", "PersistentNotificationManager");

    /* renamed from: b */
    private final sex f88224b;

    /* renamed from: c */
    private final skc f88225c;

    public arsd(sex sex, skc skc) {
        sdo.m34959a(sex);
        this.f88224b = sex;
        sdo.m34959a(skc);
        this.f88225c = skc;
    }

    /* renamed from: a */
    public static SharedPreferences m73369a() {
        return rpr.m34216b().getSharedPreferences("SmartDevice.PersistentNotificationManager", 0);
    }

    /* renamed from: b */
    public final void mo48788b(String str, int i) {
        this.f88224b.mo25444a(str, i);
        m73369a().edit().remove(m73371a(str, i)).commit();
    }

    /* renamed from: a */
    public static arsd m73370a(Context context) {
        sex a = sex.m35104a(context);
        if (a != null) {
            return new arsd(a, new skc(context));
        }
        throw null;
    }

    /* renamed from: a */
    public static String m73371a(String str, int i) {
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 12);
        sb.append(i);
        sb.append(":");
        sb.append(str);
        return sb.toString();
    }

    /* renamed from: a */
    private final void m73372a(String str, PendingIntent pendingIntent, long j) {
        this.f88225c.mo25675a(str, 1, j, pendingIntent, "com.google.android.gms");
    }

    /* renamed from: a */
    public final void mo48787a(String str, int i, SerializableNotification serializableNotification) {
        Logger Logger = f88223a;
        Integer valueOf = Integer.valueOf(i);
        Logger.logVerbose("doNotify(tag=%s, id=%s)", str, valueOf);
        rpr b = rpr.m34216b();
        m73369a().edit().putString(m73371a(str, i), serializableNotification.mo59140a()).commit();
        if (serializableNotification.f108086c > 0) {
            PendingIntent pendingIntent = IntentOperation.getPendingIntent(b, PersistentNotificationDelayIntentOperation.class, PersistentNotificationDelayIntentOperation.m92792a(b, str, i, serializableNotification), 0, 134217728);
            if (pendingIntent != null) {
                f88223a.logVerbose("Setting timer to launch notification in %d ms", Long.valueOf(serializableNotification.f108086c));
                m73372a("PersistentNotificationManager", pendingIntent, serializableNotification.f108084a + serializableNotification.f108086c);
            } else {
                f88223a.mo25416d("Unable to set timer to launch notification.", new Object[0]);
            }
        } else {
            f88223a.logVerbose("Showing notification (tag=%s, id=%s)", str, valueOf);
            this.f88224b.mo25445a(str, i, serializableNotification.mo59139a(b));
        }
        if (serializableNotification.f108085b > 0) {
            PendingIntent broadcast = PendingIntent.getBroadcast(b, 0, PersistentNotificationCancellationBroadcastChimeraReceiver.m92791a(b, str, i), 134217728);
            f88223a.logVerbose("Setting timer to cancel notification in %d ms", Long.valueOf(serializableNotification.f108085b));
            m73372a("PersistentNotificationManager.CANCELATION", broadcast, serializableNotification.f108084a + serializableNotification.f108086c + serializableNotification.f108085b);
        }
    }
}
