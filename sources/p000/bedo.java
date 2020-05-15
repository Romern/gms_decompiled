package p000;

import java.util.concurrent.TimeUnit;

/* renamed from: bedo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bedo {

    /* renamed from: a */
    private static final long f106981a = TimeUnit.SECONDS.toMillis(90);

    /* renamed from: a */
    public final void mo58587a(bedt bedt, bedt bedt2) {
        bedt bedt3 = bedt;
        bedt bedt4 = bedt2;
        beds beds = bedt4.f106988b;
        beds beds2 = bedt3.f106988b;
        bedn bedn = beds2.f106985d;
        bedn bedn2 = beds.f106985d;
        long j = bedn2.f106978a;
        long j2 = bedn.f106978a;
        long j3 = beds.f106986e;
        long j4 = beds2.f106986e;
        if (!beds.f106984c.equals(beds2.f106984c)) {
            throw new bedp(String.format("New reported device (%s) is different than last known device (%s)", beds.f106984c, beds2.f106984c));
        } else if (j < j2) {
            throw new bedp(String.format("New reported counter (%d) is lower than last known counter (%d)", Long.valueOf(j), Long.valueOf(j2)));
        } else if (!bedn2.mo58583a(beds.f106984c.f106974c)) {
            throw new bedp("Reported state is incompatible with device class!");
        } else if (j != j2) {
        } else {
            if (bedn2.f106980c != bedn.f106980c || bedn2.f106979b != bedn.f106979b) {
                throw new bedp("State has changed wihtout incrementing the counter.");
            } else if (j3 >= j4) {
                long j5 = bedt4.f106987a - bedt3.f106987a;
                long abs = Math.abs(j5 - (j3 - j4));
                double d = (double) (j5 * 150);
                Double.isNaN(d);
                if (abs > Math.max((long) Math.ceil(d / 1000000.0d), f106981a)) {
                    throw new bedp(String.format("Time drift is outside accepteble range: %d ms.", Long.valueOf(abs)));
                }
            } else {
                throw new bedp(String.format("New reported timestamp (%d) is lower than last known timestamp (%d)", Long.valueOf(j3), Long.valueOf(j4)));
            }
        }
    }
}
