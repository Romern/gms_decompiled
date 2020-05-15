package p000;

import android.location.GnssMeasurementCorrections;
import android.location.GnssSingleSatCorrection;
import android.location.Location;
import android.location.LocationManager;
import java.util.ArrayList;
import java.util.List;

/* renamed from: beyx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class beyx implements bfch {

    /* renamed from: a */
    private static final srn f113070a = srn.m36125a("ChipsetCorrectionsComputer");

    /* renamed from: b */
    private final LocationManager f113071b;

    /* renamed from: c */
    private final bezu f113072c;

    /* renamed from: d */
    private final float f113073d;

    /* renamed from: e */
    private final float f113074e;

    /* renamed from: f */
    private final boolean f113075f;

    /* renamed from: g */
    private final boolean f113076g;

    /* renamed from: h */
    private final bezy f113077h;

    public beyx(LocationManager locationManager, float f, float f2, boolean z, boolean z2, boolean z3) {
        if (!cesw.f183411a.mo6606a().blueskyConstructLatLngKfAndBearingKfFromGcl()) {
            this.f113072c = new bezu(new bezx(1.0d, 250.0d, 0.3d, bezx.f113210a, 0.9d, 1.5d, 15.0d, -2.0d), new bezt(bezt.f113188a, bezt.f113189b, 9.869604401089358d, 15.0d, -2.0d));
        } else {
            this.f113072c = new bezu(new bezx(cesw.f183411a.mo6606a().latLngKfQSigmaAccelWalkMps2(), cesw.f183411a.mo6606a().latLngKfMeasurementErrorResetThresholdMeters(), cesw.f183411a.mo6606a().latLngKfSigmaVelThresholdMps(), cesw.f183411a.mo6606a().latLngKfBearingAccuracyRad(), cesw.f183411a.mo6606a().latLngKfSpeedAccuracyMps(), cesw.f183411a.mo6606a().latLngKfInitVelocityUncertaintyMps(), cesw.f183411a.mo6606a().latLngKfMaxGapBetweenUpdatesSec(), cesw.f183411a.mo6606a().latLngKfMaxBackwardsJumpSec()), new bezt(cesw.f183411a.mo6606a().bearingKfQSigmaBrgAccRadPerSec2(), cesw.f183411a.mo6606a().bearingKfQSigmaBrgRateRadPerSec(), cesw.f183411a.mo6606a().bearingKfThresholdVarianceThetaRadSquared(), cesw.f183411a.mo6606a().bearingKfMaxGapBetweenUpdatesSec(), cesw.f183411a.mo6606a().bearingKfMaxBackwardsJumpSec()));
        }
        this.f113077h = new bezy(z3);
        this.f113071b = locationManager;
        this.f113073d = f;
        this.f113074e = f2;
        this.f113075f = z;
        this.f113076g = z2;
    }

    /* renamed from: a */
    private static GnssSingleSatCorrection m96105a(bfbp bfbp, double d) {
        GnssSingleSatCorrection.Builder builder = new GnssSingleSatCorrection.Builder();
        builder.setCarrierFrequencyHz(bfbp.f113329b);
        builder.setConstellationType(bfbp.mo61365a());
        builder.setSatelliteId(bfbp.mo61366b());
        builder.setProbabilityLineOfSight((float) d);
        return builder.build();
    }

    /* renamed from: a */
    public final void mo61264a(long j, bfbk bfbk, Location location, Location location2) {
        if (location2 != null) {
            mo61265a(j, bfbk, location, location2, bfcg.m96336a((double) location2.getAccuracy()));
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:212:0x0d8d  */
    /* JADX WARNING: Removed duplicated region for block: B:214:0x0d9f  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x057e  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x0585  */
    /* renamed from: a */
    public final void mo61265a(long j, bfbk bfbk, Location location, Location location2, double d) {
        bfne bfne;
        double d2;
        bfne bfne2;
        bezu bezu;
        int i;
        int i2;
        bezu bezu2;
        long j2;
        double d3;
        int i3;
        double d4;
        bezu bezu3;
        bfbh bfbh;
        bfne bfne3;
        double d5;
        double[] dArr;
        bfbh bfbh2;
        boolean z;
        long j3;
        bfbh bfbh3;
        double d6;
        bezx bezx;
        bezu bezu4;
        boolean z2;
        double d7;
        double d8;
        double d9;
        double d10;
        bezx bezx2;
        double d11;
        double d12;
        int i4;
        double d13;
        boolean z3;
        boolean z4;
        bfbk bfbk2 = bfbk;
        if (location == null) {
            return;
        }
        if (!location.hasSpeed()) {
            return;
        }
        if (location.getSpeed() <= 0.0f || location.hasBearing()) {
            bsbj o = bsbl.m115064o();
            double latitude = location.getLatitude();
            double longitude = location.getLongitude();
            double accuracy = (double) location.getAccuracy();
            Double.isNaN(accuracy);
            o.mo70176a(latitude, longitude, (int) (accuracy * 1000.0d));
            o.mo70175a(location.getAltitude());
            o.mo70184d(location.getSpeed());
            o.mo70182b(location.getBearing());
            if (location.hasBearingAccuracy()) {
                o.mo70177a(location.getBearingAccuracyDegrees());
            }
            if (location.hasSpeedAccuracy()) {
                o.mo70183c(location.getSpeedAccuracyMetersPerSecond());
            }
            if (location.hasVerticalAccuracy()) {
                o.mo70181b((double) location.getVerticalAccuracyMeters());
            }
            bsbl a = o.mo70174a();
            double d14 = (double) a.f143968d;
            Double.isNaN(d14);
            double d15 = d14 / 1000.0d;
            double d16 = d15 + d15;
            bnwc b = bnwc.m110613b(location2.getLatitude(), location2.getLongitude());
            bnwc b2 = bnwc.m110613b(a.mo70188c(), a.mo70189d());
            bfbh bfbh4 = (bfbh) bfbk2;
            bezf a2 = bezf.m96119a(bfbh4.f113297b, b, d);
            bezy bezy = this.f113077h;
            bezw bezw = new bezw(bfbk2, b2, d15);
            bezi bezi = a2.f113121a;
            beze e = a2.mo61272e();
            double d17 = 0.0d;
            double d18 = 0.0d;
            double d19 = 0.0d;
            double d20 = 0.0d;
            double d21 = 0.0d;
            while (e.mo61266a()) {
                int b3 = e.mo61267b();
                double a3 = bezw.f113205a.mo61358a(b3);
                double d22 = bezw.f113206b;
                double c = (double) ((bfbh) bezw.f113205a).f113297b.mo61288c(b3);
                Double.isNaN(c);
                double d23 = d22 - c;
                double d24 = bezw.f113207c;
                bsbl bsbl = a;
                double d25 = (double) ((bfbh) bezw.f113205a).f113297b.mo61289d(b3);
                Double.isNaN(d25);
                double d26 = d24 - d25;
                double exp = Math.exp((bezd.m96115a(Math.sqrt((d23 * d23) + (d26 * d26)) * ((bfbh) bezw.f113205a).f113297b.mo61280f(), bezw.f113208d) + a3) - bezw.f113209e);
                if (exp != 0.0d) {
                    d17 += exp;
                    double c2 = (double) bezi.mo61288c(b3);
                    Double.isNaN(c2);
                    double d27 = c2 - d20;
                    double d28 = exp / d17;
                    double d29 = d20 + (d27 * d28);
                    Double.isNaN(c2);
                    d18 += d27 * exp * (c2 - d29);
                    double d30 = (double) bezi.mo61289d(b3);
                    Double.isNaN(d30);
                    double d31 = d30 - d21;
                    double d32 = d21 + (d28 * d31);
                    Double.isNaN(d30);
                    d19 += exp * d31 * (d30 - d32);
                    d21 = d32;
                    bfbh4 = bfbh4;
                    a = bsbl;
                    bezw = bezw;
                    d20 = d29;
                } else {
                    bfbh4 = bfbh4;
                    a = bsbl;
                    bezw = bezw;
                    d20 = d20;
                }
            }
            bsbl bsbl2 = a;
            double d33 = d20;
            bfbh bfbh5 = bfbh4;
            double d34 = d21;
            if (d17 != 0.0d) {
                bfne = bfne.m97311a(bezi.mo61284a(d33, d34), Double.valueOf(Math.min(Math.sqrt(Math.max(1.0d, d18 / d17) + Math.max(1.0d, d19 / d17)) * bezi.mo61280f(), 150.0d)));
            } else if (bezy.f113222a) {
                bfne = bfne.m97311a(bezi.mo61284a((double) ((a2.mo61271d() + a2.mo61270c()) / 2), (double) ((a2.mo61269b() + a2.mo61268a()) / 2)), Double.valueOf(150.0d));
            } else {
                bfne = bfne.m97311a(bezi.mo61284a((double) (bezi.mo61278d() / 2), (double) (bezi.mo61279e() / 2)), Double.valueOf(150.0d));
            }
            bsbj o2 = bsbl.m115064o();
            o2.mo70176a(((bnwc) bfne.f114467a).mo68615b(), ((bnwc) bfne.f114467a).mo68617d(), (int) (d16 * 1000.0d));
            bsbl bsbl3 = bsbl2;
            o2.mo70184d(bsbl3.f143969e);
            if (bsbl3.mo70196i()) {
                o2.mo70183c(bsbl3.f143970f);
            }
            if (bsbl3.mo70199l()) {
                o2.mo70182b(bsbl3.f143976l);
            }
            if (bsbl3.mo70200m()) {
                o2.mo70177a(bsbl3.f143977m);
            }
            bsbl a4 = o2.mo70174a();
            bezu bezu5 = this.f113072c;
            bsbj n = a4.mo70201n();
            if (bezu5.f113199c.mo66813a()) {
                bfne bfne4 = (bfne) bezu5.f113199c.mo66814b();
                bmxy.m108581a((Double) bfne4.f114467a);
                bmxy.m108581a((Double) bfne4.f114468b);
                if (Math.sqrt(((Double) bfne4.f114468b).doubleValue()) < 0.7853981633974483d) {
                    bfax bfax = new bfax(bsbl3.mo70185a(), bsbl3.mo70187b(), bsbl3.f143971g);
                    bfax bfax2 = new bfax(a4.mo70185a(), a4.mo70187b(), a4.f143971g);
                    bfaz a5 = bfba.m96294a(bfax);
                    bfaz a6 = bfba.m96294a(bfax2);
                    double[] a7 = a5.mo61350a();
                    double[] a8 = a6.mo61350a();
                    int length = a7.length;
                    int length2 = a8.length;
                    if (length == length2) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    bmxy.m108592a(z3, "Input vectors have different lengths: %s vs. %s", length, length2);
                    double[] dArr2 = new double[length];
                    int i5 = 0;
                    while (i5 < length) {
                        dArr2[i5] = (a7[i5] + a8[i5]) / 2.0d;
                        i5++;
                        bezu5 = bezu5;
                        d16 = d16;
                    }
                    bfax a9 = bfay.m96292a(dArr2[0], dArr2[1], dArr2[2]);
                    double[] a10 = a5.mo61350a();
                    double[] a11 = a6.mo61350a();
                    int length3 = a10.length;
                    int length4 = a11.length;
                    if (length3 == length4) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    bmxy.m108592a(z4, "Input vectors have different lengths: %s vs. %s", length3, length4);
                    double[] dArr3 = new double[length3];
                    int i6 = 0;
                    while (i6 < a10.length) {
                        dArr3[i6] = a10[i6] - a11[i6];
                        i6++;
                        bezu5 = bezu5;
                        d16 = d16;
                    }
                    double d35 = dArr3[0];
                    double d36 = dArr3[1];
                    double d37 = dArr3[2];
                    double d38 = a9.f113277a;
                    double d39 = a9.f113278b;
                    adyn adyn = new adyn(3, 3);
                    d2 = d16;
                    bezu = bezu5;
                    adyn.mo33932a(0, 0, -Math.sin(d39));
                    bfne2 = bfne;
                    adyn.mo33932a(1, 0, (-Math.cos(d39)) * Math.sin(d38));
                    adyn.mo33932a(2, 0, Math.cos(d39) * Math.cos(d38));
                    adyn.mo33932a(0, 1, Math.cos(d39));
                    adyn.mo33932a(1, 1, (-Math.sin(d38)) * Math.sin(d39));
                    adyn.mo33932a(2, 1, Math.cos(d38) * Math.sin(d39));
                    adyn.mo33932a(0, 2, 0.0d);
                    adyn.mo33932a(1, 2, Math.cos(d38));
                    adyn.mo33932a(2, 2, Math.sin(d38));
                    adyn adyn2 = new adyn(new double[][]{new double[]{d35}, new double[]{d36}, new double[]{d37}});
                    adyn adyn3 = new adyn(3, 1);
                    bsdg.m115306a(adyn, adyn2, adyn3);
                    bfaw bfaw = new bfaw(adyn3.mo33930a(0, 0), adyn3.mo33930a(1, 0), adyn3.mo33930a(2, 0));
                    double cos = (bfaw.f113275b * Math.cos(((Double) bfne4.f114467a).doubleValue())) + (bfaw.f113274a * Math.sin(((Double) bfne4.f114467a).doubleValue()));
                    if (cos > 0.0d) {
                        bfaw bfaw2 = new bfaw(cos * Math.sin(((Double) bfne4.f114467a).doubleValue()), cos * Math.cos(((Double) bfne4.f114467a).doubleValue()), 0.0d);
                        bfax bfax3 = new bfax(a4.mo70185a(), a4.mo70187b(), a4.f143971g);
                        double radians = Math.toRadians((((Math.sqrt(0.99330562000986d) * 6378137.0d) + 1.2756274E7d) / 3.0d) + bfax3.f113279c);
                        double cos2 = Math.cos(bfax3.f113277a);
                        double degrees = Math.toDegrees(bfax3.f113277a) + (bfaw2.f113275b / radians);
                        double degrees2 = Math.toDegrees(bfax3.f113278b) + (bfaw2.f113274a / (radians * cos2));
                        double d40 = bfax3.f113279c + bfaw2.f113276c;
                        if (degrees > 90.0d) {
                            degrees = 90.0d;
                        }
                        if (degrees < -90.0d) {
                            degrees = -90.0d;
                        }
                        bfax bfax4 = new bfax(Math.toRadians(degrees), Math.toRadians(((degrees2 + 180.0d) % 360.0d) - 0.02490234375d), d40);
                        double degrees3 = Math.toDegrees(bfax4.f113277a);
                        double degrees4 = Math.toDegrees(bfax4.f113278b);
                        int i7 = bsbl3.f143968d;
                        i2 = 1;
                        i = 0;
                        n.mo70176a(degrees3, degrees4, i7 + i7);
                    } else {
                        i2 = 1;
                        i = 0;
                    }
                } else {
                    bfne2 = bfne;
                    d2 = d16;
                    i2 = 1;
                    i = 0;
                    bezu = bezu5;
                }
            } else {
                bfne2 = bfne;
                d2 = d16;
                i2 = 1;
                i = 0;
                bezu = bezu5;
            }
            bezu bezu6 = bezu;
            bezx bezx3 = bezu6.f113197a;
            bsbl a12 = n.mo70174a();
            if (bezx3.f113218i != null) {
                j2 = j;
                double d41 = (double) (j2 - bezx3.f113220k);
                Double.isNaN(d41);
                double d42 = d41 / 1.0E9d;
                if (d42 > bezx3.f113216g) {
                    bezu4 = bezu6;
                    bezx = bezx3;
                } else if (d42 < bezx3.f113217h) {
                    bezu4 = bezu6;
                    bezx = bezx3;
                } else {
                    if (a12.mo70194h()) {
                        if (!a12.mo70194h() || a12.f143969e <= 0.0f) {
                            z2 = true;
                            bxbm.m122545b(z2, "One or more inputs required to run the LinearLatLngKalmanFilterBsky are not available.");
                            if (ayuo.m84851c(a12.mo70185a(), a12.mo70187b(), ayuo.m84842a(bezx3.f113219j.mo70228a(bezx3.f113218i.f144049a.mo33930a(i2, i))), ayuo.m84842a(bezx3.f113219j.mo70230b(bezx3.f113218i.f144049a.mo33930a(i, i)))) > bezx3.f113211b) {
                                bezx3.mo61307b(a12, j2);
                                bezu2 = bezu6;
                            } else {
                                double max = Math.max(0.0d, d42);
                                adyn a13 = adyn.m51430a(5);
                                a13.mo33932a(i, 2, max);
                                a13.mo33932a(i2, 3, max);
                                adyn a14 = adyn.m51430a(5);
                                double pow = Math.pow(bezx3.f113212c * 0.5d * max * max, 2.0d);
                                double pow2 = Math.pow(bezx3.f113212c * max, 2.0d);
                                a14.mo33932a(0, 0, pow);
                                a14.mo33932a(1, 1, pow);
                                a14.mo33932a(2, 2, pow2);
                                a14.mo33932a(3, 3, pow2);
                                a14.mo33932a(4, 4, 1.0E-4d);
                                bezx3.f113218i.mo70243a(a13, a14, null);
                                double d43 = (double) a12.f143968d;
                                Double.isNaN(d43);
                                double max2 = Math.max(4.0d, d43 * 0.001d);
                                double d44 = (double) a12.f143969e;
                                if (d44 < 0.5d) {
                                    d44 = 0.0d;
                                }
                                if (a12.mo70196i()) {
                                    d7 = (double) a12.f143970f;
                                } else {
                                    d7 = bezx3.f113215f;
                                }
                                double d45 = bezx3.f113213d;
                                if (d7 < d45) {
                                    d7 = d45;
                                }
                                if (d44 == 0.0d) {
                                    d9 = Math.pow(d7, 2.0d) / 2.0d;
                                    d10 = Math.pow(d7, 2.0d) / 2.0d;
                                    bezu2 = bezu6;
                                    bezx2 = bezx3;
                                    d8 = max2;
                                    d12 = 0.0d;
                                    d11 = 0.0d;
                                } else {
                                    double c3 = bsgl.m115745c(Math.toRadians((double) a12.f143976l));
                                    if (a12.mo70200m()) {
                                        d13 = Math.toRadians((double) a12.f143977m);
                                    } else {
                                        d13 = bezx3.f113214e;
                                    }
                                    double cos3 = Math.cos(c3) * d44;
                                    double sin = Math.sin(c3) * d44;
                                    d8 = max2;
                                    bezu2 = bezu6;
                                    bezx2 = bezx3;
                                    double pow3 = Math.pow(Math.sin(c3) * d44 * d13, 2.0d) + Math.pow(Math.cos(c3) * d7, 2.0d);
                                    d10 = Math.pow(Math.sin(c3) * d7, 2.0d) + Math.pow(d44 * Math.cos(c3) * d13, 2.0d);
                                    d9 = pow3;
                                    d12 = cos3;
                                    d11 = sin;
                                }
                                adyn adyn4 = new adyn(4, 1);
                                bezx bezx4 = bezx2;
                                adyn4.mo33932a(0, 0, bezx4.f113219j.mo70229b(a12.f143967c));
                                adyn4.mo33932a(1, 0, bezx4.f113219j.mo70227a(a12.f143966b));
                                adyn4.mo33932a(2, 0, d12);
                                adyn4.mo33932a(3, 0, d11);
                                adyn adyn5 = new adyn(4, 4);
                                double d46 = (d8 * d8) / 2.0d;
                                adyn5.mo33932a(0, 0, d46);
                                adyn5.mo33932a(1, 1, d46);
                                adyn5.mo33932a(2, 2, d9);
                                adyn5.mo33932a(3, 3, d10);
                                adyn adyn6 = new adyn(4, 5);
                                adyn6.mo33932a(0, 0, 1.0d);
                                adyn6.mo33932a(1, 1, 1.0d);
                                adyn6.mo33932a(2, 2, 1.0d);
                                adyn6.mo33932a(3, 3, 1.0d);
                                adyn adyn7 = bezx4.f113218i.f144049a;
                                double atan2 = Math.atan2(adyn7.mo33930a(3, 0), adyn7.mo33930a(2, 0));
                                double hypot = Math.hypot(adyn7.mo33930a(2, 0), adyn7.mo33930a(3, 0));
                                adyn6.mo33932a(2, 4, Math.cos(atan2) * hypot);
                                adyn6.mo33932a(3, 4, Math.sin(atan2) * hypot);
                                bezx4.f113218i.mo70244b(adyn4, adyn6, adyn5);
                                bezx4.f113220k = j;
                                bscg bscg = bezx4.f113218i;
                                adyn adyn8 = bscg.f144049a;
                                adyn adyn9 = bscg.f144050b;
                                double a15 = adyn8.mo33930a(0, 0);
                                double a16 = adyn8.mo33930a(1, 0);
                                if (bezx4.f113219j.mo70226a(a15, a16) > 0.1d) {
                                    bezx4.f113219j = bsbs.m115125a(bezx4.f113219j, a15, a16);
                                    i4 = 0;
                                    adyn8.mo33932a(0, 0, 0.0d);
                                    adyn8.mo33932a(1, 0, 0.0d);
                                    bezx4.f113218i.mo70242a(adyn8, adyn9);
                                } else {
                                    i4 = 0;
                                }
                                double a17 = adyn8.mo33930a(4, i4);
                                if (a17 < -0.25d) {
                                    adyn8.mo33932a(4, i4, -0.25d);
                                } else if (a17 > 0.0d) {
                                    adyn8.mo33932a(4, i4, 0.0d);
                                }
                                double sqrt = Math.sqrt(adyn9.mo33930a(i4, i4) + adyn9.mo33930a(1, 1));
                                double sqrt2 = Math.sqrt(adyn9.mo33930a(2, 2) + adyn9.mo33930a(3, 3));
                                double hypot2 = Math.hypot(adyn8.mo33930a(2, 0), adyn8.mo33930a(3, 0));
                                double atan22 = Math.atan2(adyn8.mo33930a(3, 0), adyn8.mo33930a(2, 0));
                                bsbj n2 = a12.mo70201n();
                                n2.mo70178a(bezx4.f113219j.mo70228a(adyn8.mo33930a(1, 0)), bezx4.f113219j.mo70230b(adyn8.mo33930a(0, 0)), (int) (sqrt * 1000.0d));
                                n2.mo70184d((float) hypot2);
                                n2.mo70183c((float) sqrt2);
                                n2.mo70182b((float) Math.toDegrees(bsgl.m115746d(atan22)));
                                a12 = n2.mo70174a();
                                j2 = j;
                            }
                        } else if (a12.mo70199l()) {
                            z2 = true;
                            bxbm.m122545b(z2, "One or more inputs required to run the LinearLatLngKalmanFilterBsky are not available.");
                            if (ayuo.m84851c(a12.mo70185a(), a12.mo70187b(), ayuo.m84842a(bezx3.f113219j.mo70228a(bezx3.f113218i.f144049a.mo33930a(i2, i))), ayuo.m84842a(bezx3.f113219j.mo70230b(bezx3.f113218i.f144049a.mo33930a(i, i)))) > bezx3.f113211b) {
                            }
                        }
                    }
                    z2 = false;
                    bxbm.m122545b(z2, "One or more inputs required to run the LinearLatLngKalmanFilterBsky are not available.");
                    if (ayuo.m84851c(a12.mo70185a(), a12.mo70187b(), ayuo.m84842a(bezx3.f113219j.mo70228a(bezx3.f113218i.f144049a.mo33930a(i2, i))), ayuo.m84842a(bezx3.f113219j.mo70230b(bezx3.f113218i.f144049a.mo33930a(i, i)))) > bezx3.f113211b) {
                    }
                }
                j2 = j;
                bezx.mo61307b(a12, j2);
            } else {
                j2 = j;
                bezu2 = bezu6;
                bezx3.mo61307b(a12, j2);
            }
            bsbj n3 = a12.mo70201n();
            bezu bezu7 = bezu2;
            bezt bezt = bezu7.f113198b;
            adyn adyn10 = bezu7.f113197a.f113218i.f144049a;
            if (adyn10 != null) {
                i3 = 0;
                d3 = adyn10.mo33930a(2, 0);
            } else {
                i3 = 0;
                d3 = Double.NaN;
            }
            adyn adyn11 = bezu7.f113197a.f113218i.f144049a;
            double a18 = adyn11 != null ? adyn11.mo33930a(3, i3) : Double.NaN;
            adyn adyn12 = bezu7.f113197a.f113218i.f144050b;
            double sqrt3 = adyn12 != null ? Math.sqrt(adyn12.mo33930a(2, 2)) : Double.NaN;
            adyn adyn13 = bezu7.f113197a.f113218i.f144050b;
            double sqrt4 = adyn13 != null ? Math.sqrt(adyn13.mo33930a(3, 3)) : Double.NaN;
            if (bezt.f113195h != null) {
                double d47 = (double) (j2 - bezt.f113196i);
                Double.isNaN(d47);
                double d48 = d47 / 1.0E9d;
                if (d48 > bezt.f113193f) {
                    bezu3 = bezu7;
                    bfbh3 = bfbh5;
                    d4 = 1.0d;
                } else if (d48 >= bezt.f113194g) {
                    double max3 = Math.max(0.0d, d48);
                    adyn a19 = adyn.m51430a(2);
                    a19.mo33932a(0, 1, max3);
                    adyn a20 = adyn.m51430a(2);
                    bezu3 = bezu7;
                    a20.mo33932a(0, 0, Math.pow(bezt.f113190c * 0.5d * d48 * d48, 2.0d));
                    a20.mo33932a(1, 1, Math.pow(bezt.f113190c * d48, 2.0d));
                    bezv bezv = bezt.f113195h;
                    bezv.f113203d.mo33934b(bezv.f113200a.f62912a, 1);
                    bsdg.m115306a(a19, bezv.f113200a, bezv.f113203d);
                    bezv.f113200a.mo33933a(bezv.f113203d);
                    adyn adyn14 = bezv.f113200a;
                    adyn14.mo33932a(0, 0, bsgl.m115744b(adyn14.mo33930a(0, 0)));
                    adyn adyn15 = bezv.f113203d;
                    int i8 = bezv.f113200a.f62912a;
                    adyn15.mo33934b(i8, i8);
                    bsdg.m115306a(a19, bezv.f113201b, bezv.f113203d);
                    bsdg.m115309d(bezv.f113203d, a19, bezv.f113201b);
                    adyn adyn16 = bezv.f113201b;
                    bsdg.m115310e(adyn16, a20, adyn16);
                    if (bezt.f113195h.f113201b.mo33930a(0, 0) > bezt.f113192e) {
                        double a21 = bezt.f113195h.f113200a.mo33930a(1, 0);
                        double d49 = bezt.f113191d;
                        double d50 = bsgl.m115746d(Math.atan2(a18, d3));
                        adyn adyn17 = new adyn(2, 1);
                        adyn17.mo33932a(0, 0, d50);
                        adyn17.mo33932a(1, 0, a21);
                        adyn a22 = adyn.m51430a(2);
                        a22.mo33932a(0, 0, 9.869604401089358d);
                        a22.mo33932a(1, 1, d49 * d49);
                        bezt.f113195h = new bezv(adyn17, a22);
                        bfne.m97311a(Double.valueOf(d50), Double.valueOf(a22.mo33930a(0, 0)));
                    }
                    bfne a23 = bezt.m96183a(d3, a18, sqrt3, sqrt4);
                    bmxy.m108581a((Double) a23.f114468b);
                    if (Double.isInfinite(((Double) a23.f114468b).doubleValue())) {
                        d6 = 1.0d;
                    } else if (Double.isNaN(((Double) a23.f114468b).doubleValue())) {
                        d6 = 1.0d;
                    } else {
                        adyn adyn18 = new adyn(1, 1);
                        bmxy.m108581a((Double) a23.f114467a);
                        adyn18.mo33932a(0, 0, ((Double) a23.f114467a).doubleValue());
                        adyn adyn19 = new adyn(1, 1);
                        adyn19.mo33932a(0, 0, ((Double) a23.f114468b).doubleValue());
                        adyn adyn20 = new adyn(1, 2);
                        adyn20.mo33932a(0, 0, 1.0d);
                        adyn20.mo33932a(0, 1, 0.0d);
                        bezv bezv2 = bezt.f113195h;
                        bezv2.f113203d.mo33934b(adyn18.f62912a, bezv2.f113200a.f62912a);
                        bsdg.m115306a(adyn20, bezv2.f113201b, bezv2.f113203d);
                        adyn adyn21 = bezv2.f113204e;
                        int i9 = adyn18.f62912a;
                        adyn21.mo33934b(i9, i9);
                        bsdg.m115309d(bezv2.f113203d, adyn20, bezv2.f113204e);
                        adyn adyn22 = bezv2.f113204e;
                        bsdg.m115310e(adyn22, adyn19, adyn22);
                        bezv2.f113202c.mo70258a(bezv2.f113204e);
                        adyn adyn23 = bezv2.f113203d;
                        int i10 = adyn18.f62912a;
                        adyn23.mo33934b(i10, i10);
                        bezv2.f113202c.mo70260b(bezv2.f113203d);
                        bezv2.f113204e.mo33934b(bezv2.f113200a.f62912a, adyn18.f62912a);
                        bsdg.m115308c(adyn20, bezv2.f113203d, bezv2.f113204e);
                        bezv2.f113203d.mo33934b(bezv2.f113200a.f62912a, adyn18.f62912a);
                        bsdg.m115306a(bezv2.f113201b, bezv2.f113204e, bezv2.f113203d);
                        bezv2.f113204e.mo33934b(adyn18.f62912a, 1);
                        bsdg.m115306a(adyn20, bezv2.f113200a, bezv2.f113204e);
                        adyn adyn24 = bezv2.f113204e;
                        bsdg.m115311f(adyn18, adyn24, adyn24);
                        adyn adyn25 = bezv2.f113204e;
                        adyn25.mo33932a(0, 0, bsgl.m115741a(adyn25.mo33930a(0, 0)));
                        bsdg.m115307b(bezv2.f113203d, bezv2.f113204e, bezv2.f113200a);
                        adyn adyn26 = bezv2.f113200a;
                        adyn26.mo33932a(0, 0, bsgl.m115744b(adyn26.mo33930a(0, 0)));
                        adyn adyn27 = bezv2.f113204e;
                        int i11 = bezv2.f113200a.f62912a;
                        adyn27.mo33934b(i11, i11);
                        bsdg.m115306a(bezv2.f113203d, adyn20, bezv2.f113204e);
                        adyn adyn28 = bezv2.f113203d;
                        int i12 = bezv2.f113200a.f62912a;
                        adyn28.mo33934b(i12, i12);
                        bsdg.m115306a(bezv2.f113204e, bezv2.f113201b, bezv2.f113203d);
                        adyn adyn29 = bezv2.f113201b;
                        bsdg.m115311f(adyn29, bezv2.f113203d, adyn29);
                        bezt.f113196i = j;
                        bfne3 = bfne.m97311a(Double.valueOf(bezt.f113195h.f113200a.mo33930a(0, 0)), Double.valueOf(bezt.f113195h.f113201b.mo33930a(0, 0)));
                        d4 = 1.0d;
                        bfbh = bfbh5;
                    }
                    bfbh = bfbh5;
                    d4 = d6;
                    bfne3 = bezt.mo61304a(d3, a18, sqrt3, sqrt4, j);
                } else {
                    bezu3 = bezu7;
                    bfbh3 = bfbh5;
                    d4 = 1.0d;
                }
                bfbh = bfbh3;
                bfne3 = bezt.mo61304a(d3, a18, sqrt3, sqrt4, j);
            } else {
                bezu3 = bezu7;
                d4 = 1.0d;
                bfbh = bfbh5;
                bfne3 = bezt.mo61304a(d3, a18, sqrt3, sqrt4, j);
            }
            bezu bezu8 = bezu3;
            bezu8.f113199c = bmxv.m108567c(bfne3);
            if (bezu8.f113199c.mo66813a()) {
                bfne bfne5 = (bfne) bezu8.f113199c.mo66814b();
                bmxy.m108581a((Double) bfne5.f114467a);
                bmxy.m108581a((Double) bfne5.f114468b);
                n3.mo70182b((float) Math.toDegrees(((Double) bfne5.f114467a).doubleValue()));
                n3.mo70177a((float) Math.toDegrees(Math.sqrt(((Double) bfne5.f114468b).doubleValue())));
            }
            bsbl a24 = n3.mo70174a();
            bnwc b4 = bnwc.m110613b(a24.mo70188c(), a24.mo70189d());
            float f = this.f113073d;
            double d51 = (double) f;
            Double.isNaN(d51);
            double d52 = (double) (1.0f - f);
            double d53 = (double) this.f113074e;
            double doubleValue = ((Double) bfne2.f114468b).doubleValue();
            Double.isNaN(d53);
            Double.isNaN(d52);
            bfne a25 = bfne.m97311a(b4, Double.valueOf((d51 * d2) + (d52 * d53 * doubleValue)));
            double altitude = location.getAltitude();
            if (cesw.f183411a.mo6606a().blueskyUseRasterAltitudeForChipsetCorrection()) {
                bezi bezi2 = bfbh.f113297b;
                int a26 = (int) bezi2.mo61282a((bnwc) a25.f114467a);
                int b5 = (int) bezi2.mo61286b((bnwc) a25.f114467a);
                if (!bezi2.mo61287b(a26, b5) || bezi2.mo61274a(bezi2.mo61283a(a26, b5)) == bznr.CLUTTER_UNKNOWN) {
                    ((bnsl) f113070a.mo68388c()).mo68408a("Unable to find pixel in local raster for location: (%f, %f)", ((bnwc) a25.f114467a).mo68615b(), ((bnwc) a25.f114467a).mo68617d());
                } else {
                    altitude = (double) (bezi2.mo61276b(bezi2.mo61283a(a26, b5)) + 1.5f);
                    bmxv.m108566b(Double.valueOf(altitude));
                }
            }
            if (this.f113076g) {
                bnwc bnwc = (bnwc) a25.f114467a;
                double doubleValue2 = ((Double) a25.f114468b).doubleValue();
                bmxy.m108600b(bfbh.f113296a == bfbh.f113301f.f113306a.get());
                int size = bfbh.f113298c.size();
                dArr = new double[size];
                double max4 = Math.max(doubleValue2, bfbh.f113301f.f113310e);
                double d54 = max4 + max4;
                int ceil = (int) Math.ceil(d54 / bfbh.f113301f.f113311f);
                int i13 = 0;
                double d55 = 0.0d;
                while (i13 <= ceil) {
                    bfbj bfbj = bfbh.f113301f;
                    bfbh bfbh6 = bfbh;
                    double d56 = (double) i13;
                    double d57 = altitude;
                    double d58 = bfbj.f113311f;
                    Double.isNaN(d56);
                    double d59 = d56 * d58;
                    int max5 = Math.max(bfbj.f113312g * i13, 1);
                    double sqrt5 = (d4 / (Math.sqrt(6.283185307179586d) * max4)) * Math.exp((-(d59 * d59)) / (d54 * max4));
                    int i14 = 0;
                    while (i14 < max5) {
                        double d60 = max4;
                        double d61 = (double) (i14 + i14);
                        Double.isNaN(d61);
                        double d62 = d54;
                        double d63 = (double) max5;
                        Double.isNaN(d63);
                        double d64 = (d61 * 3.141592653589793d) / d63;
                        double b6 = bnwc.mo68615b() + Math.toDegrees(ayuo.m84855e(Math.cos(d64) * d59));
                        bnwc b7 = bnwc.m110613b(b6, bnwc.mo68617d() + Math.toDegrees(ayuo.m84845b(Math.sin(d64) * d59, b6)));
                        bfbh bfbh7 = bfbh6;
                        bmxy.m108588a(bfbh7.mo61361a(b7, bfbh7.f113300e));
                        int i15 = 0;
                        while (i15 < size) {
                            double d65 = dArr[i15];
                            double d66 = (double) bfbh7.f113300e[i15];
                            Double.isNaN(d66);
                            dArr[i15] = d65 + (d66 * sqrt5);
                            i15++;
                            bnwc = bnwc;
                        }
                        d55 += sqrt5;
                        i14++;
                        bfbh6 = bfbh7;
                        d54 = d62;
                        max4 = d60;
                    }
                    i13++;
                    bfbh = bfbh6;
                    altitude = d57;
                    max4 = max4;
                }
                d5 = altitude;
                bfbh2 = bfbh;
                for (int i16 = 0; i16 < size; i16++) {
                    dArr[i16] = dArr[i16] / d55;
                }
            } else {
                d5 = altitude;
                bfbh2 = bfbh;
                int size2 = bfbk.mo61359a().size();
                float[] fArr = new float[size2];
                dArr = new double[size2];
                if (bfbk.mo61361a((bnwc) a25.f114467a, fArr)) {
                    for (int i17 = 0; i17 < size2; i17++) {
                        dArr[i17] = (double) fArr[i17];
                    }
                }
            }
            GnssMeasurementCorrections.Builder builder = new GnssMeasurementCorrections.Builder();
            builder.setAltitudeMeters(d5);
            builder.setLatitudeDegrees(((bnwc) a25.f114467a).mo68615b());
            builder.setLongitudeDegrees(((bnwc) a25.f114467a).mo68617d());
            builder.setHorizontalPositionUncertaintyMeters(((Double) a25.f114468b).doubleValue());
            builder.setVerticalPositionUncertaintyMeters((double) location.getVerticalAccuracyMeters());
            if (cesw.f183411a.mo6606a().blueskyChipsetCorrectionTimeOfWeek()) {
                long time = location.getTime();
                bxvt bxvt = cesw.f183411a.mo6606a().blueskyUtcSecondsAtLeaps().f165791a;
                if (bxvt.size() >= 18) {
                    int size3 = bxvt.size();
                    int i18 = 0;
                    int i19 = 0;
                    while (i18 < size3 && time > ((long) ((Integer) bxvt.get(i18)).intValue()) * 1000) {
                        i19 += 1000;
                        i18++;
                    }
                    long j4 = (time + ((long) i19)) - 315964800000L;
                    if (j4 >= 0) {
                        j3 = j4 % 604800000;
                        if (j3 >= 0) {
                            ((bnsl) f113070a.mo68388c()).mo68415a("GPS TOW is negative. It is converted from illegal UTC milliseconds: %d", location.getTime());
                            return;
                        }
                        builder.setToaGpsNanosecondsOfWeek(j3 * 1000000);
                    }
                }
                j3 = -1;
                if (j3 >= 0) {
                }
            } else {
                builder.setToaGpsNanosecondsOfWeek(location.getTime() * 1000000);
            }
            ArrayList arrayList = new ArrayList();
            List a27 = bfbk.mo61359a();
            for (int i20 = 0; i20 < a27.size(); i20++) {
                arrayList.add(m96105a((bfbp) a27.get(i20), dArr[i20]));
            }
            if (this.f113075f) {
                if (bfbh2.f113296a == bfbh2.f113301f.f113306a.get()) {
                    z = true;
                } else {
                    z = false;
                }
                bmxy.m108600b(z);
                List list = bfbh2.f113299d;
                int size4 = list.size();
                for (int i21 = 0; i21 < size4; i21++) {
                    arrayList.add(m96105a((bfbp) list.get(i21), 0.0d));
                }
            }
            this.f113071b.injectGnssMeasurementCorrections(builder.setSingleSatelliteCorrectionList(arrayList).build());
        }
    }
}
