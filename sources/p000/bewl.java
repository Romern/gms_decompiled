package p000;

/* renamed from: bewl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bewl {

    /* renamed from: a */
    private final int[] f112821a = new int[1];

    /* renamed from: b */
    private int f112822b = 0;

    /* renamed from: a */
    public final void mo61198a() {
        this.f112821a[0] = 0;
        this.f112822b = 0;
    }

    /* renamed from: b */
    public final float[] mo61200b() {
        float[] fArr = new float[1];
        int i = this.f112822b;
        if (i != 0) {
            fArr[0] = (((float) this.f112821a[0]) / ((float) i)) / 100.0f;
        } else {
            fArr[0] = 0.5f;
        }
        return fArr;
    }

    /* renamed from: a */
    public final void mo61199a(bewn bewn) {
        int i = bewn.f112831a[0];
        int[] iArr = this.f112821a;
        iArr[0] = iArr[0] + i;
        this.f112822b++;
    }
}
