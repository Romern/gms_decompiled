package p000;

/* renamed from: adwf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class adwf {
    /* renamed from: a */
    public static int[] m51267a(int i) {
        float f = (float) ceqz.f183340a.mo6606a().mo79666f();
        float h = (float) ((int) ceqz.f183340a.mo6606a().mo79668h());
        int[] iArr = new int[i];
        for (int i2 = 0; i2 < i; i2++) {
            double d = (double) f;
            double d2 = (double) h;
            double pow = Math.pow(d, (double) i2);
            double d3 = (double) (1.0f - f);
            Double.isNaN(d3);
            Double.isNaN(d2);
            iArr[i2] = Math.round((float) (d2 * ((pow * d3) / (1.0d - Math.pow(d, (double) i)))));
        }
        return iArr;
    }
}
