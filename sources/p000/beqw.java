package p000;

import android.content.Intent;
import com.google.android.gms.location.ActivityRecognitionResult;
import com.google.android.gms.location.DetectedActivity;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import java.util.Map;

/* renamed from: beqw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class beqw {

    /* renamed from: a */
    protected boolean f112077a = false;

    /* renamed from: b */
    public bfft f112078b;

    /* renamed from: c */
    protected long f112079c = 3200000000L;

    /* renamed from: d */
    protected beqp f112080d;

    /* renamed from: e */
    protected bequ f112081e;

    /* renamed from: f */
    protected boolean f112082f;

    /* renamed from: g */
    protected bevg f112083g;

    /* renamed from: h */
    protected bess f112084h;

    /* renamed from: i */
    protected boolean f112085i;

    /* renamed from: j */
    protected bewc f112086j;

    /* renamed from: k */
    protected boolean f112087k;

    /* renamed from: l */
    protected bexj f112088l;

    /* renamed from: m */
    public final betm f112089m;

    /* renamed from: n */
    public double f112090n;

    /* renamed from: o */
    protected final bglx f112091o;

    /* renamed from: p */
    protected final bhck f112092p;

    /* renamed from: q */
    protected final bfor f112093q;

    public beqw(bglx bglx, bhck bhck, bfor bfor, betm betm) {
        this.f112091o = bglx;
        this.f112092p = bhck;
        this.f112093q = bfor;
        this.f112089m = betm;
        this.f112080d = null;
        this.f112083g = null;
        this.f112084h = null;
        this.f112086j = null;
        this.f112088l = null;
    }

    /* renamed from: a */
    static double m95467a(bfku bfku) {
        int i = bfku.f114316b;
        if (i < 2) {
            return 0.0d;
        }
        double d = (double) (i - 2);
        Double.isNaN(d);
        double d2 = d / 14.0d;
        long[] jArr = new long[15];
        for (int i2 = 0; i2 < 15; i2++) {
            double d3 = (double) i2;
            Double.isNaN(d3);
            int round = (int) Math.round(d3 * d2);
            jArr[i2] = bfku.mo61857a(round + 1) - bfku.mo61857a(round);
        }
        Arrays.sort(jArr);
        double d4 = (double) jArr[7];
        Double.isNaN(d4);
        return 1.0E9d / d4;
    }

    /* renamed from: c */
    private static String m95472c(bfku bfku) {
        if (bfku.f114316b == 0) {
            return "0 0";
        }
        long a = bfku.mo61857a(bfku.f114316b - 1) - bfku.mo61857a(0);
        int i = bfku.f114316b;
        Locale locale = Locale.US;
        double d = (double) a;
        Double.isNaN(d);
        String format = String.format(locale, "%.2g", Double.valueOf(d / 1.0E9d));
        StringBuilder sb = new StringBuilder(String.valueOf(format).length() + 35);
        sb.append(i);
        sb.append(" ");
        sb.append(a);
        sb.append(" (");
        sb.append(format);
        sb.append(")");
        return sb.toString();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract bfft mo60958a(Map map, int i, long j, bgmj bgmj, boolean z);

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo60959b(bfku bfku) {
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(bfku);
        bhck bhck = this.f112092p;
        Intent intent = new Intent();
        intent.setAction("com.google.android.location.internal.SAMPLED_SENSOR");
        intent.putExtra("accelEvents", arrayList);
        aki.m919a(bhck.f118301a).mo874a(intent);
    }

    /* renamed from: a */
    protected static final beqt m95468a(beqt beqt, beqt beqt2) {
        int i = beqt.f112073a;
        if (i == 2) {
            return beqt;
        }
        int i2 = beqt2.f112073a;
        if (i2 != 2) {
            if (i == 1) {
                return beqt;
            }
            if (i2 != 1) {
                return beqt.m95449a(Math.min(beqt.mo60942a(), beqt2.mo60942a()));
            }
        }
        return beqt2;
    }

    /* renamed from: a */
    static final bfku m95469a(bfku bfku, long j) {
        int i = bfku.f114316b;
        if (i <= 1) {
            return bfku;
        }
        long a = bfku.mo61857a(i - 1);
        int i2 = bfku.f114316b - 1;
        while (i2 > 0 && a - bfku.mo61857a(i2) < j) {
            int i3 = i2 - 1;
            long a2 = bfku.mo61857a(i2) - bfku.mo61857a(i3);
            if (a2 <= 0 || a2 > 1000000000) {
                break;
            }
            i2 = i3;
        }
        return bfku.mo61860b(i2, bfku.f114316b - i2);
    }

    /* renamed from: a */
    protected static void m95470a(bfku bfku, bfku bfku2) {
        String c = m95472c(bfku);
        String c2 = m95472c(bfku2);
        StringBuilder sb = new StringBuilder(String.valueOf(c).length() + 30 + String.valueOf(c2).length());
        sb.append("originalAccel: ");
        sb.append(c);
        sb.append(" trimmedAccel: ");
        sb.append(c2);
        sb.toString();
    }

    /* renamed from: a */
    public static void m95471a(bfor bfor, ActivityRecognitionResult activityRecognitionResult, boolean z) {
        DetectedActivity b = activityRecognitionResult.mo43492b();
        bfor.mo62047a(new beqs(bfos.ACTIVITY_DETECTION_RESULT, bfor.mo62055b(), b.mo43513a(), b.f79320e, z ? 1 : 0, activityRecognitionResult, z));
    }
}
