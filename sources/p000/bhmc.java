package p000;

import android.graphics.Matrix;
import android.graphics.Path;

/* renamed from: bhmc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bhmc extends bhmd {

    /* renamed from: a */
    public float f119067a;

    /* renamed from: b */
    public float f119068b;

    /* renamed from: a */
    public final void mo63984a(Matrix matrix, Path path) {
        Matrix matrix2 = this.f119069g;
        matrix.invert(matrix2);
        path.transform(matrix2);
        path.lineTo(this.f119067a, this.f119068b);
        path.transform(matrix);
    }
}
