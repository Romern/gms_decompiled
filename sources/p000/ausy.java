package p000;

import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.SystemClock;
import com.google.android.gms.trustagent.trustlet.device.bluetooth.internal.BluetoothConnectionTracker$IntervalBasedDeviceTimer$1;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: ausy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ausy {

    /* renamed from: a */
    public static final Object f92448a = new Object();

    /* renamed from: b */
    public final Map f92449b;

    /* renamed from: c */
    public final String f92450c;

    /* renamed from: d */
    public final Set f92451d;

    /* renamed from: e */
    private final Context f92452e;

    /* renamed from: f */
    private final int f92453f;

    /* renamed from: g */
    private final List f92454g;

    /* renamed from: h */
    private final Map f92455h;

    /* renamed from: i */
    private final BroadcastReceiver f92456i;

    /* renamed from: j */
    private final skc f92457j;

    /* renamed from: k */
    private int f92458k = 0;

    public ausy(Context context, int i, List list, String str) {
        this.f92452e = context;
        this.f92453f = i;
        this.f92454g = list;
        this.f92455h = new HashMap();
        this.f92449b = new HashMap();
        this.f92450c = str;
        this.f92457j = new skc(context);
        this.f92451d = new HashSet();
        this.f92456i = new BluetoothConnectionTracker$IntervalBasedDeviceTimer$1(this, "trustagent");
    }

    /* renamed from: a */
    public final void mo50888a(ausx ausx) {
        this.f92451d.add(ausx);
        if (this.f92451d.size() == 1) {
            this.f92452e.registerReceiver(this.f92456i, new IntentFilter(this.f92450c));
        }
    }

    /* renamed from: b */
    public final void mo50891b(ausx ausx) {
        this.f92451d.remove(ausx);
        if (this.f92451d.isEmpty()) {
            this.f92452e.unregisterReceiver(this.f92456i);
        }
    }

    /* renamed from: c */
    public final void mo50893c(String str) {
        synchronized (f92448a) {
            if (this.f92455h.containsKey(str)) {
                this.f92457j.mo25668a((PendingIntent) this.f92455h.get(str));
                this.f92455h.remove(str);
            }
        }
    }

    /* renamed from: d */
    public final boolean mo50894d(String str) {
        boolean containsKey;
        synchronized (f92448a) {
            containsKey = this.f92455h.containsKey(str);
        }
        return containsKey;
    }

    /* renamed from: a */
    public final void mo50889a(String str) {
        synchronized (f92448a) {
            if (this.f92455h.containsKey(str)) {
                ausz.f92459a.mo50711a("Disconnect called on already disconnected device", new Object[0]).mo50706a();
            } else {
                mo50890a(str, 0);
            }
        }
    }

    /* renamed from: b */
    public final void mo50892b(String str) {
        mo50893c(str);
        synchronized (f92448a) {
            this.f92449b.remove(str);
        }
    }

    /* renamed from: a */
    public final void mo50890a(String str, int i) {
        mo50893c(str);
        if (i < this.f92454g.size()) {
            Context context = this.f92452e;
            int i2 = this.f92458k;
            this.f92458k = i2 + 1;
            PendingIntent broadcast = PendingIntent.getBroadcast(context, i2, new Intent(this.f92450c).putExtra("key-timer-extra-device-address", str), 0);
            this.f92457j.mo25681b("com.google.android.gms.auth.trustagent.trustlet.BluetoothConnectionTracker.alarm_tag", this.f92453f, ((Long) this.f92454g.get(i)).longValue() + SystemClock.elapsedRealtime(), broadcast, "com.google.android.gms");
            synchronized (f92448a) {
                this.f92455h.put(str, broadcast);
                this.f92449b.put(str, Integer.valueOf(i));
            }
        }
    }
}
