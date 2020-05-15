package p000;

import android.content.Context;
import android.location.Location;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.SystemClock;
import com.google.android.gms.car.CarSensorEvent;
import java.util.Calendar;
import java.util.Random;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: npx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class npx extends nsq {

    /* renamed from: a */
    public static final bnsn f36356a = odk.m28481a("CAR.SENSOR");

    /* renamed from: b */
    static final int[] f36357b = {11, 9, 2, 7, 6};

    /* renamed from: A */
    private final rjx f36358A;

    /* renamed from: c */
    public final nwj f36359c;

    /* renamed from: d */
    nmv f36360d;

    /* renamed from: e */
    boolean f36361e = false;

    /* renamed from: f */
    boolean f36362f = false;

    /* renamed from: g */
    Location f36363g = null;

    /* renamed from: h */
    final AtomicBoolean f36364h = new AtomicBoolean(false);

    /* renamed from: i */
    long f36365i = 0;

    /* renamed from: j */
    public final Random f36366j = new Random();

    /* renamed from: k */
    public Location f36367k = new Location("Car-GPS");

    /* renamed from: l */
    public final oll f36368l = new oll();

    /* renamed from: m */
    public int f36369m = 0;

    /* renamed from: n */
    public Location f36370n;

    /* renamed from: o */
    public final Runnable f36371o = new npv(this);

    /* renamed from: p */
    public final Runnable f36372p = new npw(this);

    /* renamed from: q */
    private boolean f36373q = false;

    /* renamed from: r */
    private boolean f36374r = false;

    /* renamed from: s */
    private final HandlerThread f36375s;

    /* renamed from: t */
    private final npd f36376t;

    /* renamed from: u */
    private final Handler f36377u;

    /* renamed from: v */
    private final nmn f36378v = new nmn();

    /* renamed from: w */
    private final nml f36379w = new nml();

    /* renamed from: x */
    private final nmm f36380x = new nmm();

    /* renamed from: y */
    private final nmk f36381y = new nmk();

    /* renamed from: z */
    private final nmo f36382z = new nmo();

    public npx(npd npd, Context context, nwj nwj, HandlerThread handlerThread) {
        rjx c = aeie.m51878c(context.getApplicationContext());
        this.f36375s = handlerThread;
        this.f36376t = npd;
        this.f36359c = nwj;
        this.f36377u = new adzt(handlerThread.getLooper());
        this.f36358A = c;
    }

    /* renamed from: a */
    public final void mo21435a(Location location) {
        rjx rjx = this.f36358A;
        roz b = rpa.m34196b();
        b.f43472a = new aegx(location);
        rjx.mo24732b(b.mo24977a());
    }

    /* renamed from: b */
    public final String mo21441b() {
        return this.f36376t.mo21379a("car_day_night_mode", "car");
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final void mo21442c() {
        this.f36377u.removeCallbacksAndMessages(null);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final boolean mo21443d() {
        if (SystemClock.elapsedRealtime() - this.f36365i < 1800) {
            bnsi c = f36356a.mo68388c();
            c.mo68432a("npx", "d", 485, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            c.mo68405a("Fake location inject fired but it was up to date.");
            return false;
        } else if (this.f36363g == null || !this.f36364h.get()) {
            return true;
        } else {
            this.f36363g.removeSpeed();
            this.f36363g.setAccuracy(7.89f);
            this.f36363g.setElapsedRealtimeNanos(SystemClock.elapsedRealtimeNanos());
            this.f36363g.setTime(SystemClock.currentThreadTimeMillis());
            mo21435a(this.f36363g);
            return true;
        }
    }

    /* renamed from: a */
    public final void mo21436a(CarSensorEvent carSensorEvent) {
        int i = carSensorEvent.f29364b;
        boolean z = true;
        boolean z2 = false;
        if (i == 2) {
            nmk nmk = this.f36381y;
            carSensorEvent.mo17332a(2);
            if (nmk == null) {
                nmk = new nmk();
            }
            float[] fArr = carSensorEvent.f29366d;
            nmk.f36041a = fArr[0];
            if (carSensorEvent.f29363a >= 3) {
                byte b = carSensorEvent.f29367e[0];
                float f = fArr[1];
            }
            float f2 = this.f36381y.f36041a;
            AtomicBoolean atomicBoolean = this.f36364h;
            if (f2 >= 0.5f || f2 <= -0.5f) {
                z = false;
            }
            atomicBoolean.set(z);
        } else if (i == 6) {
            nmo nmo = this.f36382z;
            carSensorEvent.mo17332a(6);
            if (nmo == null) {
                nmo = new nmo();
            }
            if (carSensorEvent.f29367e[0] == 1) {
                z2 = true;
            }
            nmo.f36045a = z2;
            if (this.f36382z.f36045a) {
                this.f36364h.set(true);
            }
        } else if (i != 7) {
            switch (i) {
                case 9:
                    nmn nmn = this.f36378v;
                    carSensorEvent.mo17332a(9);
                    if (nmn == null) {
                        nmn = new nmn();
                    }
                    nmn.f36044a = carSensorEvent.f29367e[0];
                    if (this.f36378v.f36044a != 1) {
                        z = false;
                    }
                    mo21439a(z, "SENSOR");
                    return;
                case 10:
                    nuu.m27791a(this.f36375s.getLooper(), new npu(this, carSensorEvent));
                    return;
                case 11:
                    nml nml = this.f36379w;
                    carSensorEvent.mo17332a(11);
                    if (nml == null) {
                        nml = new nml();
                    }
                    nml.f36042a = carSensorEvent.f29367e[0];
                    byte b2 = this.f36379w.f36042a;
                    return;
                default:
                    StringBuilder sb = new StringBuilder(29);
                    sb.append("unrequested event ");
                    sb.append(i);
                    throw new RuntimeException(sb.toString());
            }
        } else {
            nmm nmm = this.f36380x;
            carSensorEvent.mo17332a(7);
            if (nmm == null) {
                nmm = new nmm();
            }
            nmm.f36043a = carSensorEvent.f29367e[0];
            if (this.f36380x.f36043a == 101) {
                this.f36364h.set(true);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo21437a(Runnable runnable, long j) {
        this.f36377u.postDelayed(runnable, j);
    }

    /* renamed from: a */
    public final void mo21438a(nmv nmv) {
        this.f36360d = nmv;
        nuu.m27791a(this.f36375s.getLooper(), new npt(this));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo21439a(boolean z, String str) {
        int i;
        int i2;
        if (!mo21440a()) {
            String b = mo21441b();
            if (!"car".equals(b)) {
                if ("day".equals(b)) {
                    z = false;
                } else if ("night".equals(b) || ((i = this.f36369m) != 0 ? i == 2 : !((i2 = Calendar.getInstance().get(11)) >= 5 && i2 <= 21))) {
                    z = true;
                }
            }
            if (this.f36374r != z || !this.f36373q) {
                bnsi d = f36356a.mo68390d();
                d.mo68432a("npx", "a", 403, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                d.mo68425a("handleDayNightEvent. Source = %s; Mode = %s; Night = %b", str, mo21441b(), Boolean.valueOf(z));
                this.f36373q = true;
                this.f36359c.mo21751a(z);
                this.f36374r = z;
            }
        }
    }

    /* renamed from: a */
    public final boolean mo21440a() {
        return "Demo".equals(this.f36376t.mo21379a("car_app_mode", "Release"));
    }
}
