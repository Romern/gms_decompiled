package p000;

/* renamed from: bjca */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bjca {

    /* renamed from: a */
    public final int f122497a;

    /* renamed from: b */
    public final float[] f122498b;

    /* renamed from: c */
    public final int[] f122499c;

    public bjca(int i) {
        this.f122497a = i;
        this.f122498b = m103179a(i);
        this.f122499c = m103180b(i);
    }

    /* renamed from: a */
    private static float[] m103179a(int i) {
        float[] fArr = new float[i];
        for (int i2 = 0; i2 < i; i2++) {
            fArr[i2] = 1.0f;
        }
        return fArr;
    }

    /* renamed from: b */
    private static int[] m103180b(int i) {
        int[] iArr = new int[i];
        for (int i2 = 0; i2 < i; i2++) {
            iArr[i2] = 0;
        }
        return iArr;
    }

    public bjca(int i, float[] fArr, int[] iArr) {
        this.f122497a = i;
        this.f122498b = fArr == null ? m103179a(i) : fArr;
        this.f122499c = iArr == null ? m103180b(i) : iArr;
    }
}
