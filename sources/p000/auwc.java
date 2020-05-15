package p000;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.os.PowerManager;
import android.os.SystemClock;
import com.google.android.gms.location.ActivityRecognitionRequest;
import com.google.android.gms.trustlet.onbody.internal.PhonePositionTracker$PhonePositionReceiver;
import java.util.ArrayDeque;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: auwc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class auwc {

    /* renamed from: a */
    public static final aunx f92631a = new aunx("TrustAgent", "PhonePositionTracker");

    /* renamed from: b */
    public static final long f92632b = (chac.f188164a.mo6606a().mo84859o() * 1000);

    /* renamed from: c */
    public final AtomicLong f92633c = new AtomicLong(-1);

    /* renamed from: d */
    public final Context f92634d;

    /* renamed from: e */
    public final auwb f92635e;

    /* renamed from: f */
    protected final PhonePositionTracker$PhonePositionReceiver f92636f;

    /* renamed from: g */
    public boolean f92637g;

    /* renamed from: h */
    public PendingIntent f92638h;

    /* renamed from: i */
    public long f92639i;

    /* renamed from: j */
    public final PowerManager f92640j;

    /* renamed from: k */
    public long f92641k;

    /* renamed from: l */
    public long f92642l;

    /* renamed from: m */
    public long f92643m;

    /* renamed from: n */
    public rkb f92644n;

    /* renamed from: o */
    public final bmzi f92645o = bmzn.m108681a(auvr.f92621a);

    /* renamed from: p */
    public boolean f92646p = false;

    /* renamed from: q */
    protected final rjz f92647q = new auvw(this);

    /* renamed from: r */
    protected final rjz f92648r = new auvx(this);

    /* renamed from: s */
    public rjx f92649s;

    /* renamed from: t */
    private final ArrayDeque f92650t;

    /* renamed from: u */
    private boolean f92651u;

    public auwc(Context context, auwb auwb) {
        f92631a.mo50711a("Creating PhonePositionTracker.", new Object[0]);
        this.f92634d = context;
        this.f92635e = auwb;
        this.f92636f = new PhonePositionTracker$PhonePositionReceiver(this);
        this.f92640j = (PowerManager) context.getSystemService("power");
        this.f92639i = 0;
        this.f92641k = -1;
        this.f92637g = false;
        this.f92650t = new ArrayDeque();
        if (((Boolean) this.f92645o.mo6606a()).booleanValue()) {
            this.f92649s = aefo.m51797a(this.f92634d);
            return;
        }
        rjy rjy = new rjy(this.f92634d);
        rjy.mo24779a(aefo.f63329a);
        rjy.mo24782a(new auvy(this));
        this.f92644n = rjy.mo24784b();
    }

    /* renamed from: a */
    public final void mo50986a() {
        f92631a.mo50711a("Register activity recognition API updates.", new Object[0]).mo50708c();
        if (this.f92637g) {
            return;
        }
        if (((Boolean) this.f92645o.mo6606a()).booleanValue()) {
            mo50989b();
            this.f92646p = true;
            return;
        }
        this.f92644n.mo24796b(this.f92648r);
        this.f92644n.mo24790a(this.f92647q);
        this.f92644n.mo24801e();
        this.f92646p = true;
    }

    /* renamed from: b */
    public final void mo50989b() {
        Intent intent = new Intent("com.google.android.gms.auth.trustagent.trustlet.ACTION_ACTIVITY_DETECTED");
        aunx aunx = f92631a;
        String valueOf = String.valueOf(this.f92634d.getPackageName());
        aunx.mo50711a(valueOf.length() == 0 ? new String("AR broadcast intent: com.google.android.gms.auth.trustagent.trustlet.ACTION_ACTIVITY_DETECTED, package: ") : "AR broadcast intent: com.google.android.gms.auth.trustagent.trustlet.ACTION_ACTIVITY_DETECTED, package: ".concat(valueOf), new Object[0]);
        intent.setPackage(this.f92634d.getPackageName());
        this.f92638h = PendingIntent.getBroadcast(this.f92634d, 0, intent, 134217728);
        aefy aefy = new aefy();
        aefy.mo34115a(60000L);
        aefy.f63348e = "Coffee-PhonePositionTracker";
        SharedPreferences a = aupo.m77578a(this.f92634d);
        Sensor defaultSensor = ((SensorManager) this.f92634d.getSystemService("sensor")).getDefaultSensor(1);
        if (defaultSensor == null || ((long) defaultSensor.getFifoMaxEventCount()) < chac.f188164a.mo6606a().mo84863s() || !chac.f188164a.mo6606a().mo84862r() || !chac.f188164a.mo6606a().mo84865u() || (!a.getBoolean("auth_trust_agent_pref_gait_nofification_seen", false) && !chac.f188164a.mo6606a().mo84864t())) {
            aefy.mo34114a(9);
        } else {
            aefy.mo34114a(9);
            aefy.mo34114a(10);
        }
        Context context = this.f92634d;
        aefy.f63347d = stx.m36335a(context, context.getPackageName());
        ActivityRecognitionRequest a2 = aefy.mo34113a();
        if (((Boolean) this.f92645o.mo6606a()).booleanValue()) {
            aucb a3 = this.f92649s.mo24682a(a2, this.f92638h);
            a3.mo50373a(new auvs(this));
            a3.mo50372a(new auvt(this));
            return;
        }
        rjo rjo = aefo.f63329a;
        aeja.m51918a(this.f92644n, a2, this.f92638h).mo9458a(new auvz(this));
        this.f92644n.mo24796b(this.f92647q);
        this.f92644n.mo24803g();
    }

    /* renamed from: c */
    public final void mo50990c() {
        f92631a.mo50711a("Unregistering from activity recognition", new Object[0]).mo50708c();
        if (!((Boolean) this.f92645o.mo6606a()).booleanValue()) {
            this.f92646p = false;
            this.f92644n.mo24796b(this.f92647q);
            if (this.f92637g) {
                this.f92644n.mo24790a(this.f92648r);
                this.f92644n.mo24801e();
                this.f92637g = false;
                this.f92634d.unregisterReceiver(this.f92636f);
            } else if (this.f92644n.mo24806j()) {
                this.f92644n.mo24803g();
            }
        } else {
            this.f92637g = false;
            if (this.f92646p) {
                this.f92646p = false;
                this.f92634d.unregisterReceiver(this.f92636f);
            }
        }
    }

    /* renamed from: d */
    public final void mo50991d() {
        f92631a.mo50711a("Reset phone on-person state", new Object[0]).mo50708c();
        this.f92639i = SystemClock.elapsedRealtime();
        this.f92633c.set(-1);
        this.f92651u = true;
    }

    /* renamed from: a */
    public final void mo50987a(long j, boolean z, int i) {
        int i2;
        if (this.f92651u) {
            bxvd da = bogt.f133026e.mo74144da();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bogt bogt = (bogt) da.f164949b;
            int i3 = bogt.f133028a | 1;
            bogt.f133028a = i3;
            bogt.f133029b = j;
            if (!z) {
                bogt.f133030c = 2;
                i2 = 2 | i3;
                bogt.f133028a = i2;
            } else {
                bogt.f133030c = 1;
                i2 = 2 | i3;
                bogt.f133028a = i2;
            }
            bogt.f133028a = i2 | 4;
            bogt.f133031d = i;
            this.f92650t.add((bogt) da.mo74062i());
            while (((long) this.f92650t.size()) > chac.f188164a.mo6606a().mo84860p()) {
                this.f92650t.removeFirst();
            }
        }
    }

    /* renamed from: a */
    public final void mo50988a(bogj bogj) {
        ArrayDeque arrayDeque = this.f92650t;
        if (bogj.f164950c) {
            bogj.mo74035c();
            bogj.f164950c = false;
        }
        bohi bohi = (bohi) bogj.f164949b;
        bohi bohi2 = bohi.f133070z;
        if (!bohi.f133084n.mo73666a()) {
            bohi.f133084n = bxvk.m124021a(bohi.f133084n);
        }
        bxsy.m123078a(arrayDeque, bohi.f133084n);
        aunx aunx = f92631a;
        int size = this.f92650t.size();
        StringBuilder sb = new StringBuilder(46);
        sb.append(size);
        sb.append(" PhonePositionInfo added to playlog");
        aunx.mo50711a(sb.toString(), new Object[0]).mo50708c();
        this.f92650t.clear();
        this.f92651u = false;
    }
}
