package p000;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: bsdo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bsdo {

    /* renamed from: a */
    public static final double f144187a = Math.toRadians(50.0d);

    /* renamed from: b */
    public static final double f144188b = Math.toRadians(25.0d);

    /* renamed from: c */
    public static final double f144189c = Math.toRadians(1.0d);

    /* renamed from: d */
    boolean f144190d;

    /* renamed from: e */
    double f144191e;

    /* renamed from: f */
    double f144192f;

    /* renamed from: g */
    double f144193g;

    /* renamed from: h */
    double f144194h;

    /* renamed from: i */
    double[] f144195i;

    /* renamed from: j */
    int f144196j;

    /* renamed from: k */
    public final List f144197k = new ArrayList();

    /* renamed from: l */
    public final bsdu f144198l;

    /* renamed from: m */
    public double f144199m;

    /* renamed from: n */
    public double f144200n;

    /* renamed from: o */
    public double f144201o;

    public bsdo() {
        bxbm.m122545b(true, "Sample frequency must be greater than zero.");
        mo70274a();
        mo70275a(50.0d);
        this.f144198l = new bsdu();
    }

    /* renamed from: a */
    static int m115354a(double[] dArr, int i) {
        int length = dArr.length;
        int i2 = i + (length >> 1);
        return i2 >= length ? i2 - length : i2;
    }

    /* renamed from: b */
    public final void mo70277b() {
        bsdu bsdu = this.f144198l;
        if (bsdu != null) {
            bsdu.f144220a = 0.0d;
            bsdu.f144221b = 0;
        }
        this.f144190d = false;
    }

    /* renamed from: a */
    public final void mo70274a() {
        mo70277b();
        this.f144191e = 0.0d;
        this.f144192f = 0.0d;
        this.f144200n = 0.0d;
        this.f144196j = 0;
        double[] dArr = this.f144195i;
        if (dArr != null) {
            Arrays.fill(dArr, 0.0d);
        }
    }

    /* renamed from: a */
    public final void mo70275a(double d) {
        if (d > 0.0d) {
            this.f144194h = 1.0d / d;
            this.f144193g = d;
            this.f144195i = new double[Math.max(3, (int) (d * 0.15d))];
            mo70274a();
        }
    }

    /* renamed from: a */
    public final void mo70276a(bsdp bsdp) {
        this.f144197k.add(bsdp);
    }
}
