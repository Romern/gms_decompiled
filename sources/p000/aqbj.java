package p000;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.os.HandlerThread;
import com.google.android.gms.mdm.receivers.WifiStateChangedReceiver;
import java.util.concurrent.CountDownLatch;

/* renamed from: aqbj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aqbj {

    /* renamed from: a */
    static int f85557a = 0;

    /* renamed from: b */
    public static boolean f85558b = false;

    /* renamed from: c */
    static volatile aqbo f85559c;

    /* renamed from: d */
    static CountDownLatch f85560d;

    /* renamed from: e */
    private static final BroadcastReceiver f85561e = new WifiStateChangedReceiver();

    /* renamed from: f */
    private static boolean f85562f = false;

    /* renamed from: g */
    private static Context f85563g = null;

    static {
        aqbj.class.getSimpleName();
    }

    aqbj() {
    }

    /* renamed from: a */
    static synchronized void m71296a() {
        synchronized (aqbj.class) {
            m71301d();
        }
    }

    /* renamed from: b */
    public static synchronized void m71298b() {
        synchronized (aqbj.class) {
            f85558b = false;
            if (f85557a <= 0) {
                m71301d();
            }
        }
    }

    /* renamed from: c */
    static synchronized void m71300c() {
        synchronized (aqbj.class) {
            f85557a++;
        }
    }

    /* renamed from: d */
    private static void m71301d() {
        int i = f85557a - 1;
        f85557a = i;
        if (i <= 0 && !f85558b && f85559c != null) {
            try {
                aqbo aqbo = f85559c;
                if (aqbo.mo47738b()) {
                    for (int i2 = 0; i2 < aqbo.f85585k.size(); i2++) {
                        aqbk aqbk = (aqbk) aqbo.f85585k.valueAt(i2);
                        if (aqbk != null) {
                            aqbk.mo47728a();
                        }
                    }
                }
            } catch (IllegalStateException e) {
            }
            f85559c = null;
            f85560d = null;
            f85557a = 0;
        }
        if (f85557a <= 0 && f85562f) {
            f85562f = false;
            Context context = f85563g;
            if (context != null) {
                try {
                    context.unregisterReceiver(f85561e);
                } catch (IllegalArgumentException e2) {
                }
                f85563g = null;
            }
        }
    }

    /* renamed from: a */
    static synchronized void m71297a(Context context) {
        synchronized (aqbj.class) {
            if (cgkt.m145937i()) {
                apgy apgy = new apgy(context);
                if (!f85562f && apgy.mo47201a()) {
                    HandlerThread handlerThread = new HandlerThread("safety-net-callback");
                    handlerThread.start();
                    adzt adzt = new adzt(handlerThread.getLooper());
                    IntentFilter intentFilter = new IntentFilter();
                    intentFilter.addAction("android.net.wifi.WIFI_STATE_CHANGED");
                    context.registerReceiver(f85561e, intentFilter, null, adzt);
                    f85562f = true;
                    f85563g = context.getApplicationContext();
                }
            }
        }
    }

    /* renamed from: b */
    static void m71299b(Context context) {
        if (f85559c == null) {
            synchronized (aqbj.class) {
                if (f85559c == null) {
                    if (f85560d == null) {
                        f85560d = new CountDownLatch(1);
                    }
                    soc soc = new soc(25, 9);
                    f85559c = new aqbo(context, new aqbz(context, soc), soc);
                }
            }
        }
    }
}
