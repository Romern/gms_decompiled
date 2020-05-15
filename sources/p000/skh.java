package p000;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.util.Log;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: skh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class skh {

    /* renamed from: b */
    private static final Object f44613b = new Object();

    /* renamed from: c */
    private static volatile skh f44614c;

    /* renamed from: d */
    private static final bmzi f44615d = bmzn.m108681a(skg.f44612a);

    /* renamed from: a */
    public final ConcurrentHashMap f44616a = new ConcurrentHashMap();

    private skh() {
    }

    /* renamed from: a */
    public static skh m35531a() {
        if (f44614c == null) {
            synchronized (f44613b) {
                if (f44614c == null) {
                    f44614c = new skh();
                }
            }
        }
        return f44614c;
    }

    /* renamed from: b */
    public static boolean m35533b() {
        return sbu.f44037a != null && cdoz.f181455a.mo6606a().mo78130w();
    }

    /* renamed from: a */
    private static boolean m35532a(ServiceConnection serviceConnection) {
        return ((Boolean) f44615d.mo6606a()).booleanValue() && !(serviceConnection instanceof sbt);
    }

    /* renamed from: a */
    public final void mo25689a(Context context, ServiceConnection serviceConnection) {
        if (!m35532a(serviceConnection) || !this.f44616a.containsKey(serviceConnection)) {
            context.unbindService(serviceConnection);
            return;
        }
        try {
            context.unbindService((ServiceConnection) this.f44616a.get(serviceConnection));
        } finally {
            this.f44616a.remove(serviceConnection);
        }
    }

    /* renamed from: b */
    public final void mo25693b(Context context, ServiceConnection serviceConnection) {
        try {
            mo25689a(context, serviceConnection);
        } catch (IllegalArgumentException e) {
            Log.w("ConnectionTracker", "Exception thrown while unbinding", e);
        }
    }

    /* renamed from: a */
    public final boolean mo25690a(Context context, Intent intent, ServiceConnection serviceConnection, int i) {
        return mo25691a(context, context.getClass().getName(), intent, serviceConnection, i);
    }

    /* renamed from: a */
    public final boolean mo25691a(Context context, String str, Intent intent, ServiceConnection serviceConnection, int i) {
        return mo25692a(context, str, intent, serviceConnection, i, true);
    }

    /* renamed from: a */
    public final boolean mo25692a(Context context, String str, Intent intent, ServiceConnection serviceConnection, int i, boolean z) {
        ComponentName component;
        if (z && (component = intent.getComponent()) != null && sqr.m36000c(context, component.getPackageName())) {
            Log.w("ConnectionTracker", "Attempted to bind to a service in a STOPPED package.");
            return false;
        } else if (!m35532a(serviceConnection)) {
            return context.bindService(intent, serviceConnection, i);
        } else {
            ServiceConnection a = sbu.m34868a(serviceConnection);
            ServiceConnection serviceConnection2 = (ServiceConnection) this.f44616a.putIfAbsent(serviceConnection, a);
            if (!(serviceConnection2 == null || a == serviceConnection2)) {
                String format = String.format("Duplicate binding with the same ServiceConnection: %s, %s, %s.", serviceConnection, str, intent.getAction());
                Log.w("ConnectionTracker", format);
                if (sbu.f44037a != null && cdoz.f181455a.mo6606a().mo78128u()) {
                    throw new IllegalStateException(format);
                }
            }
            try {
                boolean bindService = context.bindService(intent, a, i);
                if (bindService) {
                    return bindService;
                }
                return false;
            } finally {
                this.f44616a.remove(serviceConnection, a);
            }
        }
    }
}
