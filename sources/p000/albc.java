package p000;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.nio.ShortBuffer;

/* renamed from: albc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class albc {

    /* renamed from: a */
    public final int f73246a;

    /* renamed from: b */
    public final int f73247b;

    /* renamed from: c */
    public final int f73248c;

    /* renamed from: d */
    public int f73249d = 0;

    /* renamed from: e */
    public FloatBuffer f73250e;

    /* renamed from: f */
    public FloatBuffer f73251f;

    /* renamed from: g */
    public ShortBuffer f73252g;

    /* renamed from: h */
    public alaz[] f73253h;

    /* renamed from: i */
    public boolean f73254i = false;

    public albc(int i, int i2) {
        this.f73246a = i;
        int i3 = i2 + 1;
        int i4 = i3 * i3;
        this.f73247b = i4;
        int i5 = i3 - 1;
        this.f73248c = i5 * i5 * 6;
        this.f73251f = ByteBuffer.allocateDirect((i4 + i4) * 4).order(ByteOrder.nativeOrder()).asFloatBuffer();
        int i6 = this.f73248c;
        this.f73252g = ByteBuffer.allocateDirect(i6 + i6).order(ByteOrder.nativeOrder()).asShortBuffer();
        this.f73253h = new alaz[0];
        int i7 = 0;
        for (int i8 = 0; i8 < i5; i8++) {
            int i9 = i8 * i3;
            for (int i10 = 0; i10 < i5; i10++) {
                int i11 = i9 + i10;
                int i12 = i7 + 1;
                this.f73252g.put(i7, (short) i11);
                int i13 = i12 + 1;
                short s = (short) (i11 + 1);
                this.f73252g.put(i12, s);
                int i14 = i13 + 1;
                int i15 = i11 + i3;
                short s2 = (short) i15;
                this.f73252g.put(i13, s2);
                int i16 = i14 + 1;
                this.f73252g.put(i14, s2);
                int i17 = i16 + 1;
                this.f73252g.put(i16, s);
                i7 = i17 + 1;
                this.f73252g.put(i17, (short) (i15 + 1));
            }
        }
        int i18 = 0;
        for (int i19 = 0; i19 < i3; i19++) {
            for (int i20 = 0; i20 < i3; i20++) {
                int i21 = i18 + 1;
                float f = (float) i5;
                this.f73251f.put(i18, ((float) i20) / f);
                i18 = i21 + 1;
                this.f73251f.put(i21, 1.0f - (((float) i19) / f));
            }
        }
    }
}
