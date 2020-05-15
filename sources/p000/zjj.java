package p000;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.os.RemoteException;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* renamed from: zjj */
final /* synthetic */ class zjj implements Runnable {

    /* renamed from: a */
    private final zjk f55207a;

    /* renamed from: b */
    private final SensorEvent f55208b;

    public zjj(zjk zjk, SensorEvent sensorEvent) {
        this.f55207a = zjk;
        this.f55208b = sensorEvent;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0147, code lost:
        if (r9 > r4) goto L_0x014a;
     */
    public final void run() {
        int i;
        cadn cadn;
        long j;
        long j2;
        zjk zjk = this.f55207a;
        SensorEvent sensorEvent = this.f55208b;
        zjm zjm = zjk.f55215g;
        srn srn = zjm.f55217a;
        ytp ytp = zjm.f55221d;
        int type = sensorEvent.sensor.getType();
        if (type != 19) {
            i = type != 21 ? 1 : 5;
        } else {
            i = 6;
        }
        ytp.mo30768a(i);
        if (zjk.f55209a != null) {
            zjs zjs = zjk.f55214f;
            caae caae = zjk.f55211c;
            caah caah = bzzn.f172101an;
            caah caah2 = caae.f172330f;
            if (caah2 == null) {
                caah2 = caah.f172333d;
            }
            if (caah.equals(caah2)) {
                if (((int) sensorEvent.values[0]) < 0) {
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
                        if (sensorEvent.timestamp > TimeUnit.MILLISECONDS.toNanos(cdzd.m135489r()) + nanos && a.f172707g <= nanos) {
                            bnsl bnsl3 = (bnsl) zjs.f55244a.mo68388c();
                            bnsl3.mo68432a("zjs", "a", 59, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                            bnsl3.mo68420a("Discarding event with timestamp in the future: %s", zjs.m45611a(sensorEvent));
                            return;
                        }
                    }
                    if (cdzd.m135490s() >= 0) {
                        long nanos2 = TimeUnit.MILLISECONDS.toNanos(cdzd.m135490s());
                        if (sensorEvent.timestamp < nanos - nanos2 && sensorEvent.timestamp < a.f172707g - nanos2) {
                            bnsl bnsl4 = (bnsl) zjs.f55244a.mo68388c();
                            bnsl4.mo68432a("zjs", "a", 70, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                            bnsl4.mo68420a("Discarding event with timestamp too far in the past: %s", zjs.m45611a(sensorEvent));
                            return;
                        }
                    }
                }
            }
            zjn zjn = zjk.f55212d;
            long nanos3 = TimeUnit.MILLISECONDS.toNanos(System.currentTimeMillis());
            Sensor sensor = sensorEvent.sensor;
            int type2 = sensor.getType();
            String name = sensor.getName();
            StringBuilder sb = new StringBuilder(String.valueOf(name).length() + 12);
            sb.append(type2);
            sb.append(":");
            sb.append(name);
            String sb2 = sb.toString();
            long j3 = zjn.f55230b.getLong(sb2, -1);
            if (j3 != -1) {
                long j4 = sensorEvent.timestamp + j3;
                if (j3 >= 0) {
                }
            }
            j3 = nanos3 - sensorEvent.timestamp;
            zjn.f55230b.edit().putLong(sb2, j3).apply();
            zjf zjf = zjk.f55210b;
            caae caae2 = zjk.f55211c;
            long a2 = zjk.f55212d.mo31174a();
            int ordinal = zjf.ordinal();
            if (ordinal == 0) {
                float f = sensorEvent.values[0];
                if (f > 0.0f) {
                    float f2 = f;
                    if (sensorEvent.accuracy >= ((int) cdzm.f182081a.mo6606a().mo78610b())) {
                        if (!cdzd.f182003a.mo6606a().mo78542I()) {
                            j = zjf.m45577a(sensorEvent.timestamp, j3);
                        } else {
                            j = zjf.m45578a(sensorEvent.timestamp, a2, j3);
                        }
                        cadn = yyk.m45012a(caae2, j, TimeUnit.NANOSECONDS, (double) f2);
                    }
                }
                zjf.mo31169a(sensorEvent);
                cadn = null;
            } else if (ordinal == 1) {
                if (!cdzd.f182003a.mo6606a().mo78545L()) {
                    long a3 = zjf.m45577a(sensorEvent.timestamp, j3);
                    if (a3 < a2) {
                        bnsl bnsl5 = (bnsl) zjf.f55200c.mo68387b();
                        bnsl5.mo68432a("zjf", "a", 64, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                        bnsl5.mo68418a("Got sensor event with timestamp before boot (%d): %s", a2, zjf.mo31169a(sensorEvent));
                        j2 = a2;
                    } else {
                        j2 = a3;
                    }
                } else {
                    j2 = zjf.m45578a(sensorEvent.timestamp, a2, j3);
                }
                if (zjn.m45603a(a2)) {
                    cadn = yyk.m45011a(caae2, a2, j2, TimeUnit.NANOSECONDS, yyp.m45047a((int) sensorEvent.values[0]));
                } else {
                    bnsl bnsl6 = (bnsl) zjf.f55200c.mo68388c();
                    bnsl6.mo68432a("zjf", "a", 79, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    bnsl6.mo68418a("Invalid boot time: %s. Event discarded: %s.", a2, zjf.mo31169a(sensorEvent));
                    cadn = null;
                }
            } else {
                throw null;
            }
            if (cadn != null) {
                ytp ytp2 = zjk.f55215g.f55221d;
                caah caah3 = zjk.f55211c.f172330f;
                if (caah3 == null) {
                    caah3 = caah.f172333d;
                }
                ytp2.mo30770a(caah3, 1);
                bxvd bxvd = (bxvd) cadn.mo74142c(5);
                bxvd.mo73625a((GeneratedMessageLite) cadn);
                cadm cadm = (cadm) bxvd;
                long j5 = sensorEvent.timestamp;
                if (cadm.f164950c) {
                    cadm.mo74035c();
                    cadm.f164950c = false;
                }
                cadn cadn2 = (cadn) cadm.f164949b;
                cadn cadn3 = cadn.f172699j;
                cadn2.f172701a |= 16;
                cadn2.f172707g = j5;
                long currentTimeMillis = System.currentTimeMillis();
                if (cadm.f164950c) {
                    cadm.mo74035c();
                    cadm.f164950c = false;
                }
                cadn cadn4 = (cadn) cadm.f164949b;
                cadn4.f172701a |= 32;
                cadn4.f172708h = currentTimeMillis;
                cadn cadn5 = (cadn) cadm.mo74062i();
                try {
                    zjo zjo = zjk.f55213e;
                    Set set = zjo.f55233a;
                    caae caae3 = cadn5.f172705e;
                    if (caae3 == null) {
                        caae3 = caae.f172323i;
                    }
                    caah caah4 = caae3.f172330f;
                    if (caah4 == null) {
                        caah4 = caah.f172333d;
                    }
                    if (set.contains(caah4.f172336b)) {
                        Map map = zjo.f55234b;
                        caae caae4 = cadn5.f172705e;
                        if (caae4 == null) {
                            caae4 = caae.f172323i;
                        }
                        map.put(caae4.f172326b, cadn5);
                    }
                    zjk.f55209a.mo30949a(bngx.m109356a(cadn5));
                } catch (RemoteException e) {
                    bnsl bnsl7 = (bnsl) zjm.f55217a.mo68387b();
                    bnsl7.mo68437a(e);
                    bnsl7.mo68432a("zjk", "b", 433, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    bnsl7.mo68405a("Couldn't push event back to listener");
                }
            } else {
                zjk.f55215g.f55220c.add(zjk.f55211c);
            }
        }
    }
}
