package p000;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Build;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* renamed from: zjm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class zjm implements zgf, zin {

    /* renamed from: a */
    public static final srn f55217a = zvt.m46581a();

    /* renamed from: l */
    private static final bnhe f55218l = bnhe.m109409a(19, zjh.f55205a, 21, zji.f55206a);

    /* renamed from: b */
    public final Executor f55219b;

    /* renamed from: c */
    public final bnnn f55220c;

    /* renamed from: d */
    public final ytp f55221d;

    /* renamed from: e */
    private final SensorManager f55222e;

    /* renamed from: f */
    private final zjn f55223f;

    /* renamed from: g */
    private final caaq f55224g;

    /* renamed from: h */
    private final zki f55225h = new zki();

    /* renamed from: i */
    private final zjo f55226i;

    /* renamed from: j */
    private final zjs f55227j;

    /* renamed from: k */
    private final Set f55228k;

    public zjm(Context context, Set set, SensorManager sensorManager, zjn zjn, zjo zjo, Executor executor, ytp ytp) {
        this.f55228k = set;
        this.f55222e = sensorManager;
        this.f55223f = zjn;
        this.f55224g = zvn.m46574a(context);
        this.f55226i = zjo;
        this.f55219b = executor;
        this.f55221d = ytp;
        this.f55227j = new zjs(zjo);
        this.f55220c = bngf.m109301b(set.size());
    }

    /* renamed from: a */
    private static int m45587a(long j, zgh zgh) {
        if (j <= 2147483647L) {
            return (int) j;
        }
        bnsl bnsl = (bnsl) f55217a.mo68388c();
        bnsl.mo68432a("zjm", "a", 323, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        bnsl.mo68423a("Request [%s] specified a duration in micros which SensorManager won't support. The value is truncated to maximum supported value: [%ds].", zgh, TimeUnit.MICROSECONDS.toSeconds(2147483647L));
        return Integer.MAX_VALUE;
    }

    /* renamed from: c */
    private final zjf m45591c(caah caah) {
        for (zjf zjf : this.f55228k) {
            if (bzzn.m126363a(zjf.f55203e, caah)) {
                return zjf;
            }
        }
        return null;
    }

    /* renamed from: b */
    public final Sensor mo31155b(caae caae) {
        caah caah = caae.f172330f;
        if (caah == null) {
            caah = caah.f172333d;
        }
        zjf c = m45591c(caah);
        if (c != null) {
            caaq caaq = this.f55224g;
            caaq caaq2 = caae.f172331g;
            if (caaq2 == null) {
                caaq2 = caaq.f172356h;
            }
            if (caaq.equals(caaq2)) {
                List<Sensor> a = m45588a(c.f55202d);
                if (!a.isEmpty()) {
                    for (Sensor sensor : a) {
                        if (caae.equals(c.mo31167a(this.f55224g, sensor))) {
                            return sensor;
                        }
                    }
                    return (Sensor) a.get(0);
                }
            }
        }
        return null;
    }

    /* renamed from: a */
    private final List m45588a(int i) {
        List<Sensor> sensorList = this.f55222e.getSensorList(i);
        bmzi bmzi = (bmzi) f55218l.get(Integer.valueOf(i));
        if (sensorList.size() > 1 && bmzi != null) {
            int i2 = Build.VERSION.SDK_INT;
            boolean booleanValue = ((Boolean) bmzi.mo6606a()).booleanValue();
            for (Sensor sensor : sensorList) {
                if (sensor.isWakeUpSensor() == booleanValue) {
                    return bngx.m109356a(sensor);
                }
            }
            bnsl bnsl = (bnsl) f55217a.mo68387b();
            bnsl.mo68432a("zjm", "a", 314, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68425a("Could not find any sensor of type %d in %s matching the wakeup option %s.", Integer.valueOf(i), sensorList, Boolean.valueOf(booleanValue));
        }
        return sensorList;
    }

    /* renamed from: a */
    private final List m45589a(zjf zjf) {
        if (zjf == zjf.STEP_COUNTER && cdzd.m135493v()) {
            return bngx.m109376e();
        }
        int i = zjf.f55202d;
        bmxy.m108582a(this.f55222e, "Sensor manager null");
        return m45588a(i);
    }

    /* renamed from: b */
    public final bngx mo19161b(caah caah) {
        zjf c = m45591c(caah);
        if (c == null) {
            return bngx.m109376e();
        }
        bngs j = bngx.m109377j();
        for (Sensor sensor : m45589a(c)) {
            j.mo67668c(c.mo31167a(this.f55224g, sensor));
        }
        return j.mo67664a();
    }

    /* renamed from: a */
    private final synchronized boolean m45590a(zgh zgh, SensorEventListener sensorEventListener) {
        boolean z;
        Sensor b = mo31155b(zgh.f55011a);
        if (b != null) {
            int a = m45587a(zgh.f55013c, zgh);
            int a2 = m45587a(zgh.f55014d, zgh);
            zki zki = this.f55225h;
            zkg zkg = new zkg();
            zkg.f55292a = zgh.f55012b;
            zkg.f55293b = sensorEventListener;
            zkg.mo31199a((long) a, (long) a2);
            zki.mo31205a(zkg.mo31198a());
            int i = Build.VERSION.SDK_INT;
            int maxDelay = b.getMaxDelay();
            if (maxDelay > 0) {
                if (a > maxDelay) {
                    a = maxDelay;
                }
            }
            int i2 = Build.VERSION.SDK_INT;
            z = this.f55222e.registerListener(sensorEventListener, b, a, a2);
        } else {
            z = false;
        }
        return z;
    }

    /* renamed from: a */
    public final synchronized bqgg mo19154a() {
        ArrayList arrayList;
        int i = Build.VERSION.SDK_INT;
        arrayList = new ArrayList();
        Collection<zkh> values = this.f55225h.f55305a.values();
        bnia c = bnic.m109499c(values.size());
        for (zkh zkh : values) {
            c.mo67629b(zkh.f55299b);
        }
        bnrd a = c.mo67751a().iterator();
        while (a.hasNext()) {
            SensorEventListener sensorEventListener = (SensorEventListener) a.next();
            bqgy c2 = bqgy.m112818c();
            ((zjl) sensorEventListener).mo31172a(c2);
            arrayList.add(c2);
            this.f55222e.flush(sensorEventListener);
        }
        return bqdx.m112673a(bqga.m112774a((Iterable) arrayList), zjg.f55204a, bqfb.INSTANCE);
    }

    /* renamed from: a */
    public final bqgg mo19155a(zgh zgh) {
        caae caae = zgh.f55011a;
        caah caah = caae.f172330f;
        if (caah == null) {
            caah = caah.f172333d;
        }
        zjf c = m45591c(caah);
        boolean z = false;
        if (c != null) {
            caaq caaq = caae.f172331g;
            if (caaq == null) {
                caaq = caaq.f172356h;
            }
            if (caaq.equals(this.f55224g)) {
                zgg zgg = zgh.f55012b;
                int i = Build.VERSION.SDK_INT;
                z = m45590a(zgh, new zjl(this, zgg, c, caae, this.f55223f, this.f55226i, this.f55227j));
            }
        }
        return bqga.m112775a(Boolean.valueOf(z));
    }

    /* renamed from: a */
    public final void mo19156a(PrintWriter printWriter) {
        printWriter.append((CharSequence) "  LocalSensorAdapter[");
        for (zjf zjf : this.f55228k) {
            printWriter.append((CharSequence) zjf.name()).append((CharSequence) ",");
        }
        printWriter.append((CharSequence) " dropped events: [");
        for (bnno bnno : this.f55220c.mo67324e()) {
            printWriter.append((CharSequence) ((caae) bnno.f131866a).f172326b).append((CharSequence) "-").append((CharSequence) Integer.toString(bnno.mo68118a())).append((CharSequence) ",");
        }
        printWriter.append((CharSequence) "]");
        zjn zjn = this.f55223f;
        printWriter.append((CharSequence) "    bootTimeNanos: ").append((CharSequence) Long.toString(zjn.f55231c)).append((CharSequence) "\n");
        for (Map.Entry<String, ?> entry : zjn.f55230b.getAll().entrySet()) {
            if (!entry.getKey().equals("bootTimeNanos")) {
                PrintWriter append = printWriter.append((CharSequence) "    sensorOffset[key=").append((CharSequence) entry.getKey()).append((CharSequence) ",offsetNanos=");
                Object value = entry.getValue();
                bmxy.m108581a(value);
                append.append((CharSequence) value.toString()).append((CharSequence) "]\n");
            }
        }
        Collection<zkh> values = this.f55225h.f55305a.values();
        if (!values.isEmpty()) {
            printWriter.append((CharSequence) "    registrations").append((CharSequence) ": ");
            for (zkh zkh : values) {
                printWriter.append((CharSequence) String.format("%s(%ss/%ss) [since %s]", zkh.f55298a, Long.valueOf(TimeUnit.MICROSECONDS.toSeconds(zkh.f55302e)), Long.valueOf(TimeUnit.MICROSECONDS.toSeconds(zkh.f55303f)), zkh.m45660a(zkh.f55304g)));
                printWriter.append((CharSequence) " ");
            }
            printWriter.append((CharSequence) "\n");
        }
    }

    /* renamed from: a */
    public final boolean mo19158a(caae caae) {
        caah caah = caae.f172330f;
        if (caah == null) {
            caah = caah.f172333d;
        }
        if (!mo19159a(caah)) {
            return false;
        }
        caad caad = caad.RAW;
        caad a = caad.m126389a(caae.f172329e);
        if (a == null) {
            a = caad.RAW;
        }
        if (!caad.equals(a)) {
            return false;
        }
        caaq caaq = this.f55224g;
        caaq caaq2 = caae.f172331g;
        if (caaq2 == null) {
            caaq2 = caaq.f172356h;
        }
        if (!caaq.equals(caaq2)) {
            return false;
        }
        bzzz bzzz = caae.f172332h;
        if (bzzz == null) {
            bzzz = bzzz.f172298f;
        }
        if ((bzzz.f172300a & 1) != 0) {
            bzzz bzzz2 = caae.f172332h;
            if (bzzz2 == null) {
                bzzz2 = bzzz.f172298f;
            }
            if (bzzz2.f172301b.equals("com.google.android.gms")) {
                return true;
            }
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public final boolean mo19159a(caah caah) {
        zjf c = m45591c(caah);
        return c != null && !m45589a(c).isEmpty();
    }

    /* renamed from: a */
    public final synchronized boolean mo19160a(zgg zgg) {
        boolean z;
        zkh a = this.f55225h.mo31204a(zgg);
        if (a != null) {
            bnsl bnsl = (bnsl) f55217a.mo68390d();
            bnsl.mo68432a("zjm", "a", 338, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68420a("Removing hardware listener for registration %s", a);
            this.f55222e.unregisterListener(a.f55299b);
            z = true;
        } else {
            z = false;
        }
        return z;
    }
}
