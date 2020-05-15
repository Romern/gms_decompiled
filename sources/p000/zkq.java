package p000;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.os.Build;
import com.google.android.gms.fitness.sensors.sample.CollectSensorChimeraService;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* renamed from: zkq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class zkq implements zli {

    /* renamed from: b */
    public static final /* synthetic */ int f55322b = 0;

    /* renamed from: c */
    private static final srn f55323c = zvt.m46581a();

    /* renamed from: a */
    public final ScheduledExecutorService f55324a;

    /* renamed from: d */
    private final Context f55325d;

    /* renamed from: e */
    private final zlh f55326e;

    /* renamed from: f */
    private final zle f55327f;

    public zkq(Context context, zlh zlh, zle zle, ScheduledExecutorService scheduledExecutorService) {
        this.f55325d = context;
        this.f55326e = zlh;
        this.f55324a = scheduledExecutorService;
        this.f55327f = zle;
    }

    /* renamed from: a */
    public final bqgg mo31211a(zla zla) {
        bqgg bqgg;
        zla zla2 = zla;
        asfb asfb = new asfb(this.f55325d, 1, "AlarmStrategyWakeLock");
        TimeUnit timeUnit = TimeUnit.SECONDS;
        int i = zla2.f55357e;
        asfb.mo49111a(timeUnit.toMillis((long) (i + i)));
        zlh zlh = this.f55326e;
        if (yua.m44838c(zlh.f55381b)) {
            bqgg = bqga.m112775a((Object) false);
        } else {
            boolean e = yua.m44840e(zlh.f55381b);
            Sensor b = zlh.mo31224b();
            if (b != null) {
                SensorManager sensorManager = (SensorManager) zlh.f55381b.getSystemService("sensor");
                bqgy c = bqgy.m112818c();
                if (!sensorManager.registerListener(new zlg(zlh.f55381b, sensorManager, c), b, 0)) {
                    bnsl bnsl = (bnsl) zlh.f55380a.mo68388c();
                    bnsl.mo68432a("zlh", "a", 73, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    bnsl.mo68405a("Failed to register LLOB listener.");
                    bqgg = bqga.m112775a(Boolean.valueOf(!e));
                } else {
                    bqgg = c;
                }
            } else {
                bqgg = bqga.m112775a(Boolean.valueOf(!e));
            }
        }
        bqgg a = bqdx.m112674a(bqga.m112773a(bqgg, 10, TimeUnit.SECONDS, this.f55324a), new zkj(this, asfb, zla2), this.f55324a);
        zle zle = this.f55327f;
        zkk zkk = new zkk(a);
        int i2 = zla2.f55357e;
        TimeUnit timeUnit2 = TimeUnit.SECONDS;
        int incrementAndGet = zlf.f55369b.incrementAndGet();
        bqgy c2 = bqgy.m112818c();
        c2.mo741a(new zlb(c2, incrementAndGet), zle.f55367a);
        long j = (long) i2;
        CollectSensorChimeraService collectSensorChimeraService = zle.f55368d.f55328a;
        skc skc = new skc(collectSensorChimeraService);
        Intent intent = new Intent();
        intent.setClassName(collectSensorChimeraService, "com.google.android.gms.fitness.sensors.sample.CollectSensorService");
        intent.putExtra("delay_trigger_seq_no", incrementAndGet);
        PendingIntent service = PendingIntent.getService(collectSensorChimeraService, incrementAndGet, intent, 134217728);
        skc.mo25679b("DelayedRunner", 2, timeUnit2.toMillis(j) + collectSensorChimeraService.f32384c.mo20506b(), service);
        timeUnit2.toMillis(j);
        zld zld = new zld(new zlc(c2, zkk), new zkw(skc, service));
        synchronized (zle.f55365b) {
            zle.f55366c.put(Integer.valueOf(incrementAndGet), zld);
        }
        a.mo741a(new zkl(this, a, bqfl.m112747c(c2), zla2), bqfb.INSTANCE);
        return a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ void mo31212a(bqgg bqgg, bqgg bqgg2, zla zla) {
        boolean z;
        boolean z2 = false;
        try {
            z = ((Boolean) bqgg.get()).booleanValue();
        } catch (CancellationException e) {
            z = false;
        } catch (InterruptedException | ExecutionException e2) {
            bnsl bnsl = (bnsl) f55323c.mo68387b();
            bnsl.mo68437a(e2);
            bnsl.mo68432a("zkq", "a", 96, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("error in checkLlobAndSample");
            z = false;
        }
        bqgg2.cancel(false);
        Sensor b = this.f55326e.mo31224b();
        zlf zlf = zla.f55353a;
        int i = zla.f55355c;
        if (z && b != null && zla.f55358f) {
            z2 = true;
        }
        zlf.mo31222a(i, z2);
    }

    /* renamed from: a */
    public final boolean mo31213a(Sensor sensor) {
        int i = Build.VERSION.SDK_INT;
        return "sawshark".equals(Build.PRODUCT) || sensor.isWakeUpSensor();
    }
}
