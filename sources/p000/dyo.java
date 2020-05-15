package p000;

import android.app.AlarmManager;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.hardware.Sensor;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.hardware.TriggerEventListener;
import android.os.Build;
import com.google.android.gms.awareness.fence.FenceState;
import com.google.android.gms.contextmanager.ContextData;
import com.google.android.gms.contextmanager.fence.internal.ContextFenceStub;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TimeZone;

/* renamed from: dyo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class dyo extends dyg implements lrj {

    /* renamed from: L */
    public static final dxr f14407L = new dxr(new dyn(), "DNDModeProducer", new int[]{59}, null);

    /* renamed from: b */
    protected static final HashSet f14408b = new HashSet(Arrays.asList("com.google.android.deskclock", "com.google.android.deskclock", "com.android.deskclock", "com.android.alarmclock", "com.sec.android.app.clockpackage", "com.sec.android.app.clockpackage.alarm", "com.htc.android.worldclock", "com.motorola.blur.alarmclock", "com.sonyericsson.alarm", "zte.com.cn.alarmclock", "com.lge.alarm", "com.lge.clock", "com.mobitobi.android.gentlealarm", "com.urbandroid.sleep.alarmclock", "com.splunchy.android.alarmclock"));

    /* renamed from: A */
    protected int f14409A;

    /* renamed from: B */
    protected long f14410B;

    /* renamed from: C */
    protected long f14411C;

    /* renamed from: D */
    protected long f14412D;

    /* renamed from: E */
    protected long f14413E;

    /* renamed from: F */
    protected float f14414F;

    /* renamed from: G */
    protected long f14415G;

    /* renamed from: H */
    protected HashSet f14416H;

    /* renamed from: I */
    protected int f14417I;

    /* renamed from: J */
    protected bxkp f14418J = bxkp.UNKNOWN_STATE;

    /* renamed from: K */
    protected bxkp f14419K = bxkp.UNKNOWN_STATE;

    /* renamed from: M */
    private sex f14420M;

    /* renamed from: N */
    private final dyj f14421N = new dyj(this);

    /* renamed from: k */
    public final drv f14422k = dwq.m9667k();

    /* renamed from: l */
    public final TriggerEventListener f14423l = new dyh(this);

    /* renamed from: m */
    public final SensorEventListener f14424m = new dyi(this, "DNDModeProducer", "contextmanager");

    /* renamed from: n */
    protected final Runnable f14425n = new dyk(this);

    /* renamed from: o */
    public final Runnable f14426o = new dyl(this);

    /* renamed from: p */
    public final Runnable f14427p = new dym(this);

    /* renamed from: q */
    protected AlarmManager f14428q;

    /* renamed from: r */
    protected SensorManager f14429r;

    /* renamed from: s */
    protected Sensor f14430s;

    /* renamed from: t */
    protected Sensor f14431t;

    /* renamed from: u */
    protected ecn f14432u;

    /* renamed from: v */
    protected int f14433v;

    /* renamed from: w */
    protected Set f14434w;

    /* renamed from: x */
    protected long f14435x;

    /* renamed from: y */
    protected long f14436y;

    /* renamed from: z */
    protected boolean f14437z;

    public dyo(Context context, doh doh, String str, dqb dqb) {
        super(context, doh, f14407L, str, dqb);
    }

    /* renamed from: b */
    private final void m9819b(dwa dwa) {
        int i;
        dwk g = dwa.mo9753g();
        if (g != null) {
            i = g.f14274a.f163028i | this.f14433v;
            this.f14433v = i;
        } else {
            i = this.f14433v | 64;
            this.f14433v = i;
        }
        this.f14433v = i & ((int) cdgp.f180782a.mo6606a().mo77514F());
    }

    /* renamed from: m */
    private final void m9820m() {
        this.f14429r.cancelTriggerSensor(this.f14423l, this.f14430s);
        this.f14422k.mo9433a(this.f14426o);
    }

    /* renamed from: a */
    public final void mo9845a() {
        this.f14435x = cdgp.f180782a.mo6606a().mo77513E();
        this.f14436y = cdgp.f180782a.mo6606a().mo77512D();
        this.f14433v = 0;
        this.f14434w = new HashSet();
        this.f14416H = new HashSet();
        if (mo9876b(4)) {
            tit tit = new tit();
            tit.mo26579a(7);
            lrh.m19579c(this.f14388d, this.f14391g).mo24703a(tit.mo26578a(), this).mo50371a(new dqi("[%s] registerContextListener, account=%s", this.f14387c, this.f14389e));
        }
        mo9878k();
        if (mo9876b(1)) {
            sex a = sex.m35104a(this.f14388d);
            this.f14420M = a;
            this.f14409A = a.mo25451d();
        }
        if (mo9876b(2)) {
            this.f14428q = (AlarmManager) this.f14388d.getSystemService("alarm");
            mo9879l();
        }
        mo9877j();
        mo9875b(0L);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final boolean mo9876b(int i) {
        return (i & this.f14433v) != 0;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final IntentFilter mo9849c() {
        IntentFilter intentFilter = new IntentFilter();
        int i = Build.VERSION.SDK_INT;
        if (mo9876b(1)) {
            intentFilter.addAction("android.app.action.INTERRUPTION_FILTER_CHANGED");
        }
        int i2 = Build.VERSION.SDK_INT;
        if (mo9876b(2)) {
            intentFilter.addAction("android.app.action.NEXT_ALARM_CLOCK_CHANGED");
        }
        if (intentFilter.countActions() == 0) {
            return null;
        }
        return intentFilter;
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public final void mo9877j() {
        boolean z;
        boolean z2;
        boolean z3;
        if (mo9876b(24) && this.f14429r == null) {
            this.f14429r = (SensorManager) this.f14388d.getSystemService("sensor");
        }
        if (!mo9876b(8)) {
            if (this.f14430s != null) {
                m9820m();
                this.f14430s = null;
            }
            z = false;
        } else if (this.f14430s == null) {
            Sensor defaultSensor = this.f14429r.getDefaultSensor(17);
            this.f14430s = defaultSensor;
            z = this.f14429r.requestTriggerSensor(this.f14423l, defaultSensor);
        } else {
            z = false;
        }
        if (!mo9876b(16)) {
            if (this.f14431t != null) {
                this.f14429r.unregisterListener(this.f14424m);
                this.f14422k.mo9433a(this.f14427p);
                this.f14431t = null;
            }
            z2 = false;
        } else if (this.f14431t == null) {
            Sensor defaultSensor2 = this.f14429r.getDefaultSensor(5);
            this.f14431t = defaultSensor2;
            z2 = this.f14429r.registerListener(this.f14424m, defaultSensor2, 3);
        } else {
            z2 = false;
        }
        if (!mo9876b(24)) {
            this.f14429r = null;
        }
        if (!mo9876b(64)) {
            ecn ecn = this.f14432u;
            if (ecn != null) {
                ecn.mo9961a(this.f14421N);
                this.f14432u = null;
                z3 = false;
            } else {
                z3 = false;
            }
        } else if (this.f14432u == null) {
            ecn a = ecn.m10110a();
            this.f14432u = a;
            a.f14685a.add(this.f14421N);
            if (!a.f14686b) {
                a.mo9964d();
            }
            z3 = true;
        } else {
            z3 = false;
        }
        Object[] objArr = {Boolean.valueOf(z), Boolean.valueOf(z2), Boolean.valueOf(z3)};
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public final void mo9879l() {
        String str;
        long j;
        AlarmManager alarmManager = this.f14428q;
        if (alarmManager != null) {
            AlarmManager.AlarmClockInfo nextAlarmClock = alarmManager.getNextAlarmClock();
            if (nextAlarmClock != null) {
                str = nextAlarmClock.getShowIntent().getCreatorPackage();
            } else {
                str = null;
            }
            new Object[1][0] = str;
            if (f14408b.contains(str) || str == null) {
                this.f14410B = this.f14411C;
                if (this.f14428q.getNextAlarmClock() != null) {
                    j = this.f14428q.getNextAlarmClock().getTriggerTime();
                } else {
                    j = 0;
                }
                this.f14411C = j;
            }
            Object[] objArr = {str, Long.valueOf(this.f14411C)};
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public final void mo9878k() {
        boolean z;
        long j;
        long b = dqt.m9103b(dwq.m9665i().mo20505a(), TimeZone.getDefault());
        long j2 = this.f14435x;
        long j3 = this.f14436y;
        if (j2 < j3) {
            if (j2 > b || j3 < b) {
                z = false;
            } else {
                z = true;
            }
            this.f14437z = z;
        } else {
            z = j2 <= b || j3 >= b;
            this.f14437z = z;
        }
        new Object[1][0] = Boolean.valueOf(z);
        if (!this.f14437z) {
            j = this.f14435x;
        } else {
            j = this.f14436y;
        }
        ContextFenceStub a = ContextFenceStub.m22863a(tli.m37158a(j, 60000 + j));
        String format = String.format("%s_%s_%s", "DNDModeProducer", "night", Long.valueOf(j));
        lrk lrk = new lrk();
        lrk.mo15393a(format, a, this);
        lrh.m19577a(this.f14388d, this.f14391g).mo24681a(lrk.mo15389a()).mo50371a(new dqi("[DNDModeProducer] register time fence", new Object[0]));
        this.f14416H.add(format);
    }

    /* renamed from: b */
    public final void mo9848b() {
        if (!this.f14416H.isEmpty()) {
            Iterator it = this.f14416H.iterator();
            while (it.hasNext()) {
                mo9874a((String) it.next());
            }
        }
        this.f14416H = null;
        this.f14422k.mo9433a(this.f14425n);
        if (this.f14429r != null) {
            if (mo9876b(8)) {
                m9820m();
                this.f14430s = null;
            }
            if (mo9876b(16)) {
                this.f14429r.unregisterListener(this.f14424m);
                this.f14422k.mo9433a(this.f14427p);
                this.f14431t = null;
            }
            if (mo9876b(64)) {
                this.f14432u.mo9961a(this.f14421N);
                this.f14432u = null;
            }
            this.f14429r = null;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo9875b(long j) {
        this.f14415G = dwq.m9665i().mo20505a();
        new Object[1][0] = Long.valueOf(j);
        if (j == 0) {
            this.f14422k.mo9435a(this.f14425n, dqy.m9123a("DNDModeProducer_produce_context"));
        } else {
            this.f14422k.mo9434a(this.f14425n, j, dqy.m9123a("DNDModeProducer_produce_context"));
        }
    }

    /* renamed from: a */
    public final void mo9847a(Context context, Intent intent) {
        String action = intent.getAction();
        String valueOf = String.valueOf(action);
        if (valueOf.length() == 0) {
            new String("Received intent: ");
        } else {
            "Received intent: ".concat(valueOf);
        }
        if (action.equals("android.app.action.INTERRUPTION_FILTER_CHANGED") && mo9876b(1)) {
            int d = this.f14420M.mo25451d();
            this.f14409A = d;
            new Object[1][0] = Integer.valueOf(d);
            mo9875b(0L);
        } else if (action.equals("android.app.action.NEXT_ALARM_CLOCK_CHANGED") && mo9876b(2)) {
            new Object[1][0] = action;
            mo9879l();
            mo9875b(0L);
            long a = dwq.m9665i().mo20505a();
            long j = this.f14411C - a;
            if (j > cdgp.m133198g() * 3600000) {
                mo9875b((j - (cdgp.m133198g() * 3600000)) + 1);
            }
            long j2 = a - this.f14410B;
            if (j2 < cdgp.m133199h() * 3600000 && j > 0) {
                mo9875b(((cdgp.m133199h() * 3600000) - j2) + 1);
            }
        }
    }

    /* renamed from: b */
    public final void mo9500b(ContextData contextData) {
        String str;
        boolean z;
        if (!mo9876b(4) || contextData.mo18018g() != 7) {
            bnsl bnsl = (bnsl) dss.f13961a.mo68388c();
            bnsl.mo68432a("dyo", "b", 476, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            if (contextData != null) {
                str = Integer.toString(contextData.mo18018g());
            } else {
                str = "null";
            }
            bnsl.mo68420a("[DNDModeProducer] Received unexpected context %s", str);
        } else if (contextData.mo18022j().mo26615a() == 2) {
            int a = bxmy.m122885a(((bxmz) contextData.mo18009a(bxmz.f164000d)).f164003b);
            if (a == 0) {
                a = 1;
            }
            if (a == 3) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                this.f14412D = contextData.mo18022j().mo18096c();
            } else {
                this.f14412D = -1;
            }
            mo9875b(0L);
            mo9875b(this.f14437z ? cdgp.m133200i() : cdgp.m133201j());
            Object[] objArr = {Boolean.valueOf(z), Integer.valueOf(contextData.mo18022j().mo26615a()), Long.valueOf(this.f14412D)};
        }
    }

    /* renamed from: a */
    public final void mo9826a(FenceState fenceState) {
        Object[] objArr = new Object[2];
        boolean z = false;
        objArr[0] = fenceState.mo8006b();
        if (fenceState.mo8005a() == 2) {
            z = true;
        }
        objArr[1] = Boolean.valueOf(z);
        if (fenceState.mo8005a() != 1 && fenceState.mo8006b().startsWith("night")) {
            mo9878k();
            mo9875b(0L);
            mo9874a(fenceState.mo8006b());
        }
    }

    /* renamed from: a */
    public final void mo9854a(dwa dwa) {
        if (dwa.mo9747b() == bxco.DND_MODE && this.f14434w.remove(dwa)) {
            int i = this.f14433v;
            this.f14433v = 0;
            for (dwa dwa2 : this.f14434w) {
                m9819b(dwa2);
            }
            if (i != this.f14433v) {
                mo9877j();
            }
            new Object[1][0] = Integer.valueOf(this.f14433v);
        }
    }

    /* renamed from: a */
    public final void mo9855a(dwa dwa, dwa dwa2) {
        if (dwa.mo9747b() == bxco.DND_MODE) {
            if (dwa2 != null) {
                mo9854a(dwa2);
            }
            this.f14434w.add(dwa);
            int i = this.f14433v;
            m9819b(dwa);
            if (i != this.f14433v) {
                mo9877j();
            }
            new Object[1][0] = Integer.valueOf(this.f14433v);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo9874a(String str) {
        new Object[1][0] = str;
        HashSet hashSet = this.f14416H;
        if (hashSet != null && !hashSet.isEmpty()) {
            lrk lrk = new lrk();
            lrk.mo15390a(str);
            lrh.m19577a(this.f14388d, this.f14391g).mo24681a(lrk.mo15389a()).mo50371a(new dqi("[DNDModeProducer] unregister time fence", new Object[0]));
            this.f14416H.remove(str);
        }
    }
}
