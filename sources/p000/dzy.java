package p000;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;

/* renamed from: dzy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class dzy extends dyg implements Runnable {

    /* renamed from: b */
    public static final dxr f14506b = new dxr(new dzw(), "PowerConnectionProducer", new int[]{8}, null);

    /* renamed from: k */
    private final IntentFilter f14507k = new IntentFilter("android.intent.action.BATTERY_CHANGED");

    /* renamed from: l */
    private bxmr f14508l;

    public dzy(Context context, doh doh, String str, dqb dqb) {
        super(context, doh, f14506b, str, dqb, false);
        mo9851a(8);
    }

    /* renamed from: a */
    private final void m9933a(dzx dzx, long j) {
        bxvd da = bxmr.f163977d.mo74144da();
        bxmq bxmq = dzx.f14504a;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bxmr bxmr = (bxmr) da.f164949b;
        bxmr.f163981b = bxmq.f163976f;
        int i = bxmr.f163980a | 1;
        bxmr.f163980a = i;
        double d = dzx.f14505b;
        bxmr.f163980a = i | 2;
        bxmr.f163982c = d;
        bxmr bxmr2 = (bxmr) da.mo74062i();
        this.f14508l = bxmr2;
        tip tip = new tip(7, 8, 1);
        tip.mo26574a(tka.m37119b(j));
        tip.mo26572a(bxmr.f163978e, bxmr2);
        mo9857d(tip.mo26570a());
    }

    /* renamed from: j */
    private final dzx m9934j() {
        return new dzx(this.f14388d.registerReceiver(null, this.f14507k));
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final synchronized void mo9848b() {
        mo9846a(dwq.m9665i().mo20505a());
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final IntentFilter mo9849c() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.ACTION_POWER_CONNECTED");
        intentFilter.addAction("android.intent.action.ACTION_POWER_DISCONNECTED");
        intentFilter.addAction("android.intent.action.BATTERY_CHANGED");
        return intentFilter;
    }

    public final synchronized void run() {
        dzx j = m9934j();
        if (!mo9861g()) {
            bnsl bnsl = (bnsl) dss.f13961a.mo68388c();
            bnsl.mo68432a("dzy", "run", 110, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68420a("[PowerConnectionProducer] No ongoing data (powerConnectionState=%s)", j);
            m9933a(j, dwq.m9665i().mo20505a());
            return;
        }
        long a = dwq.m9665i().mo20505a();
        mo9846a(a);
        m9933a(j, a + 1);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final synchronized void mo9845a() {
        m9933a(m9934j(), dwq.m9665i().mo20505a());
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo9846a(long j) {
        super.mo9846a(j);
        this.f14508l = null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0042, code lost:
        if (r3.f14508l.f163982c == r4.f14505b) goto L_0x001e;
     */
    /* renamed from: a */
    public final synchronized void mo9847a(Context context, Intent intent) {
        String action = intent.getAction();
        if (action.equals("android.intent.action.ACTION_POWER_CONNECTED") || action.equals("android.intent.action.ACTION_POWER_DISCONNECTED") || action.equals("android.intent.action.BATTERY_CHANGED")) {
            dzx j = m9934j();
            if (mo9861g()) {
                bxmq a = bxmq.m122875a(this.f14508l.f163981b);
                if (a == null) {
                    a = bxmq.UNKNOWN;
                }
                if (a == j.f14504a) {
                }
            }
            this.f13883a.mo9435a(this, dqy.m9123a("ReceivedBroadcast_PowerConnection"));
        }
    }
}
