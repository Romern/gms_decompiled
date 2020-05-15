package p000;

import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* renamed from: eby */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class eby {

    /* renamed from: c */
    private static final long f14642c = TimeUnit.MINUTES.toNanos(2);

    /* renamed from: a */
    public final ech f14643a;

    /* renamed from: b */
    public final ecb f14644b;

    public eby(ech ech, ecb ecb) {
        this.f14643a = ech;
        this.f14644b = ecb;
    }

    /* renamed from: c */
    private final boolean m10082c() {
        ecb ecb;
        ech ech = this.f14643a;
        return (ech == null || (ecb = this.f14644b) == null || ech.f14673a - ecb.f14661a <= f14642c) ? false : true;
    }

    /* renamed from: d */
    private final boolean m10083d() {
        ecb ecb;
        ech ech = this.f14643a;
        return (ech == null || (ecb = this.f14644b) == null || ecb.f14661a - ech.f14673a <= f14642c) ? false : true;
    }

    /* renamed from: a */
    public final ebz mo9934a() {
        ech ech = this.f14643a;
        if (ech == null && this.f14644b == null) {
            return null;
        }
        if (ech == null || m10083d()) {
            return ebz.NO_WIFI;
        }
        if (this.f14644b == null || m10082c()) {
            return ebz.NO_GPS;
        }
        return ebz.FULL;
    }

    /* renamed from: b */
    public final String mo9935b() {
        StringBuilder sb = new StringBuilder();
        sb.append(mo9934a());
        sb.append("; ");
        if (this.f14643a != null) {
            sb.append(String.format(Locale.US, "rssi=%.1f,%.1f", this.f14643a.f14674b.get(0), this.f14643a.f14676d.get(0)));
            if (m10083d()) {
                long j = this.f14644b.f14661a;
                long j2 = this.f14643a.f14673a;
                sb.append(" (");
                sb.append(TimeUnit.NANOSECONDS.toSeconds(j - j2));
                sb.append(" secs old)");
            }
        } else {
            sb.append("<no WiFi>");
        }
        sb.append("; ");
        if (this.f14644b != null) {
            sb.append(String.format(Locale.US, "snr=%.1f", this.f14644b.f14662b.get(0)));
            if (m10082c()) {
                long j3 = this.f14643a.f14673a;
                long j4 = this.f14644b.f14661a;
                sb.append(" (");
                sb.append(TimeUnit.NANOSECONDS.toSeconds(j3 - j4));
                sb.append(" secs old)");
            }
        } else {
            sb.append("<no GPS>");
        }
        return sb.toString();
    }

    public final String toString() {
        return mo9935b();
    }
}
