package p000;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;

/* renamed from: bhmb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bhmb extends bhmd {

    /* renamed from: h */
    private static final RectF f119060h = new RectF();
    @Deprecated

    /* renamed from: a */
    public final float f119061a;
    @Deprecated

    /* renamed from: b */
    public final float f119062b;
    @Deprecated

    /* renamed from: c */
    public final float f119063c;
    @Deprecated

    /* renamed from: d */
    public final float f119064d;
    @Deprecated

    /* renamed from: e */
    public float f119065e;
    @Deprecated

    /* renamed from: f */
    public float f119066f;

    public bhmb(float f, float f2, float f3, float f4) {
        this.f119061a = f;
        this.f119062b = f2;
        this.f119063c = f3;
        this.f119064d = f4;
    }

    /* renamed from: a */
    public final void mo63984a(Matrix matrix, Path path) {
        Matrix matrix2 = this.f119069g;
        matrix.invert(matrix2);
        path.transform(matrix2);
        f119060h.set(this.f119061a, this.f119062b, this.f119063c, this.f119064d);
        path.arcTo(f119060h, this.f119065e, this.f119066f, false);
        path.transform(matrix);
    }
}
