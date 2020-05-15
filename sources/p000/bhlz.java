package p000;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import android.os.Build;

/* renamed from: bhlz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bhlz {

    /* renamed from: a */
    private final bhmf[] f119047a = new bhmf[4];

    /* renamed from: b */
    private final Matrix[] f119048b = new Matrix[4];

    /* renamed from: c */
    private final Matrix[] f119049c = new Matrix[4];

    /* renamed from: d */
    private final PointF f119050d = new PointF();

    /* renamed from: e */
    private final Path f119051e = new Path();

    /* renamed from: f */
    private final Path f119052f = new Path();

    /* renamed from: g */
    private final bhmf f119053g = new bhmf();

    /* renamed from: h */
    private final float[] f119054h = new float[2];

    /* renamed from: i */
    private final float[] f119055i = new float[2];

    /* renamed from: j */
    private boolean f119056j = true;

    public bhlz() {
        for (int i = 0; i < 4; i++) {
            this.f119047a[i] = new bhmf();
            this.f119048b[i] = new Matrix();
            this.f119049c[i] = new Matrix();
        }
    }

    /* renamed from: a */
    private static final float m101163a(int i) {
        return (float) ((i + 1) * 90);
    }

    /* renamed from: a */
    private final boolean m101164a(Path path, int i) {
        Path path2 = new Path();
        this.f119047a[i].mo63988a(this.f119048b[i], path2);
        RectF rectF = new RectF();
        path.computeBounds(rectF, true);
        path2.computeBounds(rectF, true);
        path.op(path2, Path.Op.INTERSECT);
        path.computeBounds(rectF, true);
        if (!rectF.isEmpty()) {
            return true;
        }
        if (rectF.width() <= 1.0f || rectF.height() <= 1.0f) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public final void mo63981a(bhlx bhlx, float f, RectF rectF, Path path) {
        mo63982a(bhlx, f, rectF, null, path);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{java.util.BitSet.set(int, boolean):void}
     arg types: [int, int]
     candidates:
      ClspMth{java.util.BitSet.set(int, int):void}
      ClspMth{java.util.BitSet.set(int, boolean):void} */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{java.lang.Math.max(float, float):float}
     arg types: [float, int]
     candidates:
      ClspMth{java.lang.Math.max(double, double):double}
      ClspMth{java.lang.Math.max(int, int):int}
      ClspMth{java.lang.Math.max(long, long):long}
      ClspMth{java.lang.Math.max(float, float):float} */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x021c  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x0237 A[SYNTHETIC] */
    /* renamed from: a */
    public final void mo63982a(bhlx bhlx, float f, RectF rectF, bhlo bhlo, Path path) {
        bhlo bhlo2;
        bhlk bhlk;
        bhll bhll;
        path.rewind();
        this.f119051e.rewind();
        this.f119052f.rewind();
        this.f119052f.addRect(rectF, Path.Direction.CW);
        bhly bhly = new bhly(bhlx, f, rectF, bhlo, path);
        int i = 0;
        while (i < 4) {
            bhlx bhlx2 = bhly.f119042a;
            if (i != 1) {
                bhlk = i != 2 ? i != 3 ? bhlx2.f119035g : bhlx2.f119034f : bhlx2.f119037i;
            } else {
                bhlk = bhlx2.f119036h;
            }
            if (i != 1) {
                bhll = i != 2 ? i != 3 ? bhlx2.f119031c : bhlx2.f119030b : bhlx2.f119033e;
            } else {
                bhll = bhlx2.f119032d;
            }
            bhll.mo63935a(this.f119047a[i], bhly.f119045d, bhlk.mo63930a(bhly.f119044c));
            float a = m101163a(i);
            this.f119048b[i].reset();
            RectF rectF2 = bhly.f119044c;
            PointF pointF = this.f119050d;
            if (i == 1) {
                pointF.set(rectF2.right, rectF2.bottom);
            } else if (i == 2) {
                pointF.set(rectF2.left, rectF2.bottom);
            } else if (i != 3) {
                pointF.set(rectF2.right, rectF2.top);
            } else {
                pointF.set(rectF2.left, rectF2.top);
            }
            this.f119048b[i].setTranslate(this.f119050d.x, this.f119050d.y);
            this.f119048b[i].preRotate(a);
            float[] fArr = this.f119054h;
            bhmf bhmf = this.f119047a[i];
            fArr[0] = bhmf.f119071b;
            fArr[1] = bhmf.f119072c;
            this.f119048b[i].mapPoints(fArr);
            this.f119049c[i].reset();
            Matrix matrix = this.f119049c[i];
            float[] fArr2 = this.f119054h;
            matrix.setTranslate(fArr2[0], fArr2[1]);
            this.f119049c[i].preRotate(m101163a(i));
            i++;
        }
        int i2 = 0;
        while (i2 < 4) {
            float[] fArr3 = this.f119054h;
            bhmf bhmf2 = this.f119047a[i2];
            fArr3[0] = 0.0f;
            fArr3[1] = bhmf2.f119070a;
            this.f119048b[i2].mapPoints(fArr3);
            if (i2 == 0) {
                Path path2 = bhly.f119043b;
                float[] fArr4 = this.f119054h;
                path2.moveTo(fArr4[0], fArr4[1]);
            } else {
                Path path3 = bhly.f119043b;
                float[] fArr5 = this.f119054h;
                path3.lineTo(fArr5[0], fArr5[1]);
            }
            this.f119047a[i2].mo63988a(this.f119048b[i2], bhly.f119043b);
            bhlo bhlo3 = bhly.f119046e;
            if (bhlo3 != null) {
                bhmf bhmf3 = this.f119047a[i2];
                Matrix matrix2 = this.f119048b[i2];
                bhlo3.f118966a.f119010v.set(i2, false);
                bhlo3.f118966a.f119008t[i2] = bhmf3.mo63990b();
            }
            int i3 = i2 + 1;
            int i4 = i3 & 3;
            float[] fArr6 = this.f119054h;
            bhmf bhmf4 = this.f119047a[i2];
            fArr6[0] = bhmf4.f119071b;
            fArr6[1] = bhmf4.f119072c;
            this.f119048b[i2].mapPoints(fArr6);
            float[] fArr7 = this.f119055i;
            bhmf bhmf5 = this.f119047a[i4];
            fArr7[0] = 0.0f;
            fArr7[1] = bhmf5.f119070a;
            this.f119048b[i4].mapPoints(fArr7);
            float[] fArr8 = this.f119054h;
            float f2 = fArr8[0];
            float[] fArr9 = this.f119055i;
            float max = Math.max(((float) Math.hypot((double) (f2 - fArr9[0]), (double) (fArr8[1] - fArr9[1]))) - 4046.848f, 0.0f);
            RectF rectF3 = bhly.f119044c;
            float[] fArr10 = this.f119054h;
            bhmf bhmf6 = this.f119047a[i2];
            fArr10[0] = bhmf6.f119071b;
            fArr10[1] = bhmf6.f119072c;
            this.f119048b[i2].mapPoints(fArr10);
            if (i2 == 1 || i2 == 3) {
                Math.abs(rectF3.centerX() - this.f119054h[0]);
            } else {
                Math.abs(rectF3.centerY() - this.f119054h[1]);
            }
            this.f119053g.mo63985a();
            this.f119053g.mo63986a(max, 0.0f);
            Path path4 = new Path();
            this.f119053g.mo63988a(this.f119049c[i2], path4);
            if (this.f119056j) {
                int i5 = Build.VERSION.SDK_INT;
                if (m101164a(path4, i2) || m101164a(path4, i4)) {
                    path4.op(path4, this.f119052f, Path.Op.DIFFERENCE);
                    float[] fArr11 = this.f119054h;
                    fArr11[0] = 0.0f;
                    fArr11[1] = this.f119053g.f119070a;
                    this.f119049c[i2].mapPoints(fArr11);
                    Path path5 = this.f119051e;
                    float[] fArr12 = this.f119054h;
                    path5.moveTo(fArr12[0], fArr12[1]);
                    this.f119053g.mo63988a(this.f119049c[i2], this.f119051e);
                    bhlo2 = bhly.f119046e;
                    if (bhlo2 == null) {
                        bhmf bhmf7 = this.f119053g;
                        Matrix matrix3 = this.f119049c[i2];
                        bhlo2.f118966a.f119010v.set(i2 + 4, false);
                        bhlo2.f118966a.f119009u[i2] = bhmf7.mo63990b();
                    }
                    i2 = i3;
                }
            }
            this.f119053g.mo63988a(this.f119049c[i2], bhly.f119043b);
            bhlo2 = bhly.f119046e;
            if (bhlo2 == null) {
            }
            i2 = i3;
        }
        path.close();
        this.f119051e.close();
        int i6 = Build.VERSION.SDK_INT;
        if (!this.f119051e.isEmpty()) {
            path.op(this.f119051e, Path.Op.UNION);
        }
    }
}
