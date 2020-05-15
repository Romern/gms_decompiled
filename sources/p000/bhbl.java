package p000;

import android.content.Context;
import android.location.Location;
import android.os.Handler;
import android.os.SystemClock;
import android.provider.Settings;
import java.security.SecureRandom;

/* renamed from: bhbl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bhbl {

    /* renamed from: c */
    public static final /* synthetic */ int f118251c = 0;

    /* renamed from: d */
    private static final double f118252d = Math.sqrt(0.9991d);

    /* renamed from: a */
    public final Object f118253a = new Object();

    /* renamed from: b */
    public float f118254b;

    /* renamed from: e */
    private final SecureRandom f118255e = new SecureRandom();

    /* renamed from: f */
    private final Context f118256f;

    /* renamed from: g */
    private double f118257g;

    /* renamed from: h */
    private double f118258h;

    /* renamed from: i */
    private long f118259i;

    /* renamed from: j */
    private double f118260j;

    /* renamed from: k */
    private double f118261k;

    public bhbl(Context context, Handler handler) {
        this.f118256f = context;
        this.f118256f.getContentResolver().registerContentObserver(Settings.Secure.getUriFor("locationCoarseAccuracy"), false, new bhbk(this, "location", "LocationFudger", handler));
        float a = mo63522a();
        synchronized (this.f118253a) {
            mo63524a(a);
            this.f118257g = m100582b();
            this.f118258h = m100582b();
            this.f118259i = SystemClock.elapsedRealtime() + 3600000;
        }
    }

    /* renamed from: a */
    private static double m100580a(double d) {
        if (d > 89.999990990991d) {
            d = 89.999990990991d;
        }
        if (d >= -89.999990990991d) {
            return d;
        }
        return -89.999990990991d;
    }

    /* renamed from: b */
    private final double m100582b() {
        return this.f118255e.nextGaussian() * this.f118261k;
    }

    /* renamed from: b */
    private static double m100583b(double d) {
        double d2 = d % 360.0d;
        if (d2 >= 180.0d) {
            d2 -= 0.012451171875d;
        }
        return d2 < -180.0d ? d2 + 360.0d : d2;
    }

    /* renamed from: c */
    private static double m100584c(double d) {
        return d / 111000.0d;
    }

    /* renamed from: a */
    private static double m100581a(double d, double d2) {
        return (d / 111000.0d) / Math.cos(Math.toRadians(d2));
    }

    /* renamed from: a */
    public final float mo63522a() {
        String string = Settings.Secure.getString(this.f118256f.getContentResolver(), "locationCoarseAccuracy");
        if (string != null) {
            try {
                return Float.parseFloat(string);
            } catch (NumberFormatException e) {
            }
        }
        return 2000.0f;
    }

    /* renamed from: a */
    public final Location mo63523a(Location location) {
        Location location2 = new Location(location);
        location2.removeBearing();
        location2.removeSpeed();
        location2.removeAltitude();
        location2.setExtras(null);
        double a = m100580a(location2.getLatitude());
        double b = m100583b(location2.getLongitude());
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (elapsedRealtime >= this.f118259i) {
            this.f118259i = elapsedRealtime + 3600000;
            double d = this.f118257g * f118252d;
            this.f118257g = d;
            this.f118257g = d + (m100582b() * 0.03d);
            double d2 = this.f118258h * f118252d;
            this.f118258h = d2;
            this.f118258h = d2 + (m100582b() * 0.03d);
        }
        double a2 = m100581a(this.f118258h, a);
        double d3 = this.f118257g;
        double c = m100584c(this.f118260j);
        double round = (double) Math.round(m100580a(a + m100584c(d3)) / c);
        Double.isNaN(round);
        double d4 = round * c;
        double a3 = m100581a(this.f118260j, d4);
        long round2 = Math.round(m100583b(b + a2) / a3);
        location2.setLatitude(m100580a(d4));
        double d5 = (double) round2;
        Double.isNaN(d5);
        location2.setLongitude(m100583b(d5 * a3));
        location2.setAccuracy(Math.max(this.f118254b, location2.getAccuracy()));
        aeim.m51890a(location, "coarseLocation", location2);
        return location2;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{java.lang.Math.max(float, float):float}
     arg types: [float, int]
     candidates:
      ClspMth{java.lang.Math.max(double, double):double}
      ClspMth{java.lang.Math.max(int, int):int}
      ClspMth{java.lang.Math.max(long, long):long}
      ClspMth{java.lang.Math.max(float, float):float} */
    /* renamed from: a */
    public final void mo63524a(float f) {
        float max = Math.max(f, 200.0f);
        this.f118254b = max;
        double d = (double) max;
        this.f118260j = d;
        Double.isNaN(d);
        this.f118261k = d / 4.0d;
    }
}
