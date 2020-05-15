package p000;

import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.SystemClock;
import android.os.WorkSource;
import com.google.android.gms.beacon.scan.manager.BluetoothLeAlarmScheduler$1;

/* renamed from: ngo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ngo {

    /* renamed from: a */
    final BroadcastReceiver f35529a;

    /* renamed from: b */
    long f35530b;

    /* renamed from: c */
    private final Context f35531c;

    /* renamed from: d */
    private final skc f35532d;

    /* renamed from: e */
    private final PendingIntent f35533e;

    /* renamed from: f */
    private final String f35534f;

    /* renamed from: g */
    private boolean f35535g;

    public ngo(Context context, ngc ngc, String str) {
        skc skc = new skc(context);
        PendingIntent broadcast = PendingIntent.getBroadcast(context, 0, new Intent(str).setPackage(context.getPackageName()), 0);
        this.f35531c = context;
        this.f35532d = skc;
        this.f35533e = broadcast;
        this.f35534f = str;
        this.f35529a = new BluetoothLeAlarmScheduler$1("beacon", str, ngc);
    }

    /* renamed from: a */
    private final synchronized void m26205a(boolean z) {
        if (this.f35535g && z) {
            try {
                this.f35531c.unregisterReceiver(this.f35529a);
                this.f35535g = false;
            } catch (IllegalArgumentException e) {
                nha.m26243a("Unexpected IllegalArgumentException while unregistering alarm receiver");
            }
        }
        this.f35532d.mo25668a(this.f35533e);
    }

    /* renamed from: b */
    private final synchronized void m26206b() {
        if (!this.f35535g) {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction(this.f35534f);
            this.f35531c.registerReceiver(this.f35529a, intentFilter);
            this.f35535g = true;
        }
    }

    /* renamed from: a */
    public final synchronized void mo20609a() {
        m26205a(true);
    }

    /* renamed from: a */
    public final synchronized void mo20610a(long j, WorkSource workSource) {
        long elapsedRealtime = SystemClock.elapsedRealtime() + j;
        if (elapsedRealtime != this.f35530b) {
            m26205a(false);
            m26206b();
            this.f35532d.mo25674a("BluetoothLeAlarmScheduler", 2, elapsedRealtime, this.f35533e, workSource);
            this.f35530b = elapsedRealtime;
        }
    }
}
