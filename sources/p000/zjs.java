package p000;

import android.hardware.SensorEvent;
import android.os.SystemClock;
import java.util.Arrays;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* renamed from: zjs */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class zjs {

    /* renamed from: a */
    public static final srn f55244a = zvt.m46581a();

    /* renamed from: b */
    public final zjo f55245b;

    public zjs(zjo zjo) {
        this.f55245b = zjo;
    }

    /* renamed from: a */
    public static String m45611a(SensorEvent sensorEvent) {
        long currentTimeMillis = System.currentTimeMillis();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        return String.format(Locale.US, "SensorEvent{%1$tF %1$tT %2$s}", Long.valueOf((currentTimeMillis - elapsedRealtime) + TimeUnit.NANOSECONDS.toMillis(sensorEvent.timestamp)), Arrays.toString(sensorEvent.values));
    }

    /* renamed from: a */
    private final boolean m45612a(SensorEvent sensorEvent, caae caae) {
        SensorEvent sensorEvent2 = sensorEvent;
        if (((int) sensorEvent2.values[0]) < 0) {
            bnsl bnsl = (bnsl) f55244a.mo68388c();
            bnsl.mo68432a("zjs", "a", 40, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68420a("Discarding event with negative step counts: %s", m45611a(sensorEvent));
            return false;
        }
        long nanos = TimeUnit.MILLISECONDS.toNanos(System.currentTimeMillis());
        cadn a = this.f55245b.mo31175a(caae);
        if (a == null) {
            bnsl bnsl2 = (bnsl) f55244a.mo68390d();
            bnsl2.mo68432a("zjs", "a", 48, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl2.mo68420a("No last event in the cache... letting sensor event %s through.", m45611a(sensorEvent));
            return true;
        }
        if (cdzd.m135489r() >= 0) {
            if (sensorEvent2.timestamp > TimeUnit.MILLISECONDS.toNanos(cdzd.m135489r()) + nanos && a.f172707g <= nanos) {
                bnsl bnsl3 = (bnsl) f55244a.mo68388c();
                bnsl3.mo68432a("zjs", "a", 59, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl3.mo68420a("Discarding event with timestamp in the future: %s", m45611a(sensorEvent));
                return false;
            }
        }
        if (cdzd.m135490s() >= 0) {
            long nanos2 = TimeUnit.MILLISECONDS.toNanos(cdzd.m135490s());
            if (sensorEvent2.timestamp < nanos - nanos2 && sensorEvent2.timestamp < a.f172707g - nanos2) {
                bnsl bnsl4 = (bnsl) f55244a.mo68388c();
                bnsl4.mo68432a("zjs", "a", 70, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl4.mo68420a("Discarding event with timestamp too far in the past: %s", m45611a(sensorEvent));
                return false;
            }
        }
        return true;
    }
}
