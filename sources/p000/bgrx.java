package p000;

import android.content.Context;
import android.hardware.SensorEvent;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.os.HandlerThread;
import com.google.android.location.quake.ShakeEvent;
import com.google.android.location.quake.ShakeVettingHints;
import java.lang.reflect.Array;
import java.util.concurrent.TimeUnit;

/* renamed from: bgrx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bgrx extends aaco {

    /* renamed from: a */
    public final Context f117388a;

    /* renamed from: b */
    public final HandlerThread f117389b;

    /* renamed from: c */
    public final buoc f117390c;

    /* renamed from: d */
    public bmxv f117391d;

    /* renamed from: e */
    public SensorManager f117392e;

    /* renamed from: f */
    private final bgsq f117393f;

    /* renamed from: g */
    private final buoa f117394g;

    /* renamed from: h */
    private final bgsb f117395h;

    static {
        sgj sgj = sgj.UNKNOWN;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public bgrx(Context context, HandlerThread handlerThread, bgsb bgsb, bgsq bgsq) {
        super("SeismicMonitor", "location");
        buoc buoc = new buoc(TimeUnit.MILLISECONDS.toNanos(cezu.m138493n()), TimeUnit.MILLISECONDS.toNanos(cezu.f183534a.mo6606a().seismicEventDetectionWindowMillis()), TimeUnit.MILLISECONDS.toNanos(cezu.m138494o()), TimeUnit.MILLISECONDS.toNanos(cezu.f183534a.mo6606a().seismicOffsetRefreshIntervalMillis()), (int) cezu.m138484e(), (int) cezu.f183534a.mo6606a().seismicAccelFrequencyMax(), (int) cezu.f183534a.mo6606a().seismicAccelFrequencyMin(), cezv.f183536a.mo6606a().quakeApiAccelQuantizedLsbMs2());
        bunw bunw = new bunw();
        bunw.f154436a = Long.valueOf(TimeUnit.MILLISECONDS.toNanos(cezu.m138493n() + cezu.f183534a.mo6606a().seismicDetectorTimeoutMillis()));
        bunw.f154437b = Double.valueOf(cezu.f183534a.mo6606a().seismicAccelVarianceThreshold());
        bunw.f154438c = Double.valueOf(cezu.f183534a.mo6606a().seismicAccelMeanDiffThreshold());
        bunw.f154439d = Integer.valueOf((int) cezu.f183534a.mo6606a().seismicAccelResamplingRate());
        bunw.f154440e = Boolean.valueOf(cezu.f183534a.mo6606a().seismicAccelAngles());
        bunw.f154441f = Double.valueOf(cezu.f183534a.mo6606a().seismicAnglesFilterAlpha());
        bunw.f154442g = Double.valueOf(cezu.f183534a.mo6606a().seismicAnglesThresholdDegrees());
        bunw.f154443h = Integer.valueOf((int) cezu.f183534a.mo6606a().seismicRunningPickupRecency());
        bunw.f154444i = Boolean.valueOf(cezu.f183534a.mo6606a().seismicAccelShortenEpoch());
        bunw.f154445j = Double.valueOf(cezu.f183534a.mo6606a().seismicAccelEpochProportion());
        bunw.f154446k = Boolean.valueOf(cezu.m138482c());
        bunw.f154447l = Double.valueOf(cezu.f183534a.mo6606a().seismicAccelOutlierAccelThreshold());
        bunw.f154448m = Boolean.valueOf(cezu.m138483d());
        bunw.f154449n = Double.valueOf(cezu.f183534a.mo6606a().seismicAccelSpikeThreshold());
        bunw.f154450o = Double.valueOf(cezu.f183534a.mo6606a().seismicAccelSpikeDurationSeconds());
        bunw.f154451p = Boolean.valueOf(cezu.m138481b());
        bunw.f154452q = Boolean.valueOf(cezu.m138485f());
        bunw.f154453r = Boolean.valueOf(cezu.m138486g());
        bunw.f154454s = Double.valueOf(cezu.f183534a.mo6606a().seismicAccelMinVarianceThresholdM2s4());
        bunw.f154455t = Double.valueOf(cezu.f183534a.mo6606a().seismicAccelMaxVarianceThresholdM2s4());
        bunw.f154456u = Double.valueOf(cezu.f183534a.mo6606a().seismicAccelVarianceThresholdFactor());
        bunw.f154457v = Double.valueOf(cezu.f183534a.mo6606a().seismicAccelVarianceThresholdNoisySessionM2s4());
        bunw.f154459x = Double.valueOf(cezu.f183534a.mo6606a().seismicAccelFilterInputFactor());
        bunw.f154458w = Double.valueOf(cezu.f183534a.mo6606a().seismicAccelVarianceFilterAlpha());
        String str = bunw.f154436a == null ? " timeoutNanos" : "";
        str = bunw.f154437b == null ? str.concat(" varianceThreshold") : str;
        str = bunw.f154438c == null ? String.valueOf(str).concat(" diffMeanThreshold") : str;
        str = bunw.f154439d == null ? String.valueOf(str).concat(" resamplingRate") : str;
        str = bunw.f154440e == null ? String.valueOf(str).concat(" seismicAccelAngles") : str;
        str = bunw.f154441f == null ? String.valueOf(str).concat(" anglesFilterAlpha") : str;
        str = bunw.f154442g == null ? String.valueOf(str).concat(" accelAnglesThresholdDegrees") : str;
        str = bunw.f154443h == null ? String.valueOf(str).concat(" seismicRunningPickupRecencyEpochs") : str;
        str = bunw.f154444i == null ? String.valueOf(str).concat(" seismicAccelShortenEpoch") : str;
        str = bunw.f154445j == null ? String.valueOf(str).concat(" seismicAccelEpochProportion") : str;
        str = bunw.f154446k == null ? String.valueOf(str).concat(" detectOutliers") : str;
        str = bunw.f154447l == null ? String.valueOf(str).concat(" outlierAccelThreshold") : str;
        str = bunw.f154448m == null ? String.valueOf(str).concat(" detectSpikes") : str;
        str = bunw.f154449n == null ? String.valueOf(str).concat(" spikeThreshold") : str;
        str = bunw.f154450o == null ? String.valueOf(str).concat(" spikeDurationSeconds") : str;
        str = bunw.f154451p == null ? String.valueOf(str).concat(" seismicAccelAdaptiveThreshold") : str;
        str = bunw.f154452q == null ? String.valueOf(str).concat(" seismicAccelIndividualAdaptiveThreshold") : str;
        str = bunw.f154453r == null ? String.valueOf(str).concat(" seismicAccelRejectNoisyDetectionSession") : str;
        str = bunw.f154454s == null ? String.valueOf(str).concat(" seismicAccelMinVarianceThresholdM2s4") : str;
        str = bunw.f154455t == null ? String.valueOf(str).concat(" seismicAccelMaxVarianceThresholdM2s4") : str;
        str = bunw.f154456u == null ? String.valueOf(str).concat(" seismicAccelVarianceThresholdFactor") : str;
        str = bunw.f154457v == null ? String.valueOf(str).concat(" seismicAccelVarianceThresholdNoisySessionM2s4") : str;
        str = bunw.f154458w == null ? String.valueOf(str).concat(" seismicAccelVarianceFilterAlpha") : str;
        str = bunw.f154459x == null ? String.valueOf(str).concat(" seismicAccelFilterInputFactor") : str;
        if (!str.isEmpty()) {
            String valueOf = String.valueOf(str);
            throw new IllegalStateException(valueOf.length() == 0 ? new String("Missing required properties:") : "Missing required properties:".concat(valueOf));
        }
        buoa buoa = new buoa(new buod(bunw.f154436a.longValue(), bunw.f154437b.doubleValue(), bunw.f154438c.doubleValue(), bunw.f154439d.intValue(), bunw.f154440e.booleanValue(), bunw.f154441f.doubleValue(), bunw.f154442g.doubleValue(), bunw.f154443h.intValue(), bunw.f154444i.booleanValue(), bunw.f154445j.doubleValue(), bunw.f154446k.booleanValue(), bunw.f154447l.doubleValue(), bunw.f154448m.booleanValue(), bunw.f154449n.doubleValue(), bunw.f154450o.doubleValue(), bunw.f154451p.booleanValue(), bunw.f154452q.booleanValue(), bunw.f154453r.booleanValue(), bunw.f154454s.doubleValue(), bunw.f154455t.doubleValue(), bunw.f154456u.doubleValue(), bunw.f154457v.doubleValue(), bunw.f154458w.doubleValue(), bunw.f154459x.doubleValue()));
        this.f117391d = bmvz.f131120a;
        this.f117388a = context;
        this.f117389b = handlerThread;
        this.f117395h = bgsb;
        this.f117393f = bgsq;
        this.f117390c = buoc;
        this.f117394g = buoa;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:134:0x0419, code lost:
        if (r8.f154427o < r4) goto L_0x041b;
     */
    /* JADX WARNING: Removed duplicated region for block: B:138:0x0422 A[Catch:{ NullPointerException -> 0x080b }] */
    /* JADX WARNING: Removed duplicated region for block: B:139:0x0425 A[ADDED_TO_REGION, Catch:{ NullPointerException -> 0x080b }] */
    /* JADX WARNING: Removed duplicated region for block: B:156:0x047b A[Catch:{ NullPointerException -> 0x080b }] */
    /* JADX WARNING: Removed duplicated region for block: B:157:0x0480 A[Catch:{ NullPointerException -> 0x080b }] */
    /* JADX WARNING: Removed duplicated region for block: B:189:0x057d A[Catch:{ NullPointerException -> 0x080b }] */
    /* JADX WARNING: Removed duplicated region for block: B:192:0x05b4 A[Catch:{ NullPointerException -> 0x080b }] */
    /* JADX WARNING: Removed duplicated region for block: B:195:0x05e5 A[Catch:{ NullPointerException -> 0x080b }] */
    /* renamed from: a */
    public final void mo9869a(SensorEvent sensorEvent) {
        bfku bfku;
        long j;
        double[][] dArr;
        double[][] dArr2;
        boolean z;
        buoa buoa;
        double d;
        boolean z2;
        double d2;
        double d3;
        double d4;
        double d5;
        double d6;
        double d7;
        double d8;
        double d9;
        double d10;
        double[][] dArr3;
        boolean z3;
        boolean z4;
        boolean z5;
        bunx bunx;
        bunx bunx2;
        bunx bunx3;
        int i;
        double d11;
        double d12;
        int a;
        SensorEvent sensorEvent2 = sensorEvent;
        try {
            buoc buoc = this.f117390c;
            long j2 = sensorEvent2.timestamp;
            buoc.f154473a.mo61830a(j2, sensorEvent2.values);
            long j3 = buoc.f154479g;
            if (j3 == -1) {
                buoc.f154479g = j2;
                j3 = j2;
            }
            boolean z6 = false;
            if (j2 - j3 < buoc.f154474b || (a = buoc.f154473a.mo61827a(j2 - buoc.f154475c)) == -1) {
                if (j2 - buoc.f154480h >= buoc.f154476d) {
                    buoc.f154480h = j2;
                    buoc.f154481i = TimeUnit.MILLISECONDS.toNanos(System.currentTimeMillis()) - j2;
                }
                bfku = null;
            } else {
                buoc.f154479g = j2;
                bfkf bfkf = buoc.f154473a;
                int i2 = bfkf.f114284c - a;
                long[] jArr = new long[i2];
                int[] iArr = new int[2];
                iArr[1] = i2;
                iArr[0] = 3;
                float[][] fArr = (float[][]) Array.newInstance(float.class, iArr);
                for (int i3 = 0; i3 < i2; i3++) {
                    int i4 = a + i3;
                    jArr[i3] = bfkf.mo61829a(i4);
                    fArr[0][i3] = bfkf.mo61826a(i4, 0);
                    fArr[1][i3] = bfkf.mo61826a(i4, 1);
                    fArr[2][i3] = bfkf.mo61826a(i4, 2);
                }
                bfku = new bfku(jArr, fArr);
            }
            if (bfku != null) {
                buoa buoa2 = this.f117394g;
                long nanos = TimeUnit.MILLISECONDS.toNanos(System.currentTimeMillis());
                bunx bunx4 = buoa2.f154468a;
                if (((buod) bunx4).f154490i) {
                    long a2 = bfku.mo61857a(0);
                    long a3 = bfku.mo61857a(bfku.f114316b - 1);
                    double d13 = (double) a3;
                    double d14 = (double) a2;
                    Double.isNaN(d13);
                    Double.isNaN(d14);
                    double d15 = (d13 - d14) / 1.0E9d;
                    bunx bunx5 = buoa2.f154468a;
                    double d16 = d15 * ((buod) bunx5).f154491j;
                    dArr = bevb.m95937a(bfku, (double) ((buod) bunx5).f154485d);
                    double d17 = (double) ((buod) buoa2.f154468a).f154485d;
                    Double.isNaN(d17);
                    int i5 = (int) (d16 * d17);
                    if (i5 > 0) {
                        Double.isNaN(d17);
                        double d18 = d17 * 1.0E-9d;
                        double a4 = (double) (bfku.mo61857a(bfku.f114316b - 1) - bfku.mo61857a(0));
                        Double.isNaN(a4);
                        if (((int) (a4 * d18)) + 1 < i5) {
                            i5 = 1;
                        }
                        dArr2 = bevb.m95938a(bfku, d18, i5);
                    } else {
                        dArr2 = dArr;
                    }
                    j = a3;
                } else {
                    dArr2 = bevb.m95937a(bfku, (double) ((buod) bunx4).f154485d);
                    j = nanos;
                    dArr = dArr2;
                }
                bunx bunx6 = buoa2.f154468a;
                bunv bunv = new bunv(j, ((buod) bunx6).f154501t / ((buod) bunx6).f154502u, ((buod) bunx6).f154499r);
                bunv bunv2 = buoa2.f154469b;
                if (bunv2 != null) {
                    if (bunv.f154413a - bunv2.f154413a > ((buod) buoa2.f154468a).f154482a) {
                        buoa2.f154469b = null;
                    }
                }
                bunv.f154415c = bevb.m95935a(dArr2[0]);
                bunv.f154416d = bevb.m95935a(dArr2[1]);
                bunv.f154417e = bevb.m95935a(dArr2[2]);
                bunv.f154428p = bevb.m95939b(dArr2[0]);
                bunv.f154429q = bevb.m95939b(dArr2[1]);
                bunv.f154430r = bevb.m95939b(dArr2[2]);
                if (((buod) buoa2.f154468a).f154486e) {
                    double d19 = bunv.f154415c;
                    double d20 = bunv.f154416d;
                    double d21 = bunv.f154417e;
                    bunv.f154423k = Math.toDegrees(Math.atan2(d19, Math.sqrt((d21 * d21) + (0.01d * d20 * d20)) * Math.signum(d21)));
                    double d22 = bunv.f154415c;
                    double d23 = bunv.f154416d;
                    double d24 = bunv.f154417e;
                    bunv.f154424l = Math.toDegrees(Math.atan2(-d23, Math.sqrt((d22 * d22) + (d24 * d24))));
                }
                bunx bunx7 = buoa2.f154468a;
                double d25 = ((buod) bunx7).f154483b;
                bunv bunv3 = buoa2.f154469b;
                if (bunv3 == null) {
                    buoa = buoa2;
                    d3 = d25;
                    d2 = d3;
                    d = d2;
                    z2 = false;
                    z = false;
                } else {
                    double min = ((buod) bunx7).f154497p ? Math.min(((buod) bunx7).f154501t, Math.max(((buod) bunx7).f154500s, bunv3.f154431s * ((buod) bunx7).f154502u)) : d25;
                    bunx bunx8 = buoa2.f154468a;
                    if (((buod) bunx8).f154498q) {
                        double a5 = buoa.m120143a(bunx8, buoa2.f154469b.f154432t);
                        double a6 = buoa.m120143a(buoa2.f154468a, buoa2.f154469b.f154433u);
                        double a7 = buoa.m120143a(buoa2.f154468a, buoa2.f154469b.f154434v);
                        d7 = ((a5 + a6) + a7) / 3.0d;
                        d4 = a7;
                        d5 = a6;
                        d6 = a5;
                    } else {
                        d5 = d25;
                        d4 = d5;
                        d7 = min;
                        d6 = d4;
                    }
                    try {
                        bunv.f154425m = Math.abs(buoa2.f154469b.f154415c - bunv.f154415c);
                        bunv.f154426n = Math.abs(buoa2.f154469b.f154416d - bunv.f154416d);
                        bunv.f154427o = Math.abs(buoa2.f154469b.f154417e - bunv.f154417e);
                        bunx bunx9 = buoa2.f154468a;
                        if (((buod) bunx9).f154486e) {
                            bunv bunv4 = buoa2.f154469b;
                            bunv.f154421i = bunv4.f154423k;
                            bunv.f154422j = bunv4.f154424l;
                            double d26 = ((buod) bunx9).f154487f;
                            if (!buoa.m120145a(dArr)) {
                                dArr3 = dArr2;
                                d9 = d7;
                                d8 = d6;
                                d10 = d5;
                                buoa = buoa2;
                            } else if (d26 < 0.0d || d26 > 1.0d) {
                                dArr3 = dArr2;
                                d9 = d7;
                                d8 = d6;
                                d10 = d5;
                                buoa = buoa2;
                            } else {
                                bunv bunv5 = buoa2.f154469b;
                                bunv.f154418f = bunv5.f154418f;
                                bunv.f154419g = bunv5.f154419g;
                                bunv.f154420h = bunv5.f154420h;
                                int i6 = 0;
                                boolean z7 = false;
                                while (true) {
                                    dArr3 = dArr2;
                                    double[] dArr4 = dArr[0];
                                    if (i6 >= dArr4.length) {
                                        break;
                                    }
                                    double d27 = 1.0d - d26;
                                    double d28 = d7;
                                    double d29 = (dArr4[i6] * d26) + (bunv.f154418f * d27);
                                    bunv.f154418f = d29;
                                    double d30 = d6;
                                    double d31 = (dArr[1][i6] * d26) + (bunv.f154419g * d27);
                                    bunv.f154419g = d31;
                                    buoa buoa3 = buoa2;
                                    double d32 = (dArr[2][i6] * d26) + (d27 * bunv.f154420h);
                                    bunv.f154420h = d32;
                                    if (!z7) {
                                        bunv bunv6 = buoa3.f154469b;
                                        d12 = d26;
                                        double d33 = bunv6.f154415c;
                                        d11 = d5;
                                        double d34 = bunv6.f154416d;
                                        i = i6;
                                        double d35 = bunv6.f154417e;
                                        double d36 = (d29 * d33) + (d31 * d34) + (d32 * d35);
                                        double sqrt = Math.sqrt((d29 * d29) + (d31 * d31) + (d32 * d32)) * Math.sqrt((d33 * d33) + (d34 * d34) + (d35 * d35));
                                        if ((sqrt > Double.MIN_NORMAL ? Math.toDegrees(Math.acos(d36 / sqrt)) : 0.0d) <= ((buod) buoa3.f154468a).f154488g) {
                                            z7 = false;
                                            i6 = i + 1;
                                            buoa2 = buoa3;
                                            dArr2 = dArr3;
                                            d26 = d12;
                                            d5 = d11;
                                            d7 = d28;
                                            d6 = d30;
                                        }
                                    } else {
                                        d12 = d26;
                                        i = i6;
                                        d11 = d5;
                                    }
                                    z7 = true;
                                    i6 = i + 1;
                                    buoa2 = buoa3;
                                    dArr2 = dArr3;
                                    d26 = d12;
                                    d5 = d11;
                                    d7 = d28;
                                    d6 = d30;
                                }
                                d9 = d7;
                                d8 = d6;
                                d10 = d5;
                                buoa = buoa2;
                                if (z7) {
                                    bunv.f154414b = ((buod) buoa.f154468a).f154489h;
                                }
                            }
                            bunv.f154414b = Math.max(0, buoa.f154469b.f154414b - 1);
                        } else {
                            dArr3 = dArr2;
                            d9 = d7;
                            d8 = d6;
                            d10 = d5;
                            buoa = buoa2;
                        }
                        bunx bunx10 = buoa.f154468a;
                        if (!((buod) bunx10).f154486e) {
                            if (bunv.f154428p <= d9 && bunv.f154429q <= d9) {
                                if (bunv.f154430r > d9) {
                                }
                            }
                            double d37 = bunv.f154425m;
                            double d38 = ((buod) bunx10).f154484c;
                            if (d37 < d38) {
                                if (bunv.f154426n < d38) {
                                }
                            }
                        } else if (((buod) bunx10).f154498q) {
                            if (bunv.f154428p > d8 || bunv.f154429q > d10 || bunv.f154430r > d4) {
                                double d39 = bunv.f154425m;
                                double d40 = ((buod) bunx10).f154484c;
                                if (d39 < d40 && bunv.f154426n < d40 && bunv.f154427o < d40 && bunv.f154414b == 0) {
                                    z3 = true;
                                    if (!((buod) bunx10).f154492k) {
                                        z4 = false;
                                    } else {
                                        if (z3 && buoa.m120145a(dArr3)) {
                                            int i7 = 0;
                                            while (true) {
                                                double[] dArr5 = dArr3[0];
                                                if (i7 >= dArr5.length) {
                                                    break;
                                                } else if (Math.abs(dArr5[i7]) > ((buod) buoa.f154468a).f154493l || Math.abs(dArr3[1][i7]) > ((buod) buoa.f154468a).f154493l || Math.abs(dArr3[2][i7]) > ((buod) buoa.f154468a).f154493l) {
                                                    z4 = true;
                                                } else {
                                                    i7++;
                                                }
                                            }
                                            z4 = true;
                                        }
                                        z4 = false;
                                    }
                                    if (!((buod) buoa.f154468a).f154494m) {
                                        z5 = z3;
                                        z = false;
                                    } else if (!z3 || !buoa.m120145a(dArr3)) {
                                        z5 = z3;
                                        z = false;
                                    } else {
                                        int length = dArr3[0].length;
                                        int i8 = 0;
                                        int i9 = 0;
                                        double d41 = 0.0d;
                                        while (i8 < length) {
                                            int i10 = length;
                                            boolean z8 = z3;
                                            double abs = Math.abs(dArr3[0][i8] - bunv.f154415c) + Math.abs(dArr3[1][i8] - bunv.f154416d) + Math.abs(dArr3[2][i8] - bunv.f154417e);
                                            if (abs > d41) {
                                                i9 = i8;
                                            }
                                            if (abs > d41) {
                                                d41 = abs;
                                            }
                                            i8++;
                                            z3 = z8;
                                            length = i10;
                                        }
                                        int i11 = length;
                                        z5 = z3;
                                        bunx bunx11 = buoa.f154468a;
                                        double d42 = (double) ((buod) bunx11).f154485d;
                                        double d43 = ((buod) bunx11).f154496o;
                                        Double.isNaN(d42);
                                        int round = (int) Math.round(d42 * d43);
                                        int max = Math.max(0, (i9 - round) + 1);
                                        double d44 = 0.0d;
                                        while (max <= i9) {
                                            int i12 = i11;
                                            int min2 = Math.min(i12, max + round);
                                            int i13 = max;
                                            double d45 = 0.0d;
                                            while (i13 < min2) {
                                                d45 += Math.pow(dArr3[0][i13] - bunv.f154415c, 2.0d) + Math.pow(dArr3[1][i13] - bunv.f154416d, 2.0d) + Math.pow(dArr3[2][i13] - bunv.f154417e, 2.0d);
                                                i13++;
                                                round = round;
                                                i12 = i12;
                                            }
                                            d44 = Math.max(d44, d45);
                                            max++;
                                            round = round;
                                            i11 = i12;
                                        }
                                        double d46 = bunv.f154428p + bunv.f154429q + bunv.f154430r;
                                        double d47 = (double) i11;
                                        Double.isNaN(d47);
                                        double d48 = d46 * d47;
                                        z = d48 - d44 < d48 * ((buod) buoa.f154468a).f154495n;
                                    }
                                    bunx = buoa.f154468a;
                                    if (((buod) bunx).f154497p) {
                                        double min3 = Math.min(((buod) bunx).f154505x * buoa.f154469b.f154431s, ((bunv.f154428p + bunv.f154429q) + bunv.f154430r) / 3.0d);
                                        double d49 = ((buod) buoa.f154468a).f154504w;
                                        bunv.f154431s = (min3 * d49) + ((1.0d - d49) * buoa.f154469b.f154431s);
                                    }
                                    bunx2 = buoa.f154468a;
                                    if (((buod) bunx2).f154498q) {
                                        bunv.f154432t = buoa.m120144a(bunx2, bunv.f154428p, buoa.f154469b.f154432t);
                                        bunv.f154433u = buoa.m120144a(buoa.f154468a, bunv.f154429q, buoa.f154469b.f154433u);
                                        bunv.f154434v = buoa.m120144a(buoa.f154468a, bunv.f154430r, buoa.f154469b.f154434v);
                                    }
                                    bunx3 = buoa.f154468a;
                                    if (((buod) bunx3).f154499r) {
                                        if (((buod) bunx3).f154498q) {
                                            double d50 = ((buod) bunx3).f154503v;
                                            if (buoa.f154469b.f154435w && d8 >= d50 && d10 >= d50 && d4 >= d50) {
                                            }
                                        } else if (!buoa.f154469b.f154435w || d9 < ((buod) bunx3).f154503v) {
                                            bunv.f154435w = false;
                                        }
                                        z2 = z4;
                                        z6 = z5;
                                        d = d4;
                                        d2 = d10;
                                        d25 = d9;
                                        d3 = d8;
                                    }
                                    bunv.f154435w = false;
                                    z2 = z4;
                                    z6 = z5;
                                    d = d4;
                                    d2 = d10;
                                    d25 = d9;
                                    d3 = d8;
                                }
                            }
                        } else if (bunv.f154428p > d9 || bunv.f154429q > d9 || bunv.f154430r > d9) {
                            double d51 = bunv.f154425m;
                            double d52 = ((buod) bunx10).f154484c;
                            if (d51 < d52 && bunv.f154426n < d52 && bunv.f154427o < d52) {
                                z3 = true;
                                if (!((buod) bunx10).f154492k) {
                                }
                                if (!((buod) buoa.f154468a).f154494m) {
                                }
                                bunx = buoa.f154468a;
                                if (((buod) bunx).f154497p) {
                                }
                                bunx2 = buoa.f154468a;
                                if (((buod) bunx2).f154498q) {
                                }
                                bunx3 = buoa.f154468a;
                                if (((buod) bunx3).f154499r) {
                                }
                                bunv.f154435w = false;
                                z2 = z4;
                                z6 = z5;
                                d = d4;
                                d2 = d10;
                                d25 = d9;
                                d3 = d8;
                            }
                        }
                        z3 = false;
                        if (!((buod) bunx10).f154492k) {
                        }
                        if (!((buod) buoa.f154468a).f154494m) {
                        }
                        bunx = buoa.f154468a;
                        if (((buod) bunx).f154497p) {
                        }
                        bunx2 = buoa.f154468a;
                        if (((buod) bunx2).f154498q) {
                        }
                        bunx3 = buoa.f154468a;
                        if (((buod) bunx3).f154499r) {
                        }
                        bunv.f154435w = false;
                        z2 = z4;
                        z6 = z5;
                        d = d4;
                        d2 = d10;
                        d25 = d9;
                        d3 = d8;
                    } catch (NullPointerException e) {
                        return;
                    }
                }
                buoa.f154469b = bunv;
                buny buny = new buny();
                buny.mo72949a(false);
                buny.mo72951b(false);
                buny.mo72953c(false);
                buny.mo72948a(0.0d);
                buny.mo72950b(0.0d);
                buny.mo72952c(0.0d);
                buny.mo72954d(0.0d);
                buny.f154467h = new bunv(0, 0.0d, false);
                buny.mo72949a(z6);
                buny.mo72951b(z2);
                buny.mo72953c(z);
                buny.mo72948a(d25);
                buny.mo72950b(d3);
                buny.mo72952c(d2);
                buny.mo72954d(d);
                buny.f154467h = bunv;
                String str = "";
                if (buny.f154460a == null) {
                    str = " detected";
                }
                if (buny.f154461b == null) {
                    str = str.concat(" outlierAccel");
                }
                if (buny.f154462c == null) {
                    str = String.valueOf(str).concat(" spike");
                }
                if (buny.f154463d == null) {
                    str = String.valueOf(str).concat(" accelVarianceAverageThresholdM2s4");
                }
                if (buny.f154464e == null) {
                    str = String.valueOf(str).concat(" accelVarianceXThresholdM2s4");
                }
                if (buny.f154465f == null) {
                    str = String.valueOf(str).concat(" accelVarianceYThresholdM2s4");
                }
                if (buny.f154466g == null) {
                    str = String.valueOf(str).concat(" accelVarianceZThresholdM2s4");
                }
                if (buny.f154467h == null) {
                    str = String.valueOf(str).concat(" accelFeatures");
                }
                if (str.isEmpty()) {
                    buoe buoe = new buoe(buny.f154460a.booleanValue(), buny.f154461b.booleanValue(), buny.f154462c.booleanValue(), buny.f154463d.doubleValue(), buny.f154464e.doubleValue(), buny.f154465f.doubleValue(), buny.f154466g.doubleValue(), buny.f154467h);
                    try {
                        this.f117391d = bmxv.m108566b(buoe);
                        if (buoe.f154506a) {
                            bgsb bgsb = this.f117395h;
                            long b = bgse.m99840b(this.f117388a);
                            boolean z9 = buoe.f154507b;
                            boolean z10 = buoe.f154508c;
                            bunv bunv7 = buoe.f154513h;
                            double d53 = bunv7.f154421i;
                            double d54 = bunv7.f154422j;
                            double d55 = buoe.f154509d;
                            double d56 = buoe.f154510e;
                            double d57 = buoe.f154511f;
                            double d58 = buoe.f154512g;
                            int d59 = bgsb.f117405a.mo63109d();
                            ShakeVettingHints shakeVettingHints = r14;
                            ShakeVettingHints shakeVettingHints2 = new ShakeVettingHints(b, z9, z10, d53, d54, d55, d56, d57, d58, d59);
                            if (cezu.f183534a.mo6606a().seismicFilterActiveVibe()) {
                                if (shakeVettingHints.f150848a >= 0 && Math.abs(TimeUnit.NANOSECONDS.toMillis(buoe.f154513h.f154413a) - shakeVettingHints.f150848a) < cezu.f183534a.mo6606a().seismicFilterActiveVibeIntervalMs()) {
                                    return;
                                }
                            }
                            if (cezu.f183534a.mo6606a().seismicAccelFilterOutlierAccel()) {
                                if (buoe.f154507b) {
                                    return;
                                }
                            }
                            if (!cezu.f183534a.mo6606a().seismicAccelFilterSpikes() || !buoe.f154508c) {
                                if (cezu.m138486g()) {
                                    if (buoe.f154513h.f154435w) {
                                        return;
                                    }
                                }
                                if (cezu.m138503x() == 2) {
                                    if (shakeVettingHints.f150857j == 2) {
                                        return;
                                    }
                                }
                                ShakeEvent shakeEvent = new ShakeEvent(buoe.f154513h.f154413a, shakeVettingHints);
                                try {
                                    bgsq bgsq = this.f117393f;
                                    bgtg bgtg = bgsq.f117450b;
                                    int i14 = bgsq.f117449a;
                                    int i15 = bgth.f117484d;
                                    String str2 = bgtg.f117483a.f117485a;
                                    Bundle bundle = new Bundle();
                                    bundle.putParcelable("d", shakeEvent);
                                    bgtg.mo63148a(i14, bundle);
                                } catch (NullPointerException e2) {
                                }
                            }
                        }
                    } catch (NullPointerException e3) {
                    }
                } else {
                    String valueOf = String.valueOf(str);
                    throw new IllegalStateException(valueOf.length() == 0 ? new String("Missing required properties:") : "Missing required properties:".concat(valueOf));
                }
            }
        } catch (NullPointerException e4) {
        }
    }
}
