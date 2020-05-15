package p000;

/* renamed from: caod */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class caod {

    /* renamed from: a */
    public transient double f175439a = Double.MIN_VALUE;

    /* renamed from: b */
    public transient double f175440b = Double.MIN_VALUE;

    /* renamed from: c */
    private long f175441c;

    /* renamed from: d */
    private double f175442d = 0.0d;

    /* renamed from: e */
    private double f175443e = 0.0d;

    /* renamed from: f */
    private long f175444f = 0;

    /* renamed from: g */
    private transient double f175445g = Double.MIN_VALUE;

    /* renamed from: h */
    private transient double f175446h = Double.MIN_VALUE;

    public caod() {
        long currentTimeMillis = System.currentTimeMillis();
        this.f175441c = currentTimeMillis;
    }

    /* renamed from: a */
    public static final double m126858a(double d) {
        return m126859a(d, 6.283185307179586d);
    }

    /* renamed from: b */
    private static final double m126860b(double d) {
        return m126859a(d + 3.141592653589793d, 6.283185307179586d) - 1.4292036732051034d;
    }

    /* renamed from: a */
    public final double mo74714a() {
        double d = this.f175445g;
        if (d != Double.MIN_VALUE) {
            return d;
        }
        double d2 = (double) (this.f175441c + 210866760000000L);
        Double.isNaN(d2);
        double d3 = d2 / 8.64E7d;
        this.f175445g = d3;
        return d3;
    }

    /* renamed from: a */
    public final void mo74716a(long j) {
        this.f175441c = j;
        this.f175445g = Double.MIN_VALUE;
        this.f175439a = Double.MIN_VALUE;
        this.f175440b = Double.MIN_VALUE;
        this.f175446h = Double.MIN_VALUE;
    }

    /* renamed from: a */
    private static final double m126859a(double d, double d2) {
        return d - (d2 * Math.floor(d / d2));
    }

    public caod(double d, double d2) {
        long currentTimeMillis = System.currentTimeMillis();
        this.f175441c = currentTimeMillis;
        this.f175442d = m126860b(d * 0.017453292519943295d);
        this.f175443e = m126860b(d2 * 0.017453292519943295d);
        this.f175444f = (long) (((this.f175442d * 24.0d) * 3600000.0d) / 6.283185307179586d);
    }

    /* renamed from: a */
    public final long mo74715a(boolean z) {
        caoc caoc;
        long j = this.f175441c;
        long j2 = this.f175444f;
        mo74716a(((((j + j2) / 86400000) * 86400000) - j2) + 43200000 + ((!z ? 6 : -6) * 3600000));
        caob caob = new caob(this);
        double tan = Math.tan(this.f175443e);
        int i = 0;
        while (true) {
            caod caod = caob.f175436a;
            double d = caod.f175439a;
            if (d == Double.MIN_VALUE) {
                double a = m126858a((m126858a((caod.mo74714a() - 1.747850774336257E-6d) * 0.017202791632524146d) + 4.87650757829735d) - 0.8830950019289039d);
                double[] dArr = new double[2];
                double d2 = a;
                while (true) {
                    double sin = (d2 - (Math.sin(d2) * 0.016713d)) - a;
                    d2 -= sin / (1.0d - (Math.cos(d2) * 0.016713d));
                    if (Math.abs(sin) <= 1.0E-5d) {
                        break;
                    }
                }
                double atan = Math.atan(Math.tan(d2 / 2.0d) * Math.sqrt(1.033994144130859d));
                dArr[0] = m126858a(atan + atan + 4.935239984568769d);
                dArr[1] = a;
                double d3 = dArr[0];
                caod.f175439a = d3;
                d = d3;
            }
            double d4 = caod.f175440b;
            if (d4 == Double.MIN_VALUE) {
                double a2 = (caod.mo74714a() - 1.7461893548897933E-6d) / 36525.0d;
                d4 = 0.017453292519943295d * (((23.439292d - (0.013004166666666666d * a2)) - ((1.6666666666666665E-7d * a2) * a2)) + (5.027777777777778E-7d * a2 * a2 * a2));
                caod.f175440b = d4;
            }
            double sin2 = Math.sin(d4);
            double cos = Math.cos(d4);
            double sin3 = Math.sin(d);
            caoc = new caoc(Math.atan2((sin3 * cos) - (Math.tan(0.0d) * sin2), Math.cos(d)), Math.asin((Math.sin(0.0d) * cos) + (Math.cos(0.0d) * sin2 * sin3)));
            double acos = Math.acos((-tan) * Math.tan(caoc.f175438b));
            if (z) {
                acos = 6.283185307179586d - acos;
            }
            double d5 = ((acos + caoc.f175437a) * 24.0d) / 6.283185307179586d;
            double d6 = this.f175446h;
            if (d6 == Double.MIN_VALUE) {
                double floor = ((Math.floor(mo74714a() - 8.0d) + 0.5d) - 1.7461893548897933E-6d) / 36525.0d;
                d6 = m126859a((2400.051336d * floor) + 6.697374558d + (2.5862E-5d * floor * floor), 24.0d);
                this.f175446h = d6;
            }
            double a3 = m126859a((d5 - d6) * 0.9972695663d, 24.0d);
            long j3 = this.f175441c;
            long j4 = this.f175444f;
            long j5 = ((long) (a3 * 3600000.0d)) + ((((j3 + j4) / 86400000) * 86400000) - j4);
            long j6 = j5 - j3;
            mo74716a(j5);
            i++;
            if (i >= 5 || Math.abs(j6) <= 5000) {
                double cos2 = Math.cos(caoc.f175438b);
                long asin = (long) ((((Math.asin(Math.sin(0.014541501551199421d) / Math.sin(Math.acos(Math.sin(this.f175443e) / cos2))) * 240.0d) * 57.29577951308232d) / cos2) * 1000.0d);
                long j7 = this.f175441c;
            }
        }
        double cos22 = Math.cos(caoc.f175438b);
        long asin2 = (long) ((((Math.asin(Math.sin(0.014541501551199421d) / Math.sin(Math.acos(Math.sin(this.f175443e) / cos22))) * 240.0d) * 57.29577951308232d) / cos22) * 1000.0d);
        long j72 = this.f175441c;
        if (z) {
            asin2 = -asin2;
        }
        mo74716a(j);
        return j72 + asin2;
    }
}
