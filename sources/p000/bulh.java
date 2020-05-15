package p000;

import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* renamed from: bulh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bulh implements bukm {

    /* renamed from: a */
    private long f154140a = 0;

    /* renamed from: b */
    private int f154141b = 0;

    /* renamed from: c */
    private long[] f154142c;

    /* renamed from: d */
    private long[] f154143d;

    /* renamed from: e */
    private float[] f154144e;

    /* renamed from: f */
    private List f154145f;

    /* renamed from: g */
    private short[] f154146g;

    /* renamed from: h */
    private short[] f154147h;

    /* renamed from: i */
    private float[] f154148i;

    /* renamed from: j */
    private float[] f154149j;

    /* renamed from: k */
    private int f154150k = 0;

    /* renamed from: l */
    private boolean f154151l = false;

    /* renamed from: m */
    private long f154152m = 0;

    /* renamed from: n */
    private bfni f154153n = null;

    /* renamed from: o */
    private bfni f154154o = null;

    /* renamed from: p */
    private long f154155p;

    /* renamed from: a */
    private static void m119852a(PrintWriter printWriter, bfni bfni) {
        if (bfni != null) {
            printWriter.print("[");
            printWriter.print(bfni.f114480b);
            printWriter.print(", ");
            printWriter.print(bfni.f114481c);
            printWriter.print(", ");
            printWriter.print(bfni.f114482d);
            printWriter.print(", ");
            if (bfni.mo61981b()) {
                printWriter.print(bfni.mo61986g());
            }
            printWriter.print(", ");
            if (bfni.mo61982c()) {
                printWriter.print(String.format(Locale.US, "%.1f", Float.valueOf(bfni.mo61987h())));
            }
            printWriter.print(", ");
            if (bfni.mo61985f()) {
                printWriter.print(bfni.mo61990k());
            }
            printWriter.print(", ");
            if (bfni.mo61983d()) {
                printWriter.print(bfni.mo61988i());
            }
            printWriter.print("]");
            return;
        }
        printWriter.print("null");
    }

    /* renamed from: a */
    public final long mo72779a() {
        return this.f154140a;
    }

    /* renamed from: a */
    public final void mo72781a(int i, long j) {
        if (this.f154141b == 0) {
            this.f154152m = j - this.f154140a;
            this.f154141b = i;
        }
    }

    /* renamed from: a */
    public final void mo72782a(long j) {
        this.f154140a = j;
    }

    /* renamed from: a */
    public final void mo72784a(bfni bfni) {
        this.f154153n = bfni;
    }

    /* renamed from: b */
    public final void mo72786b(long j) {
        this.f154155p = j;
    }

    /* renamed from: b */
    public final void mo72787b(bfni bfni) {
        this.f154154o = bfni;
    }

    /* renamed from: a */
    public final void mo72780a(int i) {
        this.f154142c = new long[i];
        this.f154143d = new long[i];
        this.f154144e = new float[i];
        this.f154147h = new short[i];
        this.f154148i = new float[i];
        this.f154149j = new float[i];
        this.f154145f = new ArrayList();
        this.f154146g = new short[i];
    }

    /* renamed from: a */
    public final void mo72783a(long j, int i, int i2, long j2, float f, int i3, float f2, buka buka) {
        int i4;
        long[] jArr;
        float[] fArr;
        int i5;
        buka buka2 = buka;
        long[] jArr2 = this.f154142c;
        if (jArr2 == null || (i4 = this.f154150k) >= jArr2.length || (jArr = this.f154143d) == null || i4 >= jArr.length || (fArr = this.f154144e) == null || i4 >= fArr.length) {
            this.f154151l = true;
            return;
        }
        long j3 = (long) (-i);
        long j4 = j & 281474976710655L;
        long j5 = 255 & j3;
        long j6 = (long) i2;
        long j7 = 15 & j6;
        long j8 = 1;
        if (j5 == j3 && j4 == j && j7 == j6) {
            j8 = 0;
        }
        jArr2[i4] = (j5 << 48) | j4 | (j7 << 56) | (j8 << 63);
        jArr[i4] = j2;
        fArr[i4] = f;
        if (buka2 != null) {
            if (!this.f154145f.contains(buka2)) {
                this.f154145f.add(buka2);
            }
            i5 = this.f154145f.indexOf(buka2);
        } else {
            i5 = -1;
        }
        short[] sArr = this.f154147h;
        int i6 = this.f154150k;
        sArr[i6] = (short) i3;
        this.f154148i[i6] = f2;
        this.f154149j[i6] = f2;
        this.f154146g[i6] = (short) i5;
        this.f154150k = i6 + 1;
    }

    /* renamed from: a */
    public final void mo72785a(PrintWriter printWriter) {
        int i;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        PrintWriter printWriter2 = printWriter;
        printWriter2.print("{outcome=");
        switch (this.f154141b) {
            case 0:
                printWriter2.print("not_finished");
                break;
            case 1:
                printWriter2.print("success");
                break;
            case 2:
                printWriter2.print("too_few_aps");
                break;
            case 3:
                printWriter2.print("null_scan");
                break;
            case 4:
                printWriter2.print("bad_best_cell");
                break;
            case 5:
                printWriter2.print("null_position");
                break;
            case 6:
                printWriter2.print("weak_wifi");
                break;
            case 7:
                printWriter2.print("cache_miss");
                break;
            default:
                printWriter2.print("unknown");
                break;
        }
        printWriter2.print("; position=");
        m119852a(printWriter2, this.f154153n);
        printWriter2.print("; lastPosition=");
        m119852a(printWriter2, this.f154154o);
        printWriter2.print("; runMillis=");
        printWriter2.print(this.f154152m);
        printWriter2.print("; scanTsMsSinceBoot=");
        printWriter2.print(this.f154155p);
        printWriter2.print("; macData=[");
        int i2 = 0;
        while (i2 < this.f154150k) {
            long j = this.f154142c[i2];
            long j2 = this.f154143d[i2];
            float f = this.f154144e[i2];
            short s = this.f154147h[i2];
            float f2 = this.f154148i[i2];
            float f3 = this.f154149j[i2];
            short s2 = this.f154146g[i2];
            Locale locale = Locale.US;
            Object[] objArr = new Object[10];
            int i3 = i2;
            objArr[0] = Integer.valueOf((int) ((j >> 56) & 15));
            objArr[1] = Integer.valueOf(-((int) ((j >> 48) & 255)));
            objArr[2] = Long.valueOf(j & 281474976710655L);
            String str7 = "";
            if (((j >> 63) & 1) != 0) {
                str = "-sufferedDataLoss";
            } else {
                str = str7;
            }
            objArr[3] = str;
            if (j2 != 0) {
                str2 = String.format("0x%016x", Long.valueOf(j2));
            } else {
                str2 = str7;
            }
            objArr[4] = str2;
            if (f != Float.NEGATIVE_INFINITY) {
                str3 = String.format(Locale.US, "%.1f", Float.valueOf(f));
            } else {
                str3 = str7;
            }
            objArr[5] = str3;
            if (s != 0) {
                str4 = Integer.toString(s);
            } else {
                str4 = str7;
            }
            objArr[6] = str4;
            if (s != 0) {
                str5 = String.format(Locale.US, "%.2f", Float.valueOf(f2));
            } else {
                str5 = str7;
            }
            objArr[7] = str5;
            if (s != 0) {
                str6 = String.format(Locale.US, "%.2f", Float.valueOf(f3));
            } else {
                str6 = str7;
            }
            objArr[8] = str6;
            if (s2 != -1) {
                str7 = Integer.toString(s2);
            }
            objArr[9] = str7;
            printWriter2.print(String.format(locale, "%d:%d:%012X%s:%s:%s:%s:%s:%s:%s", objArr));
            printWriter2.print(", ");
            i2 = i3 + 1;
        }
        int i4 = 0;
        printWriter2.print("]; droppedMacsCount=");
        long[] jArr = this.f154142c;
        if (jArr != null) {
            i = jArr.length;
        } else {
            i = 0;
        }
        printWriter2.print(i - this.f154150k);
        if (this.f154151l) {
            printWriter2.print("; ERROR: Some macs might be missing");
        }
        printWriter2.print("; floors=[");
        List list = this.f154145f;
        for (int size = list.size(); i4 < size; size = size) {
            buka buka = (buka) list.get(i4);
            String str8 = buka.f154061a;
            long j3 = buka.f154062b;
            long j4 = buka.f154063c;
            long j5 = buka.f154064d;
            long j6 = buka.f154065e;
            StringBuilder sb = new StringBuilder(String.valueOf(str8).length() + 84);
            sb.append(str8);
            sb.append(":");
            sb.append(j3);
            sb.append(":");
            sb.append(j4);
            sb.append(":");
            sb.append(j5);
            sb.append(":");
            sb.append(j6);
            printWriter2.print(sb.toString());
            printWriter2.print(", ");
            i4++;
            list = list;
        }
        printWriter2.print("]");
        printWriter2.println("}");
    }
}
