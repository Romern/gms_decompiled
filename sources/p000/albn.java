package p000;

import android.graphics.Bitmap;
import android.opengl.GLES20;

/* renamed from: albn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class albn extends albf {

    /* renamed from: l */
    private albg f73298l;

    /* renamed from: m */
    private int f73299m = 0;

    /* renamed from: n */
    private albj f73300n;

    public albn(Bitmap bitmap) {
        try {
            this.f73300n = new albj(null);
        } catch (albh e) {
            bqye.m113758a(e);
        }
        this.f73298l = new albg();
        this.f73299m = 36;
        mo40083a(36, 36);
        float[] fArr = {-1.0f, -1.0f, 1.0f, 1.0f, -1.0f, 1.0f, 1.0f, 1.0f, 1.0f, -1.0f, 1.0f, 1.0f, -1.0f, -1.0f, -1.0f, 1.0f, -1.0f, -1.0f, 1.0f, 1.0f, -1.0f, -1.0f, 1.0f, -1.0f};
        short[] sArr = {0, 7, 3, 0, 4, 7, 4, 6, 7, 4, 5, 6, 5, 2, 6, 5, 1, 2, 1, 3, 2, 1, 0, 3, 3, 6, 7, 3, 2, 6, 4, 1, 0, 4, 5, 1};
        for (int i = 0; i < 36; i++) {
            int i2 = sArr[i] * 3;
            float f = fArr[i2];
            float f2 = fArr[i2 + 1];
            float f3 = fArr[i2 + 2];
            int i3 = i * 3;
            int i4 = i3 + 1;
            this.f73268a.put(i3, f * 32.0f);
            this.f73268a.put(i4, f2 * 32.0f);
            this.f73268a.put(i4 + 1, f3 * 32.0f);
            this.f73270c.put(i, (short) i);
        }
        int i5 = 0;
        for (int i6 = 0; i6 < 4; i6++) {
            float f4 = ((float) i6) * 0.25f;
            i5 = m60812a(i5, f4, 0.33333334f, f4 + 0.25f, 0.6666667f);
        }
        m60812a(m60812a(i5, 0.25f, 0.33333334f, 0.5f, 0.0f), 0.25f, 1.0f, 0.5f, 0.6666667f);
        try {
            this.f73298l.mo40087a(bitmap);
            bitmap.recycle();
        } catch (albh e2) {
            bqye.m113758a(e2);
        }
    }

    /* renamed from: a */
    private final int m60812a(int i, float f, float f2, float f3, float f4) {
        m60813a(i, f, f4);
        int i2 = i + 2;
        m60813a(i2, f3, f2);
        int i3 = i2 + 2;
        m60813a(i3, f, f2);
        int i4 = i3 + 2;
        m60813a(i4, f, f4);
        int i5 = i4 + 2;
        m60813a(i5, f3, f4);
        int i6 = i5 + 2;
        m60813a(i6, f3, f2);
        return i6 + 2;
    }

    /* renamed from: a */
    private final void m60813a(int i, float f, float f2) {
        this.f73269b.put(i, f);
        this.f73269b.put(i + 1, f2);
    }

    /* renamed from: a */
    public final void mo40084a(float[] fArr) {
        this.f73300n.mo40089a();
        this.f73300n.mo40090a(0.8f);
        this.f73268a.position(0);
        this.f73300n.mo40091a(this.f73268a);
        this.f73269b.position(0);
        this.f73300n.mo40093b(this.f73269b);
        this.f73298l.mo40086a();
        this.f73300n.mo40092a(fArr);
        GLES20.glDrawElements(4, this.f73299m, 5123, this.f73270c);
    }
}
