package p000;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;

/* renamed from: bcm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bcm extends bcg {

    /* renamed from: g */
    private final RectF f2986g = new RectF();

    /* renamed from: h */
    private final Paint f2987h = new azc();

    /* renamed from: i */
    private final float[] f2988i = new float[8];

    /* renamed from: j */
    private final Path f2989j = new Path();

    /* renamed from: k */
    private final bcj f2990k;

    /* renamed from: l */
    private azy f2991l;

    public bcm(ayo ayo, bcj bcj) {
        super(ayo, bcj);
        this.f2990k = bcj;
        this.f2987h.setAlpha(0);
        this.f2987h.setStyle(Paint.Style.FILL);
        this.f2987h.setColor(bcj.f2973k);
    }

    /* renamed from: a */
    public final void mo2924a(RectF rectF, Matrix matrix, boolean z) {
        super.mo2924a(rectF, matrix, z);
        RectF rectF2 = this.f2986g;
        bcj bcj = this.f2990k;
        rectF2.set(0.0f, 0.0f, (float) bcj.f2971i, (float) bcj.f2972j);
        this.f2934a.mapRect(this.f2986g);
        rectF.set(this.f2986g);
    }

    /* renamed from: b */
    public final void mo2991b(Canvas canvas, Matrix matrix, int i) {
        int i2;
        int alpha = Color.alpha(this.f2990k.f2973k);
        if (alpha != 0) {
            azy azy = this.f2939f.f2773e;
            if (azy != null) {
                i2 = ((Integer) azy.mo2944f()).intValue();
            } else {
                i2 = 100;
            }
            int i3 = (int) ((((float) i) / 255.0f) * (((((float) alpha) / 255.0f) * ((float) i2)) / 100.0f) * 255.0f);
            this.f2987h.setAlpha(i3);
            azy azy2 = this.f2991l;
            if (azy2 != null) {
                this.f2987h.setColorFilter((ColorFilter) azy2.mo2944f());
            }
            if (i3 > 0) {
                float[] fArr = this.f2988i;
                fArr[0] = 0.0f;
                fArr[1] = 0.0f;
                bcj bcj = this.f2990k;
                float f = (float) bcj.f2971i;
                fArr[2] = f;
                fArr[3] = 0.0f;
                fArr[4] = f;
                float f2 = (float) bcj.f2972j;
                fArr[5] = f2;
                fArr[6] = 0.0f;
                fArr[7] = f2;
                matrix.mapPoints(fArr);
                this.f2989j.reset();
                Path path = this.f2989j;
                float[] fArr2 = this.f2988i;
                path.moveTo(fArr2[0], fArr2[1]);
                Path path2 = this.f2989j;
                float[] fArr3 = this.f2988i;
                path2.lineTo(fArr3[2], fArr3[3]);
                Path path3 = this.f2989j;
                float[] fArr4 = this.f2988i;
                path3.lineTo(fArr4[4], fArr4[5]);
                Path path4 = this.f2989j;
                float[] fArr5 = this.f2988i;
                path4.lineTo(fArr5[6], fArr5[7]);
                Path path5 = this.f2989j;
                float[] fArr6 = this.f2988i;
                path5.lineTo(fArr6[0], fArr6[1]);
                this.f2989j.close();
                canvas.drawPath(this.f2989j, this.f2987h);
            }
        }
    }

    /* renamed from: a */
    public final void mo2926a(Object obj, beq beq) {
        super.mo2926a(obj, beq);
        if (obj == ayt.f2572B) {
            this.f2991l = new ban(beq);
        }
    }
}
