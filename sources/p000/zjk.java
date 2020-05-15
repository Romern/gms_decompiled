package p000;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.os.RemoteException;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* renamed from: zjk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
class zjk extends aaco {

    /* renamed from: a */
    public final zgg f55209a;

    /* renamed from: b */
    public final zjf f55210b;

    /* renamed from: c */
    public final caae f55211c;

    /* renamed from: d */
    public final zjn f55212d;

    /* renamed from: e */
    public final zjo f55213e;

    /* renamed from: f */
    public final zjs f55214f;

    /* renamed from: g */
    final /* synthetic */ zjm f55215g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zjk(zjm zjm, zgg zgg, zjf zjf, caae caae, zjn zjn, zjo zjo, zjs zjs) {
        super("LocalSensorAdapter$ConvertingListener", "fitness");
        this.f55215g = zjm;
        this.f55209a = zgg;
        this.f55210b = zjf;
        this.f55211c = caae;
        this.f55212d = zjn;
        this.f55213e = zjo;
        this.f55214f = zjs;
    }

    /* renamed from: a */
    public final void mo9869a(SensorEvent sensorEvent) {
        zjm zjm = this.f55215g;
        srn srn = zjm.f55217a;
        zjm.f55219b.execute(new zjj(this, sensorEvent));
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:103:0x02d6  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0168  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x01e7  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x0234  */
    /* renamed from: b */
    public final /* synthetic */ void mo31171b(SensorEvent sensorEvent) {
        int i;
        long j;
        int ordinal;
        cadn cadn;
        long j2;
        long j3;
        SensorEvent sensorEvent2 = sensorEvent;
        zjm zjm = this.f55215g;
        srn srn = zjm.f55217a;
        ytp ytp = zjm.f55221d;
        int type = sensorEvent2.sensor.getType();
        if (type != 19) {
            i = type != 21 ? 1 : 5;
        } else {
            i = 6;
        }
        ytp.mo30768a(i);
        if (this.f55209a != null) {
            zjs zjs = this.f55214f;
            caae caae = this.f55211c;
            caah caah = bzzn.f172101an;
            caah caah2 = caae.f172330f;
            if (caah2 == null) {
                caah2 = caah.f172333d;
            }
            if (caah.equals(caah2)) {
                if (((int) sensorEvent2.values[0]) < 0) {
                    bnsl bnsl = (bnsl) zjs.f55244a.mo68388c();
                    bnsl.mo68432a("zjs", "a", 40, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    bnsl.mo68420a("Discarding event with negative step counts: %s", zjs.m45611a(sensorEvent));
                    return;
                }
                long nanos = TimeUnit.MILLISECONDS.toNanos(System.currentTimeMillis());
                cadn a = zjs.f55245b.mo31175a(caae);
                if (a == null) {
                    bnsl bnsl2 = (bnsl) zjs.f55244a.mo68390d();
                    bnsl2.mo68432a("zjs", "a", 48, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    bnsl2.mo68420a("No last event in the cache... letting sensor event %s through.", zjs.m45611a(sensorEvent));
                } else {
                    if (cdzd.m135489r() >= 0) {
                        if (sensorEvent2.timestamp > TimeUnit.MILLISECONDS.toNanos(cdzd.m135489r()) + nanos && a.f172707g <= nanos) {
                            bnsl bnsl3 = (bnsl) zjs.f55244a.mo68388c();
                            bnsl3.mo68432a("zjs", "a", 59, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                            bnsl3.mo68420a("Discarding event with timestamp in the future: %s", zjs.m45611a(sensorEvent));
                            return;
                        }
                    }
                    if (cdzd.m135490s() >= 0) {
                        long nanos2 = TimeUnit.MILLISECONDS.toNanos(cdzd.m135490s());
                        if (sensorEvent2.timestamp < nanos - nanos2 && sensorEvent2.timestamp < a.f172707g - nanos2) {
                            bnsl bnsl4 = (bnsl) zjs.f55244a.mo68388c();
                            bnsl4.mo68432a("zjs", "a", 70, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                            bnsl4.mo68420a("Discarding event with timestamp too far in the past: %s", zjs.m45611a(sensorEvent));
                            return;
                        }
                    }
                }
            }
            zjn zjn = this.f55212d;
            long nanos3 = TimeUnit.MILLISECONDS.toNanos(System.currentTimeMillis());
            Sensor sensor = sensorEvent2.sensor;
            int type2 = sensor.getType();
            String name = sensor.getName();
            StringBuilder sb = new StringBuilder(String.valueOf(name).length() + 12);
            sb.append(type2);
            sb.append(":");
            sb.append(name);
            String sb2 = sb.toString();
            long j4 = zjn.f55230b.getLong(sb2, -1);
            if (j4 != -1) {
                long j5 = sensorEvent2.timestamp + j4;
                if (j4 >= 0 && j5 <= nanos3) {
                    j = j4;
                    zjf zjf = this.f55210b;
                    caae caae2 = this.f55211c;
                    long a2 = this.f55212d.mo31174a();
                    ordinal = zjf.ordinal();
                    cadn = null;
                    if (ordinal != 0) {
                        float f = sensorEvent2.values[0];
                        if (f <= 0.0f || sensorEvent2.accuracy < ((int) cdzm.f182081a.mo6606a().mo78610b())) {
                            zjf.mo31169a(sensorEvent2);
                        } else {
                            if (!cdzd.f182003a.mo6606a().mo78542I()) {
                                j2 = zjf.m45577a(sensorEvent2.timestamp, j);
                            } else {
                                j2 = zjf.m45578a(sensorEvent2.timestamp, a2, j);
                            }
                            cadn = yyk.m45012a(caae2, j2, TimeUnit.NANOSECONDS, (double) f);
                        }
                    } else if (ordinal == 1) {
                        if (!cdzd.f182003a.mo6606a().mo78545L()) {
                            long a3 = zjf.m45577a(sensorEvent2.timestamp, j);
                            if (a3 < a2) {
                                bnsl bnsl5 = (bnsl) zjf.f55200c.mo68387b();
                                bnsl5.mo68432a("zjf", "a", 64, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                                bnsl5.mo68418a("Got sensor event with timestamp before boot (%d): %s", a2, zjf.mo31169a(sensorEvent2));
                                j3 = a2;
                            } else {
                                j3 = a3;
                            }
                        } else {
                            j3 = zjf.m45578a(sensorEvent2.timestamp, a2, j);
                        }
                        if (zjn.m45603a(a2)) {
                            cadn = yyk.m45011a(caae2, a2, j3, TimeUnit.NANOSECONDS, yyp.m45047a((int) sensorEvent2.values[0]));
                        } else {
                            bnsl bnsl6 = (bnsl) zjf.f55200c.mo68388c();
                            bnsl6.mo68432a("zjf", "a", 79, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                            bnsl6.mo68418a("Invalid boot time: %s. Event discarded: %s.", a2, zjf.mo31169a(sensorEvent2));
                        }
                    } else {
                        throw null;
                    }
                    if (cadn == null) {
                        ytp ytp2 = this.f55215g.f55221d;
                        caah caah3 = this.f55211c.f172330f;
                        if (caah3 == null) {
                            caah3 = caah.f172333d;
                        }
                        ytp2.mo30770a(caah3, 1);
                        bxvd bxvd = (bxvd) cadn.mo74142c(5);
                        bxvd.mo73625a((GeneratedMessageLite) cadn);
                        cadm cadm = (cadm) bxvd;
                        long j6 = sensorEvent2.timestamp;
                        if (cadm.f164950c) {
                            cadm.mo74035c();
                            cadm.f164950c = false;
                        }
                        cadn cadn2 = (cadn) cadm.f164949b;
                        cadn2.f172701a |= 16;
                        cadn2.f172707g = j6;
                        long currentTimeMillis = System.currentTimeMillis();
                        if (cadm.f164950c) {
                            cadm.mo74035c();
                            cadm.f164950c = false;
                        }
                        cadn cadn3 = (cadn) cadm.f164949b;
                        cadn3.f172701a |= 32;
                        cadn3.f172708h = currentTimeMillis;
                        cadn cadn4 = (cadn) cadm.mo74062i();
                        try {
                            zjo zjo = this.f55213e;
                            Set set = zjo.f55233a;
                            caae caae3 = cadn4.f172705e;
                            if (caae3 == null) {
                                caae3 = caae.f172323i;
                            }
                            caah caah4 = caae3.f172330f;
                            if (caah4 == null) {
                                caah4 = caah.f172333d;
                            }
                            if (set.contains(caah4.f172336b)) {
                                Map map = zjo.f55234b;
                                caae caae4 = cadn4.f172705e;
                                if (caae4 == null) {
                                    caae4 = caae.f172323i;
                                }
                                map.put(caae4.f172326b, cadn4);
                            }
                            this.f55209a.mo30949a(bngx.m109356a(cadn4));
                            return;
                        } catch (RemoteException e) {
                            bnsl bnsl7 = (bnsl) zjm.f55217a.mo68387b();
                            bnsl7.mo68437a(e);
                            bnsl7.mo68432a("zjk", "b", 433, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                            bnsl7.mo68405a("Couldn't push event back to listener");
                            return;
                        }
                    } else {
                        this.f55215g.f55220c.add(this.f55211c);
                        return;
                    }
                }
            }
            j = nanos3 - sensorEvent2.timestamp;
            zjn.f55230b.edit().putLong(sb2, j).apply();
            zjf zjf2 = this.f55210b;
            caae caae22 = this.f55211c;
            long a22 = this.f55212d.mo31174a();
            ordinal = zjf2.ordinal();
            cadn = null;
            if (ordinal != 0) {
            }
            if (cadn == null) {
            }
        }
    }
}
