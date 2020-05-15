package p000;

import com.felicanetworks.mfc.mfi.BaseMfiEventCallback;

/* renamed from: bewm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bewm {

    /* renamed from: a */
    public final double[] f112823a = {1.0d, 0.0d};

    /* renamed from: b */
    public final double[][] f112824b = {new double[]{0.0d, 1.0d}, new double[]{1.0d, 0.0d}};

    /* renamed from: c */
    public final double[][] f112825c;

    /* renamed from: d */
    public final double[][][] f112826d;

    /* renamed from: e */
    public final int[] f112827e = {70, 67};

    /* renamed from: f */
    public final double[] f112828f = {0.6d, 0.52d};

    /* renamed from: g */
    public final int[] f112829g = {30, 40};

    /* renamed from: h */
    public final int[] f112830h = {BaseMfiEventCallback.TYPE_UNKNOWN_ERROR, 90};

    public bewm(boolean z) {
        double[][] dArr;
        double[][][] dArr2;
        if (!z) {
            dArr = new double[][]{new double[]{0.55d}, new double[]{0.92d}};
        } else {
            dArr = new double[][]{new double[]{0.35d}, new double[]{0.8d}};
        }
        this.f112825c = dArr;
        if (z) {
            dArr2 = new double[][][]{new double[][]{new double[]{10.0d}}, new double[][]{new double[]{40.0d}}};
        } else {
            dArr2 = new double[][][]{new double[][]{new double[]{10.0d}}, new double[][]{new double[]{100.0d}}};
        }
        this.f112826d = dArr2;
    }
}
