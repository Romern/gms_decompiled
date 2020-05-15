package p000;

import android.content.Context;
import android.location.Location;
import com.google.android.gms.thunderbird.state.EmergencyInfo;

/* renamed from: auft */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class auft {

    /* renamed from: a */
    private static final double f91741a = Math.sqrt(2.0d);

    /* renamed from: a */
    protected static float m76996a(float f, float f2) {
        boolean z = false;
        if (f2 > 0.0f && f2 < 1.0f) {
            z = true;
        }
        bmxy.m108588a(z);
        if (m76997a(f2)) {
            return f;
        }
        double d = (double) f2;
        double d2 = f91741a;
        Double.isNaN(d);
        Double.isNaN(d);
        double log = Math.log((1.0d - d) * (1.0d + d));
        double d3 = (log / 2.0d) + 4.330746750799873d;
        double d4 = (double) f;
        Double.isNaN(d4);
        return (float) (d2 * Math.signum(d) * Math.sqrt((-d3) + Math.sqrt((d3 * d3) - (log / 0.147d))) * d4);
    }

    /* renamed from: a */
    public abstract bqgg mo50498a(Context context, EmergencyInfo emergencyInfo, aufq aufq, Location location);

    /* renamed from: a */
    public abstract String mo50499a();

    /* renamed from: b */
    public abstract aufk mo50500b();

    /* renamed from: c */
    public abstract int mo50501c();

    /* renamed from: a */
    public static boolean m76997a(float f) {
        return Math.abs(0.6826895f - f) < 0.002f;
    }
}
