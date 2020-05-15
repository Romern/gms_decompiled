package p000;

import android.app.Notification;
import android.app.NotificationManager;
import android.content.ComponentName;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.provider.Settings;
import java.util.HashSet;
import java.util.Set;

/* renamed from: jq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class C1114jq {

    /* renamed from: b */
    private static final Object f23025b = new Object();

    /* renamed from: c */
    private static String f23026c;

    /* renamed from: d */
    private static Set f23027d = new HashSet();

    /* renamed from: f */
    private static final Object f23028f = new Object();

    /* renamed from: g */
    private static C1113jp f23029g;

    /* renamed from: a */
    public final NotificationManager f23030a;

    /* renamed from: e */
    private final Context f23031e;

    public C1114jq(Context context) {
        this.f23031e = context;
        this.f23030a = (NotificationManager) context.getSystemService("notification");
    }

    /* renamed from: a */
    public static Set m17100a(Context context) {
        Set set;
        String string = Settings.Secure.getString(context.getContentResolver(), "enabled_notification_listeners");
        synchronized (f23025b) {
            if (string != null) {
                if (!string.equals(f23026c)) {
                    String[] split = string.split(":", -1);
                    int length = split.length;
                    HashSet hashSet = new HashSet(length);
                    for (String str : split) {
                        ComponentName unflattenFromString = ComponentName.unflattenFromString(str);
                        if (unflattenFromString != null) {
                            hashSet.add(unflattenFromString.getPackageName());
                        }
                    }
                    f23027d = hashSet;
                    f23026c = string;
                }
            }
            set = f23027d;
        }
        return set;
    }

    /* renamed from: a */
    public final void mo13982a(String str, int i) {
        this.f23030a.cancel(str, i);
        int i2 = Build.VERSION.SDK_INT;
    }

    /* renamed from: a */
    public final void mo13983a(String str, int i, Notification notification) {
        Bundle a = C1108jk.m16819a(notification);
        if (a == null || !a.getBoolean("android.support.useSideChannel")) {
            this.f23030a.notify(str, i, notification);
            return;
        }
        C1110jm jmVar = new C1110jm(this.f23031e.getPackageName(), i, str, notification);
        synchronized (f23028f) {
            if (f23029g == null) {
                f23029g = new C1113jp(this.f23031e.getApplicationContext());
            }
            f23029g.f22954a.obtainMessage(0, jmVar).sendToTarget();
        }
        this.f23030a.cancel(str, i);
    }
}
