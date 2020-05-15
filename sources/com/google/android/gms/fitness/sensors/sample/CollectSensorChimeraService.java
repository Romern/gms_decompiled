package com.google.android.gms.fitness.sensors.sample;

import android.content.Intent;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import com.felicanetworks.mfc.mfi.MfiClientException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class CollectSensorChimeraService extends rpx {

    /* renamed from: b */
    public static final srn f32383b = zvt.m46581a();

    /* renamed from: c */
    public final sqv f32384c;

    /* renamed from: d */
    public final ScheduledExecutorService f32385d;

    /* renamed from: e */
    private zlj f32386e;

    /* renamed from: f */
    private zle f32387f;

    public CollectSensorChimeraService() {
        this(srb.f45012a, snp.m35703a(1, 10));
    }

    /* renamed from: a */
    private final bqgg m23752a(boolean z, SensorManager sensorManager, Sensor sensor) {
        if (!z) {
            return bqga.m112775a((Object) true);
        }
        if (yua.m44838c(this)) {
            return bqga.m112775a((Object) false);
        }
        if (sensor != null) {
            bqgy c = bqgy.m112818c();
            if (sensorManager.registerListener(new zkx(this, sensorManager, c), sensor, 0)) {
                return bqfl.m112747c(c).mo69206a(10, TimeUnit.SECONDS, this.f32385d);
            }
            bnsl bnsl = (bnsl) f32383b.mo68388c();
            bnsl.mo68432a("com.google.android.gms.fitness.sensors.sample.CollectSensorChimeraService", "a", 241, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("Failed to register LLOB listener.");
        }
        if (yua.m44840e(this)) {
            return bqga.m112775a((Object) false);
        }
        return bqga.m112775a((Object) true);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final bqgg mo19162b(Intent intent) {
        Sensor sensor;
        bqgg bqgg;
        long longExtra = intent.getLongExtra("adapter_id", -1);
        zlf a = zlf.m45676a(longExtra);
        if (a == null) {
            bnsl bnsl = (bnsl) f32383b.mo68388c();
            bnsl.mo68432a("com.google.android.gms.fitness.sensors.sample.CollectSensorChimeraService", "b", (int) MfiClientException.TYPE_MFICLIENT_NOT_STARTED, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68415a("CollectSensorChimeraService did not find adapter %d", longExtra);
            return bqga.m112775a((Object) false);
        }
        bmzs.m108696a(a);
        int intExtra = intent.getIntExtra("request_id", -1);
        zgh a2 = a.mo31221a(intExtra);
        if (a2 == null) {
            bnsl bnsl2 = (bnsl) f32383b.mo68388c();
            bnsl2.mo68432a("com.google.android.gms.fitness.sensors.sample.CollectSensorChimeraService", "b", 163, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl2.mo68409a("CollectSensorChimeraService did not find request %d", intExtra);
            return bqga.m112775a((Object) false);
        }
        bmzs.m108696a(a2);
        SensorManager sensorManager = (SensorManager) getSystemService("sensor");
        if (cdzm.m135647c()) {
            sensor = (Sensor) bnjd.m109589b(sensorManager.getSensorList(34), (Object) null);
        } else {
            sensor = null;
        }
        if (!intent.getBooleanExtra("disable_off_body", true)) {
            bqgg = bqga.m112775a((Object) true);
        } else if (yua.m44838c(this)) {
            bqgg = bqga.m112775a((Object) false);
        } else {
            if (sensor != null) {
                bqgy c = bqgy.m112818c();
                if (sensorManager.registerListener(new zkx(this, sensorManager, c), sensor, 0)) {
                    bqgg = bqfl.m112747c(c).mo69206a(10, TimeUnit.SECONDS, this.f32385d);
                } else {
                    bnsl bnsl3 = (bnsl) f32383b.mo68388c();
                    bnsl3.mo68432a("com.google.android.gms.fitness.sensors.sample.CollectSensorChimeraService", "a", 241, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    bnsl3.mo68405a("Failed to register LLOB listener.");
                }
            }
            bqgg = yua.m44840e(this) ? bqga.m112775a((Object) false) : bqga.m112775a((Object) true);
        }
        return bqdx.m112674a(bqdf.m112619a(bqgg, Exception.class, zku.f55330a, bqfb.INSTANCE), new zkv(this, intent, a, intExtra, a2, sensor), bqfb.INSTANCE);
    }

    public final void onCreate() {
        super.onCreate();
        zle zle = new zle(this.f32385d);
        this.f32387f = zle;
        zle.f55368d = new zkr(this);
        this.f32386e = new zlj(this, this.f32387f, this.f32385d);
    }

    public CollectSensorChimeraService(sqv sqv, ScheduledExecutorService scheduledExecutorService) {
        super(CollectSensorChimeraService.class.getSimpleName(), "FITNESS");
        this.f32384c = sqv;
        this.f32385d = scheduledExecutorService;
    }

    /* renamed from: a */
    static final /* synthetic */ Boolean m23753a(Exception exc) {
        bnsl bnsl = (bnsl) f32383b.mo68387b();
        bnsl.mo68437a(exc);
        bnsl.mo68432a("com.google.android.gms.fitness.sensors.sample.CollectSensorChimeraService", "a", 177, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        bnsl.mo68405a("Error occurred");
        return false;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00bb  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00c3  */
    /* renamed from: a */
    public final void mo17286a(Intent intent) {
        boolean z;
        zla zla;
        bmxv bmxv;
        bqgg bqgg;
        int i;
        int i2;
        bqgg bqgg2;
        Sensor sensor;
        bqgg bqgg3;
        boolean z2;
        int intExtra;
        zgh a;
        zld zld;
        Intent intent2 = intent;
        int intExtra2 = intent2.getIntExtra("delay_trigger_seq_no", -1);
        if (intExtra2 != -1) {
            zle zle = this.f32387f;
            synchronized (zle.f55365b) {
                zld = (zld) zle.f55366c.remove(Integer.valueOf(intExtra2));
            }
            if (zld != null) {
                zle.f55367a.submit(zld.f55363a).isDone();
                return;
            }
            return;
        }
        intent2.getIntExtra("request_id", -1);
        zlj zlj = this.f32386e;
        zlf a2 = zlf.m45676a(intent2.getLongExtra("adapter_id", -1));
        if (a2 == null || (a = a2.mo31221a((intExtra = intent2.getIntExtra("request_id", -1)))) == null) {
            z = false;
            zla = null;
        } else {
            z = false;
            zla = new zla(a2, a, intExtra, intent2.getIntExtra("max_sample_points", 10), intent2.getIntExtra("max_sample_secs", 20), intent2.getBooleanExtra("allow_in_doze", false));
        }
        if (zla != null) {
            zlf zlf = zla.f55353a;
            zgh zgh = zla.f55354b;
            zgf zgf = zlf.f55149a;
            if (zgf instanceof zin) {
                Sensor b = ((zin) zgf).mo31155b(zgh.f55011a);
                if (b != null) {
                    bnre i3 = zlj.f55382a.listIterator();
                    while (true) {
                        if (!i3.hasNext()) {
                            break;
                        }
                        zli zli = (zli) i3.next();
                        if (zli.mo31213a(b)) {
                            bmxv = bmxv.m108566b(zli.mo31211a(zla));
                            break;
                        }
                    }
                } else {
                    bmxv = bmvz.f131120a;
                }
                if (!bmxv.mo66813a()) {
                    bqgg = (bqgg) bmxv.mo66814b();
                } else {
                    long longExtra = intent2.getLongExtra("adapter_id", -1);
                    zlf a3 = zlf.m45676a(longExtra);
                    if (a3 == null) {
                        bnsl bnsl = (bnsl) f32383b.mo68388c();
                        bnsl.mo68432a("com.google.android.gms.fitness.sensors.sample.CollectSensorChimeraService", "b", (int) MfiClientException.TYPE_MFICLIENT_NOT_STARTED, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                        bnsl.mo68415a("CollectSensorChimeraService did not find adapter %d", longExtra);
                        bqgg2 = bqga.m112775a(Boolean.valueOf(z));
                        i2 = 20;
                        i = 10;
                    } else {
                        bmzs.m108696a(a3);
                        int intExtra3 = intent2.getIntExtra("request_id", -1);
                        zgh a4 = a3.mo31221a(intExtra3);
                        if (a4 == null) {
                            bnsl bnsl2 = (bnsl) f32383b.mo68388c();
                            bnsl2.mo68432a("com.google.android.gms.fitness.sensors.sample.CollectSensorChimeraService", "b", 163, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                            bnsl2.mo68409a("CollectSensorChimeraService did not find request %d", intExtra3);
                            bqgg2 = bqga.m112775a(Boolean.valueOf(z));
                            i2 = 20;
                            i = 10;
                        } else {
                            bmzs.m108696a(a4);
                            SensorManager sensorManager = (SensorManager) getSystemService("sensor");
                            if (cdzm.m135647c()) {
                                sensor = (Sensor) bnjd.m109589b(sensorManager.getSensorList(34), (Object) null);
                            } else {
                                sensor = null;
                            }
                            if (!intent2.getBooleanExtra("disable_off_body", true)) {
                                bqgg3 = bqga.m112775a((Object) true);
                            } else if (yua.m44838c(this)) {
                                bqgg3 = bqga.m112775a(Boolean.valueOf(z));
                            } else {
                                if (sensor != null) {
                                    bqgy c = bqgy.m112818c();
                                    z2 = false;
                                    if (sensorManager.registerListener(new zkx(this, sensorManager, c), sensor, 0)) {
                                        bqgg3 = bqfl.m112747c(c).mo69206a(10, TimeUnit.SECONDS, this.f32385d);
                                    } else {
                                        bnsl bnsl3 = (bnsl) f32383b.mo68388c();
                                        bnsl3.mo68432a("com.google.android.gms.fitness.sensors.sample.CollectSensorChimeraService", "a", 241, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                                        bnsl3.mo68405a("Failed to register LLOB listener.");
                                    }
                                } else {
                                    z2 = false;
                                }
                                bqgg3 = yua.m44840e(this) ? bqga.m112775a(Boolean.valueOf(z2)) : bqga.m112775a((Object) true);
                            }
                            i2 = 20;
                            i = 10;
                            bqgg2 = bqdx.m112674a(bqdf.m112619a(bqgg3, Exception.class, zku.f55330a, bqfb.INSTANCE), new zkv(this, intent, a3, intExtra3, a4, sensor), bqfb.INSTANCE);
                        }
                    }
                    if (!bqgg2.isDone() && cdyx.f181991a.mo6606a().mo78524a()) {
                        int intExtra4 = intent2.getIntExtra("max_sample_secs", i2);
                        ((rpx) this).f43509a.mo49111a(TimeUnit.SECONDS.toMillis((long) (intExtra4 + intExtra4 + i)));
                        asfb asfb = ((rpx) this).f43509a;
                        asfb.getClass();
                        bqgg2.mo741a(new zkt(asfb), bqfb.INSTANCE);
                    }
                    bqgg = bqgg2;
                }
                bqgg.mo741a(new zks(), bqfb.INSTANCE);
            }
        }
        bmxv = bmvz.f131120a;
        if (!bmxv.mo66813a()) {
        }
        bqgg.mo741a(new zks(), bqfb.INSTANCE);
    }
}
