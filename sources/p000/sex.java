package p000;

import android.app.AutomaticZenRule;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationChannelGroup;
import android.app.NotificationManager;
import android.content.Context;
import android.os.Build;
import android.service.notification.StatusBarNotification;
import android.text.TextUtils;
import android.util.Log;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: sex */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class sex {

    /* renamed from: a */
    public final NotificationManager f44099a;

    /* renamed from: b */
    public final String f44100b;

    /* renamed from: c */
    public final sev f44101c;

    /* renamed from: d */
    final boolean f44102d;

    /* renamed from: e */
    private final Context f44103e;

    /* renamed from: f */
    private final CharSequence f44104f;

    /* renamed from: g */
    private final Set f44105g = Collections.newSetFromMap(new ConcurrentHashMap());

    public sex(Context context, NotificationManager notificationManager, String str, CharSequence charSequence, sev sev, boolean z) {
        this.f44103e = context;
        sdo.m34959a(notificationManager);
        this.f44099a = notificationManager;
        this.f44100b = str;
        this.f44104f = charSequence;
        this.f44101c = sev;
        this.f44102d = z;
    }

    /* renamed from: a */
    public static sex m35104a(Context context) {
        CharSequence charSequence;
        String str;
        boolean z;
        Context applicationContext = context.getApplicationContext();
        NotificationManager notificationManager = (NotificationManager) applicationContext.getSystemService("notification");
        if (notificationManager == null) {
            return null;
        }
        String a = sqq.m35989a(applicationContext);
        int i = Build.VERSION.SDK_INT;
        String a2 = sqq.m35989a(applicationContext);
        if (a2 != null) {
            charSequence = (CharSequence) sqq.f44991a.get(a2);
            if (charSequence == null && (charSequence = sqq.m35993b(applicationContext)) != null) {
                sqq.f44991a.put(a2, charSequence);
            }
        } else {
            charSequence = null;
        }
        if (a == null || charSequence == null) {
            str = "gmscore";
            charSequence = sqq.m35995d(applicationContext);
        } else {
            str = a;
        }
        if (applicationContext.getApplicationInfo() == null || applicationContext.getApplicationInfo().targetSdkVersion < 26) {
            z = false;
        } else {
            z = true;
        }
        synchronized (sev.class) {
            if (sev.f44097a == null) {
                qws qws = new qws(applicationContext, "GMSCORE_NOTIFICATION_COUNTERS", null);
                qws.mo24337a(cagz.UNMETERED_OR_DAILY);
                sev.f44097a = new qxq(qws, "GMSCORE_NOTIFICATION_COUNTERS", 1024);
            }
        }
        return new sex(applicationContext, notificationManager, str, charSequence, new sev(str), z);
    }

    /* renamed from: h */
    public static final boolean m35105h() {
        return !cdly.f181215a.mo6606a().mo77877c();
    }

    /* renamed from: d */
    public final int mo25451d() {
        return this.f44099a.getCurrentInterruptionFilter();
    }

    /* renamed from: e */
    public final boolean mo25453e() {
        return this.f44099a.areNotificationsEnabled();
    }

    /* renamed from: b */
    public final void mo25447b(String str) {
        int i = Build.VERSION.SDK_INT;
        this.f44099a.deleteNotificationChannel(str);
    }

    /* renamed from: c */
    public final NotificationChannelGroup mo25449c(String str) {
        int i = Build.VERSION.SDK_INT;
        return this.f44099a.getNotificationChannelGroup(str);
    }

    /* renamed from: f */
    public final Map mo25454f() {
        int i = Build.VERSION.SDK_INT;
        return this.f44099a.getAutomaticZenRules();
    }

    /* renamed from: g */
    public final boolean mo25455g() {
        int i = Build.VERSION.SDK_INT;
        return this.f44099a.isNotificationPolicyAccessGranted();
    }

    /* renamed from: d */
    public final void mo25452d(String str) {
        int i = Build.VERSION.SDK_INT;
        this.f44099a.removeAutomaticZenRule(str);
    }

    /* renamed from: b */
    public final StatusBarNotification[] mo25448b() {
        return this.f44099a.getActiveNotifications();
    }

    /* renamed from: c */
    public final void mo25450c() {
        this.f44101c.mo25434b();
    }

    /* renamed from: a */
    public final Notification mo25436a(Notification notification) {
        int i = Build.VERSION.SDK_INT;
        if (!this.f44102d || !TextUtils.isEmpty(notification.getChannelId())) {
            return notification;
        }
        if (notification.priority != 0) {
            Log.e("NotificationManager", "Notifications that use non-default priority should use NotificationChannels.");
        }
        if (!this.f44105g.contains(this.f44100b)) {
            this.f44099a.createNotificationChannel(new NotificationChannel(this.f44100b, this.f44104f, 3));
            this.f44105g.add(this.f44100b);
        }
        return Notification.Builder.recoverBuilder(this.f44103e, notification).setChannelId(this.f44100b).build();
    }

    /* renamed from: a */
    public final NotificationChannel mo25437a(String str) {
        int i = Build.VERSION.SDK_INT;
        return this.f44099a.getNotificationChannel(str);
    }

    /* renamed from: a */
    public final String mo25438a(AutomaticZenRule automaticZenRule) {
        int i = Build.VERSION.SDK_INT;
        return this.f44099a.addAutomaticZenRule(automaticZenRule);
    }

    /* renamed from: a */
    public final List mo25439a() {
        int i = Build.VERSION.SDK_INT;
        return this.f44099a.getNotificationChannels();
    }

    /* renamed from: a */
    public final void mo25440a(int i) {
        this.f44099a.cancel(i);
        if (!m35105h()) {
            this.f44101c.mo25434b();
        }
    }

    /* renamed from: a */
    public final void mo25441a(int i, Notification notification) {
        if (m35105h()) {
            this.f44099a.notify(i, notification);
        } else {
            mo25445a(null, i, notification);
        }
    }

    /* renamed from: a */
    public final void mo25442a(NotificationChannel notificationChannel) {
        int i = Build.VERSION.SDK_INT;
        this.f44099a.createNotificationChannel(notificationChannel);
    }

    /* renamed from: a */
    public final void mo25443a(NotificationChannelGroup notificationChannelGroup) {
        int i = Build.VERSION.SDK_INT;
        this.f44099a.createNotificationChannelGroup(notificationChannelGroup);
    }

    /* renamed from: a */
    public final void mo25444a(String str, int i) {
        this.f44099a.cancel(str, i);
        if (!m35105h()) {
            this.f44101c.mo25434b();
        }
    }

    /* renamed from: a */
    public final void mo25445a(String str, int i, Notification notification) {
        if (m35105h()) {
            this.f44099a.notify(str, i, notification);
            return;
        }
        sdo.m34959a(notification);
        if (sew.m35103a(this.f44100b)) {
            this.f44099a.notify(str, i, mo25436a(notification));
            this.f44101c.mo25433a();
            return;
        }
        this.f44101c.mo25435c();
    }

    /* renamed from: a */
    public final void mo25446a(String str, AutomaticZenRule automaticZenRule) {
        int i = Build.VERSION.SDK_INT;
        this.f44099a.updateAutomaticZenRule(str, automaticZenRule);
    }
}
