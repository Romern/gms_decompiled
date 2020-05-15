package p000;

import android.content.Intent;
import java.util.ArrayList;
import java.util.List;

/* renamed from: asfn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class asfn {

    /* renamed from: b */
    static final bnhe f88843b;

    /* renamed from: e */
    public static final /* synthetic */ int f88844e = 0;

    /* renamed from: f */
    private static asfn f88845f = null;

    /* renamed from: a */
    public final List f88846a;

    /* renamed from: c */
    final snr f88847c = new asfm(this, new sns(10));

    /* renamed from: d */
    public final qxq f88848d;

    static {
        bnha h = bnhe.m109414h();
        h.mo67695b("android.intent.action.SCREEN_OFF", calc.SCREEN_OFF);
        h.mo67695b("android.intent.action.SCREEN_ON", calc.SCREEN_ON);
        h.mo67695b("android.intent.action.ACTION_POWER_CONNECTED", calc.CHARGING);
        h.mo67695b("android.intent.action.ACTION_POWER_DISCONNECTED", calc.DISCHARGING);
        h.mo67695b("com.google.android.gms.stats.eastworld.action.EASTWORLD_ALARM", calc.ALARM);
        f88843b = h.mo67618b();
    }

    private asfn() {
        ArrayList arrayList = new ArrayList();
        this.f88846a = arrayList;
        if (asfs.f88856a == null) {
            asfs.f88856a = new asfs();
        }
        arrayList.add(asfs.f88856a);
        List list = this.f88846a;
        if (asfr.f88853a == null) {
            asfr.f88853a = new asfr();
        }
        list.add(asfr.f88853a);
        List list2 = this.f88846a;
        if (asfu.f88863a == null) {
            asfu.f88863a = new asfu();
        }
        list2.add(asfu.f88863a);
        List list3 = this.f88846a;
        if (asfv.f88866g == null) {
            asfv.f88866g = new asfv();
        }
        list3.add(asfv.f88866g);
        this.f88848d = new qxq(new qws(rpr.m34216b(), null, null), "PLATFORM_STATS_COUNTERS", 1024);
    }

    /* renamed from: a */
    public static synchronized asfn m73971a() {
        asfn asfn;
        synchronized (asfn.class) {
            if (f88845f == null) {
                f88845f = new asfn();
            }
            asfn = f88845f;
        }
        return asfn;
    }

    /* renamed from: a */
    public final void mo49132a(Intent intent) {
        if (!f88843b.containsKey(intent.getAction())) {
            this.f88848d.mo24383c("EastworldExecutorInvalidEvent").mo24359a();
            this.f88848d.mo24388e();
            return;
        }
        this.f88847c.sendEmptyMessage(((calc) f88843b.get(intent.getAction())).f175111i);
    }
}
