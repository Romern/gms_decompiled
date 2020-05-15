package p000;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.SystemClock;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: zlf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class zlf extends zim {

    /* renamed from: b */
    static final AtomicInteger f55369b = new AtomicInteger();

    /* renamed from: e */
    private static final srn f55370e = zvt.m46581a();

    /* renamed from: f */
    private static final AtomicLong f55371f = new AtomicLong(System.currentTimeMillis());

    /* renamed from: g */
    private static final Map f55372g = new ConcurrentHashMap();

    /* renamed from: c */
    final Map f55373c = new ConcurrentHashMap();

    /* renamed from: d */
    final long f55374d;

    /* renamed from: h */
    private final Map f55375h = new ConcurrentHashMap();

    /* renamed from: i */
    private final Context f55376i;

    /* renamed from: j */
    private final Map f55377j;

    public zlf(long j, Context context, zgf zgf, Map map) {
        super(zgf);
        this.f55374d = j;
        this.f55376i = context;
        this.f55377j = map;
    }

    /* renamed from: a */
    public static zlf m45676a(long j) {
        return (zlf) f55372g.get(Long.valueOf(j));
    }

    /* renamed from: b */
    private final yqg m45678b(zgh zgh) {
        caah caah = zgh.f55011a.f172330f;
        if (caah == null) {
            caah = caah.f172333d;
        }
        return (yqg) this.f55377j.get(caah);
    }

    /* renamed from: a */
    public static zlf m45677a(Context context, zgf zgf, Map map) {
        long incrementAndGet = f55371f.incrementAndGet();
        zlf zlf = new zlf(incrementAndGet, context, zgf, map);
        f55372g.put(Long.valueOf(incrementAndGet), zlf);
        return zlf;
    }

    /* renamed from: a */
    public final bqgg mo19155a(zgh zgh) {
        yqg b = m45678b(zgh);
        if (b != null) {
            if (zgh.f55013c >= b.f54387c) {
                int incrementAndGet = f55369b.incrementAndGet();
                Map map = this.f55375h;
                zgg zgg = zgh.f55012b;
                Integer valueOf = Integer.valueOf(incrementAndGet);
                map.put(zgg, valueOf);
                this.f55373c.put(valueOf, zgh);
                zgg zgg2 = zgh.f55012b;
                mo31222a(incrementAndGet, true);
                return bqga.m112775a((Object) true);
            }
            bnsl bnsl = (bnsl) f55370e.mo68390d();
            bnsl.mo68432a("zlf", "a", 108, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68417a("Request sample rate %sus is smaller than config minimum sample rate %sus", zgh.f55013c, b.f54387c);
        }
        return this.f55149a.mo19155a(zgh);
    }

    /* renamed from: a */
    public final zgh mo31221a(int i) {
        return (zgh) this.f55373c.get(Integer.valueOf(i));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo31222a(int i, boolean z) {
        zgh zgh = (zgh) this.f55373c.get(Integer.valueOf(i));
        if (zgh == null) {
            bnsl bnsl = (bnsl) f55370e.mo68388c();
            bnsl.mo68432a("zlf", "a", 142, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68409a("request no longer valid %s", i);
            return;
        }
        yqg b = m45678b(zgh);
        bmzs.m108696a(b);
        skc skc = new skc(this.f55376i);
        Intent intent = new Intent();
        intent.setClassName(this.f55376i, "com.google.android.gms.fitness.sensors.sample.CollectSensorService");
        intent.putExtra("adapter_id", this.f55374d);
        intent.putExtra("request_id", i);
        intent.putExtra("max_sample_points", b.f54386b);
        intent.putExtra("max_sample_secs", b.f54385a);
        intent.putExtra("disable_off_body", b.f54388d);
        intent.putExtra("allow_in_doze", b.f54389e);
        PendingIntent service = PendingIntent.getService(this.f55376i, i, intent, 134217728);
        long elapsedRealtime = SystemClock.elapsedRealtime() + TimeUnit.MICROSECONDS.toMillis(zgh.f55013c);
        System.currentTimeMillis();
        if (z) {
            int i2 = Build.VERSION.SDK_INT;
            skc.mo25673a("ManualSampleSensorAdapter", 2, elapsedRealtime, service);
            return;
        }
        skc.mo25675a("ManualSampleSensorAdapter", 2, elapsedRealtime, service, "com.google.android.gms");
    }

    /* renamed from: a */
    public final boolean mo19160a(zgg zgg) {
        boolean a = this.f55149a.mo19160a(zgg);
        Integer num = (Integer) this.f55375h.remove(zgg);
        if (num != null) {
            this.f55373c.remove(num);
        }
        return num != null || a;
    }
}
