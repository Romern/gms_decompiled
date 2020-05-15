package p000;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.os.Build;
import com.google.android.gms.beacon.BleSettings;
import com.google.android.gms.beacon.BleSighting;
import com.google.android.gms.beacon.scan.impl.MockBluetoothLeScannerCompat$1;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* renamed from: ngk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ngk extends nga {

    /* renamed from: a */
    public static boolean f35513a = false;

    /* renamed from: b */
    private static final Object f35514b = new Object();

    /* renamed from: c */
    private static final Map f35515c = Collections.synchronizedMap(new HashMap());

    /* renamed from: d */
    private static final Map f35516d = Collections.synchronizedMap(new HashMap());

    /* renamed from: e */
    private static final BroadcastReceiver f35517e = new MockBluetoothLeScannerCompat$1("beacon");

    /* renamed from: f */
    private final Context f35518f;

    public ngk(Context context) {
        this.f35518f = context;
        if (context != null && !f35513a) {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("gms:bluetoothle:scan:.INJECT_BLE_SIGHTING");
            context.registerReceiver(f35517e, intentFilter);
            f35513a = true;
        }
    }

    /* renamed from: a */
    private static void m26185a(int i, int i2) {
        synchronized (f35514b) {
            Set<BleSighting> set = (Set) f35516d.get(Integer.valueOf(i));
            for (nej nej : f35515c.keySet()) {
                int intValue = ((Integer) f35515c.get(nej)).intValue();
                if ((intValue == i || intValue == 3) && set != null) {
                    for (BleSighting bleSighting : set) {
                        nej.mo13774a(i2, bleSighting);
                    }
                }
            }
        }
    }

    /* renamed from: b */
    public final void mo20587b() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final void mo20588c() {
    }

    /* renamed from: a */
    public static synchronized void m26186a(BleSighting bleSighting, int i, int i2) {
        synchronized (ngk.class) {
            synchronized (f35514b) {
                synchronized (f35514b) {
                    Map map = f35516d;
                    Integer valueOf = Integer.valueOf(i2);
                    Set set = (Set) map.get(valueOf);
                    if (set == null) {
                        set = new HashSet();
                    }
                    set.add(bleSighting);
                    f35516d.put(valueOf, set);
                }
                m26185a(i2, i);
            }
        }
    }

    /* renamed from: a */
    public final synchronized void mo20583a(nej nej) {
        synchronized (f35514b) {
            f35515c.remove(nej);
        }
    }

    /* renamed from: a */
    public final void mo20584a(boolean z) {
        Context context = this.f35518f;
        if (context != null && f35513a) {
            context.unregisterReceiver(f35517e);
            f35513a = false;
        }
    }

    /* renamed from: a */
    public final boolean mo20585a() {
        int i = Build.VERSION.SDK_INT;
        return true;
    }

    /* renamed from: a */
    public final synchronized boolean mo20586a(BleSettings bleSettings, nej nej) {
        int i;
        synchronized (f35514b) {
            if (bleSettings != null) {
                try {
                    i = bleSettings.f29265a;
                } catch (Throwable th) {
                    while (true) {
                    }
                    throw th;
                }
            } else {
                i = 3;
            }
            f35515c.put(nej, Integer.valueOf(i));
            m26185a(i, 1);
        }
        return true;
    }
}
