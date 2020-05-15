package p000;

import android.app.KeyguardManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.util.Log;
import com.google.android.gms.trustagent.common.receiver.ScreenOnOffReceiver;
import com.google.android.gms.trustagent.common.tracker.UserPresenceTracker$1;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.ExecutorService;

/* renamed from: auoq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class auoq implements auny {

    /* renamed from: a */
    private final Context f92204a;

    /* renamed from: b */
    private final KeyguardManager f92205b;

    /* renamed from: c */
    private final BroadcastReceiver f92206c = new UserPresenceTracker$1(this, "trustagent");

    /* renamed from: d */
    private final auop f92207d;

    /* renamed from: e */
    private final Object f92208e = new Object();

    /* renamed from: f */
    private final Set f92209f = new HashSet();

    /* renamed from: g */
    private final ScreenOnOffReceiver f92210g;

    public auoq(Context context, auop auop) {
        this.f92204a = context;
        this.f92205b = (KeyguardManager) context.getSystemService("keyguard");
        this.f92207d = auop;
        this.f92210g = new ScreenOnOffReceiver(context, this);
    }

    /* renamed from: a */
    public final bqgg mo50741a() {
        boolean isKeyguardLocked = this.f92205b.isKeyguardLocked();
        bqgj a = bqgs.m112811a((ExecutorService) snp.m35704b(9));
        auop auop = this.f92207d;
        auop.getClass();
        return bqdx.m112673a(a.mo25819b(new auon(auop)), new auom(isKeyguardLocked), bqfb.INSTANCE);
    }

    /* renamed from: b */
    public final void mo50641b() {
        Log.i("Coffee-UserPresenceTracker", "Screen unlocked event received");
        mo50744e();
    }

    /* renamed from: bO */
    public final void mo50642bO() {
    }

    /* renamed from: c */
    public final void mo50643c() {
    }

    /* renamed from: e */
    public final void mo50744e() {
        synchronized (this.f92208e) {
            for (auoo auoo : this.f92209f) {
                auoo.mo50740a();
            }
        }
    }

    /* renamed from: b */
    public final void mo50743b(auoo auoo) {
        synchronized (this.f92208e) {
            this.f92209f.remove(auoo);
            if (this.f92209f.isEmpty()) {
                this.f92204a.unregisterReceiver(this.f92206c);
                this.f92210g.mo59553b();
            }
        }
    }

    /* renamed from: a */
    public final void mo50742a(auoo auoo) {
        synchronized (this.f92208e) {
            if (this.f92209f.isEmpty()) {
                this.f92204a.registerReceiver(this.f92206c, new IntentFilter("com.google.android.gms.trustagent.TRUST_STATE_CHANGED"));
                this.f92210g.mo59552a();
            }
            this.f92209f.add(auoo);
        }
    }
}
