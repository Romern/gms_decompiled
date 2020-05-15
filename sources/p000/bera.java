package p000;

import java.util.Locale;
import java.util.Map;
import java.util.Random;
import java.util.Set;

/* renamed from: bera */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bera extends beqw {

    /* renamed from: A */
    private final double f112097A = cese.f183399a.mo6606a().sensorBatchingProbDelayConst();

    /* renamed from: r */
    public long f112098r = -1;

    /* renamed from: s */
    public long f112099s = -1;

    /* renamed from: t */
    public long f112100t = -1;

    /* renamed from: u */
    public bfkv f112101u;

    /* renamed from: v */
    public double f112102v = 1.0d;

    /* renamed from: w */
    public final double f112103w = cese.f183399a.mo6606a().sensorBatchingProbMin();

    /* renamed from: x */
    public final Random f112104x = new Random();

    /* renamed from: y */
    public final besa f112105y;

    /* renamed from: z */
    public final beth f112106z;

    public bera(bglx bglx, bhck bhck, bgmk bgmk, bfor bfor, betm betm, besa besa, beth beth) {
        super(bglx, bhck, bfor, betm);
        this.f112105y = besa;
        this.f112106z = beth;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final bfft mo60958a(Map map, int i, long j, bgmj bgmj, boolean z) {
        String str;
        long j2;
        long j3 = j;
        Locale locale = Locale.US;
        Object[] objArr = new Object[1];
        if (j3 != Long.MAX_VALUE) {
            StringBuilder sb = new StringBuilder(32);
            double d = (double) j3;
            Double.isNaN(d);
            sb.append(d * 1.0E-9d);
            sb.append(" seconds");
            str = sb.toString();
        } else {
            str = "all buffered";
        }
        objArr[0] = str;
        Set a = bfgt.m96707a(bfgt.f113814d);
        if (this.f112085i) {
            a.add(bfgt.f113819i);
        }
        if (z) {
            a.add(bfgt.f113821k);
        }
        bglx bglx = this.f112091o;
        if (j3 != Long.MAX_VALUE) {
            j2 = (-j3) / 1000000;
        } else {
            j2 = -9223372036854775807L;
        }
        return bglx.mo62765a(true, a, map, j2, null, new beqz(this), "BatchingSignalCollector", bgmj);
    }

    /* renamed from: a */
    public final void mo60960a(boolean z) {
        double d = this.f112102v;
        double d2 = this.f112097A;
        double d3 = d * d2;
        this.f112102v = d3;
        if (z) {
            this.f112102v = d3 + (1.0d - d2);
        }
    }
}
