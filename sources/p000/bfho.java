package p000;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.hardware.Sensor;
import android.os.Build;
import android.os.Handler;
import com.google.android.location.collectionlib.RealCollectorConfig;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: bfho */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bfho {

    /* renamed from: i */
    public static final AtomicLong f113936i = new AtomicLong(0);

    /* renamed from: a */
    public final Object f113937a = new Object();

    /* renamed from: b */
    public final bhdb f113938b;

    /* renamed from: c */
    public final boolean f113939c;

    /* renamed from: d */
    public final boolean f113940d;

    /* renamed from: e */
    public final Map f113941e = new HashMap();

    /* renamed from: f */
    public bfdl f113942f;

    /* renamed from: g */
    public AlarmManager f113943g;

    /* renamed from: h */
    public PendingIntent f113944h;

    /* renamed from: j */
    public String f113945j = "";

    /* renamed from: k */
    public final Map f113946k = new HashMap();

    /* renamed from: l */
    public final bgmj f113947l;

    /* renamed from: m */
    public final bgns f113948m;

    /* renamed from: n */
    public final BroadcastReceiver f113949n = new bfhi(this);

    /* renamed from: o */
    private final bfeb f113950o;

    /* renamed from: p */
    private final long f113951p;

    /* renamed from: q */
    private final List f113952q;

    public bfho(bgns bgns, bfeb bfeb, long j, bhdb bhdb, boolean z, bgmj bgmj, boolean z2) {
        this.f113948m = bgns;
        this.f113951p = j;
        this.f113950o = bfeb;
        this.f113938b = bfib.m96837a(bhdb);
        this.f113939c = z;
        this.f113952q = new ArrayList(1);
        this.f113947l = bgmj;
        this.f113940d = z2;
    }

    /* renamed from: a */
    public static final void m96782a(AlarmManager alarmManager, int i, long j, PendingIntent pendingIntent) {
        int i2 = Build.VERSION.SDK_INT;
        alarmManager.setAndAllowWhileIdle(i, j, pendingIntent);
    }

    /* renamed from: c */
    private final Set m96783c() {
        EnumSet noneOf = EnumSet.noneOf(bfgt.class);
        for (Integer num : this.f113941e.keySet()) {
            bfgt bfgt = (bfgt) RealCollectorConfig.f150690b.get(num);
            if (bfgt != null) {
                noneOf.add(bfgt);
            }
        }
        return noneOf;
    }

    /* renamed from: b */
    public final void mo61706b() {
        synchronized (this.f113937a) {
            AlarmManager alarmManager = this.f113943g;
            if (alarmManager != null) {
                alarmManager.cancel(this.f113944h);
            }
            if (!this.f113940d) {
                for (bfgc bfgc : this.f113952q) {
                    bfgb a = bfgc.mo61641a();
                    if (a != null) {
                        int type = a.f113736b.getType();
                        StringBuilder sb = new StringBuilder(40);
                        sb.append("OnChange sensors SensorType: ");
                        sb.append(type);
                        sb.toString();
                        mo61704a(a.f113736b, new long[]{a.f113737c}, new long[]{a.f113738d}, new float[][]{a.f113735a});
                    }
                }
            }
            bfdl bfdl = this.f113942f;
            if (bfdl != null) {
                bfdl.f113491c.post(new bfhj(this));
            }
        }
    }

    /* renamed from: a */
    public final void mo61703a() {
        bffc bffc;
        synchronized (this.f113937a) {
            Map map = this.f113946k;
            if (map != null) {
                if (map.containsKey(1)) {
                    Long l = (Long) this.f113946k.get(1);
                    bmxy.m108581a(l);
                    bfeb bfeb = this.f113950o;
                    Set c = m96783c();
                    long longValue = l.longValue();
                    synchronized (bfeb.f113550c) {
                        bffc = new bffc(bfeb.f113556i, bfeb.f113549b, this, c, -1, longValue, bfeb.f113557j, bfeb);
                    }
                    bfeb.mo61520a(bffc, this);
                }
            }
            this.f113950o.mo61523a(m96783c(), 30000, this);
        }
    }

    /* renamed from: a */
    public final void mo61704a(Sensor sensor, long[] jArr, long[] jArr2, float[][] fArr) {
        synchronized (this.f113937a) {
            bfne bfne = (bfne) this.f113941e.get(Integer.valueOf(sensor.getType()));
            int length = jArr.length;
            if (length > 0) {
                this.f113946k.put(Integer.valueOf(sensor.getType()), Long.valueOf(jArr[length - 1]));
            }
            if (bfne != null) {
                bfgw bfgw = (bfgw) bfne.f114467a;
                Handler handler = (Handler) bfne.f114468b;
                bmxy.m108581a(bfgw);
                bmxy.m108581a(handler);
                handler.post(new bfhk(bfgw, sensor, jArr, jArr2, fArr));
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0020, code lost:
        r0 = ((java.lang.Integer) r6.next()).intValue();
        r1 = p000.bfgx.m96741a(r0);
        r2 = r5.f113950o;
        r3 = r2.f113550c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0032, code lost:
        monitor-enter(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
        r2 = r2.f113553f.get(r1.f113836x);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x003b, code lost:
        monitor-exit(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x003c, code lost:
        if (r2 != null) goto L_0x0044;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0041, code lost:
        if (r1.f113835B != 2) goto L_0x0044;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0046, code lost:
        if (r5.f113940d == false) goto L_0x001a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0048, code lost:
        r5.f113952q.add(new p000.bfgc(r7, r0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x005e, code lost:
        if (r5.f113950o.f113549b.mo61686a() == false) goto L_0x0073;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0060, code lost:
        r6 = r5.f113937a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0062, code lost:
        monitor-enter(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:?, code lost:
        r5.f113950o.mo61523a(m96783c(), r5.f113951p, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x006e, code lost:
        monitor-exit(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x006f, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0073, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0016, code lost:
        r6 = r6.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001e, code lost:
        if (r6.hasNext() == false) goto L_0x0056;
     */
    /* renamed from: a */
    public final void mo61705a(bfdl bfdl, Context context) {
        synchronized (this.f113937a) {
            this.f113942f = bfdl;
            if (m96783c().size() != 0) {
                Set keySet = this.f113941e.keySet();
            } else {
                mo61706b();
            }
        }
    }
}
