package p000;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;

/* renamed from: zjf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public enum zjf {
    HEART_RATE(21, bzzn.f172073M),
    STEP_COUNTER(19, bzzn.f172101an);
    

    /* renamed from: c */
    public static final srn f55200c = zvt.m46581a();

    /* renamed from: d */
    public final int f55202d;

    /* renamed from: e */
    public final caah f55203e;

    private zjf(int i, caah caah) {
        this.f55202d = i;
        this.f55203e = caah;
    }

    /* renamed from: a */
    public static long m45577a(long j, long j2) {
        long nanos = TimeUnit.MILLISECONDS.toNanos(System.currentTimeMillis());
        long j3 = j2 + j;
        return (j3 > nanos || j > nanos || j <= 0 || nanos - j3 > TimeUnit.SECONDS.toNanos(cdzd.m135487p())) ? nanos : j3;
    }

    /* renamed from: a */
    public static long m45578a(long j, long j2, long j3) {
        long j4 = j2 + j;
        long nanos = TimeUnit.MILLISECONDS.toNanos(System.currentTimeMillis());
        return (j4 < j2 || j4 > nanos || nanos - j4 > TimeUnit.SECONDS.toNanos(cdzd.m135487p())) ? m45577a(j, j3) : j4;
    }

    /* renamed from: a */
    public final caae mo31167a(caaq caaq, Sensor sensor) {
        yyc a = yyd.m44987a();
        a.mo30856a(caad.RAW);
        a.mo30857a(this.f55203e);
        a.mo30858a(caaq);
        a.mo30859a(stm.m36299a(sensor.getName()));
        return a.mo30854a();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final cadn mo31168a(SensorEvent sensorEvent, caae caae, long j, long j2) {
        long j3;
        long j4;
        SensorEvent sensorEvent2 = sensorEvent;
        long j5 = j;
        long j6 = j2;
        int ordinal = ordinal();
        if (ordinal == 0) {
            float f = sensorEvent2.values[0];
            if (f <= 0.0f || sensorEvent2.accuracy < ((int) cdzm.f182081a.mo6606a().mo78610b())) {
                mo31169a(sensorEvent);
                return null;
            }
            if (!cdzd.f182003a.mo6606a().mo78542I()) {
                j3 = m45577a(sensorEvent2.timestamp, j6);
            } else {
                j3 = m45578a(sensorEvent2.timestamp, j, j2);
            }
            return yyk.m45012a(caae, j3, TimeUnit.NANOSECONDS, (double) f);
        } else if (ordinal == 1) {
            if (!cdzd.f182003a.mo6606a().mo78545L()) {
                long a = m45577a(sensorEvent2.timestamp, j6);
                if (a < j5) {
                    bnsl bnsl = (bnsl) f55200c.mo68387b();
                    bnsl.mo68432a("zjf", "a", 64, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    bnsl.mo68418a("Got sensor event with timestamp before boot (%d): %s", j5, mo31169a(sensorEvent));
                    j4 = j5;
                } else {
                    j4 = a;
                }
            } else {
                j4 = m45578a(sensorEvent2.timestamp, j, j2);
            }
            if (zjn.m45603a(j)) {
                return yyk.m45011a(caae, j, j4, TimeUnit.NANOSECONDS, yyp.m45047a((int) sensorEvent2.values[0]));
            }
            bnsl bnsl2 = (bnsl) f55200c.mo68388c();
            bnsl2.mo68432a("zjf", "a", 79, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl2.mo68418a("Invalid boot time: %s. Event discarded: %s.", j5, mo31169a(sensorEvent));
            return null;
        } else {
            throw null;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final String mo31169a(SensorEvent sensorEvent) {
        return String.format("SensorEvent{sensor:%s,[%s],acc:%s,(%s)", sensorEvent.sensor, Long.valueOf(sensorEvent.timestamp), Integer.valueOf(sensorEvent.accuracy), Arrays.toString(sensorEvent.values));
    }
}
